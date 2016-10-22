/**
 * @author Landi
 * 
 */
package com.br.terra.dcl.kdmGeneration.generators.impl.restrictions.patterns;

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
public class OnlyCanRestrictionGenerator implements PatternRestrictionGenerator {

	/* (non-Javadoc)
	 * regra do tipo: somente A pode B com C 
	 * onde: A é um elemento arquitetural, B é o tipo de relação e C é outro elemento
	 * todos TO de C com excessão do A não pode a relação B
	 * deve-se excluir todos as relações B dos aggregates com TO C com exceção do FROM A 
	 * 
	 * exemplo:
	 *	only ss1 can-access ss5;
	 *  somente o SS1 pode accessar(Calls) o SS5 logo demais aggregateds com TO em SS5 não podem ter acesso(Calls)
	 *  
	 * @see com.br.terra.dcl.kdmGeneration.generators.impl.restrictions.RestrictionGenerator#generateRestrictions(org.eclipse.gmt.modisco.omg.kdm.kdm.Segment, org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel, java.util.List)
	 */
	@Override
	public void generateRestrictions(StructureModel structureModel, List<DCDecl> allDCLRestrictions) {
		
		for (DCDecl dcDecl : allDCLRestrictions) {
			

			AbstractStructureElement to = GenericMethodsRestrictions.findToOrFrom(structureModel, dcDecl.getType());
			List<AggregatedRelationship> aggregatedsWithTo= GenericMethodsRestrictions.findAggregatedWithTo(structureModel, to);

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
			
			this.generateOnlyCanRestrictions(to, from, aggregatedsWithToFrom, aggregatedsWithTo, relation);
			
		}
		
	}
	
	private void generateOnlyCanRestrictions(AbstractStructureElement to, AbstractStructureElement from, List<AggregatedRelationship> aggregatedsWithToFrom,
			List<AggregatedRelationship> aggregatedsWithTo, RelationshipGeneratorTypes relation) {
		
		if(aggregatedsWithToFrom.size() > 0){
			for (AggregatedRelationship aggregatedRelationship : aggregatedsWithToFrom) {
				String moduleName = "OnlyCanRestrictionBetween " + aggregatedRelationship.getFrom().getName() + " to " + aggregatedRelationship.getTo().getName();
				GenericMethodsRestrictions.putRelationInAggregated(aggregatedRelationship, relation, moduleName);
			}
		}else{
			String moduleName = "OnlyCanRestrictionBetween " + from.getName() + " to " + to.getName();
			GenericMethodsRestrictions.createAggreagatedWith(to, from, relation, moduleName);
		}
		
		if(aggregatedsWithTo.size() > 0){
			for (AggregatedRelationship aggregatedRelationship : aggregatedsWithTo) {
				GenericMethodsRestrictions.pullRelationOfAggregated(aggregatedRelationship, relation);
			}
		}
		
	}

}
