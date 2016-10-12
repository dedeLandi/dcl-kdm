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
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDCLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g"; }



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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' ) ;
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
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:79:28: ( (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:80:1: (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:80:1: (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:80:3: otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getArchiteturalElementsKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleModel134); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:88:1: ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+
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
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:89:1: (lv_structureElements_2_0= ruleDCLStructureElement )
            	    {
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:89:1: (lv_structureElements_2_0= ruleDCLStructureElement )
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:90:3: lv_structureElements_2_0= ruleDCLStructureElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStructureElementsDCLStructureElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDCLStructureElement_in_ruleModel155);
            	    lv_structureElements_2_0=ruleDCLStructureElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"structureElements",
            	            		lv_structureElements_2_0, 
            	            		"DCLStructureElement");
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleModel168); 

                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleModel180); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRestrictionsKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleModel192); 

                	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:118:1: ( (lv_dCDecl_6_0= ruleDCDecl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==30) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:119:1: (lv_dCDecl_6_0= ruleDCDecl )
            	    {
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:119:1: (lv_dCDecl_6_0= ruleDCDecl )
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:120:3: lv_dCDecl_6_0= ruleDCDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDCDeclDCDeclParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDCDecl_in_ruleModel213);
            	    lv_dCDecl_6_0=ruleDCDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dCDecl",
            	            		lv_dCDecl_6_0, 
            	            		"DCDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleModel226); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:148:1: entryRuleDCLStructureElement returns [EObject current=null] : iv_ruleDCLStructureElement= ruleDCLStructureElement EOF ;
    public final EObject entryRuleDCLStructureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLStructureElement = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:149:2: (iv_ruleDCLStructureElement= ruleDCLStructureElement EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:150:2: iv_ruleDCLStructureElement= ruleDCLStructureElement EOF
            {
             newCompositeNode(grammarAccess.getDCLStructureElementRule()); 
            pushFollow(FOLLOW_ruleDCLStructureElement_in_entryRuleDCLStructureElement262);
            iv_ruleDCLStructureElement=ruleDCLStructureElement();

            state._fsp--;

             current =iv_ruleDCLStructureElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLStructureElement272); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:157:1: ruleDCLStructureElement returns [EObject current=null] : (this_DCLLayer_0= ruleDCLLayer | this_DCLComponent_1= ruleDCLComponent | this_DCLSubSystem_2= ruleDCLSubSystem | this_DCLModule_3= ruleDCLModule | this_DCLComponentInterface_4= ruleDCLComponentInterface ) ;
    public final EObject ruleDCLStructureElement() throws RecognitionException {
        EObject current = null;

        EObject this_DCLLayer_0 = null;

        EObject this_DCLComponent_1 = null;

        EObject this_DCLSubSystem_2 = null;

        EObject this_DCLModule_3 = null;

        EObject this_DCLComponentInterface_4 = null;


         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:160:28: ( (this_DCLLayer_0= ruleDCLLayer | this_DCLComponent_1= ruleDCLComponent | this_DCLSubSystem_2= ruleDCLSubSystem | this_DCLModule_3= ruleDCLModule | this_DCLComponentInterface_4= ruleDCLComponentInterface ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:161:1: (this_DCLLayer_0= ruleDCLLayer | this_DCLComponent_1= ruleDCLComponent | this_DCLSubSystem_2= ruleDCLSubSystem | this_DCLModule_3= ruleDCLModule | this_DCLComponentInterface_4= ruleDCLComponentInterface )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:161:1: (this_DCLLayer_0= ruleDCLLayer | this_DCLComponent_1= ruleDCLComponent | this_DCLSubSystem_2= ruleDCLSubSystem | this_DCLModule_3= ruleDCLModule | this_DCLComponentInterface_4= ruleDCLComponentInterface )
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
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:162:5: this_DCLLayer_0= ruleDCLLayer
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLLayerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDCLLayer_in_ruleDCLStructureElement319);
                    this_DCLLayer_0=ruleDCLLayer();

                    state._fsp--;

                     
                            current = this_DCLLayer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:172:5: this_DCLComponent_1= ruleDCLComponent
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLComponentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDCLComponent_in_ruleDCLStructureElement346);
                    this_DCLComponent_1=ruleDCLComponent();

                    state._fsp--;

                     
                            current = this_DCLComponent_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:182:5: this_DCLSubSystem_2= ruleDCLSubSystem
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLSubSystemParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDCLSubSystem_in_ruleDCLStructureElement373);
                    this_DCLSubSystem_2=ruleDCLSubSystem();

                    state._fsp--;

                     
                            current = this_DCLSubSystem_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:192:5: this_DCLModule_3= ruleDCLModule
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLModuleParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDCLModule_in_ruleDCLStructureElement400);
                    this_DCLModule_3=ruleDCLModule();

                    state._fsp--;

                     
                            current = this_DCLModule_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:202:5: this_DCLComponentInterface_4= ruleDCLComponentInterface
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLComponentInterfaceParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDCLComponentInterface_in_ruleDCLStructureElement427);
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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:218:1: entryRuleDCLLayer returns [EObject current=null] : iv_ruleDCLLayer= ruleDCLLayer EOF ;
    public final EObject entryRuleDCLLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLLayer = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:219:2: (iv_ruleDCLLayer= ruleDCLLayer EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:220:2: iv_ruleDCLLayer= ruleDCLLayer EOF
            {
             newCompositeNode(grammarAccess.getDCLLayerRule()); 
            pushFollow(FOLLOW_ruleDCLLayer_in_entryRuleDCLLayer462);
            iv_ruleDCLLayer=ruleDCLLayer();

            state._fsp--;

             current =iv_ruleDCLLayer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLLayer472); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:227:1: ruleDCLLayer returns [EObject current=null] : (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) ( (otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= ';' ) ;
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
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:230:28: ( (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) ( (otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= ';' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:231:1: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) ( (otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= ';' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:231:1: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) ( (otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= ';' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:231:3: otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) ( (otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) ) ) )? otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleDCLLayer509); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLLayerAccess().getLayerKeyword_0());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:235:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:236:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:236:1: (lv_name_1_0= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:237:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLLayer526); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLLayerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDCLLayer543); 

                	newLeafNode(otherlv_2, grammarAccess.getDCLLayerAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleDCLLayer555); 

                	newLeafNode(otherlv_3, grammarAccess.getDCLLayerAccess().getLevelKeyword_3());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:261:1: ( (lv_level_4_0= RULE_INT ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:262:1: (lv_level_4_0= RULE_INT )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:262:1: (lv_level_4_0= RULE_INT )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:263:3: lv_level_4_0= RULE_INT
            {
            lv_level_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDCLLayer572); 

            			newLeafNode(lv_level_4_0, grammarAccess.getDCLLayerAccess().getLevelINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLLayerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"level",
                    		lv_level_4_0, 
                    		"INT");
            	    

            }


            }

            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:279:2: ( (otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) ) ) )?
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                switch ( input.LA(2) ) {
                    case 20:
                        {
                        alt4=3;
                        }
                        break;
                    case 19:
                        {
                        alt4=2;
                        }
                        break;
                    case 18:
                        {
                        alt4=1;
                        }
                        break;
                }

            }
            switch (alt4) {
                case 1 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:279:3: (otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:279:3: (otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:279:5: otherlv_5= ',' otherlv_6= 'inLayer: ' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDCLLayer591); 

                        	newLeafNode(otherlv_5, grammarAccess.getDCLLayerAccess().getCommaKeyword_5_0_0());
                        
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleDCLLayer603); 

                        	newLeafNode(otherlv_6, grammarAccess.getDCLLayerAccess().getInLayerKeyword_5_0_1());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:287:1: ( (otherlv_7= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:288:1: (otherlv_7= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:288:1: (otherlv_7= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:289:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLLayerRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLLayer623); 

                    		newLeafNode(otherlv_7, grammarAccess.getDCLLayerAccess().getLayerDCLStructureElementCrossReference_5_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:301:6: (otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) ) )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:301:6: (otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:301:8: otherlv_8= ',' otherlv_9= 'inSubSystem: ' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleDCLLayer643); 

                        	newLeafNode(otherlv_8, grammarAccess.getDCLLayerAccess().getCommaKeyword_5_1_0());
                        
                    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleDCLLayer655); 

                        	newLeafNode(otherlv_9, grammarAccess.getDCLLayerAccess().getInSubSystemKeyword_5_1_1());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:309:1: ( (otherlv_10= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:310:1: (otherlv_10= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:310:1: (otherlv_10= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:311:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLLayerRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLLayer675); 

                    		newLeafNode(otherlv_10, grammarAccess.getDCLLayerAccess().getSubSystemDCLStructureElementCrossReference_5_1_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:323:6: (otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) ) )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:323:6: (otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:323:8: otherlv_11= ',' otherlv_12= 'inComponent: ' ( (otherlv_13= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleDCLLayer695); 

                        	newLeafNode(otherlv_11, grammarAccess.getDCLLayerAccess().getCommaKeyword_5_2_0());
                        
                    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleDCLLayer707); 

                        	newLeafNode(otherlv_12, grammarAccess.getDCLLayerAccess().getInComponentKeyword_5_2_1());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:331:1: ( (otherlv_13= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:332:1: (otherlv_13= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:332:1: (otherlv_13= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:333:3: otherlv_13= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLLayerRule());
                    	        }
                            
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLLayer727); 

                    		newLeafNode(otherlv_13, grammarAccess.getDCLLayerAccess().getComponentDCLStructureElementCrossReference_5_2_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleDCLLayer742); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:356:1: entryRuleDCLComponent returns [EObject current=null] : iv_ruleDCLComponent= ruleDCLComponent EOF ;
    public final EObject entryRuleDCLComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLComponent = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:357:2: (iv_ruleDCLComponent= ruleDCLComponent EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:358:2: iv_ruleDCLComponent= ruleDCLComponent EOF
            {
             newCompositeNode(grammarAccess.getDCLComponentRule()); 
            pushFollow(FOLLOW_ruleDCLComponent_in_entryRuleDCLComponent778);
            iv_ruleDCLComponent=ruleDCLComponent();

            state._fsp--;

             current =iv_ruleDCLComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLComponent788); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:365:1: ruleDCLComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' ) ;
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
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:368:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:369:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:369:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:369:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleDCLComponent825); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLComponentAccess().getComponentKeyword_0());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:373:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:374:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:374:1: (lv_name_1_0= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:375:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLComponent842); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:391:2: ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )?
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
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:391:3: (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:391:3: (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:391:5: otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDCLComponent861); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLComponentAccess().getCommaKeyword_2_0_0());
                        
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleDCLComponent873); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLComponentAccess().getInLayerKeyword_2_0_1());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:399:1: ( (otherlv_4= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:400:1: (otherlv_4= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:400:1: (otherlv_4= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:401:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLComponentRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLComponent893); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLComponentAccess().getLayerDCLStructureElementCrossReference_2_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:413:6: (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:413:6: (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:413:8: otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDCLComponent913); 

                        	newLeafNode(otherlv_5, grammarAccess.getDCLComponentAccess().getCommaKeyword_2_1_0());
                        
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleDCLComponent925); 

                        	newLeafNode(otherlv_6, grammarAccess.getDCLComponentAccess().getInSubSystemKeyword_2_1_1());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:421:1: ( (otherlv_7= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:422:1: (otherlv_7= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:422:1: (otherlv_7= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:423:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLComponentRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLComponent945); 

                    		newLeafNode(otherlv_7, grammarAccess.getDCLComponentAccess().getSubSystemDCLStructureElementCrossReference_2_1_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleDCLComponent960); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:446:1: entryRuleDCLComponentInterface returns [EObject current=null] : iv_ruleDCLComponentInterface= ruleDCLComponentInterface EOF ;
    public final EObject entryRuleDCLComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLComponentInterface = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:447:2: (iv_ruleDCLComponentInterface= ruleDCLComponentInterface EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:448:2: iv_ruleDCLComponentInterface= ruleDCLComponentInterface EOF
            {
             newCompositeNode(grammarAccess.getDCLComponentInterfaceRule()); 
            pushFollow(FOLLOW_ruleDCLComponentInterface_in_entryRuleDCLComponentInterface996);
            iv_ruleDCLComponentInterface=ruleDCLComponentInterface();

            state._fsp--;

             current =iv_ruleDCLComponentInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLComponentInterface1006); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:455:1: ruleDCLComponentInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';' ) ;
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
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:458:28: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:459:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:459:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:459:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleDCLComponentInterface1043); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLComponentInterfaceAccess().getInterfaceKeyword_0());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:463:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:464:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:464:1: (lv_name_1_0= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:465:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLComponentInterface1060); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLComponentInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLComponentInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleDCLComponentInterface1077); 

                	newLeafNode(otherlv_2, grammarAccess.getDCLComponentInterfaceAccess().getOfComponentKeyword_2());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:485:1: ( (otherlv_3= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:486:1: (otherlv_3= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:486:1: (otherlv_3= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:487:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLComponentInterfaceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLComponentInterface1097); 

            		newLeafNode(otherlv_3, grammarAccess.getDCLComponentInterfaceAccess().getComponentDCLStructureElementCrossReference_3_0()); 
            	

            }


            }

            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:498:2: (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:498:4: otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) )
            {
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleDCLComponentInterface1110); 

                	newLeafNode(otherlv_4, grammarAccess.getDCLComponentInterfaceAccess().getCommaKeyword_4_0());
                
            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleDCLComponentInterface1122); 

                	newLeafNode(otherlv_5, grammarAccess.getDCLComponentInterfaceAccess().getTypeKeyword_4_1());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:506:1: ( (lv_interfaceType_6_0= ruleInterfaceType ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:507:1: (lv_interfaceType_6_0= ruleInterfaceType )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:507:1: (lv_interfaceType_6_0= ruleInterfaceType )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:508:3: lv_interfaceType_6_0= ruleInterfaceType
            {
             
            	        newCompositeNode(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeInterfaceTypeParserRuleCall_4_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInterfaceType_in_ruleDCLComponentInterface1143);
            lv_interfaceType_6_0=ruleInterfaceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDCLComponentInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"interfaceType",
                    		lv_interfaceType_6_0, 
                    		"InterfaceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleDCLComponentInterface1156); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:536:1: entryRuleInterfaceType returns [EObject current=null] : iv_ruleInterfaceType= ruleInterfaceType EOF ;
    public final EObject entryRuleInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceType = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:537:2: (iv_ruleInterfaceType= ruleInterfaceType EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:538:2: iv_ruleInterfaceType= ruleInterfaceType EOF
            {
             newCompositeNode(grammarAccess.getInterfaceTypeRule()); 
            pushFollow(FOLLOW_ruleInterfaceType_in_entryRuleInterfaceType1192);
            iv_ruleInterfaceType=ruleInterfaceType();

            state._fsp--;

             current =iv_ruleInterfaceType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceType1202); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:545:1: ruleInterfaceType returns [EObject current=null] : ( ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) ) ) ;
    public final EObject ruleInterfaceType() throws RecognitionException {
        EObject current = null;

        Token lv_interfaceTypeName_0_1=null;
        Token lv_interfaceTypeName_0_2=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:548:28: ( ( ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:549:1: ( ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:549:1: ( ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:550:1: ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:550:1: ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:551:1: (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:551:1: (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' )
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
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:552:3: lv_interfaceTypeName_0_1= 'provided'
                    {
                    lv_interfaceTypeName_0_1=(Token)match(input,26,FOLLOW_26_in_ruleInterfaceType1246); 

                            newLeafNode(lv_interfaceTypeName_0_1, grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameProvidedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceTypeRule());
                    	        }
                           		setWithLastConsumed(current, "interfaceTypeName", lv_interfaceTypeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:564:8: lv_interfaceTypeName_0_2= 'required'
                    {
                    lv_interfaceTypeName_0_2=(Token)match(input,27,FOLLOW_27_in_ruleInterfaceType1275); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:587:1: entryRuleDCLSubSystem returns [EObject current=null] : iv_ruleDCLSubSystem= ruleDCLSubSystem EOF ;
    public final EObject entryRuleDCLSubSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLSubSystem = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:588:2: (iv_ruleDCLSubSystem= ruleDCLSubSystem EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:589:2: iv_ruleDCLSubSystem= ruleDCLSubSystem EOF
            {
             newCompositeNode(grammarAccess.getDCLSubSystemRule()); 
            pushFollow(FOLLOW_ruleDCLSubSystem_in_entryRuleDCLSubSystem1326);
            iv_ruleDCLSubSystem=ruleDCLSubSystem();

            state._fsp--;

             current =iv_ruleDCLSubSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLSubSystem1336); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:596:1: ruleDCLSubSystem returns [EObject current=null] : (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inSubSystem: ' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) ;
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
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:599:28: ( (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inSubSystem: ' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:600:1: (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inSubSystem: ' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:600:1: (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inSubSystem: ' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:600:3: otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= 'inSubSystem: ' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleDCLSubSystem1373); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLSubSystemAccess().getSubSystemKeyword_0());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:604:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:605:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:605:1: (lv_name_1_0= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:606:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLSubSystem1390); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLSubSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLSubSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:622:2: (otherlv_2= ',' otherlv_3= 'inSubSystem: ' ( (otherlv_4= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:622:4: otherlv_2= ',' otherlv_3= 'inSubSystem: ' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDCLSubSystem1408); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLSubSystemAccess().getCommaKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleDCLSubSystem1420); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLSubSystemAccess().getInSubSystemKeyword_2_1());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:630:1: ( (otherlv_4= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:631:1: (otherlv_4= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:631:1: (otherlv_4= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:632:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLSubSystemRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLSubSystem1440); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLSubSystemAccess().getSubSystemDCLStructureElementCrossReference_2_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleDCLSubSystem1454); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:655:1: entryRuleDCLModule returns [EObject current=null] : iv_ruleDCLModule= ruleDCLModule EOF ;
    public final EObject entryRuleDCLModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLModule = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:656:2: (iv_ruleDCLModule= ruleDCLModule EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:657:2: iv_ruleDCLModule= ruleDCLModule EOF
            {
             newCompositeNode(grammarAccess.getDCLModuleRule()); 
            pushFollow(FOLLOW_ruleDCLModule_in_entryRuleDCLModule1490);
            iv_ruleDCLModule=ruleDCLModule();

            state._fsp--;

             current =iv_ruleDCLModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLModule1500); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:664:1: ruleDCLModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDCLModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:667:28: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:668:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:668:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:668:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleDCLModule1537); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLModuleAccess().getModuleKeyword_0());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:672:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:673:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:673:1: (lv_name_1_0= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:674:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLModule1554); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLModuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleDCLModule1571); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:702:1: entryRuleDCDecl returns [EObject current=null] : iv_ruleDCDecl= ruleDCDecl EOF ;
    public final EObject entryRuleDCDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCDecl = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:703:2: (iv_ruleDCDecl= ruleDCDecl EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:704:2: iv_ruleDCDecl= ruleDCDecl EOF
            {
             newCompositeNode(grammarAccess.getDCDeclRule()); 
            pushFollow(FOLLOW_ruleDCDecl_in_entryRuleDCDecl1607);
            iv_ruleDCDecl=ruleDCDecl();

            state._fsp--;

             current =iv_ruleDCDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCDecl1617); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:711:1: ruleDCDecl returns [EObject current=null] : ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ;
    public final EObject ruleDCDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_only_0_0 = null;

        EObject lv_can_2_0 = null;

        EObject lv_elementType_3_0 = null;

        EObject lv_cannot_7_0 = null;

        EObject lv_elementType_8_0 = null;

        EObject lv_can_12_0 = null;

        EObject lv_elementType_13_0 = null;

        EObject lv_only2_14_0 = null;

        EObject lv_must_18_0 = null;

        EObject lv_entityType_19_0 = null;


         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:714:28: ( ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:715:1: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:715:1: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) )
            int alt8=4;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 31:
                    {
                    alt8=3;
                    }
                    break;
                case 34:
                    {
                    alt8=4;
                    }
                    break;
                case 32:
                    {
                    alt8=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:715:2: ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:715:2: ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:715:3: ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:715:3: ( (lv_only_0_0= ruleOnly ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:716:1: (lv_only_0_0= ruleOnly )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:716:1: (lv_only_0_0= ruleOnly )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:717:3: lv_only_0_0= ruleOnly
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getOnlyOnlyParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOnly_in_ruleDCDecl1664);
                    lv_only_0_0=ruleOnly();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"only",
                            		lv_only_0_0, 
                            		"Only");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:733:2: ( (otherlv_1= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:734:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:734:1: (otherlv_1= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:735:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1684); 

                    		newLeafNode(otherlv_1, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_0_1_0()); 
                    	

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:746:2: ( (lv_can_2_0= ruleCan ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:747:1: (lv_can_2_0= ruleCan )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:747:1: (lv_can_2_0= ruleCan )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:748:3: lv_can_2_0= ruleCan
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCan_in_ruleDCDecl1705);
                    lv_can_2_0=ruleCan();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"can",
                            		lv_can_2_0, 
                            		"Can");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:764:2: ( (lv_elementType_3_0= ruleElementType ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:765:1: (lv_elementType_3_0= ruleElementType )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:765:1: (lv_elementType_3_0= ruleElementType )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:766:3: lv_elementType_3_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementType_in_ruleDCDecl1726);
                    lv_elementType_3_0=ruleElementType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_3_0, 
                            		"ElementType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:782:2: ( (otherlv_4= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:783:1: (otherlv_4= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:783:1: (otherlv_4= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:784:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1746); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_0_4_0()); 
                    	

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleDCDecl1758); 

                        	newLeafNode(otherlv_5, grammarAccess.getDCDeclAccess().getSemicolonKeyword_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:800:6: ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:800:6: ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:800:7: ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';'
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:800:7: ( (otherlv_6= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:801:1: (otherlv_6= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:801:1: (otherlv_6= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:802:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1786); 

                    		newLeafNode(otherlv_6, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_1_0_0()); 
                    	

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:813:2: ( (lv_cannot_7_0= ruleCannot ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:814:1: (lv_cannot_7_0= ruleCannot )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:814:1: (lv_cannot_7_0= ruleCannot )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:815:3: lv_cannot_7_0= ruleCannot
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCannotCannotParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCannot_in_ruleDCDecl1807);
                    lv_cannot_7_0=ruleCannot();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"cannot",
                            		lv_cannot_7_0, 
                            		"Cannot");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:831:2: ( (lv_elementType_8_0= ruleElementType ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:832:1: (lv_elementType_8_0= ruleElementType )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:832:1: (lv_elementType_8_0= ruleElementType )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:833:3: lv_elementType_8_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementType_in_ruleDCDecl1828);
                    lv_elementType_8_0=ruleElementType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_8_0, 
                            		"ElementType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:849:2: ( (otherlv_9= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:850:1: (otherlv_9= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:850:1: (otherlv_9= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:851:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1848); 

                    		newLeafNode(otherlv_9, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_1_3_0()); 
                    	

                    }


                    }

                    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleDCDecl1860); 

                        	newLeafNode(otherlv_10, grammarAccess.getDCDeclAccess().getSemicolonKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:867:6: ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:867:6: ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:867:7: ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';'
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:867:7: ( (otherlv_11= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:868:1: (otherlv_11= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:868:1: (otherlv_11= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:869:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1888); 

                    		newLeafNode(otherlv_11, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_2_0_0()); 
                    	

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:880:2: ( (lv_can_12_0= ruleCan ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:881:1: (lv_can_12_0= ruleCan )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:881:1: (lv_can_12_0= ruleCan )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:882:3: lv_can_12_0= ruleCan
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCan_in_ruleDCDecl1909);
                    lv_can_12_0=ruleCan();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"can",
                            		lv_can_12_0, 
                            		"Can");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:898:2: ( (lv_elementType_13_0= ruleElementType ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:899:1: (lv_elementType_13_0= ruleElementType )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:899:1: (lv_elementType_13_0= ruleElementType )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:900:3: lv_elementType_13_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementType_in_ruleDCDecl1930);
                    lv_elementType_13_0=ruleElementType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_13_0, 
                            		"ElementType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:916:2: ( (lv_only2_14_0= ruleOnly2 ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:917:1: (lv_only2_14_0= ruleOnly2 )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:917:1: (lv_only2_14_0= ruleOnly2 )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:918:3: lv_only2_14_0= ruleOnly2
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getOnly2Only2ParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOnly2_in_ruleDCDecl1951);
                    lv_only2_14_0=ruleOnly2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"only2",
                            		lv_only2_14_0, 
                            		"Only2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:934:2: ( (otherlv_15= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:935:1: (otherlv_15= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:935:1: (otherlv_15= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:936:3: otherlv_15= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1971); 

                    		newLeafNode(otherlv_15, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_2_4_0()); 
                    	

                    }


                    }

                    otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleDCDecl1983); 

                        	newLeafNode(otherlv_16, grammarAccess.getDCDeclAccess().getSemicolonKeyword_2_5());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:952:6: ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:952:6: ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:952:7: ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';'
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:952:7: ( (otherlv_17= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:953:1: (otherlv_17= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:953:1: (otherlv_17= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:954:3: otherlv_17= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl2011); 

                    		newLeafNode(otherlv_17, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:965:2: ( (lv_must_18_0= ruleMust ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:966:1: (lv_must_18_0= ruleMust )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:966:1: (lv_must_18_0= ruleMust )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:967:3: lv_must_18_0= ruleMust
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getMustMustParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMust_in_ruleDCDecl2032);
                    lv_must_18_0=ruleMust();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"must",
                            		lv_must_18_0, 
                            		"Must");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:983:2: ( (lv_entityType_19_0= ruleEntityType ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:984:1: (lv_entityType_19_0= ruleEntityType )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:984:1: (lv_entityType_19_0= ruleEntityType )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:985:3: lv_entityType_19_0= ruleEntityType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getEntityTypeEntityTypeParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntityType_in_ruleDCDecl2053);
                    lv_entityType_19_0=ruleEntityType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"entityType",
                            		lv_entityType_19_0, 
                            		"EntityType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1001:2: ( (otherlv_20= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1002:1: (otherlv_20= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1002:1: (otherlv_20= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1003:3: otherlv_20= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl2073); 

                    		newLeafNode(otherlv_20, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_3_3_0()); 
                    	

                    }


                    }

                    otherlv_21=(Token)match(input,21,FOLLOW_21_in_ruleDCDecl2085); 

                        	newLeafNode(otherlv_21, grammarAccess.getDCDeclAccess().getSemicolonKeyword_3_4());
                        

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1026:1: entryRuleOnly returns [EObject current=null] : iv_ruleOnly= ruleOnly EOF ;
    public final EObject entryRuleOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnly = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1027:2: (iv_ruleOnly= ruleOnly EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1028:2: iv_ruleOnly= ruleOnly EOF
            {
             newCompositeNode(grammarAccess.getOnlyRule()); 
            pushFollow(FOLLOW_ruleOnly_in_entryRuleOnly2122);
            iv_ruleOnly=ruleOnly();

            state._fsp--;

             current =iv_ruleOnly; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnly2132); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1035:1: ruleOnly returns [EObject current=null] : ( (lv_only_0_0= 'only' ) ) ;
    public final EObject ruleOnly() throws RecognitionException {
        EObject current = null;

        Token lv_only_0_0=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1038:28: ( ( (lv_only_0_0= 'only' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1039:1: ( (lv_only_0_0= 'only' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1039:1: ( (lv_only_0_0= 'only' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1040:1: (lv_only_0_0= 'only' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1040:1: (lv_only_0_0= 'only' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1041:3: lv_only_0_0= 'only'
            {
            lv_only_0_0=(Token)match(input,30,FOLLOW_30_in_ruleOnly2174); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1062:1: entryRuleCan returns [EObject current=null] : iv_ruleCan= ruleCan EOF ;
    public final EObject entryRuleCan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCan = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1063:2: (iv_ruleCan= ruleCan EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1064:2: iv_ruleCan= ruleCan EOF
            {
             newCompositeNode(grammarAccess.getCanRule()); 
            pushFollow(FOLLOW_ruleCan_in_entryRuleCan2222);
            iv_ruleCan=ruleCan();

            state._fsp--;

             current =iv_ruleCan; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCan2232); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1071:1: ruleCan returns [EObject current=null] : ( (lv_can_0_0= 'can-' ) ) ;
    public final EObject ruleCan() throws RecognitionException {
        EObject current = null;

        Token lv_can_0_0=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1074:28: ( ( (lv_can_0_0= 'can-' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1075:1: ( (lv_can_0_0= 'can-' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1075:1: ( (lv_can_0_0= 'can-' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1076:1: (lv_can_0_0= 'can-' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1076:1: (lv_can_0_0= 'can-' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1077:3: lv_can_0_0= 'can-'
            {
            lv_can_0_0=(Token)match(input,31,FOLLOW_31_in_ruleCan2274); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1098:1: entryRuleCannot returns [EObject current=null] : iv_ruleCannot= ruleCannot EOF ;
    public final EObject entryRuleCannot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCannot = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1099:2: (iv_ruleCannot= ruleCannot EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1100:2: iv_ruleCannot= ruleCannot EOF
            {
             newCompositeNode(grammarAccess.getCannotRule()); 
            pushFollow(FOLLOW_ruleCannot_in_entryRuleCannot2322);
            iv_ruleCannot=ruleCannot();

            state._fsp--;

             current =iv_ruleCannot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCannot2332); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1107:1: ruleCannot returns [EObject current=null] : ( (lv_cannot_0_0= 'cannot-' ) ) ;
    public final EObject ruleCannot() throws RecognitionException {
        EObject current = null;

        Token lv_cannot_0_0=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1110:28: ( ( (lv_cannot_0_0= 'cannot-' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1111:1: ( (lv_cannot_0_0= 'cannot-' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1111:1: ( (lv_cannot_0_0= 'cannot-' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1112:1: (lv_cannot_0_0= 'cannot-' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1112:1: (lv_cannot_0_0= 'cannot-' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1113:3: lv_cannot_0_0= 'cannot-'
            {
            lv_cannot_0_0=(Token)match(input,32,FOLLOW_32_in_ruleCannot2374); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1134:1: entryRuleOnly2 returns [EObject current=null] : iv_ruleOnly2= ruleOnly2 EOF ;
    public final EObject entryRuleOnly2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnly2 = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1135:2: (iv_ruleOnly2= ruleOnly2 EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1136:2: iv_ruleOnly2= ruleOnly2 EOF
            {
             newCompositeNode(grammarAccess.getOnly2Rule()); 
            pushFollow(FOLLOW_ruleOnly2_in_entryRuleOnly22422);
            iv_ruleOnly2=ruleOnly2();

            state._fsp--;

             current =iv_ruleOnly2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnly22432); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1143:1: ruleOnly2 returns [EObject current=null] : ( (lv_only2_0_0= '-only' ) ) ;
    public final EObject ruleOnly2() throws RecognitionException {
        EObject current = null;

        Token lv_only2_0_0=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1146:28: ( ( (lv_only2_0_0= '-only' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1147:1: ( (lv_only2_0_0= '-only' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1147:1: ( (lv_only2_0_0= '-only' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1148:1: (lv_only2_0_0= '-only' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1148:1: (lv_only2_0_0= '-only' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1149:3: lv_only2_0_0= '-only'
            {
            lv_only2_0_0=(Token)match(input,33,FOLLOW_33_in_ruleOnly22474); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1170:1: entryRuleMust returns [EObject current=null] : iv_ruleMust= ruleMust EOF ;
    public final EObject entryRuleMust() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMust = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1171:2: (iv_ruleMust= ruleMust EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1172:2: iv_ruleMust= ruleMust EOF
            {
             newCompositeNode(grammarAccess.getMustRule()); 
            pushFollow(FOLLOW_ruleMust_in_entryRuleMust2522);
            iv_ruleMust=ruleMust();

            state._fsp--;

             current =iv_ruleMust; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMust2532); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1179:1: ruleMust returns [EObject current=null] : ( (lv_must_0_0= 'must-' ) ) ;
    public final EObject ruleMust() throws RecognitionException {
        EObject current = null;

        Token lv_must_0_0=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1182:28: ( ( (lv_must_0_0= 'must-' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1183:1: ( (lv_must_0_0= 'must-' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1183:1: ( (lv_must_0_0= 'must-' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1184:1: (lv_must_0_0= 'must-' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1184:1: (lv_must_0_0= 'must-' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1185:3: lv_must_0_0= 'must-'
            {
            lv_must_0_0=(Token)match(input,34,FOLLOW_34_in_ruleMust2574); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1206:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1207:2: (iv_ruleElementType= ruleElementType EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1208:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_ruleElementType_in_entryRuleElementType2622);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementType2632); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1215:1: ruleElementType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_EntityType_1 = null;


         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1218:28: ( (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1219:1: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1219:1: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
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
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1220:5: this_BasicType_0= ruleBasicType
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicType_in_ruleElementType2679);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;

                     
                            current = this_BasicType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1230:5: this_EntityType_1= ruleEntityType
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntityType_in_ruleElementType2706);
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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1246:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1247:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1248:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType2741);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType2751); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1255:1: ruleBasicType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;
        Token lv_typeName_0_5=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1258:28: ( ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1259:1: ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1259:1: ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1260:1: ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1260:1: ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1261:1: (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1261:1: (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' )
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
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1262:3: lv_typeName_0_1= 'access'
                    {
                    lv_typeName_0_1=(Token)match(input,35,FOLLOW_35_in_ruleBasicType2795); 

                            newLeafNode(lv_typeName_0_1, grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1274:8: lv_typeName_0_2= 'declare'
                    {
                    lv_typeName_0_2=(Token)match(input,36,FOLLOW_36_in_ruleBasicType2824); 

                            newLeafNode(lv_typeName_0_2, grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1286:8: lv_typeName_0_3= 'handle'
                    {
                    lv_typeName_0_3=(Token)match(input,37,FOLLOW_37_in_ruleBasicType2853); 

                            newLeafNode(lv_typeName_0_3, grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1298:8: lv_typeName_0_4= 'create'
                    {
                    lv_typeName_0_4=(Token)match(input,38,FOLLOW_38_in_ruleBasicType2882); 

                            newLeafNode(lv_typeName_0_4, grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1310:8: lv_typeName_0_5= 'depend'
                    {
                    lv_typeName_0_5=(Token)match(input,39,FOLLOW_39_in_ruleBasicType2911); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1333:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1334:2: (iv_ruleEntityType= ruleEntityType EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1335:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType2962);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType2972); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1342:1: ruleEntityType returns [EObject current=null] : ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_entity_0_1=null;
        Token lv_entity_0_2=null;
        Token lv_entity_0_3=null;
        Token lv_entity_0_4=null;
        Token lv_entity_0_5=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1345:28: ( ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1346:1: ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1346:1: ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1347:1: ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1347:1: ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1348:1: (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1348:1: (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' )
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
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1349:3: lv_entity_0_1= 'extend'
                    {
                    lv_entity_0_1=(Token)match(input,40,FOLLOW_40_in_ruleEntityType3016); 

                            newLeafNode(lv_entity_0_1, grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1361:8: lv_entity_0_2= 'implement'
                    {
                    lv_entity_0_2=(Token)match(input,41,FOLLOW_41_in_ruleEntityType3045); 

                            newLeafNode(lv_entity_0_2, grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1373:8: lv_entity_0_3= 'derive'
                    {
                    lv_entity_0_3=(Token)match(input,42,FOLLOW_42_in_ruleEntityType3074); 

                            newLeafNode(lv_entity_0_3, grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1385:8: lv_entity_0_4= 'throw'
                    {
                    lv_entity_0_4=(Token)match(input,43,FOLLOW_43_in_ruleEntityType3103); 

                            newLeafNode(lv_entity_0_4, grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1397:8: lv_entity_0_5= 'useannotation'
                    {
                    lv_entity_0_5=(Token)match(input,44,FOLLOW_44_in_ruleEntityType3132); 

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel134 = new BitSet(new long[]{0x0000000030C08000L});
    public static final BitSet FOLLOW_ruleDCLStructureElement_in_ruleModel155 = new BitSet(new long[]{0x0000000030C0A000L});
    public static final BitSet FOLLOW_13_in_ruleModel168 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModel180 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel192 = new BitSet(new long[]{0x0000000040002010L});
    public static final BitSet FOLLOW_ruleDCDecl_in_ruleModel213 = new BitSet(new long[]{0x0000000040002010L});
    public static final BitSet FOLLOW_13_in_ruleModel226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLStructureElement_in_entryRuleDCLStructureElement262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLStructureElement272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLLayer_in_ruleDCLStructureElement319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLComponent_in_ruleDCLStructureElement346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLSubSystem_in_ruleDCLStructureElement373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLModule_in_ruleDCLStructureElement400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLComponentInterface_in_ruleDCLStructureElement427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLLayer_in_entryRuleDCLLayer462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLLayer472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDCLLayer509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLLayer526 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDCLLayer543 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDCLLayer555 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDCLLayer572 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16_in_ruleDCLLayer591 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDCLLayer603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLLayer623 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16_in_ruleDCLLayer643 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDCLLayer655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLLayer675 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16_in_ruleDCLLayer695 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDCLLayer707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLLayer727 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDCLLayer742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLComponent_in_entryRuleDCLComponent778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLComponent788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDCLComponent825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLComponent842 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16_in_ruleDCLComponent861 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDCLComponent873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLComponent893 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16_in_ruleDCLComponent913 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDCLComponent925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLComponent945 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDCLComponent960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLComponentInterface_in_entryRuleDCLComponentInterface996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLComponentInterface1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDCLComponentInterface1043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLComponentInterface1060 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDCLComponentInterface1077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLComponentInterface1097 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDCLComponentInterface1110 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDCLComponentInterface1122 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleInterfaceType_in_ruleDCLComponentInterface1143 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDCLComponentInterface1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceType_in_entryRuleInterfaceType1192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceType1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleInterfaceType1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleInterfaceType1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLSubSystem_in_entryRuleDCLSubSystem1326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLSubSystem1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDCLSubSystem1373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLSubSystem1390 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16_in_ruleDCLSubSystem1408 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDCLSubSystem1420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLSubSystem1440 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDCLSubSystem1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLModule_in_entryRuleDCLModule1490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLModule1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDCLModule1537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLModule1554 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDCLModule1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCDecl_in_entryRuleDCDecl1607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCDecl1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly_in_ruleDCDecl1664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1684 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleCan_in_ruleDCDecl1705 = new BitSet(new long[]{0x00001FF800000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleDCDecl1726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1746 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDCDecl1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1786 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleCannot_in_ruleDCDecl1807 = new BitSet(new long[]{0x00001FF800000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleDCDecl1828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1848 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDCDecl1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1888 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleCan_in_ruleDCDecl1909 = new BitSet(new long[]{0x00001FF800000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleDCDecl1930 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleOnly2_in_ruleDCDecl1951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1971 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDCDecl1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl2011 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleMust_in_ruleDCDecl2032 = new BitSet(new long[]{0x00001FF800000000L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleDCDecl2053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl2073 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDCDecl2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly_in_entryRuleOnly2122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnly2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOnly2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCan_in_entryRuleCan2222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCan2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCan2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCannot_in_entryRuleCannot2322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCannot2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCannot2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly2_in_entryRuleOnly22422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnly22432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOnly22474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMust_in_entryRuleMust2522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMust2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMust2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_entryRuleElementType2622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementType2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleElementType2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleElementType2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType2741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBasicType2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBasicType2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBasicType2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBasicType2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBasicType2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType2962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEntityType3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleEntityType3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEntityType3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEntityType3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleEntityType3132 = new BitSet(new long[]{0x0000000000000002L});

}