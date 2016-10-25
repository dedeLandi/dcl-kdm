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
public class CanRestrictionGenerator implements PatternRestrictionGenerator<DCDecl> {

	/* (non-Javadoc)
	 * regra do tipo: A pode B com C 
	 * onde: A é um elemento arquitetural, B é o tipo de relação e C é outro elemento
	 * regra simples que indica que um elemento A pode ter alguma relação com o elemento B 
	 * 
	 * exemplo:
	 *	ss1 can-access ss5;
	 *  SS1 pode accessar(Calls) o SS5
	 * 
	 * @see com.br.terra.dcl.kdmGeneration.generators.interfaces.PatternRestrictionGenerator#generateRestrictions(org.eclipse.gmt.modisco.omg.kdm.kdm.Segment, org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel, java.util.List)
	 */
	@Override
	public void generateRestrictions(StructureModel structureModel, List<DCDecl> allOnlyCanRestrictions) {

		for (DCDecl dcDecl : allOnlyCanRestrictions) {
			
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
			
			this.generateCanRestrictions(to, from, aggregatedsWithToFrom, relation);
			
		}

	}

	private void generateCanRestrictions(AbstractStructureElement to, AbstractStructureElement from, List<AggregatedRelationship> aggregatedsWithToFrom, RelationshipGeneratorTypes relation) {
		
		if(aggregatedsWithToFrom.size() > 0){
			for (AggregatedRelationship aggregatedRelationship : aggregatedsWithToFrom) {
				String moduleName = "CanRestrictionBetween " + aggregatedRelationship.getFrom().getName() + " to " + aggregatedRelationship.getTo().getName();
				GenericMethodsRestrictions.putRelationInAggregated(aggregatedRelationship, relation, moduleName);
			}
		}else{
			String moduleName = "CanRestrictionBetween " + from.getName() + " to " + to.getName();
			GenericMethodsRestrictions.createAggreagatedWith(to, from, relation, moduleName);
		}
	}
	

}
