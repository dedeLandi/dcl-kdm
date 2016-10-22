package com.br.terra.dcl.kdmGeneration.generators.impl.restrictions;

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
import org.eclipse.gmt.modisco.omg.kdm.structure.AbstractStructureElement;
import org.eclipse.gmt.modisco.omg.kdm.structure.Layer;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel;

import com.br.terra.dcl.dCL.DCDecl;
import com.br.terra.dcl.dCL.DCLLayer;
import com.br.terra.dcl.dCL.DCLStructureElement;
import com.br.terra.dcl.kdmGeneration.actions.DCL2KDM;
import com.br.terra.dcl.kdmGeneration.generators.enums.RelationshipGeneratorTypes;
import com.br.terra.dcl.kdmGeneration.generators.impl.architecture.ArchitecturalGenerator;
import com.br.terra.dcl.kdmGeneration.generators.impl.relationships.RelationshipsGenerator;
import com.br.terra.dcl.kdmGeneration.generators.impl.restrictions.patterns.CanRestrictionGenerator;
import com.br.terra.dcl.kdmGeneration.generators.impl.restrictions.patterns.OnlyCanRestrictionGenerator;
import com.br.terra.dcl.kdmGeneration.util.GenericMethodsArchitecture;

/**
 * @author Landi
 *
 */
public class RestrictionsGenerator {

	public static final String CODE_NAME = "InstancesReferenced";

	private EList<DCLStructureElement> allStructureElementsFromDCL = null;

	private EList<DCDecl> allRestrictionsFromDCL = null;


	public RestrictionsGenerator(EList<DCLStructureElement> allStructureElementsFromDCL, EList<DCDecl> allRestrictionsFromDCL) {
		this.allStructureElementsFromDCL = allStructureElementsFromDCL;
		this.allRestrictionsFromDCL = allRestrictionsFromDCL;
	}

	/**
	 * @author Landi
	 * @return
	 */
	public void generateRestrictions() {

		this.createCodeToSegment();

		this.generateHierarquicalRestrictions();

		this.generateLayerRestrictions();

		this.generateDefinedRestrictions();

	}

	private void createCodeToSegment() {
		CodeModel codeModel = CodeFactory.eINSTANCE.createCodeModel();
		codeModel.setName(CODE_NAME);

		DCL2KDM.kdmSegment.getModel().add(codeModel);	
	}

	private void generateHierarquicalRestrictions() {
		StructureModel structureModel = GenericMethodsArchitecture.getStructureModelFromKDM(DCL2KDM.kdmSegment, ArchitecturalGenerator.STRUCTURAL_NAME);

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

			List<KDMRelationship> relations = RelationshipsGenerator.createRelationsToAggregated(RelationshipGeneratorTypes.DEPEND, DCL2KDM.kdmSegment, moduleName); 

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
		StructureModel structureModel = GenericMethodsArchitecture.getStructureModelFromKDM(DCL2KDM.kdmSegment, ArchitecturalGenerator.STRUCTURAL_NAME);

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

					List<KDMRelationship> relations = RelationshipsGenerator.createRelationsToAggregated(RelationshipGeneratorTypes.DEPEND, DCL2KDM.kdmSegment, moduleName); 

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
		StructureModel structureModel = GenericMethodsArchitecture.getStructureModelFromKDM(DCL2KDM.kdmSegment, ArchitecturalGenerator.STRUCTURAL_NAME);
		
		List<DCDecl> allCanRestrictions = new ArrayList<DCDecl>();
		List<DCDecl> allOnlyCanRestrictions = new ArrayList<DCDecl>();
		List<DCDecl> allCanOnlyRestrictions = new ArrayList<DCDecl>();
		List<DCDecl> allCannotRestrictions = new ArrayList<DCDecl>();
		List<DCDecl> allMustRestrictions = new ArrayList<DCDecl>();
		
		for (DCDecl dcDecl : allRestrictionsFromDCL) {
			
			if(dcDecl.getOnly() == null && dcDecl.getOnly2() == null && dcDecl.getCan() != null){
				allCanRestrictions.add(dcDecl);
			}
			if(dcDecl.getOnly() != null && dcDecl.getCan() != null){
				allOnlyCanRestrictions.add(dcDecl);
			}
			if(dcDecl.getCannot() != null){
				allCannotRestrictions.add(dcDecl);
			}
			if(dcDecl.getOnly2() != null && dcDecl.getCan() != null){
				allCanOnlyRestrictions.add(dcDecl);
			}
			if(dcDecl.getMust() != null){
				allMustRestrictions.add(dcDecl);
			}
			
		}
		
		
		new CanRestrictionGenerator().generateRestrictions(structureModel, allCanRestrictions);
		
		new OnlyCanRestrictionGenerator().generateRestrictions(structureModel, allOnlyCanRestrictions);
		
//		new CanOnlyRestrictionGenerator().generateRestrictions(structureModel, allOnlyCanRestrictions);
//		
//		new MustRestrictionGenerator().generateRestrictions(structureModel, allOnlyCanRestrictions);
//
//		new CannotRestrictionGenerator().generateRestrictions(structureModel, allOnlyCanRestrictions);
//		
//		GenericMethodsRestrictions.removeAggregatedRelationshipWithDensityEquals(0);
	}

//	private void printDCDecl(DCDecl dcDecl) {
//		System.out.println("-------------------------------------------------------");
//		System.out.println("T(from) name: " + dcDecl.getT().getName());
//		System.out.println("Type(to) name: " + dcDecl.getType().getName());
//
//		if(dcDecl.getElementType() != null){
//			if (dcDecl.getElementType() instanceof BasicType) {
//				System.out.println("ElementType(BasicType) name: " + ((BasicType)dcDecl.getElementType()).getTypeName());
//			} 
//			if (dcDecl.getElementType() instanceof EntityType) {
//				System.out.println("ElementType(EntityType) name: " + ((EntityType)dcDecl.getElementType()).getEntity());
//			}
//		}else{
//			System.out.println("ElementType name: null");
//		}
//
//		if(dcDecl.getCan() != null){
//			System.out.println("Can name: " + dcDecl.getCan().getCan());
//		}
//		if(dcDecl.getCannot() != null){
//			System.out.println("Cannot name: " + dcDecl.getCannot().getCannot());
//		}
//		if(dcDecl.getOnly() != null){
//			System.out.println("Only name: " + dcDecl.getOnly().getOnly());
//		}
//		if(dcDecl.getOnly2() != null){
//			System.out.println("Only2 name: " + dcDecl.getOnly2().getOnly2());
//		}
//		if(dcDecl.getMust() != null){
//			System.out.println("Must name: " + dcDecl.getMust().getMust());
//		}
//
//		if(dcDecl.getEntityType() != null){
//			System.out.println("EntityType name: " + ((EntityType)dcDecl.getEntityType()).getEntity());
//		}else{
//			System.out.println("EntityType name: null");
//		}
//	}
}
