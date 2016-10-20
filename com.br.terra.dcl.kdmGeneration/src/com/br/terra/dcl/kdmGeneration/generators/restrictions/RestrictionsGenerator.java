/**
 * @author Landi
 * 
 */
package com.br.terra.dcl.kdmGeneration.generators.restrictions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeFactory;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeModel;
import org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship;
import org.eclipse.gmt.modisco.omg.kdm.core.CoreFactory;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMRelationship;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Segment;
import org.eclipse.gmt.modisco.omg.kdm.structure.AbstractStructureElement;
import org.eclipse.gmt.modisco.omg.kdm.structure.Layer;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel;

import com.br.terra.dcl.dCL.BasicType;
import com.br.terra.dcl.dCL.Cannot;
import com.br.terra.dcl.dCL.DCDecl;
import com.br.terra.dcl.dCL.DCLLayer;
import com.br.terra.dcl.dCL.DCLStructureElement;
import com.br.terra.dcl.dCL.EntityType;
import com.br.terra.dcl.kdmGeneration.generators.architecture.ArchitecturalGenerator;

import br.ufscar.kdm_manager.core.filters.validateFilter.factory.ValidateFilterJavaFactory;
import br.ufscar.kdm_manager.core.filters.validateFilter.interfaces.ValidateFilter;
import br.ufscar.kdm_manager.core.readers.modelReader.factory.KDMModelReaderJavaFactory;

/**
 * @author Landi
 *
 */
public class RestrictionsGenerator {

	public static final String CODE_NAME = "InstancesReferenced";

	private Segment kdmSegment = null;

	private EList<DCLStructureElement> allStructureElementsFromDCL = null;

	private EList<DCDecl> allRestrictionsFromDCL = null;


	public RestrictionsGenerator(Segment kdmSegment, EList<DCLStructureElement> allStructureElementsFromDCL, EList<DCDecl> allRestrictionsFromDCL) {
		this.kdmSegment = kdmSegment;
		this.allStructureElementsFromDCL = allStructureElementsFromDCL;
		this.allRestrictionsFromDCL = allRestrictionsFromDCL;
	}

	/**
	 * @author Landi
	 * @return
	 */
	public Segment generateRestrictions() {

		this.createCodeToSegment();

		this.generateHierarquicalRestrictions();

		this.generateLayerRestrictions();

		this.generateDefinedRestrictions();

		return this.kdmSegment;
	}

	private void createCodeToSegment() {
		CodeModel codeModel = CodeFactory.eINSTANCE.createCodeModel();
		codeModel.setName(CODE_NAME);

		this.kdmSegment.getModel().add(codeModel);	
	}

	private void generateHierarquicalRestrictions() {
		StructureModel structureModel = ArchitecturalGenerator.getStructureModelFromKDM(this.kdmSegment, ArchitecturalGenerator.STRUCTURAL_NAME);

		for (AbstractStructureElement abstractStructureElement : structureModel.getStructureElement()) {
			this.createHierarquicalRelationshipWithChild(abstractStructureElement);
		}
	}

	/**
	 * @author Landi
	 * @param abstractStructureElement
	 */
	private void createHierarquicalRelationshipWithChild(AbstractStructureElement parent) {
		for (AbstractStructureElement child : parent.getStructureElement()) {

			String moduleName = "HierarquicalDependBetween " + parent.getName() + " to " + child.getName();

			List<KDMRelationship> relations = RelationshipsGenerator.createDependRelations(this.kdmSegment, moduleName); 

			AggregatedRelationship aggregatedRelationship = CoreFactory.eINSTANCE.createAggregatedRelationship();
			aggregatedRelationship.setDensity(relations.size());
			aggregatedRelationship.setFrom(parent);
			aggregatedRelationship.setTo(child);
			aggregatedRelationship.getRelation().addAll(relations);

			parent.getAggregated().add(aggregatedRelationship);

			if(child.getStructureElement().size() >= 1){
				this.createHierarquicalRelationshipWithChild(child);
			}
		}
	}

	private void generateLayerRestrictions() {
		StructureModel structureModel = ArchitecturalGenerator.getStructureModelFromKDM(this.kdmSegment, ArchitecturalGenerator.STRUCTURAL_NAME);

		for (AbstractStructureElement abstractStructureElement : structureModel.getStructureElement()) {
			this.createLayerLevelRelationshipWithSameLevel(abstractStructureElement);
		}
	}

	/**
	 * @author Landi
	 * @param abstractStructureElement
	 */
	private void createLayerLevelRelationshipWithSameLevel(AbstractStructureElement parent) {
		List<Layer> allLayerschild = new ArrayList<Layer>();
		for (AbstractStructureElement child : parent.getStructureElement()) {
			if(child instanceof Layer){
				allLayerschild.add((Layer)child);
			}
			if(child.getStructureElement().size() >= 1){
				this.createLayerLevelRelationshipWithSameLevel(child);
			}
		}

		Map<Integer, List<Layer>> allLayersLevel = this.findLevelsLayers(allLayerschild);
		for (int level : allLayersLevel.keySet()) {
			for (Layer layer : allLayersLevel.get(level)) {
				if(level == 1){
					break;
				}

				for (Layer layerBelow : allLayersLevel.get(level-1)) {
					String moduleName = "LayerDependLevelBetween " + layer.getName() + " to " + layerBelow.getName();

					List<KDMRelationship> relations = RelationshipsGenerator.createDependRelations(this.kdmSegment, moduleName); 

					AggregatedRelationship aggregatedRelationship = CoreFactory.eINSTANCE.createAggregatedRelationship();
					aggregatedRelationship.setDensity(relations.size());
					aggregatedRelationship.setFrom(layer);
					aggregatedRelationship.setTo(layerBelow);
					aggregatedRelationship.getRelation().addAll(relations);

					layer.getAggregated().add(aggregatedRelationship);
				}
			}
		}
	}

	/**
	 * @author Landi
	 * @param allLayerschild
	 * @return
	 */
	private Map<Integer, List<Layer>> findLevelsLayers(List<Layer> allLayerschild) {
		Map<Integer, List<Layer>> allLayersLevel = new TreeMap<Integer, List<Layer>>(
				new Comparator<Integer>() {

					@Override
					public int compare(Integer o1, Integer o2) {
						return o2.compareTo(o1);
					}

				});

		for (Layer layer : allLayerschild) {
			int level = this.findLevelsLayers(layer);

			if(allLayersLevel.get(level) == null){
				List<Layer> layersLevel = new ArrayList<Layer>();
				layersLevel.add(layer);
				allLayersLevel.put(level, layersLevel );
			}else{
				allLayersLevel.get(level).add(layer);
			}
		}
		return allLayersLevel;
	}

	/**
	 * @author Landi
	 * @param layer
	 * @return
	 */
	private int findLevelsLayers(Layer layer) {
		int level = -1;

		for (DCLStructureElement dclStructureElement : allStructureElementsFromDCL) {
			if(dclStructureElement instanceof DCLLayer){
				if(layer.getName().equalsIgnoreCase(dclStructureElement.getName())){
					level = ((DCLLayer) dclStructureElement).getLevel();
					allStructureElementsFromDCL.remove(dclStructureElement);
					return level;
				}
			}
		}
		return level;
	}

	private void generateDefinedRestrictions() {
		for (DCDecl dcDecl : allRestrictionsFromDCL) {
			System.out.println("-------------------------------------------------------");
			System.out.println("T(to) name: " + dcDecl.getT().getName());
			System.out.println("Type(from) name: " + dcDecl.getType().getName());

			if(dcDecl.getElementType() != null){
				if (dcDecl.getElementType() instanceof BasicType) {
					System.out.println("BasicType name: " + ((BasicType)dcDecl.getElementType()).getTypeName());
				} 
				if (dcDecl.getElementType() instanceof EntityType) {
					System.out.println("EntityType name: " + ((EntityType)dcDecl.getElementType()).getEntity());
				}
			}else{
				System.out.println("ElementType name: null");
			}

			if(dcDecl.getCan() != null){
				System.out.println("Can name: " + dcDecl.getCan().getCan());
			}
			if(dcDecl.getCannot() != null){
				System.out.println("Cannot name: " + dcDecl.getCannot().getCannot());
			}
			if(dcDecl.getOnly() != null){
				System.out.println("Only name: " + dcDecl.getOnly().getOnly());
			}
			if(dcDecl.getOnly2() != null){
				System.out.println("Only2 name: " + dcDecl.getOnly2().getOnly2());
			}
			if(dcDecl.getMust() != null){
				System.out.println("Must name: " + dcDecl.getMust().getMust());
			}

		}
	}

	public static CodeModel getCodeModelFromKDM(Segment segment, String nameToSearch) {
		CodeModel codeModel = null;
		ValidateFilter<?, ?> filter = ValidateFilterJavaFactory.eINSTANCE.createValidateFilterNameOfKDMFramework(nameToSearch);
		Map<String, List<CodeModel>> allFromSegment = KDMModelReaderJavaFactory.eINSTANCE.createKDMCodeModelReaderWithFilter(filter).getAllFromSegment(segment);
		for (String key : allFromSegment.keySet()) {
			if(allFromSegment.get(key).size() == 1){
				codeModel = allFromSegment.get(key).get(0);
				break;
			}
		}
		return codeModel;
	}
}
