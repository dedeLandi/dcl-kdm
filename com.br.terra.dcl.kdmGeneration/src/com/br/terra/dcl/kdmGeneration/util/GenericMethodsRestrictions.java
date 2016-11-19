/**
 * @author Landi
 * 
 */
package com.br.terra.dcl.kdmGeneration.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeModel;
import org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship;
import org.eclipse.gmt.modisco.omg.kdm.core.CoreFactory;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMRelationship;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Segment;
import org.eclipse.gmt.modisco.omg.kdm.structure.AbstractStructureElement;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel;

import com.br.terra.dcl.dCL.DCLStructureElement;
import com.br.terra.dcl.kdmGeneration.actions.DCL2KDM;
import com.br.terra.dcl.kdmGeneration.generators.enums.RelationshipGeneratorTypes;
import com.br.terra.dcl.kdmGeneration.generators.impl.relationships.RelationshipsGenerator;

import br.ufscar.kdm_manager.core.filters.validateFilter.factory.KDMValidateFilterJavaFactory;
import br.ufscar.kdm_manager.core.filters.validateFilter.interfaces.KDMValidateFilter;
import br.ufscar.kdm_manager.core.readers.modelReader.factory.KDMModelReaderJavaFactory;
import br.ufscar.kdm_manager.core.readers.structureReader.factory.KDMStructureReaderJavaFactory;

/**
 * @author Landi
 *
 */
public class GenericMethodsRestrictions {

	/**
	 * 
	 * @author Landi
	 * @param segment
	 * @param nameToSearch
	 * @return
	 */
	public static CodeModel getCodeModelFromKDM(Segment segment, String nameToSearch) {
		CodeModel codeModel = null;
		KDMValidateFilter<?, ?> filter = KDMValidateFilterJavaFactory.eINSTANCE.createValidateFilterNameOfKDMFramework(nameToSearch);
		Map<String, List<CodeModel>> allFromSegment = KDMModelReaderJavaFactory.eINSTANCE.createKDMCodeModelReaderWithFilter(filter).getAllFromSegment(segment);
		for (String key : allFromSegment.keySet()) {
			if(allFromSegment.get(key).size() == 1){
				codeModel = allFromSegment.get(key).get(0);
				break;
			}
		}
		return codeModel;
	}

	/**
	 * @author Landi
	 * @param structureModel
	 * @param to
	 * @param from
	 * @return
	 */
	public static List<AggregatedRelationship> findAggregatedWithToFrom(StructureModel structureModel,
			AbstractStructureElement to, AbstractStructureElement from) {
		KDMEntity[] toFrom = {to, from};
		KDMValidateFilter<?, ?> filter = KDMValidateFilterJavaFactory.eINSTANCE.createValidateFilterAggregatedRelationshipToFromOfKDMEntity(toFrom);

		return KDMStructureReaderJavaFactory.eINSTANCE.createKDMAggregatedRelationshipReaderWithFilter(filter).getAllFrom(structureModel);
	}

	/**
	 * @author Landi
	 * @param structureModel 
	 * @param to
	 */
	public static List<AggregatedRelationship> findAggregatedWithTo(StructureModel structureModel, AbstractStructureElement to) {
		KDMValidateFilter<?, ?> filter = KDMValidateFilterJavaFactory.eINSTANCE.createValidateFilterAggregatedRelationshipToOfKDMEntity(to);

		return KDMStructureReaderJavaFactory.eINSTANCE.createKDMAggregatedRelationshipReaderWithFilter(filter).getAllFrom(structureModel);
	}

	/**
	 * @author Landi
	 * @param structureModel 
	 * @param to
	 */
	public static List<AggregatedRelationship> findAggregatedWithFrom(StructureModel structureModel, AbstractStructureElement from) {
		KDMValidateFilter<?, ?> filter = KDMValidateFilterJavaFactory.eINSTANCE.createValidateFilterAggregatedRelationshipFromOfKDMEntity(from);

		return KDMStructureReaderJavaFactory.eINSTANCE.createKDMAggregatedRelationshipReaderWithFilter(filter).getAllFrom(structureModel);
	}

	/**
	 * @author Landi
	 * @param structureModel2 
	 * @param type
	 * @return
	 */
	public static AbstractStructureElement findToOrFrom(StructureModel structureModel, DCLStructureElement elementToFind) {
		return GenericMethodsArchitecture.findArchitecturaElement(structureModel, elementToFind);
	}

	/**
	 * @author Landi
	 * @param aggregatedRelationship
	 * @param relation
	 */
	public static void pullRelationOfAggregated(AggregatedRelationship aggregatedRelationship,
			RelationshipGeneratorTypes relation) {
		for (Class<?> classRelation : relation.getRelationshipsClass()) {

			for (Iterator<KDMRelationship> iterator = aggregatedRelationship.getRelation().iterator(); iterator.hasNext();) {
				KDMRelationship relationship = (KDMRelationship) iterator.next();

				if(validateClassType(relationship.getClass().getInterfaces(), classRelation)){
					iterator.remove();
					int newDensity = aggregatedRelationship.getDensity() - 1;
					aggregatedRelationship.setDensity(newDensity);
				}
			}
		}
	}

	/**
	 * @author Landi
	 * @param interfaces
	 * @param classRelation
	 * @return
	 */
	public static boolean validateClassType(Class<?>[] setOfClasses, Class<?> classToSearch) {
		for (Class<?> classTest : setOfClasses) {
			if(classTest == classToSearch){
				return true;
			}
		}
		return false;
	}

	/**
	 * @author Landi
	 * @param relationToPut
	 * @param relation
	 * @return
	 */
	public static boolean thisRelationShouldBePut(KDMRelationship relationToPut, EList<KDMRelationship> relations) {
		for (KDMRelationship kdmRelationship : relations) {
			if(relationToPut.eClass() == kdmRelationship.eClass()){
				return false;
			}
		}
		return true;
	}

	/**
	 * @author Landi
	 * @param aggregatedRelationship
	 * @param relation
	 * @return
	 */
	public static boolean allRelationsShouldBePutOrPull(AggregatedRelationship aggregatedRelationship,
			RelationshipGeneratorTypes relation) {
		int cont = 0;
		boolean found = false;

		for (KDMRelationship relationship : aggregatedRelationship.getRelation()) {
			found = false;
			for (Class<?> classToCompare : relation.getRelationshipsClass()) {

				if(validateClassType(relationship.getClass().getInterfaces(), classToCompare)){
					found = true;
					break;
				}
			}
			if(found == false){
				cont++;
			}
		}

		return cont == relation.getRelationshipsClass().size() ? true : false;
	}

	/**
	 * @author Landi
	 * @param aggregatedRelationship
	 * @param relations
	 */
	public static void completeAggreagatedWith(AggregatedRelationship aggregatedRelationship,
			List<KDMRelationship> relations) {

		int newDensity = aggregatedRelationship.getDensity() + relations.size();
		aggregatedRelationship.setDensity(newDensity);
		aggregatedRelationship.getRelation().addAll(relations);
	}

	/**
	 * @author Landi
	 * @param aggregatedRelationship
	 * @param relations
	 */
	public static void addAggreagatedWith(AggregatedRelationship aggregatedRelationship,
			KDMRelationship relationToAdd) {
		aggregatedRelationship.getRelation().add(relationToAdd);
		int newDensity = aggregatedRelationship.getDensity() + 1;
		aggregatedRelationship.setDensity(newDensity);
	}

	/**
	 * @author Landi
	 * @param from 
	 * @param to 
	 * @param relation
	 * @param moduleName 
	 */
	public static void createAggreagatedWith(AbstractStructureElement to, AbstractStructureElement from, RelationshipGeneratorTypes relation, String moduleName) {
		List<KDMRelationship> relations = RelationshipsGenerator.createRelationsToAggregated(relation, DCL2KDM.kdmSegment, moduleName); 

		AggregatedRelationship aggregatedRelationship = CoreFactory.eINSTANCE.createAggregatedRelationship();
		aggregatedRelationship.setDensity(relations.size());
		aggregatedRelationship.setFrom(from);
		aggregatedRelationship.setTo(to);
		aggregatedRelationship.getRelation().addAll(relations);

		from.getAggregated().add(aggregatedRelationship);
	}

	/**
	 * @author Landi
	 * @param aggregatedRelationship
	 * @param relation
	 * @param moduleName 
	 */
	public static void putRelationInAggregated(AggregatedRelationship aggregatedRelationship,
			RelationshipGeneratorTypes relation, String moduleName) {

		List<KDMRelationship> relations = RelationshipsGenerator.createRelationsToAggregated(relation, DCL2KDM.kdmSegment, moduleName); 

		if(GenericMethodsRestrictions.allRelationsShouldBePutOrPull(aggregatedRelationship, relation)){
			System.out.println(">>>"+aggregatedRelationship.getFrom().getName());
			System.out.println(">>>"+aggregatedRelationship.getTo().getName());
			System.out.println(">>>"+aggregatedRelationship.getRelation().size());
			GenericMethodsRestrictions.completeAggreagatedWith(aggregatedRelationship, relations);
		}else{
			for (KDMRelationship relationToPut : relations) {

				if(GenericMethodsRestrictions.thisRelationShouldBePut(relationToPut, aggregatedRelationship.getRelation())){
					GenericMethodsRestrictions.addAggreagatedWith(aggregatedRelationship, relationToPut);
				}
			}
		}
	}

	/**
	 * @author Landi
	 * @param structureModel 
	 * @param i
	 */
	public static void removeAggregatedRelationshipWithDensityEquals(StructureModel structureModel, int density) {

		for (AbstractStructureElement abstractStructureElement : structureModel.getStructureElement()) {

			removeAggregatedRelationshipWithDensityEquals(abstractStructureElement, density);
			
		}
	}

	/**
	 * @author Landi
	 * @param abstractStructureElement
	 * @param density
	 */
	private static void removeAggregatedRelationshipWithDensityEquals(AbstractStructureElement abstractStructureElement,
			int density) {
		
		for (Iterator<AggregatedRelationship> iterator = abstractStructureElement.getInAggregated().iterator(); iterator.hasNext();) {
			AggregatedRelationship aggregatedRelationship = (AggregatedRelationship) iterator.next();
			if(aggregatedRelationship.getDensity() == density){
				iterator.remove();
			}
		}
		for (Iterator<AggregatedRelationship> iterator = abstractStructureElement.getOutAggregated().iterator(); iterator.hasNext();) {
			AggregatedRelationship aggregatedRelationship = (AggregatedRelationship) iterator.next();
			if(aggregatedRelationship.getDensity() == density){
				iterator.remove();
			}
		}
		for (Iterator<AggregatedRelationship> iterator = abstractStructureElement.getAggregated().iterator(); iterator.hasNext();) {
			AggregatedRelationship aggregatedRelationship = (AggregatedRelationship) iterator.next();
			if(aggregatedRelationship.getDensity() == density){
				iterator.remove();
			}
		}
		
		if(abstractStructureElement.getStructureElement().size() > 0){
			for (AbstractStructureElement abstractStructureElementChild : abstractStructureElement.getStructureElement()) {
				removeAggregatedRelationshipWithDensityEquals(abstractStructureElementChild, density);
			}
		}
	}
}
