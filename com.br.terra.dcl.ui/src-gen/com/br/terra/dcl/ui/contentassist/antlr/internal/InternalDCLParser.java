package com.br.terra.dcl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.br.terra.dcl.services.DCLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDCLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'provided'", "'required'", "'access'", "'declare'", "'handle'", "'create'", "'depend'", "'extend'", "'implement'", "'derive'", "'throw'", "'useannotation'", "'architeturalElements'", "'{'", "'}'", "'restrictions'", "'layer'", "','", "'level'", "';'", "'inLayer: '", "'inSubSystem: '", "'inComponent: '", "'component'", "'interface'", "'ofComponent '", "'type: '", "'subSystem'", "'module'", "'only'", "'can-'", "'cannot-'", "'-only'", "'must-'"
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
    public String getGrammarFileName() { return "../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g"; }


     
     	private DCLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DCLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:61:1: ( ruleModel EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:76:1: ( rule__Model__Group__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDCLStructureElement"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:88:1: entryRuleDCLStructureElement : ruleDCLStructureElement EOF ;
    public final void entryRuleDCLStructureElement() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:89:1: ( ruleDCLStructureElement EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:90:1: ruleDCLStructureElement EOF
            {
             before(grammarAccess.getDCLStructureElementRule()); 
            pushFollow(FOLLOW_ruleDCLStructureElement_in_entryRuleDCLStructureElement121);
            ruleDCLStructureElement();

            state._fsp--;

             after(grammarAccess.getDCLStructureElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLStructureElement128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDCLStructureElement"


    // $ANTLR start "ruleDCLStructureElement"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:97:1: ruleDCLStructureElement : ( ( rule__DCLStructureElement__Alternatives ) ) ;
    public final void ruleDCLStructureElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:101:2: ( ( ( rule__DCLStructureElement__Alternatives ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:102:1: ( ( rule__DCLStructureElement__Alternatives ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:102:1: ( ( rule__DCLStructureElement__Alternatives ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:103:1: ( rule__DCLStructureElement__Alternatives )
            {
             before(grammarAccess.getDCLStructureElementAccess().getAlternatives()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:104:1: ( rule__DCLStructureElement__Alternatives )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:104:2: rule__DCLStructureElement__Alternatives
            {
            pushFollow(FOLLOW_rule__DCLStructureElement__Alternatives_in_ruleDCLStructureElement154);
            rule__DCLStructureElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDCLStructureElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDCLStructureElement"


    // $ANTLR start "entryRuleDCLLayer"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:116:1: entryRuleDCLLayer : ruleDCLLayer EOF ;
    public final void entryRuleDCLLayer() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:117:1: ( ruleDCLLayer EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:118:1: ruleDCLLayer EOF
            {
             before(grammarAccess.getDCLLayerRule()); 
            pushFollow(FOLLOW_ruleDCLLayer_in_entryRuleDCLLayer181);
            ruleDCLLayer();

            state._fsp--;

             after(grammarAccess.getDCLLayerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLLayer188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDCLLayer"


    // $ANTLR start "ruleDCLLayer"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:125:1: ruleDCLLayer : ( ( rule__DCLLayer__Group__0 ) ) ;
    public final void ruleDCLLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:129:2: ( ( ( rule__DCLLayer__Group__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:130:1: ( ( rule__DCLLayer__Group__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:130:1: ( ( rule__DCLLayer__Group__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:131:1: ( rule__DCLLayer__Group__0 )
            {
             before(grammarAccess.getDCLLayerAccess().getGroup()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:132:1: ( rule__DCLLayer__Group__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:132:2: rule__DCLLayer__Group__0
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__0_in_ruleDCLLayer214);
            rule__DCLLayer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDCLLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDCLLayer"


    // $ANTLR start "entryRuleDCLComponent"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:144:1: entryRuleDCLComponent : ruleDCLComponent EOF ;
    public final void entryRuleDCLComponent() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:145:1: ( ruleDCLComponent EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:146:1: ruleDCLComponent EOF
            {
             before(grammarAccess.getDCLComponentRule()); 
            pushFollow(FOLLOW_ruleDCLComponent_in_entryRuleDCLComponent241);
            ruleDCLComponent();

            state._fsp--;

             after(grammarAccess.getDCLComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLComponent248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDCLComponent"


    // $ANTLR start "ruleDCLComponent"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:153:1: ruleDCLComponent : ( ( rule__DCLComponent__Group__0 ) ) ;
    public final void ruleDCLComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:157:2: ( ( ( rule__DCLComponent__Group__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:158:1: ( ( rule__DCLComponent__Group__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:158:1: ( ( rule__DCLComponent__Group__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:159:1: ( rule__DCLComponent__Group__0 )
            {
             before(grammarAccess.getDCLComponentAccess().getGroup()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:160:1: ( rule__DCLComponent__Group__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:160:2: rule__DCLComponent__Group__0
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group__0_in_ruleDCLComponent274);
            rule__DCLComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDCLComponent"


    // $ANTLR start "entryRuleDCLComponentInterface"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:172:1: entryRuleDCLComponentInterface : ruleDCLComponentInterface EOF ;
    public final void entryRuleDCLComponentInterface() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:173:1: ( ruleDCLComponentInterface EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:174:1: ruleDCLComponentInterface EOF
            {
             before(grammarAccess.getDCLComponentInterfaceRule()); 
            pushFollow(FOLLOW_ruleDCLComponentInterface_in_entryRuleDCLComponentInterface301);
            ruleDCLComponentInterface();

            state._fsp--;

             after(grammarAccess.getDCLComponentInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLComponentInterface308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDCLComponentInterface"


    // $ANTLR start "ruleDCLComponentInterface"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:181:1: ruleDCLComponentInterface : ( ( rule__DCLComponentInterface__Group__0 ) ) ;
    public final void ruleDCLComponentInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:185:2: ( ( ( rule__DCLComponentInterface__Group__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:186:1: ( ( rule__DCLComponentInterface__Group__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:186:1: ( ( rule__DCLComponentInterface__Group__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:187:1: ( rule__DCLComponentInterface__Group__0 )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getGroup()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:188:1: ( rule__DCLComponentInterface__Group__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:188:2: rule__DCLComponentInterface__Group__0
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__0_in_ruleDCLComponentInterface334);
            rule__DCLComponentInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDCLComponentInterface"


    // $ANTLR start "entryRuleInterfaceType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:200:1: entryRuleInterfaceType : ruleInterfaceType EOF ;
    public final void entryRuleInterfaceType() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:201:1: ( ruleInterfaceType EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:202:1: ruleInterfaceType EOF
            {
             before(grammarAccess.getInterfaceTypeRule()); 
            pushFollow(FOLLOW_ruleInterfaceType_in_entryRuleInterfaceType361);
            ruleInterfaceType();

            state._fsp--;

             after(grammarAccess.getInterfaceTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceType368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterfaceType"


    // $ANTLR start "ruleInterfaceType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:209:1: ruleInterfaceType : ( ( rule__InterfaceType__InterfaceTypeNameAssignment ) ) ;
    public final void ruleInterfaceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:213:2: ( ( ( rule__InterfaceType__InterfaceTypeNameAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:214:1: ( ( rule__InterfaceType__InterfaceTypeNameAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:214:1: ( ( rule__InterfaceType__InterfaceTypeNameAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:215:1: ( rule__InterfaceType__InterfaceTypeNameAssignment )
            {
             before(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:216:1: ( rule__InterfaceType__InterfaceTypeNameAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:216:2: rule__InterfaceType__InterfaceTypeNameAssignment
            {
            pushFollow(FOLLOW_rule__InterfaceType__InterfaceTypeNameAssignment_in_ruleInterfaceType394);
            rule__InterfaceType__InterfaceTypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceType"


    // $ANTLR start "entryRuleDCLSubSystem"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:228:1: entryRuleDCLSubSystem : ruleDCLSubSystem EOF ;
    public final void entryRuleDCLSubSystem() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:229:1: ( ruleDCLSubSystem EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:230:1: ruleDCLSubSystem EOF
            {
             before(grammarAccess.getDCLSubSystemRule()); 
            pushFollow(FOLLOW_ruleDCLSubSystem_in_entryRuleDCLSubSystem421);
            ruleDCLSubSystem();

            state._fsp--;

             after(grammarAccess.getDCLSubSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLSubSystem428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDCLSubSystem"


    // $ANTLR start "ruleDCLSubSystem"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:237:1: ruleDCLSubSystem : ( ( rule__DCLSubSystem__Group__0 ) ) ;
    public final void ruleDCLSubSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:241:2: ( ( ( rule__DCLSubSystem__Group__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:242:1: ( ( rule__DCLSubSystem__Group__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:242:1: ( ( rule__DCLSubSystem__Group__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:243:1: ( rule__DCLSubSystem__Group__0 )
            {
             before(grammarAccess.getDCLSubSystemAccess().getGroup()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:244:1: ( rule__DCLSubSystem__Group__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:244:2: rule__DCLSubSystem__Group__0
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__Group__0_in_ruleDCLSubSystem454);
            rule__DCLSubSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDCLSubSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDCLSubSystem"


    // $ANTLR start "entryRuleDCLModule"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:256:1: entryRuleDCLModule : ruleDCLModule EOF ;
    public final void entryRuleDCLModule() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:257:1: ( ruleDCLModule EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:258:1: ruleDCLModule EOF
            {
             before(grammarAccess.getDCLModuleRule()); 
            pushFollow(FOLLOW_ruleDCLModule_in_entryRuleDCLModule481);
            ruleDCLModule();

            state._fsp--;

             after(grammarAccess.getDCLModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLModule488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDCLModule"


    // $ANTLR start "ruleDCLModule"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:265:1: ruleDCLModule : ( ( rule__DCLModule__Group__0 ) ) ;
    public final void ruleDCLModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:269:2: ( ( ( rule__DCLModule__Group__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:270:1: ( ( rule__DCLModule__Group__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:270:1: ( ( rule__DCLModule__Group__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:271:1: ( rule__DCLModule__Group__0 )
            {
             before(grammarAccess.getDCLModuleAccess().getGroup()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:272:1: ( rule__DCLModule__Group__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:272:2: rule__DCLModule__Group__0
            {
            pushFollow(FOLLOW_rule__DCLModule__Group__0_in_ruleDCLModule514);
            rule__DCLModule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDCLModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDCLModule"


    // $ANTLR start "entryRuleDCDecl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:284:1: entryRuleDCDecl : ruleDCDecl EOF ;
    public final void entryRuleDCDecl() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:285:1: ( ruleDCDecl EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:286:1: ruleDCDecl EOF
            {
             before(grammarAccess.getDCDeclRule()); 
            pushFollow(FOLLOW_ruleDCDecl_in_entryRuleDCDecl541);
            ruleDCDecl();

            state._fsp--;

             after(grammarAccess.getDCDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCDecl548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDCDecl"


    // $ANTLR start "ruleDCDecl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:293:1: ruleDCDecl : ( ( rule__DCDecl__Alternatives ) ) ;
    public final void ruleDCDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:297:2: ( ( ( rule__DCDecl__Alternatives ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:298:1: ( ( rule__DCDecl__Alternatives ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:298:1: ( ( rule__DCDecl__Alternatives ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:299:1: ( rule__DCDecl__Alternatives )
            {
             before(grammarAccess.getDCDeclAccess().getAlternatives()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:300:1: ( rule__DCDecl__Alternatives )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:300:2: rule__DCDecl__Alternatives
            {
            pushFollow(FOLLOW_rule__DCDecl__Alternatives_in_ruleDCDecl574);
            rule__DCDecl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDCDecl"


    // $ANTLR start "entryRuleOnly"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:312:1: entryRuleOnly : ruleOnly EOF ;
    public final void entryRuleOnly() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:313:1: ( ruleOnly EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:314:1: ruleOnly EOF
            {
             before(grammarAccess.getOnlyRule()); 
            pushFollow(FOLLOW_ruleOnly_in_entryRuleOnly601);
            ruleOnly();

            state._fsp--;

             after(grammarAccess.getOnlyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnly608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnly"


    // $ANTLR start "ruleOnly"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:321:1: ruleOnly : ( ( rule__Only__OnlyAssignment ) ) ;
    public final void ruleOnly() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:325:2: ( ( ( rule__Only__OnlyAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:326:1: ( ( rule__Only__OnlyAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:326:1: ( ( rule__Only__OnlyAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:327:1: ( rule__Only__OnlyAssignment )
            {
             before(grammarAccess.getOnlyAccess().getOnlyAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:328:1: ( rule__Only__OnlyAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:328:2: rule__Only__OnlyAssignment
            {
            pushFollow(FOLLOW_rule__Only__OnlyAssignment_in_ruleOnly634);
            rule__Only__OnlyAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOnlyAccess().getOnlyAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnly"


    // $ANTLR start "entryRuleCan"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:340:1: entryRuleCan : ruleCan EOF ;
    public final void entryRuleCan() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:341:1: ( ruleCan EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:342:1: ruleCan EOF
            {
             before(grammarAccess.getCanRule()); 
            pushFollow(FOLLOW_ruleCan_in_entryRuleCan661);
            ruleCan();

            state._fsp--;

             after(grammarAccess.getCanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCan668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCan"


    // $ANTLR start "ruleCan"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:349:1: ruleCan : ( ( rule__Can__CanAssignment ) ) ;
    public final void ruleCan() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:353:2: ( ( ( rule__Can__CanAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:354:1: ( ( rule__Can__CanAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:354:1: ( ( rule__Can__CanAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:355:1: ( rule__Can__CanAssignment )
            {
             before(grammarAccess.getCanAccess().getCanAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:356:1: ( rule__Can__CanAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:356:2: rule__Can__CanAssignment
            {
            pushFollow(FOLLOW_rule__Can__CanAssignment_in_ruleCan694);
            rule__Can__CanAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCanAccess().getCanAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCan"


    // $ANTLR start "entryRuleCannot"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:368:1: entryRuleCannot : ruleCannot EOF ;
    public final void entryRuleCannot() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:369:1: ( ruleCannot EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:370:1: ruleCannot EOF
            {
             before(grammarAccess.getCannotRule()); 
            pushFollow(FOLLOW_ruleCannot_in_entryRuleCannot721);
            ruleCannot();

            state._fsp--;

             after(grammarAccess.getCannotRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCannot728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCannot"


    // $ANTLR start "ruleCannot"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:377:1: ruleCannot : ( ( rule__Cannot__CannotAssignment ) ) ;
    public final void ruleCannot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:381:2: ( ( ( rule__Cannot__CannotAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:382:1: ( ( rule__Cannot__CannotAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:382:1: ( ( rule__Cannot__CannotAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:383:1: ( rule__Cannot__CannotAssignment )
            {
             before(grammarAccess.getCannotAccess().getCannotAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:384:1: ( rule__Cannot__CannotAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:384:2: rule__Cannot__CannotAssignment
            {
            pushFollow(FOLLOW_rule__Cannot__CannotAssignment_in_ruleCannot754);
            rule__Cannot__CannotAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCannotAccess().getCannotAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCannot"


    // $ANTLR start "entryRuleOnly2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:396:1: entryRuleOnly2 : ruleOnly2 EOF ;
    public final void entryRuleOnly2() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:397:1: ( ruleOnly2 EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:398:1: ruleOnly2 EOF
            {
             before(grammarAccess.getOnly2Rule()); 
            pushFollow(FOLLOW_ruleOnly2_in_entryRuleOnly2781);
            ruleOnly2();

            state._fsp--;

             after(grammarAccess.getOnly2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnly2788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnly2"


    // $ANTLR start "ruleOnly2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:405:1: ruleOnly2 : ( ( rule__Only2__Only2Assignment ) ) ;
    public final void ruleOnly2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:409:2: ( ( ( rule__Only2__Only2Assignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:410:1: ( ( rule__Only2__Only2Assignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:410:1: ( ( rule__Only2__Only2Assignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:411:1: ( rule__Only2__Only2Assignment )
            {
             before(grammarAccess.getOnly2Access().getOnly2Assignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:412:1: ( rule__Only2__Only2Assignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:412:2: rule__Only2__Only2Assignment
            {
            pushFollow(FOLLOW_rule__Only2__Only2Assignment_in_ruleOnly2814);
            rule__Only2__Only2Assignment();

            state._fsp--;


            }

             after(grammarAccess.getOnly2Access().getOnly2Assignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnly2"


    // $ANTLR start "entryRuleMust"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:424:1: entryRuleMust : ruleMust EOF ;
    public final void entryRuleMust() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:425:1: ( ruleMust EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:426:1: ruleMust EOF
            {
             before(grammarAccess.getMustRule()); 
            pushFollow(FOLLOW_ruleMust_in_entryRuleMust841);
            ruleMust();

            state._fsp--;

             after(grammarAccess.getMustRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMust848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMust"


    // $ANTLR start "ruleMust"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:433:1: ruleMust : ( ( rule__Must__MustAssignment ) ) ;
    public final void ruleMust() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:437:2: ( ( ( rule__Must__MustAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:438:1: ( ( rule__Must__MustAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:438:1: ( ( rule__Must__MustAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:439:1: ( rule__Must__MustAssignment )
            {
             before(grammarAccess.getMustAccess().getMustAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:440:1: ( rule__Must__MustAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:440:2: rule__Must__MustAssignment
            {
            pushFollow(FOLLOW_rule__Must__MustAssignment_in_ruleMust874);
            rule__Must__MustAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMustAccess().getMustAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMust"


    // $ANTLR start "entryRuleElementType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:452:1: entryRuleElementType : ruleElementType EOF ;
    public final void entryRuleElementType() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:453:1: ( ruleElementType EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:454:1: ruleElementType EOF
            {
             before(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_ruleElementType_in_entryRuleElementType901);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getElementTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementType908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:461:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:465:2: ( ( ( rule__ElementType__Alternatives ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:466:1: ( ( rule__ElementType__Alternatives ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:466:1: ( ( rule__ElementType__Alternatives ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:467:1: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:468:1: ( rule__ElementType__Alternatives )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:468:2: rule__ElementType__Alternatives
            {
            pushFollow(FOLLOW_rule__ElementType__Alternatives_in_ruleElementType934);
            rule__ElementType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleBasicType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:480:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:481:1: ( ruleBasicType EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:482:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType961);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:489:1: ruleBasicType : ( ( rule__BasicType__TypeNameAssignment ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:493:2: ( ( ( rule__BasicType__TypeNameAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:494:1: ( ( rule__BasicType__TypeNameAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:494:1: ( ( rule__BasicType__TypeNameAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:495:1: ( rule__BasicType__TypeNameAssignment )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:496:1: ( rule__BasicType__TypeNameAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:496:2: rule__BasicType__TypeNameAssignment
            {
            pushFollow(FOLLOW_rule__BasicType__TypeNameAssignment_in_ruleBasicType994);
            rule__BasicType__TypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleEntityType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:508:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:509:1: ( ruleEntityType EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:510:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType1021);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:517:1: ruleEntityType : ( ( rule__EntityType__EntityAssignment ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:521:2: ( ( ( rule__EntityType__EntityAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:522:1: ( ( rule__EntityType__EntityAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:522:1: ( ( rule__EntityType__EntityAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:523:1: ( rule__EntityType__EntityAssignment )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:524:1: ( rule__EntityType__EntityAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:524:2: rule__EntityType__EntityAssignment
            {
            pushFollow(FOLLOW_rule__EntityType__EntityAssignment_in_ruleEntityType1054);
            rule__EntityType__EntityAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "rule__DCLStructureElement__Alternatives"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:536:1: rule__DCLStructureElement__Alternatives : ( ( ruleDCLLayer ) | ( ruleDCLComponent ) | ( ruleDCLSubSystem ) | ( ruleDCLModule ) | ( ruleDCLComponentInterface ) );
    public final void rule__DCLStructureElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:540:1: ( ( ruleDCLLayer ) | ( ruleDCLComponent ) | ( ruleDCLSubSystem ) | ( ruleDCLModule ) | ( ruleDCLComponentInterface ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt1=1;
                }
                break;
            case 34:
                {
                alt1=2;
                }
                break;
            case 38:
                {
                alt1=3;
                }
                break;
            case 39:
                {
                alt1=4;
                }
                break;
            case 35:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:541:1: ( ruleDCLLayer )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:541:1: ( ruleDCLLayer )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:542:1: ruleDCLLayer
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLLayerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDCLLayer_in_rule__DCLStructureElement__Alternatives1090);
                    ruleDCLLayer();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLLayerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:547:6: ( ruleDCLComponent )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:547:6: ( ruleDCLComponent )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:548:1: ruleDCLComponent
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDCLComponent_in_rule__DCLStructureElement__Alternatives1107);
                    ruleDCLComponent();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLComponentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:553:6: ( ruleDCLSubSystem )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:553:6: ( ruleDCLSubSystem )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:554:1: ruleDCLSubSystem
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLSubSystemParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDCLSubSystem_in_rule__DCLStructureElement__Alternatives1124);
                    ruleDCLSubSystem();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLSubSystemParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:559:6: ( ruleDCLModule )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:559:6: ( ruleDCLModule )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:560:1: ruleDCLModule
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLModuleParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDCLModule_in_rule__DCLStructureElement__Alternatives1141);
                    ruleDCLModule();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLModuleParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:565:6: ( ruleDCLComponentInterface )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:565:6: ( ruleDCLComponentInterface )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:566:1: ruleDCLComponentInterface
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLComponentInterfaceParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDCLComponentInterface_in_rule__DCLStructureElement__Alternatives1158);
                    ruleDCLComponentInterface();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLComponentInterfaceParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLStructureElement__Alternatives"


    // $ANTLR start "rule__DCLLayer__Alternatives_5"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:576:1: rule__DCLLayer__Alternatives_5 : ( ( ( rule__DCLLayer__Group_5_0__0 ) ) | ( ( rule__DCLLayer__Group_5_1__0 ) ) | ( ( rule__DCLLayer__Group_5_2__0 ) ) );
    public final void rule__DCLLayer__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:580:1: ( ( ( rule__DCLLayer__Group_5_0__0 ) ) | ( ( rule__DCLLayer__Group_5_1__0 ) ) | ( ( rule__DCLLayer__Group_5_2__0 ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                switch ( input.LA(2) ) {
                case 31:
                    {
                    alt2=1;
                    }
                    break;
                case 33:
                    {
                    alt2=3;
                    }
                    break;
                case 32:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:581:1: ( ( rule__DCLLayer__Group_5_0__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:581:1: ( ( rule__DCLLayer__Group_5_0__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:582:1: ( rule__DCLLayer__Group_5_0__0 )
                    {
                     before(grammarAccess.getDCLLayerAccess().getGroup_5_0()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:583:1: ( rule__DCLLayer__Group_5_0__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:583:2: rule__DCLLayer__Group_5_0__0
                    {
                    pushFollow(FOLLOW_rule__DCLLayer__Group_5_0__0_in_rule__DCLLayer__Alternatives_51190);
                    rule__DCLLayer__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCLLayerAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:587:6: ( ( rule__DCLLayer__Group_5_1__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:587:6: ( ( rule__DCLLayer__Group_5_1__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:588:1: ( rule__DCLLayer__Group_5_1__0 )
                    {
                     before(grammarAccess.getDCLLayerAccess().getGroup_5_1()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:589:1: ( rule__DCLLayer__Group_5_1__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:589:2: rule__DCLLayer__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__DCLLayer__Group_5_1__0_in_rule__DCLLayer__Alternatives_51208);
                    rule__DCLLayer__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCLLayerAccess().getGroup_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:593:6: ( ( rule__DCLLayer__Group_5_2__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:593:6: ( ( rule__DCLLayer__Group_5_2__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:594:1: ( rule__DCLLayer__Group_5_2__0 )
                    {
                     before(grammarAccess.getDCLLayerAccess().getGroup_5_2()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:595:1: ( rule__DCLLayer__Group_5_2__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:595:2: rule__DCLLayer__Group_5_2__0
                    {
                    pushFollow(FOLLOW_rule__DCLLayer__Group_5_2__0_in_rule__DCLLayer__Alternatives_51226);
                    rule__DCLLayer__Group_5_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCLLayerAccess().getGroup_5_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Alternatives_5"


    // $ANTLR start "rule__DCLComponent__Alternatives_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:604:1: rule__DCLComponent__Alternatives_2 : ( ( ( rule__DCLComponent__Group_2_0__0 ) ) | ( ( rule__DCLComponent__Group_2_1__0 ) ) );
    public final void rule__DCLComponent__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:608:1: ( ( ( rule__DCLComponent__Group_2_0__0 ) ) | ( ( rule__DCLComponent__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==32) ) {
                    alt3=2;
                }
                else if ( (LA3_1==31) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:609:1: ( ( rule__DCLComponent__Group_2_0__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:609:1: ( ( rule__DCLComponent__Group_2_0__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:610:1: ( rule__DCLComponent__Group_2_0__0 )
                    {
                     before(grammarAccess.getDCLComponentAccess().getGroup_2_0()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:611:1: ( rule__DCLComponent__Group_2_0__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:611:2: rule__DCLComponent__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__DCLComponent__Group_2_0__0_in_rule__DCLComponent__Alternatives_21259);
                    rule__DCLComponent__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCLComponentAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:615:6: ( ( rule__DCLComponent__Group_2_1__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:615:6: ( ( rule__DCLComponent__Group_2_1__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:616:1: ( rule__DCLComponent__Group_2_1__0 )
                    {
                     before(grammarAccess.getDCLComponentAccess().getGroup_2_1()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:617:1: ( rule__DCLComponent__Group_2_1__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:617:2: rule__DCLComponent__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__DCLComponent__Group_2_1__0_in_rule__DCLComponent__Alternatives_21277);
                    rule__DCLComponent__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCLComponentAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Alternatives_2"


    // $ANTLR start "rule__InterfaceType__InterfaceTypeNameAlternatives_0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:626:1: rule__InterfaceType__InterfaceTypeNameAlternatives_0 : ( ( 'provided' ) | ( 'required' ) );
    public final void rule__InterfaceType__InterfaceTypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:630:1: ( ( 'provided' ) | ( 'required' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:631:1: ( 'provided' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:631:1: ( 'provided' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:632:1: 'provided'
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameProvidedKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__InterfaceType__InterfaceTypeNameAlternatives_01311); 
                     after(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameProvidedKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:639:6: ( 'required' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:639:6: ( 'required' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:640:1: 'required'
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameRequiredKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__InterfaceType__InterfaceTypeNameAlternatives_01331); 
                     after(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameRequiredKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceType__InterfaceTypeNameAlternatives_0"


    // $ANTLR start "rule__DCDecl__Alternatives"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:652:1: rule__DCDecl__Alternatives : ( ( ( rule__DCDecl__Group_0__0 ) ) | ( ( rule__DCDecl__Group_1__0 ) ) | ( ( rule__DCDecl__Group_2__0 ) ) | ( ( rule__DCDecl__Group_3__0 ) ) );
    public final void rule__DCDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:656:1: ( ( ( rule__DCDecl__Group_0__0 ) ) | ( ( rule__DCDecl__Group_1__0 ) ) | ( ( rule__DCDecl__Group_2__0 ) ) | ( ( rule__DCDecl__Group_3__0 ) ) )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==40) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 41:
                    {
                    alt5=3;
                    }
                    break;
                case 42:
                    {
                    alt5=2;
                    }
                    break;
                case 44:
                    {
                    alt5=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:657:1: ( ( rule__DCDecl__Group_0__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:657:1: ( ( rule__DCDecl__Group_0__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:658:1: ( rule__DCDecl__Group_0__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_0()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:659:1: ( rule__DCDecl__Group_0__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:659:2: rule__DCDecl__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__DCDecl__Group_0__0_in_rule__DCDecl__Alternatives1365);
                    rule__DCDecl__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:663:6: ( ( rule__DCDecl__Group_1__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:663:6: ( ( rule__DCDecl__Group_1__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:664:1: ( rule__DCDecl__Group_1__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_1()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:665:1: ( rule__DCDecl__Group_1__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:665:2: rule__DCDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DCDecl__Group_1__0_in_rule__DCDecl__Alternatives1383);
                    rule__DCDecl__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:669:6: ( ( rule__DCDecl__Group_2__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:669:6: ( ( rule__DCDecl__Group_2__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:670:1: ( rule__DCDecl__Group_2__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_2()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:671:1: ( rule__DCDecl__Group_2__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:671:2: rule__DCDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DCDecl__Group_2__0_in_rule__DCDecl__Alternatives1401);
                    rule__DCDecl__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:675:6: ( ( rule__DCDecl__Group_3__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:675:6: ( ( rule__DCDecl__Group_3__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:676:1: ( rule__DCDecl__Group_3__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_3()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:677:1: ( rule__DCDecl__Group_3__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:677:2: rule__DCDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DCDecl__Group_3__0_in_rule__DCDecl__Alternatives1419);
                    rule__DCDecl__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Alternatives"


    // $ANTLR start "rule__ElementType__Alternatives"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:686:1: rule__ElementType__Alternatives : ( ( ruleBasicType ) | ( ruleEntityType ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:690:1: ( ( ruleBasicType ) | ( ruleEntityType ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=13 && LA6_0<=17)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=18 && LA6_0<=22)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:691:1: ( ruleBasicType )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:691:1: ( ruleBasicType )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:692:1: ruleBasicType
                    {
                     before(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBasicType_in_rule__ElementType__Alternatives1452);
                    ruleBasicType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:697:6: ( ruleEntityType )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:697:6: ( ruleEntityType )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:698:1: ruleEntityType
                    {
                     before(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntityType_in_rule__ElementType__Alternatives1469);
                    ruleEntityType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__Alternatives"


    // $ANTLR start "rule__BasicType__TypeNameAlternatives_0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:708:1: rule__BasicType__TypeNameAlternatives_0 : ( ( 'access' ) | ( 'declare' ) | ( 'handle' ) | ( 'create' ) | ( 'depend' ) );
    public final void rule__BasicType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:712:1: ( ( 'access' ) | ( 'declare' ) | ( 'handle' ) | ( 'create' ) | ( 'depend' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            case 16:
                {
                alt7=4;
                }
                break;
            case 17:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:713:1: ( 'access' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:713:1: ( 'access' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:714:1: 'access'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__BasicType__TypeNameAlternatives_01502); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:721:6: ( 'declare' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:721:6: ( 'declare' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:722:1: 'declare'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__BasicType__TypeNameAlternatives_01522); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:729:6: ( 'handle' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:729:6: ( 'handle' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:730:1: 'handle'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2()); 
                    match(input,15,FOLLOW_15_in_rule__BasicType__TypeNameAlternatives_01542); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:737:6: ( 'create' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:737:6: ( 'create' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:738:1: 'create'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3()); 
                    match(input,16,FOLLOW_16_in_rule__BasicType__TypeNameAlternatives_01562); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:745:6: ( 'depend' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:745:6: ( 'depend' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:746:1: 'depend'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameDependKeyword_0_4()); 
                    match(input,17,FOLLOW_17_in_rule__BasicType__TypeNameAlternatives_01582); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameDependKeyword_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__TypeNameAlternatives_0"


    // $ANTLR start "rule__EntityType__EntityAlternatives_0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:758:1: rule__EntityType__EntityAlternatives_0 : ( ( 'extend' ) | ( 'implement' ) | ( 'derive' ) | ( 'throw' ) | ( 'useannotation' ) );
    public final void rule__EntityType__EntityAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:762:1: ( ( 'extend' ) | ( 'implement' ) | ( 'derive' ) | ( 'throw' ) | ( 'useannotation' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            case 22:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:763:1: ( 'extend' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:763:1: ( 'extend' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:764:1: 'extend'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__EntityType__EntityAlternatives_01617); 
                     after(grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:771:6: ( 'implement' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:771:6: ( 'implement' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:772:1: 'implement'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__EntityType__EntityAlternatives_01637); 
                     after(grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:779:6: ( 'derive' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:779:6: ( 'derive' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:780:1: 'derive'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2()); 
                    match(input,20,FOLLOW_20_in_rule__EntityType__EntityAlternatives_01657); 
                     after(grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:787:6: ( 'throw' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:787:6: ( 'throw' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:788:1: 'throw'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3()); 
                    match(input,21,FOLLOW_21_in_rule__EntityType__EntityAlternatives_01677); 
                     after(grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:795:6: ( 'useannotation' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:795:6: ( 'useannotation' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:796:1: 'useannotation'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityUseannotationKeyword_0_4()); 
                    match(input,22,FOLLOW_22_in_rule__EntityType__EntityAlternatives_01697); 
                     after(grammarAccess.getEntityTypeAccess().getEntityUseannotationKeyword_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__EntityAlternatives_0"


    // $ANTLR start "rule__Model__Group__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:810:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:814:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:815:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01729);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01732);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:822:1: rule__Model__Group__0__Impl : ( 'architeturalElements' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:826:1: ( ( 'architeturalElements' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:827:1: ( 'architeturalElements' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:827:1: ( 'architeturalElements' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:828:1: 'architeturalElements'
            {
             before(grammarAccess.getModelAccess().getArchiteturalElementsKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Model__Group__0__Impl1760); 
             after(grammarAccess.getModelAccess().getArchiteturalElementsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:841:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:845:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:846:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11791);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11794);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:853:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:857:1: ( ( '{' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:858:1: ( '{' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:858:1: ( '{' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:859:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Model__Group__1__Impl1822); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:872:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:876:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:877:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21853);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21856);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:884:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:888:1: ( ( ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:889:1: ( ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:889:1: ( ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:890:1: ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:890:1: ( ( rule__Model__StructureElementsAssignment_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:891:1: ( rule__Model__StructureElementsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getStructureElementsAssignment_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:892:1: ( rule__Model__StructureElementsAssignment_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:892:2: rule__Model__StructureElementsAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__StructureElementsAssignment_2_in_rule__Model__Group__2__Impl1885);
            rule__Model__StructureElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStructureElementsAssignment_2()); 

            }

            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:895:1: ( ( rule__Model__StructureElementsAssignment_2 )* )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:896:1: ( rule__Model__StructureElementsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getStructureElementsAssignment_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:897:1: ( rule__Model__StructureElementsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27||(LA9_0>=34 && LA9_0<=35)||(LA9_0>=38 && LA9_0<=39)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:897:2: rule__Model__StructureElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__StructureElementsAssignment_2_in_rule__Model__Group__2__Impl1897);
            	    rule__Model__StructureElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStructureElementsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:908:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:912:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:913:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31930);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31933);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:920:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:924:1: ( ( '}' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:925:1: ( '}' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:925:1: ( '}' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:926:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Model__Group__3__Impl1961); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:939:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:943:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:944:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41992);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41995);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:951:1: rule__Model__Group__4__Impl : ( 'restrictions' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:955:1: ( ( 'restrictions' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:956:1: ( 'restrictions' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:956:1: ( 'restrictions' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:957:1: 'restrictions'
            {
             before(grammarAccess.getModelAccess().getRestrictionsKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Model__Group__4__Impl2023); 
             after(grammarAccess.getModelAccess().getRestrictionsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:970:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:974:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:975:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52054);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__52057);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:982:1: rule__Model__Group__5__Impl : ( '{' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:986:1: ( ( '{' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:987:1: ( '{' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:987:1: ( '{' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:988:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Model__Group__5__Impl2085); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1001:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1005:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1006:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62116);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62119);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1013:1: rule__Model__Group__6__Impl : ( ( rule__Model__DCDeclAssignment_6 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1017:1: ( ( ( rule__Model__DCDeclAssignment_6 )* ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1018:1: ( ( rule__Model__DCDeclAssignment_6 )* )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1018:1: ( ( rule__Model__DCDeclAssignment_6 )* )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1019:1: ( rule__Model__DCDeclAssignment_6 )*
            {
             before(grammarAccess.getModelAccess().getDCDeclAssignment_6()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1020:1: ( rule__Model__DCDeclAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==40) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1020:2: rule__Model__DCDeclAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Model__DCDeclAssignment_6_in_rule__Model__Group__6__Impl2146);
            	    rule__Model__DCDeclAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDCDeclAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1030:1: rule__Model__Group__7 : rule__Model__Group__7__Impl ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1034:1: ( rule__Model__Group__7__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1035:2: rule__Model__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72177);
            rule__Model__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1041:1: rule__Model__Group__7__Impl : ( '}' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1045:1: ( ( '}' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1046:1: ( '}' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1046:1: ( '}' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1047:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__Model__Group__7__Impl2205); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__DCLLayer__Group__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1076:1: rule__DCLLayer__Group__0 : rule__DCLLayer__Group__0__Impl rule__DCLLayer__Group__1 ;
    public final void rule__DCLLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1080:1: ( rule__DCLLayer__Group__0__Impl rule__DCLLayer__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1081:2: rule__DCLLayer__Group__0__Impl rule__DCLLayer__Group__1
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__0__Impl_in_rule__DCLLayer__Group__02252);
            rule__DCLLayer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group__1_in_rule__DCLLayer__Group__02255);
            rule__DCLLayer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group__0"


    // $ANTLR start "rule__DCLLayer__Group__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1088:1: rule__DCLLayer__Group__0__Impl : ( 'layer' ) ;
    public final void rule__DCLLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1092:1: ( ( 'layer' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1093:1: ( 'layer' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1093:1: ( 'layer' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1094:1: 'layer'
            {
             before(grammarAccess.getDCLLayerAccess().getLayerKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__DCLLayer__Group__0__Impl2283); 
             after(grammarAccess.getDCLLayerAccess().getLayerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group__0__Impl"


    // $ANTLR start "rule__DCLLayer__Group__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1107:1: rule__DCLLayer__Group__1 : rule__DCLLayer__Group__1__Impl rule__DCLLayer__Group__2 ;
    public final void rule__DCLLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1111:1: ( rule__DCLLayer__Group__1__Impl rule__DCLLayer__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1112:2: rule__DCLLayer__Group__1__Impl rule__DCLLayer__Group__2
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__1__Impl_in_rule__DCLLayer__Group__12314);
            rule__DCLLayer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group__2_in_rule__DCLLayer__Group__12317);
            rule__DCLLayer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group__1"


    // $ANTLR start "rule__DCLLayer__Group__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1119:1: rule__DCLLayer__Group__1__Impl : ( ( rule__DCLLayer__NameAssignment_1 ) ) ;
    public final void rule__DCLLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1123:1: ( ( ( rule__DCLLayer__NameAssignment_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1124:1: ( ( rule__DCLLayer__NameAssignment_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1124:1: ( ( rule__DCLLayer__NameAssignment_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1125:1: ( rule__DCLLayer__NameAssignment_1 )
            {
             before(grammarAccess.getDCLLayerAccess().getNameAssignment_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1126:1: ( rule__DCLLayer__NameAssignment_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1126:2: rule__DCLLayer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DCLLayer__NameAssignment_1_in_rule__DCLLayer__Group__1__Impl2344);
            rule__DCLLayer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDCLLayerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group__1__Impl"


    // $ANTLR start "rule__DCLLayer__Group__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1136:1: rule__DCLLayer__Group__2 : rule__DCLLayer__Group__2__Impl rule__DCLLayer__Group__3 ;
    public final void rule__DCLLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1140:1: ( rule__DCLLayer__Group__2__Impl rule__DCLLayer__Group__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1141:2: rule__DCLLayer__Group__2__Impl rule__DCLLayer__Group__3
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__2__Impl_in_rule__DCLLayer__Group__22374);
            rule__DCLLayer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group__3_in_rule__DCLLayer__Group__22377);
            rule__DCLLayer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group__2"


    // $ANTLR start "rule__DCLLayer__Group__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1148:1: rule__DCLLayer__Group__2__Impl : ( ',' ) ;
    public final void rule__DCLLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1152:1: ( ( ',' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1153:1: ( ',' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1153:1: ( ',' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1154:1: ','
            {
             before(grammarAccess.getDCLLayerAccess().getCommaKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__DCLLayer__Group__2__Impl2405); 
             after(grammarAccess.getDCLLayerAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group__2__Impl"


    // $ANTLR start "rule__DCLLayer__Group__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1167:1: rule__DCLLayer__Group__3 : rule__DCLLayer__Group__3__Impl rule__DCLLayer__Group__4 ;
    public final void rule__DCLLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1171:1: ( rule__DCLLayer__Group__3__Impl rule__DCLLayer__Group__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1172:2: rule__DCLLayer__Group__3__Impl rule__DCLLayer__Group__4
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__3__Impl_in_rule__DCLLayer__Group__32436);
            rule__DCLLayer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group__4_in_rule__DCLLayer__Group__32439);
            rule__DCLLayer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group__3"


    // $ANTLR start "rule__DCLLayer__Group__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1179:1: rule__DCLLayer__Group__3__Impl : ( 'level' ) ;
    public final void rule__DCLLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1183:1: ( ( 'level' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1184:1: ( 'level' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1184:1: ( 'level' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1185:1: 'level'
            {
             before(grammarAccess.getDCLLayerAccess().getLevelKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__DCLLayer__Group__3__Impl2467); 
             after(grammarAccess.getDCLLayerAccess().getLevelKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group__3__Impl"


    // $ANTLR start "rule__DCLLayer__Group__4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1198:1: rule__DCLLayer__Group__4 : rule__DCLLayer__Group__4__Impl rule__DCLLayer__Group__5 ;
    public final void rule__DCLLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1202:1: ( rule__DCLLayer__Group__4__Impl rule__DCLLayer__Group__5 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1203:2: rule__DCLLayer__Group__4__Impl rule__DCLLayer__Group__5
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__4__Impl_in_rule__DCLLayer__Group__42498);
            rule__DCLLayer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group__5_in_rule__DCLLayer__Group__42501);
            rule__DCLLayer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group__4"


    // $ANTLR start "rule__DCLLayer__Group__4__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1210:1: rule__DCLLayer__Group__4__Impl : ( ( rule__DCLLayer__LevelAssignment_4 ) ) ;
    public final void rule__DCLLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1214:1: ( ( ( rule__DCLLayer__LevelAssignment_4 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1215:1: ( ( rule__DCLLayer__LevelAssignment_4 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1215:1: ( ( rule__DCLLayer__LevelAssignment_4 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1216:1: ( rule__DCLLayer__LevelAssignment_4 )
            {
             before(grammarAccess.getDCLLayerAccess().getLevelAssignment_4()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1217:1: ( rule__DCLLayer__LevelAssignment_4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1217:2: rule__DCLLayer__LevelAssignment_4
            {
            pushFollow(FOLLOW_rule__DCLLayer__LevelAssignment_4_in_rule__DCLLayer__Group__4__Impl2528);
            rule__DCLLayer__LevelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDCLLayerAccess().getLevelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group__4__Impl"


    // $ANTLR start "rule__DCLLayer__Group__5"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1227:1: rule__DCLLayer__Group__5 : rule__DCLLayer__Group__5__Impl rule__DCLLayer__Group__6 ;
    public final void rule__DCLLayer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1231:1: ( rule__DCLLayer__Group__5__Impl rule__DCLLayer__Group__6 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1232:2: rule__DCLLayer__Group__5__Impl rule__DCLLayer__Group__6
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__5__Impl_in_rule__DCLLayer__Group__52558);
            rule__DCLLayer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group__6_in_rule__DCLLayer__Group__52561);
            rule__DCLLayer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group__5"


    // $ANTLR start "rule__DCLLayer__Group__5__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1239:1: rule__DCLLayer__Group__5__Impl : ( ( rule__DCLLayer__Alternatives_5 )? ) ;
    public final void rule__DCLLayer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1243:1: ( ( ( rule__DCLLayer__Alternatives_5 )? ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1244:1: ( ( rule__DCLLayer__Alternatives_5 )? )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1244:1: ( ( rule__DCLLayer__Alternatives_5 )? )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1245:1: ( rule__DCLLayer__Alternatives_5 )?
            {
             before(grammarAccess.getDCLLayerAccess().getAlternatives_5()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1246:1: ( rule__DCLLayer__Alternatives_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1246:2: rule__DCLLayer__Alternatives_5
                    {
                    pushFollow(FOLLOW_rule__DCLLayer__Alternatives_5_in_rule__DCLLayer__Group__5__Impl2588);
                    rule__DCLLayer__Alternatives_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDCLLayerAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group__5__Impl"


    // $ANTLR start "rule__DCLLayer__Group__6"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1256:1: rule__DCLLayer__Group__6 : rule__DCLLayer__Group__6__Impl ;
    public final void rule__DCLLayer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1260:1: ( rule__DCLLayer__Group__6__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1261:2: rule__DCLLayer__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__6__Impl_in_rule__DCLLayer__Group__62619);
            rule__DCLLayer__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group__6"


    // $ANTLR start "rule__DCLLayer__Group__6__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1267:1: rule__DCLLayer__Group__6__Impl : ( ';' ) ;
    public final void rule__DCLLayer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1271:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1272:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1272:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1273:1: ';'
            {
             before(grammarAccess.getDCLLayerAccess().getSemicolonKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__DCLLayer__Group__6__Impl2647); 
             after(grammarAccess.getDCLLayerAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group__6__Impl"


    // $ANTLR start "rule__DCLLayer__Group_5_0__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1300:1: rule__DCLLayer__Group_5_0__0 : rule__DCLLayer__Group_5_0__0__Impl rule__DCLLayer__Group_5_0__1 ;
    public final void rule__DCLLayer__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1304:1: ( rule__DCLLayer__Group_5_0__0__Impl rule__DCLLayer__Group_5_0__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1305:2: rule__DCLLayer__Group_5_0__0__Impl rule__DCLLayer__Group_5_0__1
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group_5_0__0__Impl_in_rule__DCLLayer__Group_5_0__02692);
            rule__DCLLayer__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group_5_0__1_in_rule__DCLLayer__Group_5_0__02695);
            rule__DCLLayer__Group_5_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_0__0"


    // $ANTLR start "rule__DCLLayer__Group_5_0__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1312:1: rule__DCLLayer__Group_5_0__0__Impl : ( ',' ) ;
    public final void rule__DCLLayer__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1316:1: ( ( ',' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1317:1: ( ',' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1317:1: ( ',' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1318:1: ','
            {
             before(grammarAccess.getDCLLayerAccess().getCommaKeyword_5_0_0()); 
            match(input,28,FOLLOW_28_in_rule__DCLLayer__Group_5_0__0__Impl2723); 
             after(grammarAccess.getDCLLayerAccess().getCommaKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_0__0__Impl"


    // $ANTLR start "rule__DCLLayer__Group_5_0__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1331:1: rule__DCLLayer__Group_5_0__1 : rule__DCLLayer__Group_5_0__1__Impl rule__DCLLayer__Group_5_0__2 ;
    public final void rule__DCLLayer__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1335:1: ( rule__DCLLayer__Group_5_0__1__Impl rule__DCLLayer__Group_5_0__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1336:2: rule__DCLLayer__Group_5_0__1__Impl rule__DCLLayer__Group_5_0__2
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group_5_0__1__Impl_in_rule__DCLLayer__Group_5_0__12754);
            rule__DCLLayer__Group_5_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group_5_0__2_in_rule__DCLLayer__Group_5_0__12757);
            rule__DCLLayer__Group_5_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_0__1"


    // $ANTLR start "rule__DCLLayer__Group_5_0__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1343:1: rule__DCLLayer__Group_5_0__1__Impl : ( 'inLayer: ' ) ;
    public final void rule__DCLLayer__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1347:1: ( ( 'inLayer: ' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1348:1: ( 'inLayer: ' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1348:1: ( 'inLayer: ' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1349:1: 'inLayer: '
            {
             before(grammarAccess.getDCLLayerAccess().getInLayerKeyword_5_0_1()); 
            match(input,31,FOLLOW_31_in_rule__DCLLayer__Group_5_0__1__Impl2785); 
             after(grammarAccess.getDCLLayerAccess().getInLayerKeyword_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_0__1__Impl"


    // $ANTLR start "rule__DCLLayer__Group_5_0__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1362:1: rule__DCLLayer__Group_5_0__2 : rule__DCLLayer__Group_5_0__2__Impl ;
    public final void rule__DCLLayer__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1366:1: ( rule__DCLLayer__Group_5_0__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1367:2: rule__DCLLayer__Group_5_0__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group_5_0__2__Impl_in_rule__DCLLayer__Group_5_0__22816);
            rule__DCLLayer__Group_5_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_0__2"


    // $ANTLR start "rule__DCLLayer__Group_5_0__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1373:1: rule__DCLLayer__Group_5_0__2__Impl : ( ( rule__DCLLayer__LayerAssignment_5_0_2 ) ) ;
    public final void rule__DCLLayer__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1377:1: ( ( ( rule__DCLLayer__LayerAssignment_5_0_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1378:1: ( ( rule__DCLLayer__LayerAssignment_5_0_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1378:1: ( ( rule__DCLLayer__LayerAssignment_5_0_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1379:1: ( rule__DCLLayer__LayerAssignment_5_0_2 )
            {
             before(grammarAccess.getDCLLayerAccess().getLayerAssignment_5_0_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1380:1: ( rule__DCLLayer__LayerAssignment_5_0_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1380:2: rule__DCLLayer__LayerAssignment_5_0_2
            {
            pushFollow(FOLLOW_rule__DCLLayer__LayerAssignment_5_0_2_in_rule__DCLLayer__Group_5_0__2__Impl2843);
            rule__DCLLayer__LayerAssignment_5_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDCLLayerAccess().getLayerAssignment_5_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_0__2__Impl"


    // $ANTLR start "rule__DCLLayer__Group_5_1__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1396:1: rule__DCLLayer__Group_5_1__0 : rule__DCLLayer__Group_5_1__0__Impl rule__DCLLayer__Group_5_1__1 ;
    public final void rule__DCLLayer__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1400:1: ( rule__DCLLayer__Group_5_1__0__Impl rule__DCLLayer__Group_5_1__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1401:2: rule__DCLLayer__Group_5_1__0__Impl rule__DCLLayer__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group_5_1__0__Impl_in_rule__DCLLayer__Group_5_1__02879);
            rule__DCLLayer__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group_5_1__1_in_rule__DCLLayer__Group_5_1__02882);
            rule__DCLLayer__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_1__0"


    // $ANTLR start "rule__DCLLayer__Group_5_1__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1408:1: rule__DCLLayer__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__DCLLayer__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1412:1: ( ( ',' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1413:1: ( ',' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1413:1: ( ',' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1414:1: ','
            {
             before(grammarAccess.getDCLLayerAccess().getCommaKeyword_5_1_0()); 
            match(input,28,FOLLOW_28_in_rule__DCLLayer__Group_5_1__0__Impl2910); 
             after(grammarAccess.getDCLLayerAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_1__0__Impl"


    // $ANTLR start "rule__DCLLayer__Group_5_1__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1427:1: rule__DCLLayer__Group_5_1__1 : rule__DCLLayer__Group_5_1__1__Impl rule__DCLLayer__Group_5_1__2 ;
    public final void rule__DCLLayer__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1431:1: ( rule__DCLLayer__Group_5_1__1__Impl rule__DCLLayer__Group_5_1__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1432:2: rule__DCLLayer__Group_5_1__1__Impl rule__DCLLayer__Group_5_1__2
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group_5_1__1__Impl_in_rule__DCLLayer__Group_5_1__12941);
            rule__DCLLayer__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group_5_1__2_in_rule__DCLLayer__Group_5_1__12944);
            rule__DCLLayer__Group_5_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_1__1"


    // $ANTLR start "rule__DCLLayer__Group_5_1__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1439:1: rule__DCLLayer__Group_5_1__1__Impl : ( 'inSubSystem: ' ) ;
    public final void rule__DCLLayer__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1443:1: ( ( 'inSubSystem: ' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1444:1: ( 'inSubSystem: ' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1444:1: ( 'inSubSystem: ' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1445:1: 'inSubSystem: '
            {
             before(grammarAccess.getDCLLayerAccess().getInSubSystemKeyword_5_1_1()); 
            match(input,32,FOLLOW_32_in_rule__DCLLayer__Group_5_1__1__Impl2972); 
             after(grammarAccess.getDCLLayerAccess().getInSubSystemKeyword_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_1__1__Impl"


    // $ANTLR start "rule__DCLLayer__Group_5_1__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1458:1: rule__DCLLayer__Group_5_1__2 : rule__DCLLayer__Group_5_1__2__Impl ;
    public final void rule__DCLLayer__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1462:1: ( rule__DCLLayer__Group_5_1__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1463:2: rule__DCLLayer__Group_5_1__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group_5_1__2__Impl_in_rule__DCLLayer__Group_5_1__23003);
            rule__DCLLayer__Group_5_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_1__2"


    // $ANTLR start "rule__DCLLayer__Group_5_1__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1469:1: rule__DCLLayer__Group_5_1__2__Impl : ( ( rule__DCLLayer__SubSystemAssignment_5_1_2 ) ) ;
    public final void rule__DCLLayer__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1473:1: ( ( ( rule__DCLLayer__SubSystemAssignment_5_1_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1474:1: ( ( rule__DCLLayer__SubSystemAssignment_5_1_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1474:1: ( ( rule__DCLLayer__SubSystemAssignment_5_1_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1475:1: ( rule__DCLLayer__SubSystemAssignment_5_1_2 )
            {
             before(grammarAccess.getDCLLayerAccess().getSubSystemAssignment_5_1_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1476:1: ( rule__DCLLayer__SubSystemAssignment_5_1_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1476:2: rule__DCLLayer__SubSystemAssignment_5_1_2
            {
            pushFollow(FOLLOW_rule__DCLLayer__SubSystemAssignment_5_1_2_in_rule__DCLLayer__Group_5_1__2__Impl3030);
            rule__DCLLayer__SubSystemAssignment_5_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDCLLayerAccess().getSubSystemAssignment_5_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_1__2__Impl"


    // $ANTLR start "rule__DCLLayer__Group_5_2__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1492:1: rule__DCLLayer__Group_5_2__0 : rule__DCLLayer__Group_5_2__0__Impl rule__DCLLayer__Group_5_2__1 ;
    public final void rule__DCLLayer__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1496:1: ( rule__DCLLayer__Group_5_2__0__Impl rule__DCLLayer__Group_5_2__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1497:2: rule__DCLLayer__Group_5_2__0__Impl rule__DCLLayer__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group_5_2__0__Impl_in_rule__DCLLayer__Group_5_2__03066);
            rule__DCLLayer__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group_5_2__1_in_rule__DCLLayer__Group_5_2__03069);
            rule__DCLLayer__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_2__0"


    // $ANTLR start "rule__DCLLayer__Group_5_2__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1504:1: rule__DCLLayer__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__DCLLayer__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1508:1: ( ( ',' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1509:1: ( ',' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1509:1: ( ',' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1510:1: ','
            {
             before(grammarAccess.getDCLLayerAccess().getCommaKeyword_5_2_0()); 
            match(input,28,FOLLOW_28_in_rule__DCLLayer__Group_5_2__0__Impl3097); 
             after(grammarAccess.getDCLLayerAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_2__0__Impl"


    // $ANTLR start "rule__DCLLayer__Group_5_2__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1523:1: rule__DCLLayer__Group_5_2__1 : rule__DCLLayer__Group_5_2__1__Impl rule__DCLLayer__Group_5_2__2 ;
    public final void rule__DCLLayer__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1527:1: ( rule__DCLLayer__Group_5_2__1__Impl rule__DCLLayer__Group_5_2__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1528:2: rule__DCLLayer__Group_5_2__1__Impl rule__DCLLayer__Group_5_2__2
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group_5_2__1__Impl_in_rule__DCLLayer__Group_5_2__13128);
            rule__DCLLayer__Group_5_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group_5_2__2_in_rule__DCLLayer__Group_5_2__13131);
            rule__DCLLayer__Group_5_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_2__1"


    // $ANTLR start "rule__DCLLayer__Group_5_2__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1535:1: rule__DCLLayer__Group_5_2__1__Impl : ( 'inComponent: ' ) ;
    public final void rule__DCLLayer__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1539:1: ( ( 'inComponent: ' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1540:1: ( 'inComponent: ' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1540:1: ( 'inComponent: ' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1541:1: 'inComponent: '
            {
             before(grammarAccess.getDCLLayerAccess().getInComponentKeyword_5_2_1()); 
            match(input,33,FOLLOW_33_in_rule__DCLLayer__Group_5_2__1__Impl3159); 
             after(grammarAccess.getDCLLayerAccess().getInComponentKeyword_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_2__1__Impl"


    // $ANTLR start "rule__DCLLayer__Group_5_2__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1554:1: rule__DCLLayer__Group_5_2__2 : rule__DCLLayer__Group_5_2__2__Impl ;
    public final void rule__DCLLayer__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1558:1: ( rule__DCLLayer__Group_5_2__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1559:2: rule__DCLLayer__Group_5_2__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group_5_2__2__Impl_in_rule__DCLLayer__Group_5_2__23190);
            rule__DCLLayer__Group_5_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_2__2"


    // $ANTLR start "rule__DCLLayer__Group_5_2__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1565:1: rule__DCLLayer__Group_5_2__2__Impl : ( ( rule__DCLLayer__ComponentAssignment_5_2_2 ) ) ;
    public final void rule__DCLLayer__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1569:1: ( ( ( rule__DCLLayer__ComponentAssignment_5_2_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1570:1: ( ( rule__DCLLayer__ComponentAssignment_5_2_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1570:1: ( ( rule__DCLLayer__ComponentAssignment_5_2_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1571:1: ( rule__DCLLayer__ComponentAssignment_5_2_2 )
            {
             before(grammarAccess.getDCLLayerAccess().getComponentAssignment_5_2_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1572:1: ( rule__DCLLayer__ComponentAssignment_5_2_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1572:2: rule__DCLLayer__ComponentAssignment_5_2_2
            {
            pushFollow(FOLLOW_rule__DCLLayer__ComponentAssignment_5_2_2_in_rule__DCLLayer__Group_5_2__2__Impl3217);
            rule__DCLLayer__ComponentAssignment_5_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDCLLayerAccess().getComponentAssignment_5_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__Group_5_2__2__Impl"


    // $ANTLR start "rule__DCLComponent__Group__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1588:1: rule__DCLComponent__Group__0 : rule__DCLComponent__Group__0__Impl rule__DCLComponent__Group__1 ;
    public final void rule__DCLComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1592:1: ( rule__DCLComponent__Group__0__Impl rule__DCLComponent__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1593:2: rule__DCLComponent__Group__0__Impl rule__DCLComponent__Group__1
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group__0__Impl_in_rule__DCLComponent__Group__03253);
            rule__DCLComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponent__Group__1_in_rule__DCLComponent__Group__03256);
            rule__DCLComponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group__0"


    // $ANTLR start "rule__DCLComponent__Group__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1600:1: rule__DCLComponent__Group__0__Impl : ( 'component' ) ;
    public final void rule__DCLComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1604:1: ( ( 'component' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1605:1: ( 'component' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1605:1: ( 'component' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1606:1: 'component'
            {
             before(grammarAccess.getDCLComponentAccess().getComponentKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__DCLComponent__Group__0__Impl3284); 
             after(grammarAccess.getDCLComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group__0__Impl"


    // $ANTLR start "rule__DCLComponent__Group__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1619:1: rule__DCLComponent__Group__1 : rule__DCLComponent__Group__1__Impl rule__DCLComponent__Group__2 ;
    public final void rule__DCLComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1623:1: ( rule__DCLComponent__Group__1__Impl rule__DCLComponent__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1624:2: rule__DCLComponent__Group__1__Impl rule__DCLComponent__Group__2
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group__1__Impl_in_rule__DCLComponent__Group__13315);
            rule__DCLComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponent__Group__2_in_rule__DCLComponent__Group__13318);
            rule__DCLComponent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group__1"


    // $ANTLR start "rule__DCLComponent__Group__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1631:1: rule__DCLComponent__Group__1__Impl : ( ( rule__DCLComponent__NameAssignment_1 ) ) ;
    public final void rule__DCLComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1635:1: ( ( ( rule__DCLComponent__NameAssignment_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1636:1: ( ( rule__DCLComponent__NameAssignment_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1636:1: ( ( rule__DCLComponent__NameAssignment_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1637:1: ( rule__DCLComponent__NameAssignment_1 )
            {
             before(grammarAccess.getDCLComponentAccess().getNameAssignment_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1638:1: ( rule__DCLComponent__NameAssignment_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1638:2: rule__DCLComponent__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DCLComponent__NameAssignment_1_in_rule__DCLComponent__Group__1__Impl3345);
            rule__DCLComponent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group__1__Impl"


    // $ANTLR start "rule__DCLComponent__Group__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1648:1: rule__DCLComponent__Group__2 : rule__DCLComponent__Group__2__Impl rule__DCLComponent__Group__3 ;
    public final void rule__DCLComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1652:1: ( rule__DCLComponent__Group__2__Impl rule__DCLComponent__Group__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1653:2: rule__DCLComponent__Group__2__Impl rule__DCLComponent__Group__3
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group__2__Impl_in_rule__DCLComponent__Group__23375);
            rule__DCLComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponent__Group__3_in_rule__DCLComponent__Group__23378);
            rule__DCLComponent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group__2"


    // $ANTLR start "rule__DCLComponent__Group__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1660:1: rule__DCLComponent__Group__2__Impl : ( ( rule__DCLComponent__Alternatives_2 )? ) ;
    public final void rule__DCLComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1664:1: ( ( ( rule__DCLComponent__Alternatives_2 )? ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1665:1: ( ( rule__DCLComponent__Alternatives_2 )? )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1665:1: ( ( rule__DCLComponent__Alternatives_2 )? )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1666:1: ( rule__DCLComponent__Alternatives_2 )?
            {
             before(grammarAccess.getDCLComponentAccess().getAlternatives_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1667:1: ( rule__DCLComponent__Alternatives_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1667:2: rule__DCLComponent__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__DCLComponent__Alternatives_2_in_rule__DCLComponent__Group__2__Impl3405);
                    rule__DCLComponent__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDCLComponentAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group__2__Impl"


    // $ANTLR start "rule__DCLComponent__Group__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1677:1: rule__DCLComponent__Group__3 : rule__DCLComponent__Group__3__Impl ;
    public final void rule__DCLComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1681:1: ( rule__DCLComponent__Group__3__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1682:2: rule__DCLComponent__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group__3__Impl_in_rule__DCLComponent__Group__33436);
            rule__DCLComponent__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group__3"


    // $ANTLR start "rule__DCLComponent__Group__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1688:1: rule__DCLComponent__Group__3__Impl : ( ';' ) ;
    public final void rule__DCLComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1692:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1693:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1693:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1694:1: ';'
            {
             before(grammarAccess.getDCLComponentAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__DCLComponent__Group__3__Impl3464); 
             after(grammarAccess.getDCLComponentAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group__3__Impl"


    // $ANTLR start "rule__DCLComponent__Group_2_0__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1715:1: rule__DCLComponent__Group_2_0__0 : rule__DCLComponent__Group_2_0__0__Impl rule__DCLComponent__Group_2_0__1 ;
    public final void rule__DCLComponent__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1719:1: ( rule__DCLComponent__Group_2_0__0__Impl rule__DCLComponent__Group_2_0__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1720:2: rule__DCLComponent__Group_2_0__0__Impl rule__DCLComponent__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group_2_0__0__Impl_in_rule__DCLComponent__Group_2_0__03503);
            rule__DCLComponent__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponent__Group_2_0__1_in_rule__DCLComponent__Group_2_0__03506);
            rule__DCLComponent__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group_2_0__0"


    // $ANTLR start "rule__DCLComponent__Group_2_0__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1727:1: rule__DCLComponent__Group_2_0__0__Impl : ( ',' ) ;
    public final void rule__DCLComponent__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1731:1: ( ( ',' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1732:1: ( ',' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1732:1: ( ',' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1733:1: ','
            {
             before(grammarAccess.getDCLComponentAccess().getCommaKeyword_2_0_0()); 
            match(input,28,FOLLOW_28_in_rule__DCLComponent__Group_2_0__0__Impl3534); 
             after(grammarAccess.getDCLComponentAccess().getCommaKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group_2_0__0__Impl"


    // $ANTLR start "rule__DCLComponent__Group_2_0__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1746:1: rule__DCLComponent__Group_2_0__1 : rule__DCLComponent__Group_2_0__1__Impl rule__DCLComponent__Group_2_0__2 ;
    public final void rule__DCLComponent__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1750:1: ( rule__DCLComponent__Group_2_0__1__Impl rule__DCLComponent__Group_2_0__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1751:2: rule__DCLComponent__Group_2_0__1__Impl rule__DCLComponent__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group_2_0__1__Impl_in_rule__DCLComponent__Group_2_0__13565);
            rule__DCLComponent__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponent__Group_2_0__2_in_rule__DCLComponent__Group_2_0__13568);
            rule__DCLComponent__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group_2_0__1"


    // $ANTLR start "rule__DCLComponent__Group_2_0__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1758:1: rule__DCLComponent__Group_2_0__1__Impl : ( 'inLayer: ' ) ;
    public final void rule__DCLComponent__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1762:1: ( ( 'inLayer: ' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1763:1: ( 'inLayer: ' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1763:1: ( 'inLayer: ' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1764:1: 'inLayer: '
            {
             before(grammarAccess.getDCLComponentAccess().getInLayerKeyword_2_0_1()); 
            match(input,31,FOLLOW_31_in_rule__DCLComponent__Group_2_0__1__Impl3596); 
             after(grammarAccess.getDCLComponentAccess().getInLayerKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group_2_0__1__Impl"


    // $ANTLR start "rule__DCLComponent__Group_2_0__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1777:1: rule__DCLComponent__Group_2_0__2 : rule__DCLComponent__Group_2_0__2__Impl ;
    public final void rule__DCLComponent__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1781:1: ( rule__DCLComponent__Group_2_0__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1782:2: rule__DCLComponent__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group_2_0__2__Impl_in_rule__DCLComponent__Group_2_0__23627);
            rule__DCLComponent__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group_2_0__2"


    // $ANTLR start "rule__DCLComponent__Group_2_0__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1788:1: rule__DCLComponent__Group_2_0__2__Impl : ( ( rule__DCLComponent__LayerAssignment_2_0_2 ) ) ;
    public final void rule__DCLComponent__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1792:1: ( ( ( rule__DCLComponent__LayerAssignment_2_0_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1793:1: ( ( rule__DCLComponent__LayerAssignment_2_0_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1793:1: ( ( rule__DCLComponent__LayerAssignment_2_0_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1794:1: ( rule__DCLComponent__LayerAssignment_2_0_2 )
            {
             before(grammarAccess.getDCLComponentAccess().getLayerAssignment_2_0_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1795:1: ( rule__DCLComponent__LayerAssignment_2_0_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1795:2: rule__DCLComponent__LayerAssignment_2_0_2
            {
            pushFollow(FOLLOW_rule__DCLComponent__LayerAssignment_2_0_2_in_rule__DCLComponent__Group_2_0__2__Impl3654);
            rule__DCLComponent__LayerAssignment_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentAccess().getLayerAssignment_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group_2_0__2__Impl"


    // $ANTLR start "rule__DCLComponent__Group_2_1__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1811:1: rule__DCLComponent__Group_2_1__0 : rule__DCLComponent__Group_2_1__0__Impl rule__DCLComponent__Group_2_1__1 ;
    public final void rule__DCLComponent__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1815:1: ( rule__DCLComponent__Group_2_1__0__Impl rule__DCLComponent__Group_2_1__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1816:2: rule__DCLComponent__Group_2_1__0__Impl rule__DCLComponent__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group_2_1__0__Impl_in_rule__DCLComponent__Group_2_1__03690);
            rule__DCLComponent__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponent__Group_2_1__1_in_rule__DCLComponent__Group_2_1__03693);
            rule__DCLComponent__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group_2_1__0"


    // $ANTLR start "rule__DCLComponent__Group_2_1__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1823:1: rule__DCLComponent__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__DCLComponent__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1827:1: ( ( ',' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1828:1: ( ',' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1828:1: ( ',' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1829:1: ','
            {
             before(grammarAccess.getDCLComponentAccess().getCommaKeyword_2_1_0()); 
            match(input,28,FOLLOW_28_in_rule__DCLComponent__Group_2_1__0__Impl3721); 
             after(grammarAccess.getDCLComponentAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group_2_1__0__Impl"


    // $ANTLR start "rule__DCLComponent__Group_2_1__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1842:1: rule__DCLComponent__Group_2_1__1 : rule__DCLComponent__Group_2_1__1__Impl rule__DCLComponent__Group_2_1__2 ;
    public final void rule__DCLComponent__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1846:1: ( rule__DCLComponent__Group_2_1__1__Impl rule__DCLComponent__Group_2_1__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1847:2: rule__DCLComponent__Group_2_1__1__Impl rule__DCLComponent__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group_2_1__1__Impl_in_rule__DCLComponent__Group_2_1__13752);
            rule__DCLComponent__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponent__Group_2_1__2_in_rule__DCLComponent__Group_2_1__13755);
            rule__DCLComponent__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group_2_1__1"


    // $ANTLR start "rule__DCLComponent__Group_2_1__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1854:1: rule__DCLComponent__Group_2_1__1__Impl : ( 'inSubSystem: ' ) ;
    public final void rule__DCLComponent__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1858:1: ( ( 'inSubSystem: ' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1859:1: ( 'inSubSystem: ' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1859:1: ( 'inSubSystem: ' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1860:1: 'inSubSystem: '
            {
             before(grammarAccess.getDCLComponentAccess().getInSubSystemKeyword_2_1_1()); 
            match(input,32,FOLLOW_32_in_rule__DCLComponent__Group_2_1__1__Impl3783); 
             after(grammarAccess.getDCLComponentAccess().getInSubSystemKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group_2_1__1__Impl"


    // $ANTLR start "rule__DCLComponent__Group_2_1__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1873:1: rule__DCLComponent__Group_2_1__2 : rule__DCLComponent__Group_2_1__2__Impl ;
    public final void rule__DCLComponent__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1877:1: ( rule__DCLComponent__Group_2_1__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1878:2: rule__DCLComponent__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group_2_1__2__Impl_in_rule__DCLComponent__Group_2_1__23814);
            rule__DCLComponent__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group_2_1__2"


    // $ANTLR start "rule__DCLComponent__Group_2_1__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1884:1: rule__DCLComponent__Group_2_1__2__Impl : ( ( rule__DCLComponent__SubSystemAssignment_2_1_2 ) ) ;
    public final void rule__DCLComponent__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1888:1: ( ( ( rule__DCLComponent__SubSystemAssignment_2_1_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1889:1: ( ( rule__DCLComponent__SubSystemAssignment_2_1_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1889:1: ( ( rule__DCLComponent__SubSystemAssignment_2_1_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1890:1: ( rule__DCLComponent__SubSystemAssignment_2_1_2 )
            {
             before(grammarAccess.getDCLComponentAccess().getSubSystemAssignment_2_1_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1891:1: ( rule__DCLComponent__SubSystemAssignment_2_1_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1891:2: rule__DCLComponent__SubSystemAssignment_2_1_2
            {
            pushFollow(FOLLOW_rule__DCLComponent__SubSystemAssignment_2_1_2_in_rule__DCLComponent__Group_2_1__2__Impl3841);
            rule__DCLComponent__SubSystemAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentAccess().getSubSystemAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__Group_2_1__2__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1907:1: rule__DCLComponentInterface__Group__0 : rule__DCLComponentInterface__Group__0__Impl rule__DCLComponentInterface__Group__1 ;
    public final void rule__DCLComponentInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1911:1: ( rule__DCLComponentInterface__Group__0__Impl rule__DCLComponentInterface__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1912:2: rule__DCLComponentInterface__Group__0__Impl rule__DCLComponentInterface__Group__1
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__0__Impl_in_rule__DCLComponentInterface__Group__03877);
            rule__DCLComponentInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__1_in_rule__DCLComponentInterface__Group__03880);
            rule__DCLComponentInterface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group__0"


    // $ANTLR start "rule__DCLComponentInterface__Group__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1919:1: rule__DCLComponentInterface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__DCLComponentInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1923:1: ( ( 'interface' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1924:1: ( 'interface' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1924:1: ( 'interface' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1925:1: 'interface'
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__DCLComponentInterface__Group__0__Impl3908); 
             after(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group__0__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1938:1: rule__DCLComponentInterface__Group__1 : rule__DCLComponentInterface__Group__1__Impl rule__DCLComponentInterface__Group__2 ;
    public final void rule__DCLComponentInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1942:1: ( rule__DCLComponentInterface__Group__1__Impl rule__DCLComponentInterface__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1943:2: rule__DCLComponentInterface__Group__1__Impl rule__DCLComponentInterface__Group__2
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__1__Impl_in_rule__DCLComponentInterface__Group__13939);
            rule__DCLComponentInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__2_in_rule__DCLComponentInterface__Group__13942);
            rule__DCLComponentInterface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group__1"


    // $ANTLR start "rule__DCLComponentInterface__Group__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1950:1: rule__DCLComponentInterface__Group__1__Impl : ( ( rule__DCLComponentInterface__NameAssignment_1 ) ) ;
    public final void rule__DCLComponentInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1954:1: ( ( ( rule__DCLComponentInterface__NameAssignment_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1955:1: ( ( rule__DCLComponentInterface__NameAssignment_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1955:1: ( ( rule__DCLComponentInterface__NameAssignment_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1956:1: ( rule__DCLComponentInterface__NameAssignment_1 )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getNameAssignment_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1957:1: ( rule__DCLComponentInterface__NameAssignment_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1957:2: rule__DCLComponentInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__NameAssignment_1_in_rule__DCLComponentInterface__Group__1__Impl3969);
            rule__DCLComponentInterface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group__1__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1967:1: rule__DCLComponentInterface__Group__2 : rule__DCLComponentInterface__Group__2__Impl rule__DCLComponentInterface__Group__3 ;
    public final void rule__DCLComponentInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1971:1: ( rule__DCLComponentInterface__Group__2__Impl rule__DCLComponentInterface__Group__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1972:2: rule__DCLComponentInterface__Group__2__Impl rule__DCLComponentInterface__Group__3
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__2__Impl_in_rule__DCLComponentInterface__Group__23999);
            rule__DCLComponentInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__3_in_rule__DCLComponentInterface__Group__24002);
            rule__DCLComponentInterface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group__2"


    // $ANTLR start "rule__DCLComponentInterface__Group__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1979:1: rule__DCLComponentInterface__Group__2__Impl : ( 'ofComponent ' ) ;
    public final void rule__DCLComponentInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1983:1: ( ( 'ofComponent ' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1984:1: ( 'ofComponent ' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1984:1: ( 'ofComponent ' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1985:1: 'ofComponent '
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getOfComponentKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__DCLComponentInterface__Group__2__Impl4030); 
             after(grammarAccess.getDCLComponentInterfaceAccess().getOfComponentKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group__2__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1998:1: rule__DCLComponentInterface__Group__3 : rule__DCLComponentInterface__Group__3__Impl rule__DCLComponentInterface__Group__4 ;
    public final void rule__DCLComponentInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2002:1: ( rule__DCLComponentInterface__Group__3__Impl rule__DCLComponentInterface__Group__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2003:2: rule__DCLComponentInterface__Group__3__Impl rule__DCLComponentInterface__Group__4
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__3__Impl_in_rule__DCLComponentInterface__Group__34061);
            rule__DCLComponentInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__4_in_rule__DCLComponentInterface__Group__34064);
            rule__DCLComponentInterface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group__3"


    // $ANTLR start "rule__DCLComponentInterface__Group__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2010:1: rule__DCLComponentInterface__Group__3__Impl : ( ( rule__DCLComponentInterface__ComponentAssignment_3 ) ) ;
    public final void rule__DCLComponentInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2014:1: ( ( ( rule__DCLComponentInterface__ComponentAssignment_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2015:1: ( ( rule__DCLComponentInterface__ComponentAssignment_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2015:1: ( ( rule__DCLComponentInterface__ComponentAssignment_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2016:1: ( rule__DCLComponentInterface__ComponentAssignment_3 )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getComponentAssignment_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2017:1: ( rule__DCLComponentInterface__ComponentAssignment_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2017:2: rule__DCLComponentInterface__ComponentAssignment_3
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__ComponentAssignment_3_in_rule__DCLComponentInterface__Group__3__Impl4091);
            rule__DCLComponentInterface__ComponentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentInterfaceAccess().getComponentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group__3__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group__4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2027:1: rule__DCLComponentInterface__Group__4 : rule__DCLComponentInterface__Group__4__Impl rule__DCLComponentInterface__Group__5 ;
    public final void rule__DCLComponentInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2031:1: ( rule__DCLComponentInterface__Group__4__Impl rule__DCLComponentInterface__Group__5 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2032:2: rule__DCLComponentInterface__Group__4__Impl rule__DCLComponentInterface__Group__5
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__4__Impl_in_rule__DCLComponentInterface__Group__44121);
            rule__DCLComponentInterface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__5_in_rule__DCLComponentInterface__Group__44124);
            rule__DCLComponentInterface__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group__4"


    // $ANTLR start "rule__DCLComponentInterface__Group__4__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2039:1: rule__DCLComponentInterface__Group__4__Impl : ( ( rule__DCLComponentInterface__Group_4__0 ) ) ;
    public final void rule__DCLComponentInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2043:1: ( ( ( rule__DCLComponentInterface__Group_4__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2044:1: ( ( rule__DCLComponentInterface__Group_4__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2044:1: ( ( rule__DCLComponentInterface__Group_4__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2045:1: ( rule__DCLComponentInterface__Group_4__0 )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getGroup_4()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2046:1: ( rule__DCLComponentInterface__Group_4__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2046:2: rule__DCLComponentInterface__Group_4__0
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group_4__0_in_rule__DCLComponentInterface__Group__4__Impl4151);
            rule__DCLComponentInterface__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentInterfaceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group__4__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group__5"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2056:1: rule__DCLComponentInterface__Group__5 : rule__DCLComponentInterface__Group__5__Impl ;
    public final void rule__DCLComponentInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2060:1: ( rule__DCLComponentInterface__Group__5__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2061:2: rule__DCLComponentInterface__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__5__Impl_in_rule__DCLComponentInterface__Group__54181);
            rule__DCLComponentInterface__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group__5"


    // $ANTLR start "rule__DCLComponentInterface__Group__5__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2067:1: rule__DCLComponentInterface__Group__5__Impl : ( ';' ) ;
    public final void rule__DCLComponentInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2071:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2072:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2072:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2073:1: ';'
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getSemicolonKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__DCLComponentInterface__Group__5__Impl4209); 
             after(grammarAccess.getDCLComponentInterfaceAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group__5__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group_4__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2098:1: rule__DCLComponentInterface__Group_4__0 : rule__DCLComponentInterface__Group_4__0__Impl rule__DCLComponentInterface__Group_4__1 ;
    public final void rule__DCLComponentInterface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2102:1: ( rule__DCLComponentInterface__Group_4__0__Impl rule__DCLComponentInterface__Group_4__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2103:2: rule__DCLComponentInterface__Group_4__0__Impl rule__DCLComponentInterface__Group_4__1
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group_4__0__Impl_in_rule__DCLComponentInterface__Group_4__04252);
            rule__DCLComponentInterface__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponentInterface__Group_4__1_in_rule__DCLComponentInterface__Group_4__04255);
            rule__DCLComponentInterface__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group_4__0"


    // $ANTLR start "rule__DCLComponentInterface__Group_4__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2110:1: rule__DCLComponentInterface__Group_4__0__Impl : ( ',' ) ;
    public final void rule__DCLComponentInterface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2114:1: ( ( ',' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2115:1: ( ',' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2115:1: ( ',' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2116:1: ','
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getCommaKeyword_4_0()); 
            match(input,28,FOLLOW_28_in_rule__DCLComponentInterface__Group_4__0__Impl4283); 
             after(grammarAccess.getDCLComponentInterfaceAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group_4__0__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group_4__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2129:1: rule__DCLComponentInterface__Group_4__1 : rule__DCLComponentInterface__Group_4__1__Impl rule__DCLComponentInterface__Group_4__2 ;
    public final void rule__DCLComponentInterface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2133:1: ( rule__DCLComponentInterface__Group_4__1__Impl rule__DCLComponentInterface__Group_4__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2134:2: rule__DCLComponentInterface__Group_4__1__Impl rule__DCLComponentInterface__Group_4__2
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group_4__1__Impl_in_rule__DCLComponentInterface__Group_4__14314);
            rule__DCLComponentInterface__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponentInterface__Group_4__2_in_rule__DCLComponentInterface__Group_4__14317);
            rule__DCLComponentInterface__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group_4__1"


    // $ANTLR start "rule__DCLComponentInterface__Group_4__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2141:1: rule__DCLComponentInterface__Group_4__1__Impl : ( 'type: ' ) ;
    public final void rule__DCLComponentInterface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2145:1: ( ( 'type: ' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2146:1: ( 'type: ' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2146:1: ( 'type: ' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2147:1: 'type: '
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getTypeKeyword_4_1()); 
            match(input,37,FOLLOW_37_in_rule__DCLComponentInterface__Group_4__1__Impl4345); 
             after(grammarAccess.getDCLComponentInterfaceAccess().getTypeKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group_4__1__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group_4__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2160:1: rule__DCLComponentInterface__Group_4__2 : rule__DCLComponentInterface__Group_4__2__Impl ;
    public final void rule__DCLComponentInterface__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2164:1: ( rule__DCLComponentInterface__Group_4__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2165:2: rule__DCLComponentInterface__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group_4__2__Impl_in_rule__DCLComponentInterface__Group_4__24376);
            rule__DCLComponentInterface__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group_4__2"


    // $ANTLR start "rule__DCLComponentInterface__Group_4__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2171:1: rule__DCLComponentInterface__Group_4__2__Impl : ( ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 ) ) ;
    public final void rule__DCLComponentInterface__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2175:1: ( ( ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2176:1: ( ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2176:1: ( ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2177:1: ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeAssignment_4_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2178:1: ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2178:2: rule__DCLComponentInterface__InterfaceTypeAssignment_4_2
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__InterfaceTypeAssignment_4_2_in_rule__DCLComponentInterface__Group_4__2__Impl4403);
            rule__DCLComponentInterface__InterfaceTypeAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__Group_4__2__Impl"


    // $ANTLR start "rule__DCLSubSystem__Group__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2194:1: rule__DCLSubSystem__Group__0 : rule__DCLSubSystem__Group__0__Impl rule__DCLSubSystem__Group__1 ;
    public final void rule__DCLSubSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2198:1: ( rule__DCLSubSystem__Group__0__Impl rule__DCLSubSystem__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2199:2: rule__DCLSubSystem__Group__0__Impl rule__DCLSubSystem__Group__1
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__Group__0__Impl_in_rule__DCLSubSystem__Group__04439);
            rule__DCLSubSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLSubSystem__Group__1_in_rule__DCLSubSystem__Group__04442);
            rule__DCLSubSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLSubSystem__Group__0"


    // $ANTLR start "rule__DCLSubSystem__Group__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2206:1: rule__DCLSubSystem__Group__0__Impl : ( 'subSystem' ) ;
    public final void rule__DCLSubSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2210:1: ( ( 'subSystem' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2211:1: ( 'subSystem' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2211:1: ( 'subSystem' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2212:1: 'subSystem'
            {
             before(grammarAccess.getDCLSubSystemAccess().getSubSystemKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__DCLSubSystem__Group__0__Impl4470); 
             after(grammarAccess.getDCLSubSystemAccess().getSubSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLSubSystem__Group__0__Impl"


    // $ANTLR start "rule__DCLSubSystem__Group__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2225:1: rule__DCLSubSystem__Group__1 : rule__DCLSubSystem__Group__1__Impl rule__DCLSubSystem__Group__2 ;
    public final void rule__DCLSubSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2229:1: ( rule__DCLSubSystem__Group__1__Impl rule__DCLSubSystem__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2230:2: rule__DCLSubSystem__Group__1__Impl rule__DCLSubSystem__Group__2
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__Group__1__Impl_in_rule__DCLSubSystem__Group__14501);
            rule__DCLSubSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLSubSystem__Group__2_in_rule__DCLSubSystem__Group__14504);
            rule__DCLSubSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLSubSystem__Group__1"


    // $ANTLR start "rule__DCLSubSystem__Group__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2237:1: rule__DCLSubSystem__Group__1__Impl : ( ( rule__DCLSubSystem__NameAssignment_1 ) ) ;
    public final void rule__DCLSubSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2241:1: ( ( ( rule__DCLSubSystem__NameAssignment_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2242:1: ( ( rule__DCLSubSystem__NameAssignment_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2242:1: ( ( rule__DCLSubSystem__NameAssignment_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2243:1: ( rule__DCLSubSystem__NameAssignment_1 )
            {
             before(grammarAccess.getDCLSubSystemAccess().getNameAssignment_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2244:1: ( rule__DCLSubSystem__NameAssignment_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2244:2: rule__DCLSubSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__NameAssignment_1_in_rule__DCLSubSystem__Group__1__Impl4531);
            rule__DCLSubSystem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDCLSubSystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLSubSystem__Group__1__Impl"


    // $ANTLR start "rule__DCLSubSystem__Group__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2254:1: rule__DCLSubSystem__Group__2 : rule__DCLSubSystem__Group__2__Impl rule__DCLSubSystem__Group__3 ;
    public final void rule__DCLSubSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2258:1: ( rule__DCLSubSystem__Group__2__Impl rule__DCLSubSystem__Group__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2259:2: rule__DCLSubSystem__Group__2__Impl rule__DCLSubSystem__Group__3
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__Group__2__Impl_in_rule__DCLSubSystem__Group__24561);
            rule__DCLSubSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLSubSystem__Group__3_in_rule__DCLSubSystem__Group__24564);
            rule__DCLSubSystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLSubSystem__Group__2"


    // $ANTLR start "rule__DCLSubSystem__Group__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2266:1: rule__DCLSubSystem__Group__2__Impl : ( ( rule__DCLSubSystem__Group_2__0 )? ) ;
    public final void rule__DCLSubSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2270:1: ( ( ( rule__DCLSubSystem__Group_2__0 )? ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2271:1: ( ( rule__DCLSubSystem__Group_2__0 )? )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2271:1: ( ( rule__DCLSubSystem__Group_2__0 )? )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2272:1: ( rule__DCLSubSystem__Group_2__0 )?
            {
             before(grammarAccess.getDCLSubSystemAccess().getGroup_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2273:1: ( rule__DCLSubSystem__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2273:2: rule__DCLSubSystem__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DCLSubSystem__Group_2__0_in_rule__DCLSubSystem__Group__2__Impl4591);
                    rule__DCLSubSystem__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDCLSubSystemAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLSubSystem__Group__2__Impl"


    // $ANTLR start "rule__DCLSubSystem__Group__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2283:1: rule__DCLSubSystem__Group__3 : rule__DCLSubSystem__Group__3__Impl ;
    public final void rule__DCLSubSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2287:1: ( rule__DCLSubSystem__Group__3__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2288:2: rule__DCLSubSystem__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__Group__3__Impl_in_rule__DCLSubSystem__Group__34622);
            rule__DCLSubSystem__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLSubSystem__Group__3"


    // $ANTLR start "rule__DCLSubSystem__Group__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2294:1: rule__DCLSubSystem__Group__3__Impl : ( ';' ) ;
    public final void rule__DCLSubSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2298:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2299:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2299:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2300:1: ';'
            {
             before(grammarAccess.getDCLSubSystemAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__DCLSubSystem__Group__3__Impl4650); 
             after(grammarAccess.getDCLSubSystemAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLSubSystem__Group__3__Impl"


    // $ANTLR start "rule__DCLSubSystem__Group_2__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2321:1: rule__DCLSubSystem__Group_2__0 : rule__DCLSubSystem__Group_2__0__Impl rule__DCLSubSystem__Group_2__1 ;
    public final void rule__DCLSubSystem__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2325:1: ( rule__DCLSubSystem__Group_2__0__Impl rule__DCLSubSystem__Group_2__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2326:2: rule__DCLSubSystem__Group_2__0__Impl rule__DCLSubSystem__Group_2__1
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__Group_2__0__Impl_in_rule__DCLSubSystem__Group_2__04689);
            rule__DCLSubSystem__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLSubSystem__Group_2__1_in_rule__DCLSubSystem__Group_2__04692);
            rule__DCLSubSystem__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLSubSystem__Group_2__0"


    // $ANTLR start "rule__DCLSubSystem__Group_2__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2333:1: rule__DCLSubSystem__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DCLSubSystem__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2337:1: ( ( ',' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2338:1: ( ',' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2338:1: ( ',' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2339:1: ','
            {
             before(grammarAccess.getDCLSubSystemAccess().getCommaKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__DCLSubSystem__Group_2__0__Impl4720); 
             after(grammarAccess.getDCLSubSystemAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLSubSystem__Group_2__0__Impl"


    // $ANTLR start "rule__DCLSubSystem__Group_2__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2352:1: rule__DCLSubSystem__Group_2__1 : rule__DCLSubSystem__Group_2__1__Impl rule__DCLSubSystem__Group_2__2 ;
    public final void rule__DCLSubSystem__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2356:1: ( rule__DCLSubSystem__Group_2__1__Impl rule__DCLSubSystem__Group_2__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2357:2: rule__DCLSubSystem__Group_2__1__Impl rule__DCLSubSystem__Group_2__2
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__Group_2__1__Impl_in_rule__DCLSubSystem__Group_2__14751);
            rule__DCLSubSystem__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLSubSystem__Group_2__2_in_rule__DCLSubSystem__Group_2__14754);
            rule__DCLSubSystem__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLSubSystem__Group_2__1"


    // $ANTLR start "rule__DCLSubSystem__Group_2__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2364:1: rule__DCLSubSystem__Group_2__1__Impl : ( 'inSubSystem: ' ) ;
    public final void rule__DCLSubSystem__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2368:1: ( ( 'inSubSystem: ' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2369:1: ( 'inSubSystem: ' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2369:1: ( 'inSubSystem: ' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2370:1: 'inSubSystem: '
            {
             before(grammarAccess.getDCLSubSystemAccess().getInSubSystemKeyword_2_1()); 
            match(input,32,FOLLOW_32_in_rule__DCLSubSystem__Group_2__1__Impl4782); 
             after(grammarAccess.getDCLSubSystemAccess().getInSubSystemKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLSubSystem__Group_2__1__Impl"


    // $ANTLR start "rule__DCLSubSystem__Group_2__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2383:1: rule__DCLSubSystem__Group_2__2 : rule__DCLSubSystem__Group_2__2__Impl ;
    public final void rule__DCLSubSystem__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2387:1: ( rule__DCLSubSystem__Group_2__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2388:2: rule__DCLSubSystem__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__Group_2__2__Impl_in_rule__DCLSubSystem__Group_2__24813);
            rule__DCLSubSystem__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLSubSystem__Group_2__2"


    // $ANTLR start "rule__DCLSubSystem__Group_2__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2394:1: rule__DCLSubSystem__Group_2__2__Impl : ( ( rule__DCLSubSystem__SubSystemAssignment_2_2 ) ) ;
    public final void rule__DCLSubSystem__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2398:1: ( ( ( rule__DCLSubSystem__SubSystemAssignment_2_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2399:1: ( ( rule__DCLSubSystem__SubSystemAssignment_2_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2399:1: ( ( rule__DCLSubSystem__SubSystemAssignment_2_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2400:1: ( rule__DCLSubSystem__SubSystemAssignment_2_2 )
            {
             before(grammarAccess.getDCLSubSystemAccess().getSubSystemAssignment_2_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2401:1: ( rule__DCLSubSystem__SubSystemAssignment_2_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2401:2: rule__DCLSubSystem__SubSystemAssignment_2_2
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__SubSystemAssignment_2_2_in_rule__DCLSubSystem__Group_2__2__Impl4840);
            rule__DCLSubSystem__SubSystemAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDCLSubSystemAccess().getSubSystemAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLSubSystem__Group_2__2__Impl"


    // $ANTLR start "rule__DCLModule__Group__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2417:1: rule__DCLModule__Group__0 : rule__DCLModule__Group__0__Impl rule__DCLModule__Group__1 ;
    public final void rule__DCLModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2421:1: ( rule__DCLModule__Group__0__Impl rule__DCLModule__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2422:2: rule__DCLModule__Group__0__Impl rule__DCLModule__Group__1
            {
            pushFollow(FOLLOW_rule__DCLModule__Group__0__Impl_in_rule__DCLModule__Group__04876);
            rule__DCLModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLModule__Group__1_in_rule__DCLModule__Group__04879);
            rule__DCLModule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLModule__Group__0"


    // $ANTLR start "rule__DCLModule__Group__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2429:1: rule__DCLModule__Group__0__Impl : ( 'module' ) ;
    public final void rule__DCLModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2433:1: ( ( 'module' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2434:1: ( 'module' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2434:1: ( 'module' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2435:1: 'module'
            {
             before(grammarAccess.getDCLModuleAccess().getModuleKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__DCLModule__Group__0__Impl4907); 
             after(grammarAccess.getDCLModuleAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLModule__Group__0__Impl"


    // $ANTLR start "rule__DCLModule__Group__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2448:1: rule__DCLModule__Group__1 : rule__DCLModule__Group__1__Impl rule__DCLModule__Group__2 ;
    public final void rule__DCLModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2452:1: ( rule__DCLModule__Group__1__Impl rule__DCLModule__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2453:2: rule__DCLModule__Group__1__Impl rule__DCLModule__Group__2
            {
            pushFollow(FOLLOW_rule__DCLModule__Group__1__Impl_in_rule__DCLModule__Group__14938);
            rule__DCLModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLModule__Group__2_in_rule__DCLModule__Group__14941);
            rule__DCLModule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLModule__Group__1"


    // $ANTLR start "rule__DCLModule__Group__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2460:1: rule__DCLModule__Group__1__Impl : ( ( rule__DCLModule__NameAssignment_1 ) ) ;
    public final void rule__DCLModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2464:1: ( ( ( rule__DCLModule__NameAssignment_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2465:1: ( ( rule__DCLModule__NameAssignment_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2465:1: ( ( rule__DCLModule__NameAssignment_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2466:1: ( rule__DCLModule__NameAssignment_1 )
            {
             before(grammarAccess.getDCLModuleAccess().getNameAssignment_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2467:1: ( rule__DCLModule__NameAssignment_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2467:2: rule__DCLModule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DCLModule__NameAssignment_1_in_rule__DCLModule__Group__1__Impl4968);
            rule__DCLModule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDCLModuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLModule__Group__1__Impl"


    // $ANTLR start "rule__DCLModule__Group__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2477:1: rule__DCLModule__Group__2 : rule__DCLModule__Group__2__Impl ;
    public final void rule__DCLModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2481:1: ( rule__DCLModule__Group__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2482:2: rule__DCLModule__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLModule__Group__2__Impl_in_rule__DCLModule__Group__24998);
            rule__DCLModule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLModule__Group__2"


    // $ANTLR start "rule__DCLModule__Group__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2488:1: rule__DCLModule__Group__2__Impl : ( ';' ) ;
    public final void rule__DCLModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2492:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2493:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2493:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2494:1: ';'
            {
             before(grammarAccess.getDCLModuleAccess().getSemicolonKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__DCLModule__Group__2__Impl5026); 
             after(grammarAccess.getDCLModuleAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLModule__Group__2__Impl"


    // $ANTLR start "rule__DCDecl__Group_0__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2513:1: rule__DCDecl__Group_0__0 : rule__DCDecl__Group_0__0__Impl rule__DCDecl__Group_0__1 ;
    public final void rule__DCDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2517:1: ( rule__DCDecl__Group_0__0__Impl rule__DCDecl__Group_0__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2518:2: rule__DCDecl__Group_0__0__Impl rule__DCDecl__Group_0__1
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__0__Impl_in_rule__DCDecl__Group_0__05063);
            rule__DCDecl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__1_in_rule__DCDecl__Group_0__05066);
            rule__DCDecl__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_0__0"


    // $ANTLR start "rule__DCDecl__Group_0__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2525:1: rule__DCDecl__Group_0__0__Impl : ( ( rule__DCDecl__OnlyAssignment_0_0 ) ) ;
    public final void rule__DCDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2529:1: ( ( ( rule__DCDecl__OnlyAssignment_0_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2530:1: ( ( rule__DCDecl__OnlyAssignment_0_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2530:1: ( ( rule__DCDecl__OnlyAssignment_0_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2531:1: ( rule__DCDecl__OnlyAssignment_0_0 )
            {
             before(grammarAccess.getDCDeclAccess().getOnlyAssignment_0_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2532:1: ( rule__DCDecl__OnlyAssignment_0_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2532:2: rule__DCDecl__OnlyAssignment_0_0
            {
            pushFollow(FOLLOW_rule__DCDecl__OnlyAssignment_0_0_in_rule__DCDecl__Group_0__0__Impl5093);
            rule__DCDecl__OnlyAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getOnlyAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_0__0__Impl"


    // $ANTLR start "rule__DCDecl__Group_0__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2542:1: rule__DCDecl__Group_0__1 : rule__DCDecl__Group_0__1__Impl rule__DCDecl__Group_0__2 ;
    public final void rule__DCDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2546:1: ( rule__DCDecl__Group_0__1__Impl rule__DCDecl__Group_0__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2547:2: rule__DCDecl__Group_0__1__Impl rule__DCDecl__Group_0__2
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__1__Impl_in_rule__DCDecl__Group_0__15123);
            rule__DCDecl__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__2_in_rule__DCDecl__Group_0__15126);
            rule__DCDecl__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_0__1"


    // $ANTLR start "rule__DCDecl__Group_0__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2554:1: rule__DCDecl__Group_0__1__Impl : ( ( rule__DCDecl__TAssignment_0_1 ) ) ;
    public final void rule__DCDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2558:1: ( ( ( rule__DCDecl__TAssignment_0_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2559:1: ( ( rule__DCDecl__TAssignment_0_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2559:1: ( ( rule__DCDecl__TAssignment_0_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2560:1: ( rule__DCDecl__TAssignment_0_1 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_0_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2561:1: ( rule__DCDecl__TAssignment_0_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2561:2: rule__DCDecl__TAssignment_0_1
            {
            pushFollow(FOLLOW_rule__DCDecl__TAssignment_0_1_in_rule__DCDecl__Group_0__1__Impl5153);
            rule__DCDecl__TAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_0__1__Impl"


    // $ANTLR start "rule__DCDecl__Group_0__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2571:1: rule__DCDecl__Group_0__2 : rule__DCDecl__Group_0__2__Impl rule__DCDecl__Group_0__3 ;
    public final void rule__DCDecl__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2575:1: ( rule__DCDecl__Group_0__2__Impl rule__DCDecl__Group_0__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2576:2: rule__DCDecl__Group_0__2__Impl rule__DCDecl__Group_0__3
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__2__Impl_in_rule__DCDecl__Group_0__25183);
            rule__DCDecl__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__3_in_rule__DCDecl__Group_0__25186);
            rule__DCDecl__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_0__2"


    // $ANTLR start "rule__DCDecl__Group_0__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2583:1: rule__DCDecl__Group_0__2__Impl : ( ( rule__DCDecl__CanAssignment_0_2 ) ) ;
    public final void rule__DCDecl__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2587:1: ( ( ( rule__DCDecl__CanAssignment_0_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2588:1: ( ( rule__DCDecl__CanAssignment_0_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2588:1: ( ( rule__DCDecl__CanAssignment_0_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2589:1: ( rule__DCDecl__CanAssignment_0_2 )
            {
             before(grammarAccess.getDCDeclAccess().getCanAssignment_0_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2590:1: ( rule__DCDecl__CanAssignment_0_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2590:2: rule__DCDecl__CanAssignment_0_2
            {
            pushFollow(FOLLOW_rule__DCDecl__CanAssignment_0_2_in_rule__DCDecl__Group_0__2__Impl5213);
            rule__DCDecl__CanAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getCanAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_0__2__Impl"


    // $ANTLR start "rule__DCDecl__Group_0__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2600:1: rule__DCDecl__Group_0__3 : rule__DCDecl__Group_0__3__Impl rule__DCDecl__Group_0__4 ;
    public final void rule__DCDecl__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2604:1: ( rule__DCDecl__Group_0__3__Impl rule__DCDecl__Group_0__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2605:2: rule__DCDecl__Group_0__3__Impl rule__DCDecl__Group_0__4
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__3__Impl_in_rule__DCDecl__Group_0__35243);
            rule__DCDecl__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__4_in_rule__DCDecl__Group_0__35246);
            rule__DCDecl__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_0__3"


    // $ANTLR start "rule__DCDecl__Group_0__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2612:1: rule__DCDecl__Group_0__3__Impl : ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) ) ;
    public final void rule__DCDecl__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2616:1: ( ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2617:1: ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2617:1: ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2618:1: ( rule__DCDecl__ElementTypeAssignment_0_3 )
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeAssignment_0_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2619:1: ( rule__DCDecl__ElementTypeAssignment_0_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2619:2: rule__DCDecl__ElementTypeAssignment_0_3
            {
            pushFollow(FOLLOW_rule__DCDecl__ElementTypeAssignment_0_3_in_rule__DCDecl__Group_0__3__Impl5273);
            rule__DCDecl__ElementTypeAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getElementTypeAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_0__3__Impl"


    // $ANTLR start "rule__DCDecl__Group_0__4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2629:1: rule__DCDecl__Group_0__4 : rule__DCDecl__Group_0__4__Impl rule__DCDecl__Group_0__5 ;
    public final void rule__DCDecl__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2633:1: ( rule__DCDecl__Group_0__4__Impl rule__DCDecl__Group_0__5 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2634:2: rule__DCDecl__Group_0__4__Impl rule__DCDecl__Group_0__5
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__4__Impl_in_rule__DCDecl__Group_0__45303);
            rule__DCDecl__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__5_in_rule__DCDecl__Group_0__45306);
            rule__DCDecl__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_0__4"


    // $ANTLR start "rule__DCDecl__Group_0__4__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2641:1: rule__DCDecl__Group_0__4__Impl : ( ( rule__DCDecl__TypeAssignment_0_4 ) ) ;
    public final void rule__DCDecl__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2645:1: ( ( ( rule__DCDecl__TypeAssignment_0_4 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2646:1: ( ( rule__DCDecl__TypeAssignment_0_4 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2646:1: ( ( rule__DCDecl__TypeAssignment_0_4 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2647:1: ( rule__DCDecl__TypeAssignment_0_4 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_0_4()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2648:1: ( rule__DCDecl__TypeAssignment_0_4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2648:2: rule__DCDecl__TypeAssignment_0_4
            {
            pushFollow(FOLLOW_rule__DCDecl__TypeAssignment_0_4_in_rule__DCDecl__Group_0__4__Impl5333);
            rule__DCDecl__TypeAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTypeAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_0__4__Impl"


    // $ANTLR start "rule__DCDecl__Group_0__5"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2658:1: rule__DCDecl__Group_0__5 : rule__DCDecl__Group_0__5__Impl ;
    public final void rule__DCDecl__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2662:1: ( rule__DCDecl__Group_0__5__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2663:2: rule__DCDecl__Group_0__5__Impl
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__5__Impl_in_rule__DCDecl__Group_0__55363);
            rule__DCDecl__Group_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_0__5"


    // $ANTLR start "rule__DCDecl__Group_0__5__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2669:1: rule__DCDecl__Group_0__5__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2673:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2674:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2674:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2675:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_0_5()); 
            match(input,30,FOLLOW_30_in_rule__DCDecl__Group_0__5__Impl5391); 
             after(grammarAccess.getDCDeclAccess().getSemicolonKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_0__5__Impl"


    // $ANTLR start "rule__DCDecl__Group_1__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2700:1: rule__DCDecl__Group_1__0 : rule__DCDecl__Group_1__0__Impl rule__DCDecl__Group_1__1 ;
    public final void rule__DCDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2704:1: ( rule__DCDecl__Group_1__0__Impl rule__DCDecl__Group_1__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2705:2: rule__DCDecl__Group_1__0__Impl rule__DCDecl__Group_1__1
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__0__Impl_in_rule__DCDecl__Group_1__05434);
            rule__DCDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_1__1_in_rule__DCDecl__Group_1__05437);
            rule__DCDecl__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_1__0"


    // $ANTLR start "rule__DCDecl__Group_1__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2712:1: rule__DCDecl__Group_1__0__Impl : ( ( rule__DCDecl__TAssignment_1_0 ) ) ;
    public final void rule__DCDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2716:1: ( ( ( rule__DCDecl__TAssignment_1_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2717:1: ( ( rule__DCDecl__TAssignment_1_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2717:1: ( ( rule__DCDecl__TAssignment_1_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2718:1: ( rule__DCDecl__TAssignment_1_0 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_1_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2719:1: ( rule__DCDecl__TAssignment_1_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2719:2: rule__DCDecl__TAssignment_1_0
            {
            pushFollow(FOLLOW_rule__DCDecl__TAssignment_1_0_in_rule__DCDecl__Group_1__0__Impl5464);
            rule__DCDecl__TAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_1__0__Impl"


    // $ANTLR start "rule__DCDecl__Group_1__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2729:1: rule__DCDecl__Group_1__1 : rule__DCDecl__Group_1__1__Impl rule__DCDecl__Group_1__2 ;
    public final void rule__DCDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2733:1: ( rule__DCDecl__Group_1__1__Impl rule__DCDecl__Group_1__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2734:2: rule__DCDecl__Group_1__1__Impl rule__DCDecl__Group_1__2
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__1__Impl_in_rule__DCDecl__Group_1__15494);
            rule__DCDecl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_1__2_in_rule__DCDecl__Group_1__15497);
            rule__DCDecl__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_1__1"


    // $ANTLR start "rule__DCDecl__Group_1__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2741:1: rule__DCDecl__Group_1__1__Impl : ( ( rule__DCDecl__CannotAssignment_1_1 ) ) ;
    public final void rule__DCDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2745:1: ( ( ( rule__DCDecl__CannotAssignment_1_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2746:1: ( ( rule__DCDecl__CannotAssignment_1_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2746:1: ( ( rule__DCDecl__CannotAssignment_1_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2747:1: ( rule__DCDecl__CannotAssignment_1_1 )
            {
             before(grammarAccess.getDCDeclAccess().getCannotAssignment_1_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2748:1: ( rule__DCDecl__CannotAssignment_1_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2748:2: rule__DCDecl__CannotAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DCDecl__CannotAssignment_1_1_in_rule__DCDecl__Group_1__1__Impl5524);
            rule__DCDecl__CannotAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getCannotAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_1__1__Impl"


    // $ANTLR start "rule__DCDecl__Group_1__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2758:1: rule__DCDecl__Group_1__2 : rule__DCDecl__Group_1__2__Impl rule__DCDecl__Group_1__3 ;
    public final void rule__DCDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2762:1: ( rule__DCDecl__Group_1__2__Impl rule__DCDecl__Group_1__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2763:2: rule__DCDecl__Group_1__2__Impl rule__DCDecl__Group_1__3
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__2__Impl_in_rule__DCDecl__Group_1__25554);
            rule__DCDecl__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_1__3_in_rule__DCDecl__Group_1__25557);
            rule__DCDecl__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_1__2"


    // $ANTLR start "rule__DCDecl__Group_1__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2770:1: rule__DCDecl__Group_1__2__Impl : ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) ) ;
    public final void rule__DCDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2774:1: ( ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2775:1: ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2775:1: ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2776:1: ( rule__DCDecl__ElementTypeAssignment_1_2 )
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeAssignment_1_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2777:1: ( rule__DCDecl__ElementTypeAssignment_1_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2777:2: rule__DCDecl__ElementTypeAssignment_1_2
            {
            pushFollow(FOLLOW_rule__DCDecl__ElementTypeAssignment_1_2_in_rule__DCDecl__Group_1__2__Impl5584);
            rule__DCDecl__ElementTypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getElementTypeAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_1__2__Impl"


    // $ANTLR start "rule__DCDecl__Group_1__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2787:1: rule__DCDecl__Group_1__3 : rule__DCDecl__Group_1__3__Impl rule__DCDecl__Group_1__4 ;
    public final void rule__DCDecl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2791:1: ( rule__DCDecl__Group_1__3__Impl rule__DCDecl__Group_1__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2792:2: rule__DCDecl__Group_1__3__Impl rule__DCDecl__Group_1__4
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__3__Impl_in_rule__DCDecl__Group_1__35614);
            rule__DCDecl__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_1__4_in_rule__DCDecl__Group_1__35617);
            rule__DCDecl__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_1__3"


    // $ANTLR start "rule__DCDecl__Group_1__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2799:1: rule__DCDecl__Group_1__3__Impl : ( ( rule__DCDecl__TypeAssignment_1_3 ) ) ;
    public final void rule__DCDecl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2803:1: ( ( ( rule__DCDecl__TypeAssignment_1_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2804:1: ( ( rule__DCDecl__TypeAssignment_1_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2804:1: ( ( rule__DCDecl__TypeAssignment_1_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2805:1: ( rule__DCDecl__TypeAssignment_1_3 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_1_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2806:1: ( rule__DCDecl__TypeAssignment_1_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2806:2: rule__DCDecl__TypeAssignment_1_3
            {
            pushFollow(FOLLOW_rule__DCDecl__TypeAssignment_1_3_in_rule__DCDecl__Group_1__3__Impl5644);
            rule__DCDecl__TypeAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTypeAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_1__3__Impl"


    // $ANTLR start "rule__DCDecl__Group_1__4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2816:1: rule__DCDecl__Group_1__4 : rule__DCDecl__Group_1__4__Impl ;
    public final void rule__DCDecl__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2820:1: ( rule__DCDecl__Group_1__4__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2821:2: rule__DCDecl__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__4__Impl_in_rule__DCDecl__Group_1__45674);
            rule__DCDecl__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_1__4"


    // $ANTLR start "rule__DCDecl__Group_1__4__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2827:1: rule__DCDecl__Group_1__4__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2831:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2832:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2832:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2833:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_1_4()); 
            match(input,30,FOLLOW_30_in_rule__DCDecl__Group_1__4__Impl5702); 
             after(grammarAccess.getDCDeclAccess().getSemicolonKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_1__4__Impl"


    // $ANTLR start "rule__DCDecl__Group_2__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2856:1: rule__DCDecl__Group_2__0 : rule__DCDecl__Group_2__0__Impl rule__DCDecl__Group_2__1 ;
    public final void rule__DCDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2860:1: ( rule__DCDecl__Group_2__0__Impl rule__DCDecl__Group_2__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2861:2: rule__DCDecl__Group_2__0__Impl rule__DCDecl__Group_2__1
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__0__Impl_in_rule__DCDecl__Group_2__05743);
            rule__DCDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__1_in_rule__DCDecl__Group_2__05746);
            rule__DCDecl__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_2__0"


    // $ANTLR start "rule__DCDecl__Group_2__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2868:1: rule__DCDecl__Group_2__0__Impl : ( ( rule__DCDecl__TAssignment_2_0 ) ) ;
    public final void rule__DCDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2872:1: ( ( ( rule__DCDecl__TAssignment_2_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2873:1: ( ( rule__DCDecl__TAssignment_2_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2873:1: ( ( rule__DCDecl__TAssignment_2_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2874:1: ( rule__DCDecl__TAssignment_2_0 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_2_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2875:1: ( rule__DCDecl__TAssignment_2_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2875:2: rule__DCDecl__TAssignment_2_0
            {
            pushFollow(FOLLOW_rule__DCDecl__TAssignment_2_0_in_rule__DCDecl__Group_2__0__Impl5773);
            rule__DCDecl__TAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_2__0__Impl"


    // $ANTLR start "rule__DCDecl__Group_2__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2885:1: rule__DCDecl__Group_2__1 : rule__DCDecl__Group_2__1__Impl rule__DCDecl__Group_2__2 ;
    public final void rule__DCDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2889:1: ( rule__DCDecl__Group_2__1__Impl rule__DCDecl__Group_2__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2890:2: rule__DCDecl__Group_2__1__Impl rule__DCDecl__Group_2__2
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__1__Impl_in_rule__DCDecl__Group_2__15803);
            rule__DCDecl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__2_in_rule__DCDecl__Group_2__15806);
            rule__DCDecl__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_2__1"


    // $ANTLR start "rule__DCDecl__Group_2__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2897:1: rule__DCDecl__Group_2__1__Impl : ( ( rule__DCDecl__CanAssignment_2_1 ) ) ;
    public final void rule__DCDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2901:1: ( ( ( rule__DCDecl__CanAssignment_2_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2902:1: ( ( rule__DCDecl__CanAssignment_2_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2902:1: ( ( rule__DCDecl__CanAssignment_2_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2903:1: ( rule__DCDecl__CanAssignment_2_1 )
            {
             before(grammarAccess.getDCDeclAccess().getCanAssignment_2_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2904:1: ( rule__DCDecl__CanAssignment_2_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2904:2: rule__DCDecl__CanAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DCDecl__CanAssignment_2_1_in_rule__DCDecl__Group_2__1__Impl5833);
            rule__DCDecl__CanAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getCanAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_2__1__Impl"


    // $ANTLR start "rule__DCDecl__Group_2__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2914:1: rule__DCDecl__Group_2__2 : rule__DCDecl__Group_2__2__Impl rule__DCDecl__Group_2__3 ;
    public final void rule__DCDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2918:1: ( rule__DCDecl__Group_2__2__Impl rule__DCDecl__Group_2__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2919:2: rule__DCDecl__Group_2__2__Impl rule__DCDecl__Group_2__3
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__2__Impl_in_rule__DCDecl__Group_2__25863);
            rule__DCDecl__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__3_in_rule__DCDecl__Group_2__25866);
            rule__DCDecl__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_2__2"


    // $ANTLR start "rule__DCDecl__Group_2__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2926:1: rule__DCDecl__Group_2__2__Impl : ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) ) ;
    public final void rule__DCDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2930:1: ( ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2931:1: ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2931:1: ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2932:1: ( rule__DCDecl__ElementTypeAssignment_2_2 )
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeAssignment_2_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2933:1: ( rule__DCDecl__ElementTypeAssignment_2_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2933:2: rule__DCDecl__ElementTypeAssignment_2_2
            {
            pushFollow(FOLLOW_rule__DCDecl__ElementTypeAssignment_2_2_in_rule__DCDecl__Group_2__2__Impl5893);
            rule__DCDecl__ElementTypeAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getElementTypeAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_2__2__Impl"


    // $ANTLR start "rule__DCDecl__Group_2__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2943:1: rule__DCDecl__Group_2__3 : rule__DCDecl__Group_2__3__Impl rule__DCDecl__Group_2__4 ;
    public final void rule__DCDecl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2947:1: ( rule__DCDecl__Group_2__3__Impl rule__DCDecl__Group_2__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2948:2: rule__DCDecl__Group_2__3__Impl rule__DCDecl__Group_2__4
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__3__Impl_in_rule__DCDecl__Group_2__35923);
            rule__DCDecl__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__4_in_rule__DCDecl__Group_2__35926);
            rule__DCDecl__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_2__3"


    // $ANTLR start "rule__DCDecl__Group_2__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2955:1: rule__DCDecl__Group_2__3__Impl : ( ( rule__DCDecl__Only2Assignment_2_3 ) ) ;
    public final void rule__DCDecl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2959:1: ( ( ( rule__DCDecl__Only2Assignment_2_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2960:1: ( ( rule__DCDecl__Only2Assignment_2_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2960:1: ( ( rule__DCDecl__Only2Assignment_2_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2961:1: ( rule__DCDecl__Only2Assignment_2_3 )
            {
             before(grammarAccess.getDCDeclAccess().getOnly2Assignment_2_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2962:1: ( rule__DCDecl__Only2Assignment_2_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2962:2: rule__DCDecl__Only2Assignment_2_3
            {
            pushFollow(FOLLOW_rule__DCDecl__Only2Assignment_2_3_in_rule__DCDecl__Group_2__3__Impl5953);
            rule__DCDecl__Only2Assignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getOnly2Assignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_2__3__Impl"


    // $ANTLR start "rule__DCDecl__Group_2__4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2972:1: rule__DCDecl__Group_2__4 : rule__DCDecl__Group_2__4__Impl rule__DCDecl__Group_2__5 ;
    public final void rule__DCDecl__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2976:1: ( rule__DCDecl__Group_2__4__Impl rule__DCDecl__Group_2__5 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2977:2: rule__DCDecl__Group_2__4__Impl rule__DCDecl__Group_2__5
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__4__Impl_in_rule__DCDecl__Group_2__45983);
            rule__DCDecl__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__5_in_rule__DCDecl__Group_2__45986);
            rule__DCDecl__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_2__4"


    // $ANTLR start "rule__DCDecl__Group_2__4__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2984:1: rule__DCDecl__Group_2__4__Impl : ( ( rule__DCDecl__TypeAssignment_2_4 ) ) ;
    public final void rule__DCDecl__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2988:1: ( ( ( rule__DCDecl__TypeAssignment_2_4 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2989:1: ( ( rule__DCDecl__TypeAssignment_2_4 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2989:1: ( ( rule__DCDecl__TypeAssignment_2_4 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2990:1: ( rule__DCDecl__TypeAssignment_2_4 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_2_4()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2991:1: ( rule__DCDecl__TypeAssignment_2_4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2991:2: rule__DCDecl__TypeAssignment_2_4
            {
            pushFollow(FOLLOW_rule__DCDecl__TypeAssignment_2_4_in_rule__DCDecl__Group_2__4__Impl6013);
            rule__DCDecl__TypeAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTypeAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_2__4__Impl"


    // $ANTLR start "rule__DCDecl__Group_2__5"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3001:1: rule__DCDecl__Group_2__5 : rule__DCDecl__Group_2__5__Impl ;
    public final void rule__DCDecl__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3005:1: ( rule__DCDecl__Group_2__5__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3006:2: rule__DCDecl__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__5__Impl_in_rule__DCDecl__Group_2__56043);
            rule__DCDecl__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_2__5"


    // $ANTLR start "rule__DCDecl__Group_2__5__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3012:1: rule__DCDecl__Group_2__5__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3016:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3017:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3017:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3018:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_2_5()); 
            match(input,30,FOLLOW_30_in_rule__DCDecl__Group_2__5__Impl6071); 
             after(grammarAccess.getDCDeclAccess().getSemicolonKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_2__5__Impl"


    // $ANTLR start "rule__DCDecl__Group_3__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3043:1: rule__DCDecl__Group_3__0 : rule__DCDecl__Group_3__0__Impl rule__DCDecl__Group_3__1 ;
    public final void rule__DCDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3047:1: ( rule__DCDecl__Group_3__0__Impl rule__DCDecl__Group_3__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3048:2: rule__DCDecl__Group_3__0__Impl rule__DCDecl__Group_3__1
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__0__Impl_in_rule__DCDecl__Group_3__06114);
            rule__DCDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_3__1_in_rule__DCDecl__Group_3__06117);
            rule__DCDecl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_3__0"


    // $ANTLR start "rule__DCDecl__Group_3__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3055:1: rule__DCDecl__Group_3__0__Impl : ( ( rule__DCDecl__TAssignment_3_0 ) ) ;
    public final void rule__DCDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3059:1: ( ( ( rule__DCDecl__TAssignment_3_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3060:1: ( ( rule__DCDecl__TAssignment_3_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3060:1: ( ( rule__DCDecl__TAssignment_3_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3061:1: ( rule__DCDecl__TAssignment_3_0 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_3_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3062:1: ( rule__DCDecl__TAssignment_3_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3062:2: rule__DCDecl__TAssignment_3_0
            {
            pushFollow(FOLLOW_rule__DCDecl__TAssignment_3_0_in_rule__DCDecl__Group_3__0__Impl6144);
            rule__DCDecl__TAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_3__0__Impl"


    // $ANTLR start "rule__DCDecl__Group_3__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3072:1: rule__DCDecl__Group_3__1 : rule__DCDecl__Group_3__1__Impl rule__DCDecl__Group_3__2 ;
    public final void rule__DCDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3076:1: ( rule__DCDecl__Group_3__1__Impl rule__DCDecl__Group_3__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3077:2: rule__DCDecl__Group_3__1__Impl rule__DCDecl__Group_3__2
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__1__Impl_in_rule__DCDecl__Group_3__16174);
            rule__DCDecl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_3__2_in_rule__DCDecl__Group_3__16177);
            rule__DCDecl__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_3__1"


    // $ANTLR start "rule__DCDecl__Group_3__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3084:1: rule__DCDecl__Group_3__1__Impl : ( ( rule__DCDecl__MustAssignment_3_1 ) ) ;
    public final void rule__DCDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3088:1: ( ( ( rule__DCDecl__MustAssignment_3_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3089:1: ( ( rule__DCDecl__MustAssignment_3_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3089:1: ( ( rule__DCDecl__MustAssignment_3_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3090:1: ( rule__DCDecl__MustAssignment_3_1 )
            {
             before(grammarAccess.getDCDeclAccess().getMustAssignment_3_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3091:1: ( rule__DCDecl__MustAssignment_3_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3091:2: rule__DCDecl__MustAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DCDecl__MustAssignment_3_1_in_rule__DCDecl__Group_3__1__Impl6204);
            rule__DCDecl__MustAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getMustAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_3__1__Impl"


    // $ANTLR start "rule__DCDecl__Group_3__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3101:1: rule__DCDecl__Group_3__2 : rule__DCDecl__Group_3__2__Impl rule__DCDecl__Group_3__3 ;
    public final void rule__DCDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3105:1: ( rule__DCDecl__Group_3__2__Impl rule__DCDecl__Group_3__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3106:2: rule__DCDecl__Group_3__2__Impl rule__DCDecl__Group_3__3
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__2__Impl_in_rule__DCDecl__Group_3__26234);
            rule__DCDecl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_3__3_in_rule__DCDecl__Group_3__26237);
            rule__DCDecl__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_3__2"


    // $ANTLR start "rule__DCDecl__Group_3__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3113:1: rule__DCDecl__Group_3__2__Impl : ( ( rule__DCDecl__EntityTypeAssignment_3_2 ) ) ;
    public final void rule__DCDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3117:1: ( ( ( rule__DCDecl__EntityTypeAssignment_3_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3118:1: ( ( rule__DCDecl__EntityTypeAssignment_3_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3118:1: ( ( rule__DCDecl__EntityTypeAssignment_3_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3119:1: ( rule__DCDecl__EntityTypeAssignment_3_2 )
            {
             before(grammarAccess.getDCDeclAccess().getEntityTypeAssignment_3_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3120:1: ( rule__DCDecl__EntityTypeAssignment_3_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3120:2: rule__DCDecl__EntityTypeAssignment_3_2
            {
            pushFollow(FOLLOW_rule__DCDecl__EntityTypeAssignment_3_2_in_rule__DCDecl__Group_3__2__Impl6264);
            rule__DCDecl__EntityTypeAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getEntityTypeAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_3__2__Impl"


    // $ANTLR start "rule__DCDecl__Group_3__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3130:1: rule__DCDecl__Group_3__3 : rule__DCDecl__Group_3__3__Impl rule__DCDecl__Group_3__4 ;
    public final void rule__DCDecl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3134:1: ( rule__DCDecl__Group_3__3__Impl rule__DCDecl__Group_3__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3135:2: rule__DCDecl__Group_3__3__Impl rule__DCDecl__Group_3__4
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__3__Impl_in_rule__DCDecl__Group_3__36294);
            rule__DCDecl__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_3__4_in_rule__DCDecl__Group_3__36297);
            rule__DCDecl__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_3__3"


    // $ANTLR start "rule__DCDecl__Group_3__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3142:1: rule__DCDecl__Group_3__3__Impl : ( ( rule__DCDecl__TypeAssignment_3_3 ) ) ;
    public final void rule__DCDecl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3146:1: ( ( ( rule__DCDecl__TypeAssignment_3_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3147:1: ( ( rule__DCDecl__TypeAssignment_3_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3147:1: ( ( rule__DCDecl__TypeAssignment_3_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3148:1: ( rule__DCDecl__TypeAssignment_3_3 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_3_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3149:1: ( rule__DCDecl__TypeAssignment_3_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3149:2: rule__DCDecl__TypeAssignment_3_3
            {
            pushFollow(FOLLOW_rule__DCDecl__TypeAssignment_3_3_in_rule__DCDecl__Group_3__3__Impl6324);
            rule__DCDecl__TypeAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTypeAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_3__3__Impl"


    // $ANTLR start "rule__DCDecl__Group_3__4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3159:1: rule__DCDecl__Group_3__4 : rule__DCDecl__Group_3__4__Impl ;
    public final void rule__DCDecl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3163:1: ( rule__DCDecl__Group_3__4__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3164:2: rule__DCDecl__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__4__Impl_in_rule__DCDecl__Group_3__46354);
            rule__DCDecl__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_3__4"


    // $ANTLR start "rule__DCDecl__Group_3__4__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3170:1: rule__DCDecl__Group_3__4__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3174:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3175:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3175:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3176:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_3_4()); 
            match(input,30,FOLLOW_30_in_rule__DCDecl__Group_3__4__Impl6382); 
             after(grammarAccess.getDCDeclAccess().getSemicolonKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Group_3__4__Impl"


    // $ANTLR start "rule__Model__StructureElementsAssignment_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3200:1: rule__Model__StructureElementsAssignment_2 : ( ruleDCLStructureElement ) ;
    public final void rule__Model__StructureElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3204:1: ( ( ruleDCLStructureElement ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3205:1: ( ruleDCLStructureElement )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3205:1: ( ruleDCLStructureElement )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3206:1: ruleDCLStructureElement
            {
             before(grammarAccess.getModelAccess().getStructureElementsDCLStructureElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDCLStructureElement_in_rule__Model__StructureElementsAssignment_26428);
            ruleDCLStructureElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStructureElementsDCLStructureElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StructureElementsAssignment_2"


    // $ANTLR start "rule__Model__DCDeclAssignment_6"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3215:1: rule__Model__DCDeclAssignment_6 : ( ruleDCDecl ) ;
    public final void rule__Model__DCDeclAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3219:1: ( ( ruleDCDecl ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3220:1: ( ruleDCDecl )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3220:1: ( ruleDCDecl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3221:1: ruleDCDecl
            {
             before(grammarAccess.getModelAccess().getDCDeclDCDeclParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDCDecl_in_rule__Model__DCDeclAssignment_66459);
            ruleDCDecl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDCDeclDCDeclParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DCDeclAssignment_6"


    // $ANTLR start "rule__DCLLayer__NameAssignment_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3230:1: rule__DCLLayer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLLayer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3234:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3235:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3235:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3236:1: RULE_ID
            {
             before(grammarAccess.getDCLLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLLayer__NameAssignment_16490); 
             after(grammarAccess.getDCLLayerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__NameAssignment_1"


    // $ANTLR start "rule__DCLLayer__LevelAssignment_4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3245:1: rule__DCLLayer__LevelAssignment_4 : ( RULE_INT ) ;
    public final void rule__DCLLayer__LevelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3249:1: ( ( RULE_INT ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3250:1: ( RULE_INT )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3250:1: ( RULE_INT )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3251:1: RULE_INT
            {
             before(grammarAccess.getDCLLayerAccess().getLevelINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DCLLayer__LevelAssignment_46521); 
             after(grammarAccess.getDCLLayerAccess().getLevelINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__LevelAssignment_4"


    // $ANTLR start "rule__DCLLayer__LayerAssignment_5_0_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3260:1: rule__DCLLayer__LayerAssignment_5_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__DCLLayer__LayerAssignment_5_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3264:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3265:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3265:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3266:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLLayerAccess().getLayerDCLStructureElementCrossReference_5_0_2_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3267:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3268:1: RULE_ID
            {
             before(grammarAccess.getDCLLayerAccess().getLayerDCLStructureElementIDTerminalRuleCall_5_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLLayer__LayerAssignment_5_0_26556); 
             after(grammarAccess.getDCLLayerAccess().getLayerDCLStructureElementIDTerminalRuleCall_5_0_2_0_1()); 

            }

             after(grammarAccess.getDCLLayerAccess().getLayerDCLStructureElementCrossReference_5_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__LayerAssignment_5_0_2"


    // $ANTLR start "rule__DCLLayer__SubSystemAssignment_5_1_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3279:1: rule__DCLLayer__SubSystemAssignment_5_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__DCLLayer__SubSystemAssignment_5_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3283:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3284:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3284:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3285:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLLayerAccess().getSubSystemDCLStructureElementCrossReference_5_1_2_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3286:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3287:1: RULE_ID
            {
             before(grammarAccess.getDCLLayerAccess().getSubSystemDCLStructureElementIDTerminalRuleCall_5_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLLayer__SubSystemAssignment_5_1_26595); 
             after(grammarAccess.getDCLLayerAccess().getSubSystemDCLStructureElementIDTerminalRuleCall_5_1_2_0_1()); 

            }

             after(grammarAccess.getDCLLayerAccess().getSubSystemDCLStructureElementCrossReference_5_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__SubSystemAssignment_5_1_2"


    // $ANTLR start "rule__DCLLayer__ComponentAssignment_5_2_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3298:1: rule__DCLLayer__ComponentAssignment_5_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__DCLLayer__ComponentAssignment_5_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3302:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3303:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3303:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3304:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLLayerAccess().getComponentDCLStructureElementCrossReference_5_2_2_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3305:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3306:1: RULE_ID
            {
             before(grammarAccess.getDCLLayerAccess().getComponentDCLStructureElementIDTerminalRuleCall_5_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLLayer__ComponentAssignment_5_2_26634); 
             after(grammarAccess.getDCLLayerAccess().getComponentDCLStructureElementIDTerminalRuleCall_5_2_2_0_1()); 

            }

             after(grammarAccess.getDCLLayerAccess().getComponentDCLStructureElementCrossReference_5_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLLayer__ComponentAssignment_5_2_2"


    // $ANTLR start "rule__DCLComponent__NameAssignment_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3317:1: rule__DCLComponent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3321:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3322:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3322:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3323:1: RULE_ID
            {
             before(grammarAccess.getDCLComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLComponent__NameAssignment_16669); 
             after(grammarAccess.getDCLComponentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__NameAssignment_1"


    // $ANTLR start "rule__DCLComponent__LayerAssignment_2_0_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3332:1: rule__DCLComponent__LayerAssignment_2_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__DCLComponent__LayerAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3336:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3337:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3337:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3338:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLComponentAccess().getLayerDCLStructureElementCrossReference_2_0_2_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3339:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3340:1: RULE_ID
            {
             before(grammarAccess.getDCLComponentAccess().getLayerDCLStructureElementIDTerminalRuleCall_2_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLComponent__LayerAssignment_2_0_26704); 
             after(grammarAccess.getDCLComponentAccess().getLayerDCLStructureElementIDTerminalRuleCall_2_0_2_0_1()); 

            }

             after(grammarAccess.getDCLComponentAccess().getLayerDCLStructureElementCrossReference_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__LayerAssignment_2_0_2"


    // $ANTLR start "rule__DCLComponent__SubSystemAssignment_2_1_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3351:1: rule__DCLComponent__SubSystemAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__DCLComponent__SubSystemAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3355:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3356:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3356:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3357:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLComponentAccess().getSubSystemDCLStructureElementCrossReference_2_1_2_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3358:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3359:1: RULE_ID
            {
             before(grammarAccess.getDCLComponentAccess().getSubSystemDCLStructureElementIDTerminalRuleCall_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLComponent__SubSystemAssignment_2_1_26743); 
             after(grammarAccess.getDCLComponentAccess().getSubSystemDCLStructureElementIDTerminalRuleCall_2_1_2_0_1()); 

            }

             after(grammarAccess.getDCLComponentAccess().getSubSystemDCLStructureElementCrossReference_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponent__SubSystemAssignment_2_1_2"


    // $ANTLR start "rule__DCLComponentInterface__NameAssignment_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3370:1: rule__DCLComponentInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLComponentInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3374:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3375:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3375:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3376:1: RULE_ID
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLComponentInterface__NameAssignment_16778); 
             after(grammarAccess.getDCLComponentInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__NameAssignment_1"


    // $ANTLR start "rule__DCLComponentInterface__ComponentAssignment_3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3385:1: rule__DCLComponentInterface__ComponentAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DCLComponentInterface__ComponentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3389:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3390:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3390:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3391:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getComponentDCLStructureElementCrossReference_3_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3392:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3393:1: RULE_ID
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getComponentDCLStructureElementIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLComponentInterface__ComponentAssignment_36813); 
             after(grammarAccess.getDCLComponentInterfaceAccess().getComponentDCLStructureElementIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDCLComponentInterfaceAccess().getComponentDCLStructureElementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__ComponentAssignment_3"


    // $ANTLR start "rule__DCLComponentInterface__InterfaceTypeAssignment_4_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3404:1: rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 : ( ruleInterfaceType ) ;
    public final void rule__DCLComponentInterface__InterfaceTypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3408:1: ( ( ruleInterfaceType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3409:1: ( ruleInterfaceType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3409:1: ( ruleInterfaceType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3410:1: ruleInterfaceType
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeInterfaceTypeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleInterfaceType_in_rule__DCLComponentInterface__InterfaceTypeAssignment_4_26848);
            ruleInterfaceType();

            state._fsp--;

             after(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeInterfaceTypeParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLComponentInterface__InterfaceTypeAssignment_4_2"


    // $ANTLR start "rule__InterfaceType__InterfaceTypeNameAssignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3419:1: rule__InterfaceType__InterfaceTypeNameAssignment : ( ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 ) ) ;
    public final void rule__InterfaceType__InterfaceTypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3423:1: ( ( ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3424:1: ( ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3424:1: ( ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3425:1: ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 )
            {
             before(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameAlternatives_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3426:1: ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3426:2: rule__InterfaceType__InterfaceTypeNameAlternatives_0
            {
            pushFollow(FOLLOW_rule__InterfaceType__InterfaceTypeNameAlternatives_0_in_rule__InterfaceType__InterfaceTypeNameAssignment6879);
            rule__InterfaceType__InterfaceTypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceType__InterfaceTypeNameAssignment"


    // $ANTLR start "rule__DCLSubSystem__NameAssignment_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3435:1: rule__DCLSubSystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLSubSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3439:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3440:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3440:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3441:1: RULE_ID
            {
             before(grammarAccess.getDCLSubSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLSubSystem__NameAssignment_16912); 
             after(grammarAccess.getDCLSubSystemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLSubSystem__NameAssignment_1"


    // $ANTLR start "rule__DCLSubSystem__SubSystemAssignment_2_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3450:1: rule__DCLSubSystem__SubSystemAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__DCLSubSystem__SubSystemAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3454:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3455:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3455:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3456:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLSubSystemAccess().getSubSystemDCLStructureElementCrossReference_2_2_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3457:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3458:1: RULE_ID
            {
             before(grammarAccess.getDCLSubSystemAccess().getSubSystemDCLStructureElementIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLSubSystem__SubSystemAssignment_2_26947); 
             after(grammarAccess.getDCLSubSystemAccess().getSubSystemDCLStructureElementIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getDCLSubSystemAccess().getSubSystemDCLStructureElementCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLSubSystem__SubSystemAssignment_2_2"


    // $ANTLR start "rule__DCLModule__NameAssignment_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3469:1: rule__DCLModule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3473:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3474:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3474:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3475:1: RULE_ID
            {
             before(grammarAccess.getDCLModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLModule__NameAssignment_16982); 
             after(grammarAccess.getDCLModuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCLModule__NameAssignment_1"


    // $ANTLR start "rule__DCDecl__OnlyAssignment_0_0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3484:1: rule__DCDecl__OnlyAssignment_0_0 : ( ruleOnly ) ;
    public final void rule__DCDecl__OnlyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3488:1: ( ( ruleOnly ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3489:1: ( ruleOnly )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3489:1: ( ruleOnly )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3490:1: ruleOnly
            {
             before(grammarAccess.getDCDeclAccess().getOnlyOnlyParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleOnly_in_rule__DCDecl__OnlyAssignment_0_07013);
            ruleOnly();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getOnlyOnlyParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__OnlyAssignment_0_0"


    // $ANTLR start "rule__DCDecl__TAssignment_0_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3499:1: rule__DCDecl__TAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3503:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3504:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3504:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3505:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_0_1_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3506:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3507:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_0_17048); 
             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__TAssignment_0_1"


    // $ANTLR start "rule__DCDecl__CanAssignment_0_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3518:1: rule__DCDecl__CanAssignment_0_2 : ( ruleCan ) ;
    public final void rule__DCDecl__CanAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3522:1: ( ( ruleCan ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3523:1: ( ruleCan )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3523:1: ( ruleCan )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3524:1: ruleCan
            {
             before(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleCan_in_rule__DCDecl__CanAssignment_0_27083);
            ruleCan();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__CanAssignment_0_2"


    // $ANTLR start "rule__DCDecl__ElementTypeAssignment_0_3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3533:1: rule__DCDecl__ElementTypeAssignment_0_3 : ( ruleElementType ) ;
    public final void rule__DCDecl__ElementTypeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3537:1: ( ( ruleElementType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3538:1: ( ruleElementType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3538:1: ( ruleElementType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3539:1: ruleElementType
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_0_37114);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__ElementTypeAssignment_0_3"


    // $ANTLR start "rule__DCDecl__TypeAssignment_0_4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3548:1: rule__DCDecl__TypeAssignment_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3552:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3553:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3553:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3554:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_0_4_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3555:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3556:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_0_47149); 
             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_0_4_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__TypeAssignment_0_4"


    // $ANTLR start "rule__DCDecl__TAssignment_1_0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3567:1: rule__DCDecl__TAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3571:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3572:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3572:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3573:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_1_0_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3574:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3575:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_1_07188); 
             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__TAssignment_1_0"


    // $ANTLR start "rule__DCDecl__CannotAssignment_1_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3586:1: rule__DCDecl__CannotAssignment_1_1 : ( ruleCannot ) ;
    public final void rule__DCDecl__CannotAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3590:1: ( ( ruleCannot ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3591:1: ( ruleCannot )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3591:1: ( ruleCannot )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3592:1: ruleCannot
            {
             before(grammarAccess.getDCDeclAccess().getCannotCannotParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCannot_in_rule__DCDecl__CannotAssignment_1_17223);
            ruleCannot();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getCannotCannotParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__CannotAssignment_1_1"


    // $ANTLR start "rule__DCDecl__ElementTypeAssignment_1_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3601:1: rule__DCDecl__ElementTypeAssignment_1_2 : ( ruleElementType ) ;
    public final void rule__DCDecl__ElementTypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3605:1: ( ( ruleElementType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3606:1: ( ruleElementType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3606:1: ( ruleElementType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3607:1: ruleElementType
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_1_27254);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__ElementTypeAssignment_1_2"


    // $ANTLR start "rule__DCDecl__TypeAssignment_1_3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3616:1: rule__DCDecl__TypeAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3620:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3621:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3621:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3622:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_1_3_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3623:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3624:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_1_37289); 
             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__TypeAssignment_1_3"


    // $ANTLR start "rule__DCDecl__TAssignment_2_0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3635:1: rule__DCDecl__TAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3639:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3640:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3640:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3641:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_2_0_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3642:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3643:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_2_07328); 
             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__TAssignment_2_0"


    // $ANTLR start "rule__DCDecl__CanAssignment_2_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3654:1: rule__DCDecl__CanAssignment_2_1 : ( ruleCan ) ;
    public final void rule__DCDecl__CanAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3658:1: ( ( ruleCan ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3659:1: ( ruleCan )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3659:1: ( ruleCan )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3660:1: ruleCan
            {
             before(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleCan_in_rule__DCDecl__CanAssignment_2_17363);
            ruleCan();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__CanAssignment_2_1"


    // $ANTLR start "rule__DCDecl__ElementTypeAssignment_2_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3669:1: rule__DCDecl__ElementTypeAssignment_2_2 : ( ruleElementType ) ;
    public final void rule__DCDecl__ElementTypeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3673:1: ( ( ruleElementType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3674:1: ( ruleElementType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3674:1: ( ruleElementType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3675:1: ruleElementType
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_2_27394);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__ElementTypeAssignment_2_2"


    // $ANTLR start "rule__DCDecl__Only2Assignment_2_3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3684:1: rule__DCDecl__Only2Assignment_2_3 : ( ruleOnly2 ) ;
    public final void rule__DCDecl__Only2Assignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3688:1: ( ( ruleOnly2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3689:1: ( ruleOnly2 )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3689:1: ( ruleOnly2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3690:1: ruleOnly2
            {
             before(grammarAccess.getDCDeclAccess().getOnly2Only2ParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleOnly2_in_rule__DCDecl__Only2Assignment_2_37425);
            ruleOnly2();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getOnly2Only2ParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__Only2Assignment_2_3"


    // $ANTLR start "rule__DCDecl__TypeAssignment_2_4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3699:1: rule__DCDecl__TypeAssignment_2_4 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3703:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3704:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3704:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3705:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_2_4_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3706:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3707:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_2_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_2_47460); 
             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_2_4_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__TypeAssignment_2_4"


    // $ANTLR start "rule__DCDecl__TAssignment_3_0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3718:1: rule__DCDecl__TAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3722:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3723:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3723:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3724:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_3_0_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3725:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3726:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_3_07499); 
             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__TAssignment_3_0"


    // $ANTLR start "rule__DCDecl__MustAssignment_3_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3737:1: rule__DCDecl__MustAssignment_3_1 : ( ruleMust ) ;
    public final void rule__DCDecl__MustAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3741:1: ( ( ruleMust ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3742:1: ( ruleMust )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3742:1: ( ruleMust )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3743:1: ruleMust
            {
             before(grammarAccess.getDCDeclAccess().getMustMustParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleMust_in_rule__DCDecl__MustAssignment_3_17534);
            ruleMust();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getMustMustParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__MustAssignment_3_1"


    // $ANTLR start "rule__DCDecl__EntityTypeAssignment_3_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3752:1: rule__DCDecl__EntityTypeAssignment_3_2 : ( ruleEntityType ) ;
    public final void rule__DCDecl__EntityTypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3756:1: ( ( ruleEntityType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3757:1: ( ruleEntityType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3757:1: ( ruleEntityType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3758:1: ruleEntityType
            {
             before(grammarAccess.getDCDeclAccess().getEntityTypeEntityTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleEntityType_in_rule__DCDecl__EntityTypeAssignment_3_27565);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getEntityTypeEntityTypeParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__EntityTypeAssignment_3_2"


    // $ANTLR start "rule__DCDecl__TypeAssignment_3_3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3767:1: rule__DCDecl__TypeAssignment_3_3 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3771:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3772:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3772:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3773:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_3_3_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3774:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3775:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_3_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_3_37600); 
             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_3_3_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCDecl__TypeAssignment_3_3"


    // $ANTLR start "rule__Only__OnlyAssignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3786:1: rule__Only__OnlyAssignment : ( ( 'only' ) ) ;
    public final void rule__Only__OnlyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3790:1: ( ( ( 'only' ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3791:1: ( ( 'only' ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3791:1: ( ( 'only' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3792:1: ( 'only' )
            {
             before(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3793:1: ( 'only' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3794:1: 'only'
            {
             before(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Only__OnlyAssignment7640); 
             after(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0()); 

            }

             after(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Only__OnlyAssignment"


    // $ANTLR start "rule__Can__CanAssignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3809:1: rule__Can__CanAssignment : ( ( 'can-' ) ) ;
    public final void rule__Can__CanAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3813:1: ( ( ( 'can-' ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3814:1: ( ( 'can-' ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3814:1: ( ( 'can-' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3815:1: ( 'can-' )
            {
             before(grammarAccess.getCanAccess().getCanCanKeyword_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3816:1: ( 'can-' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3817:1: 'can-'
            {
             before(grammarAccess.getCanAccess().getCanCanKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Can__CanAssignment7684); 
             after(grammarAccess.getCanAccess().getCanCanKeyword_0()); 

            }

             after(grammarAccess.getCanAccess().getCanCanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Can__CanAssignment"


    // $ANTLR start "rule__Cannot__CannotAssignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3832:1: rule__Cannot__CannotAssignment : ( ( 'cannot-' ) ) ;
    public final void rule__Cannot__CannotAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3836:1: ( ( ( 'cannot-' ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3837:1: ( ( 'cannot-' ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3837:1: ( ( 'cannot-' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3838:1: ( 'cannot-' )
            {
             before(grammarAccess.getCannotAccess().getCannotCannotKeyword_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3839:1: ( 'cannot-' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3840:1: 'cannot-'
            {
             before(grammarAccess.getCannotAccess().getCannotCannotKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Cannot__CannotAssignment7728); 
             after(grammarAccess.getCannotAccess().getCannotCannotKeyword_0()); 

            }

             after(grammarAccess.getCannotAccess().getCannotCannotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cannot__CannotAssignment"


    // $ANTLR start "rule__Only2__Only2Assignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3855:1: rule__Only2__Only2Assignment : ( ( '-only' ) ) ;
    public final void rule__Only2__Only2Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3859:1: ( ( ( '-only' ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3860:1: ( ( '-only' ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3860:1: ( ( '-only' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3861:1: ( '-only' )
            {
             before(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3862:1: ( '-only' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3863:1: '-only'
            {
             before(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Only2__Only2Assignment7772); 
             after(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0()); 

            }

             after(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Only2__Only2Assignment"


    // $ANTLR start "rule__Must__MustAssignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3878:1: rule__Must__MustAssignment : ( ( 'must-' ) ) ;
    public final void rule__Must__MustAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3882:1: ( ( ( 'must-' ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3883:1: ( ( 'must-' ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3883:1: ( ( 'must-' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3884:1: ( 'must-' )
            {
             before(grammarAccess.getMustAccess().getMustMustKeyword_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3885:1: ( 'must-' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3886:1: 'must-'
            {
             before(grammarAccess.getMustAccess().getMustMustKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Must__MustAssignment7816); 
             after(grammarAccess.getMustAccess().getMustMustKeyword_0()); 

            }

             after(grammarAccess.getMustAccess().getMustMustKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Must__MustAssignment"


    // $ANTLR start "rule__BasicType__TypeNameAssignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3901:1: rule__BasicType__TypeNameAssignment : ( ( rule__BasicType__TypeNameAlternatives_0 ) ) ;
    public final void rule__BasicType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3905:1: ( ( ( rule__BasicType__TypeNameAlternatives_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3906:1: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3906:1: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3907:1: ( rule__BasicType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3908:1: ( rule__BasicType__TypeNameAlternatives_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3908:2: rule__BasicType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_rule__BasicType__TypeNameAlternatives_0_in_rule__BasicType__TypeNameAssignment7855);
            rule__BasicType__TypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__TypeNameAssignment"


    // $ANTLR start "rule__EntityType__EntityAssignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3917:1: rule__EntityType__EntityAssignment : ( ( rule__EntityType__EntityAlternatives_0 ) ) ;
    public final void rule__EntityType__EntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3921:1: ( ( ( rule__EntityType__EntityAlternatives_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3922:1: ( ( rule__EntityType__EntityAlternatives_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3922:1: ( ( rule__EntityType__EntityAlternatives_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3923:1: ( rule__EntityType__EntityAlternatives_0 )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityAlternatives_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3924:1: ( rule__EntityType__EntityAlternatives_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3924:2: rule__EntityType__EntityAlternatives_0
            {
            pushFollow(FOLLOW_rule__EntityType__EntityAlternatives_0_in_rule__EntityType__EntityAssignment7888);
            rule__EntityType__EntityAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getEntityAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__EntityAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLStructureElement_in_entryRuleDCLStructureElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLStructureElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLStructureElement__Alternatives_in_ruleDCLStructureElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLLayer_in_entryRuleDCLLayer181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLLayer188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__0_in_ruleDCLLayer214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLComponent_in_entryRuleDCLComponent241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLComponent248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__0_in_ruleDCLComponent274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLComponentInterface_in_entryRuleDCLComponentInterface301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLComponentInterface308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__0_in_ruleDCLComponentInterface334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceType_in_entryRuleInterfaceType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceType__InterfaceTypeNameAssignment_in_ruleInterfaceType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLSubSystem_in_entryRuleDCLSubSystem421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLSubSystem428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__0_in_ruleDCLSubSystem454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLModule_in_entryRuleDCLModule481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLModule488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLModule__Group__0_in_ruleDCLModule514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCDecl_in_entryRuleDCDecl541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCDecl548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Alternatives_in_ruleDCDecl574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly_in_entryRuleOnly601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnly608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Only__OnlyAssignment_in_ruleOnly634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCan_in_entryRuleCan661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCan668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Can__CanAssignment_in_ruleCan694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCannot_in_entryRuleCannot721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCannot728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cannot__CannotAssignment_in_ruleCannot754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly2_in_entryRuleOnly2781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnly2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Only2__Only2Assignment_in_ruleOnly2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMust_in_entryRuleMust841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMust848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Must__MustAssignment_in_ruleMust874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_entryRuleElementType901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementType908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementType__Alternatives_in_ruleElementType934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicType__TypeNameAssignment_in_ruleBasicType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__EntityAssignment_in_ruleEntityType1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLLayer_in_rule__DCLStructureElement__Alternatives1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLComponent_in_rule__DCLStructureElement__Alternatives1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLSubSystem_in_rule__DCLStructureElement__Alternatives1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLModule_in_rule__DCLStructureElement__Alternatives1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLComponentInterface_in_rule__DCLStructureElement__Alternatives1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_0__0_in_rule__DCLLayer__Alternatives_51190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_1__0_in_rule__DCLLayer__Alternatives_51208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_2__0_in_rule__DCLLayer__Alternatives_51226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_0__0_in_rule__DCLComponent__Alternatives_21259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_1__0_in_rule__DCLComponent__Alternatives_21277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__InterfaceType__InterfaceTypeNameAlternatives_01311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__InterfaceType__InterfaceTypeNameAlternatives_01331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__0_in_rule__DCDecl__Alternatives1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__0_in_rule__DCDecl__Alternatives1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__0_in_rule__DCDecl__Alternatives1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__0_in_rule__DCDecl__Alternatives1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_rule__ElementType__Alternatives1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__ElementType__Alternatives1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BasicType__TypeNameAlternatives_01502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BasicType__TypeNameAlternatives_01522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BasicType__TypeNameAlternatives_01542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BasicType__TypeNameAlternatives_01562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BasicType__TypeNameAlternatives_01582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EntityType__EntityAlternatives_01617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EntityType__EntityAlternatives_01637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EntityType__EntityAlternatives_01657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EntityType__EntityAlternatives_01677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EntityType__EntityAlternatives_01697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01729 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Model__Group__0__Impl1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11791 = new BitSet(new long[]{0x000000CC08000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Model__Group__1__Impl1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21853 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StructureElementsAssignment_2_in_rule__Model__Group__2__Impl1885 = new BitSet(new long[]{0x000000CC08000002L});
    public static final BitSet FOLLOW_rule__Model__StructureElementsAssignment_2_in_rule__Model__Group__2__Impl1897 = new BitSet(new long[]{0x000000CC08000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31930 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group__3__Impl1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41992 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Model__Group__4__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52054 = new BitSet(new long[]{0x0000010002000010L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__52057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Model__Group__5__Impl2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62116 = new BitSet(new long[]{0x0000010002000010L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DCDeclAssignment_6_in_rule__Model__Group__6__Impl2146 = new BitSet(new long[]{0x0000010000000012L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group__7__Impl2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__0__Impl_in_rule__DCLLayer__Group__02252 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__1_in_rule__DCLLayer__Group__02255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DCLLayer__Group__0__Impl2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__1__Impl_in_rule__DCLLayer__Group__12314 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__2_in_rule__DCLLayer__Group__12317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__NameAssignment_1_in_rule__DCLLayer__Group__1__Impl2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__2__Impl_in_rule__DCLLayer__Group__22374 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__3_in_rule__DCLLayer__Group__22377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DCLLayer__Group__2__Impl2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__3__Impl_in_rule__DCLLayer__Group__32436 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__4_in_rule__DCLLayer__Group__32439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DCLLayer__Group__3__Impl2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__4__Impl_in_rule__DCLLayer__Group__42498 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__5_in_rule__DCLLayer__Group__42501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__LevelAssignment_4_in_rule__DCLLayer__Group__4__Impl2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__5__Impl_in_rule__DCLLayer__Group__52558 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__6_in_rule__DCLLayer__Group__52561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Alternatives_5_in_rule__DCLLayer__Group__5__Impl2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__6__Impl_in_rule__DCLLayer__Group__62619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCLLayer__Group__6__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_0__0__Impl_in_rule__DCLLayer__Group_5_0__02692 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_0__1_in_rule__DCLLayer__Group_5_0__02695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DCLLayer__Group_5_0__0__Impl2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_0__1__Impl_in_rule__DCLLayer__Group_5_0__12754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_0__2_in_rule__DCLLayer__Group_5_0__12757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DCLLayer__Group_5_0__1__Impl2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_0__2__Impl_in_rule__DCLLayer__Group_5_0__22816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__LayerAssignment_5_0_2_in_rule__DCLLayer__Group_5_0__2__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_1__0__Impl_in_rule__DCLLayer__Group_5_1__02879 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_1__1_in_rule__DCLLayer__Group_5_1__02882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DCLLayer__Group_5_1__0__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_1__1__Impl_in_rule__DCLLayer__Group_5_1__12941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_1__2_in_rule__DCLLayer__Group_5_1__12944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DCLLayer__Group_5_1__1__Impl2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_1__2__Impl_in_rule__DCLLayer__Group_5_1__23003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__SubSystemAssignment_5_1_2_in_rule__DCLLayer__Group_5_1__2__Impl3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_2__0__Impl_in_rule__DCLLayer__Group_5_2__03066 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_2__1_in_rule__DCLLayer__Group_5_2__03069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DCLLayer__Group_5_2__0__Impl3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_2__1__Impl_in_rule__DCLLayer__Group_5_2__13128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_2__2_in_rule__DCLLayer__Group_5_2__13131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DCLLayer__Group_5_2__1__Impl3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5_2__2__Impl_in_rule__DCLLayer__Group_5_2__23190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__ComponentAssignment_5_2_2_in_rule__DCLLayer__Group_5_2__2__Impl3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__0__Impl_in_rule__DCLComponent__Group__03253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__1_in_rule__DCLComponent__Group__03256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DCLComponent__Group__0__Impl3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__1__Impl_in_rule__DCLComponent__Group__13315 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__2_in_rule__DCLComponent__Group__13318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__NameAssignment_1_in_rule__DCLComponent__Group__1__Impl3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__2__Impl_in_rule__DCLComponent__Group__23375 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__3_in_rule__DCLComponent__Group__23378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Alternatives_2_in_rule__DCLComponent__Group__2__Impl3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__3__Impl_in_rule__DCLComponent__Group__33436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCLComponent__Group__3__Impl3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_0__0__Impl_in_rule__DCLComponent__Group_2_0__03503 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_0__1_in_rule__DCLComponent__Group_2_0__03506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DCLComponent__Group_2_0__0__Impl3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_0__1__Impl_in_rule__DCLComponent__Group_2_0__13565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_0__2_in_rule__DCLComponent__Group_2_0__13568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DCLComponent__Group_2_0__1__Impl3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_0__2__Impl_in_rule__DCLComponent__Group_2_0__23627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__LayerAssignment_2_0_2_in_rule__DCLComponent__Group_2_0__2__Impl3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_1__0__Impl_in_rule__DCLComponent__Group_2_1__03690 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_1__1_in_rule__DCLComponent__Group_2_1__03693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DCLComponent__Group_2_1__0__Impl3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_1__1__Impl_in_rule__DCLComponent__Group_2_1__13752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_1__2_in_rule__DCLComponent__Group_2_1__13755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DCLComponent__Group_2_1__1__Impl3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_1__2__Impl_in_rule__DCLComponent__Group_2_1__23814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__SubSystemAssignment_2_1_2_in_rule__DCLComponent__Group_2_1__2__Impl3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__0__Impl_in_rule__DCLComponentInterface__Group__03877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__1_in_rule__DCLComponentInterface__Group__03880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DCLComponentInterface__Group__0__Impl3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__1__Impl_in_rule__DCLComponentInterface__Group__13939 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__2_in_rule__DCLComponentInterface__Group__13942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__NameAssignment_1_in_rule__DCLComponentInterface__Group__1__Impl3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__2__Impl_in_rule__DCLComponentInterface__Group__23999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__3_in_rule__DCLComponentInterface__Group__24002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DCLComponentInterface__Group__2__Impl4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__3__Impl_in_rule__DCLComponentInterface__Group__34061 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__4_in_rule__DCLComponentInterface__Group__34064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__ComponentAssignment_3_in_rule__DCLComponentInterface__Group__3__Impl4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__4__Impl_in_rule__DCLComponentInterface__Group__44121 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__5_in_rule__DCLComponentInterface__Group__44124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group_4__0_in_rule__DCLComponentInterface__Group__4__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__5__Impl_in_rule__DCLComponentInterface__Group__54181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCLComponentInterface__Group__5__Impl4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group_4__0__Impl_in_rule__DCLComponentInterface__Group_4__04252 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group_4__1_in_rule__DCLComponentInterface__Group_4__04255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DCLComponentInterface__Group_4__0__Impl4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group_4__1__Impl_in_rule__DCLComponentInterface__Group_4__14314 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group_4__2_in_rule__DCLComponentInterface__Group_4__14317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__DCLComponentInterface__Group_4__1__Impl4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group_4__2__Impl_in_rule__DCLComponentInterface__Group_4__24376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__InterfaceTypeAssignment_4_2_in_rule__DCLComponentInterface__Group_4__2__Impl4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__0__Impl_in_rule__DCLSubSystem__Group__04439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__1_in_rule__DCLSubSystem__Group__04442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DCLSubSystem__Group__0__Impl4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__1__Impl_in_rule__DCLSubSystem__Group__14501 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__2_in_rule__DCLSubSystem__Group__14504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__NameAssignment_1_in_rule__DCLSubSystem__Group__1__Impl4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__2__Impl_in_rule__DCLSubSystem__Group__24561 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__3_in_rule__DCLSubSystem__Group__24564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group_2__0_in_rule__DCLSubSystem__Group__2__Impl4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__3__Impl_in_rule__DCLSubSystem__Group__34622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCLSubSystem__Group__3__Impl4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group_2__0__Impl_in_rule__DCLSubSystem__Group_2__04689 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group_2__1_in_rule__DCLSubSystem__Group_2__04692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DCLSubSystem__Group_2__0__Impl4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group_2__1__Impl_in_rule__DCLSubSystem__Group_2__14751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group_2__2_in_rule__DCLSubSystem__Group_2__14754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DCLSubSystem__Group_2__1__Impl4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group_2__2__Impl_in_rule__DCLSubSystem__Group_2__24813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__SubSystemAssignment_2_2_in_rule__DCLSubSystem__Group_2__2__Impl4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLModule__Group__0__Impl_in_rule__DCLModule__Group__04876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLModule__Group__1_in_rule__DCLModule__Group__04879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__DCLModule__Group__0__Impl4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLModule__Group__1__Impl_in_rule__DCLModule__Group__14938 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DCLModule__Group__2_in_rule__DCLModule__Group__14941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLModule__NameAssignment_1_in_rule__DCLModule__Group__1__Impl4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLModule__Group__2__Impl_in_rule__DCLModule__Group__24998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCLModule__Group__2__Impl5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__0__Impl_in_rule__DCDecl__Group_0__05063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__1_in_rule__DCDecl__Group_0__05066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__OnlyAssignment_0_0_in_rule__DCDecl__Group_0__0__Impl5093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__1__Impl_in_rule__DCDecl__Group_0__15123 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__2_in_rule__DCDecl__Group_0__15126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TAssignment_0_1_in_rule__DCDecl__Group_0__1__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__2__Impl_in_rule__DCDecl__Group_0__25183 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__3_in_rule__DCDecl__Group_0__25186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__CanAssignment_0_2_in_rule__DCDecl__Group_0__2__Impl5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__3__Impl_in_rule__DCDecl__Group_0__35243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__4_in_rule__DCDecl__Group_0__35246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__ElementTypeAssignment_0_3_in_rule__DCDecl__Group_0__3__Impl5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__4__Impl_in_rule__DCDecl__Group_0__45303 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__5_in_rule__DCDecl__Group_0__45306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TypeAssignment_0_4_in_rule__DCDecl__Group_0__4__Impl5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__5__Impl_in_rule__DCDecl__Group_0__55363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCDecl__Group_0__5__Impl5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__0__Impl_in_rule__DCDecl__Group_1__05434 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__1_in_rule__DCDecl__Group_1__05437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TAssignment_1_0_in_rule__DCDecl__Group_1__0__Impl5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__1__Impl_in_rule__DCDecl__Group_1__15494 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__2_in_rule__DCDecl__Group_1__15497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__CannotAssignment_1_1_in_rule__DCDecl__Group_1__1__Impl5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__2__Impl_in_rule__DCDecl__Group_1__25554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__3_in_rule__DCDecl__Group_1__25557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__ElementTypeAssignment_1_2_in_rule__DCDecl__Group_1__2__Impl5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__3__Impl_in_rule__DCDecl__Group_1__35614 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__4_in_rule__DCDecl__Group_1__35617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TypeAssignment_1_3_in_rule__DCDecl__Group_1__3__Impl5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__4__Impl_in_rule__DCDecl__Group_1__45674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCDecl__Group_1__4__Impl5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__0__Impl_in_rule__DCDecl__Group_2__05743 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__1_in_rule__DCDecl__Group_2__05746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TAssignment_2_0_in_rule__DCDecl__Group_2__0__Impl5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__1__Impl_in_rule__DCDecl__Group_2__15803 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__2_in_rule__DCDecl__Group_2__15806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__CanAssignment_2_1_in_rule__DCDecl__Group_2__1__Impl5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__2__Impl_in_rule__DCDecl__Group_2__25863 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__3_in_rule__DCDecl__Group_2__25866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__ElementTypeAssignment_2_2_in_rule__DCDecl__Group_2__2__Impl5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__3__Impl_in_rule__DCDecl__Group_2__35923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__4_in_rule__DCDecl__Group_2__35926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Only2Assignment_2_3_in_rule__DCDecl__Group_2__3__Impl5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__4__Impl_in_rule__DCDecl__Group_2__45983 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__5_in_rule__DCDecl__Group_2__45986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TypeAssignment_2_4_in_rule__DCDecl__Group_2__4__Impl6013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__5__Impl_in_rule__DCDecl__Group_2__56043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCDecl__Group_2__5__Impl6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__0__Impl_in_rule__DCDecl__Group_3__06114 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__1_in_rule__DCDecl__Group_3__06117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TAssignment_3_0_in_rule__DCDecl__Group_3__0__Impl6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__1__Impl_in_rule__DCDecl__Group_3__16174 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__2_in_rule__DCDecl__Group_3__16177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__MustAssignment_3_1_in_rule__DCDecl__Group_3__1__Impl6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__2__Impl_in_rule__DCDecl__Group_3__26234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__3_in_rule__DCDecl__Group_3__26237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__EntityTypeAssignment_3_2_in_rule__DCDecl__Group_3__2__Impl6264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__3__Impl_in_rule__DCDecl__Group_3__36294 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__4_in_rule__DCDecl__Group_3__36297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TypeAssignment_3_3_in_rule__DCDecl__Group_3__3__Impl6324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__4__Impl_in_rule__DCDecl__Group_3__46354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCDecl__Group_3__4__Impl6382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLStructureElement_in_rule__Model__StructureElementsAssignment_26428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCDecl_in_rule__Model__DCDeclAssignment_66459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLLayer__NameAssignment_16490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DCLLayer__LevelAssignment_46521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLLayer__LayerAssignment_5_0_26556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLLayer__SubSystemAssignment_5_1_26595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLLayer__ComponentAssignment_5_2_26634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLComponent__NameAssignment_16669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLComponent__LayerAssignment_2_0_26704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLComponent__SubSystemAssignment_2_1_26743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLComponentInterface__NameAssignment_16778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLComponentInterface__ComponentAssignment_36813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceType_in_rule__DCLComponentInterface__InterfaceTypeAssignment_4_26848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceType__InterfaceTypeNameAlternatives_0_in_rule__InterfaceType__InterfaceTypeNameAssignment6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLSubSystem__NameAssignment_16912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLSubSystem__SubSystemAssignment_2_26947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLModule__NameAssignment_16982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly_in_rule__DCDecl__OnlyAssignment_0_07013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_0_17048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCan_in_rule__DCDecl__CanAssignment_0_27083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_0_37114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_0_47149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_1_07188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCannot_in_rule__DCDecl__CannotAssignment_1_17223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_1_27254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_1_37289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_2_07328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCan_in_rule__DCDecl__CanAssignment_2_17363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_2_27394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly2_in_rule__DCDecl__Only2Assignment_2_37425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_2_47460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_3_07499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMust_in_rule__DCDecl__MustAssignment_3_17534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__DCDecl__EntityTypeAssignment_3_27565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_3_37600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Only__OnlyAssignment7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Can__CanAssignment7684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Cannot__CannotAssignment7728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Only2__Only2Assignment7772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Must__MustAssignment7816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicType__TypeNameAlternatives_0_in_rule__BasicType__TypeNameAssignment7855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__EntityAlternatives_0_in_rule__EntityType__EntityAssignment7888 = new BitSet(new long[]{0x0000000000000002L});

}