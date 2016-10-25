/**
 * @author Landi
 * 
 */
package com.br.terra.dcl.kdmGeneration.generators.impl.restrictions.restrictionsPatterns.automatic;

import java.util.List;

import org.eclipse.gmt.modisco.omg.kdm.structure.AbstractStructureElement;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel;

import com.br.terra.dcl.dCL.DCLStructureElement;
import com.br.terra.dcl.kdmGeneration.generators.enums.RelationshipGeneratorTypes;
import com.br.terra.dcl.kdmGeneration.generators.interfaces.PatternRestrictionGenerator;
import com.br.terra.dcl.kdmGeneration.util.GenericMethodsRestrictions;

/**
 * @author Landi
 *
 */
public class HierarquicalRestrictionGenerator implements PatternRestrictionGenerator<DCLStructureElement>{

	private List<DCLStructureElement> allDCLStructureElements = null;

	/* (non-Javadoc)
	 * @see com.br.terra.dcl.kdmGeneration.generators.interfaces.PatternRestrictionGenerator#generateRestrictions(org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel, java.util.List)
	 */
	@Override
	public void generateRestrictions(StructureModel structureModel, List<DCLStructureElement> allDCLStructureElements) {
		this.allDCLStructureElements = allDCLStructureElements;
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

			GenericMethodsRestrictions.createAggreagatedWith(child, parent, RelationshipGeneratorTypes.DEPEND, moduleName);
			
			if(child.getStructureElement().size() >= 1){
				this.createHierarquicalRelationshipWithChild(child);
			}
		}
	}

	/**
	 * @return the allDCLStructureElements
	 */
	public List<DCLStructureElement> getAllDCLStructureElements() {
		return allDCLStructureElements;
	}

}
