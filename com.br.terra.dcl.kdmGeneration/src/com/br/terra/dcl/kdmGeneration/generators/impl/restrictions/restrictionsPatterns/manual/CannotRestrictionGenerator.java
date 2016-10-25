/**
 * @author Landi
 * 
 */
package com.br.terra.dcl.kdmGeneration.generators.impl.restrictions.restrictionsPatterns.manual;

import java.util.List;

import org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship;
import org.eclipse.gmt.modisco.omg.kdm.structure.AbstractStructureElement;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel;

import com.br.terra.dcl.dCL.BasicType;
import com.br.terra.dcl.dCL.DCDecl;
import com.br.terra.dcl.dCL.EntityType;
import com.br.terra.dcl.kdmGeneration.generators.enums.RelationshipGeneratorTypes;
import com.br.terra.dcl.kdmGeneration.generators.interfaces.PatternRestrictionGenerator;
import com.br.terra.dcl.kdmGeneration.util.GenericMethodsRestrictions;

/**
 * @author Landi
 *
 */
public class CannotRestrictionGenerator implements PatternRestrictionGenerator<DCDecl> {

	/* (non-Javadoc)
	 * @see com.br.terra.dcl.kdmGeneration.generators.interfaces.PatternRestrictionGenerator#generateRestrictions(org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel, java.util.List)
	 */
	@Override
	public void generateRestrictions(StructureModel structureModel, List<DCDecl> allDCLRestrictions) {

		for (DCDecl dcDecl : allDCLRestrictions) {

			AbstractStructureElement to = GenericMethodsRestrictions.findToOrFrom(structureModel, dcDecl.getType());

			AbstractStructureElement from = GenericMethodsRestrictions.findToOrFrom(structureModel, dcDecl.getT());
			List<AggregatedRelationship> aggregatedsWithToFrom = GenericMethodsRestrictions.findAggregatedWithToFrom(structureModel, to, from);

			RelationshipGeneratorTypes relation = null;
			if(dcDecl.getElementType() != null){
				if (dcDecl.getElementType() instanceof BasicType) {
					relation = RelationshipGeneratorTypes.getRelationshipGeneratorTypesByDclText(((BasicType)dcDecl.getElementType()).getTypeName());
				} else if(dcDecl.getElementType() instanceof EntityType) {
					relation = RelationshipGeneratorTypes.getRelationshipGeneratorTypesByDclText(((EntityType)dcDecl.getElementType()).getEntity());
				}
			}

			this.generateCannotRestrictions(to, from, aggregatedsWithToFrom, relation);

		}

	}

	/**
	 * @author Landi
	 * @param to
	 * @param from
	 * @param aggregatedsWithToFrom
	 * @param relation
	 */
	private void generateCannotRestrictions(AbstractStructureElement to, AbstractStructureElement from,
			List<AggregatedRelationship> aggregatedsWithToFrom, RelationshipGeneratorTypes relation) {
		
		if(aggregatedsWithToFrom.size() > 0){
			for (AggregatedRelationship aggregatedRelationship : aggregatedsWithToFrom) {
				GenericMethodsRestrictions.pullRelationOfAggregated(aggregatedRelationship, relation);
			}
		}
		
	}

}
