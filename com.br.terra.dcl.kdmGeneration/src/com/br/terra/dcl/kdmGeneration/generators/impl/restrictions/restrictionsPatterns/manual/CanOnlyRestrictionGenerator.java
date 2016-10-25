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
public class CanOnlyRestrictionGenerator implements PatternRestrictionGenerator<DCDecl> {

	/* (non-Javadoc)
	 * 
	 * regra do tipo: A pode B somente com C 
	 * onde: A é um elemento arquitetural, B é o tipo de relação e C é outro elemento
	 * todos os FROM A não pode a relação B com exceção do TO C
	 * deve-se excluir todos as relações B dos aggregates com FROM A com exceção do TO C 
	 * 
	 * exemplo:
	 *	ss1 can-access-only ss5;
	 *  SS1 pode accessar(Calls) somente o SS5 logo demais aggregateds com FROM em SS1 não podem ter acesso(Calls) com exceção do TO SS5
	 * 
	 * @see com.br.terra.dcl.kdmGeneration.generators.interfaces.PatternRestrictionGenerator#generateRestrictions(org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel, java.util.List)
	 */
	@Override
	public void generateRestrictions(StructureModel structureModel, List<DCDecl> allDCLRestrictions) {
		for (DCDecl dcDecl : allDCLRestrictions) {


			AbstractStructureElement to = GenericMethodsRestrictions.findToOrFrom(structureModel, dcDecl.getType());

			AbstractStructureElement from = GenericMethodsRestrictions.findToOrFrom(structureModel, dcDecl.getT());
			List<AggregatedRelationship> aggregatedsWithFrom = GenericMethodsRestrictions.findAggregatedWithFrom(structureModel, from);

			RelationshipGeneratorTypes relation = null;
			if(dcDecl.getElementType() != null){
				if (dcDecl.getElementType() instanceof BasicType) {
					relation = RelationshipGeneratorTypes.getRelationshipGeneratorTypesByDclText(((BasicType)dcDecl.getElementType()).getTypeName());
				} else if(dcDecl.getElementType() instanceof EntityType) {
					relation = RelationshipGeneratorTypes.getRelationshipGeneratorTypesByDclText(((EntityType)dcDecl.getElementType()).getEntity());
				}
			}

			this.generateCanOnlyRestrictions(to, from, aggregatedsWithFrom, relation);

		}
	}

	/**
	 * @author Landi
	 * @param to
	 * @param from
	 * @param aggregatedsWithFrom
	 * @param relation
	 */
	private void generateCanOnlyRestrictions(AbstractStructureElement to, AbstractStructureElement from,
			List<AggregatedRelationship> aggregatedsWithFrom, RelationshipGeneratorTypes relation) {
		
		if(aggregatedsWithFrom.size() > 0){
			for (AggregatedRelationship aggregatedRelationship : aggregatedsWithFrom) {
				if(aggregatedRelationship.getTo().equals(to)){
					String moduleName = "CanOnlyRestrictionBetween " + aggregatedRelationship.getFrom().getName() + " to " + aggregatedRelationship.getTo().getName();
					GenericMethodsRestrictions.putRelationInAggregated(aggregatedRelationship, relation, moduleName);
				}else{
					GenericMethodsRestrictions.pullRelationOfAggregated(aggregatedRelationship, relation);
				}
			}
		}else{
			String moduleName = "CanOnlyRestrictionBetween " + from.getName() + " to " + to.getName();
			GenericMethodsRestrictions.createAggreagatedWith(to, from, relation, moduleName);
		}
	}

}
