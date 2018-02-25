package com.br.terra.dcl.kdmGeneration.generators.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.gmt.modisco.omg.kdm.action.ActionElement;
import org.eclipse.gmt.modisco.omg.kdm.action.ActionFactory;
import org.eclipse.gmt.modisco.omg.kdm.action.Calls;
import org.eclipse.gmt.modisco.omg.kdm.action.Creates;
import org.eclipse.gmt.modisco.omg.kdm.action.UsesType;
import org.eclipse.gmt.modisco.omg.kdm.action.Writes;
import org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeElement;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeFactory;
import org.eclipse.gmt.modisco.omg.kdm.code.Extends;
import org.eclipse.gmt.modisco.omg.kdm.code.HasType;
import org.eclipse.gmt.modisco.omg.kdm.code.HasValue;
import org.eclipse.gmt.modisco.omg.kdm.code.Implements;
import org.eclipse.gmt.modisco.omg.kdm.code.Imports;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMRelationship;

import com.br.terra.dcl.kdmGeneration.generators.interfaces.IRelationshipGeneratorTypes;

/**
 * @author Landi
 *
 */
public enum RelationshipGeneratorTypes implements IRelationshipGeneratorTypes<KDMRelationship, AbstractCodeElement> {

	ACCESS(1, "access") {

		@Override
		public List<KDMRelationship> getRelationships(AbstractCodeElement... elementToAdd) {
			List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
			ActionElement actionElementForRelations = null;

			for (AbstractCodeElement abstractCodeElement : elementToAdd) {
				if (abstractCodeElement instanceof ActionElement) {
					actionElementForRelations = (ActionElement) abstractCodeElement;
				}
			}

			Calls relation = ActionFactory.eINSTANCE.createCalls();
			lisfOfRelationshipsToAdd.add(relation);
			actionElementForRelations.getActionRelation().add(relation);

			return lisfOfRelationshipsToAdd;
		}

		@Override
		public List<Class<?>> getRelationshipsClass() {
			List<Class<?>> relationshipClasses = new ArrayList<Class<?>>();
			relationshipClasses.add(Calls.class);
			return relationshipClasses;
		}

		@Override
		public List<String> getRelationshipsNames() {
			List<String> relationshipNames = new ArrayList<String>();
			relationshipNames.add("Calls");
			return relationshipNames;
		}

	},
	CREATE(2, "create") {

		@Override
		public List<KDMRelationship> getRelationships(AbstractCodeElement... elementToAdd) {
			List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
			ActionElement actionElementForRelations = null;

			for (AbstractCodeElement abstractCodeElement : elementToAdd) {
				if (abstractCodeElement instanceof ActionElement) {
					actionElementForRelations = (ActionElement) abstractCodeElement;
				}
			}

			Creates relation3 = ActionFactory.eINSTANCE.createCreates();
			lisfOfRelationshipsToAdd.add(relation3);
			actionElementForRelations.getActionRelation().add(relation3);

			return lisfOfRelationshipsToAdd;
		}

		@Override
		public List<Class<?>> getRelationshipsClass() {
			List<Class<?>> relationshipClasses = new ArrayList<Class<?>>();
			relationshipClasses.add(Creates.class);
			return relationshipClasses;
		}

		@Override
		public List<String> getRelationshipsNames() {
			List<String> relationshipNames = new ArrayList<String>();
			relationshipNames.add("Creates");
			return relationshipNames;
		}

	},
	DECLARE(3, "declare") {

		@Override
		public List<KDMRelationship> getRelationships(AbstractCodeElement... elementToAdd) {
			List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
			ActionElement actionElementForRelations = null;

			for (AbstractCodeElement abstractCodeElement : elementToAdd) {
				if (abstractCodeElement instanceof ActionElement) {
					actionElementForRelations = (ActionElement) abstractCodeElement;
				}
			}

			UsesType relation2 = ActionFactory.eINSTANCE.createUsesType();
			lisfOfRelationshipsToAdd.add(relation2);
			actionElementForRelations.getActionRelation().add(relation2);

			return lisfOfRelationshipsToAdd;
		}

		@Override
		public List<Class<?>> getRelationshipsClass() {
			List<Class<?>> relationshipClasses = new ArrayList<Class<?>>();
			relationshipClasses.add(UsesType.class);
			return relationshipClasses;
		}

		@Override
		public List<String> getRelationshipsNames() {
			List<String> relationshipNames = new ArrayList<String>();
			relationshipNames.add("UsesType");
			return relationshipNames;
		}

	},
	DEPEND(4, "depend") {

		@Override
		public List<KDMRelationship> getRelationships(AbstractCodeElement... elementToAdd) {

			List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
			ActionElement actionElementForRelations = null;
			CodeElement codeElementForRelations = null;

			for (AbstractCodeElement abstractCodeElement : elementToAdd) {
				if (abstractCodeElement instanceof CodeElement) {
					codeElementForRelations = (CodeElement) abstractCodeElement;
				} else if (abstractCodeElement instanceof ActionElement) {
					actionElementForRelations = (ActionElement) abstractCodeElement;
				}
			}

			// Andre - tipos de relacao de action:
			Calls relation = ActionFactory.eINSTANCE.createCalls();
			lisfOfRelationshipsToAdd.add(relation);
			actionElementForRelations.getActionRelation().add(relation);

			UsesType relation2 = ActionFactory.eINSTANCE.createUsesType();
			lisfOfRelationshipsToAdd.add(relation2);
			actionElementForRelations.getActionRelation().add(relation2);

			Creates relation3 = ActionFactory.eINSTANCE.createCreates();
			lisfOfRelationshipsToAdd.add(relation3);
			actionElementForRelations.getActionRelation().add(relation3);

			Writes relation3_1 = ActionFactory.eINSTANCE.createWrites();
			lisfOfRelationshipsToAdd.add(relation3_1);
			actionElementForRelations.getActionRelation().add(relation3_1);

			// Andre - Tipos de relação de code:
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

			HasType relation8 = CodeFactory.eINSTANCE.createHasType();
			lisfOfRelationshipsToAdd.add(relation8);
			codeElementForRelations.getCodeRelation().add(relation8);

			return lisfOfRelationshipsToAdd;
		}

		@Override
		public List<Class<?>> getRelationshipsClass() {
			List<Class<?>> relationshipClasses = new ArrayList<Class<?>>();
			relationshipClasses.add(Calls.class);
			relationshipClasses.add(UsesType.class);
			relationshipClasses.add(Creates.class);
			relationshipClasses.add(Writes.class);
			relationshipClasses.add(Extends.class);
			relationshipClasses.add(Implements.class);
			relationshipClasses.add(HasValue.class);
			relationshipClasses.add(Imports.class);
			relationshipClasses.add(HasType.class);
			return relationshipClasses;
		}

		@Override
		public List<String> getRelationshipsNames() {
			List<String> relationshipNames = new ArrayList<String>();
			relationshipNames.add("Calls");
			relationshipNames.add("UsesType");
			relationshipNames.add("Creates");
			relationshipNames.add("Writes");
			relationshipNames.add("Extends");
			relationshipNames.add("Implements");
			relationshipNames.add("HasValue");
			relationshipNames.add("Imports");
			relationshipNames.add("HasType");
			return relationshipNames;
		}

	},
	DERIVE(5, "derive") {

		@Override
		public List<KDMRelationship> getRelationships(AbstractCodeElement... elementToAdd) {
			List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
			CodeElement codeElementForRelations = null;

			for (AbstractCodeElement abstractCodeElement : elementToAdd) {
				if (abstractCodeElement instanceof CodeElement) {
					codeElementForRelations = (CodeElement) abstractCodeElement;
				}
			}

			Extends relation4 = CodeFactory.eINSTANCE.createExtends();
			lisfOfRelationshipsToAdd.add(relation4);
			codeElementForRelations.getCodeRelation().add(relation4);

			Implements relation5 = CodeFactory.eINSTANCE.createImplements();
			lisfOfRelationshipsToAdd.add(relation5);
			codeElementForRelations.getCodeRelation().add(relation5);

			Imports relation7 = CodeFactory.eINSTANCE.createImports();
			lisfOfRelationshipsToAdd.add(relation7);
			codeElementForRelations.getCodeRelation().add(relation7);

			return lisfOfRelationshipsToAdd;
		}

		@Override
		public List<Class<?>> getRelationshipsClass() {
			List<Class<?>> relationshipClasses = new ArrayList<Class<?>>();
			relationshipClasses.add(Extends.class);
			relationshipClasses.add(Implements.class);
			relationshipClasses.add(Imports.class);
			return relationshipClasses;
		}

		@Override
		public List<String> getRelationshipsNames() {
			List<String> relationshipNames = new ArrayList<String>();
			relationshipNames.add("Extends");
			relationshipNames.add("Implements");
			relationshipNames.add("Imports");
			return relationshipNames;
		}

	},
	EXTEND(6, "extend") {

		@Override
		public List<KDMRelationship> getRelationships(AbstractCodeElement... elementToAdd) {
			List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
			CodeElement codeElementForRelations = null;

			for (AbstractCodeElement abstractCodeElement : elementToAdd) {
				if (abstractCodeElement instanceof CodeElement) {
					codeElementForRelations = (CodeElement) abstractCodeElement;
				}
			}

			Extends relation4 = CodeFactory.eINSTANCE.createExtends();
			lisfOfRelationshipsToAdd.add(relation4);
			codeElementForRelations.getCodeRelation().add(relation4);

			Imports relation7 = CodeFactory.eINSTANCE.createImports();
			lisfOfRelationshipsToAdd.add(relation7);
			codeElementForRelations.getCodeRelation().add(relation7);

			return lisfOfRelationshipsToAdd;
		}

		@Override
		public List<Class<?>> getRelationshipsClass() {
			List<Class<?>> relationshipClasses = new ArrayList<Class<?>>();
			relationshipClasses.add(Extends.class);
			relationshipClasses.add(Imports.class);
			return relationshipClasses;
		}

		@Override
		public List<String> getRelationshipsNames() {
			List<String> relationshipNames = new ArrayList<String>();
			relationshipNames.add("Extends");
			relationshipNames.add("Imports");
			return relationshipNames;
		}

	},
	HANDLE(7, "handle") {

		@Override
		public List<KDMRelationship> getRelationships(AbstractCodeElement... elementToAdd) {
			List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
			ActionElement actionElementForRelations = null;

			for (AbstractCodeElement abstractCodeElement : elementToAdd) {
				if (abstractCodeElement instanceof ActionElement) {
					actionElementForRelations = (ActionElement) abstractCodeElement;
				}
			}

			// Andre - tipos de relacao de action:
			Calls relation = ActionFactory.eINSTANCE.createCalls();
			lisfOfRelationshipsToAdd.add(relation);
			actionElementForRelations.getActionRelation().add(relation);

			UsesType relation2 = ActionFactory.eINSTANCE.createUsesType();
			lisfOfRelationshipsToAdd.add(relation2);
			actionElementForRelations.getActionRelation().add(relation2);

			return lisfOfRelationshipsToAdd;
		}

		@Override
		public List<Class<?>> getRelationshipsClass() {
			List<Class<?>> relationshipClasses = new ArrayList<Class<?>>();
			relationshipClasses.add(Calls.class);
			relationshipClasses.add(UsesType.class);
			return relationshipClasses;
		}

		@Override
		public List<String> getRelationshipsNames() {
			List<String> relationshipNames = new ArrayList<String>();
			relationshipNames.add("Calls");
			relationshipNames.add("UsesType");
			return relationshipNames;
		}

	},
	IMPLEMENT(8, "implement") {

		@Override
		public List<KDMRelationship> getRelationships(AbstractCodeElement... elementToAdd) {
			List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
			CodeElement codeElementForRelations = null;

			for (AbstractCodeElement abstractCodeElement : elementToAdd) {
				if (abstractCodeElement instanceof CodeElement) {
					codeElementForRelations = (CodeElement) abstractCodeElement;
				}
			}

			Implements relation5 = CodeFactory.eINSTANCE.createImplements();
			lisfOfRelationshipsToAdd.add(relation5);
			codeElementForRelations.getCodeRelation().add(relation5);

			Imports relation7 = CodeFactory.eINSTANCE.createImports();
			lisfOfRelationshipsToAdd.add(relation7);
			codeElementForRelations.getCodeRelation().add(relation7);

			return lisfOfRelationshipsToAdd;
		}

		@Override
		public List<Class<?>> getRelationshipsClass() {
			List<Class<?>> relationshipClasses = new ArrayList<Class<?>>();
			relationshipClasses.add(Implements.class);
			relationshipClasses.add(Imports.class);
			return relationshipClasses;
		}

		@Override
		public List<String> getRelationshipsNames() {
			List<String> relationshipNames = new ArrayList<String>();
			relationshipNames.add("Implements");
			relationshipNames.add("Imports");
			return relationshipNames;
		}

	},
	THROW(9, "throw") {

		@Override
		public List<KDMRelationship> getRelationships(AbstractCodeElement... elementToAdd) {
			List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
			ActionElement actionElementForRelations = null;

			for (AbstractCodeElement abstractCodeElement : elementToAdd) {
				if (abstractCodeElement instanceof ActionElement) {
					actionElementForRelations = (ActionElement) abstractCodeElement;
				}
			}

			// Andre - tipos de relacao de action:
			Calls relation = ActionFactory.eINSTANCE.createCalls();
			lisfOfRelationshipsToAdd.add(relation);
			actionElementForRelations.getActionRelation().add(relation);

			return lisfOfRelationshipsToAdd;
		}

		@Override
		public List<Class<?>> getRelationshipsClass() {
			List<Class<?>> relationshipClasses = new ArrayList<Class<?>>();
			relationshipClasses.add(Calls.class);
			return relationshipClasses;
		}

		@Override
		public List<String> getRelationshipsNames() {
			List<String> relationshipNames = new ArrayList<String>();
			relationshipNames.add("Calls");
			return relationshipNames;
		}

	},
	USEANNOTATION(10, "useannotation") {

		@Override
		public List<KDMRelationship> getRelationships(AbstractCodeElement... elementToAdd) {
			List<KDMRelationship> lisfOfRelationshipsToAdd = new ArrayList<KDMRelationship>();
			CodeElement codeElementForRelations = null;

			for (AbstractCodeElement abstractCodeElement : elementToAdd) {
				if (abstractCodeElement instanceof CodeElement) {
					codeElementForRelations = (CodeElement) abstractCodeElement;
				}
			}

			HasValue relation6 = CodeFactory.eINSTANCE.createHasValue();
			lisfOfRelationshipsToAdd.add(relation6);
			codeElementForRelations.getCodeRelation().add(relation6);

			Imports relation7 = CodeFactory.eINSTANCE.createImports();
			lisfOfRelationshipsToAdd.add(relation7);
			codeElementForRelations.getCodeRelation().add(relation7);

			return lisfOfRelationshipsToAdd;
		}

		@Override
		public List<Class<?>> getRelationshipsClass() {
			List<Class<?>> relationshipClasses = new ArrayList<Class<?>>();
			relationshipClasses.add(HasValue.class);
			relationshipClasses.add(Imports.class);
			return relationshipClasses;
		}

		@Override
		public List<String> getRelationshipsNames() {
			List<String> relationshipNames = new ArrayList<String>();
			relationshipNames.add("HasValue");
			relationshipNames.add("Imports");
			return relationshipNames;
		}

	}

	;

	private static final RelationshipGeneratorTypes[] VALUES_ARRAY = new RelationshipGeneratorTypes[] { ACCESS, CREATE,
			DECLARE, DEPEND, DERIVE, EXTEND, HANDLE, IMPLEMENT, THROW, USEANNOTATION };

	private final int value;

	private String dclText = "";

	public static final List<RelationshipGeneratorTypes> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * 
	 */
	private RelationshipGeneratorTypes(int value, String dclText) {
		this.value = value;
		this.dclText = dclText;
	}

	public static RelationshipGeneratorTypes getByDclText(String dclText) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipGeneratorTypes result = VALUES_ARRAY[i];
			if (result.getDclText().equals(dclText)) {
				return result;
			}
		}
		return null;
	}

	public int getValue() {
		return value;
	}

	/**
	 * @return the dclText
	 */
	public String getDclText() {
		return dclText;
	}

	public static RelationshipGeneratorTypes getRelationshipGeneratorTypesByDclText(String dclTextToSearch) {
		for (RelationshipGeneratorTypes relation : RelationshipGeneratorTypes.values()) {
			if (relation.getDclText().equalsIgnoreCase(dclTextToSearch)) {
				return relation;
			}
		}
		return null;
	}

}
