package com.br.terra.dcl.kdmGeneration.generators.restrictions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gmt.modisco.omg.kdm.action.ActionElement;
import org.eclipse.gmt.modisco.omg.kdm.action.ActionFactory;
import org.eclipse.gmt.modisco.omg.kdm.action.Calls;
import org.eclipse.gmt.modisco.omg.kdm.action.Creates;
import org.eclipse.gmt.modisco.omg.kdm.action.UsesType;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeElement;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeFactory;
import org.eclipse.gmt.modisco.omg.kdm.code.Extends;
import org.eclipse.gmt.modisco.omg.kdm.code.HasValue;
import org.eclipse.gmt.modisco.omg.kdm.code.Implements;
import org.eclipse.gmt.modisco.omg.kdm.code.Imports;
import org.eclipse.gmt.modisco.omg.kdm.code.Module;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMRelationship;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Segment;

/**
 * @author Landi
 *
 */
public class RelationshipsGenerator {

	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	public static List<KDMRelationship> createDependRelations(Segment kdmSegment, String moduleName) {
		List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
		
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		RestrictionsGenerator.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relacoes de action
		ActionElement actionElementForRelations = ActionFactory.eINSTANCE.createActionElement();

		actionElementForRelations.setName("actionElement Instance");

		moduleForRelations.getCodeElement().add(actionElementForRelations);

		//Andre - cria o eContainer das relações de código
		CodeElement codeElementForRelations = CodeFactory.eINSTANCE.createCodeElement();

		codeElementForRelations.setName("codeElement Instance");

		moduleForRelations.getCodeElement().add(codeElementForRelations);

		//Andre - tipos de relacao de action:
		Calls relation = ActionFactory.eINSTANCE.createCalls();
		lisfOfRelationshipsToAdd.add(relation);												
		actionElementForRelations.getActionRelation().add(relation);

		UsesType relation2 = ActionFactory.eINSTANCE.createUsesType();
		lisfOfRelationshipsToAdd.add(relation2);
		actionElementForRelations.getActionRelation().add(relation2);

		Creates relation3 = ActionFactory.eINSTANCE.createCreates();
		lisfOfRelationshipsToAdd.add(relation3);
		actionElementForRelations.getActionRelation().add(relation3);

		//Andre - Tipos de relação de code:
		Extends relation4 = CodeFactory.eINSTANCE.createExtends();
		lisfOfRelationshipsToAdd.add(relation4);
		codeElementForRelations.getCodeRelation().add(relation4);

		Implements relation5 = CodeFactory.eINSTANCE.createImplements();
		lisfOfRelationshipsToAdd.add(relation5);
		codeElementForRelations.getCodeRelation().add(relation5);

		HasValue relation6 = CodeFactory.eINSTANCE.createHasValue();
		lisfOfRelationshipsToAdd.add(relation6);
		codeElementForRelations.getCodeRelation().add(relation6);
		
		Imports relation7 = CodeFactory.eINSTANCE.createImports();
		lisfOfRelationshipsToAdd.add(relation7);
		codeElementForRelations.getCodeRelation().add(relation7);

		return lisfOfRelationshipsToAdd;
	}
	
	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	public static List<KDMRelationship> createAccessRelations(Segment kdmSegment, String moduleName) {
		List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
		
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		RestrictionsGenerator.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relacoes de action
		ActionElement actionElementForRelations = ActionFactory.eINSTANCE.createActionElement();

		actionElementForRelations.setName("actionElement Instance");

		moduleForRelations.getCodeElement().add(actionElementForRelations);

		Calls relation = ActionFactory.eINSTANCE.createCalls();
		lisfOfRelationshipsToAdd.add(relation);												
		actionElementForRelations.getActionRelation().add(relation);

		return lisfOfRelationshipsToAdd;
	}
	
	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	public static List<KDMRelationship> createDeclareRelations(Segment kdmSegment, String moduleName) {
		List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
		
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		RestrictionsGenerator.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relacoes de action
		ActionElement actionElementForRelations = ActionFactory.eINSTANCE.createActionElement();

		actionElementForRelations.setName("actionElement Instance");

		moduleForRelations.getCodeElement().add(actionElementForRelations);

		UsesType relation2 = ActionFactory.eINSTANCE.createUsesType();
		lisfOfRelationshipsToAdd.add(relation2);
		actionElementForRelations.getActionRelation().add(relation2);

		return lisfOfRelationshipsToAdd;
	}
	
	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	public static List<KDMRelationship> createCreateRelations(Segment kdmSegment, String moduleName) {
		List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
		
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		RestrictionsGenerator.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relacoes de action
		ActionElement actionElementForRelations = ActionFactory.eINSTANCE.createActionElement();

		actionElementForRelations.setName("actionElement Instance");

		moduleForRelations.getCodeElement().add(actionElementForRelations);

		Creates relation3 = ActionFactory.eINSTANCE.createCreates();
		lisfOfRelationshipsToAdd.add(relation3);
		actionElementForRelations.getActionRelation().add(relation3);

		return lisfOfRelationshipsToAdd;
	}
	
	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	public static List<KDMRelationship> createHandleRelations(Segment kdmSegment, String moduleName) {
		List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
		
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		RestrictionsGenerator.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relacoes de action
		ActionElement actionElementForRelations = ActionFactory.eINSTANCE.createActionElement();

		actionElementForRelations.setName("actionElement Instance");

		moduleForRelations.getCodeElement().add(actionElementForRelations);

		//Andre - tipos de relacao de action:
		Calls relation = ActionFactory.eINSTANCE.createCalls();
		lisfOfRelationshipsToAdd.add(relation);												
		actionElementForRelations.getActionRelation().add(relation);

		UsesType relation2 = ActionFactory.eINSTANCE.createUsesType();
		lisfOfRelationshipsToAdd.add(relation2);
		actionElementForRelations.getActionRelation().add(relation2);

		return lisfOfRelationshipsToAdd;
	}
	
	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	public static List<KDMRelationship> createExtendsRelations(Segment kdmSegment, String moduleName) {
		List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
		
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		RestrictionsGenerator.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relações de código
		CodeElement codeElementForRelations = CodeFactory.eINSTANCE.createCodeElement();

		codeElementForRelations.setName("codeElement Instance");

		moduleForRelations.getCodeElement().add(codeElementForRelations);

		Extends relation4 = CodeFactory.eINSTANCE.createExtends();
		lisfOfRelationshipsToAdd.add(relation4);
		codeElementForRelations.getCodeRelation().add(relation4);


		return lisfOfRelationshipsToAdd;
	}
	
	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	public static List<KDMRelationship> createImplementRelations(Segment kdmSegment, String moduleName) {
		List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
		
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		RestrictionsGenerator.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relações de código
		CodeElement codeElementForRelations = CodeFactory.eINSTANCE.createCodeElement();

		codeElementForRelations.setName("codeElement Instance");

		moduleForRelations.getCodeElement().add(codeElementForRelations);

		Implements relation5 = CodeFactory.eINSTANCE.createImplements();
		lisfOfRelationshipsToAdd.add(relation5);
		codeElementForRelations.getCodeRelation().add(relation5);

		return lisfOfRelationshipsToAdd;
	}

	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	public static List<KDMRelationship> createDeriveRelations(Segment kdmSegment, String moduleName) {
		List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
		
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		RestrictionsGenerator.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relações de código
		CodeElement codeElementForRelations = CodeFactory.eINSTANCE.createCodeElement();

		codeElementForRelations.setName("codeElement Instance");

		moduleForRelations.getCodeElement().add(codeElementForRelations);

		Extends relation4 = CodeFactory.eINSTANCE.createExtends();
		lisfOfRelationshipsToAdd.add(relation4);
		codeElementForRelations.getCodeRelation().add(relation4);

		Implements relation5 = CodeFactory.eINSTANCE.createImplements();
		lisfOfRelationshipsToAdd.add(relation5);
		codeElementForRelations.getCodeRelation().add(relation5);

		return lisfOfRelationshipsToAdd;
	}
	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	public static List<KDMRelationship> createThrowRelations(Segment kdmSegment, String moduleName) {
		List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
		
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		RestrictionsGenerator.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relacoes de action
		ActionElement actionElementForRelations = ActionFactory.eINSTANCE.createActionElement();

		actionElementForRelations.setName("actionElement Instance");

		moduleForRelations.getCodeElement().add(actionElementForRelations);

		//Andre - tipos de relacao de action:
		Calls relation = ActionFactory.eINSTANCE.createCalls();
		lisfOfRelationshipsToAdd.add(relation);												
		actionElementForRelations.getActionRelation().add(relation);

		return lisfOfRelationshipsToAdd;
	}
	
	/**
	 * @author Landi
	 * @param moduleName
	 * @return
	 */
	public static List<KDMRelationship> createAnnotatedRelations(Segment kdmSegment, String moduleName) {
		List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
		
		Module moduleForRelations = CodeFactory.eINSTANCE.createModule();

		moduleForRelations.setName(moduleName);

		RestrictionsGenerator.getCodeModelFromKDM(kdmSegment, RestrictionsGenerator.CODE_NAME).getCodeElement().add(moduleForRelations);

		//Andre - cria o eContainer das relações de código
		CodeElement codeElementForRelations = CodeFactory.eINSTANCE.createCodeElement();

		codeElementForRelations.setName("codeElement Instance");

		moduleForRelations.getCodeElement().add(codeElementForRelations);

		HasValue relation6 = CodeFactory.eINSTANCE.createHasValue();
		lisfOfRelationshipsToAdd.add(relation6);
		codeElementForRelations.getCodeRelation().add(relation6);
		
		return lisfOfRelationshipsToAdd;
	}
	
}
