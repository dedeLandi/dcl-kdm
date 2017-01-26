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
    // InternalDCL.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDCL.g:61:1: ( ruleModel EOF )
            // InternalDCL.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalDCL.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // InternalDCL.g:74:1: ( ( rule__Model__Group__0 ) )
            // InternalDCL.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDCL.g:76:1: ( rule__Model__Group__0 )
            // InternalDCL.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:88:1: entryRuleDCLStructureElement : ruleDCLStructureElement EOF ;
    public final void entryRuleDCLStructureElement() throws RecognitionException {
        try {
            // InternalDCL.g:89:1: ( ruleDCLStructureElement EOF )
            // InternalDCL.g:90:1: ruleDCLStructureElement EOF
            {
             before(grammarAccess.getDCLStructureElementRule()); 
            pushFollow(FOLLOW_1);
            ruleDCLStructureElement();

            state._fsp--;

             after(grammarAccess.getDCLStructureElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:97:1: ruleDCLStructureElement : ( ( rule__DCLStructureElement__Alternatives ) ) ;
    public final void ruleDCLStructureElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:101:2: ( ( ( rule__DCLStructureElement__Alternatives ) ) )
            // InternalDCL.g:102:1: ( ( rule__DCLStructureElement__Alternatives ) )
            {
            // InternalDCL.g:102:1: ( ( rule__DCLStructureElement__Alternatives ) )
            // InternalDCL.g:103:1: ( rule__DCLStructureElement__Alternatives )
            {
             before(grammarAccess.getDCLStructureElementAccess().getAlternatives()); 
            // InternalDCL.g:104:1: ( rule__DCLStructureElement__Alternatives )
            // InternalDCL.g:104:2: rule__DCLStructureElement__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:116:1: entryRuleDCLLayer : ruleDCLLayer EOF ;
    public final void entryRuleDCLLayer() throws RecognitionException {
        try {
            // InternalDCL.g:117:1: ( ruleDCLLayer EOF )
            // InternalDCL.g:118:1: ruleDCLLayer EOF
            {
             before(grammarAccess.getDCLLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleDCLLayer();

            state._fsp--;

             after(grammarAccess.getDCLLayerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:125:1: ruleDCLLayer : ( ( rule__DCLLayer__Group__0 ) ) ;
    public final void ruleDCLLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:129:2: ( ( ( rule__DCLLayer__Group__0 ) ) )
            // InternalDCL.g:130:1: ( ( rule__DCLLayer__Group__0 ) )
            {
            // InternalDCL.g:130:1: ( ( rule__DCLLayer__Group__0 ) )
            // InternalDCL.g:131:1: ( rule__DCLLayer__Group__0 )
            {
             before(grammarAccess.getDCLLayerAccess().getGroup()); 
            // InternalDCL.g:132:1: ( rule__DCLLayer__Group__0 )
            // InternalDCL.g:132:2: rule__DCLLayer__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:144:1: entryRuleDCLComponent : ruleDCLComponent EOF ;
    public final void entryRuleDCLComponent() throws RecognitionException {
        try {
            // InternalDCL.g:145:1: ( ruleDCLComponent EOF )
            // InternalDCL.g:146:1: ruleDCLComponent EOF
            {
             before(grammarAccess.getDCLComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleDCLComponent();

            state._fsp--;

             after(grammarAccess.getDCLComponentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:153:1: ruleDCLComponent : ( ( rule__DCLComponent__Group__0 ) ) ;
    public final void ruleDCLComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:157:2: ( ( ( rule__DCLComponent__Group__0 ) ) )
            // InternalDCL.g:158:1: ( ( rule__DCLComponent__Group__0 ) )
            {
            // InternalDCL.g:158:1: ( ( rule__DCLComponent__Group__0 ) )
            // InternalDCL.g:159:1: ( rule__DCLComponent__Group__0 )
            {
             before(grammarAccess.getDCLComponentAccess().getGroup()); 
            // InternalDCL.g:160:1: ( rule__DCLComponent__Group__0 )
            // InternalDCL.g:160:2: rule__DCLComponent__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:172:1: entryRuleDCLComponentInterface : ruleDCLComponentInterface EOF ;
    public final void entryRuleDCLComponentInterface() throws RecognitionException {
        try {
            // InternalDCL.g:173:1: ( ruleDCLComponentInterface EOF )
            // InternalDCL.g:174:1: ruleDCLComponentInterface EOF
            {
             before(grammarAccess.getDCLComponentInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleDCLComponentInterface();

            state._fsp--;

             after(grammarAccess.getDCLComponentInterfaceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:181:1: ruleDCLComponentInterface : ( ( rule__DCLComponentInterface__Group__0 ) ) ;
    public final void ruleDCLComponentInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:185:2: ( ( ( rule__DCLComponentInterface__Group__0 ) ) )
            // InternalDCL.g:186:1: ( ( rule__DCLComponentInterface__Group__0 ) )
            {
            // InternalDCL.g:186:1: ( ( rule__DCLComponentInterface__Group__0 ) )
            // InternalDCL.g:187:1: ( rule__DCLComponentInterface__Group__0 )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getGroup()); 
            // InternalDCL.g:188:1: ( rule__DCLComponentInterface__Group__0 )
            // InternalDCL.g:188:2: rule__DCLComponentInterface__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:200:1: entryRuleInterfaceType : ruleInterfaceType EOF ;
    public final void entryRuleInterfaceType() throws RecognitionException {
        try {
            // InternalDCL.g:201:1: ( ruleInterfaceType EOF )
            // InternalDCL.g:202:1: ruleInterfaceType EOF
            {
             before(grammarAccess.getInterfaceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfaceType();

            state._fsp--;

             after(grammarAccess.getInterfaceTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:209:1: ruleInterfaceType : ( ( rule__InterfaceType__InterfaceTypeNameAssignment ) ) ;
    public final void ruleInterfaceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:213:2: ( ( ( rule__InterfaceType__InterfaceTypeNameAssignment ) ) )
            // InternalDCL.g:214:1: ( ( rule__InterfaceType__InterfaceTypeNameAssignment ) )
            {
            // InternalDCL.g:214:1: ( ( rule__InterfaceType__InterfaceTypeNameAssignment ) )
            // InternalDCL.g:215:1: ( rule__InterfaceType__InterfaceTypeNameAssignment )
            {
             before(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameAssignment()); 
            // InternalDCL.g:216:1: ( rule__InterfaceType__InterfaceTypeNameAssignment )
            // InternalDCL.g:216:2: rule__InterfaceType__InterfaceTypeNameAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:228:1: entryRuleDCLSubSystem : ruleDCLSubSystem EOF ;
    public final void entryRuleDCLSubSystem() throws RecognitionException {
        try {
            // InternalDCL.g:229:1: ( ruleDCLSubSystem EOF )
            // InternalDCL.g:230:1: ruleDCLSubSystem EOF
            {
             before(grammarAccess.getDCLSubSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleDCLSubSystem();

            state._fsp--;

             after(grammarAccess.getDCLSubSystemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:237:1: ruleDCLSubSystem : ( ( rule__DCLSubSystem__Group__0 ) ) ;
    public final void ruleDCLSubSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:241:2: ( ( ( rule__DCLSubSystem__Group__0 ) ) )
            // InternalDCL.g:242:1: ( ( rule__DCLSubSystem__Group__0 ) )
            {
            // InternalDCL.g:242:1: ( ( rule__DCLSubSystem__Group__0 ) )
            // InternalDCL.g:243:1: ( rule__DCLSubSystem__Group__0 )
            {
             before(grammarAccess.getDCLSubSystemAccess().getGroup()); 
            // InternalDCL.g:244:1: ( rule__DCLSubSystem__Group__0 )
            // InternalDCL.g:244:2: rule__DCLSubSystem__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:256:1: entryRuleDCLModule : ruleDCLModule EOF ;
    public final void entryRuleDCLModule() throws RecognitionException {
        try {
            // InternalDCL.g:257:1: ( ruleDCLModule EOF )
            // InternalDCL.g:258:1: ruleDCLModule EOF
            {
             before(grammarAccess.getDCLModuleRule()); 
            pushFollow(FOLLOW_1);
            ruleDCLModule();

            state._fsp--;

             after(grammarAccess.getDCLModuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:265:1: ruleDCLModule : ( ( rule__DCLModule__Group__0 ) ) ;
    public final void ruleDCLModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:269:2: ( ( ( rule__DCLModule__Group__0 ) ) )
            // InternalDCL.g:270:1: ( ( rule__DCLModule__Group__0 ) )
            {
            // InternalDCL.g:270:1: ( ( rule__DCLModule__Group__0 ) )
            // InternalDCL.g:271:1: ( rule__DCLModule__Group__0 )
            {
             before(grammarAccess.getDCLModuleAccess().getGroup()); 
            // InternalDCL.g:272:1: ( rule__DCLModule__Group__0 )
            // InternalDCL.g:272:2: rule__DCLModule__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:284:1: entryRuleDCDecl : ruleDCDecl EOF ;
    public final void entryRuleDCDecl() throws RecognitionException {
        try {
            // InternalDCL.g:285:1: ( ruleDCDecl EOF )
            // InternalDCL.g:286:1: ruleDCDecl EOF
            {
             before(grammarAccess.getDCDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleDCDecl();

            state._fsp--;

             after(grammarAccess.getDCDeclRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:293:1: ruleDCDecl : ( ( rule__DCDecl__Alternatives ) ) ;
    public final void ruleDCDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:297:2: ( ( ( rule__DCDecl__Alternatives ) ) )
            // InternalDCL.g:298:1: ( ( rule__DCDecl__Alternatives ) )
            {
            // InternalDCL.g:298:1: ( ( rule__DCDecl__Alternatives ) )
            // InternalDCL.g:299:1: ( rule__DCDecl__Alternatives )
            {
             before(grammarAccess.getDCDeclAccess().getAlternatives()); 
            // InternalDCL.g:300:1: ( rule__DCDecl__Alternatives )
            // InternalDCL.g:300:2: rule__DCDecl__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:312:1: entryRuleOnly : ruleOnly EOF ;
    public final void entryRuleOnly() throws RecognitionException {
        try {
            // InternalDCL.g:313:1: ( ruleOnly EOF )
            // InternalDCL.g:314:1: ruleOnly EOF
            {
             before(grammarAccess.getOnlyRule()); 
            pushFollow(FOLLOW_1);
            ruleOnly();

            state._fsp--;

             after(grammarAccess.getOnlyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:321:1: ruleOnly : ( ( rule__Only__OnlyAssignment ) ) ;
    public final void ruleOnly() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:325:2: ( ( ( rule__Only__OnlyAssignment ) ) )
            // InternalDCL.g:326:1: ( ( rule__Only__OnlyAssignment ) )
            {
            // InternalDCL.g:326:1: ( ( rule__Only__OnlyAssignment ) )
            // InternalDCL.g:327:1: ( rule__Only__OnlyAssignment )
            {
             before(grammarAccess.getOnlyAccess().getOnlyAssignment()); 
            // InternalDCL.g:328:1: ( rule__Only__OnlyAssignment )
            // InternalDCL.g:328:2: rule__Only__OnlyAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:340:1: entryRuleCan : ruleCan EOF ;
    public final void entryRuleCan() throws RecognitionException {
        try {
            // InternalDCL.g:341:1: ( ruleCan EOF )
            // InternalDCL.g:342:1: ruleCan EOF
            {
             before(grammarAccess.getCanRule()); 
            pushFollow(FOLLOW_1);
            ruleCan();

            state._fsp--;

             after(grammarAccess.getCanRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:349:1: ruleCan : ( ( rule__Can__CanAssignment ) ) ;
    public final void ruleCan() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:353:2: ( ( ( rule__Can__CanAssignment ) ) )
            // InternalDCL.g:354:1: ( ( rule__Can__CanAssignment ) )
            {
            // InternalDCL.g:354:1: ( ( rule__Can__CanAssignment ) )
            // InternalDCL.g:355:1: ( rule__Can__CanAssignment )
            {
             before(grammarAccess.getCanAccess().getCanAssignment()); 
            // InternalDCL.g:356:1: ( rule__Can__CanAssignment )
            // InternalDCL.g:356:2: rule__Can__CanAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:368:1: entryRuleCannot : ruleCannot EOF ;
    public final void entryRuleCannot() throws RecognitionException {
        try {
            // InternalDCL.g:369:1: ( ruleCannot EOF )
            // InternalDCL.g:370:1: ruleCannot EOF
            {
             before(grammarAccess.getCannotRule()); 
            pushFollow(FOLLOW_1);
            ruleCannot();

            state._fsp--;

             after(grammarAccess.getCannotRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:377:1: ruleCannot : ( ( rule__Cannot__CannotAssignment ) ) ;
    public final void ruleCannot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:381:2: ( ( ( rule__Cannot__CannotAssignment ) ) )
            // InternalDCL.g:382:1: ( ( rule__Cannot__CannotAssignment ) )
            {
            // InternalDCL.g:382:1: ( ( rule__Cannot__CannotAssignment ) )
            // InternalDCL.g:383:1: ( rule__Cannot__CannotAssignment )
            {
             before(grammarAccess.getCannotAccess().getCannotAssignment()); 
            // InternalDCL.g:384:1: ( rule__Cannot__CannotAssignment )
            // InternalDCL.g:384:2: rule__Cannot__CannotAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:396:1: entryRuleOnly2 : ruleOnly2 EOF ;
    public final void entryRuleOnly2() throws RecognitionException {
        try {
            // InternalDCL.g:397:1: ( ruleOnly2 EOF )
            // InternalDCL.g:398:1: ruleOnly2 EOF
            {
             before(grammarAccess.getOnly2Rule()); 
            pushFollow(FOLLOW_1);
            ruleOnly2();

            state._fsp--;

             after(grammarAccess.getOnly2Rule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:405:1: ruleOnly2 : ( ( rule__Only2__Only2Assignment ) ) ;
    public final void ruleOnly2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:409:2: ( ( ( rule__Only2__Only2Assignment ) ) )
            // InternalDCL.g:410:1: ( ( rule__Only2__Only2Assignment ) )
            {
            // InternalDCL.g:410:1: ( ( rule__Only2__Only2Assignment ) )
            // InternalDCL.g:411:1: ( rule__Only2__Only2Assignment )
            {
             before(grammarAccess.getOnly2Access().getOnly2Assignment()); 
            // InternalDCL.g:412:1: ( rule__Only2__Only2Assignment )
            // InternalDCL.g:412:2: rule__Only2__Only2Assignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:424:1: entryRuleMust : ruleMust EOF ;
    public final void entryRuleMust() throws RecognitionException {
        try {
            // InternalDCL.g:425:1: ( ruleMust EOF )
            // InternalDCL.g:426:1: ruleMust EOF
            {
             before(grammarAccess.getMustRule()); 
            pushFollow(FOLLOW_1);
            ruleMust();

            state._fsp--;

             after(grammarAccess.getMustRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:433:1: ruleMust : ( ( rule__Must__MustAssignment ) ) ;
    public final void ruleMust() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:437:2: ( ( ( rule__Must__MustAssignment ) ) )
            // InternalDCL.g:438:1: ( ( rule__Must__MustAssignment ) )
            {
            // InternalDCL.g:438:1: ( ( rule__Must__MustAssignment ) )
            // InternalDCL.g:439:1: ( rule__Must__MustAssignment )
            {
             before(grammarAccess.getMustAccess().getMustAssignment()); 
            // InternalDCL.g:440:1: ( rule__Must__MustAssignment )
            // InternalDCL.g:440:2: rule__Must__MustAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:452:1: entryRuleElementType : ruleElementType EOF ;
    public final void entryRuleElementType() throws RecognitionException {
        try {
            // InternalDCL.g:453:1: ( ruleElementType EOF )
            // InternalDCL.g:454:1: ruleElementType EOF
            {
             before(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getElementTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:461:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:465:2: ( ( ( rule__ElementType__Alternatives ) ) )
            // InternalDCL.g:466:1: ( ( rule__ElementType__Alternatives ) )
            {
            // InternalDCL.g:466:1: ( ( rule__ElementType__Alternatives ) )
            // InternalDCL.g:467:1: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // InternalDCL.g:468:1: ( rule__ElementType__Alternatives )
            // InternalDCL.g:468:2: rule__ElementType__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:480:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalDCL.g:481:1: ( ruleBasicType EOF )
            // InternalDCL.g:482:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:489:1: ruleBasicType : ( ( rule__BasicType__TypeNameAssignment ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:493:2: ( ( ( rule__BasicType__TypeNameAssignment ) ) )
            // InternalDCL.g:494:1: ( ( rule__BasicType__TypeNameAssignment ) )
            {
            // InternalDCL.g:494:1: ( ( rule__BasicType__TypeNameAssignment ) )
            // InternalDCL.g:495:1: ( rule__BasicType__TypeNameAssignment )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 
            // InternalDCL.g:496:1: ( rule__BasicType__TypeNameAssignment )
            // InternalDCL.g:496:2: rule__BasicType__TypeNameAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:508:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // InternalDCL.g:509:1: ( ruleEntityType EOF )
            // InternalDCL.g:510:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDCL.g:517:1: ruleEntityType : ( ( rule__EntityType__EntityAssignment ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:521:2: ( ( ( rule__EntityType__EntityAssignment ) ) )
            // InternalDCL.g:522:1: ( ( rule__EntityType__EntityAssignment ) )
            {
            // InternalDCL.g:522:1: ( ( rule__EntityType__EntityAssignment ) )
            // InternalDCL.g:523:1: ( rule__EntityType__EntityAssignment )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 
            // InternalDCL.g:524:1: ( rule__EntityType__EntityAssignment )
            // InternalDCL.g:524:2: rule__EntityType__EntityAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:536:1: rule__DCLStructureElement__Alternatives : ( ( ruleDCLLayer ) | ( ruleDCLComponent ) | ( ruleDCLSubSystem ) | ( ruleDCLModule ) | ( ruleDCLComponentInterface ) );
    public final void rule__DCLStructureElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:540:1: ( ( ruleDCLLayer ) | ( ruleDCLComponent ) | ( ruleDCLSubSystem ) | ( ruleDCLModule ) | ( ruleDCLComponentInterface ) )
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
                    // InternalDCL.g:541:1: ( ruleDCLLayer )
                    {
                    // InternalDCL.g:541:1: ( ruleDCLLayer )
                    // InternalDCL.g:542:1: ruleDCLLayer
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLLayerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDCLLayer();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLLayerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDCL.g:547:6: ( ruleDCLComponent )
                    {
                    // InternalDCL.g:547:6: ( ruleDCLComponent )
                    // InternalDCL.g:548:1: ruleDCLComponent
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDCLComponent();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLComponentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDCL.g:553:6: ( ruleDCLSubSystem )
                    {
                    // InternalDCL.g:553:6: ( ruleDCLSubSystem )
                    // InternalDCL.g:554:1: ruleDCLSubSystem
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLSubSystemParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDCLSubSystem();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLSubSystemParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDCL.g:559:6: ( ruleDCLModule )
                    {
                    // InternalDCL.g:559:6: ( ruleDCLModule )
                    // InternalDCL.g:560:1: ruleDCLModule
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLModuleParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDCLModule();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLModuleParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDCL.g:565:6: ( ruleDCLComponentInterface )
                    {
                    // InternalDCL.g:565:6: ( ruleDCLComponentInterface )
                    // InternalDCL.g:566:1: ruleDCLComponentInterface
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLComponentInterfaceParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
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
    // InternalDCL.g:576:1: rule__DCLLayer__Alternatives_5 : ( ( ( rule__DCLLayer__Group_5_0__0 ) ) | ( ( rule__DCLLayer__Group_5_1__0 ) ) | ( ( rule__DCLLayer__Group_5_2__0 ) ) );
    public final void rule__DCLLayer__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:580:1: ( ( ( rule__DCLLayer__Group_5_0__0 ) ) | ( ( rule__DCLLayer__Group_5_1__0 ) ) | ( ( rule__DCLLayer__Group_5_2__0 ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                switch ( input.LA(2) ) {
                case 32:
                    {
                    alt2=2;
                    }
                    break;
                case 33:
                    {
                    alt2=3;
                    }
                    break;
                case 31:
                    {
                    alt2=1;
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
                    // InternalDCL.g:581:1: ( ( rule__DCLLayer__Group_5_0__0 ) )
                    {
                    // InternalDCL.g:581:1: ( ( rule__DCLLayer__Group_5_0__0 ) )
                    // InternalDCL.g:582:1: ( rule__DCLLayer__Group_5_0__0 )
                    {
                     before(grammarAccess.getDCLLayerAccess().getGroup_5_0()); 
                    // InternalDCL.g:583:1: ( rule__DCLLayer__Group_5_0__0 )
                    // InternalDCL.g:583:2: rule__DCLLayer__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DCLLayer__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCLLayerAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDCL.g:587:6: ( ( rule__DCLLayer__Group_5_1__0 ) )
                    {
                    // InternalDCL.g:587:6: ( ( rule__DCLLayer__Group_5_1__0 ) )
                    // InternalDCL.g:588:1: ( rule__DCLLayer__Group_5_1__0 )
                    {
                     before(grammarAccess.getDCLLayerAccess().getGroup_5_1()); 
                    // InternalDCL.g:589:1: ( rule__DCLLayer__Group_5_1__0 )
                    // InternalDCL.g:589:2: rule__DCLLayer__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DCLLayer__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCLLayerAccess().getGroup_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDCL.g:593:6: ( ( rule__DCLLayer__Group_5_2__0 ) )
                    {
                    // InternalDCL.g:593:6: ( ( rule__DCLLayer__Group_5_2__0 ) )
                    // InternalDCL.g:594:1: ( rule__DCLLayer__Group_5_2__0 )
                    {
                     before(grammarAccess.getDCLLayerAccess().getGroup_5_2()); 
                    // InternalDCL.g:595:1: ( rule__DCLLayer__Group_5_2__0 )
                    // InternalDCL.g:595:2: rule__DCLLayer__Group_5_2__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalDCL.g:604:1: rule__DCLComponent__Alternatives_2 : ( ( ( rule__DCLComponent__Group_2_0__0 ) ) | ( ( rule__DCLComponent__Group_2_1__0 ) ) );
    public final void rule__DCLComponent__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:608:1: ( ( ( rule__DCLComponent__Group_2_0__0 ) ) | ( ( rule__DCLComponent__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==31) ) {
                    alt3=1;
                }
                else if ( (LA3_1==32) ) {
                    alt3=2;
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
                    // InternalDCL.g:609:1: ( ( rule__DCLComponent__Group_2_0__0 ) )
                    {
                    // InternalDCL.g:609:1: ( ( rule__DCLComponent__Group_2_0__0 ) )
                    // InternalDCL.g:610:1: ( rule__DCLComponent__Group_2_0__0 )
                    {
                     before(grammarAccess.getDCLComponentAccess().getGroup_2_0()); 
                    // InternalDCL.g:611:1: ( rule__DCLComponent__Group_2_0__0 )
                    // InternalDCL.g:611:2: rule__DCLComponent__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DCLComponent__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCLComponentAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDCL.g:615:6: ( ( rule__DCLComponent__Group_2_1__0 ) )
                    {
                    // InternalDCL.g:615:6: ( ( rule__DCLComponent__Group_2_1__0 ) )
                    // InternalDCL.g:616:1: ( rule__DCLComponent__Group_2_1__0 )
                    {
                     before(grammarAccess.getDCLComponentAccess().getGroup_2_1()); 
                    // InternalDCL.g:617:1: ( rule__DCLComponent__Group_2_1__0 )
                    // InternalDCL.g:617:2: rule__DCLComponent__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalDCL.g:626:1: rule__InterfaceType__InterfaceTypeNameAlternatives_0 : ( ( 'provided' ) | ( 'required' ) );
    public final void rule__InterfaceType__InterfaceTypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:630:1: ( ( 'provided' ) | ( 'required' ) )
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
                    // InternalDCL.g:631:1: ( 'provided' )
                    {
                    // InternalDCL.g:631:1: ( 'provided' )
                    // InternalDCL.g:632:1: 'provided'
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameProvidedKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameProvidedKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDCL.g:639:6: ( 'required' )
                    {
                    // InternalDCL.g:639:6: ( 'required' )
                    // InternalDCL.g:640:1: 'required'
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameRequiredKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
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
    // InternalDCL.g:652:1: rule__DCDecl__Alternatives : ( ( ( rule__DCDecl__Group_0__0 ) ) | ( ( rule__DCDecl__Group_1__0 ) ) | ( ( rule__DCDecl__Group_2__0 ) ) | ( ( rule__DCDecl__Group_3__0 ) ) | ( ( rule__DCDecl__Group_4__0 ) ) );
    public final void rule__DCDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:656:1: ( ( ( rule__DCDecl__Group_0__0 ) ) | ( ( rule__DCDecl__Group_1__0 ) ) | ( ( rule__DCDecl__Group_2__0 ) ) | ( ( rule__DCDecl__Group_3__0 ) ) | ( ( rule__DCDecl__Group_4__0 ) ) )
            int alt5=5;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalDCL.g:657:1: ( ( rule__DCDecl__Group_0__0 ) )
                    {
                    // InternalDCL.g:657:1: ( ( rule__DCDecl__Group_0__0 ) )
                    // InternalDCL.g:658:1: ( rule__DCDecl__Group_0__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_0()); 
                    // InternalDCL.g:659:1: ( rule__DCDecl__Group_0__0 )
                    // InternalDCL.g:659:2: rule__DCDecl__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DCDecl__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDCL.g:663:6: ( ( rule__DCDecl__Group_1__0 ) )
                    {
                    // InternalDCL.g:663:6: ( ( rule__DCDecl__Group_1__0 ) )
                    // InternalDCL.g:664:1: ( rule__DCDecl__Group_1__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_1()); 
                    // InternalDCL.g:665:1: ( rule__DCDecl__Group_1__0 )
                    // InternalDCL.g:665:2: rule__DCDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DCDecl__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDCL.g:669:6: ( ( rule__DCDecl__Group_2__0 ) )
                    {
                    // InternalDCL.g:669:6: ( ( rule__DCDecl__Group_2__0 ) )
                    // InternalDCL.g:670:1: ( rule__DCDecl__Group_2__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_2()); 
                    // InternalDCL.g:671:1: ( rule__DCDecl__Group_2__0 )
                    // InternalDCL.g:671:2: rule__DCDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DCDecl__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDCL.g:675:6: ( ( rule__DCDecl__Group_3__0 ) )
                    {
                    // InternalDCL.g:675:6: ( ( rule__DCDecl__Group_3__0 ) )
                    // InternalDCL.g:676:1: ( rule__DCDecl__Group_3__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_3()); 
                    // InternalDCL.g:677:1: ( rule__DCDecl__Group_3__0 )
                    // InternalDCL.g:677:2: rule__DCDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DCDecl__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDCL.g:681:6: ( ( rule__DCDecl__Group_4__0 ) )
                    {
                    // InternalDCL.g:681:6: ( ( rule__DCDecl__Group_4__0 ) )
                    // InternalDCL.g:682:1: ( rule__DCDecl__Group_4__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_4()); 
                    // InternalDCL.g:683:1: ( rule__DCDecl__Group_4__0 )
                    // InternalDCL.g:683:2: rule__DCDecl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DCDecl__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_4()); 

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
    // InternalDCL.g:692:1: rule__ElementType__Alternatives : ( ( ruleBasicType ) | ( ruleEntityType ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:696:1: ( ( ruleBasicType ) | ( ruleEntityType ) )
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
                    // InternalDCL.g:697:1: ( ruleBasicType )
                    {
                    // InternalDCL.g:697:1: ( ruleBasicType )
                    // InternalDCL.g:698:1: ruleBasicType
                    {
                     before(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDCL.g:703:6: ( ruleEntityType )
                    {
                    // InternalDCL.g:703:6: ( ruleEntityType )
                    // InternalDCL.g:704:1: ruleEntityType
                    {
                     before(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
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
    // InternalDCL.g:714:1: rule__BasicType__TypeNameAlternatives_0 : ( ( 'access' ) | ( 'declare' ) | ( 'handle' ) | ( 'create' ) | ( 'depend' ) );
    public final void rule__BasicType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:718:1: ( ( 'access' ) | ( 'declare' ) | ( 'handle' ) | ( 'create' ) | ( 'depend' ) )
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
                    // InternalDCL.g:719:1: ( 'access' )
                    {
                    // InternalDCL.g:719:1: ( 'access' )
                    // InternalDCL.g:720:1: 'access'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDCL.g:727:6: ( 'declare' )
                    {
                    // InternalDCL.g:727:6: ( 'declare' )
                    // InternalDCL.g:728:1: 'declare'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDCL.g:735:6: ( 'handle' )
                    {
                    // InternalDCL.g:735:6: ( 'handle' )
                    // InternalDCL.g:736:1: 'handle'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDCL.g:743:6: ( 'create' )
                    {
                    // InternalDCL.g:743:6: ( 'create' )
                    // InternalDCL.g:744:1: 'create'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDCL.g:751:6: ( 'depend' )
                    {
                    // InternalDCL.g:751:6: ( 'depend' )
                    // InternalDCL.g:752:1: 'depend'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameDependKeyword_0_4()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalDCL.g:764:1: rule__EntityType__EntityAlternatives_0 : ( ( 'extend' ) | ( 'implement' ) | ( 'derive' ) | ( 'throw' ) | ( 'useannotation' ) );
    public final void rule__EntityType__EntityAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:768:1: ( ( 'extend' ) | ( 'implement' ) | ( 'derive' ) | ( 'throw' ) | ( 'useannotation' ) )
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
                    // InternalDCL.g:769:1: ( 'extend' )
                    {
                    // InternalDCL.g:769:1: ( 'extend' )
                    // InternalDCL.g:770:1: 'extend'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDCL.g:777:6: ( 'implement' )
                    {
                    // InternalDCL.g:777:6: ( 'implement' )
                    // InternalDCL.g:778:1: 'implement'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDCL.g:785:6: ( 'derive' )
                    {
                    // InternalDCL.g:785:6: ( 'derive' )
                    // InternalDCL.g:786:1: 'derive'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDCL.g:793:6: ( 'throw' )
                    {
                    // InternalDCL.g:793:6: ( 'throw' )
                    // InternalDCL.g:794:1: 'throw'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDCL.g:801:6: ( 'useannotation' )
                    {
                    // InternalDCL.g:801:6: ( 'useannotation' )
                    // InternalDCL.g:802:1: 'useannotation'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityUseannotationKeyword_0_4()); 
                    match(input,22,FOLLOW_2); 
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
    // InternalDCL.g:816:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:820:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDCL.g:821:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:828:1: rule__Model__Group__0__Impl : ( 'architeturalElements' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:832:1: ( ( 'architeturalElements' ) )
            // InternalDCL.g:833:1: ( 'architeturalElements' )
            {
            // InternalDCL.g:833:1: ( 'architeturalElements' )
            // InternalDCL.g:834:1: 'architeturalElements'
            {
             before(grammarAccess.getModelAccess().getArchiteturalElementsKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDCL.g:847:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:851:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalDCL.g:852:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:859:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:863:1: ( ( '{' ) )
            // InternalDCL.g:864:1: ( '{' )
            {
            // InternalDCL.g:864:1: ( '{' )
            // InternalDCL.g:865:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDCL.g:878:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:882:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalDCL.g:883:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:890:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:894:1: ( ( ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* ) ) )
            // InternalDCL.g:895:1: ( ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* ) )
            {
            // InternalDCL.g:895:1: ( ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* ) )
            // InternalDCL.g:896:1: ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* )
            {
            // InternalDCL.g:896:1: ( ( rule__Model__StructureElementsAssignment_2 ) )
            // InternalDCL.g:897:1: ( rule__Model__StructureElementsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getStructureElementsAssignment_2()); 
            // InternalDCL.g:898:1: ( rule__Model__StructureElementsAssignment_2 )
            // InternalDCL.g:898:2: rule__Model__StructureElementsAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__Model__StructureElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStructureElementsAssignment_2()); 

            }

            // InternalDCL.g:901:1: ( ( rule__Model__StructureElementsAssignment_2 )* )
            // InternalDCL.g:902:1: ( rule__Model__StructureElementsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getStructureElementsAssignment_2()); 
            // InternalDCL.g:903:1: ( rule__Model__StructureElementsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27||(LA9_0>=34 && LA9_0<=35)||(LA9_0>=38 && LA9_0<=39)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDCL.g:903:2: rule__Model__StructureElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
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
    // InternalDCL.g:914:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:918:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalDCL.g:919:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:926:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:930:1: ( ( '}' ) )
            // InternalDCL.g:931:1: ( '}' )
            {
            // InternalDCL.g:931:1: ( '}' )
            // InternalDCL.g:932:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDCL.g:945:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:949:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalDCL.g:950:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:957:1: rule__Model__Group__4__Impl : ( 'restrictions' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:961:1: ( ( 'restrictions' ) )
            // InternalDCL.g:962:1: ( 'restrictions' )
            {
            // InternalDCL.g:962:1: ( 'restrictions' )
            // InternalDCL.g:963:1: 'restrictions'
            {
             before(grammarAccess.getModelAccess().getRestrictionsKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDCL.g:976:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:980:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalDCL.g:981:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:988:1: rule__Model__Group__5__Impl : ( '{' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:992:1: ( ( '{' ) )
            // InternalDCL.g:993:1: ( '{' )
            {
            // InternalDCL.g:993:1: ( '{' )
            // InternalDCL.g:994:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDCL.g:1007:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1011:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalDCL.g:1012:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1019:1: rule__Model__Group__6__Impl : ( ( rule__Model__DCDeclAssignment_6 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1023:1: ( ( ( rule__Model__DCDeclAssignment_6 )* ) )
            // InternalDCL.g:1024:1: ( ( rule__Model__DCDeclAssignment_6 )* )
            {
            // InternalDCL.g:1024:1: ( ( rule__Model__DCDeclAssignment_6 )* )
            // InternalDCL.g:1025:1: ( rule__Model__DCDeclAssignment_6 )*
            {
             before(grammarAccess.getModelAccess().getDCDeclAssignment_6()); 
            // InternalDCL.g:1026:1: ( rule__Model__DCDeclAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==40) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDCL.g:1026:2: rule__Model__DCDeclAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalDCL.g:1036:1: rule__Model__Group__7 : rule__Model__Group__7__Impl ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1040:1: ( rule__Model__Group__7__Impl )
            // InternalDCL.g:1041:2: rule__Model__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1047:1: rule__Model__Group__7__Impl : ( '}' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1051:1: ( ( '}' ) )
            // InternalDCL.g:1052:1: ( '}' )
            {
            // InternalDCL.g:1052:1: ( '}' )
            // InternalDCL.g:1053:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDCL.g:1082:1: rule__DCLLayer__Group__0 : rule__DCLLayer__Group__0__Impl rule__DCLLayer__Group__1 ;
    public final void rule__DCLLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1086:1: ( rule__DCLLayer__Group__0__Impl rule__DCLLayer__Group__1 )
            // InternalDCL.g:1087:2: rule__DCLLayer__Group__0__Impl rule__DCLLayer__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DCLLayer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1094:1: rule__DCLLayer__Group__0__Impl : ( 'layer' ) ;
    public final void rule__DCLLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1098:1: ( ( 'layer' ) )
            // InternalDCL.g:1099:1: ( 'layer' )
            {
            // InternalDCL.g:1099:1: ( 'layer' )
            // InternalDCL.g:1100:1: 'layer'
            {
             before(grammarAccess.getDCLLayerAccess().getLayerKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDCL.g:1113:1: rule__DCLLayer__Group__1 : rule__DCLLayer__Group__1__Impl rule__DCLLayer__Group__2 ;
    public final void rule__DCLLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1117:1: ( rule__DCLLayer__Group__1__Impl rule__DCLLayer__Group__2 )
            // InternalDCL.g:1118:2: rule__DCLLayer__Group__1__Impl rule__DCLLayer__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DCLLayer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1125:1: rule__DCLLayer__Group__1__Impl : ( ( rule__DCLLayer__NameAssignment_1 ) ) ;
    public final void rule__DCLLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1129:1: ( ( ( rule__DCLLayer__NameAssignment_1 ) ) )
            // InternalDCL.g:1130:1: ( ( rule__DCLLayer__NameAssignment_1 ) )
            {
            // InternalDCL.g:1130:1: ( ( rule__DCLLayer__NameAssignment_1 ) )
            // InternalDCL.g:1131:1: ( rule__DCLLayer__NameAssignment_1 )
            {
             before(grammarAccess.getDCLLayerAccess().getNameAssignment_1()); 
            // InternalDCL.g:1132:1: ( rule__DCLLayer__NameAssignment_1 )
            // InternalDCL.g:1132:2: rule__DCLLayer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1142:1: rule__DCLLayer__Group__2 : rule__DCLLayer__Group__2__Impl rule__DCLLayer__Group__3 ;
    public final void rule__DCLLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1146:1: ( rule__DCLLayer__Group__2__Impl rule__DCLLayer__Group__3 )
            // InternalDCL.g:1147:2: rule__DCLLayer__Group__2__Impl rule__DCLLayer__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__DCLLayer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1154:1: rule__DCLLayer__Group__2__Impl : ( ',' ) ;
    public final void rule__DCLLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1158:1: ( ( ',' ) )
            // InternalDCL.g:1159:1: ( ',' )
            {
            // InternalDCL.g:1159:1: ( ',' )
            // InternalDCL.g:1160:1: ','
            {
             before(grammarAccess.getDCLLayerAccess().getCommaKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDCL.g:1173:1: rule__DCLLayer__Group__3 : rule__DCLLayer__Group__3__Impl rule__DCLLayer__Group__4 ;
    public final void rule__DCLLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1177:1: ( rule__DCLLayer__Group__3__Impl rule__DCLLayer__Group__4 )
            // InternalDCL.g:1178:2: rule__DCLLayer__Group__3__Impl rule__DCLLayer__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__DCLLayer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1185:1: rule__DCLLayer__Group__3__Impl : ( 'level' ) ;
    public final void rule__DCLLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1189:1: ( ( 'level' ) )
            // InternalDCL.g:1190:1: ( 'level' )
            {
            // InternalDCL.g:1190:1: ( 'level' )
            // InternalDCL.g:1191:1: 'level'
            {
             before(grammarAccess.getDCLLayerAccess().getLevelKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDCL.g:1204:1: rule__DCLLayer__Group__4 : rule__DCLLayer__Group__4__Impl rule__DCLLayer__Group__5 ;
    public final void rule__DCLLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1208:1: ( rule__DCLLayer__Group__4__Impl rule__DCLLayer__Group__5 )
            // InternalDCL.g:1209:2: rule__DCLLayer__Group__4__Impl rule__DCLLayer__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__DCLLayer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1216:1: rule__DCLLayer__Group__4__Impl : ( ( rule__DCLLayer__LevelAssignment_4 ) ) ;
    public final void rule__DCLLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1220:1: ( ( ( rule__DCLLayer__LevelAssignment_4 ) ) )
            // InternalDCL.g:1221:1: ( ( rule__DCLLayer__LevelAssignment_4 ) )
            {
            // InternalDCL.g:1221:1: ( ( rule__DCLLayer__LevelAssignment_4 ) )
            // InternalDCL.g:1222:1: ( rule__DCLLayer__LevelAssignment_4 )
            {
             before(grammarAccess.getDCLLayerAccess().getLevelAssignment_4()); 
            // InternalDCL.g:1223:1: ( rule__DCLLayer__LevelAssignment_4 )
            // InternalDCL.g:1223:2: rule__DCLLayer__LevelAssignment_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1233:1: rule__DCLLayer__Group__5 : rule__DCLLayer__Group__5__Impl rule__DCLLayer__Group__6 ;
    public final void rule__DCLLayer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1237:1: ( rule__DCLLayer__Group__5__Impl rule__DCLLayer__Group__6 )
            // InternalDCL.g:1238:2: rule__DCLLayer__Group__5__Impl rule__DCLLayer__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__DCLLayer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1245:1: rule__DCLLayer__Group__5__Impl : ( ( rule__DCLLayer__Alternatives_5 )? ) ;
    public final void rule__DCLLayer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1249:1: ( ( ( rule__DCLLayer__Alternatives_5 )? ) )
            // InternalDCL.g:1250:1: ( ( rule__DCLLayer__Alternatives_5 )? )
            {
            // InternalDCL.g:1250:1: ( ( rule__DCLLayer__Alternatives_5 )? )
            // InternalDCL.g:1251:1: ( rule__DCLLayer__Alternatives_5 )?
            {
             before(grammarAccess.getDCLLayerAccess().getAlternatives_5()); 
            // InternalDCL.g:1252:1: ( rule__DCLLayer__Alternatives_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDCL.g:1252:2: rule__DCLLayer__Alternatives_5
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1262:1: rule__DCLLayer__Group__6 : rule__DCLLayer__Group__6__Impl ;
    public final void rule__DCLLayer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1266:1: ( rule__DCLLayer__Group__6__Impl )
            // InternalDCL.g:1267:2: rule__DCLLayer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1273:1: rule__DCLLayer__Group__6__Impl : ( ';' ) ;
    public final void rule__DCLLayer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1277:1: ( ( ';' ) )
            // InternalDCL.g:1278:1: ( ';' )
            {
            // InternalDCL.g:1278:1: ( ';' )
            // InternalDCL.g:1279:1: ';'
            {
             before(grammarAccess.getDCLLayerAccess().getSemicolonKeyword_6()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDCL.g:1306:1: rule__DCLLayer__Group_5_0__0 : rule__DCLLayer__Group_5_0__0__Impl rule__DCLLayer__Group_5_0__1 ;
    public final void rule__DCLLayer__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1310:1: ( rule__DCLLayer__Group_5_0__0__Impl rule__DCLLayer__Group_5_0__1 )
            // InternalDCL.g:1311:2: rule__DCLLayer__Group_5_0__0__Impl rule__DCLLayer__Group_5_0__1
            {
            pushFollow(FOLLOW_15);
            rule__DCLLayer__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1318:1: rule__DCLLayer__Group_5_0__0__Impl : ( ',' ) ;
    public final void rule__DCLLayer__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1322:1: ( ( ',' ) )
            // InternalDCL.g:1323:1: ( ',' )
            {
            // InternalDCL.g:1323:1: ( ',' )
            // InternalDCL.g:1324:1: ','
            {
             before(grammarAccess.getDCLLayerAccess().getCommaKeyword_5_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDCL.g:1337:1: rule__DCLLayer__Group_5_0__1 : rule__DCLLayer__Group_5_0__1__Impl rule__DCLLayer__Group_5_0__2 ;
    public final void rule__DCLLayer__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1341:1: ( rule__DCLLayer__Group_5_0__1__Impl rule__DCLLayer__Group_5_0__2 )
            // InternalDCL.g:1342:2: rule__DCLLayer__Group_5_0__1__Impl rule__DCLLayer__Group_5_0__2
            {
            pushFollow(FOLLOW_10);
            rule__DCLLayer__Group_5_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1349:1: rule__DCLLayer__Group_5_0__1__Impl : ( 'inLayer: ' ) ;
    public final void rule__DCLLayer__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1353:1: ( ( 'inLayer: ' ) )
            // InternalDCL.g:1354:1: ( 'inLayer: ' )
            {
            // InternalDCL.g:1354:1: ( 'inLayer: ' )
            // InternalDCL.g:1355:1: 'inLayer: '
            {
             before(grammarAccess.getDCLLayerAccess().getInLayerKeyword_5_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDCL.g:1368:1: rule__DCLLayer__Group_5_0__2 : rule__DCLLayer__Group_5_0__2__Impl ;
    public final void rule__DCLLayer__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1372:1: ( rule__DCLLayer__Group_5_0__2__Impl )
            // InternalDCL.g:1373:2: rule__DCLLayer__Group_5_0__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1379:1: rule__DCLLayer__Group_5_0__2__Impl : ( ( rule__DCLLayer__LayerAssignment_5_0_2 ) ) ;
    public final void rule__DCLLayer__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1383:1: ( ( ( rule__DCLLayer__LayerAssignment_5_0_2 ) ) )
            // InternalDCL.g:1384:1: ( ( rule__DCLLayer__LayerAssignment_5_0_2 ) )
            {
            // InternalDCL.g:1384:1: ( ( rule__DCLLayer__LayerAssignment_5_0_2 ) )
            // InternalDCL.g:1385:1: ( rule__DCLLayer__LayerAssignment_5_0_2 )
            {
             before(grammarAccess.getDCLLayerAccess().getLayerAssignment_5_0_2()); 
            // InternalDCL.g:1386:1: ( rule__DCLLayer__LayerAssignment_5_0_2 )
            // InternalDCL.g:1386:2: rule__DCLLayer__LayerAssignment_5_0_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1402:1: rule__DCLLayer__Group_5_1__0 : rule__DCLLayer__Group_5_1__0__Impl rule__DCLLayer__Group_5_1__1 ;
    public final void rule__DCLLayer__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1406:1: ( rule__DCLLayer__Group_5_1__0__Impl rule__DCLLayer__Group_5_1__1 )
            // InternalDCL.g:1407:2: rule__DCLLayer__Group_5_1__0__Impl rule__DCLLayer__Group_5_1__1
            {
            pushFollow(FOLLOW_16);
            rule__DCLLayer__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1414:1: rule__DCLLayer__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__DCLLayer__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1418:1: ( ( ',' ) )
            // InternalDCL.g:1419:1: ( ',' )
            {
            // InternalDCL.g:1419:1: ( ',' )
            // InternalDCL.g:1420:1: ','
            {
             before(grammarAccess.getDCLLayerAccess().getCommaKeyword_5_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDCL.g:1433:1: rule__DCLLayer__Group_5_1__1 : rule__DCLLayer__Group_5_1__1__Impl rule__DCLLayer__Group_5_1__2 ;
    public final void rule__DCLLayer__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1437:1: ( rule__DCLLayer__Group_5_1__1__Impl rule__DCLLayer__Group_5_1__2 )
            // InternalDCL.g:1438:2: rule__DCLLayer__Group_5_1__1__Impl rule__DCLLayer__Group_5_1__2
            {
            pushFollow(FOLLOW_10);
            rule__DCLLayer__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1445:1: rule__DCLLayer__Group_5_1__1__Impl : ( 'inSubSystem: ' ) ;
    public final void rule__DCLLayer__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1449:1: ( ( 'inSubSystem: ' ) )
            // InternalDCL.g:1450:1: ( 'inSubSystem: ' )
            {
            // InternalDCL.g:1450:1: ( 'inSubSystem: ' )
            // InternalDCL.g:1451:1: 'inSubSystem: '
            {
             before(grammarAccess.getDCLLayerAccess().getInSubSystemKeyword_5_1_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDCL.g:1464:1: rule__DCLLayer__Group_5_1__2 : rule__DCLLayer__Group_5_1__2__Impl ;
    public final void rule__DCLLayer__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1468:1: ( rule__DCLLayer__Group_5_1__2__Impl )
            // InternalDCL.g:1469:2: rule__DCLLayer__Group_5_1__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1475:1: rule__DCLLayer__Group_5_1__2__Impl : ( ( rule__DCLLayer__SubSystemAssignment_5_1_2 ) ) ;
    public final void rule__DCLLayer__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1479:1: ( ( ( rule__DCLLayer__SubSystemAssignment_5_1_2 ) ) )
            // InternalDCL.g:1480:1: ( ( rule__DCLLayer__SubSystemAssignment_5_1_2 ) )
            {
            // InternalDCL.g:1480:1: ( ( rule__DCLLayer__SubSystemAssignment_5_1_2 ) )
            // InternalDCL.g:1481:1: ( rule__DCLLayer__SubSystemAssignment_5_1_2 )
            {
             before(grammarAccess.getDCLLayerAccess().getSubSystemAssignment_5_1_2()); 
            // InternalDCL.g:1482:1: ( rule__DCLLayer__SubSystemAssignment_5_1_2 )
            // InternalDCL.g:1482:2: rule__DCLLayer__SubSystemAssignment_5_1_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1498:1: rule__DCLLayer__Group_5_2__0 : rule__DCLLayer__Group_5_2__0__Impl rule__DCLLayer__Group_5_2__1 ;
    public final void rule__DCLLayer__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1502:1: ( rule__DCLLayer__Group_5_2__0__Impl rule__DCLLayer__Group_5_2__1 )
            // InternalDCL.g:1503:2: rule__DCLLayer__Group_5_2__0__Impl rule__DCLLayer__Group_5_2__1
            {
            pushFollow(FOLLOW_17);
            rule__DCLLayer__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1510:1: rule__DCLLayer__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__DCLLayer__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1514:1: ( ( ',' ) )
            // InternalDCL.g:1515:1: ( ',' )
            {
            // InternalDCL.g:1515:1: ( ',' )
            // InternalDCL.g:1516:1: ','
            {
             before(grammarAccess.getDCLLayerAccess().getCommaKeyword_5_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDCL.g:1529:1: rule__DCLLayer__Group_5_2__1 : rule__DCLLayer__Group_5_2__1__Impl rule__DCLLayer__Group_5_2__2 ;
    public final void rule__DCLLayer__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1533:1: ( rule__DCLLayer__Group_5_2__1__Impl rule__DCLLayer__Group_5_2__2 )
            // InternalDCL.g:1534:2: rule__DCLLayer__Group_5_2__1__Impl rule__DCLLayer__Group_5_2__2
            {
            pushFollow(FOLLOW_10);
            rule__DCLLayer__Group_5_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1541:1: rule__DCLLayer__Group_5_2__1__Impl : ( 'inComponent: ' ) ;
    public final void rule__DCLLayer__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1545:1: ( ( 'inComponent: ' ) )
            // InternalDCL.g:1546:1: ( 'inComponent: ' )
            {
            // InternalDCL.g:1546:1: ( 'inComponent: ' )
            // InternalDCL.g:1547:1: 'inComponent: '
            {
             before(grammarAccess.getDCLLayerAccess().getInComponentKeyword_5_2_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDCL.g:1560:1: rule__DCLLayer__Group_5_2__2 : rule__DCLLayer__Group_5_2__2__Impl ;
    public final void rule__DCLLayer__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1564:1: ( rule__DCLLayer__Group_5_2__2__Impl )
            // InternalDCL.g:1565:2: rule__DCLLayer__Group_5_2__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1571:1: rule__DCLLayer__Group_5_2__2__Impl : ( ( rule__DCLLayer__ComponentAssignment_5_2_2 ) ) ;
    public final void rule__DCLLayer__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1575:1: ( ( ( rule__DCLLayer__ComponentAssignment_5_2_2 ) ) )
            // InternalDCL.g:1576:1: ( ( rule__DCLLayer__ComponentAssignment_5_2_2 ) )
            {
            // InternalDCL.g:1576:1: ( ( rule__DCLLayer__ComponentAssignment_5_2_2 ) )
            // InternalDCL.g:1577:1: ( rule__DCLLayer__ComponentAssignment_5_2_2 )
            {
             before(grammarAccess.getDCLLayerAccess().getComponentAssignment_5_2_2()); 
            // InternalDCL.g:1578:1: ( rule__DCLLayer__ComponentAssignment_5_2_2 )
            // InternalDCL.g:1578:2: rule__DCLLayer__ComponentAssignment_5_2_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1594:1: rule__DCLComponent__Group__0 : rule__DCLComponent__Group__0__Impl rule__DCLComponent__Group__1 ;
    public final void rule__DCLComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1598:1: ( rule__DCLComponent__Group__0__Impl rule__DCLComponent__Group__1 )
            // InternalDCL.g:1599:2: rule__DCLComponent__Group__0__Impl rule__DCLComponent__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DCLComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1606:1: rule__DCLComponent__Group__0__Impl : ( 'component' ) ;
    public final void rule__DCLComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1610:1: ( ( 'component' ) )
            // InternalDCL.g:1611:1: ( 'component' )
            {
            // InternalDCL.g:1611:1: ( 'component' )
            // InternalDCL.g:1612:1: 'component'
            {
             before(grammarAccess.getDCLComponentAccess().getComponentKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDCL.g:1625:1: rule__DCLComponent__Group__1 : rule__DCLComponent__Group__1__Impl rule__DCLComponent__Group__2 ;
    public final void rule__DCLComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1629:1: ( rule__DCLComponent__Group__1__Impl rule__DCLComponent__Group__2 )
            // InternalDCL.g:1630:2: rule__DCLComponent__Group__1__Impl rule__DCLComponent__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__DCLComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1637:1: rule__DCLComponent__Group__1__Impl : ( ( rule__DCLComponent__NameAssignment_1 ) ) ;
    public final void rule__DCLComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1641:1: ( ( ( rule__DCLComponent__NameAssignment_1 ) ) )
            // InternalDCL.g:1642:1: ( ( rule__DCLComponent__NameAssignment_1 ) )
            {
            // InternalDCL.g:1642:1: ( ( rule__DCLComponent__NameAssignment_1 ) )
            // InternalDCL.g:1643:1: ( rule__DCLComponent__NameAssignment_1 )
            {
             before(grammarAccess.getDCLComponentAccess().getNameAssignment_1()); 
            // InternalDCL.g:1644:1: ( rule__DCLComponent__NameAssignment_1 )
            // InternalDCL.g:1644:2: rule__DCLComponent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1654:1: rule__DCLComponent__Group__2 : rule__DCLComponent__Group__2__Impl rule__DCLComponent__Group__3 ;
    public final void rule__DCLComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1658:1: ( rule__DCLComponent__Group__2__Impl rule__DCLComponent__Group__3 )
            // InternalDCL.g:1659:2: rule__DCLComponent__Group__2__Impl rule__DCLComponent__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__DCLComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1666:1: rule__DCLComponent__Group__2__Impl : ( ( rule__DCLComponent__Alternatives_2 )? ) ;
    public final void rule__DCLComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1670:1: ( ( ( rule__DCLComponent__Alternatives_2 )? ) )
            // InternalDCL.g:1671:1: ( ( rule__DCLComponent__Alternatives_2 )? )
            {
            // InternalDCL.g:1671:1: ( ( rule__DCLComponent__Alternatives_2 )? )
            // InternalDCL.g:1672:1: ( rule__DCLComponent__Alternatives_2 )?
            {
             before(grammarAccess.getDCLComponentAccess().getAlternatives_2()); 
            // InternalDCL.g:1673:1: ( rule__DCLComponent__Alternatives_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDCL.g:1673:2: rule__DCLComponent__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1683:1: rule__DCLComponent__Group__3 : rule__DCLComponent__Group__3__Impl ;
    public final void rule__DCLComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1687:1: ( rule__DCLComponent__Group__3__Impl )
            // InternalDCL.g:1688:2: rule__DCLComponent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1694:1: rule__DCLComponent__Group__3__Impl : ( ';' ) ;
    public final void rule__DCLComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1698:1: ( ( ';' ) )
            // InternalDCL.g:1699:1: ( ';' )
            {
            // InternalDCL.g:1699:1: ( ';' )
            // InternalDCL.g:1700:1: ';'
            {
             before(grammarAccess.getDCLComponentAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDCL.g:1721:1: rule__DCLComponent__Group_2_0__0 : rule__DCLComponent__Group_2_0__0__Impl rule__DCLComponent__Group_2_0__1 ;
    public final void rule__DCLComponent__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1725:1: ( rule__DCLComponent__Group_2_0__0__Impl rule__DCLComponent__Group_2_0__1 )
            // InternalDCL.g:1726:2: rule__DCLComponent__Group_2_0__0__Impl rule__DCLComponent__Group_2_0__1
            {
            pushFollow(FOLLOW_15);
            rule__DCLComponent__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1733:1: rule__DCLComponent__Group_2_0__0__Impl : ( ',' ) ;
    public final void rule__DCLComponent__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1737:1: ( ( ',' ) )
            // InternalDCL.g:1738:1: ( ',' )
            {
            // InternalDCL.g:1738:1: ( ',' )
            // InternalDCL.g:1739:1: ','
            {
             before(grammarAccess.getDCLComponentAccess().getCommaKeyword_2_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDCL.g:1752:1: rule__DCLComponent__Group_2_0__1 : rule__DCLComponent__Group_2_0__1__Impl rule__DCLComponent__Group_2_0__2 ;
    public final void rule__DCLComponent__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1756:1: ( rule__DCLComponent__Group_2_0__1__Impl rule__DCLComponent__Group_2_0__2 )
            // InternalDCL.g:1757:2: rule__DCLComponent__Group_2_0__1__Impl rule__DCLComponent__Group_2_0__2
            {
            pushFollow(FOLLOW_10);
            rule__DCLComponent__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1764:1: rule__DCLComponent__Group_2_0__1__Impl : ( 'inLayer: ' ) ;
    public final void rule__DCLComponent__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1768:1: ( ( 'inLayer: ' ) )
            // InternalDCL.g:1769:1: ( 'inLayer: ' )
            {
            // InternalDCL.g:1769:1: ( 'inLayer: ' )
            // InternalDCL.g:1770:1: 'inLayer: '
            {
             before(grammarAccess.getDCLComponentAccess().getInLayerKeyword_2_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDCL.g:1783:1: rule__DCLComponent__Group_2_0__2 : rule__DCLComponent__Group_2_0__2__Impl ;
    public final void rule__DCLComponent__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1787:1: ( rule__DCLComponent__Group_2_0__2__Impl )
            // InternalDCL.g:1788:2: rule__DCLComponent__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1794:1: rule__DCLComponent__Group_2_0__2__Impl : ( ( rule__DCLComponent__LayerAssignment_2_0_2 ) ) ;
    public final void rule__DCLComponent__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1798:1: ( ( ( rule__DCLComponent__LayerAssignment_2_0_2 ) ) )
            // InternalDCL.g:1799:1: ( ( rule__DCLComponent__LayerAssignment_2_0_2 ) )
            {
            // InternalDCL.g:1799:1: ( ( rule__DCLComponent__LayerAssignment_2_0_2 ) )
            // InternalDCL.g:1800:1: ( rule__DCLComponent__LayerAssignment_2_0_2 )
            {
             before(grammarAccess.getDCLComponentAccess().getLayerAssignment_2_0_2()); 
            // InternalDCL.g:1801:1: ( rule__DCLComponent__LayerAssignment_2_0_2 )
            // InternalDCL.g:1801:2: rule__DCLComponent__LayerAssignment_2_0_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1817:1: rule__DCLComponent__Group_2_1__0 : rule__DCLComponent__Group_2_1__0__Impl rule__DCLComponent__Group_2_1__1 ;
    public final void rule__DCLComponent__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1821:1: ( rule__DCLComponent__Group_2_1__0__Impl rule__DCLComponent__Group_2_1__1 )
            // InternalDCL.g:1822:2: rule__DCLComponent__Group_2_1__0__Impl rule__DCLComponent__Group_2_1__1
            {
            pushFollow(FOLLOW_16);
            rule__DCLComponent__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1829:1: rule__DCLComponent__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__DCLComponent__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1833:1: ( ( ',' ) )
            // InternalDCL.g:1834:1: ( ',' )
            {
            // InternalDCL.g:1834:1: ( ',' )
            // InternalDCL.g:1835:1: ','
            {
             before(grammarAccess.getDCLComponentAccess().getCommaKeyword_2_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDCL.g:1848:1: rule__DCLComponent__Group_2_1__1 : rule__DCLComponent__Group_2_1__1__Impl rule__DCLComponent__Group_2_1__2 ;
    public final void rule__DCLComponent__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1852:1: ( rule__DCLComponent__Group_2_1__1__Impl rule__DCLComponent__Group_2_1__2 )
            // InternalDCL.g:1853:2: rule__DCLComponent__Group_2_1__1__Impl rule__DCLComponent__Group_2_1__2
            {
            pushFollow(FOLLOW_10);
            rule__DCLComponent__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1860:1: rule__DCLComponent__Group_2_1__1__Impl : ( 'inSubSystem: ' ) ;
    public final void rule__DCLComponent__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1864:1: ( ( 'inSubSystem: ' ) )
            // InternalDCL.g:1865:1: ( 'inSubSystem: ' )
            {
            // InternalDCL.g:1865:1: ( 'inSubSystem: ' )
            // InternalDCL.g:1866:1: 'inSubSystem: '
            {
             before(grammarAccess.getDCLComponentAccess().getInSubSystemKeyword_2_1_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDCL.g:1879:1: rule__DCLComponent__Group_2_1__2 : rule__DCLComponent__Group_2_1__2__Impl ;
    public final void rule__DCLComponent__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1883:1: ( rule__DCLComponent__Group_2_1__2__Impl )
            // InternalDCL.g:1884:2: rule__DCLComponent__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1890:1: rule__DCLComponent__Group_2_1__2__Impl : ( ( rule__DCLComponent__SubSystemAssignment_2_1_2 ) ) ;
    public final void rule__DCLComponent__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1894:1: ( ( ( rule__DCLComponent__SubSystemAssignment_2_1_2 ) ) )
            // InternalDCL.g:1895:1: ( ( rule__DCLComponent__SubSystemAssignment_2_1_2 ) )
            {
            // InternalDCL.g:1895:1: ( ( rule__DCLComponent__SubSystemAssignment_2_1_2 ) )
            // InternalDCL.g:1896:1: ( rule__DCLComponent__SubSystemAssignment_2_1_2 )
            {
             before(grammarAccess.getDCLComponentAccess().getSubSystemAssignment_2_1_2()); 
            // InternalDCL.g:1897:1: ( rule__DCLComponent__SubSystemAssignment_2_1_2 )
            // InternalDCL.g:1897:2: rule__DCLComponent__SubSystemAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1913:1: rule__DCLComponentInterface__Group__0 : rule__DCLComponentInterface__Group__0__Impl rule__DCLComponentInterface__Group__1 ;
    public final void rule__DCLComponentInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1917:1: ( rule__DCLComponentInterface__Group__0__Impl rule__DCLComponentInterface__Group__1 )
            // InternalDCL.g:1918:2: rule__DCLComponentInterface__Group__0__Impl rule__DCLComponentInterface__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DCLComponentInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1925:1: rule__DCLComponentInterface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__DCLComponentInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1929:1: ( ( 'interface' ) )
            // InternalDCL.g:1930:1: ( 'interface' )
            {
            // InternalDCL.g:1930:1: ( 'interface' )
            // InternalDCL.g:1931:1: 'interface'
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDCL.g:1944:1: rule__DCLComponentInterface__Group__1 : rule__DCLComponentInterface__Group__1__Impl rule__DCLComponentInterface__Group__2 ;
    public final void rule__DCLComponentInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1948:1: ( rule__DCLComponentInterface__Group__1__Impl rule__DCLComponentInterface__Group__2 )
            // InternalDCL.g:1949:2: rule__DCLComponentInterface__Group__1__Impl rule__DCLComponentInterface__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__DCLComponentInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1956:1: rule__DCLComponentInterface__Group__1__Impl : ( ( rule__DCLComponentInterface__NameAssignment_1 ) ) ;
    public final void rule__DCLComponentInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1960:1: ( ( ( rule__DCLComponentInterface__NameAssignment_1 ) ) )
            // InternalDCL.g:1961:1: ( ( rule__DCLComponentInterface__NameAssignment_1 ) )
            {
            // InternalDCL.g:1961:1: ( ( rule__DCLComponentInterface__NameAssignment_1 ) )
            // InternalDCL.g:1962:1: ( rule__DCLComponentInterface__NameAssignment_1 )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getNameAssignment_1()); 
            // InternalDCL.g:1963:1: ( rule__DCLComponentInterface__NameAssignment_1 )
            // InternalDCL.g:1963:2: rule__DCLComponentInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1973:1: rule__DCLComponentInterface__Group__2 : rule__DCLComponentInterface__Group__2__Impl rule__DCLComponentInterface__Group__3 ;
    public final void rule__DCLComponentInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1977:1: ( rule__DCLComponentInterface__Group__2__Impl rule__DCLComponentInterface__Group__3 )
            // InternalDCL.g:1978:2: rule__DCLComponentInterface__Group__2__Impl rule__DCLComponentInterface__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__DCLComponentInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:1985:1: rule__DCLComponentInterface__Group__2__Impl : ( 'ofComponent ' ) ;
    public final void rule__DCLComponentInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:1989:1: ( ( 'ofComponent ' ) )
            // InternalDCL.g:1990:1: ( 'ofComponent ' )
            {
            // InternalDCL.g:1990:1: ( 'ofComponent ' )
            // InternalDCL.g:1991:1: 'ofComponent '
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getOfComponentKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalDCL.g:2004:1: rule__DCLComponentInterface__Group__3 : rule__DCLComponentInterface__Group__3__Impl rule__DCLComponentInterface__Group__4 ;
    public final void rule__DCLComponentInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2008:1: ( rule__DCLComponentInterface__Group__3__Impl rule__DCLComponentInterface__Group__4 )
            // InternalDCL.g:2009:2: rule__DCLComponentInterface__Group__3__Impl rule__DCLComponentInterface__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__DCLComponentInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2016:1: rule__DCLComponentInterface__Group__3__Impl : ( ( rule__DCLComponentInterface__ComponentAssignment_3 ) ) ;
    public final void rule__DCLComponentInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2020:1: ( ( ( rule__DCLComponentInterface__ComponentAssignment_3 ) ) )
            // InternalDCL.g:2021:1: ( ( rule__DCLComponentInterface__ComponentAssignment_3 ) )
            {
            // InternalDCL.g:2021:1: ( ( rule__DCLComponentInterface__ComponentAssignment_3 ) )
            // InternalDCL.g:2022:1: ( rule__DCLComponentInterface__ComponentAssignment_3 )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getComponentAssignment_3()); 
            // InternalDCL.g:2023:1: ( rule__DCLComponentInterface__ComponentAssignment_3 )
            // InternalDCL.g:2023:2: rule__DCLComponentInterface__ComponentAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2033:1: rule__DCLComponentInterface__Group__4 : rule__DCLComponentInterface__Group__4__Impl rule__DCLComponentInterface__Group__5 ;
    public final void rule__DCLComponentInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2037:1: ( rule__DCLComponentInterface__Group__4__Impl rule__DCLComponentInterface__Group__5 )
            // InternalDCL.g:2038:2: rule__DCLComponentInterface__Group__4__Impl rule__DCLComponentInterface__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__DCLComponentInterface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2045:1: rule__DCLComponentInterface__Group__4__Impl : ( ( rule__DCLComponentInterface__Group_4__0 ) ) ;
    public final void rule__DCLComponentInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2049:1: ( ( ( rule__DCLComponentInterface__Group_4__0 ) ) )
            // InternalDCL.g:2050:1: ( ( rule__DCLComponentInterface__Group_4__0 ) )
            {
            // InternalDCL.g:2050:1: ( ( rule__DCLComponentInterface__Group_4__0 ) )
            // InternalDCL.g:2051:1: ( rule__DCLComponentInterface__Group_4__0 )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getGroup_4()); 
            // InternalDCL.g:2052:1: ( rule__DCLComponentInterface__Group_4__0 )
            // InternalDCL.g:2052:2: rule__DCLComponentInterface__Group_4__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2062:1: rule__DCLComponentInterface__Group__5 : rule__DCLComponentInterface__Group__5__Impl ;
    public final void rule__DCLComponentInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2066:1: ( rule__DCLComponentInterface__Group__5__Impl )
            // InternalDCL.g:2067:2: rule__DCLComponentInterface__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2073:1: rule__DCLComponentInterface__Group__5__Impl : ( ';' ) ;
    public final void rule__DCLComponentInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2077:1: ( ( ';' ) )
            // InternalDCL.g:2078:1: ( ';' )
            {
            // InternalDCL.g:2078:1: ( ';' )
            // InternalDCL.g:2079:1: ';'
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getSemicolonKeyword_5()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDCL.g:2104:1: rule__DCLComponentInterface__Group_4__0 : rule__DCLComponentInterface__Group_4__0__Impl rule__DCLComponentInterface__Group_4__1 ;
    public final void rule__DCLComponentInterface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2108:1: ( rule__DCLComponentInterface__Group_4__0__Impl rule__DCLComponentInterface__Group_4__1 )
            // InternalDCL.g:2109:2: rule__DCLComponentInterface__Group_4__0__Impl rule__DCLComponentInterface__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__DCLComponentInterface__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2116:1: rule__DCLComponentInterface__Group_4__0__Impl : ( ',' ) ;
    public final void rule__DCLComponentInterface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2120:1: ( ( ',' ) )
            // InternalDCL.g:2121:1: ( ',' )
            {
            // InternalDCL.g:2121:1: ( ',' )
            // InternalDCL.g:2122:1: ','
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getCommaKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDCL.g:2135:1: rule__DCLComponentInterface__Group_4__1 : rule__DCLComponentInterface__Group_4__1__Impl rule__DCLComponentInterface__Group_4__2 ;
    public final void rule__DCLComponentInterface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2139:1: ( rule__DCLComponentInterface__Group_4__1__Impl rule__DCLComponentInterface__Group_4__2 )
            // InternalDCL.g:2140:2: rule__DCLComponentInterface__Group_4__1__Impl rule__DCLComponentInterface__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__DCLComponentInterface__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2147:1: rule__DCLComponentInterface__Group_4__1__Impl : ( 'type: ' ) ;
    public final void rule__DCLComponentInterface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2151:1: ( ( 'type: ' ) )
            // InternalDCL.g:2152:1: ( 'type: ' )
            {
            // InternalDCL.g:2152:1: ( 'type: ' )
            // InternalDCL.g:2153:1: 'type: '
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getTypeKeyword_4_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalDCL.g:2166:1: rule__DCLComponentInterface__Group_4__2 : rule__DCLComponentInterface__Group_4__2__Impl ;
    public final void rule__DCLComponentInterface__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2170:1: ( rule__DCLComponentInterface__Group_4__2__Impl )
            // InternalDCL.g:2171:2: rule__DCLComponentInterface__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2177:1: rule__DCLComponentInterface__Group_4__2__Impl : ( ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 ) ) ;
    public final void rule__DCLComponentInterface__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2181:1: ( ( ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 ) ) )
            // InternalDCL.g:2182:1: ( ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 ) )
            {
            // InternalDCL.g:2182:1: ( ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 ) )
            // InternalDCL.g:2183:1: ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeAssignment_4_2()); 
            // InternalDCL.g:2184:1: ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 )
            // InternalDCL.g:2184:2: rule__DCLComponentInterface__InterfaceTypeAssignment_4_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2200:1: rule__DCLSubSystem__Group__0 : rule__DCLSubSystem__Group__0__Impl rule__DCLSubSystem__Group__1 ;
    public final void rule__DCLSubSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2204:1: ( rule__DCLSubSystem__Group__0__Impl rule__DCLSubSystem__Group__1 )
            // InternalDCL.g:2205:2: rule__DCLSubSystem__Group__0__Impl rule__DCLSubSystem__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DCLSubSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2212:1: rule__DCLSubSystem__Group__0__Impl : ( 'subSystem' ) ;
    public final void rule__DCLSubSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2216:1: ( ( 'subSystem' ) )
            // InternalDCL.g:2217:1: ( 'subSystem' )
            {
            // InternalDCL.g:2217:1: ( 'subSystem' )
            // InternalDCL.g:2218:1: 'subSystem'
            {
             before(grammarAccess.getDCLSubSystemAccess().getSubSystemKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDCL.g:2231:1: rule__DCLSubSystem__Group__1 : rule__DCLSubSystem__Group__1__Impl rule__DCLSubSystem__Group__2 ;
    public final void rule__DCLSubSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2235:1: ( rule__DCLSubSystem__Group__1__Impl rule__DCLSubSystem__Group__2 )
            // InternalDCL.g:2236:2: rule__DCLSubSystem__Group__1__Impl rule__DCLSubSystem__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__DCLSubSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2243:1: rule__DCLSubSystem__Group__1__Impl : ( ( rule__DCLSubSystem__NameAssignment_1 ) ) ;
    public final void rule__DCLSubSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2247:1: ( ( ( rule__DCLSubSystem__NameAssignment_1 ) ) )
            // InternalDCL.g:2248:1: ( ( rule__DCLSubSystem__NameAssignment_1 ) )
            {
            // InternalDCL.g:2248:1: ( ( rule__DCLSubSystem__NameAssignment_1 ) )
            // InternalDCL.g:2249:1: ( rule__DCLSubSystem__NameAssignment_1 )
            {
             before(grammarAccess.getDCLSubSystemAccess().getNameAssignment_1()); 
            // InternalDCL.g:2250:1: ( rule__DCLSubSystem__NameAssignment_1 )
            // InternalDCL.g:2250:2: rule__DCLSubSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2260:1: rule__DCLSubSystem__Group__2 : rule__DCLSubSystem__Group__2__Impl rule__DCLSubSystem__Group__3 ;
    public final void rule__DCLSubSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2264:1: ( rule__DCLSubSystem__Group__2__Impl rule__DCLSubSystem__Group__3 )
            // InternalDCL.g:2265:2: rule__DCLSubSystem__Group__2__Impl rule__DCLSubSystem__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__DCLSubSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2272:1: rule__DCLSubSystem__Group__2__Impl : ( ( rule__DCLSubSystem__Group_2__0 )? ) ;
    public final void rule__DCLSubSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2276:1: ( ( ( rule__DCLSubSystem__Group_2__0 )? ) )
            // InternalDCL.g:2277:1: ( ( rule__DCLSubSystem__Group_2__0 )? )
            {
            // InternalDCL.g:2277:1: ( ( rule__DCLSubSystem__Group_2__0 )? )
            // InternalDCL.g:2278:1: ( rule__DCLSubSystem__Group_2__0 )?
            {
             before(grammarAccess.getDCLSubSystemAccess().getGroup_2()); 
            // InternalDCL.g:2279:1: ( rule__DCLSubSystem__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDCL.g:2279:2: rule__DCLSubSystem__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2289:1: rule__DCLSubSystem__Group__3 : rule__DCLSubSystem__Group__3__Impl ;
    public final void rule__DCLSubSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2293:1: ( rule__DCLSubSystem__Group__3__Impl )
            // InternalDCL.g:2294:2: rule__DCLSubSystem__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2300:1: rule__DCLSubSystem__Group__3__Impl : ( ';' ) ;
    public final void rule__DCLSubSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2304:1: ( ( ';' ) )
            // InternalDCL.g:2305:1: ( ';' )
            {
            // InternalDCL.g:2305:1: ( ';' )
            // InternalDCL.g:2306:1: ';'
            {
             before(grammarAccess.getDCLSubSystemAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDCL.g:2327:1: rule__DCLSubSystem__Group_2__0 : rule__DCLSubSystem__Group_2__0__Impl rule__DCLSubSystem__Group_2__1 ;
    public final void rule__DCLSubSystem__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2331:1: ( rule__DCLSubSystem__Group_2__0__Impl rule__DCLSubSystem__Group_2__1 )
            // InternalDCL.g:2332:2: rule__DCLSubSystem__Group_2__0__Impl rule__DCLSubSystem__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__DCLSubSystem__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2339:1: rule__DCLSubSystem__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DCLSubSystem__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2343:1: ( ( ',' ) )
            // InternalDCL.g:2344:1: ( ',' )
            {
            // InternalDCL.g:2344:1: ( ',' )
            // InternalDCL.g:2345:1: ','
            {
             before(grammarAccess.getDCLSubSystemAccess().getCommaKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDCL.g:2358:1: rule__DCLSubSystem__Group_2__1 : rule__DCLSubSystem__Group_2__1__Impl rule__DCLSubSystem__Group_2__2 ;
    public final void rule__DCLSubSystem__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2362:1: ( rule__DCLSubSystem__Group_2__1__Impl rule__DCLSubSystem__Group_2__2 )
            // InternalDCL.g:2363:2: rule__DCLSubSystem__Group_2__1__Impl rule__DCLSubSystem__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__DCLSubSystem__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2370:1: rule__DCLSubSystem__Group_2__1__Impl : ( 'inSubSystem: ' ) ;
    public final void rule__DCLSubSystem__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2374:1: ( ( 'inSubSystem: ' ) )
            // InternalDCL.g:2375:1: ( 'inSubSystem: ' )
            {
            // InternalDCL.g:2375:1: ( 'inSubSystem: ' )
            // InternalDCL.g:2376:1: 'inSubSystem: '
            {
             before(grammarAccess.getDCLSubSystemAccess().getInSubSystemKeyword_2_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDCL.g:2389:1: rule__DCLSubSystem__Group_2__2 : rule__DCLSubSystem__Group_2__2__Impl ;
    public final void rule__DCLSubSystem__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2393:1: ( rule__DCLSubSystem__Group_2__2__Impl )
            // InternalDCL.g:2394:2: rule__DCLSubSystem__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2400:1: rule__DCLSubSystem__Group_2__2__Impl : ( ( rule__DCLSubSystem__SubSystemAssignment_2_2 ) ) ;
    public final void rule__DCLSubSystem__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2404:1: ( ( ( rule__DCLSubSystem__SubSystemAssignment_2_2 ) ) )
            // InternalDCL.g:2405:1: ( ( rule__DCLSubSystem__SubSystemAssignment_2_2 ) )
            {
            // InternalDCL.g:2405:1: ( ( rule__DCLSubSystem__SubSystemAssignment_2_2 ) )
            // InternalDCL.g:2406:1: ( rule__DCLSubSystem__SubSystemAssignment_2_2 )
            {
             before(grammarAccess.getDCLSubSystemAccess().getSubSystemAssignment_2_2()); 
            // InternalDCL.g:2407:1: ( rule__DCLSubSystem__SubSystemAssignment_2_2 )
            // InternalDCL.g:2407:2: rule__DCLSubSystem__SubSystemAssignment_2_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2423:1: rule__DCLModule__Group__0 : rule__DCLModule__Group__0__Impl rule__DCLModule__Group__1 ;
    public final void rule__DCLModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2427:1: ( rule__DCLModule__Group__0__Impl rule__DCLModule__Group__1 )
            // InternalDCL.g:2428:2: rule__DCLModule__Group__0__Impl rule__DCLModule__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DCLModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2435:1: rule__DCLModule__Group__0__Impl : ( 'module' ) ;
    public final void rule__DCLModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2439:1: ( ( 'module' ) )
            // InternalDCL.g:2440:1: ( 'module' )
            {
            // InternalDCL.g:2440:1: ( 'module' )
            // InternalDCL.g:2441:1: 'module'
            {
             before(grammarAccess.getDCLModuleAccess().getModuleKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDCL.g:2454:1: rule__DCLModule__Group__1 : rule__DCLModule__Group__1__Impl rule__DCLModule__Group__2 ;
    public final void rule__DCLModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2458:1: ( rule__DCLModule__Group__1__Impl rule__DCLModule__Group__2 )
            // InternalDCL.g:2459:2: rule__DCLModule__Group__1__Impl rule__DCLModule__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__DCLModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2466:1: rule__DCLModule__Group__1__Impl : ( ( rule__DCLModule__NameAssignment_1 ) ) ;
    public final void rule__DCLModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2470:1: ( ( ( rule__DCLModule__NameAssignment_1 ) ) )
            // InternalDCL.g:2471:1: ( ( rule__DCLModule__NameAssignment_1 ) )
            {
            // InternalDCL.g:2471:1: ( ( rule__DCLModule__NameAssignment_1 ) )
            // InternalDCL.g:2472:1: ( rule__DCLModule__NameAssignment_1 )
            {
             before(grammarAccess.getDCLModuleAccess().getNameAssignment_1()); 
            // InternalDCL.g:2473:1: ( rule__DCLModule__NameAssignment_1 )
            // InternalDCL.g:2473:2: rule__DCLModule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2483:1: rule__DCLModule__Group__2 : rule__DCLModule__Group__2__Impl ;
    public final void rule__DCLModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2487:1: ( rule__DCLModule__Group__2__Impl )
            // InternalDCL.g:2488:2: rule__DCLModule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2494:1: rule__DCLModule__Group__2__Impl : ( ';' ) ;
    public final void rule__DCLModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2498:1: ( ( ';' ) )
            // InternalDCL.g:2499:1: ( ';' )
            {
            // InternalDCL.g:2499:1: ( ';' )
            // InternalDCL.g:2500:1: ';'
            {
             before(grammarAccess.getDCLModuleAccess().getSemicolonKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDCL.g:2519:1: rule__DCDecl__Group_0__0 : rule__DCDecl__Group_0__0__Impl rule__DCDecl__Group_0__1 ;
    public final void rule__DCDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2523:1: ( rule__DCDecl__Group_0__0__Impl rule__DCDecl__Group_0__1 )
            // InternalDCL.g:2524:2: rule__DCDecl__Group_0__0__Impl rule__DCDecl__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__DCDecl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2531:1: rule__DCDecl__Group_0__0__Impl : ( ( rule__DCDecl__OnlyAssignment_0_0 ) ) ;
    public final void rule__DCDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2535:1: ( ( ( rule__DCDecl__OnlyAssignment_0_0 ) ) )
            // InternalDCL.g:2536:1: ( ( rule__DCDecl__OnlyAssignment_0_0 ) )
            {
            // InternalDCL.g:2536:1: ( ( rule__DCDecl__OnlyAssignment_0_0 ) )
            // InternalDCL.g:2537:1: ( rule__DCDecl__OnlyAssignment_0_0 )
            {
             before(grammarAccess.getDCDeclAccess().getOnlyAssignment_0_0()); 
            // InternalDCL.g:2538:1: ( rule__DCDecl__OnlyAssignment_0_0 )
            // InternalDCL.g:2538:2: rule__DCDecl__OnlyAssignment_0_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2548:1: rule__DCDecl__Group_0__1 : rule__DCDecl__Group_0__1__Impl rule__DCDecl__Group_0__2 ;
    public final void rule__DCDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2552:1: ( rule__DCDecl__Group_0__1__Impl rule__DCDecl__Group_0__2 )
            // InternalDCL.g:2553:2: rule__DCDecl__Group_0__1__Impl rule__DCDecl__Group_0__2
            {
            pushFollow(FOLLOW_22);
            rule__DCDecl__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2560:1: rule__DCDecl__Group_0__1__Impl : ( ( rule__DCDecl__TAssignment_0_1 ) ) ;
    public final void rule__DCDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2564:1: ( ( ( rule__DCDecl__TAssignment_0_1 ) ) )
            // InternalDCL.g:2565:1: ( ( rule__DCDecl__TAssignment_0_1 ) )
            {
            // InternalDCL.g:2565:1: ( ( rule__DCDecl__TAssignment_0_1 ) )
            // InternalDCL.g:2566:1: ( rule__DCDecl__TAssignment_0_1 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_0_1()); 
            // InternalDCL.g:2567:1: ( rule__DCDecl__TAssignment_0_1 )
            // InternalDCL.g:2567:2: rule__DCDecl__TAssignment_0_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2577:1: rule__DCDecl__Group_0__2 : rule__DCDecl__Group_0__2__Impl rule__DCDecl__Group_0__3 ;
    public final void rule__DCDecl__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2581:1: ( rule__DCDecl__Group_0__2__Impl rule__DCDecl__Group_0__3 )
            // InternalDCL.g:2582:2: rule__DCDecl__Group_0__2__Impl rule__DCDecl__Group_0__3
            {
            pushFollow(FOLLOW_23);
            rule__DCDecl__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2589:1: rule__DCDecl__Group_0__2__Impl : ( ( rule__DCDecl__CanAssignment_0_2 ) ) ;
    public final void rule__DCDecl__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2593:1: ( ( ( rule__DCDecl__CanAssignment_0_2 ) ) )
            // InternalDCL.g:2594:1: ( ( rule__DCDecl__CanAssignment_0_2 ) )
            {
            // InternalDCL.g:2594:1: ( ( rule__DCDecl__CanAssignment_0_2 ) )
            // InternalDCL.g:2595:1: ( rule__DCDecl__CanAssignment_0_2 )
            {
             before(grammarAccess.getDCDeclAccess().getCanAssignment_0_2()); 
            // InternalDCL.g:2596:1: ( rule__DCDecl__CanAssignment_0_2 )
            // InternalDCL.g:2596:2: rule__DCDecl__CanAssignment_0_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2606:1: rule__DCDecl__Group_0__3 : rule__DCDecl__Group_0__3__Impl rule__DCDecl__Group_0__4 ;
    public final void rule__DCDecl__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2610:1: ( rule__DCDecl__Group_0__3__Impl rule__DCDecl__Group_0__4 )
            // InternalDCL.g:2611:2: rule__DCDecl__Group_0__3__Impl rule__DCDecl__Group_0__4
            {
            pushFollow(FOLLOW_10);
            rule__DCDecl__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2618:1: rule__DCDecl__Group_0__3__Impl : ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) ) ;
    public final void rule__DCDecl__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2622:1: ( ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) ) )
            // InternalDCL.g:2623:1: ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) )
            {
            // InternalDCL.g:2623:1: ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) )
            // InternalDCL.g:2624:1: ( rule__DCDecl__ElementTypeAssignment_0_3 )
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeAssignment_0_3()); 
            // InternalDCL.g:2625:1: ( rule__DCDecl__ElementTypeAssignment_0_3 )
            // InternalDCL.g:2625:2: rule__DCDecl__ElementTypeAssignment_0_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2635:1: rule__DCDecl__Group_0__4 : rule__DCDecl__Group_0__4__Impl rule__DCDecl__Group_0__5 ;
    public final void rule__DCDecl__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2639:1: ( rule__DCDecl__Group_0__4__Impl rule__DCDecl__Group_0__5 )
            // InternalDCL.g:2640:2: rule__DCDecl__Group_0__4__Impl rule__DCDecl__Group_0__5
            {
            pushFollow(FOLLOW_19);
            rule__DCDecl__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2647:1: rule__DCDecl__Group_0__4__Impl : ( ( rule__DCDecl__TypeAssignment_0_4 ) ) ;
    public final void rule__DCDecl__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2651:1: ( ( ( rule__DCDecl__TypeAssignment_0_4 ) ) )
            // InternalDCL.g:2652:1: ( ( rule__DCDecl__TypeAssignment_0_4 ) )
            {
            // InternalDCL.g:2652:1: ( ( rule__DCDecl__TypeAssignment_0_4 ) )
            // InternalDCL.g:2653:1: ( rule__DCDecl__TypeAssignment_0_4 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_0_4()); 
            // InternalDCL.g:2654:1: ( rule__DCDecl__TypeAssignment_0_4 )
            // InternalDCL.g:2654:2: rule__DCDecl__TypeAssignment_0_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2664:1: rule__DCDecl__Group_0__5 : rule__DCDecl__Group_0__5__Impl ;
    public final void rule__DCDecl__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2668:1: ( rule__DCDecl__Group_0__5__Impl )
            // InternalDCL.g:2669:2: rule__DCDecl__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2675:1: rule__DCDecl__Group_0__5__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2679:1: ( ( ';' ) )
            // InternalDCL.g:2680:1: ( ';' )
            {
            // InternalDCL.g:2680:1: ( ';' )
            // InternalDCL.g:2681:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_0_5()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDCL.g:2706:1: rule__DCDecl__Group_1__0 : rule__DCDecl__Group_1__0__Impl rule__DCDecl__Group_1__1 ;
    public final void rule__DCDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2710:1: ( rule__DCDecl__Group_1__0__Impl rule__DCDecl__Group_1__1 )
            // InternalDCL.g:2711:2: rule__DCDecl__Group_1__0__Impl rule__DCDecl__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__DCDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2718:1: rule__DCDecl__Group_1__0__Impl : ( ( rule__DCDecl__TAssignment_1_0 ) ) ;
    public final void rule__DCDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2722:1: ( ( ( rule__DCDecl__TAssignment_1_0 ) ) )
            // InternalDCL.g:2723:1: ( ( rule__DCDecl__TAssignment_1_0 ) )
            {
            // InternalDCL.g:2723:1: ( ( rule__DCDecl__TAssignment_1_0 ) )
            // InternalDCL.g:2724:1: ( rule__DCDecl__TAssignment_1_0 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_1_0()); 
            // InternalDCL.g:2725:1: ( rule__DCDecl__TAssignment_1_0 )
            // InternalDCL.g:2725:2: rule__DCDecl__TAssignment_1_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2735:1: rule__DCDecl__Group_1__1 : rule__DCDecl__Group_1__1__Impl rule__DCDecl__Group_1__2 ;
    public final void rule__DCDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2739:1: ( rule__DCDecl__Group_1__1__Impl rule__DCDecl__Group_1__2 )
            // InternalDCL.g:2740:2: rule__DCDecl__Group_1__1__Impl rule__DCDecl__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__DCDecl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2747:1: rule__DCDecl__Group_1__1__Impl : ( ( rule__DCDecl__CannotAssignment_1_1 ) ) ;
    public final void rule__DCDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2751:1: ( ( ( rule__DCDecl__CannotAssignment_1_1 ) ) )
            // InternalDCL.g:2752:1: ( ( rule__DCDecl__CannotAssignment_1_1 ) )
            {
            // InternalDCL.g:2752:1: ( ( rule__DCDecl__CannotAssignment_1_1 ) )
            // InternalDCL.g:2753:1: ( rule__DCDecl__CannotAssignment_1_1 )
            {
             before(grammarAccess.getDCDeclAccess().getCannotAssignment_1_1()); 
            // InternalDCL.g:2754:1: ( rule__DCDecl__CannotAssignment_1_1 )
            // InternalDCL.g:2754:2: rule__DCDecl__CannotAssignment_1_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2764:1: rule__DCDecl__Group_1__2 : rule__DCDecl__Group_1__2__Impl rule__DCDecl__Group_1__3 ;
    public final void rule__DCDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2768:1: ( rule__DCDecl__Group_1__2__Impl rule__DCDecl__Group_1__3 )
            // InternalDCL.g:2769:2: rule__DCDecl__Group_1__2__Impl rule__DCDecl__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__DCDecl__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2776:1: rule__DCDecl__Group_1__2__Impl : ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) ) ;
    public final void rule__DCDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2780:1: ( ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) ) )
            // InternalDCL.g:2781:1: ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) )
            {
            // InternalDCL.g:2781:1: ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) )
            // InternalDCL.g:2782:1: ( rule__DCDecl__ElementTypeAssignment_1_2 )
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeAssignment_1_2()); 
            // InternalDCL.g:2783:1: ( rule__DCDecl__ElementTypeAssignment_1_2 )
            // InternalDCL.g:2783:2: rule__DCDecl__ElementTypeAssignment_1_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2793:1: rule__DCDecl__Group_1__3 : rule__DCDecl__Group_1__3__Impl rule__DCDecl__Group_1__4 ;
    public final void rule__DCDecl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2797:1: ( rule__DCDecl__Group_1__3__Impl rule__DCDecl__Group_1__4 )
            // InternalDCL.g:2798:2: rule__DCDecl__Group_1__3__Impl rule__DCDecl__Group_1__4
            {
            pushFollow(FOLLOW_19);
            rule__DCDecl__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2805:1: rule__DCDecl__Group_1__3__Impl : ( ( rule__DCDecl__TypeAssignment_1_3 ) ) ;
    public final void rule__DCDecl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2809:1: ( ( ( rule__DCDecl__TypeAssignment_1_3 ) ) )
            // InternalDCL.g:2810:1: ( ( rule__DCDecl__TypeAssignment_1_3 ) )
            {
            // InternalDCL.g:2810:1: ( ( rule__DCDecl__TypeAssignment_1_3 ) )
            // InternalDCL.g:2811:1: ( rule__DCDecl__TypeAssignment_1_3 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_1_3()); 
            // InternalDCL.g:2812:1: ( rule__DCDecl__TypeAssignment_1_3 )
            // InternalDCL.g:2812:2: rule__DCDecl__TypeAssignment_1_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2822:1: rule__DCDecl__Group_1__4 : rule__DCDecl__Group_1__4__Impl ;
    public final void rule__DCDecl__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2826:1: ( rule__DCDecl__Group_1__4__Impl )
            // InternalDCL.g:2827:2: rule__DCDecl__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2833:1: rule__DCDecl__Group_1__4__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2837:1: ( ( ';' ) )
            // InternalDCL.g:2838:1: ( ';' )
            {
            // InternalDCL.g:2838:1: ( ';' )
            // InternalDCL.g:2839:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_1_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDCL.g:2862:1: rule__DCDecl__Group_2__0 : rule__DCDecl__Group_2__0__Impl rule__DCDecl__Group_2__1 ;
    public final void rule__DCDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2866:1: ( rule__DCDecl__Group_2__0__Impl rule__DCDecl__Group_2__1 )
            // InternalDCL.g:2867:2: rule__DCDecl__Group_2__0__Impl rule__DCDecl__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__DCDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2874:1: rule__DCDecl__Group_2__0__Impl : ( ( rule__DCDecl__TAssignment_2_0 ) ) ;
    public final void rule__DCDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2878:1: ( ( ( rule__DCDecl__TAssignment_2_0 ) ) )
            // InternalDCL.g:2879:1: ( ( rule__DCDecl__TAssignment_2_0 ) )
            {
            // InternalDCL.g:2879:1: ( ( rule__DCDecl__TAssignment_2_0 ) )
            // InternalDCL.g:2880:1: ( rule__DCDecl__TAssignment_2_0 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_2_0()); 
            // InternalDCL.g:2881:1: ( rule__DCDecl__TAssignment_2_0 )
            // InternalDCL.g:2881:2: rule__DCDecl__TAssignment_2_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2891:1: rule__DCDecl__Group_2__1 : rule__DCDecl__Group_2__1__Impl rule__DCDecl__Group_2__2 ;
    public final void rule__DCDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2895:1: ( rule__DCDecl__Group_2__1__Impl rule__DCDecl__Group_2__2 )
            // InternalDCL.g:2896:2: rule__DCDecl__Group_2__1__Impl rule__DCDecl__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__DCDecl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2903:1: rule__DCDecl__Group_2__1__Impl : ( ( rule__DCDecl__CanAssignment_2_1 ) ) ;
    public final void rule__DCDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2907:1: ( ( ( rule__DCDecl__CanAssignment_2_1 ) ) )
            // InternalDCL.g:2908:1: ( ( rule__DCDecl__CanAssignment_2_1 ) )
            {
            // InternalDCL.g:2908:1: ( ( rule__DCDecl__CanAssignment_2_1 ) )
            // InternalDCL.g:2909:1: ( rule__DCDecl__CanAssignment_2_1 )
            {
             before(grammarAccess.getDCDeclAccess().getCanAssignment_2_1()); 
            // InternalDCL.g:2910:1: ( rule__DCDecl__CanAssignment_2_1 )
            // InternalDCL.g:2910:2: rule__DCDecl__CanAssignment_2_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2920:1: rule__DCDecl__Group_2__2 : rule__DCDecl__Group_2__2__Impl rule__DCDecl__Group_2__3 ;
    public final void rule__DCDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2924:1: ( rule__DCDecl__Group_2__2__Impl rule__DCDecl__Group_2__3 )
            // InternalDCL.g:2925:2: rule__DCDecl__Group_2__2__Impl rule__DCDecl__Group_2__3
            {
            pushFollow(FOLLOW_10);
            rule__DCDecl__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2932:1: rule__DCDecl__Group_2__2__Impl : ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) ) ;
    public final void rule__DCDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2936:1: ( ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) ) )
            // InternalDCL.g:2937:1: ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) )
            {
            // InternalDCL.g:2937:1: ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) )
            // InternalDCL.g:2938:1: ( rule__DCDecl__ElementTypeAssignment_2_2 )
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeAssignment_2_2()); 
            // InternalDCL.g:2939:1: ( rule__DCDecl__ElementTypeAssignment_2_2 )
            // InternalDCL.g:2939:2: rule__DCDecl__ElementTypeAssignment_2_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2949:1: rule__DCDecl__Group_2__3 : rule__DCDecl__Group_2__3__Impl rule__DCDecl__Group_2__4 ;
    public final void rule__DCDecl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2953:1: ( rule__DCDecl__Group_2__3__Impl rule__DCDecl__Group_2__4 )
            // InternalDCL.g:2954:2: rule__DCDecl__Group_2__3__Impl rule__DCDecl__Group_2__4
            {
            pushFollow(FOLLOW_19);
            rule__DCDecl__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:2961:1: rule__DCDecl__Group_2__3__Impl : ( ( rule__DCDecl__TypeAssignment_2_3 ) ) ;
    public final void rule__DCDecl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2965:1: ( ( ( rule__DCDecl__TypeAssignment_2_3 ) ) )
            // InternalDCL.g:2966:1: ( ( rule__DCDecl__TypeAssignment_2_3 ) )
            {
            // InternalDCL.g:2966:1: ( ( rule__DCDecl__TypeAssignment_2_3 ) )
            // InternalDCL.g:2967:1: ( rule__DCDecl__TypeAssignment_2_3 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_2_3()); 
            // InternalDCL.g:2968:1: ( rule__DCDecl__TypeAssignment_2_3 )
            // InternalDCL.g:2968:2: rule__DCDecl__TypeAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__DCDecl__TypeAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTypeAssignment_2_3()); 

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
    // InternalDCL.g:2978:1: rule__DCDecl__Group_2__4 : rule__DCDecl__Group_2__4__Impl ;
    public final void rule__DCDecl__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2982:1: ( rule__DCDecl__Group_2__4__Impl )
            // InternalDCL.g:2983:2: rule__DCDecl__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DCDecl__Group_2__4__Impl();

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
    // InternalDCL.g:2989:1: rule__DCDecl__Group_2__4__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:2993:1: ( ( ';' ) )
            // InternalDCL.g:2994:1: ( ';' )
            {
            // InternalDCL.g:2994:1: ( ';' )
            // InternalDCL.g:2995:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_2_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDCDeclAccess().getSemicolonKeyword_2_4()); 

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


    // $ANTLR start "rule__DCDecl__Group_3__0"
    // InternalDCL.g:3018:1: rule__DCDecl__Group_3__0 : rule__DCDecl__Group_3__0__Impl rule__DCDecl__Group_3__1 ;
    public final void rule__DCDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3022:1: ( rule__DCDecl__Group_3__0__Impl rule__DCDecl__Group_3__1 )
            // InternalDCL.g:3023:2: rule__DCDecl__Group_3__0__Impl rule__DCDecl__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__DCDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:3030:1: rule__DCDecl__Group_3__0__Impl : ( ( rule__DCDecl__TAssignment_3_0 ) ) ;
    public final void rule__DCDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3034:1: ( ( ( rule__DCDecl__TAssignment_3_0 ) ) )
            // InternalDCL.g:3035:1: ( ( rule__DCDecl__TAssignment_3_0 ) )
            {
            // InternalDCL.g:3035:1: ( ( rule__DCDecl__TAssignment_3_0 ) )
            // InternalDCL.g:3036:1: ( rule__DCDecl__TAssignment_3_0 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_3_0()); 
            // InternalDCL.g:3037:1: ( rule__DCDecl__TAssignment_3_0 )
            // InternalDCL.g:3037:2: rule__DCDecl__TAssignment_3_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:3047:1: rule__DCDecl__Group_3__1 : rule__DCDecl__Group_3__1__Impl rule__DCDecl__Group_3__2 ;
    public final void rule__DCDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3051:1: ( rule__DCDecl__Group_3__1__Impl rule__DCDecl__Group_3__2 )
            // InternalDCL.g:3052:2: rule__DCDecl__Group_3__1__Impl rule__DCDecl__Group_3__2
            {
            pushFollow(FOLLOW_23);
            rule__DCDecl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:3059:1: rule__DCDecl__Group_3__1__Impl : ( ( rule__DCDecl__CanAssignment_3_1 ) ) ;
    public final void rule__DCDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3063:1: ( ( ( rule__DCDecl__CanAssignment_3_1 ) ) )
            // InternalDCL.g:3064:1: ( ( rule__DCDecl__CanAssignment_3_1 ) )
            {
            // InternalDCL.g:3064:1: ( ( rule__DCDecl__CanAssignment_3_1 ) )
            // InternalDCL.g:3065:1: ( rule__DCDecl__CanAssignment_3_1 )
            {
             before(grammarAccess.getDCDeclAccess().getCanAssignment_3_1()); 
            // InternalDCL.g:3066:1: ( rule__DCDecl__CanAssignment_3_1 )
            // InternalDCL.g:3066:2: rule__DCDecl__CanAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DCDecl__CanAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getCanAssignment_3_1()); 

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
    // InternalDCL.g:3076:1: rule__DCDecl__Group_3__2 : rule__DCDecl__Group_3__2__Impl rule__DCDecl__Group_3__3 ;
    public final void rule__DCDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3080:1: ( rule__DCDecl__Group_3__2__Impl rule__DCDecl__Group_3__3 )
            // InternalDCL.g:3081:2: rule__DCDecl__Group_3__2__Impl rule__DCDecl__Group_3__3
            {
            pushFollow(FOLLOW_25);
            rule__DCDecl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:3088:1: rule__DCDecl__Group_3__2__Impl : ( ( rule__DCDecl__ElementTypeAssignment_3_2 ) ) ;
    public final void rule__DCDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3092:1: ( ( ( rule__DCDecl__ElementTypeAssignment_3_2 ) ) )
            // InternalDCL.g:3093:1: ( ( rule__DCDecl__ElementTypeAssignment_3_2 ) )
            {
            // InternalDCL.g:3093:1: ( ( rule__DCDecl__ElementTypeAssignment_3_2 ) )
            // InternalDCL.g:3094:1: ( rule__DCDecl__ElementTypeAssignment_3_2 )
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeAssignment_3_2()); 
            // InternalDCL.g:3095:1: ( rule__DCDecl__ElementTypeAssignment_3_2 )
            // InternalDCL.g:3095:2: rule__DCDecl__ElementTypeAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__DCDecl__ElementTypeAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getElementTypeAssignment_3_2()); 

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
    // InternalDCL.g:3105:1: rule__DCDecl__Group_3__3 : rule__DCDecl__Group_3__3__Impl rule__DCDecl__Group_3__4 ;
    public final void rule__DCDecl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3109:1: ( rule__DCDecl__Group_3__3__Impl rule__DCDecl__Group_3__4 )
            // InternalDCL.g:3110:2: rule__DCDecl__Group_3__3__Impl rule__DCDecl__Group_3__4
            {
            pushFollow(FOLLOW_10);
            rule__DCDecl__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:3117:1: rule__DCDecl__Group_3__3__Impl : ( ( rule__DCDecl__Only2Assignment_3_3 ) ) ;
    public final void rule__DCDecl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3121:1: ( ( ( rule__DCDecl__Only2Assignment_3_3 ) ) )
            // InternalDCL.g:3122:1: ( ( rule__DCDecl__Only2Assignment_3_3 ) )
            {
            // InternalDCL.g:3122:1: ( ( rule__DCDecl__Only2Assignment_3_3 ) )
            // InternalDCL.g:3123:1: ( rule__DCDecl__Only2Assignment_3_3 )
            {
             before(grammarAccess.getDCDeclAccess().getOnly2Assignment_3_3()); 
            // InternalDCL.g:3124:1: ( rule__DCDecl__Only2Assignment_3_3 )
            // InternalDCL.g:3124:2: rule__DCDecl__Only2Assignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__DCDecl__Only2Assignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getOnly2Assignment_3_3()); 

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
    // InternalDCL.g:3134:1: rule__DCDecl__Group_3__4 : rule__DCDecl__Group_3__4__Impl rule__DCDecl__Group_3__5 ;
    public final void rule__DCDecl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3138:1: ( rule__DCDecl__Group_3__4__Impl rule__DCDecl__Group_3__5 )
            // InternalDCL.g:3139:2: rule__DCDecl__Group_3__4__Impl rule__DCDecl__Group_3__5
            {
            pushFollow(FOLLOW_19);
            rule__DCDecl__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DCDecl__Group_3__5();

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
    // InternalDCL.g:3146:1: rule__DCDecl__Group_3__4__Impl : ( ( rule__DCDecl__TypeAssignment_3_4 ) ) ;
    public final void rule__DCDecl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3150:1: ( ( ( rule__DCDecl__TypeAssignment_3_4 ) ) )
            // InternalDCL.g:3151:1: ( ( rule__DCDecl__TypeAssignment_3_4 ) )
            {
            // InternalDCL.g:3151:1: ( ( rule__DCDecl__TypeAssignment_3_4 ) )
            // InternalDCL.g:3152:1: ( rule__DCDecl__TypeAssignment_3_4 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_3_4()); 
            // InternalDCL.g:3153:1: ( rule__DCDecl__TypeAssignment_3_4 )
            // InternalDCL.g:3153:2: rule__DCDecl__TypeAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__DCDecl__TypeAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTypeAssignment_3_4()); 

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


    // $ANTLR start "rule__DCDecl__Group_3__5"
    // InternalDCL.g:3163:1: rule__DCDecl__Group_3__5 : rule__DCDecl__Group_3__5__Impl ;
    public final void rule__DCDecl__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3167:1: ( rule__DCDecl__Group_3__5__Impl )
            // InternalDCL.g:3168:2: rule__DCDecl__Group_3__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DCDecl__Group_3__5__Impl();

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
    // $ANTLR end "rule__DCDecl__Group_3__5"


    // $ANTLR start "rule__DCDecl__Group_3__5__Impl"
    // InternalDCL.g:3174:1: rule__DCDecl__Group_3__5__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3178:1: ( ( ';' ) )
            // InternalDCL.g:3179:1: ( ';' )
            {
            // InternalDCL.g:3179:1: ( ';' )
            // InternalDCL.g:3180:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_3_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDCDeclAccess().getSemicolonKeyword_3_5()); 

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
    // $ANTLR end "rule__DCDecl__Group_3__5__Impl"


    // $ANTLR start "rule__DCDecl__Group_4__0"
    // InternalDCL.g:3205:1: rule__DCDecl__Group_4__0 : rule__DCDecl__Group_4__0__Impl rule__DCDecl__Group_4__1 ;
    public final void rule__DCDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3209:1: ( rule__DCDecl__Group_4__0__Impl rule__DCDecl__Group_4__1 )
            // InternalDCL.g:3210:2: rule__DCDecl__Group_4__0__Impl rule__DCDecl__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__DCDecl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DCDecl__Group_4__1();

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
    // $ANTLR end "rule__DCDecl__Group_4__0"


    // $ANTLR start "rule__DCDecl__Group_4__0__Impl"
    // InternalDCL.g:3217:1: rule__DCDecl__Group_4__0__Impl : ( ( rule__DCDecl__TAssignment_4_0 ) ) ;
    public final void rule__DCDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3221:1: ( ( ( rule__DCDecl__TAssignment_4_0 ) ) )
            // InternalDCL.g:3222:1: ( ( rule__DCDecl__TAssignment_4_0 ) )
            {
            // InternalDCL.g:3222:1: ( ( rule__DCDecl__TAssignment_4_0 ) )
            // InternalDCL.g:3223:1: ( rule__DCDecl__TAssignment_4_0 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_4_0()); 
            // InternalDCL.g:3224:1: ( rule__DCDecl__TAssignment_4_0 )
            // InternalDCL.g:3224:2: rule__DCDecl__TAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__DCDecl__TAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTAssignment_4_0()); 

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
    // $ANTLR end "rule__DCDecl__Group_4__0__Impl"


    // $ANTLR start "rule__DCDecl__Group_4__1"
    // InternalDCL.g:3234:1: rule__DCDecl__Group_4__1 : rule__DCDecl__Group_4__1__Impl rule__DCDecl__Group_4__2 ;
    public final void rule__DCDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3238:1: ( rule__DCDecl__Group_4__1__Impl rule__DCDecl__Group_4__2 )
            // InternalDCL.g:3239:2: rule__DCDecl__Group_4__1__Impl rule__DCDecl__Group_4__2
            {
            pushFollow(FOLLOW_23);
            rule__DCDecl__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DCDecl__Group_4__2();

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
    // $ANTLR end "rule__DCDecl__Group_4__1"


    // $ANTLR start "rule__DCDecl__Group_4__1__Impl"
    // InternalDCL.g:3246:1: rule__DCDecl__Group_4__1__Impl : ( ( rule__DCDecl__MustAssignment_4_1 ) ) ;
    public final void rule__DCDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3250:1: ( ( ( rule__DCDecl__MustAssignment_4_1 ) ) )
            // InternalDCL.g:3251:1: ( ( rule__DCDecl__MustAssignment_4_1 ) )
            {
            // InternalDCL.g:3251:1: ( ( rule__DCDecl__MustAssignment_4_1 ) )
            // InternalDCL.g:3252:1: ( rule__DCDecl__MustAssignment_4_1 )
            {
             before(grammarAccess.getDCDeclAccess().getMustAssignment_4_1()); 
            // InternalDCL.g:3253:1: ( rule__DCDecl__MustAssignment_4_1 )
            // InternalDCL.g:3253:2: rule__DCDecl__MustAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DCDecl__MustAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getMustAssignment_4_1()); 

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
    // $ANTLR end "rule__DCDecl__Group_4__1__Impl"


    // $ANTLR start "rule__DCDecl__Group_4__2"
    // InternalDCL.g:3263:1: rule__DCDecl__Group_4__2 : rule__DCDecl__Group_4__2__Impl rule__DCDecl__Group_4__3 ;
    public final void rule__DCDecl__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3267:1: ( rule__DCDecl__Group_4__2__Impl rule__DCDecl__Group_4__3 )
            // InternalDCL.g:3268:2: rule__DCDecl__Group_4__2__Impl rule__DCDecl__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__DCDecl__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DCDecl__Group_4__3();

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
    // $ANTLR end "rule__DCDecl__Group_4__2"


    // $ANTLR start "rule__DCDecl__Group_4__2__Impl"
    // InternalDCL.g:3275:1: rule__DCDecl__Group_4__2__Impl : ( ( rule__DCDecl__EntityTypeAssignment_4_2 ) ) ;
    public final void rule__DCDecl__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3279:1: ( ( ( rule__DCDecl__EntityTypeAssignment_4_2 ) ) )
            // InternalDCL.g:3280:1: ( ( rule__DCDecl__EntityTypeAssignment_4_2 ) )
            {
            // InternalDCL.g:3280:1: ( ( rule__DCDecl__EntityTypeAssignment_4_2 ) )
            // InternalDCL.g:3281:1: ( rule__DCDecl__EntityTypeAssignment_4_2 )
            {
             before(grammarAccess.getDCDeclAccess().getEntityTypeAssignment_4_2()); 
            // InternalDCL.g:3282:1: ( rule__DCDecl__EntityTypeAssignment_4_2 )
            // InternalDCL.g:3282:2: rule__DCDecl__EntityTypeAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__DCDecl__EntityTypeAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getEntityTypeAssignment_4_2()); 

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
    // $ANTLR end "rule__DCDecl__Group_4__2__Impl"


    // $ANTLR start "rule__DCDecl__Group_4__3"
    // InternalDCL.g:3292:1: rule__DCDecl__Group_4__3 : rule__DCDecl__Group_4__3__Impl rule__DCDecl__Group_4__4 ;
    public final void rule__DCDecl__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3296:1: ( rule__DCDecl__Group_4__3__Impl rule__DCDecl__Group_4__4 )
            // InternalDCL.g:3297:2: rule__DCDecl__Group_4__3__Impl rule__DCDecl__Group_4__4
            {
            pushFollow(FOLLOW_19);
            rule__DCDecl__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DCDecl__Group_4__4();

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
    // $ANTLR end "rule__DCDecl__Group_4__3"


    // $ANTLR start "rule__DCDecl__Group_4__3__Impl"
    // InternalDCL.g:3304:1: rule__DCDecl__Group_4__3__Impl : ( ( rule__DCDecl__TypeAssignment_4_3 ) ) ;
    public final void rule__DCDecl__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3308:1: ( ( ( rule__DCDecl__TypeAssignment_4_3 ) ) )
            // InternalDCL.g:3309:1: ( ( rule__DCDecl__TypeAssignment_4_3 ) )
            {
            // InternalDCL.g:3309:1: ( ( rule__DCDecl__TypeAssignment_4_3 ) )
            // InternalDCL.g:3310:1: ( rule__DCDecl__TypeAssignment_4_3 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_4_3()); 
            // InternalDCL.g:3311:1: ( rule__DCDecl__TypeAssignment_4_3 )
            // InternalDCL.g:3311:2: rule__DCDecl__TypeAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__DCDecl__TypeAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTypeAssignment_4_3()); 

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
    // $ANTLR end "rule__DCDecl__Group_4__3__Impl"


    // $ANTLR start "rule__DCDecl__Group_4__4"
    // InternalDCL.g:3321:1: rule__DCDecl__Group_4__4 : rule__DCDecl__Group_4__4__Impl ;
    public final void rule__DCDecl__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3325:1: ( rule__DCDecl__Group_4__4__Impl )
            // InternalDCL.g:3326:2: rule__DCDecl__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DCDecl__Group_4__4__Impl();

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
    // $ANTLR end "rule__DCDecl__Group_4__4"


    // $ANTLR start "rule__DCDecl__Group_4__4__Impl"
    // InternalDCL.g:3332:1: rule__DCDecl__Group_4__4__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3336:1: ( ( ';' ) )
            // InternalDCL.g:3337:1: ( ';' )
            {
            // InternalDCL.g:3337:1: ( ';' )
            // InternalDCL.g:3338:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_4_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDCDeclAccess().getSemicolonKeyword_4_4()); 

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
    // $ANTLR end "rule__DCDecl__Group_4__4__Impl"


    // $ANTLR start "rule__Model__StructureElementsAssignment_2"
    // InternalDCL.g:3362:1: rule__Model__StructureElementsAssignment_2 : ( ruleDCLStructureElement ) ;
    public final void rule__Model__StructureElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3366:1: ( ( ruleDCLStructureElement ) )
            // InternalDCL.g:3367:1: ( ruleDCLStructureElement )
            {
            // InternalDCL.g:3367:1: ( ruleDCLStructureElement )
            // InternalDCL.g:3368:1: ruleDCLStructureElement
            {
             before(grammarAccess.getModelAccess().getStructureElementsDCLStructureElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:3377:1: rule__Model__DCDeclAssignment_6 : ( ruleDCDecl ) ;
    public final void rule__Model__DCDeclAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3381:1: ( ( ruleDCDecl ) )
            // InternalDCL.g:3382:1: ( ruleDCDecl )
            {
            // InternalDCL.g:3382:1: ( ruleDCDecl )
            // InternalDCL.g:3383:1: ruleDCDecl
            {
             before(grammarAccess.getModelAccess().getDCDeclDCDeclParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:3392:1: rule__DCLLayer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLLayer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3396:1: ( ( RULE_ID ) )
            // InternalDCL.g:3397:1: ( RULE_ID )
            {
            // InternalDCL.g:3397:1: ( RULE_ID )
            // InternalDCL.g:3398:1: RULE_ID
            {
             before(grammarAccess.getDCLLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3407:1: rule__DCLLayer__LevelAssignment_4 : ( RULE_INT ) ;
    public final void rule__DCLLayer__LevelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3411:1: ( ( RULE_INT ) )
            // InternalDCL.g:3412:1: ( RULE_INT )
            {
            // InternalDCL.g:3412:1: ( RULE_INT )
            // InternalDCL.g:3413:1: RULE_INT
            {
             before(grammarAccess.getDCLLayerAccess().getLevelINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalDCL.g:3422:1: rule__DCLLayer__LayerAssignment_5_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__DCLLayer__LayerAssignment_5_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3426:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:3427:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:3427:1: ( ( RULE_ID ) )
            // InternalDCL.g:3428:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLLayerAccess().getLayerDCLStructureElementCrossReference_5_0_2_0()); 
            // InternalDCL.g:3429:1: ( RULE_ID )
            // InternalDCL.g:3430:1: RULE_ID
            {
             before(grammarAccess.getDCLLayerAccess().getLayerDCLStructureElementIDTerminalRuleCall_5_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3441:1: rule__DCLLayer__SubSystemAssignment_5_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__DCLLayer__SubSystemAssignment_5_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3445:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:3446:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:3446:1: ( ( RULE_ID ) )
            // InternalDCL.g:3447:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLLayerAccess().getSubSystemDCLStructureElementCrossReference_5_1_2_0()); 
            // InternalDCL.g:3448:1: ( RULE_ID )
            // InternalDCL.g:3449:1: RULE_ID
            {
             before(grammarAccess.getDCLLayerAccess().getSubSystemDCLStructureElementIDTerminalRuleCall_5_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3460:1: rule__DCLLayer__ComponentAssignment_5_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__DCLLayer__ComponentAssignment_5_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3464:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:3465:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:3465:1: ( ( RULE_ID ) )
            // InternalDCL.g:3466:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLLayerAccess().getComponentDCLStructureElementCrossReference_5_2_2_0()); 
            // InternalDCL.g:3467:1: ( RULE_ID )
            // InternalDCL.g:3468:1: RULE_ID
            {
             before(grammarAccess.getDCLLayerAccess().getComponentDCLStructureElementIDTerminalRuleCall_5_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3479:1: rule__DCLComponent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3483:1: ( ( RULE_ID ) )
            // InternalDCL.g:3484:1: ( RULE_ID )
            {
            // InternalDCL.g:3484:1: ( RULE_ID )
            // InternalDCL.g:3485:1: RULE_ID
            {
             before(grammarAccess.getDCLComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3494:1: rule__DCLComponent__LayerAssignment_2_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__DCLComponent__LayerAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3498:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:3499:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:3499:1: ( ( RULE_ID ) )
            // InternalDCL.g:3500:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLComponentAccess().getLayerDCLStructureElementCrossReference_2_0_2_0()); 
            // InternalDCL.g:3501:1: ( RULE_ID )
            // InternalDCL.g:3502:1: RULE_ID
            {
             before(grammarAccess.getDCLComponentAccess().getLayerDCLStructureElementIDTerminalRuleCall_2_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3513:1: rule__DCLComponent__SubSystemAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__DCLComponent__SubSystemAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3517:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:3518:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:3518:1: ( ( RULE_ID ) )
            // InternalDCL.g:3519:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLComponentAccess().getSubSystemDCLStructureElementCrossReference_2_1_2_0()); 
            // InternalDCL.g:3520:1: ( RULE_ID )
            // InternalDCL.g:3521:1: RULE_ID
            {
             before(grammarAccess.getDCLComponentAccess().getSubSystemDCLStructureElementIDTerminalRuleCall_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3532:1: rule__DCLComponentInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLComponentInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3536:1: ( ( RULE_ID ) )
            // InternalDCL.g:3537:1: ( RULE_ID )
            {
            // InternalDCL.g:3537:1: ( RULE_ID )
            // InternalDCL.g:3538:1: RULE_ID
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3547:1: rule__DCLComponentInterface__ComponentAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DCLComponentInterface__ComponentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3551:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:3552:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:3552:1: ( ( RULE_ID ) )
            // InternalDCL.g:3553:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getComponentDCLStructureElementCrossReference_3_0()); 
            // InternalDCL.g:3554:1: ( RULE_ID )
            // InternalDCL.g:3555:1: RULE_ID
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getComponentDCLStructureElementIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3566:1: rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 : ( ruleInterfaceType ) ;
    public final void rule__DCLComponentInterface__InterfaceTypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3570:1: ( ( ruleInterfaceType ) )
            // InternalDCL.g:3571:1: ( ruleInterfaceType )
            {
            // InternalDCL.g:3571:1: ( ruleInterfaceType )
            // InternalDCL.g:3572:1: ruleInterfaceType
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeInterfaceTypeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:3581:1: rule__InterfaceType__InterfaceTypeNameAssignment : ( ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 ) ) ;
    public final void rule__InterfaceType__InterfaceTypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3585:1: ( ( ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 ) ) )
            // InternalDCL.g:3586:1: ( ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 ) )
            {
            // InternalDCL.g:3586:1: ( ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 ) )
            // InternalDCL.g:3587:1: ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 )
            {
             before(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameAlternatives_0()); 
            // InternalDCL.g:3588:1: ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 )
            // InternalDCL.g:3588:2: rule__InterfaceType__InterfaceTypeNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:3597:1: rule__DCLSubSystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLSubSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3601:1: ( ( RULE_ID ) )
            // InternalDCL.g:3602:1: ( RULE_ID )
            {
            // InternalDCL.g:3602:1: ( RULE_ID )
            // InternalDCL.g:3603:1: RULE_ID
            {
             before(grammarAccess.getDCLSubSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3612:1: rule__DCLSubSystem__SubSystemAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__DCLSubSystem__SubSystemAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3616:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:3617:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:3617:1: ( ( RULE_ID ) )
            // InternalDCL.g:3618:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLSubSystemAccess().getSubSystemDCLStructureElementCrossReference_2_2_0()); 
            // InternalDCL.g:3619:1: ( RULE_ID )
            // InternalDCL.g:3620:1: RULE_ID
            {
             before(grammarAccess.getDCLSubSystemAccess().getSubSystemDCLStructureElementIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3631:1: rule__DCLModule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3635:1: ( ( RULE_ID ) )
            // InternalDCL.g:3636:1: ( RULE_ID )
            {
            // InternalDCL.g:3636:1: ( RULE_ID )
            // InternalDCL.g:3637:1: RULE_ID
            {
             before(grammarAccess.getDCLModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3646:1: rule__DCDecl__OnlyAssignment_0_0 : ( ruleOnly ) ;
    public final void rule__DCDecl__OnlyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3650:1: ( ( ruleOnly ) )
            // InternalDCL.g:3651:1: ( ruleOnly )
            {
            // InternalDCL.g:3651:1: ( ruleOnly )
            // InternalDCL.g:3652:1: ruleOnly
            {
             before(grammarAccess.getDCDeclAccess().getOnlyOnlyParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:3661:1: rule__DCDecl__TAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3665:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:3666:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:3666:1: ( ( RULE_ID ) )
            // InternalDCL.g:3667:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_0_1_0()); 
            // InternalDCL.g:3668:1: ( RULE_ID )
            // InternalDCL.g:3669:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3680:1: rule__DCDecl__CanAssignment_0_2 : ( ruleCan ) ;
    public final void rule__DCDecl__CanAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3684:1: ( ( ruleCan ) )
            // InternalDCL.g:3685:1: ( ruleCan )
            {
            // InternalDCL.g:3685:1: ( ruleCan )
            // InternalDCL.g:3686:1: ruleCan
            {
             before(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:3695:1: rule__DCDecl__ElementTypeAssignment_0_3 : ( ruleElementType ) ;
    public final void rule__DCDecl__ElementTypeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3699:1: ( ( ruleElementType ) )
            // InternalDCL.g:3700:1: ( ruleElementType )
            {
            // InternalDCL.g:3700:1: ( ruleElementType )
            // InternalDCL.g:3701:1: ruleElementType
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:3710:1: rule__DCDecl__TypeAssignment_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3714:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:3715:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:3715:1: ( ( RULE_ID ) )
            // InternalDCL.g:3716:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_0_4_0()); 
            // InternalDCL.g:3717:1: ( RULE_ID )
            // InternalDCL.g:3718:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3729:1: rule__DCDecl__TAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3733:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:3734:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:3734:1: ( ( RULE_ID ) )
            // InternalDCL.g:3735:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_1_0_0()); 
            // InternalDCL.g:3736:1: ( RULE_ID )
            // InternalDCL.g:3737:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3748:1: rule__DCDecl__CannotAssignment_1_1 : ( ruleCannot ) ;
    public final void rule__DCDecl__CannotAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3752:1: ( ( ruleCannot ) )
            // InternalDCL.g:3753:1: ( ruleCannot )
            {
            // InternalDCL.g:3753:1: ( ruleCannot )
            // InternalDCL.g:3754:1: ruleCannot
            {
             before(grammarAccess.getDCDeclAccess().getCannotCannotParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:3763:1: rule__DCDecl__ElementTypeAssignment_1_2 : ( ruleElementType ) ;
    public final void rule__DCDecl__ElementTypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3767:1: ( ( ruleElementType ) )
            // InternalDCL.g:3768:1: ( ruleElementType )
            {
            // InternalDCL.g:3768:1: ( ruleElementType )
            // InternalDCL.g:3769:1: ruleElementType
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:3778:1: rule__DCDecl__TypeAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3782:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:3783:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:3783:1: ( ( RULE_ID ) )
            // InternalDCL.g:3784:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_1_3_0()); 
            // InternalDCL.g:3785:1: ( RULE_ID )
            // InternalDCL.g:3786:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3797:1: rule__DCDecl__TAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3801:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:3802:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:3802:1: ( ( RULE_ID ) )
            // InternalDCL.g:3803:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_2_0_0()); 
            // InternalDCL.g:3804:1: ( RULE_ID )
            // InternalDCL.g:3805:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDCL.g:3816:1: rule__DCDecl__CanAssignment_2_1 : ( ruleCan ) ;
    public final void rule__DCDecl__CanAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3820:1: ( ( ruleCan ) )
            // InternalDCL.g:3821:1: ( ruleCan )
            {
            // InternalDCL.g:3821:1: ( ruleCan )
            // InternalDCL.g:3822:1: ruleCan
            {
             before(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:3831:1: rule__DCDecl__ElementTypeAssignment_2_2 : ( ruleElementType ) ;
    public final void rule__DCDecl__ElementTypeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3835:1: ( ( ruleElementType ) )
            // InternalDCL.g:3836:1: ( ruleElementType )
            {
            // InternalDCL.g:3836:1: ( ruleElementType )
            // InternalDCL.g:3837:1: ruleElementType
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__DCDecl__TypeAssignment_2_3"
    // InternalDCL.g:3846:1: rule__DCDecl__TypeAssignment_2_3 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3850:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:3851:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:3851:1: ( ( RULE_ID ) )
            // InternalDCL.g:3852:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_2_3_0()); 
            // InternalDCL.g:3853:1: ( RULE_ID )
            // InternalDCL.g:3854:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_2_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_2_3_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_2_3_0()); 

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
    // $ANTLR end "rule__DCDecl__TypeAssignment_2_3"


    // $ANTLR start "rule__DCDecl__TAssignment_3_0"
    // InternalDCL.g:3865:1: rule__DCDecl__TAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3869:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:3870:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:3870:1: ( ( RULE_ID ) )
            // InternalDCL.g:3871:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_3_0_0()); 
            // InternalDCL.g:3872:1: ( RULE_ID )
            // InternalDCL.g:3873:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__DCDecl__CanAssignment_3_1"
    // InternalDCL.g:3884:1: rule__DCDecl__CanAssignment_3_1 : ( ruleCan ) ;
    public final void rule__DCDecl__CanAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3888:1: ( ( ruleCan ) )
            // InternalDCL.g:3889:1: ( ruleCan )
            {
            // InternalDCL.g:3889:1: ( ruleCan )
            // InternalDCL.g:3890:1: ruleCan
            {
             before(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCan();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__DCDecl__CanAssignment_3_1"


    // $ANTLR start "rule__DCDecl__ElementTypeAssignment_3_2"
    // InternalDCL.g:3899:1: rule__DCDecl__ElementTypeAssignment_3_2 : ( ruleElementType ) ;
    public final void rule__DCDecl__ElementTypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3903:1: ( ( ruleElementType ) )
            // InternalDCL.g:3904:1: ( ruleElementType )
            {
            // InternalDCL.g:3904:1: ( ruleElementType )
            // InternalDCL.g:3905:1: ruleElementType
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__DCDecl__ElementTypeAssignment_3_2"


    // $ANTLR start "rule__DCDecl__Only2Assignment_3_3"
    // InternalDCL.g:3914:1: rule__DCDecl__Only2Assignment_3_3 : ( ruleOnly2 ) ;
    public final void rule__DCDecl__Only2Assignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3918:1: ( ( ruleOnly2 ) )
            // InternalDCL.g:3919:1: ( ruleOnly2 )
            {
            // InternalDCL.g:3919:1: ( ruleOnly2 )
            // InternalDCL.g:3920:1: ruleOnly2
            {
             before(grammarAccess.getDCDeclAccess().getOnly2Only2ParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOnly2();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getOnly2Only2ParserRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__DCDecl__Only2Assignment_3_3"


    // $ANTLR start "rule__DCDecl__TypeAssignment_3_4"
    // InternalDCL.g:3929:1: rule__DCDecl__TypeAssignment_3_4 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3933:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:3934:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:3934:1: ( ( RULE_ID ) )
            // InternalDCL.g:3935:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_3_4_0()); 
            // InternalDCL.g:3936:1: ( RULE_ID )
            // InternalDCL.g:3937:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_3_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_3_4_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_3_4_0()); 

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
    // $ANTLR end "rule__DCDecl__TypeAssignment_3_4"


    // $ANTLR start "rule__DCDecl__TAssignment_4_0"
    // InternalDCL.g:3948:1: rule__DCDecl__TAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3952:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:3953:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:3953:1: ( ( RULE_ID ) )
            // InternalDCL.g:3954:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_4_0_0()); 
            // InternalDCL.g:3955:1: ( RULE_ID )
            // InternalDCL.g:3956:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_4_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_4_0_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_4_0_0()); 

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
    // $ANTLR end "rule__DCDecl__TAssignment_4_0"


    // $ANTLR start "rule__DCDecl__MustAssignment_4_1"
    // InternalDCL.g:3967:1: rule__DCDecl__MustAssignment_4_1 : ( ruleMust ) ;
    public final void rule__DCDecl__MustAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3971:1: ( ( ruleMust ) )
            // InternalDCL.g:3972:1: ( ruleMust )
            {
            // InternalDCL.g:3972:1: ( ruleMust )
            // InternalDCL.g:3973:1: ruleMust
            {
             before(grammarAccess.getDCDeclAccess().getMustMustParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMust();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getMustMustParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__DCDecl__MustAssignment_4_1"


    // $ANTLR start "rule__DCDecl__EntityTypeAssignment_4_2"
    // InternalDCL.g:3982:1: rule__DCDecl__EntityTypeAssignment_4_2 : ( ruleEntityType ) ;
    public final void rule__DCDecl__EntityTypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:3986:1: ( ( ruleEntityType ) )
            // InternalDCL.g:3987:1: ( ruleEntityType )
            {
            // InternalDCL.g:3987:1: ( ruleEntityType )
            // InternalDCL.g:3988:1: ruleEntityType
            {
             before(grammarAccess.getDCDeclAccess().getEntityTypeEntityTypeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getEntityTypeEntityTypeParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__DCDecl__EntityTypeAssignment_4_2"


    // $ANTLR start "rule__DCDecl__TypeAssignment_4_3"
    // InternalDCL.g:3997:1: rule__DCDecl__TypeAssignment_4_3 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:4001:1: ( ( ( RULE_ID ) ) )
            // InternalDCL.g:4002:1: ( ( RULE_ID ) )
            {
            // InternalDCL.g:4002:1: ( ( RULE_ID ) )
            // InternalDCL.g:4003:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_4_3_0()); 
            // InternalDCL.g:4004:1: ( RULE_ID )
            // InternalDCL.g:4005:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_4_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_4_3_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_4_3_0()); 

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
    // $ANTLR end "rule__DCDecl__TypeAssignment_4_3"


    // $ANTLR start "rule__Only__OnlyAssignment"
    // InternalDCL.g:4016:1: rule__Only__OnlyAssignment : ( ( 'only' ) ) ;
    public final void rule__Only__OnlyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:4020:1: ( ( ( 'only' ) ) )
            // InternalDCL.g:4021:1: ( ( 'only' ) )
            {
            // InternalDCL.g:4021:1: ( ( 'only' ) )
            // InternalDCL.g:4022:1: ( 'only' )
            {
             before(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0()); 
            // InternalDCL.g:4023:1: ( 'only' )
            // InternalDCL.g:4024:1: 'only'
            {
             before(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalDCL.g:4039:1: rule__Can__CanAssignment : ( ( 'can-' ) ) ;
    public final void rule__Can__CanAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:4043:1: ( ( ( 'can-' ) ) )
            // InternalDCL.g:4044:1: ( ( 'can-' ) )
            {
            // InternalDCL.g:4044:1: ( ( 'can-' ) )
            // InternalDCL.g:4045:1: ( 'can-' )
            {
             before(grammarAccess.getCanAccess().getCanCanKeyword_0()); 
            // InternalDCL.g:4046:1: ( 'can-' )
            // InternalDCL.g:4047:1: 'can-'
            {
             before(grammarAccess.getCanAccess().getCanCanKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDCL.g:4062:1: rule__Cannot__CannotAssignment : ( ( 'cannot-' ) ) ;
    public final void rule__Cannot__CannotAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:4066:1: ( ( ( 'cannot-' ) ) )
            // InternalDCL.g:4067:1: ( ( 'cannot-' ) )
            {
            // InternalDCL.g:4067:1: ( ( 'cannot-' ) )
            // InternalDCL.g:4068:1: ( 'cannot-' )
            {
             before(grammarAccess.getCannotAccess().getCannotCannotKeyword_0()); 
            // InternalDCL.g:4069:1: ( 'cannot-' )
            // InternalDCL.g:4070:1: 'cannot-'
            {
             before(grammarAccess.getCannotAccess().getCannotCannotKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalDCL.g:4085:1: rule__Only2__Only2Assignment : ( ( '-only' ) ) ;
    public final void rule__Only2__Only2Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:4089:1: ( ( ( '-only' ) ) )
            // InternalDCL.g:4090:1: ( ( '-only' ) )
            {
            // InternalDCL.g:4090:1: ( ( '-only' ) )
            // InternalDCL.g:4091:1: ( '-only' )
            {
             before(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0()); 
            // InternalDCL.g:4092:1: ( '-only' )
            // InternalDCL.g:4093:1: '-only'
            {
             before(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalDCL.g:4108:1: rule__Must__MustAssignment : ( ( 'must-' ) ) ;
    public final void rule__Must__MustAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:4112:1: ( ( ( 'must-' ) ) )
            // InternalDCL.g:4113:1: ( ( 'must-' ) )
            {
            // InternalDCL.g:4113:1: ( ( 'must-' ) )
            // InternalDCL.g:4114:1: ( 'must-' )
            {
             before(grammarAccess.getMustAccess().getMustMustKeyword_0()); 
            // InternalDCL.g:4115:1: ( 'must-' )
            // InternalDCL.g:4116:1: 'must-'
            {
             before(grammarAccess.getMustAccess().getMustMustKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalDCL.g:4131:1: rule__BasicType__TypeNameAssignment : ( ( rule__BasicType__TypeNameAlternatives_0 ) ) ;
    public final void rule__BasicType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:4135:1: ( ( ( rule__BasicType__TypeNameAlternatives_0 ) ) )
            // InternalDCL.g:4136:1: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            {
            // InternalDCL.g:4136:1: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            // InternalDCL.g:4137:1: ( rule__BasicType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 
            // InternalDCL.g:4138:1: ( rule__BasicType__TypeNameAlternatives_0 )
            // InternalDCL.g:4138:2: rule__BasicType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDCL.g:4147:1: rule__EntityType__EntityAssignment : ( ( rule__EntityType__EntityAlternatives_0 ) ) ;
    public final void rule__EntityType__EntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDCL.g:4151:1: ( ( ( rule__EntityType__EntityAlternatives_0 ) ) )
            // InternalDCL.g:4152:1: ( ( rule__EntityType__EntityAlternatives_0 ) )
            {
            // InternalDCL.g:4152:1: ( ( rule__EntityType__EntityAlternatives_0 ) )
            // InternalDCL.g:4153:1: ( rule__EntityType__EntityAlternatives_0 )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityAlternatives_0()); 
            // InternalDCL.g:4154:1: ( rule__EntityType__EntityAlternatives_0 )
            // InternalDCL.g:4154:2: rule__EntityType__EntityAlternatives_0
            {
            pushFollow(FOLLOW_2);
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


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\51\1\uffff\1\15\1\uffff\12\4\2\uffff";
    static final String dfa_3s = "\1\50\1\uffff\1\54\1\uffff\1\26\1\uffff\12\53\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\uffff\1\5\12\uffff\1\3\1\4";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\43\uffff\1\1",
            "",
            "\1\4\1\3\1\uffff\1\5",
            "",
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "",
            "\1\20\46\uffff\1\21",
            "\1\20\46\uffff\1\21",
            "\1\20\46\uffff\1\21",
            "\1\20\46\uffff\1\21",
            "\1\20\46\uffff\1\21",
            "\1\20\46\uffff\1\21",
            "\1\20\46\uffff\1\21",
            "\1\20\46\uffff\1\21",
            "\1\20\46\uffff\1\21",
            "\1\20\46\uffff\1\21",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "652:1: rule__DCDecl__Alternatives : ( ( ( rule__DCDecl__Group_0__0 ) ) | ( ( rule__DCDecl__Group_1__0 ) ) | ( ( rule__DCDecl__Group_2__0 ) ) | ( ( rule__DCDecl__Group_3__0 ) ) | ( ( rule__DCDecl__Group_4__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000CC08000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000CC08000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000010002000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L});

}