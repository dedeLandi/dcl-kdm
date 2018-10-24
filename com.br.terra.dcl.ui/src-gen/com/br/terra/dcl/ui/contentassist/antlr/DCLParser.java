/*
 * generated by Xtext
 */
package com.br.terra.dcl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.br.terra.dcl.services.DCLGrammarAccess;

public class DCLParser extends AbstractContentAssistParser {
	
	@Inject
	private DCLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.br.terra.dcl.ui.contentassist.antlr.internal.InternalDCLParser createParser() {
		com.br.terra.dcl.ui.contentassist.antlr.internal.InternalDCLParser result = new com.br.terra.dcl.ui.contentassist.antlr.internal.InternalDCLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDCLStructureElementAccess().getAlternatives(), "rule__DCLStructureElement__Alternatives");
					put(grammarAccess.getDCLReferencesAccess().getAlternatives_2(), "rule__DCLReferences__Alternatives_2");
					put(grammarAccess.getDCLLayerAccess().getAlternatives_5(), "rule__DCLLayer__Alternatives_5");
					put(grammarAccess.getDCLComponentAccess().getAlternatives_2(), "rule__DCLComponent__Alternatives_2");
					put(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameAlternatives_0(), "rule__InterfaceType__InterfaceTypeNameAlternatives_0");
					put(grammarAccess.getDCDeclAccess().getAlternatives(), "rule__DCDecl__Alternatives");
					put(grammarAccess.getElementTypeAccess().getAlternatives(), "rule__ElementType__Alternatives");
					put(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0(), "rule__BasicType__TypeNameAlternatives_0");
					put(grammarAccess.getEntityTypeAccess().getEntityAlternatives_0(), "rule__EntityType__EntityAlternatives_0");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getDCLManagedSubsystemAccess().getGroup(), "rule__DCLManagedSubsystem__Group__0");
					put(grammarAccess.getDCLManagedSubsystemAccess().getGroup_2(), "rule__DCLManagedSubsystem__Group_2__0");
					put(grammarAccess.getDCLManagingSubsystemAccess().getGroup(), "rule__DCLManagingSubsystem__Group__0");
					put(grammarAccess.getDCLManagingSubsystemAccess().getGroup_2(), "rule__DCLManagingSubsystem__Group_2__0");
					put(grammarAccess.getDCLMonitorAccess().getGroup(), "rule__DCLMonitor__Group__0");
					put(grammarAccess.getDCLMonitorAccess().getGroup_2(), "rule__DCLMonitor__Group_2__0");
					put(grammarAccess.getDCLPlannerAccess().getGroup(), "rule__DCLPlanner__Group__0");
					put(grammarAccess.getDCLPlannerAccess().getGroup_2(), "rule__DCLPlanner__Group_2__0");
					put(grammarAccess.getDCLAnalyzerAccess().getGroup(), "rule__DCLAnalyzer__Group__0");
					put(grammarAccess.getDCLAnalyzerAccess().getGroup_2(), "rule__DCLAnalyzer__Group_2__0");
					put(grammarAccess.getDCLExecutorAccess().getGroup(), "rule__DCLExecutor__Group__0");
					put(grammarAccess.getDCLExecutorAccess().getGroup_2(), "rule__DCLExecutor__Group_2__0");
					put(grammarAccess.getDCLSensorAccess().getGroup(), "rule__DCLSensor__Group__0");
					put(grammarAccess.getDCLSensorAccess().getGroup_2(), "rule__DCLSensor__Group_2__0");
					put(grammarAccess.getDCLActuatorAccess().getGroup(), "rule__DCLActuator__Group__0");
					put(grammarAccess.getDCLActuatorAccess().getGroup_2(), "rule__DCLActuator__Group_2__0");
					put(grammarAccess.getDCLKnowledgeAccess().getGroup(), "rule__DCLKnowledge__Group__0");
					put(grammarAccess.getDCLKnowledgeAccess().getGroup_2(), "rule__DCLKnowledge__Group_2__0");
					put(grammarAccess.getDCLReferencesAccess().getGroup(), "rule__DCLReferences__Group__0");
					put(grammarAccess.getDCLReferencesAccess().getGroup_2_0(), "rule__DCLReferences__Group_2_0__0");
					put(grammarAccess.getDCLReferencesAccess().getGroup_2_1(), "rule__DCLReferences__Group_2_1__0");
					put(grammarAccess.getDCLLayerAccess().getGroup(), "rule__DCLLayer__Group__0");
					put(grammarAccess.getDCLLayerAccess().getGroup_5_0(), "rule__DCLLayer__Group_5_0__0");
					put(grammarAccess.getDCLLayerAccess().getGroup_5_1(), "rule__DCLLayer__Group_5_1__0");
					put(grammarAccess.getDCLLayerAccess().getGroup_5_2(), "rule__DCLLayer__Group_5_2__0");
					put(grammarAccess.getDCLComponentAccess().getGroup(), "rule__DCLComponent__Group__0");
					put(grammarAccess.getDCLComponentAccess().getGroup_2_0(), "rule__DCLComponent__Group_2_0__0");
					put(grammarAccess.getDCLComponentAccess().getGroup_2_1(), "rule__DCLComponent__Group_2_1__0");
					put(grammarAccess.getDCLComponentInterfaceAccess().getGroup(), "rule__DCLComponentInterface__Group__0");
					put(grammarAccess.getDCLComponentInterfaceAccess().getGroup_4(), "rule__DCLComponentInterface__Group_4__0");
					put(grammarAccess.getDCLSubSystemAccess().getGroup(), "rule__DCLSubSystem__Group__0");
					put(grammarAccess.getDCLSubSystemAccess().getGroup_2(), "rule__DCLSubSystem__Group_2__0");
					put(grammarAccess.getDCLModuleAccess().getGroup(), "rule__DCLModule__Group__0");
					put(grammarAccess.getDCDeclAccess().getGroup_0(), "rule__DCDecl__Group_0__0");
					put(grammarAccess.getDCDeclAccess().getGroup_1(), "rule__DCDecl__Group_1__0");
					put(grammarAccess.getDCDeclAccess().getGroup_2(), "rule__DCDecl__Group_2__0");
					put(grammarAccess.getDCDeclAccess().getGroup_3(), "rule__DCDecl__Group_3__0");
					put(grammarAccess.getDCDeclAccess().getGroup_4(), "rule__DCDecl__Group_4__0");
					put(grammarAccess.getModelAccess().getStructureElementsAssignment_2(), "rule__Model__StructureElementsAssignment_2");
					put(grammarAccess.getModelAccess().getDCDeclAssignment_6(), "rule__Model__DCDeclAssignment_6");
					put(grammarAccess.getDCLManagedSubsystemAccess().getNameAssignment_1(), "rule__DCLManagedSubsystem__NameAssignment_1");
					put(grammarAccess.getDCLManagedSubsystemAccess().getManagedSubsystemAssignment_2_2(), "rule__DCLManagedSubsystem__ManagedSubsystemAssignment_2_2");
					put(grammarAccess.getDCLManagingSubsystemAccess().getNameAssignment_1(), "rule__DCLManagingSubsystem__NameAssignment_1");
					put(grammarAccess.getDCLManagingSubsystemAccess().getManagingSubsystemAssignment_2_2(), "rule__DCLManagingSubsystem__ManagingSubsystemAssignment_2_2");
					put(grammarAccess.getDCLMonitorAccess().getNameAssignment_1(), "rule__DCLMonitor__NameAssignment_1");
					put(grammarAccess.getDCLMonitorAccess().getManagingSubsystemAssignment_2_2(), "rule__DCLMonitor__ManagingSubsystemAssignment_2_2");
					put(grammarAccess.getDCLPlannerAccess().getNameAssignment_1(), "rule__DCLPlanner__NameAssignment_1");
					put(grammarAccess.getDCLPlannerAccess().getManagingSubsystemAssignment_2_2(), "rule__DCLPlanner__ManagingSubsystemAssignment_2_2");
					put(grammarAccess.getDCLAnalyzerAccess().getNameAssignment_1(), "rule__DCLAnalyzer__NameAssignment_1");
					put(grammarAccess.getDCLAnalyzerAccess().getManagingSubsystemAssignment_2_2(), "rule__DCLAnalyzer__ManagingSubsystemAssignment_2_2");
					put(grammarAccess.getDCLExecutorAccess().getNameAssignment_1(), "rule__DCLExecutor__NameAssignment_1");
					put(grammarAccess.getDCLExecutorAccess().getManagingSubsystemAssignment_2_2(), "rule__DCLExecutor__ManagingSubsystemAssignment_2_2");
					put(grammarAccess.getDCLSensorAccess().getNameAssignment_1(), "rule__DCLSensor__NameAssignment_1");
					put(grammarAccess.getDCLSensorAccess().getManagingSubsystemAssignment_2_2(), "rule__DCLSensor__ManagingSubsystemAssignment_2_2");
					put(grammarAccess.getDCLActuatorAccess().getNameAssignment_1(), "rule__DCLActuator__NameAssignment_1");
					put(grammarAccess.getDCLActuatorAccess().getManagingSubsystemAssignment_2_2(), "rule__DCLActuator__ManagingSubsystemAssignment_2_2");
					put(grammarAccess.getDCLKnowledgeAccess().getNameAssignment_1(), "rule__DCLKnowledge__NameAssignment_1");
					put(grammarAccess.getDCLKnowledgeAccess().getManagingSubsystemAssignment_2_2(), "rule__DCLKnowledge__ManagingSubsystemAssignment_2_2");
					put(grammarAccess.getDCLReferencesAccess().getNameAssignment_1(), "rule__DCLReferences__NameAssignment_1");
					put(grammarAccess.getDCLReferencesAccess().getManagingSubsystemAssignment_2_0_2(), "rule__DCLReferences__ManagingSubsystemAssignment_2_0_2");
					put(grammarAccess.getDCLReferencesAccess().getKnowledgeAssignment_2_1_2(), "rule__DCLReferences__KnowledgeAssignment_2_1_2");
					put(grammarAccess.getDCLLayerAccess().getNameAssignment_1(), "rule__DCLLayer__NameAssignment_1");
					put(grammarAccess.getDCLLayerAccess().getLevelAssignment_4(), "rule__DCLLayer__LevelAssignment_4");
					put(grammarAccess.getDCLLayerAccess().getLayerAssignment_5_0_2(), "rule__DCLLayer__LayerAssignment_5_0_2");
					put(grammarAccess.getDCLLayerAccess().getSubSystemAssignment_5_1_2(), "rule__DCLLayer__SubSystemAssignment_5_1_2");
					put(grammarAccess.getDCLLayerAccess().getComponentAssignment_5_2_2(), "rule__DCLLayer__ComponentAssignment_5_2_2");
					put(grammarAccess.getDCLComponentAccess().getNameAssignment_1(), "rule__DCLComponent__NameAssignment_1");
					put(grammarAccess.getDCLComponentAccess().getLayerAssignment_2_0_2(), "rule__DCLComponent__LayerAssignment_2_0_2");
					put(grammarAccess.getDCLComponentAccess().getSubSystemAssignment_2_1_2(), "rule__DCLComponent__SubSystemAssignment_2_1_2");
					put(grammarAccess.getDCLComponentInterfaceAccess().getNameAssignment_1(), "rule__DCLComponentInterface__NameAssignment_1");
					put(grammarAccess.getDCLComponentInterfaceAccess().getComponentAssignment_3(), "rule__DCLComponentInterface__ComponentAssignment_3");
					put(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeAssignment_4_2(), "rule__DCLComponentInterface__InterfaceTypeAssignment_4_2");
					put(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameAssignment(), "rule__InterfaceType__InterfaceTypeNameAssignment");
					put(grammarAccess.getDCLSubSystemAccess().getNameAssignment_1(), "rule__DCLSubSystem__NameAssignment_1");
					put(grammarAccess.getDCLSubSystemAccess().getSubSystemAssignment_2_2(), "rule__DCLSubSystem__SubSystemAssignment_2_2");
					put(grammarAccess.getDCLModuleAccess().getNameAssignment_1(), "rule__DCLModule__NameAssignment_1");
					put(grammarAccess.getDCDeclAccess().getOnlyAssignment_0_0(), "rule__DCDecl__OnlyAssignment_0_0");
					put(grammarAccess.getDCDeclAccess().getTAssignment_0_1(), "rule__DCDecl__TAssignment_0_1");
					put(grammarAccess.getDCDeclAccess().getCanAssignment_0_2(), "rule__DCDecl__CanAssignment_0_2");
					put(grammarAccess.getDCDeclAccess().getElementTypeAssignment_0_3(), "rule__DCDecl__ElementTypeAssignment_0_3");
					put(grammarAccess.getDCDeclAccess().getTypeAssignment_0_4(), "rule__DCDecl__TypeAssignment_0_4");
					put(grammarAccess.getDCDeclAccess().getTAssignment_1_0(), "rule__DCDecl__TAssignment_1_0");
					put(grammarAccess.getDCDeclAccess().getCannotAssignment_1_1(), "rule__DCDecl__CannotAssignment_1_1");
					put(grammarAccess.getDCDeclAccess().getElementTypeAssignment_1_2(), "rule__DCDecl__ElementTypeAssignment_1_2");
					put(grammarAccess.getDCDeclAccess().getTypeAssignment_1_3(), "rule__DCDecl__TypeAssignment_1_3");
					put(grammarAccess.getDCDeclAccess().getTAssignment_2_0(), "rule__DCDecl__TAssignment_2_0");
					put(grammarAccess.getDCDeclAccess().getCanAssignment_2_1(), "rule__DCDecl__CanAssignment_2_1");
					put(grammarAccess.getDCDeclAccess().getElementTypeAssignment_2_2(), "rule__DCDecl__ElementTypeAssignment_2_2");
					put(grammarAccess.getDCDeclAccess().getTypeAssignment_2_3(), "rule__DCDecl__TypeAssignment_2_3");
					put(grammarAccess.getDCDeclAccess().getTAssignment_3_0(), "rule__DCDecl__TAssignment_3_0");
					put(grammarAccess.getDCDeclAccess().getCanAssignment_3_1(), "rule__DCDecl__CanAssignment_3_1");
					put(grammarAccess.getDCDeclAccess().getElementTypeAssignment_3_2(), "rule__DCDecl__ElementTypeAssignment_3_2");
					put(grammarAccess.getDCDeclAccess().getOnly2Assignment_3_3(), "rule__DCDecl__Only2Assignment_3_3");
					put(grammarAccess.getDCDeclAccess().getTypeAssignment_3_4(), "rule__DCDecl__TypeAssignment_3_4");
					put(grammarAccess.getDCDeclAccess().getTAssignment_4_0(), "rule__DCDecl__TAssignment_4_0");
					put(grammarAccess.getDCDeclAccess().getMustAssignment_4_1(), "rule__DCDecl__MustAssignment_4_1");
					put(grammarAccess.getDCDeclAccess().getEntityTypeAssignment_4_2(), "rule__DCDecl__EntityTypeAssignment_4_2");
					put(grammarAccess.getDCDeclAccess().getTypeAssignment_4_3(), "rule__DCDecl__TypeAssignment_4_3");
					put(grammarAccess.getOnlyAccess().getOnlyAssignment(), "rule__Only__OnlyAssignment");
					put(grammarAccess.getCanAccess().getCanAssignment(), "rule__Can__CanAssignment");
					put(grammarAccess.getCannotAccess().getCannotAssignment(), "rule__Cannot__CannotAssignment");
					put(grammarAccess.getOnly2Access().getOnly2Assignment(), "rule__Only2__Only2Assignment");
					put(grammarAccess.getMustAccess().getMustAssignment(), "rule__Must__MustAssignment");
					put(grammarAccess.getBasicTypeAccess().getTypeNameAssignment(), "rule__BasicType__TypeNameAssignment");
					put(grammarAccess.getEntityTypeAccess().getEntityAssignment(), "rule__EntityType__EntityAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.br.terra.dcl.ui.contentassist.antlr.internal.InternalDCLParser typedParser = (com.br.terra.dcl.ui.contentassist.antlr.internal.InternalDCLParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DCLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DCLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
