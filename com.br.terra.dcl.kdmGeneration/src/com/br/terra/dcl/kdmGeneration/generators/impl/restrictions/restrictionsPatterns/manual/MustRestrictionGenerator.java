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
public class MustRestrictionGenerator implements PatternRestrictionGenerator<DCDecl> {

	/* (non-Javadoc)
	 * 
	 * regra do tipo: A deve B com C 
	 * onde: A é um elemento arquitetural, B é o tipo de relação e C é outro elemento
	 * regra simples que indica que um elemento A deve realizar alguma relação com o elemento B 
	 * 
	 * exemplo:
	 *	ss1 must-extend ss5;
	 *  SS1 deve extender(extends) o SS5
	 * 
	 * @see com.br.terra.dcl.kdmGeneration.generators.interfaces.PatternRestrictionGenerator#generateRestrictions(org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel, java.util.List)
	 */
	@Override
	public void generateRestrictions(StructureModel structureModel, List<DCDecl> allDCLRestrictions) {
		
		for (DCDecl dcDecl : allDCLRestrictions) {
			
			AbstractStructureElement to = GenericMethodsRestrictions.findToOrFrom(structureModel, dcDecl.getType());

			AbstractStructureElement from = GenericMethodsRestrictions.findToOrFrom(structureModel, dcDecl.getT());
			List<AggregatedRelationship> aggregatedsWithToFrom = GenericMethodsRestrictions.findAggregatedWithToFrom(structureModel, to, from);
			
			RelationshipGeneratorTypes relation = null;
			if(dcDecl.getEntityType() != null){
				if (dcDecl.getEntityType() instanceof BasicType) {
					relation = RelationshipGeneratorTypes.getRelationshipGeneratorTypesByDclText(((BasicType)dcDecl.getEntityType()).getTypeName());
				} else if(dcDecl.getEntityType() instanceof EntityType) {
					relation = RelationshipGeneratorTypes.getRelationshipGeneratorTypesByDclText(((EntityType)dcDecl.getEntityType()).getEntity());
				}
			}
			
			this.generateMustRestrictions(to, from, aggregatedsWithToFrom, relation);
			
		}
	}

	/**
	 * @author Landi
	 * @param to
	 * @param from
	 * @param aggregatedsWithToFrom
	 * @param relation
	 */
	private void generateMustRestrictions(AbstractStructureElement to, AbstractStructureElement from,
			List<AggregatedRelationship> aggregatedsWithToFrom, RelationshipGeneratorTypes relation) {
		
		if(aggregatedsWithToFrom.size() > 0){
			for (AggregatedRelationship aggregatedRelationship : aggregatedsWithToFrom) {
				String moduleName = "MustRestrictionBetween " + aggregatedRelationship.getFrom().getName() + " to " + aggregatedRelationship.getTo().getName();
				GenericMethodsRestrictions.putRelationInAggregated(aggregatedRelationship, relation, moduleName);
			}
		}else{
			String moduleName = "MustRestrictionBetween " + from.getName() + " to " + to.getName();
			GenericMethodsRestrictions.createAggreagatedWith(to, from, relation, moduleName);
		}
	}

}
