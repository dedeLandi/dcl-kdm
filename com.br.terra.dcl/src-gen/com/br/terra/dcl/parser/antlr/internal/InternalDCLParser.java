package com.br.terra.dcl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.br.terra.dcl.services.DCLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDCLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'architecturalElements'", "'{'", "'}'", "'restrictions'", "'managedSubsystem'", "','", "'inManagedSubsystem:'", "';'", "'managingSubsystem'", "'inManagingSubsystem:'", "'monitor'", "'planner'", "'analyzer'", "'executor'", "'sensor'", "'actuator'", "'knowledge'", "'references'", "'inKnowledge:'", "'layer'", "'level'", "'inLayer:'", "'inSubSystem:'", "'inComponent:'", "'component'", "'interface'", "'ofComponent'", "'type:'", "'provided'", "'required'", "'subSystem'", "'module'", "'only'", "'can-'", "'cannot-'", "'-only'", "'must-'", "'access'", "'declare'", "'handle'", "'create'", "'depend'", "'extend'", "'implement'", "'derive'", "'throw'", "'useannotation'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDCLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDCL.g"; }



     	private DCLGrammarAccess grammarAccess;
     	
        public InternalDCLParser(TokenStream input, DCLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DCLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // InternalDCL.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDCL.g:68:2: (iv_ruleModel= ruleModel EOF )
            // InternalDCL.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDCL.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'architecturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_structureElements_2_0 = null;

        EObject lv_dCDecl_6_0 = null;


         enterRule(); 
            
        try {
            // InternalDCL.g:79:28: ( (otherlv_0= 'architecturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' ) )
            // InternalDCL.g:80:1: (otherlv_0= 'architecturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' )
            {
            // InternalDCL.g:80:1: (otherlv_0= 'architecturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' )
            // InternalDCL.g:80:3: otherlv_0= 'architecturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getArchitecturalElementsKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalDCL.g:88:1: ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==19||(LA1_0>=21 && LA1_0<=28)||LA1_0==30||(LA1_0>=35 && LA1_0<=36)||(LA1_0>=41 && LA1_0<=42)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDCL.g:89:1: (lv_structureElements_2_0= ruleDCLStructureElement )
            	    {
            	    // InternalDCL.g:89:1: (lv_structureElements_2_0= ruleDCLStructureElement )
            	    // InternalDCL.g:90:3: lv_structureElements_2_0= ruleDCLStructureElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStructureElementsDCLStructureElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_structureElements_2_0=ruleDCLStructureElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"structureElements",
            	            		lv_structureElements_2_0, 
            	            		"com.br.terra.dcl.DCL.DCLStructureElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRestrictionsKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_7); 

                	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5());
                
            // InternalDCL.g:118:1: ( (lv_dCDecl_6_0= ruleDCDecl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==43) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDCL.g:119:1: (lv_dCDecl_6_0= ruleDCDecl )
            	    {
            	    // InternalDCL.g:119:1: (lv_dCDecl_6_0= ruleDCDecl )
            	    // InternalDCL.g:120:3: lv_dCDecl_6_0= ruleDCDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDCDeclDCDeclParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_7);
            	    lv_dCDecl_6_0=ruleDCDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dCDecl",
            	            		lv_dCDecl_6_0, 
            	            		"com.br.terra.dcl.DCL.DCDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDCLStructureElement"
    // InternalDCL.g:148:1: entryRuleDCLStructureElement returns [EObject current=null] : iv_ruleDCLStructureElement= ruleDCLStructureElement EOF ;
    public final EObject entryRuleDCLStructureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLStructureElement = null;


        try {
            // InternalDCL.g:149:2: (iv_ruleDCLStructureElement= ruleDCLStructureElement EOF )
            // InternalDCL.g:150:2: iv_ruleDCLStructureElement= ruleDCLStructureElement EOF
            {
             newCompositeNode(grammarAccess.getDCLStructureElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLStructureElement=ruleDCLStructureElement();

            state._fsp--;

             current =iv_ruleDCLStructureElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLStructureElement"


    // $ANTLR start "ruleDCLStructureElement"
    // InternalDCL.g:157:1: ruleDCLStructureElement returns [EObject current=null] : (this_DCLManagedSubsystem_0= ruleDCLManagedSubsystem | this_DCLManagingSubsystem_1= ruleDCLManagingSubsystem | this_DCLMonitor_2= ruleDCLMonitor | this_DCLPlanner_3= ruleDCLPlanner | this_DCLAnalyzer_4= ruleDCLAnalyzer | this_DCLExecutor_5= ruleDCLExecutor | this_DCLSensor_6= ruleDCLSensor | this_DCLActuator_7= ruleDCLActuator | this_DCLKnowledge_8= ruleDCLKnowledge | this_DCLReferences_9= ruleDCLReferences | this_DCLLayer_10= ruleDCLLayer | this_DCLComponent_11= ruleDCLComponent | this_DCLSubSystem_12= ruleDCLSubSystem | this_DCLModule_13= ruleDCLModule | this_DCLComponentInterface_14= ruleDCLComponentInterface ) ;
    public final EObject ruleDCLStructureElement() throws RecognitionException {
        EObject current = null;

        EObject this_DCLManagedSubsystem_0 = null;

        EObject this_DCLManagingSubsystem_1 = null;

        EObject this_DCLMonitor_2 = null;

        EObject this_DCLPlanner_3 = null;

        EObject this_DCLAnalyzer_4 = null;

        EObject this_DCLExecutor_5 = null;

        EObject this_DCLSensor_6 = null;

        EObject this_DCLActuator_7 = null;

        EObject this_DCLKnowledge_8 = null;

        EObject this_DCLReferences_9 = null;

        EObject this_DCLLayer_10 = null;

        EObject this_DCLComponent_11 = null;

        EObject this_DCLSubSystem_12 = null;

        EObject this_DCLModule_13 = null;

        EObject this_DCLComponentInterface_14 = null;


         enterRule(); 
            
        try {
            // InternalDCL.g:160:28: ( (this_DCLManagedSubsystem_0= ruleDCLManagedSubsystem | this_DCLManagingSubsystem_1= ruleDCLManagingSubsystem | this_DCLMonitor_2= ruleDCLMonitor | this_DCLPlanner_3= ruleDCLPlanner | this_DCLAnalyzer_4= ruleDCLAnalyzer | this_DCLExecutor_5= ruleDCLExecutor | this_DCLSensor_6= ruleDCLSensor | this_DCLActuator_7= ruleDCLActuator | this_DCLKnowledge_8= ruleDCLKnowledge | this_DCLReferences_9= ruleDCLReferences | this_DCLLayer_10= ruleDCLLayer | this_DCLComponent_11= ruleDCLComponent | this_DCLSubSystem_12= ruleDCLSubSystem | this_DCLModule_13= ruleDCLModule | this_DCLComponentInterface_14= ruleDCLComponentInterface ) )
            // InternalDCL.g:161:1: (this_DCLManagedSubsystem_0= ruleDCLManagedSubsystem | this_DCLManagingSubsystem_1= ruleDCLManagingSubsystem | this_DCLMonitor_2= ruleDCLMonitor | this_DCLPlanner_3= ruleDCLPlanner | this_DCLAnalyzer_4= ruleDCLAnalyzer | this_DCLExecutor_5= ruleDCLExecutor | this_DCLSensor_6= ruleDCLSensor | this_DCLActuator_7= ruleDCLActuator | this_DCLKnowledge_8= ruleDCLKnowledge | this_DCLReferences_9= ruleDCLReferences | this_DCLLayer_10= ruleDCLLayer | this_DCLComponent_11= ruleDCLComponent | this_DCLSubSystem_12= ruleDCLSubSystem | this_DCLModule_13= ruleDCLModule | this_DCLComponentInterface_14= ruleDCLComponentInterface )
            {
            // InternalDCL.g:161:1: (this_DCLManagedSubsystem_0= ruleDCLManagedSubsystem | this_DCLManagingSubsystem_1= ruleDCLManagingSubsystem | this_DCLMonitor_2= ruleDCLMonitor | this_DCLPlanner_3= ruleDCLPlanner | this_DCLAnalyzer_4= ruleDCLAnalyzer | this_DCLExecutor_5= ruleDCLExecutor | this_DCLSensor_6= ruleDCLSensor | this_DCLActuator_7= ruleDCLActuator | this_DCLKnowledge_8= ruleDCLKnowledge | this_DCLReferences_9= ruleDCLReferences | this_DCLLayer_10= ruleDCLLayer | this_DCLComponent_11= ruleDCLComponent | this_DCLSubSystem_12= ruleDCLSubSystem | this_DCLModule_13= ruleDCLModule | this_DCLComponentInterface_14= ruleDCLComponentInterface )
            int alt3=15;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            case 23:
                {
                alt3=5;
                }
                break;
            case 24:
                {
                alt3=6;
                }
                break;
            case 25:
                {
                alt3=7;
                }
                break;
            case 26:
                {
                alt3=8;
                }
                break;
            case 27:
                {
                alt3=9;
                }
                break;
            case 28:
                {
                alt3=10;
                }
                break;
            case 30:
                {
                alt3=11;
                }
                break;
            case 35:
                {
                alt3=12;
                }
                break;
            case 41:
                {
                alt3=13;
                }
                break;
            case 42:
                {
                alt3=14;
                }
                break;
            case 36:
                {
                alt3=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDCL.g:162:5: this_DCLManagedSubsystem_0= ruleDCLManagedSubsystem
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLManagedSubsystemParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLManagedSubsystem_0=ruleDCLManagedSubsystem();

                    state._fsp--;

                     
                            current = this_DCLManagedSubsystem_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDCL.g:172:5: this_DCLManagingSubsystem_1= ruleDCLManagingSubsystem
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLManagingSubsystemParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLManagingSubsystem_1=ruleDCLManagingSubsystem();

                    state._fsp--;

                     
                            current = this_DCLManagingSubsystem_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalDCL.g:182:5: this_DCLMonitor_2= ruleDCLMonitor
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLMonitorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLMonitor_2=ruleDCLMonitor();

                    state._fsp--;

                     
                            current = this_DCLMonitor_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalDCL.g:192:5: this_DCLPlanner_3= ruleDCLPlanner
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLPlannerParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLPlanner_3=ruleDCLPlanner();

                    state._fsp--;

                     
                            current = this_DCLPlanner_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalDCL.g:202:5: this_DCLAnalyzer_4= ruleDCLAnalyzer
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLAnalyzerParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLAnalyzer_4=ruleDCLAnalyzer();

                    state._fsp--;

                     
                            current = this_DCLAnalyzer_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalDCL.g:212:5: this_DCLExecutor_5= ruleDCLExecutor
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLExecutorParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLExecutor_5=ruleDCLExecutor();

                    state._fsp--;

                     
                            current = this_DCLExecutor_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalDCL.g:222:5: this_DCLSensor_6= ruleDCLSensor
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLSensorParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLSensor_6=ruleDCLSensor();

                    state._fsp--;

                     
                            current = this_DCLSensor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalDCL.g:232:5: this_DCLActuator_7= ruleDCLActuator
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLActuatorParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLActuator_7=ruleDCLActuator();

                    state._fsp--;

                     
                            current = this_DCLActuator_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalDCL.g:242:5: this_DCLKnowledge_8= ruleDCLKnowledge
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLKnowledgeParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLKnowledge_8=ruleDCLKnowledge();

                    state._fsp--;

                     
                            current = this_DCLKnowledge_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // InternalDCL.g:252:5: this_DCLReferences_9= ruleDCLReferences
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLReferencesParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLReferences_9=ruleDCLReferences();

                    state._fsp--;

                     
                            current = this_DCLReferences_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // InternalDCL.g:262:5: this_DCLLayer_10= ruleDCLLayer
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLLayerParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLLayer_10=ruleDCLLayer();

                    state._fsp--;

                     
                            current = this_DCLLayer_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // InternalDCL.g:272:5: this_DCLComponent_11= ruleDCLComponent
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLComponentParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLComponent_11=ruleDCLComponent();

                    state._fsp--;

                     
                            current = this_DCLComponent_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // InternalDCL.g:282:5: this_DCLSubSystem_12= ruleDCLSubSystem
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLSubSystemParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLSubSystem_12=ruleDCLSubSystem();

                    state._fsp--;

                     
                            current = this_DCLSubSystem_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // InternalDCL.g:292:5: this_DCLModule_13= ruleDCLModule
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLModuleParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLModule_13=ruleDCLModule();

                    state._fsp--;

                     
                            current = this_DCLModule_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // InternalDCL.g:302:5: this_DCLComponentInterface_14= ruleDCLComponentInterface
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLComponentInterfaceParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLComponentInterface_14=ruleDCLComponentInterface();

                    state._fsp--;

                     
                            current = this_DCLComponentInterface_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLStructureElement"


    // $ANTLR start "entryRuleDCLManagedSubsystem"
    // InternalDCL.g:318:1: entryRuleDCLManagedSubsystem returns [EObject current=null] : iv_ruleDCLManagedSubsystem= ruleDCLManagedSubsystem EOF ;
    public final EObject entryRuleDCLManagedSubsystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLManagedSubsystem = null;


        try {
            // InternalDCL.g:319:2: (iv_ruleDCLManagedSubsystem= ruleDCLManagedSubsystem EOF )
            // InternalDCL.g:320:2: iv_ruleDCLManagedSubsystem= ruleDCLManagedSubsystem EOF
            {
             newCompositeNode(grammarAccess.getDCLManagedSubsystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLManagedSubsystem=ruleDCLManagedSubsystem();

            state._fsp--;

             current =iv_ruleDCLManagedSubsystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLManagedSubsystem"


    // $ANTLR start "ruleDCLManagedSubsystem"
    // InternalDCL.g:327:1: ruleDCLManagedSubsystem returns [EObject current=null] : (otherlv_0= 'managedSubsystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagedSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleDCLManagedSubsystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:330:28: ( (otherlv_0= 'managedSubsystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagedSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) )
            // InternalDCL.g:331:1: (otherlv_0= 'managedSubsystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagedSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // InternalDCL.g:331:1: (otherlv_0= 'managedSubsystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagedSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            // InternalDCL.g:331:3: otherlv_0= 'managedSubsystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagedSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLManagedSubsystemAccess().getManagedSubsystemKeyword_0());
                
            // InternalDCL.g:335:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:336:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:336:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:337:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLManagedSubsystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLManagedSubsystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDCL.g:353:2: (otherlv_2= ',' otherlv_3= 'inManagedSubsystem:' ( (otherlv_4= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDCL.g:353:4: otherlv_2= ',' otherlv_3= 'inManagedSubsystem:' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLManagedSubsystemAccess().getCommaKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLManagedSubsystemAccess().getInManagedSubsystemKeyword_2_1());
                        
                    // InternalDCL.g:361:1: ( (otherlv_4= RULE_ID ) )
                    // InternalDCL.g:362:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDCL.g:362:1: (otherlv_4= RULE_ID )
                    // InternalDCL.g:363:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLManagedSubsystemRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLManagedSubsystemAccess().getManagedSubsystemDCLManagedSubsystemCrossReference_2_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getDCLManagedSubsystemAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLManagedSubsystem"


    // $ANTLR start "entryRuleDCLManagingSubsystem"
    // InternalDCL.g:386:1: entryRuleDCLManagingSubsystem returns [EObject current=null] : iv_ruleDCLManagingSubsystem= ruleDCLManagingSubsystem EOF ;
    public final EObject entryRuleDCLManagingSubsystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLManagingSubsystem = null;


        try {
            // InternalDCL.g:387:2: (iv_ruleDCLManagingSubsystem= ruleDCLManagingSubsystem EOF )
            // InternalDCL.g:388:2: iv_ruleDCLManagingSubsystem= ruleDCLManagingSubsystem EOF
            {
             newCompositeNode(grammarAccess.getDCLManagingSubsystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLManagingSubsystem=ruleDCLManagingSubsystem();

            state._fsp--;

             current =iv_ruleDCLManagingSubsystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLManagingSubsystem"


    // $ANTLR start "ruleDCLManagingSubsystem"
    // InternalDCL.g:395:1: ruleDCLManagingSubsystem returns [EObject current=null] : (otherlv_0= 'managingSubsystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleDCLManagingSubsystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:398:28: ( (otherlv_0= 'managingSubsystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) )
            // InternalDCL.g:399:1: (otherlv_0= 'managingSubsystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // InternalDCL.g:399:1: (otherlv_0= 'managingSubsystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            // InternalDCL.g:399:3: otherlv_0= 'managingSubsystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLManagingSubsystemAccess().getManagingSubsystemKeyword_0());
                
            // InternalDCL.g:403:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:404:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:404:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:405:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLManagingSubsystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLManagingSubsystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDCL.g:421:2: (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDCL.g:421:4: otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_12); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLManagingSubsystemAccess().getCommaKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,20,FOLLOW_8); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLManagingSubsystemAccess().getInManagingSubsystemKeyword_2_1());
                        
                    // InternalDCL.g:429:1: ( (otherlv_4= RULE_ID ) )
                    // InternalDCL.g:430:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDCL.g:430:1: (otherlv_4= RULE_ID )
                    // InternalDCL.g:431:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLManagingSubsystemRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLManagingSubsystemAccess().getManagingSubsystemDCLManagingSubsystemCrossReference_2_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getDCLManagingSubsystemAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLManagingSubsystem"


    // $ANTLR start "entryRuleDCLMonitor"
    // InternalDCL.g:454:1: entryRuleDCLMonitor returns [EObject current=null] : iv_ruleDCLMonitor= ruleDCLMonitor EOF ;
    public final EObject entryRuleDCLMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLMonitor = null;


        try {
            // InternalDCL.g:455:2: (iv_ruleDCLMonitor= ruleDCLMonitor EOF )
            // InternalDCL.g:456:2: iv_ruleDCLMonitor= ruleDCLMonitor EOF
            {
             newCompositeNode(grammarAccess.getDCLMonitorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLMonitor=ruleDCLMonitor();

            state._fsp--;

             current =iv_ruleDCLMonitor; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLMonitor"


    // $ANTLR start "ruleDCLMonitor"
    // InternalDCL.g:463:1: ruleDCLMonitor returns [EObject current=null] : (otherlv_0= 'monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleDCLMonitor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:466:28: ( (otherlv_0= 'monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) )
            // InternalDCL.g:467:1: (otherlv_0= 'monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // InternalDCL.g:467:1: (otherlv_0= 'monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            // InternalDCL.g:467:3: otherlv_0= 'monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLMonitorAccess().getMonitorKeyword_0());
                
            // InternalDCL.g:471:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:472:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:472:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:473:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLMonitorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLMonitorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDCL.g:489:2: (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDCL.g:489:4: otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_12); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLMonitorAccess().getCommaKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,20,FOLLOW_8); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLMonitorAccess().getInManagingSubsystemKeyword_2_1());
                        
                    // InternalDCL.g:497:1: ( (otherlv_4= RULE_ID ) )
                    // InternalDCL.g:498:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDCL.g:498:1: (otherlv_4= RULE_ID )
                    // InternalDCL.g:499:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLMonitorRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLMonitorAccess().getManagingSubsystemDCLManagingSubsystemCrossReference_2_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getDCLMonitorAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLMonitor"


    // $ANTLR start "entryRuleDCLPlanner"
    // InternalDCL.g:522:1: entryRuleDCLPlanner returns [EObject current=null] : iv_ruleDCLPlanner= ruleDCLPlanner EOF ;
    public final EObject entryRuleDCLPlanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLPlanner = null;


        try {
            // InternalDCL.g:523:2: (iv_ruleDCLPlanner= ruleDCLPlanner EOF )
            // InternalDCL.g:524:2: iv_ruleDCLPlanner= ruleDCLPlanner EOF
            {
             newCompositeNode(grammarAccess.getDCLPlannerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLPlanner=ruleDCLPlanner();

            state._fsp--;

             current =iv_ruleDCLPlanner; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLPlanner"


    // $ANTLR start "ruleDCLPlanner"
    // InternalDCL.g:531:1: ruleDCLPlanner returns [EObject current=null] : (otherlv_0= 'planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleDCLPlanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:534:28: ( (otherlv_0= 'planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) )
            // InternalDCL.g:535:1: (otherlv_0= 'planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // InternalDCL.g:535:1: (otherlv_0= 'planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            // InternalDCL.g:535:3: otherlv_0= 'planner' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLPlannerAccess().getPlannerKeyword_0());
                
            // InternalDCL.g:539:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:540:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:540:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:541:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLPlannerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLPlannerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDCL.g:557:2: (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDCL.g:557:4: otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_12); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLPlannerAccess().getCommaKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,20,FOLLOW_8); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLPlannerAccess().getInManagingSubsystemKeyword_2_1());
                        
                    // InternalDCL.g:565:1: ( (otherlv_4= RULE_ID ) )
                    // InternalDCL.g:566:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDCL.g:566:1: (otherlv_4= RULE_ID )
                    // InternalDCL.g:567:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLPlannerRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLPlannerAccess().getManagingSubsystemDCLManagingSubsystemCrossReference_2_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getDCLPlannerAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLPlanner"


    // $ANTLR start "entryRuleDCLAnalyzer"
    // InternalDCL.g:590:1: entryRuleDCLAnalyzer returns [EObject current=null] : iv_ruleDCLAnalyzer= ruleDCLAnalyzer EOF ;
    public final EObject entryRuleDCLAnalyzer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLAnalyzer = null;


        try {
            // InternalDCL.g:591:2: (iv_ruleDCLAnalyzer= ruleDCLAnalyzer EOF )
            // InternalDCL.g:592:2: iv_ruleDCLAnalyzer= ruleDCLAnalyzer EOF
            {
             newCompositeNode(grammarAccess.getDCLAnalyzerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLAnalyzer=ruleDCLAnalyzer();

            state._fsp--;

             current =iv_ruleDCLAnalyzer; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLAnalyzer"


    // $ANTLR start "ruleDCLAnalyzer"
    // InternalDCL.g:599:1: ruleDCLAnalyzer returns [EObject current=null] : (otherlv_0= 'analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleDCLAnalyzer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:602:28: ( (otherlv_0= 'analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) )
            // InternalDCL.g:603:1: (otherlv_0= 'analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // InternalDCL.g:603:1: (otherlv_0= 'analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            // InternalDCL.g:603:3: otherlv_0= 'analyzer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLAnalyzerAccess().getAnalyzerKeyword_0());
                
            // InternalDCL.g:607:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:608:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:608:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:609:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLAnalyzerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLAnalyzerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDCL.g:625:2: (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDCL.g:625:4: otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_12); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLAnalyzerAccess().getCommaKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,20,FOLLOW_8); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLAnalyzerAccess().getInManagingSubsystemKeyword_2_1());
                        
                    // InternalDCL.g:633:1: ( (otherlv_4= RULE_ID ) )
                    // InternalDCL.g:634:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDCL.g:634:1: (otherlv_4= RULE_ID )
                    // InternalDCL.g:635:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLAnalyzerRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLAnalyzerAccess().getManagingSubsystemDCLManagingSubsystemCrossReference_2_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getDCLAnalyzerAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLAnalyzer"


    // $ANTLR start "entryRuleDCLExecutor"
    // InternalDCL.g:658:1: entryRuleDCLExecutor returns [EObject current=null] : iv_ruleDCLExecutor= ruleDCLExecutor EOF ;
    public final EObject entryRuleDCLExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLExecutor = null;


        try {
            // InternalDCL.g:659:2: (iv_ruleDCLExecutor= ruleDCLExecutor EOF )
            // InternalDCL.g:660:2: iv_ruleDCLExecutor= ruleDCLExecutor EOF
            {
             newCompositeNode(grammarAccess.getDCLExecutorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLExecutor=ruleDCLExecutor();

            state._fsp--;

             current =iv_ruleDCLExecutor; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLExecutor"


    // $ANTLR start "ruleDCLExecutor"
    // InternalDCL.g:667:1: ruleDCLExecutor returns [EObject current=null] : (otherlv_0= 'executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleDCLExecutor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:670:28: ( (otherlv_0= 'executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) )
            // InternalDCL.g:671:1: (otherlv_0= 'executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // InternalDCL.g:671:1: (otherlv_0= 'executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            // InternalDCL.g:671:3: otherlv_0= 'executor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLExecutorAccess().getExecutorKeyword_0());
                
            // InternalDCL.g:675:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:676:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:676:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:677:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLExecutorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLExecutorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDCL.g:693:2: (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDCL.g:693:4: otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_12); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLExecutorAccess().getCommaKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,20,FOLLOW_8); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLExecutorAccess().getInManagingSubsystemKeyword_2_1());
                        
                    // InternalDCL.g:701:1: ( (otherlv_4= RULE_ID ) )
                    // InternalDCL.g:702:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDCL.g:702:1: (otherlv_4= RULE_ID )
                    // InternalDCL.g:703:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLExecutorRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLExecutorAccess().getManagingSubsystemDCLManagingSubsystemCrossReference_2_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getDCLExecutorAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLExecutor"


    // $ANTLR start "entryRuleDCLSensor"
    // InternalDCL.g:726:1: entryRuleDCLSensor returns [EObject current=null] : iv_ruleDCLSensor= ruleDCLSensor EOF ;
    public final EObject entryRuleDCLSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLSensor = null;


        try {
            // InternalDCL.g:727:2: (iv_ruleDCLSensor= ruleDCLSensor EOF )
            // InternalDCL.g:728:2: iv_ruleDCLSensor= ruleDCLSensor EOF
            {
             newCompositeNode(grammarAccess.getDCLSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLSensor=ruleDCLSensor();

            state._fsp--;

             current =iv_ruleDCLSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLSensor"


    // $ANTLR start "ruleDCLSensor"
    // InternalDCL.g:735:1: ruleDCLSensor returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleDCLSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:738:28: ( (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) )
            // InternalDCL.g:739:1: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // InternalDCL.g:739:1: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            // InternalDCL.g:739:3: otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLSensorAccess().getSensorKeyword_0());
                
            // InternalDCL.g:743:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:744:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:744:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:745:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLSensorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLSensorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDCL.g:761:2: (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDCL.g:761:4: otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_12); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLSensorAccess().getCommaKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,20,FOLLOW_8); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLSensorAccess().getInManagingSubsystemKeyword_2_1());
                        
                    // InternalDCL.g:769:1: ( (otherlv_4= RULE_ID ) )
                    // InternalDCL.g:770:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDCL.g:770:1: (otherlv_4= RULE_ID )
                    // InternalDCL.g:771:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLSensorRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLSensorAccess().getManagingSubsystemDCLManagingSubsystemCrossReference_2_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getDCLSensorAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLSensor"


    // $ANTLR start "entryRuleDCLActuator"
    // InternalDCL.g:794:1: entryRuleDCLActuator returns [EObject current=null] : iv_ruleDCLActuator= ruleDCLActuator EOF ;
    public final EObject entryRuleDCLActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLActuator = null;


        try {
            // InternalDCL.g:795:2: (iv_ruleDCLActuator= ruleDCLActuator EOF )
            // InternalDCL.g:796:2: iv_ruleDCLActuator= ruleDCLActuator EOF
            {
             newCompositeNode(grammarAccess.getDCLActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLActuator=ruleDCLActuator();

            state._fsp--;

             current =iv_ruleDCLActuator; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLActuator"


    // $ANTLR start "ruleDCLActuator"
    // InternalDCL.g:803:1: ruleDCLActuator returns [EObject current=null] : (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleDCLActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:806:28: ( (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) )
            // InternalDCL.g:807:1: (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // InternalDCL.g:807:1: (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            // InternalDCL.g:807:3: otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLActuatorAccess().getActuatorKeyword_0());
                
            // InternalDCL.g:811:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:812:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:812:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:813:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLActuatorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLActuatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDCL.g:829:2: (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDCL.g:829:4: otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_12); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLActuatorAccess().getCommaKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,20,FOLLOW_8); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLActuatorAccess().getInManagingSubsystemKeyword_2_1());
                        
                    // InternalDCL.g:837:1: ( (otherlv_4= RULE_ID ) )
                    // InternalDCL.g:838:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDCL.g:838:1: (otherlv_4= RULE_ID )
                    // InternalDCL.g:839:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLActuatorRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLActuatorAccess().getManagingSubsystemDCLManagingSubsystemCrossReference_2_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getDCLActuatorAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLActuator"


    // $ANTLR start "entryRuleDCLKnowledge"
    // InternalDCL.g:862:1: entryRuleDCLKnowledge returns [EObject current=null] : iv_ruleDCLKnowledge= ruleDCLKnowledge EOF ;
    public final EObject entryRuleDCLKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLKnowledge = null;


        try {
            // InternalDCL.g:863:2: (iv_ruleDCLKnowledge= ruleDCLKnowledge EOF )
            // InternalDCL.g:864:2: iv_ruleDCLKnowledge= ruleDCLKnowledge EOF
            {
             newCompositeNode(grammarAccess.getDCLKnowledgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLKnowledge=ruleDCLKnowledge();

            state._fsp--;

             current =iv_ruleDCLKnowledge; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLKnowledge"


    // $ANTLR start "ruleDCLKnowledge"
    // InternalDCL.g:871:1: ruleDCLKnowledge returns [EObject current=null] : (otherlv_0= 'knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleDCLKnowledge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:874:28: ( (otherlv_0= 'knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) )
            // InternalDCL.g:875:1: (otherlv_0= 'knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // InternalDCL.g:875:1: (otherlv_0= 'knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            // InternalDCL.g:875:3: otherlv_0= 'knowledge' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLKnowledgeAccess().getKnowledgeKeyword_0());
                
            // InternalDCL.g:879:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:880:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:880:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:881:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLKnowledgeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLKnowledgeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDCL.g:897:2: (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDCL.g:897:4: otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_12); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLKnowledgeAccess().getCommaKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,20,FOLLOW_8); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLKnowledgeAccess().getInManagingSubsystemKeyword_2_1());
                        
                    // InternalDCL.g:905:1: ( (otherlv_4= RULE_ID ) )
                    // InternalDCL.g:906:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDCL.g:906:1: (otherlv_4= RULE_ID )
                    // InternalDCL.g:907:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLKnowledgeRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLKnowledgeAccess().getManagingSubsystemDCLManagingSubsystemCrossReference_2_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getDCLKnowledgeAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLKnowledge"


    // $ANTLR start "entryRuleDCLReferences"
    // InternalDCL.g:930:1: entryRuleDCLReferences returns [EObject current=null] : iv_ruleDCLReferences= ruleDCLReferences EOF ;
    public final EObject entryRuleDCLReferences() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLReferences = null;


        try {
            // InternalDCL.g:931:2: (iv_ruleDCLReferences= ruleDCLReferences EOF )
            // InternalDCL.g:932:2: iv_ruleDCLReferences= ruleDCLReferences EOF
            {
             newCompositeNode(grammarAccess.getDCLReferencesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLReferences=ruleDCLReferences();

            state._fsp--;

             current =iv_ruleDCLReferences; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLReferences"


    // $ANTLR start "ruleDCLReferences"
    // InternalDCL.g:939:1: ruleDCLReferences returns [EObject current=null] : (otherlv_0= 'references' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inKnowledge:' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleDCLReferences() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:942:28: ( (otherlv_0= 'references' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inKnowledge:' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' ) )
            // InternalDCL.g:943:1: (otherlv_0= 'references' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inKnowledge:' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' )
            {
            // InternalDCL.g:943:1: (otherlv_0= 'references' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inKnowledge:' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' )
            // InternalDCL.g:943:3: otherlv_0= 'references' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inKnowledge:' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLReferencesAccess().getReferencesKeyword_0());
                
            // InternalDCL.g:947:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:948:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:948:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:949:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLReferencesAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLReferencesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDCL.g:965:2: ( (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inKnowledge:' ( (otherlv_7= RULE_ID ) ) ) )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==20) ) {
                    alt13=1;
                }
                else if ( (LA13_1==29) ) {
                    alt13=2;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalDCL.g:965:3: (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalDCL.g:965:3: (otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) ) )
                    // InternalDCL.g:965:5: otherlv_2= ',' otherlv_3= 'inManagingSubsystem:' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_12); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLReferencesAccess().getCommaKeyword_2_0_0());
                        
                    otherlv_3=(Token)match(input,20,FOLLOW_8); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLReferencesAccess().getInManagingSubsystemKeyword_2_0_1());
                        
                    // InternalDCL.g:973:1: ( (otherlv_4= RULE_ID ) )
                    // InternalDCL.g:974:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDCL.g:974:1: (otherlv_4= RULE_ID )
                    // InternalDCL.g:975:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLReferencesRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLReferencesAccess().getManagingSubsystemDCLManagingSubsystemCrossReference_2_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDCL.g:987:6: (otherlv_5= ',' otherlv_6= 'inKnowledge:' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalDCL.g:987:6: (otherlv_5= ',' otherlv_6= 'inKnowledge:' ( (otherlv_7= RULE_ID ) ) )
                    // InternalDCL.g:987:8: otherlv_5= ',' otherlv_6= 'inKnowledge:' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_13); 

                        	newLeafNode(otherlv_5, grammarAccess.getDCLReferencesAccess().getCommaKeyword_2_1_0());
                        
                    otherlv_6=(Token)match(input,29,FOLLOW_8); 

                        	newLeafNode(otherlv_6, grammarAccess.getDCLReferencesAccess().getInKnowledgeKeyword_2_1_1());
                        
                    // InternalDCL.g:995:1: ( (otherlv_7= RULE_ID ) )
                    // InternalDCL.g:996:1: (otherlv_7= RULE_ID )
                    {
                    // InternalDCL.g:996:1: (otherlv_7= RULE_ID )
                    // InternalDCL.g:997:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLReferencesRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_7, grammarAccess.getDCLReferencesAccess().getKnowledgeDCLKnowledgeCrossReference_2_1_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getDCLReferencesAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLReferences"


    // $ANTLR start "entryRuleDCLLayer"
    // InternalDCL.g:1020:1: entryRuleDCLLayer returns [EObject current=null] : iv_ruleDCLLayer= ruleDCLLayer EOF ;
    public final EObject entryRuleDCLLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLLayer = null;


        try {
            // InternalDCL.g:1021:2: (iv_ruleDCLLayer= ruleDCLLayer EOF )
            // InternalDCL.g:1022:2: iv_ruleDCLLayer= ruleDCLLayer EOF
            {
             newCompositeNode(grammarAccess.getDCLLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLLayer=ruleDCLLayer();

            state._fsp--;

             current =iv_ruleDCLLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLLayer"


    // $ANTLR start "ruleDCLLayer"
    // InternalDCL.g:1029:1: ruleDCLLayer returns [EObject current=null] : (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) ( (otherlv_5= ',' otherlv_6= 'inLayer:' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem:' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent:' ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= ';' ) ;
    public final EObject ruleDCLLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_level_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:1032:28: ( (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) ( (otherlv_5= ',' otherlv_6= 'inLayer:' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem:' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent:' ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= ';' ) )
            // InternalDCL.g:1033:1: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) ( (otherlv_5= ',' otherlv_6= 'inLayer:' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem:' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent:' ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= ';' )
            {
            // InternalDCL.g:1033:1: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) ( (otherlv_5= ',' otherlv_6= 'inLayer:' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem:' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent:' ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= ';' )
            // InternalDCL.g:1033:3: otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) ( (otherlv_5= ',' otherlv_6= 'inLayer:' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem:' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent:' ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLLayerAccess().getLayerKeyword_0());
                
            // InternalDCL.g:1037:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:1038:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:1038:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:1039:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLLayerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_15); 

                	newLeafNode(otherlv_2, grammarAccess.getDCLLayerAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,31,FOLLOW_16); 

                	newLeafNode(otherlv_3, grammarAccess.getDCLLayerAccess().getLevelKeyword_3());
                
            // InternalDCL.g:1063:1: ( (lv_level_4_0= RULE_INT ) )
            // InternalDCL.g:1064:1: (lv_level_4_0= RULE_INT )
            {
            // InternalDCL.g:1064:1: (lv_level_4_0= RULE_INT )
            // InternalDCL.g:1065:3: lv_level_4_0= RULE_INT
            {
            lv_level_4_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            			newLeafNode(lv_level_4_0, grammarAccess.getDCLLayerAccess().getLevelINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLLayerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"level",
                    		lv_level_4_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            // InternalDCL.g:1081:2: ( (otherlv_5= ',' otherlv_6= 'inLayer:' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem:' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent:' ( (otherlv_13= RULE_ID ) ) ) )?
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                switch ( input.LA(2) ) {
                    case 32:
                        {
                        alt14=1;
                        }
                        break;
                    case 33:
                        {
                        alt14=2;
                        }
                        break;
                    case 34:
                        {
                        alt14=3;
                        }
                        break;
                }

            }
            switch (alt14) {
                case 1 :
                    // InternalDCL.g:1081:3: (otherlv_5= ',' otherlv_6= 'inLayer:' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalDCL.g:1081:3: (otherlv_5= ',' otherlv_6= 'inLayer:' ( (otherlv_7= RULE_ID ) ) )
                    // InternalDCL.g:1081:5: otherlv_5= ',' otherlv_6= 'inLayer:' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_17); 

                        	newLeafNode(otherlv_5, grammarAccess.getDCLLayerAccess().getCommaKeyword_5_0_0());
                        
                    otherlv_6=(Token)match(input,32,FOLLOW_8); 

                        	newLeafNode(otherlv_6, grammarAccess.getDCLLayerAccess().getInLayerKeyword_5_0_1());
                        
                    // InternalDCL.g:1089:1: ( (otherlv_7= RULE_ID ) )
                    // InternalDCL.g:1090:1: (otherlv_7= RULE_ID )
                    {
                    // InternalDCL.g:1090:1: (otherlv_7= RULE_ID )
                    // InternalDCL.g:1091:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLLayerRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_7, grammarAccess.getDCLLayerAccess().getLayerDCLLayerCrossReference_5_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDCL.g:1103:6: (otherlv_8= ',' otherlv_9= 'inSubSystem:' ( (otherlv_10= RULE_ID ) ) )
                    {
                    // InternalDCL.g:1103:6: (otherlv_8= ',' otherlv_9= 'inSubSystem:' ( (otherlv_10= RULE_ID ) ) )
                    // InternalDCL.g:1103:8: otherlv_8= ',' otherlv_9= 'inSubSystem:' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_18); 

                        	newLeafNode(otherlv_8, grammarAccess.getDCLLayerAccess().getCommaKeyword_5_1_0());
                        
                    otherlv_9=(Token)match(input,33,FOLLOW_8); 

                        	newLeafNode(otherlv_9, grammarAccess.getDCLLayerAccess().getInSubSystemKeyword_5_1_1());
                        
                    // InternalDCL.g:1111:1: ( (otherlv_10= RULE_ID ) )
                    // InternalDCL.g:1112:1: (otherlv_10= RULE_ID )
                    {
                    // InternalDCL.g:1112:1: (otherlv_10= RULE_ID )
                    // InternalDCL.g:1113:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLLayerRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_10, grammarAccess.getDCLLayerAccess().getSubSystemDCLSubSystemCrossReference_5_1_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDCL.g:1125:6: (otherlv_11= ',' otherlv_12= 'inComponent:' ( (otherlv_13= RULE_ID ) ) )
                    {
                    // InternalDCL.g:1125:6: (otherlv_11= ',' otherlv_12= 'inComponent:' ( (otherlv_13= RULE_ID ) ) )
                    // InternalDCL.g:1125:8: otherlv_11= ',' otherlv_12= 'inComponent:' ( (otherlv_13= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_19); 

                        	newLeafNode(otherlv_11, grammarAccess.getDCLLayerAccess().getCommaKeyword_5_2_0());
                        
                    otherlv_12=(Token)match(input,34,FOLLOW_8); 

                        	newLeafNode(otherlv_12, grammarAccess.getDCLLayerAccess().getInComponentKeyword_5_2_1());
                        
                    // InternalDCL.g:1133:1: ( (otherlv_13= RULE_ID ) )
                    // InternalDCL.g:1134:1: (otherlv_13= RULE_ID )
                    {
                    // InternalDCL.g:1134:1: (otherlv_13= RULE_ID )
                    // InternalDCL.g:1135:3: otherlv_13= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLLayerRule());
                    	        }
                            
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_13, grammarAccess.getDCLLayerAccess().getComponentDCLComponentCrossReference_5_2_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_14, grammarAccess.getDCLLayerAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLLayer"


    // $ANTLR start "entryRuleDCLComponent"
    // InternalDCL.g:1158:1: entryRuleDCLComponent returns [EObject current=null] : iv_ruleDCLComponent= ruleDCLComponent EOF ;
    public final EObject entryRuleDCLComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLComponent = null;


        try {
            // InternalDCL.g:1159:2: (iv_ruleDCLComponent= ruleDCLComponent EOF )
            // InternalDCL.g:1160:2: iv_ruleDCLComponent= ruleDCLComponent EOF
            {
             newCompositeNode(grammarAccess.getDCLComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLComponent=ruleDCLComponent();

            state._fsp--;

             current =iv_ruleDCLComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLComponent"


    // $ANTLR start "ruleDCLComponent"
    // InternalDCL.g:1167:1: ruleDCLComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer:' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem:' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleDCLComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:1170:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer:' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem:' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' ) )
            // InternalDCL.g:1171:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer:' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem:' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' )
            {
            // InternalDCL.g:1171:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer:' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem:' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' )
            // InternalDCL.g:1171:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer:' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem:' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLComponentAccess().getComponentKeyword_0());
                
            // InternalDCL.g:1175:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:1176:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:1176:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:1177:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDCL.g:1193:2: ( (otherlv_2= ',' otherlv_3= 'inLayer:' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem:' ( (otherlv_7= RULE_ID ) ) ) )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==33) ) {
                    alt15=2;
                }
                else if ( (LA15_1==32) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalDCL.g:1193:3: (otherlv_2= ',' otherlv_3= 'inLayer:' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalDCL.g:1193:3: (otherlv_2= ',' otherlv_3= 'inLayer:' ( (otherlv_4= RULE_ID ) ) )
                    // InternalDCL.g:1193:5: otherlv_2= ',' otherlv_3= 'inLayer:' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_17); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLComponentAccess().getCommaKeyword_2_0_0());
                        
                    otherlv_3=(Token)match(input,32,FOLLOW_8); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLComponentAccess().getInLayerKeyword_2_0_1());
                        
                    // InternalDCL.g:1201:1: ( (otherlv_4= RULE_ID ) )
                    // InternalDCL.g:1202:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDCL.g:1202:1: (otherlv_4= RULE_ID )
                    // InternalDCL.g:1203:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLComponentRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLComponentAccess().getLayerDCLLayerCrossReference_2_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDCL.g:1215:6: (otherlv_5= ',' otherlv_6= 'inSubSystem:' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalDCL.g:1215:6: (otherlv_5= ',' otherlv_6= 'inSubSystem:' ( (otherlv_7= RULE_ID ) ) )
                    // InternalDCL.g:1215:8: otherlv_5= ',' otherlv_6= 'inSubSystem:' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_18); 

                        	newLeafNode(otherlv_5, grammarAccess.getDCLComponentAccess().getCommaKeyword_2_1_0());
                        
                    otherlv_6=(Token)match(input,33,FOLLOW_8); 

                        	newLeafNode(otherlv_6, grammarAccess.getDCLComponentAccess().getInSubSystemKeyword_2_1_1());
                        
                    // InternalDCL.g:1223:1: ( (otherlv_7= RULE_ID ) )
                    // InternalDCL.g:1224:1: (otherlv_7= RULE_ID )
                    {
                    // InternalDCL.g:1224:1: (otherlv_7= RULE_ID )
                    // InternalDCL.g:1225:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLComponentRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_7, grammarAccess.getDCLComponentAccess().getSubSystemDCLSubSystemCrossReference_2_1_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getDCLComponentAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLComponent"


    // $ANTLR start "entryRuleDCLComponentInterface"
    // InternalDCL.g:1248:1: entryRuleDCLComponentInterface returns [EObject current=null] : iv_ruleDCLComponentInterface= ruleDCLComponentInterface EOF ;
    public final EObject entryRuleDCLComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLComponentInterface = null;


        try {
            // InternalDCL.g:1249:2: (iv_ruleDCLComponentInterface= ruleDCLComponentInterface EOF )
            // InternalDCL.g:1250:2: iv_ruleDCLComponentInterface= ruleDCLComponentInterface EOF
            {
             newCompositeNode(grammarAccess.getDCLComponentInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLComponentInterface=ruleDCLComponentInterface();

            state._fsp--;

             current =iv_ruleDCLComponentInterface; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLComponentInterface"


    // $ANTLR start "ruleDCLComponentInterface"
    // InternalDCL.g:1257:1: ruleDCLComponentInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type:' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';' ) ;
    public final EObject ruleDCLComponentInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_interfaceType_6_0 = null;


         enterRule(); 
            
        try {
            // InternalDCL.g:1260:28: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type:' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';' ) )
            // InternalDCL.g:1261:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type:' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';' )
            {
            // InternalDCL.g:1261:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type:' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';' )
            // InternalDCL.g:1261:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type:' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLComponentInterfaceAccess().getInterfaceKeyword_0());
                
            // InternalDCL.g:1265:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:1266:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:1266:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:1267:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLComponentInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLComponentInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_8); 

                	newLeafNode(otherlv_2, grammarAccess.getDCLComponentInterfaceAccess().getOfComponentKeyword_2());
                
            // InternalDCL.g:1287:1: ( (otherlv_3= RULE_ID ) )
            // InternalDCL.g:1288:1: (otherlv_3= RULE_ID )
            {
            // InternalDCL.g:1288:1: (otherlv_3= RULE_ID )
            // InternalDCL.g:1289:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLComponentInterfaceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

            		newLeafNode(otherlv_3, grammarAccess.getDCLComponentInterfaceAccess().getComponentDCLStructureElementCrossReference_3_0()); 
            	

            }


            }

            // InternalDCL.g:1300:2: (otherlv_4= ',' otherlv_5= 'type:' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) )
            // InternalDCL.g:1300:4: otherlv_4= ',' otherlv_5= 'type:' ( (lv_interfaceType_6_0= ruleInterfaceType ) )
            {
            otherlv_4=(Token)match(input,16,FOLLOW_21); 

                	newLeafNode(otherlv_4, grammarAccess.getDCLComponentInterfaceAccess().getCommaKeyword_4_0());
                
            otherlv_5=(Token)match(input,38,FOLLOW_22); 

                	newLeafNode(otherlv_5, grammarAccess.getDCLComponentInterfaceAccess().getTypeKeyword_4_1());
                
            // InternalDCL.g:1308:1: ( (lv_interfaceType_6_0= ruleInterfaceType ) )
            // InternalDCL.g:1309:1: (lv_interfaceType_6_0= ruleInterfaceType )
            {
            // InternalDCL.g:1309:1: (lv_interfaceType_6_0= ruleInterfaceType )
            // InternalDCL.g:1310:3: lv_interfaceType_6_0= ruleInterfaceType
            {
             
            	        newCompositeNode(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeInterfaceTypeParserRuleCall_4_2_0()); 
            	    
            pushFollow(FOLLOW_11);
            lv_interfaceType_6_0=ruleInterfaceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDCLComponentInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"interfaceType",
                    		lv_interfaceType_6_0, 
                    		"com.br.terra.dcl.DCL.InterfaceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getDCLComponentInterfaceAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLComponentInterface"


    // $ANTLR start "entryRuleInterfaceType"
    // InternalDCL.g:1338:1: entryRuleInterfaceType returns [EObject current=null] : iv_ruleInterfaceType= ruleInterfaceType EOF ;
    public final EObject entryRuleInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceType = null;


        try {
            // InternalDCL.g:1339:2: (iv_ruleInterfaceType= ruleInterfaceType EOF )
            // InternalDCL.g:1340:2: iv_ruleInterfaceType= ruleInterfaceType EOF
            {
             newCompositeNode(grammarAccess.getInterfaceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceType=ruleInterfaceType();

            state._fsp--;

             current =iv_ruleInterfaceType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceType"


    // $ANTLR start "ruleInterfaceType"
    // InternalDCL.g:1347:1: ruleInterfaceType returns [EObject current=null] : ( ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) ) ) ;
    public final EObject ruleInterfaceType() throws RecognitionException {
        EObject current = null;

        Token lv_interfaceTypeName_0_1=null;
        Token lv_interfaceTypeName_0_2=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:1350:28: ( ( ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) ) ) )
            // InternalDCL.g:1351:1: ( ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) ) )
            {
            // InternalDCL.g:1351:1: ( ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) ) )
            // InternalDCL.g:1352:1: ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) )
            {
            // InternalDCL.g:1352:1: ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) )
            // InternalDCL.g:1353:1: (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' )
            {
            // InternalDCL.g:1353:1: (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            else if ( (LA16_0==40) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDCL.g:1354:3: lv_interfaceTypeName_0_1= 'provided'
                    {
                    lv_interfaceTypeName_0_1=(Token)match(input,39,FOLLOW_2); 

                            newLeafNode(lv_interfaceTypeName_0_1, grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameProvidedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceTypeRule());
                    	        }
                           		setWithLastConsumed(current, "interfaceTypeName", lv_interfaceTypeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalDCL.g:1366:8: lv_interfaceTypeName_0_2= 'required'
                    {
                    lv_interfaceTypeName_0_2=(Token)match(input,40,FOLLOW_2); 

                            newLeafNode(lv_interfaceTypeName_0_2, grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameRequiredKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceTypeRule());
                    	        }
                           		setWithLastConsumed(current, "interfaceTypeName", lv_interfaceTypeName_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceType"


    // $ANTLR start "entryRuleDCLSubSystem"
    // InternalDCL.g:1389:1: entryRuleDCLSubSystem returns [EObject current=null] : iv_ruleDCLSubSystem= ruleDCLSubSystem EOF ;
    public final EObject entryRuleDCLSubSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLSubSystem = null;


        try {
            // InternalDCL.g:1390:2: (iv_ruleDCLSubSystem= ruleDCLSubSystem EOF )
            // InternalDCL.g:1391:2: iv_ruleDCLSubSystem= ruleDCLSubSystem EOF
            {
             newCompositeNode(grammarAccess.getDCLSubSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLSubSystem=ruleDCLSubSystem();

            state._fsp--;

             current =iv_ruleDCLSubSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLSubSystem"


    // $ANTLR start "ruleDCLSubSystem"
    // InternalDCL.g:1398:1: ruleDCLSubSystem returns [EObject current=null] : (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inSubSystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleDCLSubSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:1401:28: ( (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inSubSystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) )
            // InternalDCL.g:1402:1: (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inSubSystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // InternalDCL.g:1402:1: (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inSubSystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            // InternalDCL.g:1402:3: otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inSubSystem:' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLSubSystemAccess().getSubSystemKeyword_0());
                
            // InternalDCL.g:1406:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:1407:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:1407:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:1408:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLSubSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLSubSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDCL.g:1424:2: (otherlv_2= ',' otherlv_3= 'inSubSystem:' ( (otherlv_4= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDCL.g:1424:4: otherlv_2= ',' otherlv_3= 'inSubSystem:' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_18); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLSubSystemAccess().getCommaKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,33,FOLLOW_8); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLSubSystemAccess().getInSubSystemKeyword_2_1());
                        
                    // InternalDCL.g:1432:1: ( (otherlv_4= RULE_ID ) )
                    // InternalDCL.g:1433:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDCL.g:1433:1: (otherlv_4= RULE_ID )
                    // InternalDCL.g:1434:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLSubSystemRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLSubSystemAccess().getSubSystemDCLSubSystemCrossReference_2_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getDCLSubSystemAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLSubSystem"


    // $ANTLR start "entryRuleDCLModule"
    // InternalDCL.g:1457:1: entryRuleDCLModule returns [EObject current=null] : iv_ruleDCLModule= ruleDCLModule EOF ;
    public final EObject entryRuleDCLModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLModule = null;


        try {
            // InternalDCL.g:1458:2: (iv_ruleDCLModule= ruleDCLModule EOF )
            // InternalDCL.g:1459:2: iv_ruleDCLModule= ruleDCLModule EOF
            {
             newCompositeNode(grammarAccess.getDCLModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCLModule=ruleDCLModule();

            state._fsp--;

             current =iv_ruleDCLModule; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLModule"


    // $ANTLR start "ruleDCLModule"
    // InternalDCL.g:1466:1: ruleDCLModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDCLModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:1469:28: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalDCL.g:1470:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalDCL.g:1470:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalDCL.g:1470:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLModuleAccess().getModuleKeyword_0());
                
            // InternalDCL.g:1474:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:1475:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:1475:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:1476:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLModuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getDCLModuleAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLModule"


    // $ANTLR start "entryRuleDCDecl"
    // InternalDCL.g:1504:1: entryRuleDCDecl returns [EObject current=null] : iv_ruleDCDecl= ruleDCDecl EOF ;
    public final EObject entryRuleDCDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCDecl = null;


        try {
            // InternalDCL.g:1505:2: (iv_ruleDCDecl= ruleDCDecl EOF )
            // InternalDCL.g:1506:2: iv_ruleDCDecl= ruleDCDecl EOF
            {
             newCompositeNode(grammarAccess.getDCDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDCDecl=ruleDCDecl();

            state._fsp--;

             current =iv_ruleDCDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCDecl"


    // $ANTLR start "ruleDCDecl"
    // InternalDCL.g:1513:1: ruleDCDecl returns [EObject current=null] : ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) ) ;
    public final EObject ruleDCDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        EObject lv_only_0_0 = null;

        EObject lv_can_2_0 = null;

        EObject lv_elementType_3_0 = null;

        EObject lv_cannot_7_0 = null;

        EObject lv_elementType_8_0 = null;

        EObject lv_can_12_0 = null;

        EObject lv_elementType_13_0 = null;

        EObject lv_can_17_0 = null;

        EObject lv_elementType_18_0 = null;

        EObject lv_only2_19_0 = null;

        EObject lv_must_23_0 = null;

        EObject lv_entityType_24_0 = null;


         enterRule(); 
            
        try {
            // InternalDCL.g:1516:28: ( ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) ) )
            // InternalDCL.g:1517:1: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) )
            {
            // InternalDCL.g:1517:1: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) )
            int alt18=5;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalDCL.g:1517:2: ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    {
                    // InternalDCL.g:1517:2: ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    // InternalDCL.g:1517:3: ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
                    {
                    // InternalDCL.g:1517:3: ( (lv_only_0_0= ruleOnly ) )
                    // InternalDCL.g:1518:1: (lv_only_0_0= ruleOnly )
                    {
                    // InternalDCL.g:1518:1: (lv_only_0_0= ruleOnly )
                    // InternalDCL.g:1519:3: lv_only_0_0= ruleOnly
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getOnlyOnlyParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_8);
                    lv_only_0_0=ruleOnly();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"only",
                            		lv_only_0_0, 
                            		"com.br.terra.dcl.DCL.Only");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDCL.g:1535:2: ( (otherlv_1= RULE_ID ) )
                    // InternalDCL.g:1536:1: (otherlv_1= RULE_ID )
                    {
                    // InternalDCL.g:1536:1: (otherlv_1= RULE_ID )
                    // InternalDCL.g:1537:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

                    		newLeafNode(otherlv_1, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_0_1_0()); 
                    	

                    }


                    }

                    // InternalDCL.g:1548:2: ( (lv_can_2_0= ruleCan ) )
                    // InternalDCL.g:1549:1: (lv_can_2_0= ruleCan )
                    {
                    // InternalDCL.g:1549:1: (lv_can_2_0= ruleCan )
                    // InternalDCL.g:1550:3: lv_can_2_0= ruleCan
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_24);
                    lv_can_2_0=ruleCan();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"can",
                            		lv_can_2_0, 
                            		"com.br.terra.dcl.DCL.Can");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDCL.g:1566:2: ( (lv_elementType_3_0= ruleElementType ) )
                    // InternalDCL.g:1567:1: (lv_elementType_3_0= ruleElementType )
                    {
                    // InternalDCL.g:1567:1: (lv_elementType_3_0= ruleElementType )
                    // InternalDCL.g:1568:3: lv_elementType_3_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_8);
                    lv_elementType_3_0=ruleElementType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_3_0, 
                            		"com.br.terra.dcl.DCL.ElementType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDCL.g:1584:2: ( (otherlv_4= RULE_ID ) )
                    // InternalDCL.g:1585:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDCL.g:1585:1: (otherlv_4= RULE_ID )
                    // InternalDCL.g:1586:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_0_4_0()); 
                    	

                    }


                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_5, grammarAccess.getDCDeclAccess().getSemicolonKeyword_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalDCL.g:1602:6: ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
                    {
                    // InternalDCL.g:1602:6: ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
                    // InternalDCL.g:1602:7: ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';'
                    {
                    // InternalDCL.g:1602:7: ( (otherlv_6= RULE_ID ) )
                    // InternalDCL.g:1603:1: (otherlv_6= RULE_ID )
                    {
                    // InternalDCL.g:1603:1: (otherlv_6= RULE_ID )
                    // InternalDCL.g:1604:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_25); 

                    		newLeafNode(otherlv_6, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_1_0_0()); 
                    	

                    }


                    }

                    // InternalDCL.g:1615:2: ( (lv_cannot_7_0= ruleCannot ) )
                    // InternalDCL.g:1616:1: (lv_cannot_7_0= ruleCannot )
                    {
                    // InternalDCL.g:1616:1: (lv_cannot_7_0= ruleCannot )
                    // InternalDCL.g:1617:3: lv_cannot_7_0= ruleCannot
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCannotCannotParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_24);
                    lv_cannot_7_0=ruleCannot();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"cannot",
                            		lv_cannot_7_0, 
                            		"com.br.terra.dcl.DCL.Cannot");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDCL.g:1633:2: ( (lv_elementType_8_0= ruleElementType ) )
                    // InternalDCL.g:1634:1: (lv_elementType_8_0= ruleElementType )
                    {
                    // InternalDCL.g:1634:1: (lv_elementType_8_0= ruleElementType )
                    // InternalDCL.g:1635:3: lv_elementType_8_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_8);
                    lv_elementType_8_0=ruleElementType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_8_0, 
                            		"com.br.terra.dcl.DCL.ElementType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDCL.g:1651:2: ( (otherlv_9= RULE_ID ) )
                    // InternalDCL.g:1652:1: (otherlv_9= RULE_ID )
                    {
                    // InternalDCL.g:1652:1: (otherlv_9= RULE_ID )
                    // InternalDCL.g:1653:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_9, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_1_3_0()); 
                    	

                    }


                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_10, grammarAccess.getDCDeclAccess().getSemicolonKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalDCL.g:1669:6: ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' )
                    {
                    // InternalDCL.g:1669:6: ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' )
                    // InternalDCL.g:1669:7: ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';'
                    {
                    // InternalDCL.g:1669:7: ( (otherlv_11= RULE_ID ) )
                    // InternalDCL.g:1670:1: (otherlv_11= RULE_ID )
                    {
                    // InternalDCL.g:1670:1: (otherlv_11= RULE_ID )
                    // InternalDCL.g:1671:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_23); 

                    		newLeafNode(otherlv_11, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_2_0_0()); 
                    	

                    }


                    }

                    // InternalDCL.g:1682:2: ( (lv_can_12_0= ruleCan ) )
                    // InternalDCL.g:1683:1: (lv_can_12_0= ruleCan )
                    {
                    // InternalDCL.g:1683:1: (lv_can_12_0= ruleCan )
                    // InternalDCL.g:1684:3: lv_can_12_0= ruleCan
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_24);
                    lv_can_12_0=ruleCan();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"can",
                            		lv_can_12_0, 
                            		"com.br.terra.dcl.DCL.Can");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDCL.g:1700:2: ( (lv_elementType_13_0= ruleElementType ) )
                    // InternalDCL.g:1701:1: (lv_elementType_13_0= ruleElementType )
                    {
                    // InternalDCL.g:1701:1: (lv_elementType_13_0= ruleElementType )
                    // InternalDCL.g:1702:3: lv_elementType_13_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_8);
                    lv_elementType_13_0=ruleElementType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_13_0, 
                            		"com.br.terra.dcl.DCL.ElementType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDCL.g:1718:2: ( (otherlv_14= RULE_ID ) )
                    // InternalDCL.g:1719:1: (otherlv_14= RULE_ID )
                    {
                    // InternalDCL.g:1719:1: (otherlv_14= RULE_ID )
                    // InternalDCL.g:1720:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_14, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_2_3_0()); 
                    	

                    }


                    }

                    otherlv_15=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_15, grammarAccess.getDCDeclAccess().getSemicolonKeyword_2_4());
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalDCL.g:1736:6: ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
                    {
                    // InternalDCL.g:1736:6: ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
                    // InternalDCL.g:1736:7: ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';'
                    {
                    // InternalDCL.g:1736:7: ( (otherlv_16= RULE_ID ) )
                    // InternalDCL.g:1737:1: (otherlv_16= RULE_ID )
                    {
                    // InternalDCL.g:1737:1: (otherlv_16= RULE_ID )
                    // InternalDCL.g:1738:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_23); 

                    		newLeafNode(otherlv_16, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // InternalDCL.g:1749:2: ( (lv_can_17_0= ruleCan ) )
                    // InternalDCL.g:1750:1: (lv_can_17_0= ruleCan )
                    {
                    // InternalDCL.g:1750:1: (lv_can_17_0= ruleCan )
                    // InternalDCL.g:1751:3: lv_can_17_0= ruleCan
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_24);
                    lv_can_17_0=ruleCan();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"can",
                            		lv_can_17_0, 
                            		"com.br.terra.dcl.DCL.Can");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDCL.g:1767:2: ( (lv_elementType_18_0= ruleElementType ) )
                    // InternalDCL.g:1768:1: (lv_elementType_18_0= ruleElementType )
                    {
                    // InternalDCL.g:1768:1: (lv_elementType_18_0= ruleElementType )
                    // InternalDCL.g:1769:3: lv_elementType_18_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_26);
                    lv_elementType_18_0=ruleElementType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_18_0, 
                            		"com.br.terra.dcl.DCL.ElementType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDCL.g:1785:2: ( (lv_only2_19_0= ruleOnly2 ) )
                    // InternalDCL.g:1786:1: (lv_only2_19_0= ruleOnly2 )
                    {
                    // InternalDCL.g:1786:1: (lv_only2_19_0= ruleOnly2 )
                    // InternalDCL.g:1787:3: lv_only2_19_0= ruleOnly2
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getOnly2Only2ParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_8);
                    lv_only2_19_0=ruleOnly2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"only2",
                            		lv_only2_19_0, 
                            		"com.br.terra.dcl.DCL.Only2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDCL.g:1803:2: ( (otherlv_20= RULE_ID ) )
                    // InternalDCL.g:1804:1: (otherlv_20= RULE_ID )
                    {
                    // InternalDCL.g:1804:1: (otherlv_20= RULE_ID )
                    // InternalDCL.g:1805:3: otherlv_20= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_20, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_3_4_0()); 
                    	

                    }


                    }

                    otherlv_21=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_21, grammarAccess.getDCDeclAccess().getSemicolonKeyword_3_5());
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalDCL.g:1821:6: ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' )
                    {
                    // InternalDCL.g:1821:6: ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' )
                    // InternalDCL.g:1821:7: ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';'
                    {
                    // InternalDCL.g:1821:7: ( (otherlv_22= RULE_ID ) )
                    // InternalDCL.g:1822:1: (otherlv_22= RULE_ID )
                    {
                    // InternalDCL.g:1822:1: (otherlv_22= RULE_ID )
                    // InternalDCL.g:1823:3: otherlv_22= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_27); 

                    		newLeafNode(otherlv_22, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_4_0_0()); 
                    	

                    }


                    }

                    // InternalDCL.g:1834:2: ( (lv_must_23_0= ruleMust ) )
                    // InternalDCL.g:1835:1: (lv_must_23_0= ruleMust )
                    {
                    // InternalDCL.g:1835:1: (lv_must_23_0= ruleMust )
                    // InternalDCL.g:1836:3: lv_must_23_0= ruleMust
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getMustMustParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_24);
                    lv_must_23_0=ruleMust();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"must",
                            		lv_must_23_0, 
                            		"com.br.terra.dcl.DCL.Must");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDCL.g:1852:2: ( (lv_entityType_24_0= ruleEntityType ) )
                    // InternalDCL.g:1853:1: (lv_entityType_24_0= ruleEntityType )
                    {
                    // InternalDCL.g:1853:1: (lv_entityType_24_0= ruleEntityType )
                    // InternalDCL.g:1854:3: lv_entityType_24_0= ruleEntityType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getEntityTypeEntityTypeParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_8);
                    lv_entityType_24_0=ruleEntityType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"entityType",
                            		lv_entityType_24_0, 
                            		"com.br.terra.dcl.DCL.EntityType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDCL.g:1870:2: ( (otherlv_25= RULE_ID ) )
                    // InternalDCL.g:1871:1: (otherlv_25= RULE_ID )
                    {
                    // InternalDCL.g:1871:1: (otherlv_25= RULE_ID )
                    // InternalDCL.g:1872:3: otherlv_25= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_25, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_4_3_0()); 
                    	

                    }


                    }

                    otherlv_26=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_26, grammarAccess.getDCDeclAccess().getSemicolonKeyword_4_4());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCDecl"


    // $ANTLR start "entryRuleOnly"
    // InternalDCL.g:1895:1: entryRuleOnly returns [EObject current=null] : iv_ruleOnly= ruleOnly EOF ;
    public final EObject entryRuleOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnly = null;


        try {
            // InternalDCL.g:1896:2: (iv_ruleOnly= ruleOnly EOF )
            // InternalDCL.g:1897:2: iv_ruleOnly= ruleOnly EOF
            {
             newCompositeNode(grammarAccess.getOnlyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnly=ruleOnly();

            state._fsp--;

             current =iv_ruleOnly; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnly"


    // $ANTLR start "ruleOnly"
    // InternalDCL.g:1904:1: ruleOnly returns [EObject current=null] : ( (lv_only_0_0= 'only' ) ) ;
    public final EObject ruleOnly() throws RecognitionException {
        EObject current = null;

        Token lv_only_0_0=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:1907:28: ( ( (lv_only_0_0= 'only' ) ) )
            // InternalDCL.g:1908:1: ( (lv_only_0_0= 'only' ) )
            {
            // InternalDCL.g:1908:1: ( (lv_only_0_0= 'only' ) )
            // InternalDCL.g:1909:1: (lv_only_0_0= 'only' )
            {
            // InternalDCL.g:1909:1: (lv_only_0_0= 'only' )
            // InternalDCL.g:1910:3: lv_only_0_0= 'only'
            {
            lv_only_0_0=(Token)match(input,43,FOLLOW_2); 

                    newLeafNode(lv_only_0_0, grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOnlyRule());
            	        }
                   		setWithLastConsumed(current, "only", lv_only_0_0, "only");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnly"


    // $ANTLR start "entryRuleCan"
    // InternalDCL.g:1931:1: entryRuleCan returns [EObject current=null] : iv_ruleCan= ruleCan EOF ;
    public final EObject entryRuleCan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCan = null;


        try {
            // InternalDCL.g:1932:2: (iv_ruleCan= ruleCan EOF )
            // InternalDCL.g:1933:2: iv_ruleCan= ruleCan EOF
            {
             newCompositeNode(grammarAccess.getCanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCan=ruleCan();

            state._fsp--;

             current =iv_ruleCan; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCan"


    // $ANTLR start "ruleCan"
    // InternalDCL.g:1940:1: ruleCan returns [EObject current=null] : ( (lv_can_0_0= 'can-' ) ) ;
    public final EObject ruleCan() throws RecognitionException {
        EObject current = null;

        Token lv_can_0_0=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:1943:28: ( ( (lv_can_0_0= 'can-' ) ) )
            // InternalDCL.g:1944:1: ( (lv_can_0_0= 'can-' ) )
            {
            // InternalDCL.g:1944:1: ( (lv_can_0_0= 'can-' ) )
            // InternalDCL.g:1945:1: (lv_can_0_0= 'can-' )
            {
            // InternalDCL.g:1945:1: (lv_can_0_0= 'can-' )
            // InternalDCL.g:1946:3: lv_can_0_0= 'can-'
            {
            lv_can_0_0=(Token)match(input,44,FOLLOW_2); 

                    newLeafNode(lv_can_0_0, grammarAccess.getCanAccess().getCanCanKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCanRule());
            	        }
                   		setWithLastConsumed(current, "can", lv_can_0_0, "can-");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCan"


    // $ANTLR start "entryRuleCannot"
    // InternalDCL.g:1967:1: entryRuleCannot returns [EObject current=null] : iv_ruleCannot= ruleCannot EOF ;
    public final EObject entryRuleCannot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCannot = null;


        try {
            // InternalDCL.g:1968:2: (iv_ruleCannot= ruleCannot EOF )
            // InternalDCL.g:1969:2: iv_ruleCannot= ruleCannot EOF
            {
             newCompositeNode(grammarAccess.getCannotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCannot=ruleCannot();

            state._fsp--;

             current =iv_ruleCannot; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCannot"


    // $ANTLR start "ruleCannot"
    // InternalDCL.g:1976:1: ruleCannot returns [EObject current=null] : ( (lv_cannot_0_0= 'cannot-' ) ) ;
    public final EObject ruleCannot() throws RecognitionException {
        EObject current = null;

        Token lv_cannot_0_0=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:1979:28: ( ( (lv_cannot_0_0= 'cannot-' ) ) )
            // InternalDCL.g:1980:1: ( (lv_cannot_0_0= 'cannot-' ) )
            {
            // InternalDCL.g:1980:1: ( (lv_cannot_0_0= 'cannot-' ) )
            // InternalDCL.g:1981:1: (lv_cannot_0_0= 'cannot-' )
            {
            // InternalDCL.g:1981:1: (lv_cannot_0_0= 'cannot-' )
            // InternalDCL.g:1982:3: lv_cannot_0_0= 'cannot-'
            {
            lv_cannot_0_0=(Token)match(input,45,FOLLOW_2); 

                    newLeafNode(lv_cannot_0_0, grammarAccess.getCannotAccess().getCannotCannotKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCannotRule());
            	        }
                   		setWithLastConsumed(current, "cannot", lv_cannot_0_0, "cannot-");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCannot"


    // $ANTLR start "entryRuleOnly2"
    // InternalDCL.g:2003:1: entryRuleOnly2 returns [EObject current=null] : iv_ruleOnly2= ruleOnly2 EOF ;
    public final EObject entryRuleOnly2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnly2 = null;


        try {
            // InternalDCL.g:2004:2: (iv_ruleOnly2= ruleOnly2 EOF )
            // InternalDCL.g:2005:2: iv_ruleOnly2= ruleOnly2 EOF
            {
             newCompositeNode(grammarAccess.getOnly2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnly2=ruleOnly2();

            state._fsp--;

             current =iv_ruleOnly2; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnly2"


    // $ANTLR start "ruleOnly2"
    // InternalDCL.g:2012:1: ruleOnly2 returns [EObject current=null] : ( (lv_only2_0_0= '-only' ) ) ;
    public final EObject ruleOnly2() throws RecognitionException {
        EObject current = null;

        Token lv_only2_0_0=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:2015:28: ( ( (lv_only2_0_0= '-only' ) ) )
            // InternalDCL.g:2016:1: ( (lv_only2_0_0= '-only' ) )
            {
            // InternalDCL.g:2016:1: ( (lv_only2_0_0= '-only' ) )
            // InternalDCL.g:2017:1: (lv_only2_0_0= '-only' )
            {
            // InternalDCL.g:2017:1: (lv_only2_0_0= '-only' )
            // InternalDCL.g:2018:3: lv_only2_0_0= '-only'
            {
            lv_only2_0_0=(Token)match(input,46,FOLLOW_2); 

                    newLeafNode(lv_only2_0_0, grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOnly2Rule());
            	        }
                   		setWithLastConsumed(current, "only2", lv_only2_0_0, "-only");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnly2"


    // $ANTLR start "entryRuleMust"
    // InternalDCL.g:2039:1: entryRuleMust returns [EObject current=null] : iv_ruleMust= ruleMust EOF ;
    public final EObject entryRuleMust() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMust = null;


        try {
            // InternalDCL.g:2040:2: (iv_ruleMust= ruleMust EOF )
            // InternalDCL.g:2041:2: iv_ruleMust= ruleMust EOF
            {
             newCompositeNode(grammarAccess.getMustRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMust=ruleMust();

            state._fsp--;

             current =iv_ruleMust; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMust"


    // $ANTLR start "ruleMust"
    // InternalDCL.g:2048:1: ruleMust returns [EObject current=null] : ( (lv_must_0_0= 'must-' ) ) ;
    public final EObject ruleMust() throws RecognitionException {
        EObject current = null;

        Token lv_must_0_0=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:2051:28: ( ( (lv_must_0_0= 'must-' ) ) )
            // InternalDCL.g:2052:1: ( (lv_must_0_0= 'must-' ) )
            {
            // InternalDCL.g:2052:1: ( (lv_must_0_0= 'must-' ) )
            // InternalDCL.g:2053:1: (lv_must_0_0= 'must-' )
            {
            // InternalDCL.g:2053:1: (lv_must_0_0= 'must-' )
            // InternalDCL.g:2054:3: lv_must_0_0= 'must-'
            {
            lv_must_0_0=(Token)match(input,47,FOLLOW_2); 

                    newLeafNode(lv_must_0_0, grammarAccess.getMustAccess().getMustMustKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMustRule());
            	        }
                   		setWithLastConsumed(current, "must", lv_must_0_0, "must-");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMust"


    // $ANTLR start "entryRuleElementType"
    // InternalDCL.g:2075:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // InternalDCL.g:2076:2: (iv_ruleElementType= ruleElementType EOF )
            // InternalDCL.g:2077:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalDCL.g:2084:1: ruleElementType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_EntityType_1 = null;


         enterRule(); 
            
        try {
            // InternalDCL.g:2087:28: ( (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) )
            // InternalDCL.g:2088:1: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            {
            // InternalDCL.g:2088:1: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=48 && LA19_0<=52)) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=53 && LA19_0<=57)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalDCL.g:2089:5: this_BasicType_0= ruleBasicType
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;

                     
                            current = this_BasicType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDCL.g:2099:5: this_EntityType_1= ruleEntityType
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_EntityType_1=ruleEntityType();

                    state._fsp--;

                     
                            current = this_EntityType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleBasicType"
    // InternalDCL.g:2115:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalDCL.g:2116:2: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalDCL.g:2117:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalDCL.g:2124:1: ruleBasicType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;
        Token lv_typeName_0_5=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:2127:28: ( ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) ) )
            // InternalDCL.g:2128:1: ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) )
            {
            // InternalDCL.g:2128:1: ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) )
            // InternalDCL.g:2129:1: ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) )
            {
            // InternalDCL.g:2129:1: ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) )
            // InternalDCL.g:2130:1: (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' )
            {
            // InternalDCL.g:2130:1: (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt20=1;
                }
                break;
            case 49:
                {
                alt20=2;
                }
                break;
            case 50:
                {
                alt20=3;
                }
                break;
            case 51:
                {
                alt20=4;
                }
                break;
            case 52:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalDCL.g:2131:3: lv_typeName_0_1= 'access'
                    {
                    lv_typeName_0_1=(Token)match(input,48,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_1, grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalDCL.g:2143:8: lv_typeName_0_2= 'declare'
                    {
                    lv_typeName_0_2=(Token)match(input,49,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_2, grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalDCL.g:2155:8: lv_typeName_0_3= 'handle'
                    {
                    lv_typeName_0_3=(Token)match(input,50,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_3, grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // InternalDCL.g:2167:8: lv_typeName_0_4= 'create'
                    {
                    lv_typeName_0_4=(Token)match(input,51,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_4, grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // InternalDCL.g:2179:8: lv_typeName_0_5= 'depend'
                    {
                    lv_typeName_0_5=(Token)match(input,52,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_5, grammarAccess.getBasicTypeAccess().getTypeNameDependKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_5, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleEntityType"
    // InternalDCL.g:2202:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // InternalDCL.g:2203:2: (iv_ruleEntityType= ruleEntityType EOF )
            // InternalDCL.g:2204:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalDCL.g:2211:1: ruleEntityType returns [EObject current=null] : ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_entity_0_1=null;
        Token lv_entity_0_2=null;
        Token lv_entity_0_3=null;
        Token lv_entity_0_4=null;
        Token lv_entity_0_5=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:2214:28: ( ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) ) )
            // InternalDCL.g:2215:1: ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) )
            {
            // InternalDCL.g:2215:1: ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) )
            // InternalDCL.g:2216:1: ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) )
            {
            // InternalDCL.g:2216:1: ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) )
            // InternalDCL.g:2217:1: (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' )
            {
            // InternalDCL.g:2217:1: (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt21=1;
                }
                break;
            case 54:
                {
                alt21=2;
                }
                break;
            case 55:
                {
                alt21=3;
                }
                break;
            case 56:
                {
                alt21=4;
                }
                break;
            case 57:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalDCL.g:2218:3: lv_entity_0_1= 'extend'
                    {
                    lv_entity_0_1=(Token)match(input,53,FOLLOW_2); 

                            newLeafNode(lv_entity_0_1, grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalDCL.g:2230:8: lv_entity_0_2= 'implement'
                    {
                    lv_entity_0_2=(Token)match(input,54,FOLLOW_2); 

                            newLeafNode(lv_entity_0_2, grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalDCL.g:2242:8: lv_entity_0_3= 'derive'
                    {
                    lv_entity_0_3=(Token)match(input,55,FOLLOW_2); 

                            newLeafNode(lv_entity_0_3, grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // InternalDCL.g:2254:8: lv_entity_0_4= 'throw'
                    {
                    lv_entity_0_4=(Token)match(input,56,FOLLOW_2); 

                            newLeafNode(lv_entity_0_4, grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // InternalDCL.g:2266:8: lv_entity_0_5= 'useannotation'
                    {
                    lv_entity_0_5=(Token)match(input,57,FOLLOW_2); 

                            newLeafNode(lv_entity_0_5, grammarAccess.getEntityTypeAccess().getEntityUseannotationKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_5, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityType"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\54\1\60\2\uffff\12\4\2\uffff";
    static final String dfa_3s = "\1\53\1\uffff\1\57\1\71\2\uffff\12\56\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\2\uffff\1\5\1\2\12\uffff\1\3\1\4";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\46\uffff\1\1",
            "",
            "\1\3\1\5\1\uffff\1\4",
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "",
            "",
            "\1\20\51\uffff\1\21",
            "\1\20\51\uffff\1\21",
            "\1\20\51\uffff\1\21",
            "\1\20\51\uffff\1\21",
            "\1\20\51\uffff\1\21",
            "\1\20\51\uffff\1\21",
            "\1\20\51\uffff\1\21",
            "\1\20\51\uffff\1\21",
            "\1\20\51\uffff\1\21",
            "\1\20\51\uffff\1\21",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1517:1: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000006185FE88000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000006185FE8A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080000002010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x03FF000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});

}