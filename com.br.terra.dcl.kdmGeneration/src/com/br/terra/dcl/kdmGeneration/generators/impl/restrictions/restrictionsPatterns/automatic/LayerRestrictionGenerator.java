/**
 * @author Landi
 * 
 */
package com.br.terra.dcl.kdmGeneration.generators.impl.restrictions.restrictionsPatterns.automatic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship;
import org.eclipse.gmt.modisco.omg.kdm.core.CoreFactory;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMRelationship;
import org.eclipse.gmt.modisco.omg.kdm.structure.AbstractStructureElement;
import org.eclipse.gmt.modisco.omg.kdm.structure.Layer;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel;

import com.br.terra.dcl.dCL.DCLLayer;
import com.br.terra.dcl.dCL.DCLStructureElement;
import com.br.terra.dcl.kdmGeneration.actions.DCL2KDM;
import com.br.terra.dcl.kdmGeneration.generators.enums.RelationshipGeneratorTypes;
import com.br.terra.dcl.kdmGeneration.generators.impl.relationships.RelationshipsGenerator;
import com.br.terra.dcl.kdmGeneration.generators.interfaces.PatternRestrictionGenerator;

/**
 * @author Landi
 *
 */
public class LayerRestrictionGenerator implements PatternRestrictionGenerator<DCLStructureElement> {

	private List<DCLStructureElement> allStructureElementsFromDCL = null;

	/* (non-Javadoc)
	 * @see com.br.terra.dcl.kdmGeneration.generators.interfaces.PatternRestrictionGenerator#generateRestrictions(org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel, java.util.List)
	 */
	@Override
	public void generateRestrictions(StructureModel structureModel, List<DCLStructureElement> allDCLStructureElements) {
		this.allStructureElementsFromDCL  = allDCLStructureElements;
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

		for (DCLStructureElement dclStructureElement : this.allStructureElementsFromDCL) {
			if(dclStructureElement instanceof DCLLayer){
				if(layer.getName().equalsIgnoreCase(dclStructureElement.getName())){
					level = ((DCLLayer) dclStructureElement).getLevel();
					this.allStructureElementsFromDCL.remove(dclStructureElement);
					return level;
				}
			}
		}
		return level;
	}

}
