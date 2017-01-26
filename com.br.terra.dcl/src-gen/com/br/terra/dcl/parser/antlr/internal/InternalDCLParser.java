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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'architeturalElements'", "'{'", "'}'", "'restrictions'", "'layer'", "','", "'level'", "'inLayer: '", "'inSubSystem: '", "'inComponent: '", "';'", "'component'", "'interface'", "'ofComponent '", "'type: '", "'provided'", "'required'", "'subSystem'", "'module'", "'only'", "'can-'", "'cannot-'", "'-only'", "'must-'", "'access'", "'declare'", "'handle'", "'create'", "'depend'", "'extend'", "'implement'", "'derive'", "'throw'", "'useannotation'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int T__44=44;
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
    // InternalDCL.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' ) ;
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
            // InternalDCL.g:79:28: ( (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' ) )
            // InternalDCL.g:80:1: (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' )
            {
            // InternalDCL.g:80:1: (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' )
            // InternalDCL.g:80:3: otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getArchiteturalElementsKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalDCL.g:88:1: ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||(LA1_0>=22 && LA1_0<=23)||(LA1_0>=28 && LA1_0<=29)) ) {
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

                if ( (LA2_0==RULE_ID||LA2_0==30) ) {
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
    // InternalDCL.g:157:1: ruleDCLStructureElement returns [EObject current=null] : (this_DCLLayer_0= ruleDCLLayer | this_DCLComponent_1= ruleDCLComponent | this_DCLSubSystem_2= ruleDCLSubSystem | this_DCLModule_3= ruleDCLModule | this_DCLComponentInterface_4= ruleDCLComponentInterface ) ;
    public final EObject ruleDCLStructureElement() throws RecognitionException {
        EObject current = null;

        EObject this_DCLLayer_0 = null;

        EObject this_DCLComponent_1 = null;

        EObject this_DCLSubSystem_2 = null;

        EObject this_DCLModule_3 = null;

        EObject this_DCLComponentInterface_4 = null;


         enterRule(); 
            
        try {
            // InternalDCL.g:160:28: ( (this_DCLLayer_0= ruleDCLLayer | this_DCLComponent_1= ruleDCLComponent | this_DCLSubSystem_2= ruleDCLSubSystem | this_DCLModule_3= ruleDCLModule | this_DCLComponentInterface_4= ruleDCLComponentInterface ) )
            // InternalDCL.g:161:1: (this_DCLLayer_0= ruleDCLLayer | this_DCLComponent_1= ruleDCLComponent | this_DCLSubSystem_2= ruleDCLSubSystem | this_DCLModule_3= ruleDCLModule | this_DCLComponentInterface_4= ruleDCLComponentInterface )
            {
            // InternalDCL.g:161:1: (this_DCLLayer_0= ruleDCLLayer | this_DCLComponent_1= ruleDCLComponent | this_DCLSubSystem_2= ruleDCLSubSystem | this_DCLModule_3= ruleDCLModule | this_DCLComponentInterface_4= ruleDCLComponentInterface )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case 29:
                {
                alt3=4;
                }
                break;
            case 23:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDCL.g:162:5: this_DCLLayer_0= ruleDCLLayer
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLLayerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLLayer_0=ruleDCLLayer();

                    state._fsp--;

                     
                            current = this_DCLLayer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDCL.g:172:5: this_DCLComponent_1= ruleDCLComponent
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLComponentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLComponent_1=ruleDCLComponent();

                    state._fsp--;

                     
                            current = this_DCLComponent_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalDCL.g:182:5: this_DCLSubSystem_2= ruleDCLSubSystem
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLSubSystemParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLSubSystem_2=ruleDCLSubSystem();

                    state._fsp--;

                     
                            current = this_DCLSubSystem_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalDCL.g:192:5: this_DCLModule_3= ruleDCLModule
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLModuleParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLModule_3=ruleDCLModule();

                    state._fsp--;

                     
                            current = this_DCLModule_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalDCL.g:202:5: this_DCLComponentInterface_4= ruleDCLComponentInterface
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLComponentInterfaceParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DCLComponentInterface_4=ruleDCLComponentInterface();

                    state._fsp--;

                     
                            current = this_DCLComponentInterface_4; 
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


    // $ANTLR start "entryRuleDCLLayer"
    // InternalDCL.g:218:1: entryRuleDCLLayer returns [EObject current=null] : iv_ruleDCLLayer= ruleDCLLayer EOF ;
    public final EObject entryRuleDCLLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLLayer = null;


        try {
            // InternalDCL.g:219:2: (iv_ruleDCLLayer= ruleDCLLayer EOF )
            // InternalDCL.g:220:2: iv_ruleDCLLayer= ruleDCLLayer EOF
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
    // InternalDCL.g:227:1: ruleDCLLayer returns [EObject current=null] : (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) ( (otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= ';' ) ;
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
            // InternalDCL.g:230:28: ( (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) ( (otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= ';' ) )
            // InternalDCL.g:231:1: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) ( (otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= ';' )
            {
            // InternalDCL.g:231:1: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) ( (otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= ';' )
            // InternalDCL.g:231:3: otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) ( (otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLLayerAccess().getLayerKeyword_0());
                
            // InternalDCL.g:235:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:236:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:236:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:237:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_10); 

                	newLeafNode(otherlv_2, grammarAccess.getDCLLayerAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,17,FOLLOW_11); 

                	newLeafNode(otherlv_3, grammarAccess.getDCLLayerAccess().getLevelKeyword_3());
                
            // InternalDCL.g:261:1: ( (lv_level_4_0= RULE_INT ) )
            // InternalDCL.g:262:1: (lv_level_4_0= RULE_INT )
            {
            // InternalDCL.g:262:1: (lv_level_4_0= RULE_INT )
            // InternalDCL.g:263:3: lv_level_4_0= RULE_INT
            {
            lv_level_4_0=(Token)match(input,RULE_INT,FOLLOW_12); 

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

            // InternalDCL.g:279:2: ( (otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) ) ) )?
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                switch ( input.LA(2) ) {
                    case 18:
                        {
                        alt4=1;
                        }
                        break;
                    case 19:
                        {
                        alt4=2;
                        }
                        break;
                    case 20:
                        {
                        alt4=3;
                        }
                        break;
                }

            }
            switch (alt4) {
                case 1 :
                    // InternalDCL.g:279:3: (otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalDCL.g:279:3: (otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) ) )
                    // InternalDCL.g:279:5: otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_13); 

                        	newLeafNode(otherlv_5, grammarAccess.getDCLLayerAccess().getCommaKeyword_5_0_0());
                        
                    otherlv_6=(Token)match(input,18,FOLLOW_8); 

                        	newLeafNode(otherlv_6, grammarAccess.getDCLLayerAccess().getInLayerKeyword_5_0_1());
                        
                    // InternalDCL.g:287:1: ( (otherlv_7= RULE_ID ) )
                    // InternalDCL.g:288:1: (otherlv_7= RULE_ID )
                    {
                    // InternalDCL.g:288:1: (otherlv_7= RULE_ID )
                    // InternalDCL.g:289:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLLayerRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_14); 

                    		newLeafNode(otherlv_7, grammarAccess.getDCLLayerAccess().getLayerDCLStructureElementCrossReference_5_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDCL.g:301:6: (otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) ) )
                    {
                    // InternalDCL.g:301:6: (otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) ) )
                    // InternalDCL.g:301:8: otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_15); 

                        	newLeafNode(otherlv_8, grammarAccess.getDCLLayerAccess().getCommaKeyword_5_1_0());
                        
                    otherlv_9=(Token)match(input,19,FOLLOW_8); 

                        	newLeafNode(otherlv_9, grammarAccess.getDCLLayerAccess().getInSubSystemKeyword_5_1_1());
                        
                    // InternalDCL.g:309:1: ( (otherlv_10= RULE_ID ) )
                    // InternalDCL.g:310:1: (otherlv_10= RULE_ID )
                    {
                    // InternalDCL.g:310:1: (otherlv_10= RULE_ID )
                    // InternalDCL.g:311:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLLayerRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_14); 

                    		newLeafNode(otherlv_10, grammarAccess.getDCLLayerAccess().getSubSystemDCLStructureElementCrossReference_5_1_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDCL.g:323:6: (otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) ) )
                    {
                    // InternalDCL.g:323:6: (otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) ) )
                    // InternalDCL.g:323:8: otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_16); 

                        	newLeafNode(otherlv_11, grammarAccess.getDCLLayerAccess().getCommaKeyword_5_2_0());
                        
                    otherlv_12=(Token)match(input,20,FOLLOW_8); 

                        	newLeafNode(otherlv_12, grammarAccess.getDCLLayerAccess().getInComponentKeyword_5_2_1());
                        
                    // InternalDCL.g:331:1: ( (otherlv_13= RULE_ID ) )
                    // InternalDCL.g:332:1: (otherlv_13= RULE_ID )
                    {
                    // InternalDCL.g:332:1: (otherlv_13= RULE_ID )
                    // InternalDCL.g:333:3: otherlv_13= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLLayerRule());
                    	        }
                            
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_14); 

                    		newLeafNode(otherlv_13, grammarAccess.getDCLLayerAccess().getComponentDCLStructureElementCrossReference_5_2_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDCL.g:356:1: entryRuleDCLComponent returns [EObject current=null] : iv_ruleDCLComponent= ruleDCLComponent EOF ;
    public final EObject entryRuleDCLComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLComponent = null;


        try {
            // InternalDCL.g:357:2: (iv_ruleDCLComponent= ruleDCLComponent EOF )
            // InternalDCL.g:358:2: iv_ruleDCLComponent= ruleDCLComponent EOF
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
    // InternalDCL.g:365:1: ruleDCLComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' ) ;
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
            // InternalDCL.g:368:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' ) )
            // InternalDCL.g:369:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' )
            {
            // InternalDCL.g:369:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' )
            // InternalDCL.g:369:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLComponentAccess().getComponentKeyword_0());
                
            // InternalDCL.g:373:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:374:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:374:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:375:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            // InternalDCL.g:391:2: ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==18) ) {
                    alt5=1;
                }
                else if ( (LA5_1==19) ) {
                    alt5=2;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalDCL.g:391:3: (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalDCL.g:391:3: (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) )
                    // InternalDCL.g:391:5: otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_13); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLComponentAccess().getCommaKeyword_2_0_0());
                        
                    otherlv_3=(Token)match(input,18,FOLLOW_8); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLComponentAccess().getInLayerKeyword_2_0_1());
                        
                    // InternalDCL.g:399:1: ( (otherlv_4= RULE_ID ) )
                    // InternalDCL.g:400:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDCL.g:400:1: (otherlv_4= RULE_ID )
                    // InternalDCL.g:401:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLComponentRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_14); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLComponentAccess().getLayerDCLStructureElementCrossReference_2_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDCL.g:413:6: (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalDCL.g:413:6: (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) )
                    // InternalDCL.g:413:8: otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_15); 

                        	newLeafNode(otherlv_5, grammarAccess.getDCLComponentAccess().getCommaKeyword_2_1_0());
                        
                    otherlv_6=(Token)match(input,19,FOLLOW_8); 

                        	newLeafNode(otherlv_6, grammarAccess.getDCLComponentAccess().getInSubSystemKeyword_2_1_1());
                        
                    // InternalDCL.g:421:1: ( (otherlv_7= RULE_ID ) )
                    // InternalDCL.g:422:1: (otherlv_7= RULE_ID )
                    {
                    // InternalDCL.g:422:1: (otherlv_7= RULE_ID )
                    // InternalDCL.g:423:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLComponentRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_14); 

                    		newLeafNode(otherlv_7, grammarAccess.getDCLComponentAccess().getSubSystemDCLStructureElementCrossReference_2_1_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDCL.g:446:1: entryRuleDCLComponentInterface returns [EObject current=null] : iv_ruleDCLComponentInterface= ruleDCLComponentInterface EOF ;
    public final EObject entryRuleDCLComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLComponentInterface = null;


        try {
            // InternalDCL.g:447:2: (iv_ruleDCLComponentInterface= ruleDCLComponentInterface EOF )
            // InternalDCL.g:448:2: iv_ruleDCLComponentInterface= ruleDCLComponentInterface EOF
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
    // InternalDCL.g:455:1: ruleDCLComponentInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';' ) ;
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
            // InternalDCL.g:458:28: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';' ) )
            // InternalDCL.g:459:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';' )
            {
            // InternalDCL.g:459:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';' )
            // InternalDCL.g:459:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLComponentInterfaceAccess().getInterfaceKeyword_0());
                
            // InternalDCL.g:463:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:464:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:464:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:465:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_8); 

                	newLeafNode(otherlv_2, grammarAccess.getDCLComponentInterfaceAccess().getOfComponentKeyword_2());
                
            // InternalDCL.g:485:1: ( (otherlv_3= RULE_ID ) )
            // InternalDCL.g:486:1: (otherlv_3= RULE_ID )
            {
            // InternalDCL.g:486:1: (otherlv_3= RULE_ID )
            // InternalDCL.g:487:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLComponentInterfaceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            		newLeafNode(otherlv_3, grammarAccess.getDCLComponentInterfaceAccess().getComponentDCLStructureElementCrossReference_3_0()); 
            	

            }


            }

            // InternalDCL.g:498:2: (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) )
            // InternalDCL.g:498:4: otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) )
            {
            otherlv_4=(Token)match(input,16,FOLLOW_18); 

                	newLeafNode(otherlv_4, grammarAccess.getDCLComponentInterfaceAccess().getCommaKeyword_4_0());
                
            otherlv_5=(Token)match(input,25,FOLLOW_19); 

                	newLeafNode(otherlv_5, grammarAccess.getDCLComponentInterfaceAccess().getTypeKeyword_4_1());
                
            // InternalDCL.g:506:1: ( (lv_interfaceType_6_0= ruleInterfaceType ) )
            // InternalDCL.g:507:1: (lv_interfaceType_6_0= ruleInterfaceType )
            {
            // InternalDCL.g:507:1: (lv_interfaceType_6_0= ruleInterfaceType )
            // InternalDCL.g:508:3: lv_interfaceType_6_0= ruleInterfaceType
            {
             
            	        newCompositeNode(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeInterfaceTypeParserRuleCall_4_2_0()); 
            	    
            pushFollow(FOLLOW_14);
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

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDCL.g:536:1: entryRuleInterfaceType returns [EObject current=null] : iv_ruleInterfaceType= ruleInterfaceType EOF ;
    public final EObject entryRuleInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceType = null;


        try {
            // InternalDCL.g:537:2: (iv_ruleInterfaceType= ruleInterfaceType EOF )
            // InternalDCL.g:538:2: iv_ruleInterfaceType= ruleInterfaceType EOF
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
    // InternalDCL.g:545:1: ruleInterfaceType returns [EObject current=null] : ( ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) ) ) ;
    public final EObject ruleInterfaceType() throws RecognitionException {
        EObject current = null;

        Token lv_interfaceTypeName_0_1=null;
        Token lv_interfaceTypeName_0_2=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:548:28: ( ( ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) ) ) )
            // InternalDCL.g:549:1: ( ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) ) )
            {
            // InternalDCL.g:549:1: ( ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) ) )
            // InternalDCL.g:550:1: ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) )
            {
            // InternalDCL.g:550:1: ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) )
            // InternalDCL.g:551:1: (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' )
            {
            // InternalDCL.g:551:1: (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            else if ( (LA6_0==27) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDCL.g:552:3: lv_interfaceTypeName_0_1= 'provided'
                    {
                    lv_interfaceTypeName_0_1=(Token)match(input,26,FOLLOW_2); 

                            newLeafNode(lv_interfaceTypeName_0_1, grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameProvidedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceTypeRule());
                    	        }
                           		setWithLastConsumed(current, "interfaceTypeName", lv_interfaceTypeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalDCL.g:564:8: lv_interfaceTypeName_0_2= 'required'
                    {
                    lv_interfaceTypeName_0_2=(Token)match(input,27,FOLLOW_2); 

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
    // InternalDCL.g:587:1: entryRuleDCLSubSystem returns [EObject current=null] : iv_ruleDCLSubSystem= ruleDCLSubSystem EOF ;
    public final EObject entryRuleDCLSubSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLSubSystem = null;


        try {
            // InternalDCL.g:588:2: (iv_ruleDCLSubSystem= ruleDCLSubSystem EOF )
            // InternalDCL.g:589:2: iv_ruleDCLSubSystem= ruleDCLSubSystem EOF
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
    // InternalDCL.g:596:1: ruleDCLSubSystem returns [EObject current=null] : (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inSubSystem: ' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) ;
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
            // InternalDCL.g:599:28: ( (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inSubSystem: ' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) )
            // InternalDCL.g:600:1: (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inSubSystem: ' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // InternalDCL.g:600:1: (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inSubSystem: ' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            // InternalDCL.g:600:3: otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inSubSystem: ' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLSubSystemAccess().getSubSystemKeyword_0());
                
            // InternalDCL.g:604:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:605:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:605:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:606:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            // InternalDCL.g:622:2: (otherlv_2= ',' otherlv_3= 'inSubSystem: ' ( (otherlv_4= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDCL.g:622:4: otherlv_2= ',' otherlv_3= 'inSubSystem: ' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_15); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLSubSystemAccess().getCommaKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,19,FOLLOW_8); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLSubSystemAccess().getInSubSystemKeyword_2_1());
                        
                    // InternalDCL.g:630:1: ( (otherlv_4= RULE_ID ) )
                    // InternalDCL.g:631:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDCL.g:631:1: (otherlv_4= RULE_ID )
                    // InternalDCL.g:632:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLSubSystemRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_14); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLSubSystemAccess().getSubSystemDCLStructureElementCrossReference_2_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDCL.g:655:1: entryRuleDCLModule returns [EObject current=null] : iv_ruleDCLModule= ruleDCLModule EOF ;
    public final EObject entryRuleDCLModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLModule = null;


        try {
            // InternalDCL.g:656:2: (iv_ruleDCLModule= ruleDCLModule EOF )
            // InternalDCL.g:657:2: iv_ruleDCLModule= ruleDCLModule EOF
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
    // InternalDCL.g:664:1: ruleDCLModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDCLModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:667:28: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalDCL.g:668:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalDCL.g:668:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalDCL.g:668:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLModuleAccess().getModuleKeyword_0());
                
            // InternalDCL.g:672:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDCL.g:673:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDCL.g:673:1: (lv_name_1_0= RULE_ID )
            // InternalDCL.g:674:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDCL.g:702:1: entryRuleDCDecl returns [EObject current=null] : iv_ruleDCDecl= ruleDCDecl EOF ;
    public final EObject entryRuleDCDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCDecl = null;


        try {
            // InternalDCL.g:703:2: (iv_ruleDCDecl= ruleDCDecl EOF )
            // InternalDCL.g:704:2: iv_ruleDCDecl= ruleDCDecl EOF
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
    // InternalDCL.g:711:1: ruleDCDecl returns [EObject current=null] : ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) ) ;
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
            // InternalDCL.g:714:28: ( ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) ) )
            // InternalDCL.g:715:1: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) )
            {
            // InternalDCL.g:715:1: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) )
            int alt8=5;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalDCL.g:715:2: ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    {
                    // InternalDCL.g:715:2: ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    // InternalDCL.g:715:3: ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
                    {
                    // InternalDCL.g:715:3: ( (lv_only_0_0= ruleOnly ) )
                    // InternalDCL.g:716:1: (lv_only_0_0= ruleOnly )
                    {
                    // InternalDCL.g:716:1: (lv_only_0_0= ruleOnly )
                    // InternalDCL.g:717:3: lv_only_0_0= ruleOnly
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

                    // InternalDCL.g:733:2: ( (otherlv_1= RULE_ID ) )
                    // InternalDCL.g:734:1: (otherlv_1= RULE_ID )
                    {
                    // InternalDCL.g:734:1: (otherlv_1= RULE_ID )
                    // InternalDCL.g:735:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

                    		newLeafNode(otherlv_1, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_0_1_0()); 
                    	

                    }


                    }

                    // InternalDCL.g:746:2: ( (lv_can_2_0= ruleCan ) )
                    // InternalDCL.g:747:1: (lv_can_2_0= ruleCan )
                    {
                    // InternalDCL.g:747:1: (lv_can_2_0= ruleCan )
                    // InternalDCL.g:748:3: lv_can_2_0= ruleCan
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_21);
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

                    // InternalDCL.g:764:2: ( (lv_elementType_3_0= ruleElementType ) )
                    // InternalDCL.g:765:1: (lv_elementType_3_0= ruleElementType )
                    {
                    // InternalDCL.g:765:1: (lv_elementType_3_0= ruleElementType )
                    // InternalDCL.g:766:3: lv_elementType_3_0= ruleElementType
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

                    // InternalDCL.g:782:2: ( (otherlv_4= RULE_ID ) )
                    // InternalDCL.g:783:1: (otherlv_4= RULE_ID )
                    {
                    // InternalDCL.g:783:1: (otherlv_4= RULE_ID )
                    // InternalDCL.g:784:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_14); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_0_4_0()); 
                    	

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_2); 

                        	newLeafNode(otherlv_5, grammarAccess.getDCDeclAccess().getSemicolonKeyword_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalDCL.g:800:6: ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
                    {
                    // InternalDCL.g:800:6: ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
                    // InternalDCL.g:800:7: ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';'
                    {
                    // InternalDCL.g:800:7: ( (otherlv_6= RULE_ID ) )
                    // InternalDCL.g:801:1: (otherlv_6= RULE_ID )
                    {
                    // InternalDCL.g:801:1: (otherlv_6= RULE_ID )
                    // InternalDCL.g:802:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_22); 

                    		newLeafNode(otherlv_6, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_1_0_0()); 
                    	

                    }


                    }

                    // InternalDCL.g:813:2: ( (lv_cannot_7_0= ruleCannot ) )
                    // InternalDCL.g:814:1: (lv_cannot_7_0= ruleCannot )
                    {
                    // InternalDCL.g:814:1: (lv_cannot_7_0= ruleCannot )
                    // InternalDCL.g:815:3: lv_cannot_7_0= ruleCannot
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCannotCannotParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_21);
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

                    // InternalDCL.g:831:2: ( (lv_elementType_8_0= ruleElementType ) )
                    // InternalDCL.g:832:1: (lv_elementType_8_0= ruleElementType )
                    {
                    // InternalDCL.g:832:1: (lv_elementType_8_0= ruleElementType )
                    // InternalDCL.g:833:3: lv_elementType_8_0= ruleElementType
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

                    // InternalDCL.g:849:2: ( (otherlv_9= RULE_ID ) )
                    // InternalDCL.g:850:1: (otherlv_9= RULE_ID )
                    {
                    // InternalDCL.g:850:1: (otherlv_9= RULE_ID )
                    // InternalDCL.g:851:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_14); 

                    		newLeafNode(otherlv_9, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_1_3_0()); 
                    	

                    }


                    }

                    otherlv_10=(Token)match(input,21,FOLLOW_2); 

                        	newLeafNode(otherlv_10, grammarAccess.getDCDeclAccess().getSemicolonKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalDCL.g:867:6: ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' )
                    {
                    // InternalDCL.g:867:6: ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' )
                    // InternalDCL.g:867:7: ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';'
                    {
                    // InternalDCL.g:867:7: ( (otherlv_11= RULE_ID ) )
                    // InternalDCL.g:868:1: (otherlv_11= RULE_ID )
                    {
                    // InternalDCL.g:868:1: (otherlv_11= RULE_ID )
                    // InternalDCL.g:869:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_20); 

                    		newLeafNode(otherlv_11, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_2_0_0()); 
                    	

                    }


                    }

                    // InternalDCL.g:880:2: ( (lv_can_12_0= ruleCan ) )
                    // InternalDCL.g:881:1: (lv_can_12_0= ruleCan )
                    {
                    // InternalDCL.g:881:1: (lv_can_12_0= ruleCan )
                    // InternalDCL.g:882:3: lv_can_12_0= ruleCan
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_21);
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

                    // InternalDCL.g:898:2: ( (lv_elementType_13_0= ruleElementType ) )
                    // InternalDCL.g:899:1: (lv_elementType_13_0= ruleElementType )
                    {
                    // InternalDCL.g:899:1: (lv_elementType_13_0= ruleElementType )
                    // InternalDCL.g:900:3: lv_elementType_13_0= ruleElementType
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

                    // InternalDCL.g:916:2: ( (otherlv_14= RULE_ID ) )
                    // InternalDCL.g:917:1: (otherlv_14= RULE_ID )
                    {
                    // InternalDCL.g:917:1: (otherlv_14= RULE_ID )
                    // InternalDCL.g:918:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_14); 

                    		newLeafNode(otherlv_14, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_2_3_0()); 
                    	

                    }


                    }

                    otherlv_15=(Token)match(input,21,FOLLOW_2); 

                        	newLeafNode(otherlv_15, grammarAccess.getDCDeclAccess().getSemicolonKeyword_2_4());
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalDCL.g:934:6: ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
                    {
                    // InternalDCL.g:934:6: ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
                    // InternalDCL.g:934:7: ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';'
                    {
                    // InternalDCL.g:934:7: ( (otherlv_16= RULE_ID ) )
                    // InternalDCL.g:935:1: (otherlv_16= RULE_ID )
                    {
                    // InternalDCL.g:935:1: (otherlv_16= RULE_ID )
                    // InternalDCL.g:936:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_20); 

                    		newLeafNode(otherlv_16, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // InternalDCL.g:947:2: ( (lv_can_17_0= ruleCan ) )
                    // InternalDCL.g:948:1: (lv_can_17_0= ruleCan )
                    {
                    // InternalDCL.g:948:1: (lv_can_17_0= ruleCan )
                    // InternalDCL.g:949:3: lv_can_17_0= ruleCan
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_21);
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

                    // InternalDCL.g:965:2: ( (lv_elementType_18_0= ruleElementType ) )
                    // InternalDCL.g:966:1: (lv_elementType_18_0= ruleElementType )
                    {
                    // InternalDCL.g:966:1: (lv_elementType_18_0= ruleElementType )
                    // InternalDCL.g:967:3: lv_elementType_18_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_23);
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

                    // InternalDCL.g:983:2: ( (lv_only2_19_0= ruleOnly2 ) )
                    // InternalDCL.g:984:1: (lv_only2_19_0= ruleOnly2 )
                    {
                    // InternalDCL.g:984:1: (lv_only2_19_0= ruleOnly2 )
                    // InternalDCL.g:985:3: lv_only2_19_0= ruleOnly2
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

                    // InternalDCL.g:1001:2: ( (otherlv_20= RULE_ID ) )
                    // InternalDCL.g:1002:1: (otherlv_20= RULE_ID )
                    {
                    // InternalDCL.g:1002:1: (otherlv_20= RULE_ID )
                    // InternalDCL.g:1003:3: otherlv_20= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_14); 

                    		newLeafNode(otherlv_20, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_3_4_0()); 
                    	

                    }


                    }

                    otherlv_21=(Token)match(input,21,FOLLOW_2); 

                        	newLeafNode(otherlv_21, grammarAccess.getDCDeclAccess().getSemicolonKeyword_3_5());
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalDCL.g:1019:6: ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' )
                    {
                    // InternalDCL.g:1019:6: ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' )
                    // InternalDCL.g:1019:7: ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';'
                    {
                    // InternalDCL.g:1019:7: ( (otherlv_22= RULE_ID ) )
                    // InternalDCL.g:1020:1: (otherlv_22= RULE_ID )
                    {
                    // InternalDCL.g:1020:1: (otherlv_22= RULE_ID )
                    // InternalDCL.g:1021:3: otherlv_22= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_24); 

                    		newLeafNode(otherlv_22, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_4_0_0()); 
                    	

                    }


                    }

                    // InternalDCL.g:1032:2: ( (lv_must_23_0= ruleMust ) )
                    // InternalDCL.g:1033:1: (lv_must_23_0= ruleMust )
                    {
                    // InternalDCL.g:1033:1: (lv_must_23_0= ruleMust )
                    // InternalDCL.g:1034:3: lv_must_23_0= ruleMust
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getMustMustParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_21);
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

                    // InternalDCL.g:1050:2: ( (lv_entityType_24_0= ruleEntityType ) )
                    // InternalDCL.g:1051:1: (lv_entityType_24_0= ruleEntityType )
                    {
                    // InternalDCL.g:1051:1: (lv_entityType_24_0= ruleEntityType )
                    // InternalDCL.g:1052:3: lv_entityType_24_0= ruleEntityType
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

                    // InternalDCL.g:1068:2: ( (otherlv_25= RULE_ID ) )
                    // InternalDCL.g:1069:1: (otherlv_25= RULE_ID )
                    {
                    // InternalDCL.g:1069:1: (otherlv_25= RULE_ID )
                    // InternalDCL.g:1070:3: otherlv_25= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_14); 

                    		newLeafNode(otherlv_25, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_4_3_0()); 
                    	

                    }


                    }

                    otherlv_26=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDCL.g:1093:1: entryRuleOnly returns [EObject current=null] : iv_ruleOnly= ruleOnly EOF ;
    public final EObject entryRuleOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnly = null;


        try {
            // InternalDCL.g:1094:2: (iv_ruleOnly= ruleOnly EOF )
            // InternalDCL.g:1095:2: iv_ruleOnly= ruleOnly EOF
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
    // InternalDCL.g:1102:1: ruleOnly returns [EObject current=null] : ( (lv_only_0_0= 'only' ) ) ;
    public final EObject ruleOnly() throws RecognitionException {
        EObject current = null;

        Token lv_only_0_0=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:1105:28: ( ( (lv_only_0_0= 'only' ) ) )
            // InternalDCL.g:1106:1: ( (lv_only_0_0= 'only' ) )
            {
            // InternalDCL.g:1106:1: ( (lv_only_0_0= 'only' ) )
            // InternalDCL.g:1107:1: (lv_only_0_0= 'only' )
            {
            // InternalDCL.g:1107:1: (lv_only_0_0= 'only' )
            // InternalDCL.g:1108:3: lv_only_0_0= 'only'
            {
            lv_only_0_0=(Token)match(input,30,FOLLOW_2); 

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
    // InternalDCL.g:1129:1: entryRuleCan returns [EObject current=null] : iv_ruleCan= ruleCan EOF ;
    public final EObject entryRuleCan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCan = null;


        try {
            // InternalDCL.g:1130:2: (iv_ruleCan= ruleCan EOF )
            // InternalDCL.g:1131:2: iv_ruleCan= ruleCan EOF
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
    // InternalDCL.g:1138:1: ruleCan returns [EObject current=null] : ( (lv_can_0_0= 'can-' ) ) ;
    public final EObject ruleCan() throws RecognitionException {
        EObject current = null;

        Token lv_can_0_0=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:1141:28: ( ( (lv_can_0_0= 'can-' ) ) )
            // InternalDCL.g:1142:1: ( (lv_can_0_0= 'can-' ) )
            {
            // InternalDCL.g:1142:1: ( (lv_can_0_0= 'can-' ) )
            // InternalDCL.g:1143:1: (lv_can_0_0= 'can-' )
            {
            // InternalDCL.g:1143:1: (lv_can_0_0= 'can-' )
            // InternalDCL.g:1144:3: lv_can_0_0= 'can-'
            {
            lv_can_0_0=(Token)match(input,31,FOLLOW_2); 

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
    // InternalDCL.g:1165:1: entryRuleCannot returns [EObject current=null] : iv_ruleCannot= ruleCannot EOF ;
    public final EObject entryRuleCannot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCannot = null;


        try {
            // InternalDCL.g:1166:2: (iv_ruleCannot= ruleCannot EOF )
            // InternalDCL.g:1167:2: iv_ruleCannot= ruleCannot EOF
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
    // InternalDCL.g:1174:1: ruleCannot returns [EObject current=null] : ( (lv_cannot_0_0= 'cannot-' ) ) ;
    public final EObject ruleCannot() throws RecognitionException {
        EObject current = null;

        Token lv_cannot_0_0=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:1177:28: ( ( (lv_cannot_0_0= 'cannot-' ) ) )
            // InternalDCL.g:1178:1: ( (lv_cannot_0_0= 'cannot-' ) )
            {
            // InternalDCL.g:1178:1: ( (lv_cannot_0_0= 'cannot-' ) )
            // InternalDCL.g:1179:1: (lv_cannot_0_0= 'cannot-' )
            {
            // InternalDCL.g:1179:1: (lv_cannot_0_0= 'cannot-' )
            // InternalDCL.g:1180:3: lv_cannot_0_0= 'cannot-'
            {
            lv_cannot_0_0=(Token)match(input,32,FOLLOW_2); 

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
    // InternalDCL.g:1201:1: entryRuleOnly2 returns [EObject current=null] : iv_ruleOnly2= ruleOnly2 EOF ;
    public final EObject entryRuleOnly2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnly2 = null;


        try {
            // InternalDCL.g:1202:2: (iv_ruleOnly2= ruleOnly2 EOF )
            // InternalDCL.g:1203:2: iv_ruleOnly2= ruleOnly2 EOF
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
    // InternalDCL.g:1210:1: ruleOnly2 returns [EObject current=null] : ( (lv_only2_0_0= '-only' ) ) ;
    public final EObject ruleOnly2() throws RecognitionException {
        EObject current = null;

        Token lv_only2_0_0=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:1213:28: ( ( (lv_only2_0_0= '-only' ) ) )
            // InternalDCL.g:1214:1: ( (lv_only2_0_0= '-only' ) )
            {
            // InternalDCL.g:1214:1: ( (lv_only2_0_0= '-only' ) )
            // InternalDCL.g:1215:1: (lv_only2_0_0= '-only' )
            {
            // InternalDCL.g:1215:1: (lv_only2_0_0= '-only' )
            // InternalDCL.g:1216:3: lv_only2_0_0= '-only'
            {
            lv_only2_0_0=(Token)match(input,33,FOLLOW_2); 

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
    // InternalDCL.g:1237:1: entryRuleMust returns [EObject current=null] : iv_ruleMust= ruleMust EOF ;
    public final EObject entryRuleMust() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMust = null;


        try {
            // InternalDCL.g:1238:2: (iv_ruleMust= ruleMust EOF )
            // InternalDCL.g:1239:2: iv_ruleMust= ruleMust EOF
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
    // InternalDCL.g:1246:1: ruleMust returns [EObject current=null] : ( (lv_must_0_0= 'must-' ) ) ;
    public final EObject ruleMust() throws RecognitionException {
        EObject current = null;

        Token lv_must_0_0=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:1249:28: ( ( (lv_must_0_0= 'must-' ) ) )
            // InternalDCL.g:1250:1: ( (lv_must_0_0= 'must-' ) )
            {
            // InternalDCL.g:1250:1: ( (lv_must_0_0= 'must-' ) )
            // InternalDCL.g:1251:1: (lv_must_0_0= 'must-' )
            {
            // InternalDCL.g:1251:1: (lv_must_0_0= 'must-' )
            // InternalDCL.g:1252:3: lv_must_0_0= 'must-'
            {
            lv_must_0_0=(Token)match(input,34,FOLLOW_2); 

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
    // InternalDCL.g:1273:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // InternalDCL.g:1274:2: (iv_ruleElementType= ruleElementType EOF )
            // InternalDCL.g:1275:2: iv_ruleElementType= ruleElementType EOF
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
    // InternalDCL.g:1282:1: ruleElementType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_EntityType_1 = null;


         enterRule(); 
            
        try {
            // InternalDCL.g:1285:28: ( (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) )
            // InternalDCL.g:1286:1: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            {
            // InternalDCL.g:1286:1: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=35 && LA9_0<=39)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=40 && LA9_0<=44)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDCL.g:1287:5: this_BasicType_0= ruleBasicType
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
                    // InternalDCL.g:1297:5: this_EntityType_1= ruleEntityType
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
    // InternalDCL.g:1313:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalDCL.g:1314:2: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalDCL.g:1315:2: iv_ruleBasicType= ruleBasicType EOF
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
    // InternalDCL.g:1322:1: ruleBasicType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;
        Token lv_typeName_0_5=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:1325:28: ( ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) ) )
            // InternalDCL.g:1326:1: ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) )
            {
            // InternalDCL.g:1326:1: ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) )
            // InternalDCL.g:1327:1: ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) )
            {
            // InternalDCL.g:1327:1: ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) )
            // InternalDCL.g:1328:1: (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' )
            {
            // InternalDCL.g:1328:1: (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt10=1;
                }
                break;
            case 36:
                {
                alt10=2;
                }
                break;
            case 37:
                {
                alt10=3;
                }
                break;
            case 38:
                {
                alt10=4;
                }
                break;
            case 39:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDCL.g:1329:3: lv_typeName_0_1= 'access'
                    {
                    lv_typeName_0_1=(Token)match(input,35,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_1, grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalDCL.g:1341:8: lv_typeName_0_2= 'declare'
                    {
                    lv_typeName_0_2=(Token)match(input,36,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_2, grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalDCL.g:1353:8: lv_typeName_0_3= 'handle'
                    {
                    lv_typeName_0_3=(Token)match(input,37,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_3, grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // InternalDCL.g:1365:8: lv_typeName_0_4= 'create'
                    {
                    lv_typeName_0_4=(Token)match(input,38,FOLLOW_2); 

                            newLeafNode(lv_typeName_0_4, grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // InternalDCL.g:1377:8: lv_typeName_0_5= 'depend'
                    {
                    lv_typeName_0_5=(Token)match(input,39,FOLLOW_2); 

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
    // InternalDCL.g:1400:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // InternalDCL.g:1401:2: (iv_ruleEntityType= ruleEntityType EOF )
            // InternalDCL.g:1402:2: iv_ruleEntityType= ruleEntityType EOF
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
    // InternalDCL.g:1409:1: ruleEntityType returns [EObject current=null] : ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_entity_0_1=null;
        Token lv_entity_0_2=null;
        Token lv_entity_0_3=null;
        Token lv_entity_0_4=null;
        Token lv_entity_0_5=null;

         enterRule(); 
            
        try {
            // InternalDCL.g:1412:28: ( ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) ) )
            // InternalDCL.g:1413:1: ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) )
            {
            // InternalDCL.g:1413:1: ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) )
            // InternalDCL.g:1414:1: ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) )
            {
            // InternalDCL.g:1414:1: ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) )
            // InternalDCL.g:1415:1: (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' )
            {
            // InternalDCL.g:1415:1: (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            case 43:
                {
                alt11=4;
                }
                break;
            case 44:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDCL.g:1416:3: lv_entity_0_1= 'extend'
                    {
                    lv_entity_0_1=(Token)match(input,40,FOLLOW_2); 

                            newLeafNode(lv_entity_0_1, grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalDCL.g:1428:8: lv_entity_0_2= 'implement'
                    {
                    lv_entity_0_2=(Token)match(input,41,FOLLOW_2); 

                            newLeafNode(lv_entity_0_2, grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalDCL.g:1440:8: lv_entity_0_3= 'derive'
                    {
                    lv_entity_0_3=(Token)match(input,42,FOLLOW_2); 

                            newLeafNode(lv_entity_0_3, grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // InternalDCL.g:1452:8: lv_entity_0_4= 'throw'
                    {
                    lv_entity_0_4=(Token)match(input,43,FOLLOW_2); 

                            newLeafNode(lv_entity_0_4, grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // InternalDCL.g:1464:8: lv_entity_0_5= 'useannotation'
                    {
                    lv_entity_0_5=(Token)match(input,44,FOLLOW_2); 

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


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\37\1\43\2\uffff\12\4\2\uffff";
    static final String dfa_3s = "\1\36\1\uffff\1\42\1\54\2\uffff\12\41\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\2\uffff\1\5\1\2\12\uffff\1\3\1\4";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\31\uffff\1\1",
            "",
            "\1\3\1\5\1\uffff\1\4",
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "",
            "",
            "\1\20\34\uffff\1\21",
            "\1\20\34\uffff\1\21",
            "\1\20\34\uffff\1\21",
            "\1\20\34\uffff\1\21",
            "\1\20\34\uffff\1\21",
            "\1\20\34\uffff\1\21",
            "\1\20\34\uffff\1\21",
            "\1\20\34\uffff\1\21",
            "\1\20\34\uffff\1\21",
            "\1\20\34\uffff\1\21",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "715:1: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (otherlv_14= RULE_ID ) ) otherlv_15= ';' ) | ( ( (otherlv_16= RULE_ID ) ) ( (lv_can_17_0= ruleCan ) ) ( (lv_elementType_18_0= ruleElementType ) ) ( (lv_only2_19_0= ruleOnly2 ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) | ( ( (otherlv_22= RULE_ID ) ) ( (lv_must_23_0= ruleMust ) ) ( (lv_entityType_24_0= ruleEntityType ) ) ( (otherlv_25= RULE_ID ) ) otherlv_26= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000030C08000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000030C0A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040002010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001FF800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});

}