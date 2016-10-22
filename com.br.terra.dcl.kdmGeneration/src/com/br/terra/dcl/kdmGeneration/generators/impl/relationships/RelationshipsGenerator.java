package com.br.terra.dcl.kdmGeneration.generators.impl.relationships;

import java.util.List;

import org.eclipse.gmt.modisco.omg.kdm.action.ActionElement;
import org.eclipse.gmt.modisco.omg.kdm.action.ActionFactory;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeElement;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeFactory;
import org.eclipse.gmt.modisco.omg.kdm.code.Module;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMRelationship;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Segment;

import com.br.terra.dcl.kdmGeneration.generators.enums.RelationshipGeneratorTypes;
import com.br.terra.dcl.kdmGeneration.generators.impl.restrictions.RestrictionsGenerator;
import com.br.terra.dcl.kdmGeneration.util.GenericMethodsRestrictions;

/**
 * @author Landi
 *
 */
public class RelationshipsGenerator {

	private static final int ACCESS = 1;//RelationshipGeneratorTypes.ACCESS.getValue();
	private static final int CREATE = 2;//RelationshipGeneratorTypes.CREATE.getValue();
	private static final int DECLARE = 3;//RelationshipGeneratorTypes.DECLARE.getValue();
	private static final int DEPEND = 4;//RelationshipGeneratorTypes.DEPEND.getValue();
	private static final int DERIVE = 5;//RelationshipGeneratorTypes.DERIVE.getValue();
	private static final int EXTEND = 6;//RelationshipGeneratorTypes.EXTEND.getValue();
	private static final int HANDLE = 7;//RelationshipGeneratorTypes.HANDLE.getValue();
	private static final int IMPLEMENT = 8;//RelationshipGeneratorTypes.IMPLEMENT.getValue();
	private static final int THROW = 9;//RelationshipGeneratorTypes.THROW.getValue();
	private static final int USEANNOTATION = 10;//RelationshipGeneratorTypes.USEANNOTATION.getValue();

	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	private static List<KDMRelationship> createDependRelations(Segment kdmSegment, String moduleName) {
		
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		GenericMethodsRestrictions.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relacoes de action
		ActionElement actionElementForRelations = ActionFactory.eINSTANCE.createActionElement();

		actionElementForRelations.setName("actionElement Instance");

		moduleForRelations.getCodeElement().add(actionElementForRelations);

		//Andre - cria o eContainer das relações de código
		CodeElement codeElementForRelations = CodeFactory.eINSTANCE.createCodeElement();

		codeElementForRelations.setName("codeElement Instance");

		moduleForRelations.getCodeElement().add(codeElementForRelations);

		return RelationshipGeneratorTypes.DEPEND.getRelationships(actionElementForRelations, codeElementForRelations);
	}
	
	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	private static List<KDMRelationship> createAccessRelations(Segment kdmSegment, String moduleName) {
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		GenericMethodsRestrictions.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relacoes de action
		ActionElement actionElementForRelations = ActionFactory.eINSTANCE.createActionElement();

		actionElementForRelations.setName("actionElement Instance");

		moduleForRelations.getCodeElement().add(actionElementForRelations);

		return RelationshipGeneratorTypes.ACCESS.getRelationships(actionElementForRelations);
	}
	
	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	private static List<KDMRelationship> createDeclareRelations(Segment kdmSegment, String moduleName) {
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		GenericMethodsRestrictions.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relacoes de action
		ActionElement actionElementForRelations = ActionFactory.eINSTANCE.createActionElement();

		actionElementForRelations.setName("actionElement Instance");

		moduleForRelations.getCodeElement().add(actionElementForRelations);

		return RelationshipGeneratorTypes.DECLARE.getRelationships(actionElementForRelations);
	}
	
	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	private static List<KDMRelationship> createCreateRelations(Segment kdmSegment, String moduleName) {
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		GenericMethodsRestrictions.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relacoes de action
		ActionElement actionElementForRelations = ActionFactory.eINSTANCE.createActionElement();

		actionElementForRelations.setName("actionElement Instance");

		moduleForRelations.getCodeElement().add(actionElementForRelations);

		return RelationshipGeneratorTypes.CREATE.getRelationships(actionElementForRelations);
	}
	
	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	private static List<KDMRelationship> createHandleRelations(Segment kdmSegment, String moduleName) {
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		GenericMethodsRestrictions.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relacoes de action
		ActionElement actionElementForRelations = ActionFactory.eINSTANCE.createActionElement();

		actionElementForRelations.setName("actionElement Instance");

		moduleForRelations.getCodeElement().add(actionElementForRelations);

		return RelationshipGeneratorTypes.HANDLE.getRelationships(actionElementForRelations);
	}
	
	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	private static List<KDMRelationship> createExtendRelations(Segment kdmSegment, String moduleName) {
		
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		GenericMethodsRestrictions.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relações de código
		CodeElement codeElementForRelations = CodeFactory.eINSTANCE.createCodeElement();

		codeElementForRelations.setName("codeElement Instance");

		moduleForRelations.getCodeElement().add(codeElementForRelations);

		return RelationshipGeneratorTypes.EXTEND.getRelationships(codeElementForRelations);
	}
	
	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	private static List<KDMRelationship> createImplementRelations(Segment kdmSegment, String moduleName) {
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		GenericMethodsRestrictions.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relações de código
		CodeElement codeElementForRelations = CodeFactory.eINSTANCE.createCodeElement();

		codeElementForRelations.setName("codeElement Instance");

		moduleForRelations.getCodeElement().add(codeElementForRelations);

		return RelationshipGeneratorTypes.IMPLEMENT.getRelationships(codeElementForRelations);
	}

	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	private static List<KDMRelationship> createDeriveRelations(Segment kdmSegment, String moduleName) {
		
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		GenericMethodsRestrictions.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relações de código
		CodeElement codeElementForRelations = CodeFactory.eINSTANCE.createCodeElement();

		codeElementForRelations.setName("codeElement Instance");

		moduleForRelations.getCodeElement().add(codeElementForRelations);

		return RelationshipGeneratorTypes.DERIVE.getRelationships(codeElementForRelations);
	}
	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	private static List<KDMRelationship> createThrowRelations(Segment kdmSegment, String moduleName) {
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		GenericMethodsRestrictions.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relacoes de action
		ActionElement actionElementForRelations = ActionFactory.eINSTANCE.createActionElement();

		actionElementForRelations.setName("actionElement Instance");

		moduleForRelations.getCodeElement().add(actionElementForRelations);

		return RelationshipGeneratorTypes.THROW.getRelationships(actionElementForRelations);
	}
	
	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	private static List<KDMRelationship> createUseAnnotationRelations(Segment kdmSegment, String moduleName) {
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		GenericMethodsRestrictions.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relações de código
		CodeElement codeElementForRelations = CodeFactory.eINSTANCE.createCodeElement();

		codeElementForRelations.setName("codeElement Instance");

		moduleForRelations.getCodeElement().add(codeElementForRelations);

		return RelationshipGeneratorTypes.USEANNOTATION.getRelationships(codeElementForRelations);
	}

	/**
	 * @author Landi
	 * @param relation
	 * @param kdmSegment
	 * @param moduleName
	 * @return
	 */
	public static List<KDMRelationship> createRelationsToAggregated(RelationshipGeneratorTypes relation,
			Segment kdmSegment, String moduleName) {

		switch (relation.getValue()) {
		case ACCESS:
			return createAccessRelations(kdmSegment, moduleName);
		case CREATE:
			return createCreateRelations(kdmSegment, moduleName);
		case DECLARE:
			return createDeclareRelations(kdmSegment, moduleName);
		case DEPEND:
			return createDependRelations(kdmSegment, moduleName);
		case DERIVE:
			return createDeriveRelations(kdmSegment, moduleName);
		case EXTEND:
			return createExtendRelations(kdmSegment, moduleName);
		case HANDLE:
			return createHandleRelations(kdmSegment, moduleName);
		case IMPLEMENT:
			return createImplementRelations(kdmSegment, moduleName);
		case THROW:
			return createThrowRelations(kdmSegment, moduleName);
		case USEANNOTATION:
			return createUseAnnotationRelations(kdmSegment, moduleName);
		default:
			return null;
		}
	}
	
}
