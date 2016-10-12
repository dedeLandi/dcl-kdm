package com.br.terra.dcl.serializer;

import com.br.terra.dcl.dCL.BasicType;
import com.br.terra.dcl.dCL.Can;
import com.br.terra.dcl.dCL.Cannot;
import com.br.terra.dcl.dCL.DCDecl;
import com.br.terra.dcl.dCL.DCLComponent;
import com.br.terra.dcl.dCL.DCLComponentInterface;
import com.br.terra.dcl.dCL.DCLLayer;
import com.br.terra.dcl.dCL.DCLModule;
import com.br.terra.dcl.dCL.DCLPackage;
import com.br.terra.dcl.dCL.DCLSubSystem;
import com.br.terra.dcl.dCL.EntityType;
import com.br.terra.dcl.dCL.InterfaceType;
import com.br.terra.dcl.dCL.Model;
import com.br.terra.dcl.dCL.Must;
import com.br.terra.dcl.dCL.Only;
import com.br.terra.dcl.dCL.Only2;
import com.br.terra.dcl.services.DCLGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DCLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DCLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DCLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DCLPackage.BASIC_TYPE:
				if(context == grammarAccess.getBasicTypeRule() ||
				   context == grammarAccess.getElementTypeRule()) {
					sequence_BasicType(context, (BasicType) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.CAN:
				if(context == grammarAccess.getCanRule()) {
					sequence_Can(context, (Can) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.CANNOT:
				if(context == grammarAccess.getCannotRule()) {
					sequence_Cannot(context, (Cannot) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.DC_DECL:
				if(context == grammarAccess.getDCDeclRule()) {
					sequence_DCDecl(context, (DCDecl) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.DCL_COMPONENT:
				if(context == grammarAccess.getDCLComponentRule() ||
				   context == grammarAccess.getDCLStructureElementRule()) {
					sequence_DCLComponent(context, (DCLComponent) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.DCL_COMPONENT_INTERFACE:
				if(context == grammarAccess.getDCLComponentInterfaceRule() ||
				   context == grammarAccess.getDCLStructureElementRule()) {
					sequence_DCLComponentInterface(context, (DCLComponentInterface) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.DCL_LAYER:
				if(context == grammarAccess.getDCLLayerRule() ||
				   context == grammarAccess.getDCLStructureElementRule()) {
					sequence_DCLLayer(context, (DCLLayer) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.DCL_MODULE:
				if(context == grammarAccess.getDCLModuleRule() ||
				   context == grammarAccess.getDCLStructureElementRule()) {
					sequence_DCLModule(context, (DCLModule) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.DCL_SUB_SYSTEM:
				if(context == grammarAccess.getDCLStructureElementRule() ||
				   context == grammarAccess.getDCLSubSystemRule()) {
					sequence_DCLSubSystem(context, (DCLSubSystem) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.ENTITY_TYPE:
				if(context == grammarAccess.getElementTypeRule() ||
				   context == grammarAccess.getEntityTypeRule()) {
					sequence_EntityType(context, (EntityType) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.INTERFACE_TYPE:
				if(context == grammarAccess.getInterfaceTypeRule()) {
					sequence_InterfaceType(context, (InterfaceType) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.MUST:
				if(context == grammarAccess.getMustRule()) {
					sequence_Must(context, (Must) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.ONLY:
				if(context == grammarAccess.getOnlyRule()) {
					sequence_Only(context, (Only) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.ONLY2:
				if(context == grammarAccess.getOnly2Rule()) {
					sequence_Only2(context, (Only2) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (typeName='access' | typeName='declare' | typeName='handle' | typeName='create' | typeName='depend')
	 */
	protected void sequence_BasicType(EObject context, BasicType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     can='can-'
	 */
	protected void sequence_Can(EObject context, Can semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DCLPackage.Literals.CAN__CAN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DCLPackage.Literals.CAN__CAN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCanAccess().getCanCanKeyword_0(), semanticObject.getCan());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     cannot='cannot-'
	 */
	protected void sequence_Cannot(EObject context, Cannot semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DCLPackage.Literals.CANNOT__CANNOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DCLPackage.Literals.CANNOT__CANNOT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCannotAccess().getCannotCannotKeyword_0(), semanticObject.getCannot());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (only=Only t=[DCLStructureElement|ID] can=Can elementType=ElementType type=[DCLStructureElement|ID]) | 
	 *         (t=[DCLStructureElement|ID] cannot=Cannot elementType=ElementType type=[DCLStructureElement|ID]) | 
	 *         (t=[DCLStructureElement|ID] can=Can elementType=ElementType only2=Only2 type=[DCLStructureElement|ID]) | 
	 *         (t=[DCLStructureElement|ID] must=Must entityType=EntityType type=[DCLStructureElement|ID])
	 *     )
	 */
	protected void sequence_DCDecl(EObject context, DCDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID component=[DCLStructureElement|ID] interfaceType=InterfaceType)
	 */
	protected void sequence_DCLComponentInterface(EObject context, DCLComponentInterface semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DCLPackage.Literals.DCL_STRUCTURE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DCLPackage.Literals.DCL_STRUCTURE_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, DCLPackage.Literals.DCL_COMPONENT_INTERFACE__COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DCLPackage.Literals.DCL_COMPONENT_INTERFACE__COMPONENT));
			if(transientValues.isValueTransient(semanticObject, DCLPackage.Literals.DCL_COMPONENT_INTERFACE__INTERFACE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DCLPackage.Literals.DCL_COMPONENT_INTERFACE__INTERFACE_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDCLComponentInterfaceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDCLComponentInterfaceAccess().getComponentDCLStructureElementIDTerminalRuleCall_3_0_1(), semanticObject.getComponent());
		feeder.accept(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeInterfaceTypeParserRuleCall_4_2_0(), semanticObject.getInterfaceType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (layer=[DCLStructureElement|ID] | subSystem=[DCLStructureElement|ID])?)
	 */
	protected void sequence_DCLComponent(EObject context, DCLComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID level=INT (layer=[DCLStructureElement|ID] | subSystem=[DCLStructureElement|ID] | component=[DCLStructureElement|ID])?)
	 */
	protected void sequence_DCLLayer(EObject context, DCLLayer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DCLModule(EObject context, DCLModule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DCLPackage.Literals.DCL_STRUCTURE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DCLPackage.Literals.DCL_STRUCTURE_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDCLModuleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID subSystem=[DCLStructureElement|ID]?)
	 */
	protected void sequence_DCLSubSystem(EObject context, DCLSubSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (entity='extend' | entity='implement' | entity='derive' | entity='throw' | entity='useannotation')
	 */
	protected void sequence_EntityType(EObject context, EntityType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (interfaceTypeName='provided' | interfaceTypeName='required')
	 */
	protected void sequence_InterfaceType(EObject context, InterfaceType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (structureElements+=DCLStructureElement+ dCDecl+=DCDecl*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     must='must-'
	 */
	protected void sequence_Must(EObject context, Must semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DCLPackage.Literals.MUST__MUST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DCLPackage.Literals.MUST__MUST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMustAccess().getMustMustKeyword_0(), semanticObject.getMust());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     only2='-only'
	 */
	protected void sequence_Only2(EObject context, Only2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DCLPackage.Literals.ONLY2__ONLY2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DCLPackage.Literals.ONLY2__ONLY2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0(), semanticObject.getOnly2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     only='only'
	 */
	protected void sequence_Only(EObject context, Only semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DCLPackage.Literals.ONLY__ONLY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DCLPackage.Literals.ONLY__ONLY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0(), semanticObject.getOnly());
		feeder.finish();
	}
}
