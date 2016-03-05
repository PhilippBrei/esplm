package org.pklose.espl.ui.contentassist.antlr.internal; 

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
import org.pklose.espl.services.EsplmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEsplmParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Include'", "'Exclude'", "'J'", "'F'", "'BizToBiz'", "'SrcToBiz'", "'BizToOut'", "'1..N'", "'0..N'", "'1'", "'Flow'", "'{'", "'}'", "'Activity'", "'Description'", "'Successors'", "'['", "']'", "','", "'Calls'", "'BusinessRule'", "'type'", "'Input'", "'Output'", "'prim\\u00E4r'", "'='", "'obligatorisch'", "'mehrfach'", "'join Pfad'", "'Pfad'", "'SourceSystem'", "'SystemEntit\\u00E4t'", "'Format'", "'Import'", "'.*'", "'Diagram'", "'with'", "'Enumeration'", "'.'", "'Entity'", "'Domain'", "'Description: '", "'Relation'", "':'", "'Field'", "'Enum'", "'Decimal'", "'Money'", "'Text'", "'Boolean'", "'Int'"
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
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
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


        public InternalEsplmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEsplmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEsplmParser.tokenNames; }
    public String getGrammarFileName() { return "../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g"; }


     
     	private EsplmGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EsplmGrammarAccess grammarAccess) {
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:61:1: ( ruleModel EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:62:1: ruleModel EOF
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:69:1: ruleModel : ( ( rule__Model__ElementsAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:73:2: ( ( ( rule__Model__ElementsAssignment ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:74:1: ( ( rule__Model__ElementsAssignment ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:74:1: ( ( rule__Model__ElementsAssignment ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:75:1: ( rule__Model__ElementsAssignment )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:76:1: ( rule__Model__ElementsAssignment )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:76:2: rule__Model__ElementsAssignment
            {
            pushFollow(FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94);
            rule__Model__ElementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleElement"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:88:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:89:1: ( ruleElement EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:90:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement121);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement128); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:97:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:101:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:102:1: ( ( rule__Element__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:102:1: ( ( rule__Element__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:103:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:104:1: ( rule__Element__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:104:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement154);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleFlow"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:116:1: entryRuleFlow : ruleFlow EOF ;
    public final void entryRuleFlow() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:117:1: ( ruleFlow EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:118:1: ruleFlow EOF
            {
             before(grammarAccess.getFlowRule()); 
            pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow181);
            ruleFlow();

            state._fsp--;

             after(grammarAccess.getFlowRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlow188); 

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
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:125:1: ruleFlow : ( ( rule__Flow__Group__0 ) ) ;
    public final void ruleFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:129:2: ( ( ( rule__Flow__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:130:1: ( ( rule__Flow__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:130:1: ( ( rule__Flow__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:131:1: ( rule__Flow__Group__0 )
            {
             before(grammarAccess.getFlowAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:132:1: ( rule__Flow__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:132:2: rule__Flow__Group__0
            {
            pushFollow(FOLLOW_rule__Flow__Group__0_in_ruleFlow214);
            rule__Flow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleActivity"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:144:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:145:1: ( ruleActivity EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:146:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity241);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity248); 

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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:153:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:157:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:158:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:158:1: ( ( rule__Activity__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:159:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:160:1: ( rule__Activity__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:160:2: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_rule__Activity__Group__0_in_ruleActivity274);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleBusinessRule"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:172:1: entryRuleBusinessRule : ruleBusinessRule EOF ;
    public final void entryRuleBusinessRule() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:173:1: ( ruleBusinessRule EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:174:1: ruleBusinessRule EOF
            {
             before(grammarAccess.getBusinessRuleRule()); 
            pushFollow(FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule301);
            ruleBusinessRule();

            state._fsp--;

             after(grammarAccess.getBusinessRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessRule308); 

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
    // $ANTLR end "entryRuleBusinessRule"


    // $ANTLR start "ruleBusinessRule"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:181:1: ruleBusinessRule : ( ( rule__BusinessRule__Alternatives ) ) ;
    public final void ruleBusinessRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:185:2: ( ( ( rule__BusinessRule__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:186:1: ( ( rule__BusinessRule__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:186:1: ( ( rule__BusinessRule__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:187:1: ( rule__BusinessRule__Alternatives )
            {
             before(grammarAccess.getBusinessRuleAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:188:1: ( rule__BusinessRule__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:188:2: rule__BusinessRule__Alternatives
            {
            pushFollow(FOLLOW_rule__BusinessRule__Alternatives_in_ruleBusinessRule334);
            rule__BusinessRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBusinessRule"


    // $ANTLR start "entryRuleBreSystemEntityInput"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:200:1: entryRuleBreSystemEntityInput : ruleBreSystemEntityInput EOF ;
    public final void entryRuleBreSystemEntityInput() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:201:1: ( ruleBreSystemEntityInput EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:202:1: ruleBreSystemEntityInput EOF
            {
             before(grammarAccess.getBreSystemEntityInputRule()); 
            pushFollow(FOLLOW_ruleBreSystemEntityInput_in_entryRuleBreSystemEntityInput361);
            ruleBreSystemEntityInput();

            state._fsp--;

             after(grammarAccess.getBreSystemEntityInputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreSystemEntityInput368); 

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
    // $ANTLR end "entryRuleBreSystemEntityInput"


    // $ANTLR start "ruleBreSystemEntityInput"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:209:1: ruleBreSystemEntityInput : ( ( rule__BreSystemEntityInput__Group__0 ) ) ;
    public final void ruleBreSystemEntityInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:213:2: ( ( ( rule__BreSystemEntityInput__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:214:1: ( ( rule__BreSystemEntityInput__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:214:1: ( ( rule__BreSystemEntityInput__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:215:1: ( rule__BreSystemEntityInput__Group__0 )
            {
             before(grammarAccess.getBreSystemEntityInputAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:216:1: ( rule__BreSystemEntityInput__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:216:2: rule__BreSystemEntityInput__Group__0
            {
            pushFollow(FOLLOW_rule__BreSystemEntityInput__Group__0_in_ruleBreSystemEntityInput394);
            rule__BreSystemEntityInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBreSystemEntityInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBreSystemEntityInput"


    // $ANTLR start "entryRuleBreEntityInput"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:228:1: entryRuleBreEntityInput : ruleBreEntityInput EOF ;
    public final void entryRuleBreEntityInput() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:229:1: ( ruleBreEntityInput EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:230:1: ruleBreEntityInput EOF
            {
             before(grammarAccess.getBreEntityInputRule()); 
            pushFollow(FOLLOW_ruleBreEntityInput_in_entryRuleBreEntityInput421);
            ruleBreEntityInput();

            state._fsp--;

             after(grammarAccess.getBreEntityInputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreEntityInput428); 

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
    // $ANTLR end "entryRuleBreEntityInput"


    // $ANTLR start "ruleBreEntityInput"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:237:1: ruleBreEntityInput : ( ( rule__BreEntityInput__Group__0 ) ) ;
    public final void ruleBreEntityInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:241:2: ( ( ( rule__BreEntityInput__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:242:1: ( ( rule__BreEntityInput__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:242:1: ( ( rule__BreEntityInput__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:243:1: ( rule__BreEntityInput__Group__0 )
            {
             before(grammarAccess.getBreEntityInputAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:244:1: ( rule__BreEntityInput__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:244:2: rule__BreEntityInput__Group__0
            {
            pushFollow(FOLLOW_rule__BreEntityInput__Group__0_in_ruleBreEntityInput454);
            rule__BreEntityInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBreEntityInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBreEntityInput"


    // $ANTLR start "entryRuleSystemEntityConfiguration"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:256:1: entryRuleSystemEntityConfiguration : ruleSystemEntityConfiguration EOF ;
    public final void entryRuleSystemEntityConfiguration() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:257:1: ( ruleSystemEntityConfiguration EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:258:1: ruleSystemEntityConfiguration EOF
            {
             before(grammarAccess.getSystemEntityConfigurationRule()); 
            pushFollow(FOLLOW_ruleSystemEntityConfiguration_in_entryRuleSystemEntityConfiguration481);
            ruleSystemEntityConfiguration();

            state._fsp--;

             after(grammarAccess.getSystemEntityConfigurationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemEntityConfiguration488); 

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
    // $ANTLR end "entryRuleSystemEntityConfiguration"


    // $ANTLR start "ruleSystemEntityConfiguration"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:265:1: ruleSystemEntityConfiguration : ( ( rule__SystemEntityConfiguration__Group__0 ) ) ;
    public final void ruleSystemEntityConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:269:2: ( ( ( rule__SystemEntityConfiguration__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:270:1: ( ( rule__SystemEntityConfiguration__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:270:1: ( ( rule__SystemEntityConfiguration__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:271:1: ( rule__SystemEntityConfiguration__Group__0 )
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:272:1: ( rule__SystemEntityConfiguration__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:272:2: rule__SystemEntityConfiguration__Group__0
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__0_in_ruleSystemEntityConfiguration514);
            rule__SystemEntityConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemEntityConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemEntityConfiguration"


    // $ANTLR start "entryRuleEntityConfiguration"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:284:1: entryRuleEntityConfiguration : ruleEntityConfiguration EOF ;
    public final void entryRuleEntityConfiguration() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:285:1: ( ruleEntityConfiguration EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:286:1: ruleEntityConfiguration EOF
            {
             before(grammarAccess.getEntityConfigurationRule()); 
            pushFollow(FOLLOW_ruleEntityConfiguration_in_entryRuleEntityConfiguration541);
            ruleEntityConfiguration();

            state._fsp--;

             after(grammarAccess.getEntityConfigurationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityConfiguration548); 

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
    // $ANTLR end "entryRuleEntityConfiguration"


    // $ANTLR start "ruleEntityConfiguration"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:293:1: ruleEntityConfiguration : ( ( rule__EntityConfiguration__Group__0 ) ) ;
    public final void ruleEntityConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:297:2: ( ( ( rule__EntityConfiguration__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:298:1: ( ( rule__EntityConfiguration__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:298:1: ( ( rule__EntityConfiguration__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:299:1: ( rule__EntityConfiguration__Group__0 )
            {
             before(grammarAccess.getEntityConfigurationAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:300:1: ( rule__EntityConfiguration__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:300:2: rule__EntityConfiguration__Group__0
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__0_in_ruleEntityConfiguration574);
            rule__EntityConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityConfiguration"


    // $ANTLR start "entryRuleSystem"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:312:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:313:1: ( ruleSystem EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:314:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem601);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem608); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:321:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:325:2: ( ( ( rule__System__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:326:1: ( ( rule__System__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:326:1: ( ( rule__System__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:327:1: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:328:1: ( rule__System__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:328:2: rule__System__Group__0
            {
            pushFollow(FOLLOW_rule__System__Group__0_in_ruleSystem634);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleSystemEntity"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:340:1: entryRuleSystemEntity : ruleSystemEntity EOF ;
    public final void entryRuleSystemEntity() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:341:1: ( ruleSystemEntity EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:342:1: ruleSystemEntity EOF
            {
             before(grammarAccess.getSystemEntityRule()); 
            pushFollow(FOLLOW_ruleSystemEntity_in_entryRuleSystemEntity661);
            ruleSystemEntity();

            state._fsp--;

             after(grammarAccess.getSystemEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemEntity668); 

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
    // $ANTLR end "entryRuleSystemEntity"


    // $ANTLR start "ruleSystemEntity"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:349:1: ruleSystemEntity : ( ( rule__SystemEntity__Group__0 ) ) ;
    public final void ruleSystemEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:353:2: ( ( ( rule__SystemEntity__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:354:1: ( ( rule__SystemEntity__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:354:1: ( ( rule__SystemEntity__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:355:1: ( rule__SystemEntity__Group__0 )
            {
             before(grammarAccess.getSystemEntityAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:356:1: ( rule__SystemEntity__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:356:2: rule__SystemEntity__Group__0
            {
            pushFollow(FOLLOW_rule__SystemEntity__Group__0_in_ruleSystemEntity694);
            rule__SystemEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemEntity"


    // $ANTLR start "entryRuleImport"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:368:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:369:1: ( ruleImport EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:370:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport721);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport728); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:377:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:381:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:382:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:382:1: ( ( rule__Import__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:383:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:384:1: ( rule__Import__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:384:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport754);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleFqnWithWildCard"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:396:1: entryRuleFqnWithWildCard : ruleFqnWithWildCard EOF ;
    public final void entryRuleFqnWithWildCard() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:397:1: ( ruleFqnWithWildCard EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:398:1: ruleFqnWithWildCard EOF
            {
             before(grammarAccess.getFqnWithWildCardRule()); 
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard781);
            ruleFqnWithWildCard();

            state._fsp--;

             after(grammarAccess.getFqnWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqnWithWildCard788); 

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
    // $ANTLR end "entryRuleFqnWithWildCard"


    // $ANTLR start "ruleFqnWithWildCard"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:405:1: ruleFqnWithWildCard : ( ( rule__FqnWithWildCard__Group__0 ) ) ;
    public final void ruleFqnWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:409:2: ( ( ( rule__FqnWithWildCard__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:410:1: ( ( rule__FqnWithWildCard__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:410:1: ( ( rule__FqnWithWildCard__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:411:1: ( rule__FqnWithWildCard__Group__0 )
            {
             before(grammarAccess.getFqnWithWildCardAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:412:1: ( rule__FqnWithWildCard__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:412:2: rule__FqnWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__0_in_ruleFqnWithWildCard814);
            rule__FqnWithWildCard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFqnWithWildCardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFqnWithWildCard"


    // $ANTLR start "entryRuleDiagram"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:424:1: entryRuleDiagram : ruleDiagram EOF ;
    public final void entryRuleDiagram() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:425:1: ( ruleDiagram EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:426:1: ruleDiagram EOF
            {
             before(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_ruleDiagram_in_entryRuleDiagram841);
            ruleDiagram();

            state._fsp--;

             after(grammarAccess.getDiagramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagram848); 

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
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:433:1: ruleDiagram : ( ( rule__Diagram__Group__0 ) ) ;
    public final void ruleDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:437:2: ( ( ( rule__Diagram__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:438:1: ( ( rule__Diagram__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:438:1: ( ( rule__Diagram__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:439:1: ( rule__Diagram__Group__0 )
            {
             before(grammarAccess.getDiagramAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:440:1: ( rule__Diagram__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:440:2: rule__Diagram__Group__0
            {
            pushFollow(FOLLOW_rule__Diagram__Group__0_in_ruleDiagram874);
            rule__Diagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleInclude"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:452:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:453:1: ( ruleInclude EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:454:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude901);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude908); 

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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:461:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:465:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:466:1: ( ( rule__Include__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:466:1: ( ( rule__Include__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:467:1: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:468:1: ( rule__Include__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:468:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude934);
            rule__Include__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleEnumDeclaration"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:480:1: entryRuleEnumDeclaration : ruleEnumDeclaration EOF ;
    public final void entryRuleEnumDeclaration() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:481:1: ( ruleEnumDeclaration EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:482:1: ruleEnumDeclaration EOF
            {
             before(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration961);
            ruleEnumDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDeclaration968); 

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
    // $ANTLR end "entryRuleEnumDeclaration"


    // $ANTLR start "ruleEnumDeclaration"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:489:1: ruleEnumDeclaration : ( ( rule__EnumDeclaration__Group__0 ) ) ;
    public final void ruleEnumDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:493:2: ( ( ( rule__EnumDeclaration__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:494:1: ( ( rule__EnumDeclaration__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:494:1: ( ( rule__EnumDeclaration__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:495:1: ( rule__EnumDeclaration__Group__0 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:496:1: ( rule__EnumDeclaration__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:496:2: rule__EnumDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__0_in_ruleEnumDeclaration994);
            rule__EnumDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumDeclaration"


    // $ANTLR start "entryRuleFQN"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:508:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:509:1: ( ruleFQN EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:510:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1021);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1028); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:517:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:521:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:522:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:522:1: ( ( rule__FQN__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:523:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:524:1: ( rule__FQN__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:524:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN1054);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEntity"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:536:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:537:1: ( ruleEntity EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:538:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1081);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1088); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:545:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:549:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:550:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:550:1: ( ( rule__Entity__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:551:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:552:1: ( rule__Entity__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:552:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity1114);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleDomain"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:564:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:565:1: ( ruleDomain EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:566:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain1141);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain1148); 

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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:573:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:577:2: ( ( ( rule__Domain__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:578:1: ( ( rule__Domain__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:578:1: ( ( rule__Domain__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:579:1: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:580:1: ( rule__Domain__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:580:2: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_rule__Domain__Group__0_in_ruleDomain1174);
            rule__Domain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleProperty"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:592:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:593:1: ( ruleProperty EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:594:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1201);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1208); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:601:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:605:2: ( ( ( rule__Property__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:606:1: ( ( rule__Property__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:606:1: ( ( rule__Property__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:607:1: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:608:1: ( rule__Property__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:608:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_in_ruleProperty1234);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAssociation"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:620:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:621:1: ( ruleAssociation EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:622:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation1261);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation1268); 

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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:629:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:633:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:634:1: ( ( rule__Association__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:634:1: ( ( rule__Association__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:635:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:636:1: ( rule__Association__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:636:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_rule__Association__Group__0_in_ruleAssociation1294);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleField"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:648:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:649:1: ( ruleField EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:650:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1321);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1328); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:657:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:661:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:662:1: ( ( rule__Field__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:662:1: ( ( rule__Field__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:663:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:664:1: ( rule__Field__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:664:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField1354);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleLiteral"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:676:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:677:1: ( ruleLiteral EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:678:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1381);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1388); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:685:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:689:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:690:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:690:1: ( ( rule__Literal__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:691:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:692:1: ( rule__Literal__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:692:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1414);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleEnum"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:704:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:705:1: ( ruleEnum EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:706:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum1441);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum1448); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:713:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:717:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:718:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:718:1: ( ( rule__Enum__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:719:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:720:1: ( rule__Enum__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:720:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum1474);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "ruleBoolean"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:733:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:737:1: ( ( ( rule__Boolean__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:738:1: ( ( rule__Boolean__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:738:1: ( ( rule__Boolean__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:739:1: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:740:1: ( rule__Boolean__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:740:2: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean1511);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleBREType"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:752:1: ruleBREType : ( ( rule__BREType__Alternatives ) ) ;
    public final void ruleBREType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:756:1: ( ( ( rule__BREType__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:757:1: ( ( rule__BREType__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:757:1: ( ( rule__BREType__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:758:1: ( rule__BREType__Alternatives )
            {
             before(grammarAccess.getBRETypeAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:759:1: ( rule__BREType__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:759:2: rule__BREType__Alternatives
            {
            pushFollow(FOLLOW_rule__BREType__Alternatives_in_ruleBREType1547);
            rule__BREType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBRETypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBREType"


    // $ANTLR start "ruleMultiplicty"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:771:1: ruleMultiplicty : ( ( rule__Multiplicty__Alternatives ) ) ;
    public final void ruleMultiplicty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:775:1: ( ( ( rule__Multiplicty__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:776:1: ( ( rule__Multiplicty__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:776:1: ( ( rule__Multiplicty__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:777:1: ( rule__Multiplicty__Alternatives )
            {
             before(grammarAccess.getMultiplictyAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:778:1: ( rule__Multiplicty__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:778:2: rule__Multiplicty__Alternatives
            {
            pushFollow(FOLLOW_rule__Multiplicty__Alternatives_in_ruleMultiplicty1583);
            rule__Multiplicty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplictyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicty"


    // $ANTLR start "rule__Element__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:789:1: rule__Element__Alternatives : ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) | ( ruleFlow ) | ( ruleBusinessRule ) | ( ruleSystem ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:793:1: ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) | ( ruleFlow ) | ( ruleBusinessRule ) | ( ruleSystem ) )
            int alt1=6;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:794:1: ( ruleEnumDeclaration )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:794:1: ( ruleEnumDeclaration )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:795:1: ruleEnumDeclaration
                    {
                     before(grammarAccess.getElementAccess().getEnumDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEnumDeclaration_in_rule__Element__Alternatives1618);
                    ruleEnumDeclaration();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getEnumDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:800:6: ( ruleDiagram )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:800:6: ( ruleDiagram )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:801:1: ruleDiagram
                    {
                     before(grammarAccess.getElementAccess().getDiagramParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDiagram_in_rule__Element__Alternatives1635);
                    ruleDiagram();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDiagramParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:806:6: ( ruleDomain )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:806:6: ( ruleDomain )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:807:1: ruleDomain
                    {
                     before(grammarAccess.getElementAccess().getDomainParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDomain_in_rule__Element__Alternatives1652);
                    ruleDomain();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDomainParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:812:6: ( ruleFlow )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:812:6: ( ruleFlow )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:813:1: ruleFlow
                    {
                     before(grammarAccess.getElementAccess().getFlowParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFlow_in_rule__Element__Alternatives1669);
                    ruleFlow();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getFlowParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:818:6: ( ruleBusinessRule )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:818:6: ( ruleBusinessRule )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:819:1: ruleBusinessRule
                    {
                     before(grammarAccess.getElementAccess().getBusinessRuleParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBusinessRule_in_rule__Element__Alternatives1686);
                    ruleBusinessRule();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getBusinessRuleParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:824:6: ( ruleSystem )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:824:6: ( ruleSystem )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:825:1: ruleSystem
                    {
                     before(grammarAccess.getElementAccess().getSystemParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleSystem_in_rule__Element__Alternatives1703);
                    ruleSystem();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSystemParserRuleCall_5()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__BusinessRule__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:835:1: rule__BusinessRule__Alternatives : ( ( ( rule__BusinessRule__Group_0__0 ) ) | ( ( rule__BusinessRule__Group_1__0 ) ) );
    public final void rule__BusinessRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:839:1: ( ( ( rule__BusinessRule__Group_0__0 ) ) | ( ( rule__BusinessRule__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31||LA2_0==44) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:840:1: ( ( rule__BusinessRule__Group_0__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:840:1: ( ( rule__BusinessRule__Group_0__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:841:1: ( rule__BusinessRule__Group_0__0 )
                    {
                     before(grammarAccess.getBusinessRuleAccess().getGroup_0()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:842:1: ( rule__BusinessRule__Group_0__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:842:2: rule__BusinessRule__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BusinessRule__Group_0__0_in_rule__BusinessRule__Alternatives1735);
                    rule__BusinessRule__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBusinessRuleAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:846:6: ( ( rule__BusinessRule__Group_1__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:846:6: ( ( rule__BusinessRule__Group_1__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:847:1: ( rule__BusinessRule__Group_1__0 )
                    {
                     before(grammarAccess.getBusinessRuleAccess().getGroup_1()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:848:1: ( rule__BusinessRule__Group_1__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:848:2: rule__BusinessRule__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BusinessRule__Group_1__0_in_rule__BusinessRule__Alternatives1753);
                    rule__BusinessRule__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBusinessRuleAccess().getGroup_1()); 

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
    // $ANTLR end "rule__BusinessRule__Alternatives"


    // $ANTLR start "rule__BusinessRule__SystemInputsAlternatives_0_8_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:857:1: rule__BusinessRule__SystemInputsAlternatives_0_8_0 : ( ( ruleBreSystemEntityInput ) | ( ruleBreEntityInput ) );
    public final void rule__BusinessRule__SystemInputsAlternatives_0_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:861:1: ( ( ruleBreSystemEntityInput ) | ( ruleBreEntityInput ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:862:1: ( ruleBreSystemEntityInput )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:862:1: ( ruleBreSystemEntityInput )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:863:1: ruleBreSystemEntityInput
                    {
                     before(grammarAccess.getBusinessRuleAccess().getSystemInputsBreSystemEntityInputParserRuleCall_0_8_0_0()); 
                    pushFollow(FOLLOW_ruleBreSystemEntityInput_in_rule__BusinessRule__SystemInputsAlternatives_0_8_01786);
                    ruleBreSystemEntityInput();

                    state._fsp--;

                     after(grammarAccess.getBusinessRuleAccess().getSystemInputsBreSystemEntityInputParserRuleCall_0_8_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:868:6: ( ruleBreEntityInput )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:868:6: ( ruleBreEntityInput )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:869:1: ruleBreEntityInput
                    {
                     before(grammarAccess.getBusinessRuleAccess().getSystemInputsBreEntityInputParserRuleCall_0_8_0_1()); 
                    pushFollow(FOLLOW_ruleBreEntityInput_in_rule__BusinessRule__SystemInputsAlternatives_0_8_01803);
                    ruleBreEntityInput();

                    state._fsp--;

                     after(grammarAccess.getBusinessRuleAccess().getSystemInputsBreEntityInputParserRuleCall_0_8_0_1()); 

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
    // $ANTLR end "rule__BusinessRule__SystemInputsAlternatives_0_8_0"


    // $ANTLR start "rule__Include__IncludeAlternatives_0_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:879:1: rule__Include__IncludeAlternatives_0_0 : ( ( 'Include' ) | ( 'Exclude' ) );
    public final void rule__Include__IncludeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:883:1: ( ( 'Include' ) | ( 'Exclude' ) )
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
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:884:1: ( 'Include' )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:884:1: ( 'Include' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:885:1: 'Include'
                    {
                     before(grammarAccess.getIncludeAccess().getIncludeIncludeKeyword_0_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Include__IncludeAlternatives_0_01836); 
                     after(grammarAccess.getIncludeAccess().getIncludeIncludeKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:892:6: ( 'Exclude' )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:892:6: ( 'Exclude' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:893:1: 'Exclude'
                    {
                     before(grammarAccess.getIncludeAccess().getIncludeExcludeKeyword_0_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Include__IncludeAlternatives_0_01856); 
                     after(grammarAccess.getIncludeAccess().getIncludeExcludeKeyword_0_0_1()); 

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
    // $ANTLR end "rule__Include__IncludeAlternatives_0_0"


    // $ANTLR start "rule__Property__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:905:1: rule__Property__Alternatives : ( ( ruleField ) | ( ruleAssociation ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:909:1: ( ( ruleField ) | ( ruleAssociation ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==55) ) {
                alt5=1;
            }
            else if ( (LA5_0==53) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:910:1: ( ruleField )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:910:1: ( ruleField )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:911:1: ruleField
                    {
                     before(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleField_in_rule__Property__Alternatives1890);
                    ruleField();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:916:6: ( ruleAssociation )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:916:6: ( ruleAssociation )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:917:1: ruleAssociation
                    {
                     before(grammarAccess.getPropertyAccess().getAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAssociation_in_rule__Property__Alternatives1907);
                    ruleAssociation();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getAssociationParserRuleCall_1()); 

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
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:927:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__Group_3__0 ) ) | ( ( rule__Literal__Group_4__0 ) ) | ( ruleEnum ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:931:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__Group_3__0 ) ) | ( ( rule__Literal__Group_4__0 ) ) | ( ruleEnum ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt6=1;
                }
                break;
            case 58:
                {
                alt6=2;
                }
                break;
            case 59:
                {
                alt6=3;
                }
                break;
            case 60:
                {
                alt6=4;
                }
                break;
            case 61:
                {
                alt6=5;
                }
                break;
            case 56:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:932:1: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:932:1: ( ( rule__Literal__Group_0__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:933:1: ( rule__Literal__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:934:1: ( rule__Literal__Group_0__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:934:2: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives1939);
                    rule__Literal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:938:6: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:938:6: ( ( rule__Literal__Group_1__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:939:1: ( rule__Literal__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:940:1: ( rule__Literal__Group_1__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:940:2: rule__Literal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives1957);
                    rule__Literal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:944:6: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:944:6: ( ( rule__Literal__Group_2__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:945:1: ( rule__Literal__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:946:1: ( rule__Literal__Group_2__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:946:2: rule__Literal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives1975);
                    rule__Literal__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:950:6: ( ( rule__Literal__Group_3__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:950:6: ( ( rule__Literal__Group_3__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:951:1: ( rule__Literal__Group_3__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_3()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:952:1: ( rule__Literal__Group_3__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:952:2: rule__Literal__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_3__0_in_rule__Literal__Alternatives1993);
                    rule__Literal__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:956:6: ( ( rule__Literal__Group_4__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:956:6: ( ( rule__Literal__Group_4__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:957:1: ( rule__Literal__Group_4__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_4()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:958:1: ( rule__Literal__Group_4__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:958:2: rule__Literal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives2011);
                    rule__Literal__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:962:6: ( ruleEnum )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:962:6: ( ruleEnum )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:963:1: ruleEnum
                    {
                     before(grammarAccess.getLiteralAccess().getEnumParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleEnum_in_rule__Literal__Alternatives2029);
                    ruleEnum();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getEnumParserRuleCall_5()); 

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:973:1: rule__Boolean__Alternatives : ( ( ( 'J' ) ) | ( ( 'F' ) ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:977:1: ( ( ( 'J' ) ) | ( ( 'F' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:978:1: ( ( 'J' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:978:1: ( ( 'J' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:979:1: ( 'J' )
                    {
                     before(grammarAccess.getBooleanAccess().getTrueEnumLiteralDeclaration_0()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:980:1: ( 'J' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:980:3: 'J'
                    {
                    match(input,13,FOLLOW_13_in_rule__Boolean__Alternatives2062); 

                    }

                     after(grammarAccess.getBooleanAccess().getTrueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:985:6: ( ( 'F' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:985:6: ( ( 'F' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:986:1: ( 'F' )
                    {
                     before(grammarAccess.getBooleanAccess().getFalseEnumLiteralDeclaration_1()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:987:1: ( 'F' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:987:3: 'F'
                    {
                    match(input,14,FOLLOW_14_in_rule__Boolean__Alternatives2083); 

                    }

                     after(grammarAccess.getBooleanAccess().getFalseEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__BREType__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:997:1: rule__BREType__Alternatives : ( ( ( 'BizToBiz' ) ) | ( ( 'SrcToBiz' ) ) | ( ( 'BizToOut' ) ) );
    public final void rule__BREType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1001:1: ( ( ( 'BizToBiz' ) ) | ( ( 'SrcToBiz' ) ) | ( ( 'BizToOut' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 17:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1002:1: ( ( 'BizToBiz' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1002:1: ( ( 'BizToBiz' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1003:1: ( 'BizToBiz' )
                    {
                     before(grammarAccess.getBRETypeAccess().getBizToBizEnumLiteralDeclaration_0()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1004:1: ( 'BizToBiz' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1004:3: 'BizToBiz'
                    {
                    match(input,15,FOLLOW_15_in_rule__BREType__Alternatives2119); 

                    }

                     after(grammarAccess.getBRETypeAccess().getBizToBizEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1009:6: ( ( 'SrcToBiz' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1009:6: ( ( 'SrcToBiz' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1010:1: ( 'SrcToBiz' )
                    {
                     before(grammarAccess.getBRETypeAccess().getSrcToBizEnumLiteralDeclaration_1()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1011:1: ( 'SrcToBiz' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1011:3: 'SrcToBiz'
                    {
                    match(input,16,FOLLOW_16_in_rule__BREType__Alternatives2140); 

                    }

                     after(grammarAccess.getBRETypeAccess().getSrcToBizEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1016:6: ( ( 'BizToOut' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1016:6: ( ( 'BizToOut' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1017:1: ( 'BizToOut' )
                    {
                     before(grammarAccess.getBRETypeAccess().getBizToOutEnumLiteralDeclaration_2()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1018:1: ( 'BizToOut' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1018:3: 'BizToOut'
                    {
                    match(input,17,FOLLOW_17_in_rule__BREType__Alternatives2161); 

                    }

                     after(grammarAccess.getBRETypeAccess().getBizToOutEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__BREType__Alternatives"


    // $ANTLR start "rule__Multiplicty__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1028:1: rule__Multiplicty__Alternatives : ( ( ( '1..N' ) ) | ( ( '0..N' ) ) | ( ( '1' ) ) );
    public final void rule__Multiplicty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1032:1: ( ( ( '1..N' ) ) | ( ( '0..N' ) ) | ( ( '1' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1033:1: ( ( '1..N' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1033:1: ( ( '1..N' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1034:1: ( '1..N' )
                    {
                     before(grammarAccess.getMultiplictyAccess().getOneToManyEnumLiteralDeclaration_0()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1035:1: ( '1..N' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1035:3: '1..N'
                    {
                    match(input,18,FOLLOW_18_in_rule__Multiplicty__Alternatives2197); 

                    }

                     after(grammarAccess.getMultiplictyAccess().getOneToManyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1040:6: ( ( '0..N' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1040:6: ( ( '0..N' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1041:1: ( '0..N' )
                    {
                     before(grammarAccess.getMultiplictyAccess().getZeroToManyEnumLiteralDeclaration_1()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1042:1: ( '0..N' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1042:3: '0..N'
                    {
                    match(input,19,FOLLOW_19_in_rule__Multiplicty__Alternatives2218); 

                    }

                     after(grammarAccess.getMultiplictyAccess().getZeroToManyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1047:6: ( ( '1' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1047:6: ( ( '1' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1048:1: ( '1' )
                    {
                     before(grammarAccess.getMultiplictyAccess().getOneToOneEnumLiteralDeclaration_2()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1049:1: ( '1' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1049:3: '1'
                    {
                    match(input,20,FOLLOW_20_in_rule__Multiplicty__Alternatives2239); 

                    }

                     after(grammarAccess.getMultiplictyAccess().getOneToOneEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Multiplicty__Alternatives"


    // $ANTLR start "rule__Flow__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1061:1: rule__Flow__Group__0 : rule__Flow__Group__0__Impl rule__Flow__Group__1 ;
    public final void rule__Flow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1065:1: ( rule__Flow__Group__0__Impl rule__Flow__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1066:2: rule__Flow__Group__0__Impl rule__Flow__Group__1
            {
            pushFollow(FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__02272);
            rule__Flow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__02275);
            rule__Flow__Group__1();

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
    // $ANTLR end "rule__Flow__Group__0"


    // $ANTLR start "rule__Flow__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1073:1: rule__Flow__Group__0__Impl : ( ( rule__Flow__ImportsAssignment_0 )* ) ;
    public final void rule__Flow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1077:1: ( ( ( rule__Flow__ImportsAssignment_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1078:1: ( ( rule__Flow__ImportsAssignment_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1078:1: ( ( rule__Flow__ImportsAssignment_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1079:1: ( rule__Flow__ImportsAssignment_0 )*
            {
             before(grammarAccess.getFlowAccess().getImportsAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1080:1: ( rule__Flow__ImportsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==44) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1080:2: rule__Flow__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Flow__ImportsAssignment_0_in_rule__Flow__Group__0__Impl2302);
            	    rule__Flow__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFlowAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__0__Impl"


    // $ANTLR start "rule__Flow__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1090:1: rule__Flow__Group__1 : rule__Flow__Group__1__Impl rule__Flow__Group__2 ;
    public final void rule__Flow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1094:1: ( rule__Flow__Group__1__Impl rule__Flow__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1095:2: rule__Flow__Group__1__Impl rule__Flow__Group__2
            {
            pushFollow(FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__12333);
            rule__Flow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__12336);
            rule__Flow__Group__2();

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
    // $ANTLR end "rule__Flow__Group__1"


    // $ANTLR start "rule__Flow__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1102:1: rule__Flow__Group__1__Impl : ( 'Flow' ) ;
    public final void rule__Flow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1106:1: ( ( 'Flow' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1107:1: ( 'Flow' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1107:1: ( 'Flow' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1108:1: 'Flow'
            {
             before(grammarAccess.getFlowAccess().getFlowKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Flow__Group__1__Impl2364); 
             after(grammarAccess.getFlowAccess().getFlowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__1__Impl"


    // $ANTLR start "rule__Flow__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1121:1: rule__Flow__Group__2 : rule__Flow__Group__2__Impl rule__Flow__Group__3 ;
    public final void rule__Flow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1125:1: ( rule__Flow__Group__2__Impl rule__Flow__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1126:2: rule__Flow__Group__2__Impl rule__Flow__Group__3
            {
            pushFollow(FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__22395);
            rule__Flow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__3_in_rule__Flow__Group__22398);
            rule__Flow__Group__3();

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
    // $ANTLR end "rule__Flow__Group__2"


    // $ANTLR start "rule__Flow__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1133:1: rule__Flow__Group__2__Impl : ( ( rule__Flow__NameAssignment_2 ) ) ;
    public final void rule__Flow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1137:1: ( ( ( rule__Flow__NameAssignment_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1138:1: ( ( rule__Flow__NameAssignment_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1138:1: ( ( rule__Flow__NameAssignment_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1139:1: ( rule__Flow__NameAssignment_2 )
            {
             before(grammarAccess.getFlowAccess().getNameAssignment_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1140:1: ( rule__Flow__NameAssignment_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1140:2: rule__Flow__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Flow__NameAssignment_2_in_rule__Flow__Group__2__Impl2425);
            rule__Flow__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__2__Impl"


    // $ANTLR start "rule__Flow__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1150:1: rule__Flow__Group__3 : rule__Flow__Group__3__Impl rule__Flow__Group__4 ;
    public final void rule__Flow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1154:1: ( rule__Flow__Group__3__Impl rule__Flow__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1155:2: rule__Flow__Group__3__Impl rule__Flow__Group__4
            {
            pushFollow(FOLLOW_rule__Flow__Group__3__Impl_in_rule__Flow__Group__32455);
            rule__Flow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__4_in_rule__Flow__Group__32458);
            rule__Flow__Group__4();

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
    // $ANTLR end "rule__Flow__Group__3"


    // $ANTLR start "rule__Flow__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1162:1: rule__Flow__Group__3__Impl : ( '{' ) ;
    public final void rule__Flow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1166:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1167:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1167:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1168:1: '{'
            {
             before(grammarAccess.getFlowAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Flow__Group__3__Impl2486); 
             after(grammarAccess.getFlowAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__3__Impl"


    // $ANTLR start "rule__Flow__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1181:1: rule__Flow__Group__4 : rule__Flow__Group__4__Impl rule__Flow__Group__5 ;
    public final void rule__Flow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1185:1: ( rule__Flow__Group__4__Impl rule__Flow__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1186:2: rule__Flow__Group__4__Impl rule__Flow__Group__5
            {
            pushFollow(FOLLOW_rule__Flow__Group__4__Impl_in_rule__Flow__Group__42517);
            rule__Flow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__5_in_rule__Flow__Group__42520);
            rule__Flow__Group__5();

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
    // $ANTLR end "rule__Flow__Group__4"


    // $ANTLR start "rule__Flow__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1193:1: rule__Flow__Group__4__Impl : ( ( rule__Flow__ActivitiesAssignment_4 )* ) ;
    public final void rule__Flow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1197:1: ( ( ( rule__Flow__ActivitiesAssignment_4 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1198:1: ( ( rule__Flow__ActivitiesAssignment_4 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1198:1: ( ( rule__Flow__ActivitiesAssignment_4 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1199:1: ( rule__Flow__ActivitiesAssignment_4 )*
            {
             before(grammarAccess.getFlowAccess().getActivitiesAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1200:1: ( rule__Flow__ActivitiesAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1200:2: rule__Flow__ActivitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Flow__ActivitiesAssignment_4_in_rule__Flow__Group__4__Impl2547);
            	    rule__Flow__ActivitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getFlowAccess().getActivitiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__4__Impl"


    // $ANTLR start "rule__Flow__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1210:1: rule__Flow__Group__5 : rule__Flow__Group__5__Impl ;
    public final void rule__Flow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1214:1: ( rule__Flow__Group__5__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1215:2: rule__Flow__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Flow__Group__5__Impl_in_rule__Flow__Group__52578);
            rule__Flow__Group__5__Impl();

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
    // $ANTLR end "rule__Flow__Group__5"


    // $ANTLR start "rule__Flow__Group__5__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1221:1: rule__Flow__Group__5__Impl : ( '}' ) ;
    public final void rule__Flow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1225:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1226:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1226:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1227:1: '}'
            {
             before(grammarAccess.getFlowAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Flow__Group__5__Impl2606); 
             after(grammarAccess.getFlowAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1252:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1256:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1257:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__02649);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__02652);
            rule__Activity__Group__1();

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
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1264:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1268:1: ( ( 'Activity' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1269:1: ( 'Activity' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1269:1: ( 'Activity' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1270:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Activity__Group__0__Impl2680); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1283:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1287:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1288:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__12711);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__12714);
            rule__Activity__Group__2();

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
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1295:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1299:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1300:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1300:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1301:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1302:1: ( rule__Activity__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1302:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl2741);
            rule__Activity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1312:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1316:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1317:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__22771);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__22774);
            rule__Activity__Group__3();

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
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1324:1: rule__Activity__Group__2__Impl : ( '{' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1328:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1329:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1329:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1330:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Activity__Group__2__Impl2802); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1343:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1347:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1348:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__32833);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__32836);
            rule__Activity__Group__4();

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
    // $ANTLR end "rule__Activity__Group__3"


    // $ANTLR start "rule__Activity__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1355:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__Group_3__0 )? ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1359:1: ( ( ( rule__Activity__Group_3__0 )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1360:1: ( ( rule__Activity__Group_3__0 )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1360:1: ( ( rule__Activity__Group_3__0 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1361:1: ( rule__Activity__Group_3__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1362:1: ( rule__Activity__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1362:2: rule__Activity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_3__0_in_rule__Activity__Group__3__Impl2863);
                    rule__Activity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1372:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1376:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1377:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__42894);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__42897);
            rule__Activity__Group__5();

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
    // $ANTLR end "rule__Activity__Group__4"


    // $ANTLR start "rule__Activity__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1384:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )? ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1388:1: ( ( ( rule__Activity__Group_4__0 )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1389:1: ( ( rule__Activity__Group_4__0 )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1389:1: ( ( rule__Activity__Group_4__0 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1390:1: ( rule__Activity__Group_4__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1391:1: ( rule__Activity__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1391:2: rule__Activity__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl2924);
                    rule__Activity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4__Impl"


    // $ANTLR start "rule__Activity__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1401:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1405:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1406:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__52955);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__52958);
            rule__Activity__Group__6();

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
    // $ANTLR end "rule__Activity__Group__5"


    // $ANTLR start "rule__Activity__Group__5__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1413:1: rule__Activity__Group__5__Impl : ( 'Description' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1417:1: ( ( 'Description' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1418:1: ( 'Description' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1418:1: ( 'Description' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1419:1: 'Description'
            {
             before(grammarAccess.getActivityAccess().getDescriptionKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Activity__Group__5__Impl2986); 
             after(grammarAccess.getActivityAccess().getDescriptionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group__6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1432:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1436:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1437:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__63017);
            rule__Activity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__63020);
            rule__Activity__Group__7();

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
    // $ANTLR end "rule__Activity__Group__6"


    // $ANTLR start "rule__Activity__Group__6__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1444:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__DescriptionAssignment_6 ) ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1448:1: ( ( ( rule__Activity__DescriptionAssignment_6 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1449:1: ( ( rule__Activity__DescriptionAssignment_6 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1449:1: ( ( rule__Activity__DescriptionAssignment_6 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1450:1: ( rule__Activity__DescriptionAssignment_6 )
            {
             before(grammarAccess.getActivityAccess().getDescriptionAssignment_6()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1451:1: ( rule__Activity__DescriptionAssignment_6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1451:2: rule__Activity__DescriptionAssignment_6
            {
            pushFollow(FOLLOW_rule__Activity__DescriptionAssignment_6_in_rule__Activity__Group__6__Impl3047);
            rule__Activity__DescriptionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getDescriptionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__6__Impl"


    // $ANTLR start "rule__Activity__Group__7"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1461:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1465:1: ( rule__Activity__Group__7__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1466:2: rule__Activity__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__73077);
            rule__Activity__Group__7__Impl();

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
    // $ANTLR end "rule__Activity__Group__7"


    // $ANTLR start "rule__Activity__Group__7__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1472:1: rule__Activity__Group__7__Impl : ( '}' ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1476:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1477:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1477:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1478:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__Activity__Group__7__Impl3105); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__7__Impl"


    // $ANTLR start "rule__Activity__Group_3__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1507:1: rule__Activity__Group_3__0 : rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1 ;
    public final void rule__Activity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1511:1: ( rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1512:2: rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__0__Impl_in_rule__Activity__Group_3__03152);
            rule__Activity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_3__1_in_rule__Activity__Group_3__03155);
            rule__Activity__Group_3__1();

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
    // $ANTLR end "rule__Activity__Group_3__0"


    // $ANTLR start "rule__Activity__Group_3__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1519:1: rule__Activity__Group_3__0__Impl : ( 'Successors' ) ;
    public final void rule__Activity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1523:1: ( ( 'Successors' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1524:1: ( 'Successors' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1524:1: ( 'Successors' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1525:1: 'Successors'
            {
             before(grammarAccess.getActivityAccess().getSuccessorsKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Activity__Group_3__0__Impl3183); 
             after(grammarAccess.getActivityAccess().getSuccessorsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_3__0__Impl"


    // $ANTLR start "rule__Activity__Group_3__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1538:1: rule__Activity__Group_3__1 : rule__Activity__Group_3__1__Impl rule__Activity__Group_3__2 ;
    public final void rule__Activity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1542:1: ( rule__Activity__Group_3__1__Impl rule__Activity__Group_3__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1543:2: rule__Activity__Group_3__1__Impl rule__Activity__Group_3__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__1__Impl_in_rule__Activity__Group_3__13214);
            rule__Activity__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_3__2_in_rule__Activity__Group_3__13217);
            rule__Activity__Group_3__2();

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
    // $ANTLR end "rule__Activity__Group_3__1"


    // $ANTLR start "rule__Activity__Group_3__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1550:1: rule__Activity__Group_3__1__Impl : ( '[' ) ;
    public final void rule__Activity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1554:1: ( ( '[' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1555:1: ( '[' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1555:1: ( '[' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1556:1: '['
            {
             before(grammarAccess.getActivityAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,27,FOLLOW_27_in_rule__Activity__Group_3__1__Impl3245); 
             after(grammarAccess.getActivityAccess().getLeftSquareBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_3__1__Impl"


    // $ANTLR start "rule__Activity__Group_3__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1569:1: rule__Activity__Group_3__2 : rule__Activity__Group_3__2__Impl rule__Activity__Group_3__3 ;
    public final void rule__Activity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1573:1: ( rule__Activity__Group_3__2__Impl rule__Activity__Group_3__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1574:2: rule__Activity__Group_3__2__Impl rule__Activity__Group_3__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__2__Impl_in_rule__Activity__Group_3__23276);
            rule__Activity__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_3__3_in_rule__Activity__Group_3__23279);
            rule__Activity__Group_3__3();

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
    // $ANTLR end "rule__Activity__Group_3__2"


    // $ANTLR start "rule__Activity__Group_3__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1581:1: rule__Activity__Group_3__2__Impl : ( ( rule__Activity__SucessorsAssignment_3_2 ) ) ;
    public final void rule__Activity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1585:1: ( ( ( rule__Activity__SucessorsAssignment_3_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1586:1: ( ( rule__Activity__SucessorsAssignment_3_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1586:1: ( ( rule__Activity__SucessorsAssignment_3_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1587:1: ( rule__Activity__SucessorsAssignment_3_2 )
            {
             before(grammarAccess.getActivityAccess().getSucessorsAssignment_3_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1588:1: ( rule__Activity__SucessorsAssignment_3_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1588:2: rule__Activity__SucessorsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Activity__SucessorsAssignment_3_2_in_rule__Activity__Group_3__2__Impl3306);
            rule__Activity__SucessorsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getSucessorsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_3__2__Impl"


    // $ANTLR start "rule__Activity__Group_3__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1598:1: rule__Activity__Group_3__3 : rule__Activity__Group_3__3__Impl rule__Activity__Group_3__4 ;
    public final void rule__Activity__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1602:1: ( rule__Activity__Group_3__3__Impl rule__Activity__Group_3__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1603:2: rule__Activity__Group_3__3__Impl rule__Activity__Group_3__4
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__3__Impl_in_rule__Activity__Group_3__33336);
            rule__Activity__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_3__4_in_rule__Activity__Group_3__33339);
            rule__Activity__Group_3__4();

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
    // $ANTLR end "rule__Activity__Group_3__3"


    // $ANTLR start "rule__Activity__Group_3__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1610:1: rule__Activity__Group_3__3__Impl : ( ( rule__Activity__Group_3_3__0 )* ) ;
    public final void rule__Activity__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1614:1: ( ( ( rule__Activity__Group_3_3__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1615:1: ( ( rule__Activity__Group_3_3__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1615:1: ( ( rule__Activity__Group_3_3__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1616:1: ( rule__Activity__Group_3_3__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_3_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1617:1: ( rule__Activity__Group_3_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1617:2: rule__Activity__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_3_3__0_in_rule__Activity__Group_3__3__Impl3366);
            	    rule__Activity__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_3__3__Impl"


    // $ANTLR start "rule__Activity__Group_3__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1627:1: rule__Activity__Group_3__4 : rule__Activity__Group_3__4__Impl ;
    public final void rule__Activity__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1631:1: ( rule__Activity__Group_3__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1632:2: rule__Activity__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__4__Impl_in_rule__Activity__Group_3__43397);
            rule__Activity__Group_3__4__Impl();

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
    // $ANTLR end "rule__Activity__Group_3__4"


    // $ANTLR start "rule__Activity__Group_3__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1638:1: rule__Activity__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Activity__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1642:1: ( ( ']' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1643:1: ( ']' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1643:1: ( ']' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1644:1: ']'
            {
             before(grammarAccess.getActivityAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,28,FOLLOW_28_in_rule__Activity__Group_3__4__Impl3425); 
             after(grammarAccess.getActivityAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_3__4__Impl"


    // $ANTLR start "rule__Activity__Group_3_3__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1667:1: rule__Activity__Group_3_3__0 : rule__Activity__Group_3_3__0__Impl rule__Activity__Group_3_3__1 ;
    public final void rule__Activity__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1671:1: ( rule__Activity__Group_3_3__0__Impl rule__Activity__Group_3_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1672:2: rule__Activity__Group_3_3__0__Impl rule__Activity__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_3_3__0__Impl_in_rule__Activity__Group_3_3__03466);
            rule__Activity__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_3_3__1_in_rule__Activity__Group_3_3__03469);
            rule__Activity__Group_3_3__1();

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
    // $ANTLR end "rule__Activity__Group_3_3__0"


    // $ANTLR start "rule__Activity__Group_3_3__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1679:1: rule__Activity__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1683:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1684:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1684:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1685:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_3_3_0()); 
            match(input,29,FOLLOW_29_in_rule__Activity__Group_3_3__0__Impl3497); 
             after(grammarAccess.getActivityAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_3_3__0__Impl"


    // $ANTLR start "rule__Activity__Group_3_3__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1698:1: rule__Activity__Group_3_3__1 : rule__Activity__Group_3_3__1__Impl ;
    public final void rule__Activity__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1702:1: ( rule__Activity__Group_3_3__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1703:2: rule__Activity__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_3_3__1__Impl_in_rule__Activity__Group_3_3__13528);
            rule__Activity__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Activity__Group_3_3__1"


    // $ANTLR start "rule__Activity__Group_3_3__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1709:1: rule__Activity__Group_3_3__1__Impl : ( ( rule__Activity__SucessorsAssignment_3_3_1 ) ) ;
    public final void rule__Activity__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1713:1: ( ( ( rule__Activity__SucessorsAssignment_3_3_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1714:1: ( ( rule__Activity__SucessorsAssignment_3_3_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1714:1: ( ( rule__Activity__SucessorsAssignment_3_3_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1715:1: ( rule__Activity__SucessorsAssignment_3_3_1 )
            {
             before(grammarAccess.getActivityAccess().getSucessorsAssignment_3_3_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1716:1: ( rule__Activity__SucessorsAssignment_3_3_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1716:2: rule__Activity__SucessorsAssignment_3_3_1
            {
            pushFollow(FOLLOW_rule__Activity__SucessorsAssignment_3_3_1_in_rule__Activity__Group_3_3__1__Impl3555);
            rule__Activity__SucessorsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getSucessorsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_3_3__1__Impl"


    // $ANTLR start "rule__Activity__Group_4__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1730:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1734:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1735:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__03589);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__03592);
            rule__Activity__Group_4__1();

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
    // $ANTLR end "rule__Activity__Group_4__0"


    // $ANTLR start "rule__Activity__Group_4__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1742:1: rule__Activity__Group_4__0__Impl : ( 'Calls' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1746:1: ( ( 'Calls' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1747:1: ( 'Calls' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1747:1: ( 'Calls' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1748:1: 'Calls'
            {
             before(grammarAccess.getActivityAccess().getCallsKeyword_4_0()); 
            match(input,30,FOLLOW_30_in_rule__Activity__Group_4__0__Impl3620); 
             after(grammarAccess.getActivityAccess().getCallsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__0__Impl"


    // $ANTLR start "rule__Activity__Group_4__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1761:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1765:1: ( rule__Activity__Group_4__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1766:2: rule__Activity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__13651);
            rule__Activity__Group_4__1__Impl();

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
    // $ANTLR end "rule__Activity__Group_4__1"


    // $ANTLR start "rule__Activity__Group_4__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1772:1: rule__Activity__Group_4__1__Impl : ( ( rule__Activity__BusinessRuleAssignment_4_1 ) ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1776:1: ( ( ( rule__Activity__BusinessRuleAssignment_4_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1777:1: ( ( rule__Activity__BusinessRuleAssignment_4_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1777:1: ( ( rule__Activity__BusinessRuleAssignment_4_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1778:1: ( rule__Activity__BusinessRuleAssignment_4_1 )
            {
             before(grammarAccess.getActivityAccess().getBusinessRuleAssignment_4_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1779:1: ( rule__Activity__BusinessRuleAssignment_4_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1779:2: rule__Activity__BusinessRuleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Activity__BusinessRuleAssignment_4_1_in_rule__Activity__Group_4__1__Impl3678);
            rule__Activity__BusinessRuleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getBusinessRuleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__1__Impl"


    // $ANTLR start "rule__BusinessRule__Group_0__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1793:1: rule__BusinessRule__Group_0__0 : rule__BusinessRule__Group_0__0__Impl rule__BusinessRule__Group_0__1 ;
    public final void rule__BusinessRule__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1797:1: ( rule__BusinessRule__Group_0__0__Impl rule__BusinessRule__Group_0__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1798:2: rule__BusinessRule__Group_0__0__Impl rule__BusinessRule__Group_0__1
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_0__0__Impl_in_rule__BusinessRule__Group_0__03712);
            rule__BusinessRule__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group_0__1_in_rule__BusinessRule__Group_0__03715);
            rule__BusinessRule__Group_0__1();

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
    // $ANTLR end "rule__BusinessRule__Group_0__0"


    // $ANTLR start "rule__BusinessRule__Group_0__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1805:1: rule__BusinessRule__Group_0__0__Impl : ( ( rule__BusinessRule__ImportsAssignment_0_0 )* ) ;
    public final void rule__BusinessRule__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1809:1: ( ( ( rule__BusinessRule__ImportsAssignment_0_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1810:1: ( ( rule__BusinessRule__ImportsAssignment_0_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1810:1: ( ( rule__BusinessRule__ImportsAssignment_0_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1811:1: ( rule__BusinessRule__ImportsAssignment_0_0 )*
            {
             before(grammarAccess.getBusinessRuleAccess().getImportsAssignment_0_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1812:1: ( rule__BusinessRule__ImportsAssignment_0_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==44) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1812:2: rule__BusinessRule__ImportsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_rule__BusinessRule__ImportsAssignment_0_0_in_rule__BusinessRule__Group_0__0__Impl3742);
            	    rule__BusinessRule__ImportsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getBusinessRuleAccess().getImportsAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_0__0__Impl"


    // $ANTLR start "rule__BusinessRule__Group_0__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1822:1: rule__BusinessRule__Group_0__1 : rule__BusinessRule__Group_0__1__Impl rule__BusinessRule__Group_0__2 ;
    public final void rule__BusinessRule__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1826:1: ( rule__BusinessRule__Group_0__1__Impl rule__BusinessRule__Group_0__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1827:2: rule__BusinessRule__Group_0__1__Impl rule__BusinessRule__Group_0__2
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_0__1__Impl_in_rule__BusinessRule__Group_0__13773);
            rule__BusinessRule__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group_0__2_in_rule__BusinessRule__Group_0__13776);
            rule__BusinessRule__Group_0__2();

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
    // $ANTLR end "rule__BusinessRule__Group_0__1"


    // $ANTLR start "rule__BusinessRule__Group_0__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1834:1: rule__BusinessRule__Group_0__1__Impl : ( 'BusinessRule' ) ;
    public final void rule__BusinessRule__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1838:1: ( ( 'BusinessRule' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1839:1: ( 'BusinessRule' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1839:1: ( 'BusinessRule' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1840:1: 'BusinessRule'
            {
             before(grammarAccess.getBusinessRuleAccess().getBusinessRuleKeyword_0_1()); 
            match(input,31,FOLLOW_31_in_rule__BusinessRule__Group_0__1__Impl3804); 
             after(grammarAccess.getBusinessRuleAccess().getBusinessRuleKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_0__1__Impl"


    // $ANTLR start "rule__BusinessRule__Group_0__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1853:1: rule__BusinessRule__Group_0__2 : rule__BusinessRule__Group_0__2__Impl rule__BusinessRule__Group_0__3 ;
    public final void rule__BusinessRule__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1857:1: ( rule__BusinessRule__Group_0__2__Impl rule__BusinessRule__Group_0__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1858:2: rule__BusinessRule__Group_0__2__Impl rule__BusinessRule__Group_0__3
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_0__2__Impl_in_rule__BusinessRule__Group_0__23835);
            rule__BusinessRule__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group_0__3_in_rule__BusinessRule__Group_0__23838);
            rule__BusinessRule__Group_0__3();

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
    // $ANTLR end "rule__BusinessRule__Group_0__2"


    // $ANTLR start "rule__BusinessRule__Group_0__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1865:1: rule__BusinessRule__Group_0__2__Impl : ( ( rule__BusinessRule__NameAssignment_0_2 ) ) ;
    public final void rule__BusinessRule__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1869:1: ( ( ( rule__BusinessRule__NameAssignment_0_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1870:1: ( ( rule__BusinessRule__NameAssignment_0_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1870:1: ( ( rule__BusinessRule__NameAssignment_0_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1871:1: ( rule__BusinessRule__NameAssignment_0_2 )
            {
             before(grammarAccess.getBusinessRuleAccess().getNameAssignment_0_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1872:1: ( rule__BusinessRule__NameAssignment_0_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1872:2: rule__BusinessRule__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__BusinessRule__NameAssignment_0_2_in_rule__BusinessRule__Group_0__2__Impl3865);
            rule__BusinessRule__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_0__2__Impl"


    // $ANTLR start "rule__BusinessRule__Group_0__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1882:1: rule__BusinessRule__Group_0__3 : rule__BusinessRule__Group_0__3__Impl rule__BusinessRule__Group_0__4 ;
    public final void rule__BusinessRule__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1886:1: ( rule__BusinessRule__Group_0__3__Impl rule__BusinessRule__Group_0__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1887:2: rule__BusinessRule__Group_0__3__Impl rule__BusinessRule__Group_0__4
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_0__3__Impl_in_rule__BusinessRule__Group_0__33895);
            rule__BusinessRule__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group_0__4_in_rule__BusinessRule__Group_0__33898);
            rule__BusinessRule__Group_0__4();

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
    // $ANTLR end "rule__BusinessRule__Group_0__3"


    // $ANTLR start "rule__BusinessRule__Group_0__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1894:1: rule__BusinessRule__Group_0__3__Impl : ( 'type' ) ;
    public final void rule__BusinessRule__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1898:1: ( ( 'type' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1899:1: ( 'type' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1899:1: ( 'type' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1900:1: 'type'
            {
             before(grammarAccess.getBusinessRuleAccess().getTypeKeyword_0_3()); 
            match(input,32,FOLLOW_32_in_rule__BusinessRule__Group_0__3__Impl3926); 
             after(grammarAccess.getBusinessRuleAccess().getTypeKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_0__3__Impl"


    // $ANTLR start "rule__BusinessRule__Group_0__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1913:1: rule__BusinessRule__Group_0__4 : rule__BusinessRule__Group_0__4__Impl rule__BusinessRule__Group_0__5 ;
    public final void rule__BusinessRule__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1917:1: ( rule__BusinessRule__Group_0__4__Impl rule__BusinessRule__Group_0__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1918:2: rule__BusinessRule__Group_0__4__Impl rule__BusinessRule__Group_0__5
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_0__4__Impl_in_rule__BusinessRule__Group_0__43957);
            rule__BusinessRule__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group_0__5_in_rule__BusinessRule__Group_0__43960);
            rule__BusinessRule__Group_0__5();

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
    // $ANTLR end "rule__BusinessRule__Group_0__4"


    // $ANTLR start "rule__BusinessRule__Group_0__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1925:1: rule__BusinessRule__Group_0__4__Impl : ( ( rule__BusinessRule__TypAssignment_0_4 ) ) ;
    public final void rule__BusinessRule__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1929:1: ( ( ( rule__BusinessRule__TypAssignment_0_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1930:1: ( ( rule__BusinessRule__TypAssignment_0_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1930:1: ( ( rule__BusinessRule__TypAssignment_0_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1931:1: ( rule__BusinessRule__TypAssignment_0_4 )
            {
             before(grammarAccess.getBusinessRuleAccess().getTypAssignment_0_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1932:1: ( rule__BusinessRule__TypAssignment_0_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1932:2: rule__BusinessRule__TypAssignment_0_4
            {
            pushFollow(FOLLOW_rule__BusinessRule__TypAssignment_0_4_in_rule__BusinessRule__Group_0__4__Impl3987);
            rule__BusinessRule__TypAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getTypAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_0__4__Impl"


    // $ANTLR start "rule__BusinessRule__Group_0__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1942:1: rule__BusinessRule__Group_0__5 : rule__BusinessRule__Group_0__5__Impl rule__BusinessRule__Group_0__6 ;
    public final void rule__BusinessRule__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1946:1: ( rule__BusinessRule__Group_0__5__Impl rule__BusinessRule__Group_0__6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1947:2: rule__BusinessRule__Group_0__5__Impl rule__BusinessRule__Group_0__6
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_0__5__Impl_in_rule__BusinessRule__Group_0__54017);
            rule__BusinessRule__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group_0__6_in_rule__BusinessRule__Group_0__54020);
            rule__BusinessRule__Group_0__6();

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
    // $ANTLR end "rule__BusinessRule__Group_0__5"


    // $ANTLR start "rule__BusinessRule__Group_0__5__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1954:1: rule__BusinessRule__Group_0__5__Impl : ( '{' ) ;
    public final void rule__BusinessRule__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1958:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1959:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1959:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1960:1: '{'
            {
             before(grammarAccess.getBusinessRuleAccess().getLeftCurlyBracketKeyword_0_5()); 
            match(input,22,FOLLOW_22_in_rule__BusinessRule__Group_0__5__Impl4048); 
             after(grammarAccess.getBusinessRuleAccess().getLeftCurlyBracketKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_0__5__Impl"


    // $ANTLR start "rule__BusinessRule__Group_0__6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1973:1: rule__BusinessRule__Group_0__6 : rule__BusinessRule__Group_0__6__Impl rule__BusinessRule__Group_0__7 ;
    public final void rule__BusinessRule__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1977:1: ( rule__BusinessRule__Group_0__6__Impl rule__BusinessRule__Group_0__7 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1978:2: rule__BusinessRule__Group_0__6__Impl rule__BusinessRule__Group_0__7
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_0__6__Impl_in_rule__BusinessRule__Group_0__64079);
            rule__BusinessRule__Group_0__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group_0__7_in_rule__BusinessRule__Group_0__64082);
            rule__BusinessRule__Group_0__7();

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
    // $ANTLR end "rule__BusinessRule__Group_0__6"


    // $ANTLR start "rule__BusinessRule__Group_0__6__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1985:1: rule__BusinessRule__Group_0__6__Impl : ( 'Input' ) ;
    public final void rule__BusinessRule__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1989:1: ( ( 'Input' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1990:1: ( 'Input' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1990:1: ( 'Input' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1991:1: 'Input'
            {
             before(grammarAccess.getBusinessRuleAccess().getInputKeyword_0_6()); 
            match(input,33,FOLLOW_33_in_rule__BusinessRule__Group_0__6__Impl4110); 
             after(grammarAccess.getBusinessRuleAccess().getInputKeyword_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_0__6__Impl"


    // $ANTLR start "rule__BusinessRule__Group_0__7"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2004:1: rule__BusinessRule__Group_0__7 : rule__BusinessRule__Group_0__7__Impl rule__BusinessRule__Group_0__8 ;
    public final void rule__BusinessRule__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2008:1: ( rule__BusinessRule__Group_0__7__Impl rule__BusinessRule__Group_0__8 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2009:2: rule__BusinessRule__Group_0__7__Impl rule__BusinessRule__Group_0__8
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_0__7__Impl_in_rule__BusinessRule__Group_0__74141);
            rule__BusinessRule__Group_0__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group_0__8_in_rule__BusinessRule__Group_0__74144);
            rule__BusinessRule__Group_0__8();

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
    // $ANTLR end "rule__BusinessRule__Group_0__7"


    // $ANTLR start "rule__BusinessRule__Group_0__7__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2016:1: rule__BusinessRule__Group_0__7__Impl : ( '[' ) ;
    public final void rule__BusinessRule__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2020:1: ( ( '[' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2021:1: ( '[' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2021:1: ( '[' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2022:1: '['
            {
             before(grammarAccess.getBusinessRuleAccess().getLeftSquareBracketKeyword_0_7()); 
            match(input,27,FOLLOW_27_in_rule__BusinessRule__Group_0__7__Impl4172); 
             after(grammarAccess.getBusinessRuleAccess().getLeftSquareBracketKeyword_0_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_0__7__Impl"


    // $ANTLR start "rule__BusinessRule__Group_0__8"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2035:1: rule__BusinessRule__Group_0__8 : rule__BusinessRule__Group_0__8__Impl rule__BusinessRule__Group_0__9 ;
    public final void rule__BusinessRule__Group_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2039:1: ( rule__BusinessRule__Group_0__8__Impl rule__BusinessRule__Group_0__9 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2040:2: rule__BusinessRule__Group_0__8__Impl rule__BusinessRule__Group_0__9
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_0__8__Impl_in_rule__BusinessRule__Group_0__84203);
            rule__BusinessRule__Group_0__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group_0__9_in_rule__BusinessRule__Group_0__84206);
            rule__BusinessRule__Group_0__9();

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
    // $ANTLR end "rule__BusinessRule__Group_0__8"


    // $ANTLR start "rule__BusinessRule__Group_0__8__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2047:1: rule__BusinessRule__Group_0__8__Impl : ( ( rule__BusinessRule__SystemInputsAssignment_0_8 )* ) ;
    public final void rule__BusinessRule__Group_0__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2051:1: ( ( ( rule__BusinessRule__SystemInputsAssignment_0_8 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2052:1: ( ( rule__BusinessRule__SystemInputsAssignment_0_8 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2052:1: ( ( rule__BusinessRule__SystemInputsAssignment_0_8 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2053:1: ( rule__BusinessRule__SystemInputsAssignment_0_8 )*
            {
             before(grammarAccess.getBusinessRuleAccess().getSystemInputsAssignment_0_8()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2054:1: ( rule__BusinessRule__SystemInputsAssignment_0_8 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2054:2: rule__BusinessRule__SystemInputsAssignment_0_8
            	    {
            	    pushFollow(FOLLOW_rule__BusinessRule__SystemInputsAssignment_0_8_in_rule__BusinessRule__Group_0__8__Impl4233);
            	    rule__BusinessRule__SystemInputsAssignment_0_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getBusinessRuleAccess().getSystemInputsAssignment_0_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_0__8__Impl"


    // $ANTLR start "rule__BusinessRule__Group_0__9"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2064:1: rule__BusinessRule__Group_0__9 : rule__BusinessRule__Group_0__9__Impl rule__BusinessRule__Group_0__10 ;
    public final void rule__BusinessRule__Group_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2068:1: ( rule__BusinessRule__Group_0__9__Impl rule__BusinessRule__Group_0__10 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2069:2: rule__BusinessRule__Group_0__9__Impl rule__BusinessRule__Group_0__10
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_0__9__Impl_in_rule__BusinessRule__Group_0__94264);
            rule__BusinessRule__Group_0__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group_0__10_in_rule__BusinessRule__Group_0__94267);
            rule__BusinessRule__Group_0__10();

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
    // $ANTLR end "rule__BusinessRule__Group_0__9"


    // $ANTLR start "rule__BusinessRule__Group_0__9__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2076:1: rule__BusinessRule__Group_0__9__Impl : ( ']' ) ;
    public final void rule__BusinessRule__Group_0__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2080:1: ( ( ']' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2081:1: ( ']' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2081:1: ( ']' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2082:1: ']'
            {
             before(grammarAccess.getBusinessRuleAccess().getRightSquareBracketKeyword_0_9()); 
            match(input,28,FOLLOW_28_in_rule__BusinessRule__Group_0__9__Impl4295); 
             after(grammarAccess.getBusinessRuleAccess().getRightSquareBracketKeyword_0_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_0__9__Impl"


    // $ANTLR start "rule__BusinessRule__Group_0__10"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2095:1: rule__BusinessRule__Group_0__10 : rule__BusinessRule__Group_0__10__Impl rule__BusinessRule__Group_0__11 ;
    public final void rule__BusinessRule__Group_0__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2099:1: ( rule__BusinessRule__Group_0__10__Impl rule__BusinessRule__Group_0__11 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2100:2: rule__BusinessRule__Group_0__10__Impl rule__BusinessRule__Group_0__11
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_0__10__Impl_in_rule__BusinessRule__Group_0__104326);
            rule__BusinessRule__Group_0__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group_0__11_in_rule__BusinessRule__Group_0__104329);
            rule__BusinessRule__Group_0__11();

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
    // $ANTLR end "rule__BusinessRule__Group_0__10"


    // $ANTLR start "rule__BusinessRule__Group_0__10__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2107:1: rule__BusinessRule__Group_0__10__Impl : ( 'Output' ) ;
    public final void rule__BusinessRule__Group_0__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2111:1: ( ( 'Output' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2112:1: ( 'Output' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2112:1: ( 'Output' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2113:1: 'Output'
            {
             before(grammarAccess.getBusinessRuleAccess().getOutputKeyword_0_10()); 
            match(input,34,FOLLOW_34_in_rule__BusinessRule__Group_0__10__Impl4357); 
             after(grammarAccess.getBusinessRuleAccess().getOutputKeyword_0_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_0__10__Impl"


    // $ANTLR start "rule__BusinessRule__Group_0__11"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2126:1: rule__BusinessRule__Group_0__11 : rule__BusinessRule__Group_0__11__Impl rule__BusinessRule__Group_0__12 ;
    public final void rule__BusinessRule__Group_0__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2130:1: ( rule__BusinessRule__Group_0__11__Impl rule__BusinessRule__Group_0__12 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2131:2: rule__BusinessRule__Group_0__11__Impl rule__BusinessRule__Group_0__12
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_0__11__Impl_in_rule__BusinessRule__Group_0__114388);
            rule__BusinessRule__Group_0__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group_0__12_in_rule__BusinessRule__Group_0__114391);
            rule__BusinessRule__Group_0__12();

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
    // $ANTLR end "rule__BusinessRule__Group_0__11"


    // $ANTLR start "rule__BusinessRule__Group_0__11__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2138:1: rule__BusinessRule__Group_0__11__Impl : ( '[' ) ;
    public final void rule__BusinessRule__Group_0__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2142:1: ( ( '[' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2143:1: ( '[' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2143:1: ( '[' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2144:1: '['
            {
             before(grammarAccess.getBusinessRuleAccess().getLeftSquareBracketKeyword_0_11()); 
            match(input,27,FOLLOW_27_in_rule__BusinessRule__Group_0__11__Impl4419); 
             after(grammarAccess.getBusinessRuleAccess().getLeftSquareBracketKeyword_0_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_0__11__Impl"


    // $ANTLR start "rule__BusinessRule__Group_0__12"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2157:1: rule__BusinessRule__Group_0__12 : rule__BusinessRule__Group_0__12__Impl ;
    public final void rule__BusinessRule__Group_0__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2161:1: ( rule__BusinessRule__Group_0__12__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2162:2: rule__BusinessRule__Group_0__12__Impl
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_0__12__Impl_in_rule__BusinessRule__Group_0__124450);
            rule__BusinessRule__Group_0__12__Impl();

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
    // $ANTLR end "rule__BusinessRule__Group_0__12"


    // $ANTLR start "rule__BusinessRule__Group_0__12__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2168:1: rule__BusinessRule__Group_0__12__Impl : ( ( rule__BusinessRule__OutputAssignment_0_12 ) ) ;
    public final void rule__BusinessRule__Group_0__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2172:1: ( ( ( rule__BusinessRule__OutputAssignment_0_12 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2173:1: ( ( rule__BusinessRule__OutputAssignment_0_12 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2173:1: ( ( rule__BusinessRule__OutputAssignment_0_12 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2174:1: ( rule__BusinessRule__OutputAssignment_0_12 )
            {
             before(grammarAccess.getBusinessRuleAccess().getOutputAssignment_0_12()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2175:1: ( rule__BusinessRule__OutputAssignment_0_12 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2175:2: rule__BusinessRule__OutputAssignment_0_12
            {
            pushFollow(FOLLOW_rule__BusinessRule__OutputAssignment_0_12_in_rule__BusinessRule__Group_0__12__Impl4477);
            rule__BusinessRule__OutputAssignment_0_12();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getOutputAssignment_0_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_0__12__Impl"


    // $ANTLR start "rule__BusinessRule__Group_1__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2211:1: rule__BusinessRule__Group_1__0 : rule__BusinessRule__Group_1__0__Impl rule__BusinessRule__Group_1__1 ;
    public final void rule__BusinessRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2215:1: ( rule__BusinessRule__Group_1__0__Impl rule__BusinessRule__Group_1__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2216:2: rule__BusinessRule__Group_1__0__Impl rule__BusinessRule__Group_1__1
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_1__0__Impl_in_rule__BusinessRule__Group_1__04533);
            rule__BusinessRule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group_1__1_in_rule__BusinessRule__Group_1__04536);
            rule__BusinessRule__Group_1__1();

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
    // $ANTLR end "rule__BusinessRule__Group_1__0"


    // $ANTLR start "rule__BusinessRule__Group_1__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2223:1: rule__BusinessRule__Group_1__0__Impl : ( ( rule__BusinessRule__OutputAssignment_1_0 ) ) ;
    public final void rule__BusinessRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2227:1: ( ( ( rule__BusinessRule__OutputAssignment_1_0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2228:1: ( ( rule__BusinessRule__OutputAssignment_1_0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2228:1: ( ( rule__BusinessRule__OutputAssignment_1_0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2229:1: ( rule__BusinessRule__OutputAssignment_1_0 )
            {
             before(grammarAccess.getBusinessRuleAccess().getOutputAssignment_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2230:1: ( rule__BusinessRule__OutputAssignment_1_0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2230:2: rule__BusinessRule__OutputAssignment_1_0
            {
            pushFollow(FOLLOW_rule__BusinessRule__OutputAssignment_1_0_in_rule__BusinessRule__Group_1__0__Impl4563);
            rule__BusinessRule__OutputAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getOutputAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_1__0__Impl"


    // $ANTLR start "rule__BusinessRule__Group_1__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2240:1: rule__BusinessRule__Group_1__1 : rule__BusinessRule__Group_1__1__Impl rule__BusinessRule__Group_1__2 ;
    public final void rule__BusinessRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2244:1: ( rule__BusinessRule__Group_1__1__Impl rule__BusinessRule__Group_1__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2245:2: rule__BusinessRule__Group_1__1__Impl rule__BusinessRule__Group_1__2
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_1__1__Impl_in_rule__BusinessRule__Group_1__14593);
            rule__BusinessRule__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group_1__2_in_rule__BusinessRule__Group_1__14596);
            rule__BusinessRule__Group_1__2();

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
    // $ANTLR end "rule__BusinessRule__Group_1__1"


    // $ANTLR start "rule__BusinessRule__Group_1__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2252:1: rule__BusinessRule__Group_1__1__Impl : ( ']' ) ;
    public final void rule__BusinessRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2256:1: ( ( ']' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2257:1: ( ']' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2257:1: ( ']' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2258:1: ']'
            {
             before(grammarAccess.getBusinessRuleAccess().getRightSquareBracketKeyword_1_1()); 
            match(input,28,FOLLOW_28_in_rule__BusinessRule__Group_1__1__Impl4624); 
             after(grammarAccess.getBusinessRuleAccess().getRightSquareBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_1__1__Impl"


    // $ANTLR start "rule__BusinessRule__Group_1__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2271:1: rule__BusinessRule__Group_1__2 : rule__BusinessRule__Group_1__2__Impl ;
    public final void rule__BusinessRule__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2275:1: ( rule__BusinessRule__Group_1__2__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2276:2: rule__BusinessRule__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_1__2__Impl_in_rule__BusinessRule__Group_1__24655);
            rule__BusinessRule__Group_1__2__Impl();

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
    // $ANTLR end "rule__BusinessRule__Group_1__2"


    // $ANTLR start "rule__BusinessRule__Group_1__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2282:1: rule__BusinessRule__Group_1__2__Impl : ( '}' ) ;
    public final void rule__BusinessRule__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2286:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2287:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2287:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2288:1: '}'
            {
             before(grammarAccess.getBusinessRuleAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,23,FOLLOW_23_in_rule__BusinessRule__Group_1__2__Impl4683); 
             after(grammarAccess.getBusinessRuleAccess().getRightCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_1__2__Impl"


    // $ANTLR start "rule__BreSystemEntityInput__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2307:1: rule__BreSystemEntityInput__Group__0 : rule__BreSystemEntityInput__Group__0__Impl rule__BreSystemEntityInput__Group__1 ;
    public final void rule__BreSystemEntityInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2311:1: ( rule__BreSystemEntityInput__Group__0__Impl rule__BreSystemEntityInput__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2312:2: rule__BreSystemEntityInput__Group__0__Impl rule__BreSystemEntityInput__Group__1
            {
            pushFollow(FOLLOW_rule__BreSystemEntityInput__Group__0__Impl_in_rule__BreSystemEntityInput__Group__04720);
            rule__BreSystemEntityInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BreSystemEntityInput__Group__1_in_rule__BreSystemEntityInput__Group__04723);
            rule__BreSystemEntityInput__Group__1();

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
    // $ANTLR end "rule__BreSystemEntityInput__Group__0"


    // $ANTLR start "rule__BreSystemEntityInput__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2319:1: rule__BreSystemEntityInput__Group__0__Impl : ( ( rule__BreSystemEntityInput__InputElementAssignment_0 ) ) ;
    public final void rule__BreSystemEntityInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2323:1: ( ( ( rule__BreSystemEntityInput__InputElementAssignment_0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2324:1: ( ( rule__BreSystemEntityInput__InputElementAssignment_0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2324:1: ( ( rule__BreSystemEntityInput__InputElementAssignment_0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2325:1: ( rule__BreSystemEntityInput__InputElementAssignment_0 )
            {
             before(grammarAccess.getBreSystemEntityInputAccess().getInputElementAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2326:1: ( rule__BreSystemEntityInput__InputElementAssignment_0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2326:2: rule__BreSystemEntityInput__InputElementAssignment_0
            {
            pushFollow(FOLLOW_rule__BreSystemEntityInput__InputElementAssignment_0_in_rule__BreSystemEntityInput__Group__0__Impl4750);
            rule__BreSystemEntityInput__InputElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBreSystemEntityInputAccess().getInputElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BreSystemEntityInput__Group__0__Impl"


    // $ANTLR start "rule__BreSystemEntityInput__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2336:1: rule__BreSystemEntityInput__Group__1 : rule__BreSystemEntityInput__Group__1__Impl ;
    public final void rule__BreSystemEntityInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2340:1: ( rule__BreSystemEntityInput__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2341:2: rule__BreSystemEntityInput__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BreSystemEntityInput__Group__1__Impl_in_rule__BreSystemEntityInput__Group__14780);
            rule__BreSystemEntityInput__Group__1__Impl();

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
    // $ANTLR end "rule__BreSystemEntityInput__Group__1"


    // $ANTLR start "rule__BreSystemEntityInput__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2347:1: rule__BreSystemEntityInput__Group__1__Impl : ( ( rule__BreSystemEntityInput__ConfigurationAssignment_1 ) ) ;
    public final void rule__BreSystemEntityInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2351:1: ( ( ( rule__BreSystemEntityInput__ConfigurationAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2352:1: ( ( rule__BreSystemEntityInput__ConfigurationAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2352:1: ( ( rule__BreSystemEntityInput__ConfigurationAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2353:1: ( rule__BreSystemEntityInput__ConfigurationAssignment_1 )
            {
             before(grammarAccess.getBreSystemEntityInputAccess().getConfigurationAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2354:1: ( rule__BreSystemEntityInput__ConfigurationAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2354:2: rule__BreSystemEntityInput__ConfigurationAssignment_1
            {
            pushFollow(FOLLOW_rule__BreSystemEntityInput__ConfigurationAssignment_1_in_rule__BreSystemEntityInput__Group__1__Impl4807);
            rule__BreSystemEntityInput__ConfigurationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBreSystemEntityInputAccess().getConfigurationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BreSystemEntityInput__Group__1__Impl"


    // $ANTLR start "rule__BreEntityInput__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2368:1: rule__BreEntityInput__Group__0 : rule__BreEntityInput__Group__0__Impl rule__BreEntityInput__Group__1 ;
    public final void rule__BreEntityInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2372:1: ( rule__BreEntityInput__Group__0__Impl rule__BreEntityInput__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2373:2: rule__BreEntityInput__Group__0__Impl rule__BreEntityInput__Group__1
            {
            pushFollow(FOLLOW_rule__BreEntityInput__Group__0__Impl_in_rule__BreEntityInput__Group__04841);
            rule__BreEntityInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BreEntityInput__Group__1_in_rule__BreEntityInput__Group__04844);
            rule__BreEntityInput__Group__1();

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
    // $ANTLR end "rule__BreEntityInput__Group__0"


    // $ANTLR start "rule__BreEntityInput__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2380:1: rule__BreEntityInput__Group__0__Impl : ( ( rule__BreEntityInput__InputElementAssignment_0 ) ) ;
    public final void rule__BreEntityInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2384:1: ( ( ( rule__BreEntityInput__InputElementAssignment_0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2385:1: ( ( rule__BreEntityInput__InputElementAssignment_0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2385:1: ( ( rule__BreEntityInput__InputElementAssignment_0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2386:1: ( rule__BreEntityInput__InputElementAssignment_0 )
            {
             before(grammarAccess.getBreEntityInputAccess().getInputElementAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2387:1: ( rule__BreEntityInput__InputElementAssignment_0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2387:2: rule__BreEntityInput__InputElementAssignment_0
            {
            pushFollow(FOLLOW_rule__BreEntityInput__InputElementAssignment_0_in_rule__BreEntityInput__Group__0__Impl4871);
            rule__BreEntityInput__InputElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBreEntityInputAccess().getInputElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BreEntityInput__Group__0__Impl"


    // $ANTLR start "rule__BreEntityInput__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2397:1: rule__BreEntityInput__Group__1 : rule__BreEntityInput__Group__1__Impl ;
    public final void rule__BreEntityInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2401:1: ( rule__BreEntityInput__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2402:2: rule__BreEntityInput__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BreEntityInput__Group__1__Impl_in_rule__BreEntityInput__Group__14901);
            rule__BreEntityInput__Group__1__Impl();

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
    // $ANTLR end "rule__BreEntityInput__Group__1"


    // $ANTLR start "rule__BreEntityInput__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2408:1: rule__BreEntityInput__Group__1__Impl : ( ( rule__BreEntityInput__ConfigurationAssignment_1 ) ) ;
    public final void rule__BreEntityInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2412:1: ( ( ( rule__BreEntityInput__ConfigurationAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2413:1: ( ( rule__BreEntityInput__ConfigurationAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2413:1: ( ( rule__BreEntityInput__ConfigurationAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2414:1: ( rule__BreEntityInput__ConfigurationAssignment_1 )
            {
             before(grammarAccess.getBreEntityInputAccess().getConfigurationAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2415:1: ( rule__BreEntityInput__ConfigurationAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2415:2: rule__BreEntityInput__ConfigurationAssignment_1
            {
            pushFollow(FOLLOW_rule__BreEntityInput__ConfigurationAssignment_1_in_rule__BreEntityInput__Group__1__Impl4928);
            rule__BreEntityInput__ConfigurationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBreEntityInputAccess().getConfigurationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BreEntityInput__Group__1__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2429:1: rule__SystemEntityConfiguration__Group__0 : rule__SystemEntityConfiguration__Group__0__Impl rule__SystemEntityConfiguration__Group__1 ;
    public final void rule__SystemEntityConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2433:1: ( rule__SystemEntityConfiguration__Group__0__Impl rule__SystemEntityConfiguration__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2434:2: rule__SystemEntityConfiguration__Group__0__Impl rule__SystemEntityConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__0__Impl_in_rule__SystemEntityConfiguration__Group__04962);
            rule__SystemEntityConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__1_in_rule__SystemEntityConfiguration__Group__04965);
            rule__SystemEntityConfiguration__Group__1();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__0"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2441:1: rule__SystemEntityConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__SystemEntityConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2445:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2446:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2446:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2447:1: ()
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getSystemEntityConfigurationAction_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2448:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2450:1: 
            {
            }

             after(grammarAccess.getSystemEntityConfigurationAccess().getSystemEntityConfigurationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__0__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2460:1: rule__SystemEntityConfiguration__Group__1 : rule__SystemEntityConfiguration__Group__1__Impl rule__SystemEntityConfiguration__Group__2 ;
    public final void rule__SystemEntityConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2464:1: ( rule__SystemEntityConfiguration__Group__1__Impl rule__SystemEntityConfiguration__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2465:2: rule__SystemEntityConfiguration__Group__1__Impl rule__SystemEntityConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__1__Impl_in_rule__SystemEntityConfiguration__Group__15023);
            rule__SystemEntityConfiguration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__2_in_rule__SystemEntityConfiguration__Group__15026);
            rule__SystemEntityConfiguration__Group__2();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__1"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2472:1: rule__SystemEntityConfiguration__Group__1__Impl : ( '{' ) ;
    public final void rule__SystemEntityConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2476:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2477:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2477:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2478:1: '{'
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__SystemEntityConfiguration__Group__1__Impl5054); 
             after(grammarAccess.getSystemEntityConfigurationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__1__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2491:1: rule__SystemEntityConfiguration__Group__2 : rule__SystemEntityConfiguration__Group__2__Impl rule__SystemEntityConfiguration__Group__3 ;
    public final void rule__SystemEntityConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2495:1: ( rule__SystemEntityConfiguration__Group__2__Impl rule__SystemEntityConfiguration__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2496:2: rule__SystemEntityConfiguration__Group__2__Impl rule__SystemEntityConfiguration__Group__3
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__2__Impl_in_rule__SystemEntityConfiguration__Group__25085);
            rule__SystemEntityConfiguration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__3_in_rule__SystemEntityConfiguration__Group__25088);
            rule__SystemEntityConfiguration__Group__3();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__2"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2503:1: rule__SystemEntityConfiguration__Group__2__Impl : ( 'prim\\u00E4r' ) ;
    public final void rule__SystemEntityConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2507:1: ( ( 'prim\\u00E4r' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2508:1: ( 'prim\\u00E4r' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2508:1: ( 'prim\\u00E4r' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2509:1: 'prim\\u00E4r'
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getPrimärKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__SystemEntityConfiguration__Group__2__Impl5116); 
             after(grammarAccess.getSystemEntityConfigurationAccess().getPrimärKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__2__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2522:1: rule__SystemEntityConfiguration__Group__3 : rule__SystemEntityConfiguration__Group__3__Impl rule__SystemEntityConfiguration__Group__4 ;
    public final void rule__SystemEntityConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2526:1: ( rule__SystemEntityConfiguration__Group__3__Impl rule__SystemEntityConfiguration__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2527:2: rule__SystemEntityConfiguration__Group__3__Impl rule__SystemEntityConfiguration__Group__4
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__3__Impl_in_rule__SystemEntityConfiguration__Group__35147);
            rule__SystemEntityConfiguration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__4_in_rule__SystemEntityConfiguration__Group__35150);
            rule__SystemEntityConfiguration__Group__4();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__3"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2534:1: rule__SystemEntityConfiguration__Group__3__Impl : ( '=' ) ;
    public final void rule__SystemEntityConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2538:1: ( ( '=' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2539:1: ( '=' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2539:1: ( '=' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2540:1: '='
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__SystemEntityConfiguration__Group__3__Impl5178); 
             after(grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__3__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2553:1: rule__SystemEntityConfiguration__Group__4 : rule__SystemEntityConfiguration__Group__4__Impl rule__SystemEntityConfiguration__Group__5 ;
    public final void rule__SystemEntityConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2557:1: ( rule__SystemEntityConfiguration__Group__4__Impl rule__SystemEntityConfiguration__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2558:2: rule__SystemEntityConfiguration__Group__4__Impl rule__SystemEntityConfiguration__Group__5
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__4__Impl_in_rule__SystemEntityConfiguration__Group__45209);
            rule__SystemEntityConfiguration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__5_in_rule__SystemEntityConfiguration__Group__45212);
            rule__SystemEntityConfiguration__Group__5();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__4"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2565:1: rule__SystemEntityConfiguration__Group__4__Impl : ( ( rule__SystemEntityConfiguration__PrimaryAssignment_4 ) ) ;
    public final void rule__SystemEntityConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2569:1: ( ( ( rule__SystemEntityConfiguration__PrimaryAssignment_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2570:1: ( ( rule__SystemEntityConfiguration__PrimaryAssignment_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2570:1: ( ( rule__SystemEntityConfiguration__PrimaryAssignment_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2571:1: ( rule__SystemEntityConfiguration__PrimaryAssignment_4 )
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getPrimaryAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2572:1: ( rule__SystemEntityConfiguration__PrimaryAssignment_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2572:2: rule__SystemEntityConfiguration__PrimaryAssignment_4
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__PrimaryAssignment_4_in_rule__SystemEntityConfiguration__Group__4__Impl5239);
            rule__SystemEntityConfiguration__PrimaryAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSystemEntityConfigurationAccess().getPrimaryAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__4__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2582:1: rule__SystemEntityConfiguration__Group__5 : rule__SystemEntityConfiguration__Group__5__Impl rule__SystemEntityConfiguration__Group__6 ;
    public final void rule__SystemEntityConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2586:1: ( rule__SystemEntityConfiguration__Group__5__Impl rule__SystemEntityConfiguration__Group__6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2587:2: rule__SystemEntityConfiguration__Group__5__Impl rule__SystemEntityConfiguration__Group__6
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__5__Impl_in_rule__SystemEntityConfiguration__Group__55269);
            rule__SystemEntityConfiguration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__6_in_rule__SystemEntityConfiguration__Group__55272);
            rule__SystemEntityConfiguration__Group__6();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__5"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__5__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2594:1: rule__SystemEntityConfiguration__Group__5__Impl : ( ',' ) ;
    public final void rule__SystemEntityConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2598:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2599:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2599:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2600:1: ','
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getCommaKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__SystemEntityConfiguration__Group__5__Impl5300); 
             after(grammarAccess.getSystemEntityConfigurationAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__5__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2613:1: rule__SystemEntityConfiguration__Group__6 : rule__SystemEntityConfiguration__Group__6__Impl rule__SystemEntityConfiguration__Group__7 ;
    public final void rule__SystemEntityConfiguration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2617:1: ( rule__SystemEntityConfiguration__Group__6__Impl rule__SystemEntityConfiguration__Group__7 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2618:2: rule__SystemEntityConfiguration__Group__6__Impl rule__SystemEntityConfiguration__Group__7
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__6__Impl_in_rule__SystemEntityConfiguration__Group__65331);
            rule__SystemEntityConfiguration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__7_in_rule__SystemEntityConfiguration__Group__65334);
            rule__SystemEntityConfiguration__Group__7();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__6"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__6__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2625:1: rule__SystemEntityConfiguration__Group__6__Impl : ( 'obligatorisch' ) ;
    public final void rule__SystemEntityConfiguration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2629:1: ( ( 'obligatorisch' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2630:1: ( 'obligatorisch' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2630:1: ( 'obligatorisch' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2631:1: 'obligatorisch'
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getObligatorischKeyword_6()); 
            match(input,37,FOLLOW_37_in_rule__SystemEntityConfiguration__Group__6__Impl5362); 
             after(grammarAccess.getSystemEntityConfigurationAccess().getObligatorischKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__6__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__7"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2644:1: rule__SystemEntityConfiguration__Group__7 : rule__SystemEntityConfiguration__Group__7__Impl rule__SystemEntityConfiguration__Group__8 ;
    public final void rule__SystemEntityConfiguration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2648:1: ( rule__SystemEntityConfiguration__Group__7__Impl rule__SystemEntityConfiguration__Group__8 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2649:2: rule__SystemEntityConfiguration__Group__7__Impl rule__SystemEntityConfiguration__Group__8
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__7__Impl_in_rule__SystemEntityConfiguration__Group__75393);
            rule__SystemEntityConfiguration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__8_in_rule__SystemEntityConfiguration__Group__75396);
            rule__SystemEntityConfiguration__Group__8();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__7"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__7__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2656:1: rule__SystemEntityConfiguration__Group__7__Impl : ( '=' ) ;
    public final void rule__SystemEntityConfiguration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2660:1: ( ( '=' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2661:1: ( '=' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2661:1: ( '=' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2662:1: '='
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_7()); 
            match(input,36,FOLLOW_36_in_rule__SystemEntityConfiguration__Group__7__Impl5424); 
             after(grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__7__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__8"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2675:1: rule__SystemEntityConfiguration__Group__8 : rule__SystemEntityConfiguration__Group__8__Impl rule__SystemEntityConfiguration__Group__9 ;
    public final void rule__SystemEntityConfiguration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2679:1: ( rule__SystemEntityConfiguration__Group__8__Impl rule__SystemEntityConfiguration__Group__9 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2680:2: rule__SystemEntityConfiguration__Group__8__Impl rule__SystemEntityConfiguration__Group__9
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__8__Impl_in_rule__SystemEntityConfiguration__Group__85455);
            rule__SystemEntityConfiguration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__9_in_rule__SystemEntityConfiguration__Group__85458);
            rule__SystemEntityConfiguration__Group__9();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__8"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__8__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2687:1: rule__SystemEntityConfiguration__Group__8__Impl : ( ( rule__SystemEntityConfiguration__ObligatorischAssignment_8 ) ) ;
    public final void rule__SystemEntityConfiguration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2691:1: ( ( ( rule__SystemEntityConfiguration__ObligatorischAssignment_8 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2692:1: ( ( rule__SystemEntityConfiguration__ObligatorischAssignment_8 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2692:1: ( ( rule__SystemEntityConfiguration__ObligatorischAssignment_8 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2693:1: ( rule__SystemEntityConfiguration__ObligatorischAssignment_8 )
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getObligatorischAssignment_8()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2694:1: ( rule__SystemEntityConfiguration__ObligatorischAssignment_8 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2694:2: rule__SystemEntityConfiguration__ObligatorischAssignment_8
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__ObligatorischAssignment_8_in_rule__SystemEntityConfiguration__Group__8__Impl5485);
            rule__SystemEntityConfiguration__ObligatorischAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSystemEntityConfigurationAccess().getObligatorischAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__8__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__9"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2704:1: rule__SystemEntityConfiguration__Group__9 : rule__SystemEntityConfiguration__Group__9__Impl rule__SystemEntityConfiguration__Group__10 ;
    public final void rule__SystemEntityConfiguration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2708:1: ( rule__SystemEntityConfiguration__Group__9__Impl rule__SystemEntityConfiguration__Group__10 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2709:2: rule__SystemEntityConfiguration__Group__9__Impl rule__SystemEntityConfiguration__Group__10
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__9__Impl_in_rule__SystemEntityConfiguration__Group__95515);
            rule__SystemEntityConfiguration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__10_in_rule__SystemEntityConfiguration__Group__95518);
            rule__SystemEntityConfiguration__Group__10();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__9"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__9__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2716:1: rule__SystemEntityConfiguration__Group__9__Impl : ( ',' ) ;
    public final void rule__SystemEntityConfiguration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2720:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2721:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2721:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2722:1: ','
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getCommaKeyword_9()); 
            match(input,29,FOLLOW_29_in_rule__SystemEntityConfiguration__Group__9__Impl5546); 
             after(grammarAccess.getSystemEntityConfigurationAccess().getCommaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__9__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__10"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2735:1: rule__SystemEntityConfiguration__Group__10 : rule__SystemEntityConfiguration__Group__10__Impl rule__SystemEntityConfiguration__Group__11 ;
    public final void rule__SystemEntityConfiguration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2739:1: ( rule__SystemEntityConfiguration__Group__10__Impl rule__SystemEntityConfiguration__Group__11 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2740:2: rule__SystemEntityConfiguration__Group__10__Impl rule__SystemEntityConfiguration__Group__11
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__10__Impl_in_rule__SystemEntityConfiguration__Group__105577);
            rule__SystemEntityConfiguration__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__11_in_rule__SystemEntityConfiguration__Group__105580);
            rule__SystemEntityConfiguration__Group__11();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__10"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__10__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2747:1: rule__SystemEntityConfiguration__Group__10__Impl : ( 'mehrfach' ) ;
    public final void rule__SystemEntityConfiguration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2751:1: ( ( 'mehrfach' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2752:1: ( 'mehrfach' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2752:1: ( 'mehrfach' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2753:1: 'mehrfach'
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getMehrfachKeyword_10()); 
            match(input,38,FOLLOW_38_in_rule__SystemEntityConfiguration__Group__10__Impl5608); 
             after(grammarAccess.getSystemEntityConfigurationAccess().getMehrfachKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__10__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__11"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2766:1: rule__SystemEntityConfiguration__Group__11 : rule__SystemEntityConfiguration__Group__11__Impl rule__SystemEntityConfiguration__Group__12 ;
    public final void rule__SystemEntityConfiguration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2770:1: ( rule__SystemEntityConfiguration__Group__11__Impl rule__SystemEntityConfiguration__Group__12 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2771:2: rule__SystemEntityConfiguration__Group__11__Impl rule__SystemEntityConfiguration__Group__12
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__11__Impl_in_rule__SystemEntityConfiguration__Group__115639);
            rule__SystemEntityConfiguration__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__12_in_rule__SystemEntityConfiguration__Group__115642);
            rule__SystemEntityConfiguration__Group__12();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__11"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__11__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2778:1: rule__SystemEntityConfiguration__Group__11__Impl : ( '=' ) ;
    public final void rule__SystemEntityConfiguration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2782:1: ( ( '=' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2783:1: ( '=' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2783:1: ( '=' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2784:1: '='
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_11()); 
            match(input,36,FOLLOW_36_in_rule__SystemEntityConfiguration__Group__11__Impl5670); 
             after(grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__11__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__12"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2797:1: rule__SystemEntityConfiguration__Group__12 : rule__SystemEntityConfiguration__Group__12__Impl rule__SystemEntityConfiguration__Group__13 ;
    public final void rule__SystemEntityConfiguration__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2801:1: ( rule__SystemEntityConfiguration__Group__12__Impl rule__SystemEntityConfiguration__Group__13 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2802:2: rule__SystemEntityConfiguration__Group__12__Impl rule__SystemEntityConfiguration__Group__13
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__12__Impl_in_rule__SystemEntityConfiguration__Group__125701);
            rule__SystemEntityConfiguration__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__13_in_rule__SystemEntityConfiguration__Group__125704);
            rule__SystemEntityConfiguration__Group__13();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__12"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__12__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2809:1: rule__SystemEntityConfiguration__Group__12__Impl : ( ( rule__SystemEntityConfiguration__MultipleAssignment_12 ) ) ;
    public final void rule__SystemEntityConfiguration__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2813:1: ( ( ( rule__SystemEntityConfiguration__MultipleAssignment_12 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2814:1: ( ( rule__SystemEntityConfiguration__MultipleAssignment_12 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2814:1: ( ( rule__SystemEntityConfiguration__MultipleAssignment_12 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2815:1: ( rule__SystemEntityConfiguration__MultipleAssignment_12 )
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getMultipleAssignment_12()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2816:1: ( rule__SystemEntityConfiguration__MultipleAssignment_12 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2816:2: rule__SystemEntityConfiguration__MultipleAssignment_12
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__MultipleAssignment_12_in_rule__SystemEntityConfiguration__Group__12__Impl5731);
            rule__SystemEntityConfiguration__MultipleAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getSystemEntityConfigurationAccess().getMultipleAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__12__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__13"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2826:1: rule__SystemEntityConfiguration__Group__13 : rule__SystemEntityConfiguration__Group__13__Impl ;
    public final void rule__SystemEntityConfiguration__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2830:1: ( rule__SystemEntityConfiguration__Group__13__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2831:2: rule__SystemEntityConfiguration__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__13__Impl_in_rule__SystemEntityConfiguration__Group__135761);
            rule__SystemEntityConfiguration__Group__13__Impl();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__13"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__13__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2837:1: rule__SystemEntityConfiguration__Group__13__Impl : ( ( rule__SystemEntityConfiguration__Group_13__0 )? ) ;
    public final void rule__SystemEntityConfiguration__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2841:1: ( ( ( rule__SystemEntityConfiguration__Group_13__0 )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2842:1: ( ( rule__SystemEntityConfiguration__Group_13__0 )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2842:1: ( ( rule__SystemEntityConfiguration__Group_13__0 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2843:1: ( rule__SystemEntityConfiguration__Group_13__0 )?
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getGroup_13()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2844:1: ( rule__SystemEntityConfiguration__Group_13__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2844:2: rule__SystemEntityConfiguration__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group_13__0_in_rule__SystemEntityConfiguration__Group__13__Impl5788);
                    rule__SystemEntityConfiguration__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemEntityConfigurationAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__13__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group_13__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2882:1: rule__SystemEntityConfiguration__Group_13__0 : rule__SystemEntityConfiguration__Group_13__0__Impl rule__SystemEntityConfiguration__Group_13__1 ;
    public final void rule__SystemEntityConfiguration__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2886:1: ( rule__SystemEntityConfiguration__Group_13__0__Impl rule__SystemEntityConfiguration__Group_13__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2887:2: rule__SystemEntityConfiguration__Group_13__0__Impl rule__SystemEntityConfiguration__Group_13__1
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group_13__0__Impl_in_rule__SystemEntityConfiguration__Group_13__05847);
            rule__SystemEntityConfiguration__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group_13__1_in_rule__SystemEntityConfiguration__Group_13__05850);
            rule__SystemEntityConfiguration__Group_13__1();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group_13__0"


    // $ANTLR start "rule__SystemEntityConfiguration__Group_13__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2894:1: rule__SystemEntityConfiguration__Group_13__0__Impl : ( ',' ) ;
    public final void rule__SystemEntityConfiguration__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2898:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2899:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2899:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2900:1: ','
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getCommaKeyword_13_0()); 
            match(input,29,FOLLOW_29_in_rule__SystemEntityConfiguration__Group_13__0__Impl5878); 
             after(grammarAccess.getSystemEntityConfigurationAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group_13__0__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group_13__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2913:1: rule__SystemEntityConfiguration__Group_13__1 : rule__SystemEntityConfiguration__Group_13__1__Impl rule__SystemEntityConfiguration__Group_13__2 ;
    public final void rule__SystemEntityConfiguration__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2917:1: ( rule__SystemEntityConfiguration__Group_13__1__Impl rule__SystemEntityConfiguration__Group_13__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2918:2: rule__SystemEntityConfiguration__Group_13__1__Impl rule__SystemEntityConfiguration__Group_13__2
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group_13__1__Impl_in_rule__SystemEntityConfiguration__Group_13__15909);
            rule__SystemEntityConfiguration__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group_13__2_in_rule__SystemEntityConfiguration__Group_13__15912);
            rule__SystemEntityConfiguration__Group_13__2();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group_13__1"


    // $ANTLR start "rule__SystemEntityConfiguration__Group_13__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2925:1: rule__SystemEntityConfiguration__Group_13__1__Impl : ( 'join Pfad' ) ;
    public final void rule__SystemEntityConfiguration__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2929:1: ( ( 'join Pfad' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2930:1: ( 'join Pfad' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2930:1: ( 'join Pfad' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2931:1: 'join Pfad'
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getJoinPfadKeyword_13_1()); 
            match(input,39,FOLLOW_39_in_rule__SystemEntityConfiguration__Group_13__1__Impl5940); 
             after(grammarAccess.getSystemEntityConfigurationAccess().getJoinPfadKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group_13__1__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group_13__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2944:1: rule__SystemEntityConfiguration__Group_13__2 : rule__SystemEntityConfiguration__Group_13__2__Impl rule__SystemEntityConfiguration__Group_13__3 ;
    public final void rule__SystemEntityConfiguration__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2948:1: ( rule__SystemEntityConfiguration__Group_13__2__Impl rule__SystemEntityConfiguration__Group_13__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2949:2: rule__SystemEntityConfiguration__Group_13__2__Impl rule__SystemEntityConfiguration__Group_13__3
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group_13__2__Impl_in_rule__SystemEntityConfiguration__Group_13__25971);
            rule__SystemEntityConfiguration__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group_13__3_in_rule__SystemEntityConfiguration__Group_13__25974);
            rule__SystemEntityConfiguration__Group_13__3();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group_13__2"


    // $ANTLR start "rule__SystemEntityConfiguration__Group_13__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2956:1: rule__SystemEntityConfiguration__Group_13__2__Impl : ( '=' ) ;
    public final void rule__SystemEntityConfiguration__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2960:1: ( ( '=' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2961:1: ( '=' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2961:1: ( '=' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2962:1: '='
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_13_2()); 
            match(input,36,FOLLOW_36_in_rule__SystemEntityConfiguration__Group_13__2__Impl6002); 
             after(grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group_13__2__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group_13__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2975:1: rule__SystemEntityConfiguration__Group_13__3 : rule__SystemEntityConfiguration__Group_13__3__Impl ;
    public final void rule__SystemEntityConfiguration__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2979:1: ( rule__SystemEntityConfiguration__Group_13__3__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2980:2: rule__SystemEntityConfiguration__Group_13__3__Impl
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group_13__3__Impl_in_rule__SystemEntityConfiguration__Group_13__36033);
            rule__SystemEntityConfiguration__Group_13__3__Impl();

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
    // $ANTLR end "rule__SystemEntityConfiguration__Group_13__3"


    // $ANTLR start "rule__SystemEntityConfiguration__Group_13__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2986:1: rule__SystemEntityConfiguration__Group_13__3__Impl : ( ( rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3 ) ) ;
    public final void rule__SystemEntityConfiguration__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2990:1: ( ( ( rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2991:1: ( ( rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2991:1: ( ( rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2992:1: ( rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3 )
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getJoinCriteriaAssignment_13_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2993:1: ( rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2993:2: rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3_in_rule__SystemEntityConfiguration__Group_13__3__Impl6060);
            rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemEntityConfigurationAccess().getJoinCriteriaAssignment_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group_13__3__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3011:1: rule__EntityConfiguration__Group__0 : rule__EntityConfiguration__Group__0__Impl rule__EntityConfiguration__Group__1 ;
    public final void rule__EntityConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3015:1: ( rule__EntityConfiguration__Group__0__Impl rule__EntityConfiguration__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3016:2: rule__EntityConfiguration__Group__0__Impl rule__EntityConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__0__Impl_in_rule__EntityConfiguration__Group__06098);
            rule__EntityConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group__1_in_rule__EntityConfiguration__Group__06101);
            rule__EntityConfiguration__Group__1();

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
    // $ANTLR end "rule__EntityConfiguration__Group__0"


    // $ANTLR start "rule__EntityConfiguration__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3023:1: rule__EntityConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__EntityConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3027:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3028:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3028:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3029:1: ()
            {
             before(grammarAccess.getEntityConfigurationAccess().getEntityConfigurationAction_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3030:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3032:1: 
            {
            }

             after(grammarAccess.getEntityConfigurationAccess().getEntityConfigurationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__0__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3042:1: rule__EntityConfiguration__Group__1 : rule__EntityConfiguration__Group__1__Impl rule__EntityConfiguration__Group__2 ;
    public final void rule__EntityConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3046:1: ( rule__EntityConfiguration__Group__1__Impl rule__EntityConfiguration__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3047:2: rule__EntityConfiguration__Group__1__Impl rule__EntityConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__1__Impl_in_rule__EntityConfiguration__Group__16159);
            rule__EntityConfiguration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group__2_in_rule__EntityConfiguration__Group__16162);
            rule__EntityConfiguration__Group__2();

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
    // $ANTLR end "rule__EntityConfiguration__Group__1"


    // $ANTLR start "rule__EntityConfiguration__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3054:1: rule__EntityConfiguration__Group__1__Impl : ( '{' ) ;
    public final void rule__EntityConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3058:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3059:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3059:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3060:1: '{'
            {
             before(grammarAccess.getEntityConfigurationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__EntityConfiguration__Group__1__Impl6190); 
             after(grammarAccess.getEntityConfigurationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__1__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3073:1: rule__EntityConfiguration__Group__2 : rule__EntityConfiguration__Group__2__Impl rule__EntityConfiguration__Group__3 ;
    public final void rule__EntityConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3077:1: ( rule__EntityConfiguration__Group__2__Impl rule__EntityConfiguration__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3078:2: rule__EntityConfiguration__Group__2__Impl rule__EntityConfiguration__Group__3
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__2__Impl_in_rule__EntityConfiguration__Group__26221);
            rule__EntityConfiguration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group__3_in_rule__EntityConfiguration__Group__26224);
            rule__EntityConfiguration__Group__3();

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
    // $ANTLR end "rule__EntityConfiguration__Group__2"


    // $ANTLR start "rule__EntityConfiguration__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3085:1: rule__EntityConfiguration__Group__2__Impl : ( 'prim\\u00E4r' ) ;
    public final void rule__EntityConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3089:1: ( ( 'prim\\u00E4r' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3090:1: ( 'prim\\u00E4r' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3090:1: ( 'prim\\u00E4r' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3091:1: 'prim\\u00E4r'
            {
             before(grammarAccess.getEntityConfigurationAccess().getPrimärKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__EntityConfiguration__Group__2__Impl6252); 
             after(grammarAccess.getEntityConfigurationAccess().getPrimärKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__2__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3104:1: rule__EntityConfiguration__Group__3 : rule__EntityConfiguration__Group__3__Impl rule__EntityConfiguration__Group__4 ;
    public final void rule__EntityConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3108:1: ( rule__EntityConfiguration__Group__3__Impl rule__EntityConfiguration__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3109:2: rule__EntityConfiguration__Group__3__Impl rule__EntityConfiguration__Group__4
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__3__Impl_in_rule__EntityConfiguration__Group__36283);
            rule__EntityConfiguration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group__4_in_rule__EntityConfiguration__Group__36286);
            rule__EntityConfiguration__Group__4();

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
    // $ANTLR end "rule__EntityConfiguration__Group__3"


    // $ANTLR start "rule__EntityConfiguration__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3116:1: rule__EntityConfiguration__Group__3__Impl : ( '=' ) ;
    public final void rule__EntityConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3120:1: ( ( '=' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3121:1: ( '=' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3121:1: ( '=' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3122:1: '='
            {
             before(grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__EntityConfiguration__Group__3__Impl6314); 
             after(grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__3__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3135:1: rule__EntityConfiguration__Group__4 : rule__EntityConfiguration__Group__4__Impl rule__EntityConfiguration__Group__5 ;
    public final void rule__EntityConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3139:1: ( rule__EntityConfiguration__Group__4__Impl rule__EntityConfiguration__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3140:2: rule__EntityConfiguration__Group__4__Impl rule__EntityConfiguration__Group__5
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__4__Impl_in_rule__EntityConfiguration__Group__46345);
            rule__EntityConfiguration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group__5_in_rule__EntityConfiguration__Group__46348);
            rule__EntityConfiguration__Group__5();

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
    // $ANTLR end "rule__EntityConfiguration__Group__4"


    // $ANTLR start "rule__EntityConfiguration__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3147:1: rule__EntityConfiguration__Group__4__Impl : ( ( rule__EntityConfiguration__PrimaryAssignment_4 ) ) ;
    public final void rule__EntityConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3151:1: ( ( ( rule__EntityConfiguration__PrimaryAssignment_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3152:1: ( ( rule__EntityConfiguration__PrimaryAssignment_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3152:1: ( ( rule__EntityConfiguration__PrimaryAssignment_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3153:1: ( rule__EntityConfiguration__PrimaryAssignment_4 )
            {
             before(grammarAccess.getEntityConfigurationAccess().getPrimaryAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3154:1: ( rule__EntityConfiguration__PrimaryAssignment_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3154:2: rule__EntityConfiguration__PrimaryAssignment_4
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__PrimaryAssignment_4_in_rule__EntityConfiguration__Group__4__Impl6375);
            rule__EntityConfiguration__PrimaryAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityConfigurationAccess().getPrimaryAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__4__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3164:1: rule__EntityConfiguration__Group__5 : rule__EntityConfiguration__Group__5__Impl rule__EntityConfiguration__Group__6 ;
    public final void rule__EntityConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3168:1: ( rule__EntityConfiguration__Group__5__Impl rule__EntityConfiguration__Group__6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3169:2: rule__EntityConfiguration__Group__5__Impl rule__EntityConfiguration__Group__6
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__5__Impl_in_rule__EntityConfiguration__Group__56405);
            rule__EntityConfiguration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group__6_in_rule__EntityConfiguration__Group__56408);
            rule__EntityConfiguration__Group__6();

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
    // $ANTLR end "rule__EntityConfiguration__Group__5"


    // $ANTLR start "rule__EntityConfiguration__Group__5__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3176:1: rule__EntityConfiguration__Group__5__Impl : ( ',' ) ;
    public final void rule__EntityConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3180:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3181:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3181:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3182:1: ','
            {
             before(grammarAccess.getEntityConfigurationAccess().getCommaKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__EntityConfiguration__Group__5__Impl6436); 
             after(grammarAccess.getEntityConfigurationAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__5__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3195:1: rule__EntityConfiguration__Group__6 : rule__EntityConfiguration__Group__6__Impl rule__EntityConfiguration__Group__7 ;
    public final void rule__EntityConfiguration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3199:1: ( rule__EntityConfiguration__Group__6__Impl rule__EntityConfiguration__Group__7 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3200:2: rule__EntityConfiguration__Group__6__Impl rule__EntityConfiguration__Group__7
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__6__Impl_in_rule__EntityConfiguration__Group__66467);
            rule__EntityConfiguration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group__7_in_rule__EntityConfiguration__Group__66470);
            rule__EntityConfiguration__Group__7();

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
    // $ANTLR end "rule__EntityConfiguration__Group__6"


    // $ANTLR start "rule__EntityConfiguration__Group__6__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3207:1: rule__EntityConfiguration__Group__6__Impl : ( 'obligatorisch' ) ;
    public final void rule__EntityConfiguration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3211:1: ( ( 'obligatorisch' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3212:1: ( 'obligatorisch' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3212:1: ( 'obligatorisch' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3213:1: 'obligatorisch'
            {
             before(grammarAccess.getEntityConfigurationAccess().getObligatorischKeyword_6()); 
            match(input,37,FOLLOW_37_in_rule__EntityConfiguration__Group__6__Impl6498); 
             after(grammarAccess.getEntityConfigurationAccess().getObligatorischKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__6__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__7"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3226:1: rule__EntityConfiguration__Group__7 : rule__EntityConfiguration__Group__7__Impl rule__EntityConfiguration__Group__8 ;
    public final void rule__EntityConfiguration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3230:1: ( rule__EntityConfiguration__Group__7__Impl rule__EntityConfiguration__Group__8 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3231:2: rule__EntityConfiguration__Group__7__Impl rule__EntityConfiguration__Group__8
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__7__Impl_in_rule__EntityConfiguration__Group__76529);
            rule__EntityConfiguration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group__8_in_rule__EntityConfiguration__Group__76532);
            rule__EntityConfiguration__Group__8();

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
    // $ANTLR end "rule__EntityConfiguration__Group__7"


    // $ANTLR start "rule__EntityConfiguration__Group__7__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3238:1: rule__EntityConfiguration__Group__7__Impl : ( '=' ) ;
    public final void rule__EntityConfiguration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3242:1: ( ( '=' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3243:1: ( '=' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3243:1: ( '=' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3244:1: '='
            {
             before(grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_7()); 
            match(input,36,FOLLOW_36_in_rule__EntityConfiguration__Group__7__Impl6560); 
             after(grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__7__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__8"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3257:1: rule__EntityConfiguration__Group__8 : rule__EntityConfiguration__Group__8__Impl rule__EntityConfiguration__Group__9 ;
    public final void rule__EntityConfiguration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3261:1: ( rule__EntityConfiguration__Group__8__Impl rule__EntityConfiguration__Group__9 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3262:2: rule__EntityConfiguration__Group__8__Impl rule__EntityConfiguration__Group__9
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__8__Impl_in_rule__EntityConfiguration__Group__86591);
            rule__EntityConfiguration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group__9_in_rule__EntityConfiguration__Group__86594);
            rule__EntityConfiguration__Group__9();

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
    // $ANTLR end "rule__EntityConfiguration__Group__8"


    // $ANTLR start "rule__EntityConfiguration__Group__8__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3269:1: rule__EntityConfiguration__Group__8__Impl : ( ( rule__EntityConfiguration__ObligatorischAssignment_8 ) ) ;
    public final void rule__EntityConfiguration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3273:1: ( ( ( rule__EntityConfiguration__ObligatorischAssignment_8 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3274:1: ( ( rule__EntityConfiguration__ObligatorischAssignment_8 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3274:1: ( ( rule__EntityConfiguration__ObligatorischAssignment_8 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3275:1: ( rule__EntityConfiguration__ObligatorischAssignment_8 )
            {
             before(grammarAccess.getEntityConfigurationAccess().getObligatorischAssignment_8()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3276:1: ( rule__EntityConfiguration__ObligatorischAssignment_8 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3276:2: rule__EntityConfiguration__ObligatorischAssignment_8
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__ObligatorischAssignment_8_in_rule__EntityConfiguration__Group__8__Impl6621);
            rule__EntityConfiguration__ObligatorischAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getEntityConfigurationAccess().getObligatorischAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__8__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__9"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3286:1: rule__EntityConfiguration__Group__9 : rule__EntityConfiguration__Group__9__Impl rule__EntityConfiguration__Group__10 ;
    public final void rule__EntityConfiguration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3290:1: ( rule__EntityConfiguration__Group__9__Impl rule__EntityConfiguration__Group__10 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3291:2: rule__EntityConfiguration__Group__9__Impl rule__EntityConfiguration__Group__10
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__9__Impl_in_rule__EntityConfiguration__Group__96651);
            rule__EntityConfiguration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group__10_in_rule__EntityConfiguration__Group__96654);
            rule__EntityConfiguration__Group__10();

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
    // $ANTLR end "rule__EntityConfiguration__Group__9"


    // $ANTLR start "rule__EntityConfiguration__Group__9__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3298:1: rule__EntityConfiguration__Group__9__Impl : ( ',' ) ;
    public final void rule__EntityConfiguration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3302:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3303:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3303:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3304:1: ','
            {
             before(grammarAccess.getEntityConfigurationAccess().getCommaKeyword_9()); 
            match(input,29,FOLLOW_29_in_rule__EntityConfiguration__Group__9__Impl6682); 
             after(grammarAccess.getEntityConfigurationAccess().getCommaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__9__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__10"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3317:1: rule__EntityConfiguration__Group__10 : rule__EntityConfiguration__Group__10__Impl rule__EntityConfiguration__Group__11 ;
    public final void rule__EntityConfiguration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3321:1: ( rule__EntityConfiguration__Group__10__Impl rule__EntityConfiguration__Group__11 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3322:2: rule__EntityConfiguration__Group__10__Impl rule__EntityConfiguration__Group__11
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__10__Impl_in_rule__EntityConfiguration__Group__106713);
            rule__EntityConfiguration__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group__11_in_rule__EntityConfiguration__Group__106716);
            rule__EntityConfiguration__Group__11();

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
    // $ANTLR end "rule__EntityConfiguration__Group__10"


    // $ANTLR start "rule__EntityConfiguration__Group__10__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3329:1: rule__EntityConfiguration__Group__10__Impl : ( 'mehrfach' ) ;
    public final void rule__EntityConfiguration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3333:1: ( ( 'mehrfach' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3334:1: ( 'mehrfach' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3334:1: ( 'mehrfach' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3335:1: 'mehrfach'
            {
             before(grammarAccess.getEntityConfigurationAccess().getMehrfachKeyword_10()); 
            match(input,38,FOLLOW_38_in_rule__EntityConfiguration__Group__10__Impl6744); 
             after(grammarAccess.getEntityConfigurationAccess().getMehrfachKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__10__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__11"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3348:1: rule__EntityConfiguration__Group__11 : rule__EntityConfiguration__Group__11__Impl rule__EntityConfiguration__Group__12 ;
    public final void rule__EntityConfiguration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3352:1: ( rule__EntityConfiguration__Group__11__Impl rule__EntityConfiguration__Group__12 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3353:2: rule__EntityConfiguration__Group__11__Impl rule__EntityConfiguration__Group__12
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__11__Impl_in_rule__EntityConfiguration__Group__116775);
            rule__EntityConfiguration__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group__12_in_rule__EntityConfiguration__Group__116778);
            rule__EntityConfiguration__Group__12();

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
    // $ANTLR end "rule__EntityConfiguration__Group__11"


    // $ANTLR start "rule__EntityConfiguration__Group__11__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3360:1: rule__EntityConfiguration__Group__11__Impl : ( '=' ) ;
    public final void rule__EntityConfiguration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3364:1: ( ( '=' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3365:1: ( '=' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3365:1: ( '=' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3366:1: '='
            {
             before(grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_11()); 
            match(input,36,FOLLOW_36_in_rule__EntityConfiguration__Group__11__Impl6806); 
             after(grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__11__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__12"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3379:1: rule__EntityConfiguration__Group__12 : rule__EntityConfiguration__Group__12__Impl rule__EntityConfiguration__Group__13 ;
    public final void rule__EntityConfiguration__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3383:1: ( rule__EntityConfiguration__Group__12__Impl rule__EntityConfiguration__Group__13 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3384:2: rule__EntityConfiguration__Group__12__Impl rule__EntityConfiguration__Group__13
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__12__Impl_in_rule__EntityConfiguration__Group__126837);
            rule__EntityConfiguration__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group__13_in_rule__EntityConfiguration__Group__126840);
            rule__EntityConfiguration__Group__13();

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
    // $ANTLR end "rule__EntityConfiguration__Group__12"


    // $ANTLR start "rule__EntityConfiguration__Group__12__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3391:1: rule__EntityConfiguration__Group__12__Impl : ( ( rule__EntityConfiguration__MultipleAssignment_12 ) ) ;
    public final void rule__EntityConfiguration__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3395:1: ( ( ( rule__EntityConfiguration__MultipleAssignment_12 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3396:1: ( ( rule__EntityConfiguration__MultipleAssignment_12 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3396:1: ( ( rule__EntityConfiguration__MultipleAssignment_12 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3397:1: ( rule__EntityConfiguration__MultipleAssignment_12 )
            {
             before(grammarAccess.getEntityConfigurationAccess().getMultipleAssignment_12()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3398:1: ( rule__EntityConfiguration__MultipleAssignment_12 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3398:2: rule__EntityConfiguration__MultipleAssignment_12
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__MultipleAssignment_12_in_rule__EntityConfiguration__Group__12__Impl6867);
            rule__EntityConfiguration__MultipleAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getEntityConfigurationAccess().getMultipleAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__12__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__13"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3408:1: rule__EntityConfiguration__Group__13 : rule__EntityConfiguration__Group__13__Impl rule__EntityConfiguration__Group__14 ;
    public final void rule__EntityConfiguration__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3412:1: ( rule__EntityConfiguration__Group__13__Impl rule__EntityConfiguration__Group__14 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3413:2: rule__EntityConfiguration__Group__13__Impl rule__EntityConfiguration__Group__14
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__13__Impl_in_rule__EntityConfiguration__Group__136897);
            rule__EntityConfiguration__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group__14_in_rule__EntityConfiguration__Group__136900);
            rule__EntityConfiguration__Group__14();

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
    // $ANTLR end "rule__EntityConfiguration__Group__13"


    // $ANTLR start "rule__EntityConfiguration__Group__13__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3420:1: rule__EntityConfiguration__Group__13__Impl : ( ( rule__EntityConfiguration__Group_13__0 )? ) ;
    public final void rule__EntityConfiguration__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3424:1: ( ( ( rule__EntityConfiguration__Group_13__0 )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3425:1: ( ( rule__EntityConfiguration__Group_13__0 )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3425:1: ( ( rule__EntityConfiguration__Group_13__0 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3426:1: ( rule__EntityConfiguration__Group_13__0 )?
            {
             before(grammarAccess.getEntityConfigurationAccess().getGroup_13()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3427:1: ( rule__EntityConfiguration__Group_13__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3427:2: rule__EntityConfiguration__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__EntityConfiguration__Group_13__0_in_rule__EntityConfiguration__Group__13__Impl6927);
                    rule__EntityConfiguration__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityConfigurationAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__13__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__14"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3437:1: rule__EntityConfiguration__Group__14 : rule__EntityConfiguration__Group__14__Impl ;
    public final void rule__EntityConfiguration__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3441:1: ( rule__EntityConfiguration__Group__14__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3442:2: rule__EntityConfiguration__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__14__Impl_in_rule__EntityConfiguration__Group__146958);
            rule__EntityConfiguration__Group__14__Impl();

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
    // $ANTLR end "rule__EntityConfiguration__Group__14"


    // $ANTLR start "rule__EntityConfiguration__Group__14__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3448:1: rule__EntityConfiguration__Group__14__Impl : ( '}' ) ;
    public final void rule__EntityConfiguration__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3452:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3453:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3453:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3454:1: '}'
            {
             before(grammarAccess.getEntityConfigurationAccess().getRightCurlyBracketKeyword_14()); 
            match(input,23,FOLLOW_23_in_rule__EntityConfiguration__Group__14__Impl6986); 
             after(grammarAccess.getEntityConfigurationAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__14__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group_13__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3497:1: rule__EntityConfiguration__Group_13__0 : rule__EntityConfiguration__Group_13__0__Impl rule__EntityConfiguration__Group_13__1 ;
    public final void rule__EntityConfiguration__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3501:1: ( rule__EntityConfiguration__Group_13__0__Impl rule__EntityConfiguration__Group_13__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3502:2: rule__EntityConfiguration__Group_13__0__Impl rule__EntityConfiguration__Group_13__1
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group_13__0__Impl_in_rule__EntityConfiguration__Group_13__07047);
            rule__EntityConfiguration__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group_13__1_in_rule__EntityConfiguration__Group_13__07050);
            rule__EntityConfiguration__Group_13__1();

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
    // $ANTLR end "rule__EntityConfiguration__Group_13__0"


    // $ANTLR start "rule__EntityConfiguration__Group_13__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3509:1: rule__EntityConfiguration__Group_13__0__Impl : ( ',' ) ;
    public final void rule__EntityConfiguration__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3513:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3514:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3514:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3515:1: ','
            {
             before(grammarAccess.getEntityConfigurationAccess().getCommaKeyword_13_0()); 
            match(input,29,FOLLOW_29_in_rule__EntityConfiguration__Group_13__0__Impl7078); 
             after(grammarAccess.getEntityConfigurationAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group_13__0__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group_13__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3528:1: rule__EntityConfiguration__Group_13__1 : rule__EntityConfiguration__Group_13__1__Impl rule__EntityConfiguration__Group_13__2 ;
    public final void rule__EntityConfiguration__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3532:1: ( rule__EntityConfiguration__Group_13__1__Impl rule__EntityConfiguration__Group_13__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3533:2: rule__EntityConfiguration__Group_13__1__Impl rule__EntityConfiguration__Group_13__2
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group_13__1__Impl_in_rule__EntityConfiguration__Group_13__17109);
            rule__EntityConfiguration__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group_13__2_in_rule__EntityConfiguration__Group_13__17112);
            rule__EntityConfiguration__Group_13__2();

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
    // $ANTLR end "rule__EntityConfiguration__Group_13__1"


    // $ANTLR start "rule__EntityConfiguration__Group_13__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3540:1: rule__EntityConfiguration__Group_13__1__Impl : ( 'Pfad' ) ;
    public final void rule__EntityConfiguration__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3544:1: ( ( 'Pfad' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3545:1: ( 'Pfad' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3545:1: ( 'Pfad' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3546:1: 'Pfad'
            {
             before(grammarAccess.getEntityConfigurationAccess().getPfadKeyword_13_1()); 
            match(input,40,FOLLOW_40_in_rule__EntityConfiguration__Group_13__1__Impl7140); 
             after(grammarAccess.getEntityConfigurationAccess().getPfadKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group_13__1__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group_13__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3559:1: rule__EntityConfiguration__Group_13__2 : rule__EntityConfiguration__Group_13__2__Impl rule__EntityConfiguration__Group_13__3 ;
    public final void rule__EntityConfiguration__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3563:1: ( rule__EntityConfiguration__Group_13__2__Impl rule__EntityConfiguration__Group_13__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3564:2: rule__EntityConfiguration__Group_13__2__Impl rule__EntityConfiguration__Group_13__3
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group_13__2__Impl_in_rule__EntityConfiguration__Group_13__27171);
            rule__EntityConfiguration__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group_13__3_in_rule__EntityConfiguration__Group_13__27174);
            rule__EntityConfiguration__Group_13__3();

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
    // $ANTLR end "rule__EntityConfiguration__Group_13__2"


    // $ANTLR start "rule__EntityConfiguration__Group_13__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3571:1: rule__EntityConfiguration__Group_13__2__Impl : ( '=' ) ;
    public final void rule__EntityConfiguration__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3575:1: ( ( '=' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3576:1: ( '=' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3576:1: ( '=' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3577:1: '='
            {
             before(grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_13_2()); 
            match(input,36,FOLLOW_36_in_rule__EntityConfiguration__Group_13__2__Impl7202); 
             after(grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group_13__2__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group_13__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3590:1: rule__EntityConfiguration__Group_13__3 : rule__EntityConfiguration__Group_13__3__Impl ;
    public final void rule__EntityConfiguration__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3594:1: ( rule__EntityConfiguration__Group_13__3__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3595:2: rule__EntityConfiguration__Group_13__3__Impl
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group_13__3__Impl_in_rule__EntityConfiguration__Group_13__37233);
            rule__EntityConfiguration__Group_13__3__Impl();

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
    // $ANTLR end "rule__EntityConfiguration__Group_13__3"


    // $ANTLR start "rule__EntityConfiguration__Group_13__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3601:1: rule__EntityConfiguration__Group_13__3__Impl : ( ( rule__EntityConfiguration__PathAssignment_13_3 ) ) ;
    public final void rule__EntityConfiguration__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3605:1: ( ( ( rule__EntityConfiguration__PathAssignment_13_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3606:1: ( ( rule__EntityConfiguration__PathAssignment_13_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3606:1: ( ( rule__EntityConfiguration__PathAssignment_13_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3607:1: ( rule__EntityConfiguration__PathAssignment_13_3 )
            {
             before(grammarAccess.getEntityConfigurationAccess().getPathAssignment_13_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3608:1: ( rule__EntityConfiguration__PathAssignment_13_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3608:2: rule__EntityConfiguration__PathAssignment_13_3
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__PathAssignment_13_3_in_rule__EntityConfiguration__Group_13__3__Impl7260);
            rule__EntityConfiguration__PathAssignment_13_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityConfigurationAccess().getPathAssignment_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group_13__3__Impl"


    // $ANTLR start "rule__System__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3626:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3630:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3631:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__07298);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__07301);
            rule__System__Group__1();

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3638:1: rule__System__Group__0__Impl : ( 'SourceSystem' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3642:1: ( ( 'SourceSystem' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3643:1: ( 'SourceSystem' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3643:1: ( 'SourceSystem' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3644:1: 'SourceSystem'
            {
             before(grammarAccess.getSystemAccess().getSourceSystemKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__System__Group__0__Impl7329); 
             after(grammarAccess.getSystemAccess().getSourceSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3657:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3661:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3662:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__17360);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__17363);
            rule__System__Group__2();

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3669:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3673:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3674:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3674:1: ( ( rule__System__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3675:1: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3676:1: ( rule__System__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3676:2: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl7390);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3686:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3690:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3691:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__27420);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__3_in_rule__System__Group__27423);
            rule__System__Group__3();

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3698:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3702:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3703:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3703:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3704:1: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__System__Group__2__Impl7451); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3717:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3721:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3722:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__37482);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__4_in_rule__System__Group__37485);
            rule__System__Group__4();

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
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3729:1: rule__System__Group__3__Impl : ( ( rule__System__SrcEntitiesAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3733:1: ( ( ( rule__System__SrcEntitiesAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3734:1: ( ( rule__System__SrcEntitiesAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3734:1: ( ( rule__System__SrcEntitiesAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3735:1: ( rule__System__SrcEntitiesAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getSrcEntitiesAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3736:1: ( rule__System__SrcEntitiesAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3736:2: rule__System__SrcEntitiesAssignment_3
            {
            pushFollow(FOLLOW_rule__System__SrcEntitiesAssignment_3_in_rule__System__Group__3__Impl7512);
            rule__System__SrcEntitiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getSrcEntitiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3746:1: rule__System__Group__4 : rule__System__Group__4__Impl ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3750:1: ( rule__System__Group__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3751:2: rule__System__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__47542);
            rule__System__Group__4__Impl();

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
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3757:1: rule__System__Group__4__Impl : ( '}' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3761:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3762:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3762:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3763:1: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__System__Group__4__Impl7570); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__SystemEntity__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3786:1: rule__SystemEntity__Group__0 : rule__SystemEntity__Group__0__Impl rule__SystemEntity__Group__1 ;
    public final void rule__SystemEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3790:1: ( rule__SystemEntity__Group__0__Impl rule__SystemEntity__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3791:2: rule__SystemEntity__Group__0__Impl rule__SystemEntity__Group__1
            {
            pushFollow(FOLLOW_rule__SystemEntity__Group__0__Impl_in_rule__SystemEntity__Group__07611);
            rule__SystemEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntity__Group__1_in_rule__SystemEntity__Group__07614);
            rule__SystemEntity__Group__1();

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
    // $ANTLR end "rule__SystemEntity__Group__0"


    // $ANTLR start "rule__SystemEntity__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3798:1: rule__SystemEntity__Group__0__Impl : ( 'SystemEntit\\u00E4t' ) ;
    public final void rule__SystemEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3802:1: ( ( 'SystemEntit\\u00E4t' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3803:1: ( 'SystemEntit\\u00E4t' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3803:1: ( 'SystemEntit\\u00E4t' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3804:1: 'SystemEntit\\u00E4t'
            {
             before(grammarAccess.getSystemEntityAccess().getSystemEntitätKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__SystemEntity__Group__0__Impl7642); 
             after(grammarAccess.getSystemEntityAccess().getSystemEntitätKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntity__Group__0__Impl"


    // $ANTLR start "rule__SystemEntity__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3817:1: rule__SystemEntity__Group__1 : rule__SystemEntity__Group__1__Impl rule__SystemEntity__Group__2 ;
    public final void rule__SystemEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3821:1: ( rule__SystemEntity__Group__1__Impl rule__SystemEntity__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3822:2: rule__SystemEntity__Group__1__Impl rule__SystemEntity__Group__2
            {
            pushFollow(FOLLOW_rule__SystemEntity__Group__1__Impl_in_rule__SystemEntity__Group__17673);
            rule__SystemEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntity__Group__2_in_rule__SystemEntity__Group__17676);
            rule__SystemEntity__Group__2();

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
    // $ANTLR end "rule__SystemEntity__Group__1"


    // $ANTLR start "rule__SystemEntity__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3829:1: rule__SystemEntity__Group__1__Impl : ( ( rule__SystemEntity__NameAssignment_1 ) ) ;
    public final void rule__SystemEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3833:1: ( ( ( rule__SystemEntity__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3834:1: ( ( rule__SystemEntity__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3834:1: ( ( rule__SystemEntity__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3835:1: ( rule__SystemEntity__NameAssignment_1 )
            {
             before(grammarAccess.getSystemEntityAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3836:1: ( rule__SystemEntity__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3836:2: rule__SystemEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SystemEntity__NameAssignment_1_in_rule__SystemEntity__Group__1__Impl7703);
            rule__SystemEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntity__Group__1__Impl"


    // $ANTLR start "rule__SystemEntity__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3846:1: rule__SystemEntity__Group__2 : rule__SystemEntity__Group__2__Impl rule__SystemEntity__Group__3 ;
    public final void rule__SystemEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3850:1: ( rule__SystemEntity__Group__2__Impl rule__SystemEntity__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3851:2: rule__SystemEntity__Group__2__Impl rule__SystemEntity__Group__3
            {
            pushFollow(FOLLOW_rule__SystemEntity__Group__2__Impl_in_rule__SystemEntity__Group__27733);
            rule__SystemEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntity__Group__3_in_rule__SystemEntity__Group__27736);
            rule__SystemEntity__Group__3();

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
    // $ANTLR end "rule__SystemEntity__Group__2"


    // $ANTLR start "rule__SystemEntity__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3858:1: rule__SystemEntity__Group__2__Impl : ( 'Format' ) ;
    public final void rule__SystemEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3862:1: ( ( 'Format' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3863:1: ( 'Format' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3863:1: ( 'Format' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3864:1: 'Format'
            {
             before(grammarAccess.getSystemEntityAccess().getFormatKeyword_2()); 
            match(input,43,FOLLOW_43_in_rule__SystemEntity__Group__2__Impl7764); 
             after(grammarAccess.getSystemEntityAccess().getFormatKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntity__Group__2__Impl"


    // $ANTLR start "rule__SystemEntity__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3877:1: rule__SystemEntity__Group__3 : rule__SystemEntity__Group__3__Impl ;
    public final void rule__SystemEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3881:1: ( rule__SystemEntity__Group__3__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3882:2: rule__SystemEntity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SystemEntity__Group__3__Impl_in_rule__SystemEntity__Group__37795);
            rule__SystemEntity__Group__3__Impl();

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
    // $ANTLR end "rule__SystemEntity__Group__3"


    // $ANTLR start "rule__SystemEntity__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3888:1: rule__SystemEntity__Group__3__Impl : ( ( rule__SystemEntity__FormatAssignment_3 ) ) ;
    public final void rule__SystemEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3892:1: ( ( ( rule__SystemEntity__FormatAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3893:1: ( ( rule__SystemEntity__FormatAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3893:1: ( ( rule__SystemEntity__FormatAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3894:1: ( rule__SystemEntity__FormatAssignment_3 )
            {
             before(grammarAccess.getSystemEntityAccess().getFormatAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3895:1: ( rule__SystemEntity__FormatAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3895:2: rule__SystemEntity__FormatAssignment_3
            {
            pushFollow(FOLLOW_rule__SystemEntity__FormatAssignment_3_in_rule__SystemEntity__Group__3__Impl7822);
            rule__SystemEntity__FormatAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemEntityAccess().getFormatAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntity__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3913:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3917:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3918:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__07860);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__07863);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3925:1: rule__Import__Group__0__Impl : ( 'Import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3929:1: ( ( 'Import' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3930:1: ( 'Import' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3930:1: ( 'Import' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3931:1: 'Import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Import__Group__0__Impl7891); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3944:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3948:1: ( rule__Import__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3949:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__17922);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3955:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3959:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3960:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3960:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3961:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3962:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3962:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl7949);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__FqnWithWildCard__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3976:1: rule__FqnWithWildCard__Group__0 : rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 ;
    public final void rule__FqnWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3980:1: ( rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3981:2: rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__0__Impl_in_rule__FqnWithWildCard__Group__07983);
            rule__FqnWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__1_in_rule__FqnWithWildCard__Group__07986);
            rule__FqnWithWildCard__Group__1();

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
    // $ANTLR end "rule__FqnWithWildCard__Group__0"


    // $ANTLR start "rule__FqnWithWildCard__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3988:1: rule__FqnWithWildCard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FqnWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3992:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3993:1: ( ruleFQN )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3993:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3994:1: ruleFQN
            {
             before(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__FqnWithWildCard__Group__0__Impl8013);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FqnWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__FqnWithWildCard__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4005:1: rule__FqnWithWildCard__Group__1 : rule__FqnWithWildCard__Group__1__Impl ;
    public final void rule__FqnWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4009:1: ( rule__FqnWithWildCard__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4010:2: rule__FqnWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__1__Impl_in_rule__FqnWithWildCard__Group__18042);
            rule__FqnWithWildCard__Group__1__Impl();

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
    // $ANTLR end "rule__FqnWithWildCard__Group__1"


    // $ANTLR start "rule__FqnWithWildCard__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4016:1: rule__FqnWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FqnWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4020:1: ( ( ( '.*' )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4021:1: ( ( '.*' )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4021:1: ( ( '.*' )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4022:1: ( '.*' )?
            {
             before(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4023:1: ( '.*' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4024:2: '.*'
                    {
                    match(input,45,FOLLOW_45_in_rule__FqnWithWildCard__Group__1__Impl8071); 

                    }
                    break;

            }

             after(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FqnWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__Diagram__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4039:1: rule__Diagram__Group__0 : rule__Diagram__Group__0__Impl rule__Diagram__Group__1 ;
    public final void rule__Diagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4043:1: ( rule__Diagram__Group__0__Impl rule__Diagram__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4044:2: rule__Diagram__Group__0__Impl rule__Diagram__Group__1
            {
            pushFollow(FOLLOW_rule__Diagram__Group__0__Impl_in_rule__Diagram__Group__08108);
            rule__Diagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__1_in_rule__Diagram__Group__08111);
            rule__Diagram__Group__1();

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
    // $ANTLR end "rule__Diagram__Group__0"


    // $ANTLR start "rule__Diagram__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4051:1: rule__Diagram__Group__0__Impl : ( ( rule__Diagram__ImportsAssignment_0 )* ) ;
    public final void rule__Diagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4055:1: ( ( ( rule__Diagram__ImportsAssignment_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4056:1: ( ( rule__Diagram__ImportsAssignment_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4056:1: ( ( rule__Diagram__ImportsAssignment_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4057:1: ( rule__Diagram__ImportsAssignment_0 )*
            {
             before(grammarAccess.getDiagramAccess().getImportsAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4058:1: ( rule__Diagram__ImportsAssignment_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==44) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4058:2: rule__Diagram__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Diagram__ImportsAssignment_0_in_rule__Diagram__Group__0__Impl8138);
            	    rule__Diagram__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getDiagramAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__0__Impl"


    // $ANTLR start "rule__Diagram__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4068:1: rule__Diagram__Group__1 : rule__Diagram__Group__1__Impl rule__Diagram__Group__2 ;
    public final void rule__Diagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4072:1: ( rule__Diagram__Group__1__Impl rule__Diagram__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4073:2: rule__Diagram__Group__1__Impl rule__Diagram__Group__2
            {
            pushFollow(FOLLOW_rule__Diagram__Group__1__Impl_in_rule__Diagram__Group__18169);
            rule__Diagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__2_in_rule__Diagram__Group__18172);
            rule__Diagram__Group__2();

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
    // $ANTLR end "rule__Diagram__Group__1"


    // $ANTLR start "rule__Diagram__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4080:1: rule__Diagram__Group__1__Impl : ( 'Diagram' ) ;
    public final void rule__Diagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4084:1: ( ( 'Diagram' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4085:1: ( 'Diagram' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4085:1: ( 'Diagram' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4086:1: 'Diagram'
            {
             before(grammarAccess.getDiagramAccess().getDiagramKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__Diagram__Group__1__Impl8200); 
             after(grammarAccess.getDiagramAccess().getDiagramKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__1__Impl"


    // $ANTLR start "rule__Diagram__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4099:1: rule__Diagram__Group__2 : rule__Diagram__Group__2__Impl rule__Diagram__Group__3 ;
    public final void rule__Diagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4103:1: ( rule__Diagram__Group__2__Impl rule__Diagram__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4104:2: rule__Diagram__Group__2__Impl rule__Diagram__Group__3
            {
            pushFollow(FOLLOW_rule__Diagram__Group__2__Impl_in_rule__Diagram__Group__28231);
            rule__Diagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__3_in_rule__Diagram__Group__28234);
            rule__Diagram__Group__3();

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
    // $ANTLR end "rule__Diagram__Group__2"


    // $ANTLR start "rule__Diagram__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4111:1: rule__Diagram__Group__2__Impl : ( ( rule__Diagram__NameAssignment_2 ) ) ;
    public final void rule__Diagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4115:1: ( ( ( rule__Diagram__NameAssignment_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4116:1: ( ( rule__Diagram__NameAssignment_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4116:1: ( ( rule__Diagram__NameAssignment_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4117:1: ( rule__Diagram__NameAssignment_2 )
            {
             before(grammarAccess.getDiagramAccess().getNameAssignment_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4118:1: ( rule__Diagram__NameAssignment_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4118:2: rule__Diagram__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Diagram__NameAssignment_2_in_rule__Diagram__Group__2__Impl8261);
            rule__Diagram__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__2__Impl"


    // $ANTLR start "rule__Diagram__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4128:1: rule__Diagram__Group__3 : rule__Diagram__Group__3__Impl rule__Diagram__Group__4 ;
    public final void rule__Diagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4132:1: ( rule__Diagram__Group__3__Impl rule__Diagram__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4133:2: rule__Diagram__Group__3__Impl rule__Diagram__Group__4
            {
            pushFollow(FOLLOW_rule__Diagram__Group__3__Impl_in_rule__Diagram__Group__38291);
            rule__Diagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__4_in_rule__Diagram__Group__38294);
            rule__Diagram__Group__4();

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
    // $ANTLR end "rule__Diagram__Group__3"


    // $ANTLR start "rule__Diagram__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4140:1: rule__Diagram__Group__3__Impl : ( '{' ) ;
    public final void rule__Diagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4144:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4145:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4145:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4146:1: '{'
            {
             before(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Diagram__Group__3__Impl8322); 
             after(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__3__Impl"


    // $ANTLR start "rule__Diagram__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4159:1: rule__Diagram__Group__4 : rule__Diagram__Group__4__Impl rule__Diagram__Group__5 ;
    public final void rule__Diagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4163:1: ( rule__Diagram__Group__4__Impl rule__Diagram__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4164:2: rule__Diagram__Group__4__Impl rule__Diagram__Group__5
            {
            pushFollow(FOLLOW_rule__Diagram__Group__4__Impl_in_rule__Diagram__Group__48353);
            rule__Diagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__5_in_rule__Diagram__Group__48356);
            rule__Diagram__Group__5();

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
    // $ANTLR end "rule__Diagram__Group__4"


    // $ANTLR start "rule__Diagram__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4171:1: rule__Diagram__Group__4__Impl : ( ( rule__Diagram__IncludesAssignment_4 )* ) ;
    public final void rule__Diagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4175:1: ( ( ( rule__Diagram__IncludesAssignment_4 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4176:1: ( ( rule__Diagram__IncludesAssignment_4 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4176:1: ( ( rule__Diagram__IncludesAssignment_4 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4177:1: ( rule__Diagram__IncludesAssignment_4 )*
            {
             before(grammarAccess.getDiagramAccess().getIncludesAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4178:1: ( rule__Diagram__IncludesAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=11 && LA21_0<=12)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4178:2: rule__Diagram__IncludesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Diagram__IncludesAssignment_4_in_rule__Diagram__Group__4__Impl8383);
            	    rule__Diagram__IncludesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getDiagramAccess().getIncludesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__4__Impl"


    // $ANTLR start "rule__Diagram__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4188:1: rule__Diagram__Group__5 : rule__Diagram__Group__5__Impl ;
    public final void rule__Diagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4192:1: ( rule__Diagram__Group__5__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4193:2: rule__Diagram__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Diagram__Group__5__Impl_in_rule__Diagram__Group__58414);
            rule__Diagram__Group__5__Impl();

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
    // $ANTLR end "rule__Diagram__Group__5"


    // $ANTLR start "rule__Diagram__Group__5__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4199:1: rule__Diagram__Group__5__Impl : ( '}' ) ;
    public final void rule__Diagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4203:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4204:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4204:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4205:1: '}'
            {
             before(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Diagram__Group__5__Impl8442); 
             after(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__5__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4230:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4234:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4235:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__08485);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__08488);
            rule__Include__Group__1();

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
    // $ANTLR end "rule__Include__Group__0"


    // $ANTLR start "rule__Include__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4242:1: rule__Include__Group__0__Impl : ( ( rule__Include__IncludeAssignment_0 ) ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4246:1: ( ( ( rule__Include__IncludeAssignment_0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4247:1: ( ( rule__Include__IncludeAssignment_0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4247:1: ( ( rule__Include__IncludeAssignment_0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4248:1: ( rule__Include__IncludeAssignment_0 )
            {
             before(grammarAccess.getIncludeAccess().getIncludeAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4249:1: ( rule__Include__IncludeAssignment_0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4249:2: rule__Include__IncludeAssignment_0
            {
            pushFollow(FOLLOW_rule__Include__IncludeAssignment_0_in_rule__Include__Group__0__Impl8515);
            rule__Include__IncludeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getIncludeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4259:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4263:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4264:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__18545);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__18548);
            rule__Include__Group__2();

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
    // $ANTLR end "rule__Include__Group__1"


    // $ANTLR start "rule__Include__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4271:1: rule__Include__Group__1__Impl : ( ( rule__Include__EntityAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4275:1: ( ( ( rule__Include__EntityAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4276:1: ( ( rule__Include__EntityAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4276:1: ( ( rule__Include__EntityAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4277:1: ( rule__Include__EntityAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getEntityAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4278:1: ( rule__Include__EntityAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4278:2: rule__Include__EntityAssignment_1
            {
            pushFollow(FOLLOW_rule__Include__EntityAssignment_1_in_rule__Include__Group__1__Impl8575);
            rule__Include__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getEntityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__Include__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4288:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4292:1: ( rule__Include__Group__2__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4293:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__28605);
            rule__Include__Group__2__Impl();

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
    // $ANTLR end "rule__Include__Group__2"


    // $ANTLR start "rule__Include__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4299:1: rule__Include__Group__2__Impl : ( ( rule__Include__Group_2__0 ) ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4303:1: ( ( ( rule__Include__Group_2__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4304:1: ( ( rule__Include__Group_2__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4304:1: ( ( rule__Include__Group_2__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4305:1: ( rule__Include__Group_2__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4306:1: ( rule__Include__Group_2__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4306:2: rule__Include__Group_2__0
            {
            pushFollow(FOLLOW_rule__Include__Group_2__0_in_rule__Include__Group__2__Impl8632);
            rule__Include__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__2__Impl"


    // $ANTLR start "rule__Include__Group_2__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4322:1: rule__Include__Group_2__0 : rule__Include__Group_2__0__Impl rule__Include__Group_2__1 ;
    public final void rule__Include__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4326:1: ( rule__Include__Group_2__0__Impl rule__Include__Group_2__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4327:2: rule__Include__Group_2__0__Impl rule__Include__Group_2__1
            {
            pushFollow(FOLLOW_rule__Include__Group_2__0__Impl_in_rule__Include__Group_2__08668);
            rule__Include__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__1_in_rule__Include__Group_2__08671);
            rule__Include__Group_2__1();

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
    // $ANTLR end "rule__Include__Group_2__0"


    // $ANTLR start "rule__Include__Group_2__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4334:1: rule__Include__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__Include__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4338:1: ( ( 'with' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4339:1: ( 'with' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4339:1: ( 'with' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4340:1: 'with'
            {
             before(grammarAccess.getIncludeAccess().getWithKeyword_2_0()); 
            match(input,47,FOLLOW_47_in_rule__Include__Group_2__0__Impl8699); 
             after(grammarAccess.getIncludeAccess().getWithKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group_2__0__Impl"


    // $ANTLR start "rule__Include__Group_2__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4353:1: rule__Include__Group_2__1 : rule__Include__Group_2__1__Impl rule__Include__Group_2__2 ;
    public final void rule__Include__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4357:1: ( rule__Include__Group_2__1__Impl rule__Include__Group_2__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4358:2: rule__Include__Group_2__1__Impl rule__Include__Group_2__2
            {
            pushFollow(FOLLOW_rule__Include__Group_2__1__Impl_in_rule__Include__Group_2__18730);
            rule__Include__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__2_in_rule__Include__Group_2__18733);
            rule__Include__Group_2__2();

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
    // $ANTLR end "rule__Include__Group_2__1"


    // $ANTLR start "rule__Include__Group_2__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4365:1: rule__Include__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Include__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4369:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4370:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4370:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4371:1: '{'
            {
             before(grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,22,FOLLOW_22_in_rule__Include__Group_2__1__Impl8761); 
             after(grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group_2__1__Impl"


    // $ANTLR start "rule__Include__Group_2__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4384:1: rule__Include__Group_2__2 : rule__Include__Group_2__2__Impl rule__Include__Group_2__3 ;
    public final void rule__Include__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4388:1: ( rule__Include__Group_2__2__Impl rule__Include__Group_2__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4389:2: rule__Include__Group_2__2__Impl rule__Include__Group_2__3
            {
            pushFollow(FOLLOW_rule__Include__Group_2__2__Impl_in_rule__Include__Group_2__28792);
            rule__Include__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__3_in_rule__Include__Group_2__28795);
            rule__Include__Group_2__3();

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
    // $ANTLR end "rule__Include__Group_2__2"


    // $ANTLR start "rule__Include__Group_2__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4396:1: rule__Include__Group_2__2__Impl : ( ( rule__Include__FieldsAssignment_2_2 ) ) ;
    public final void rule__Include__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4400:1: ( ( ( rule__Include__FieldsAssignment_2_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4401:1: ( ( rule__Include__FieldsAssignment_2_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4401:1: ( ( rule__Include__FieldsAssignment_2_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4402:1: ( rule__Include__FieldsAssignment_2_2 )
            {
             before(grammarAccess.getIncludeAccess().getFieldsAssignment_2_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4403:1: ( rule__Include__FieldsAssignment_2_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4403:2: rule__Include__FieldsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Include__FieldsAssignment_2_2_in_rule__Include__Group_2__2__Impl8822);
            rule__Include__FieldsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getFieldsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group_2__2__Impl"


    // $ANTLR start "rule__Include__Group_2__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4413:1: rule__Include__Group_2__3 : rule__Include__Group_2__3__Impl rule__Include__Group_2__4 ;
    public final void rule__Include__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4417:1: ( rule__Include__Group_2__3__Impl rule__Include__Group_2__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4418:2: rule__Include__Group_2__3__Impl rule__Include__Group_2__4
            {
            pushFollow(FOLLOW_rule__Include__Group_2__3__Impl_in_rule__Include__Group_2__38852);
            rule__Include__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__4_in_rule__Include__Group_2__38855);
            rule__Include__Group_2__4();

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
    // $ANTLR end "rule__Include__Group_2__3"


    // $ANTLR start "rule__Include__Group_2__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4425:1: rule__Include__Group_2__3__Impl : ( ( rule__Include__Group_2_3__0 )* ) ;
    public final void rule__Include__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4429:1: ( ( ( rule__Include__Group_2_3__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4430:1: ( ( rule__Include__Group_2_3__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4430:1: ( ( rule__Include__Group_2_3__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4431:1: ( rule__Include__Group_2_3__0 )*
            {
             before(grammarAccess.getIncludeAccess().getGroup_2_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4432:1: ( rule__Include__Group_2_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4432:2: rule__Include__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Include__Group_2_3__0_in_rule__Include__Group_2__3__Impl8882);
            	    rule__Include__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getIncludeAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group_2__3__Impl"


    // $ANTLR start "rule__Include__Group_2__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4442:1: rule__Include__Group_2__4 : rule__Include__Group_2__4__Impl ;
    public final void rule__Include__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4446:1: ( rule__Include__Group_2__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4447:2: rule__Include__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group_2__4__Impl_in_rule__Include__Group_2__48913);
            rule__Include__Group_2__4__Impl();

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
    // $ANTLR end "rule__Include__Group_2__4"


    // $ANTLR start "rule__Include__Group_2__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4453:1: rule__Include__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Include__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4457:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4458:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4458:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4459:1: '}'
            {
             before(grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,23,FOLLOW_23_in_rule__Include__Group_2__4__Impl8941); 
             after(grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group_2__4__Impl"


    // $ANTLR start "rule__Include__Group_2_3__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4482:1: rule__Include__Group_2_3__0 : rule__Include__Group_2_3__0__Impl rule__Include__Group_2_3__1 ;
    public final void rule__Include__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4486:1: ( rule__Include__Group_2_3__0__Impl rule__Include__Group_2_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4487:2: rule__Include__Group_2_3__0__Impl rule__Include__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__Include__Group_2_3__0__Impl_in_rule__Include__Group_2_3__08982);
            rule__Include__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2_3__1_in_rule__Include__Group_2_3__08985);
            rule__Include__Group_2_3__1();

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
    // $ANTLR end "rule__Include__Group_2_3__0"


    // $ANTLR start "rule__Include__Group_2_3__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4494:1: rule__Include__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Include__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4498:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4499:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4499:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4500:1: ','
            {
             before(grammarAccess.getIncludeAccess().getCommaKeyword_2_3_0()); 
            match(input,29,FOLLOW_29_in_rule__Include__Group_2_3__0__Impl9013); 
             after(grammarAccess.getIncludeAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group_2_3__0__Impl"


    // $ANTLR start "rule__Include__Group_2_3__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4513:1: rule__Include__Group_2_3__1 : rule__Include__Group_2_3__1__Impl ;
    public final void rule__Include__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4517:1: ( rule__Include__Group_2_3__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4518:2: rule__Include__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group_2_3__1__Impl_in_rule__Include__Group_2_3__19044);
            rule__Include__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__Include__Group_2_3__1"


    // $ANTLR start "rule__Include__Group_2_3__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4524:1: rule__Include__Group_2_3__1__Impl : ( ( rule__Include__FieldsAssignment_2_3_1 ) ) ;
    public final void rule__Include__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4528:1: ( ( ( rule__Include__FieldsAssignment_2_3_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4529:1: ( ( rule__Include__FieldsAssignment_2_3_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4529:1: ( ( rule__Include__FieldsAssignment_2_3_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4530:1: ( rule__Include__FieldsAssignment_2_3_1 )
            {
             before(grammarAccess.getIncludeAccess().getFieldsAssignment_2_3_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4531:1: ( rule__Include__FieldsAssignment_2_3_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4531:2: rule__Include__FieldsAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__Include__FieldsAssignment_2_3_1_in_rule__Include__Group_2_3__1__Impl9071);
            rule__Include__FieldsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getFieldsAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group_2_3__1__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4545:1: rule__EnumDeclaration__Group__0 : rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 ;
    public final void rule__EnumDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4549:1: ( rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4550:2: rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__0__Impl_in_rule__EnumDeclaration__Group__09105);
            rule__EnumDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__1_in_rule__EnumDeclaration__Group__09108);
            rule__EnumDeclaration__Group__1();

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
    // $ANTLR end "rule__EnumDeclaration__Group__0"


    // $ANTLR start "rule__EnumDeclaration__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4557:1: rule__EnumDeclaration__Group__0__Impl : ( 'Enumeration' ) ;
    public final void rule__EnumDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4561:1: ( ( 'Enumeration' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4562:1: ( 'Enumeration' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4562:1: ( 'Enumeration' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4563:1: 'Enumeration'
            {
             before(grammarAccess.getEnumDeclarationAccess().getEnumerationKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__EnumDeclaration__Group__0__Impl9136); 
             after(grammarAccess.getEnumDeclarationAccess().getEnumerationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4576:1: rule__EnumDeclaration__Group__1 : rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 ;
    public final void rule__EnumDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4580:1: ( rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4581:2: rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__1__Impl_in_rule__EnumDeclaration__Group__19167);
            rule__EnumDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__2_in_rule__EnumDeclaration__Group__19170);
            rule__EnumDeclaration__Group__2();

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
    // $ANTLR end "rule__EnumDeclaration__Group__1"


    // $ANTLR start "rule__EnumDeclaration__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4588:1: rule__EnumDeclaration__Group__1__Impl : ( ( rule__EnumDeclaration__NameAssignment_1 ) ) ;
    public final void rule__EnumDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4592:1: ( ( ( rule__EnumDeclaration__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4593:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4593:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4594:1: ( rule__EnumDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4595:1: ( rule__EnumDeclaration__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4595:2: rule__EnumDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__NameAssignment_1_in_rule__EnumDeclaration__Group__1__Impl9197);
            rule__EnumDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__1__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4605:1: rule__EnumDeclaration__Group__2 : rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 ;
    public final void rule__EnumDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4609:1: ( rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4610:2: rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__2__Impl_in_rule__EnumDeclaration__Group__29227);
            rule__EnumDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__3_in_rule__EnumDeclaration__Group__29230);
            rule__EnumDeclaration__Group__3();

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
    // $ANTLR end "rule__EnumDeclaration__Group__2"


    // $ANTLR start "rule__EnumDeclaration__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4617:1: rule__EnumDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4621:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4622:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4622:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4623:1: '{'
            {
             before(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__EnumDeclaration__Group__2__Impl9258); 
             after(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__2__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4636:1: rule__EnumDeclaration__Group__3 : rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 ;
    public final void rule__EnumDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4640:1: ( rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4641:2: rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__3__Impl_in_rule__EnumDeclaration__Group__39289);
            rule__EnumDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__4_in_rule__EnumDeclaration__Group__39292);
            rule__EnumDeclaration__Group__4();

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
    // $ANTLR end "rule__EnumDeclaration__Group__3"


    // $ANTLR start "rule__EnumDeclaration__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4648:1: rule__EnumDeclaration__Group__3__Impl : ( ( rule__EnumDeclaration__ValuesAssignment_3 ) ) ;
    public final void rule__EnumDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4652:1: ( ( ( rule__EnumDeclaration__ValuesAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4653:1: ( ( rule__EnumDeclaration__ValuesAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4653:1: ( ( rule__EnumDeclaration__ValuesAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4654:1: ( rule__EnumDeclaration__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getValuesAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4655:1: ( rule__EnumDeclaration__ValuesAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4655:2: rule__EnumDeclaration__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__ValuesAssignment_3_in_rule__EnumDeclaration__Group__3__Impl9319);
            rule__EnumDeclaration__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getValuesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__3__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4665:1: rule__EnumDeclaration__Group__4 : rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5 ;
    public final void rule__EnumDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4669:1: ( rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4670:2: rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__4__Impl_in_rule__EnumDeclaration__Group__49349);
            rule__EnumDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__5_in_rule__EnumDeclaration__Group__49352);
            rule__EnumDeclaration__Group__5();

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
    // $ANTLR end "rule__EnumDeclaration__Group__4"


    // $ANTLR start "rule__EnumDeclaration__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4677:1: rule__EnumDeclaration__Group__4__Impl : ( ( rule__EnumDeclaration__Group_4__0 )* ) ;
    public final void rule__EnumDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4681:1: ( ( ( rule__EnumDeclaration__Group_4__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4682:1: ( ( rule__EnumDeclaration__Group_4__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4682:1: ( ( rule__EnumDeclaration__Group_4__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4683:1: ( rule__EnumDeclaration__Group_4__0 )*
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4684:1: ( rule__EnumDeclaration__Group_4__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4684:2: rule__EnumDeclaration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__0_in_rule__EnumDeclaration__Group__4__Impl9379);
            	    rule__EnumDeclaration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getEnumDeclarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__4__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4694:1: rule__EnumDeclaration__Group__5 : rule__EnumDeclaration__Group__5__Impl ;
    public final void rule__EnumDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4698:1: ( rule__EnumDeclaration__Group__5__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4699:2: rule__EnumDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__5__Impl_in_rule__EnumDeclaration__Group__59410);
            rule__EnumDeclaration__Group__5__Impl();

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
    // $ANTLR end "rule__EnumDeclaration__Group__5"


    // $ANTLR start "rule__EnumDeclaration__Group__5__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4705:1: rule__EnumDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__EnumDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4709:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4710:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4710:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4711:1: '}'
            {
             before(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__EnumDeclaration__Group__5__Impl9438); 
             after(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__5__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_4__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4736:1: rule__EnumDeclaration__Group_4__0 : rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1 ;
    public final void rule__EnumDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4740:1: ( rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4741:2: rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__0__Impl_in_rule__EnumDeclaration__Group_4__09481);
            rule__EnumDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__1_in_rule__EnumDeclaration__Group_4__09484);
            rule__EnumDeclaration__Group_4__1();

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
    // $ANTLR end "rule__EnumDeclaration__Group_4__0"


    // $ANTLR start "rule__EnumDeclaration__Group_4__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4748:1: rule__EnumDeclaration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4752:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4753:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4753:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4754:1: ','
            {
             before(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__EnumDeclaration__Group_4__0__Impl9512); 
             after(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_4__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4767:1: rule__EnumDeclaration__Group_4__1 : rule__EnumDeclaration__Group_4__1__Impl ;
    public final void rule__EnumDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4771:1: ( rule__EnumDeclaration__Group_4__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4772:2: rule__EnumDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__1__Impl_in_rule__EnumDeclaration__Group_4__19543);
            rule__EnumDeclaration__Group_4__1__Impl();

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
    // $ANTLR end "rule__EnumDeclaration__Group_4__1"


    // $ANTLR start "rule__EnumDeclaration__Group_4__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4778:1: rule__EnumDeclaration__Group_4__1__Impl : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4782:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4783:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4783:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4784:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getIDTerminalRuleCall_4_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__Group_4__1__Impl9570); 
             after(grammarAccess.getEnumDeclarationAccess().getIDTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4799:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4803:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4804:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__09603);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__09606);
            rule__FQN__Group__1();

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
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4811:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4815:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4816:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4816:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4817:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl9633); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4828:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4832:1: ( rule__FQN__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4833:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__19662);
            rule__FQN__Group__1__Impl();

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
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4839:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4843:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4844:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4844:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4845:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4846:1: ( rule__FQN__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==49) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4846:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl9689);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4860:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4864:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4865:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__09724);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__09727);
            rule__FQN__Group_1__1();

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
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4872:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4876:1: ( ( '.' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4877:1: ( '.' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4877:1: ( '.' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4878:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,49,FOLLOW_49_in_rule__FQN__Group_1__0__Impl9755); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4891:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4895:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4896:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__19786);
            rule__FQN__Group_1__1__Impl();

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
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4902:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4906:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4907:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4907:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4908:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl9813); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4923:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4927:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4928:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__09846);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__09849);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4935:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4939:1: ( ( 'Entity' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4940:1: ( 'Entity' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4940:1: ( 'Entity' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4941:1: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__Entity__Group__0__Impl9877); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4954:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4958:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4959:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__19908);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__19911);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4966:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4970:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4971:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4971:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4972:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4973:1: ( rule__Entity__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4973:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl9938);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4983:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4987:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4988:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__29968);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__29971);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4995:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4999:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5000:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5000:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5001:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Entity__Group__2__Impl9999); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5014:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5018:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5019:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__310030);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__310033);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5026:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__PropertiesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5030:1: ( ( ( rule__Entity__PropertiesAssignment_3 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5031:1: ( ( rule__Entity__PropertiesAssignment_3 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5031:1: ( ( rule__Entity__PropertiesAssignment_3 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5032:1: ( rule__Entity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5033:1: ( rule__Entity__PropertiesAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==53||LA25_0==55) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5033:2: rule__Entity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_3_in_rule__Entity__Group__3__Impl10060);
            	    rule__Entity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getPropertiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5043:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5047:1: ( rule__Entity__Group__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5048:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__410091);
            rule__Entity__Group__4__Impl();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5054:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5058:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5059:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5059:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5060:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__Entity__Group__4__Impl10119); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5083:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5087:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5088:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__010160);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__010163);
            rule__Domain__Group__1();

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
    // $ANTLR end "rule__Domain__Group__0"


    // $ANTLR start "rule__Domain__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5095:1: rule__Domain__Group__0__Impl : ( ( rule__Domain__ImportsAssignment_0 )* ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5099:1: ( ( ( rule__Domain__ImportsAssignment_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5100:1: ( ( rule__Domain__ImportsAssignment_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5100:1: ( ( rule__Domain__ImportsAssignment_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5101:1: ( rule__Domain__ImportsAssignment_0 )*
            {
             before(grammarAccess.getDomainAccess().getImportsAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5102:1: ( rule__Domain__ImportsAssignment_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==44) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5102:2: rule__Domain__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Domain__ImportsAssignment_0_in_rule__Domain__Group__0__Impl10190);
            	    rule__Domain__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5112:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5116:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5117:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__110221);
            rule__Domain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__110224);
            rule__Domain__Group__2();

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
    // $ANTLR end "rule__Domain__Group__1"


    // $ANTLR start "rule__Domain__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5124:1: rule__Domain__Group__1__Impl : ( 'Domain' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5128:1: ( ( 'Domain' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5129:1: ( 'Domain' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5129:1: ( 'Domain' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5130:1: 'Domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_1()); 
            match(input,51,FOLLOW_51_in_rule__Domain__Group__1__Impl10252); 
             after(grammarAccess.getDomainAccess().getDomainKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__Domain__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5143:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5147:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5148:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__210283);
            rule__Domain__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__210286);
            rule__Domain__Group__3();

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
    // $ANTLR end "rule__Domain__Group__2"


    // $ANTLR start "rule__Domain__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5155:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__NameAssignment_2 ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5159:1: ( ( ( rule__Domain__NameAssignment_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5160:1: ( ( rule__Domain__NameAssignment_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5160:1: ( ( rule__Domain__NameAssignment_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5161:1: ( rule__Domain__NameAssignment_2 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5162:1: ( rule__Domain__NameAssignment_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5162:2: rule__Domain__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl10313);
            rule__Domain__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2__Impl"


    // $ANTLR start "rule__Domain__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5172:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5176:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5177:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__310343);
            rule__Domain__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__310346);
            rule__Domain__Group__4();

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
    // $ANTLR end "rule__Domain__Group__3"


    // $ANTLR start "rule__Domain__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5184:1: rule__Domain__Group__3__Impl : ( 'Description: ' ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5188:1: ( ( 'Description: ' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5189:1: ( 'Description: ' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5189:1: ( 'Description: ' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5190:1: 'Description: '
            {
             before(grammarAccess.getDomainAccess().getDescriptionKeyword_3()); 
            match(input,52,FOLLOW_52_in_rule__Domain__Group__3__Impl10374); 
             after(grammarAccess.getDomainAccess().getDescriptionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__3__Impl"


    // $ANTLR start "rule__Domain__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5203:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5207:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5208:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__410405);
            rule__Domain__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__410408);
            rule__Domain__Group__5();

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
    // $ANTLR end "rule__Domain__Group__4"


    // $ANTLR start "rule__Domain__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5215:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__DescriptionAssignment_4 ) ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5219:1: ( ( ( rule__Domain__DescriptionAssignment_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5220:1: ( ( rule__Domain__DescriptionAssignment_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5220:1: ( ( rule__Domain__DescriptionAssignment_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5221:1: ( rule__Domain__DescriptionAssignment_4 )
            {
             before(grammarAccess.getDomainAccess().getDescriptionAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5222:1: ( rule__Domain__DescriptionAssignment_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5222:2: rule__Domain__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_rule__Domain__DescriptionAssignment_4_in_rule__Domain__Group__4__Impl10435);
            rule__Domain__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__4__Impl"


    // $ANTLR start "rule__Domain__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5232:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl rule__Domain__Group__6 ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5236:1: ( rule__Domain__Group__5__Impl rule__Domain__Group__6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5237:2: rule__Domain__Group__5__Impl rule__Domain__Group__6
            {
            pushFollow(FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__510465);
            rule__Domain__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__6_in_rule__Domain__Group__510468);
            rule__Domain__Group__6();

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
    // $ANTLR end "rule__Domain__Group__5"


    // $ANTLR start "rule__Domain__Group__5__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5244:1: rule__Domain__Group__5__Impl : ( '{' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5248:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5249:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5249:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5250:1: '{'
            {
             before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Domain__Group__5__Impl10496); 
             after(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__5__Impl"


    // $ANTLR start "rule__Domain__Group__6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5263:1: rule__Domain__Group__6 : rule__Domain__Group__6__Impl rule__Domain__Group__7 ;
    public final void rule__Domain__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5267:1: ( rule__Domain__Group__6__Impl rule__Domain__Group__7 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5268:2: rule__Domain__Group__6__Impl rule__Domain__Group__7
            {
            pushFollow(FOLLOW_rule__Domain__Group__6__Impl_in_rule__Domain__Group__610527);
            rule__Domain__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__7_in_rule__Domain__Group__610530);
            rule__Domain__Group__7();

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
    // $ANTLR end "rule__Domain__Group__6"


    // $ANTLR start "rule__Domain__Group__6__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5275:1: rule__Domain__Group__6__Impl : ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) ) ;
    public final void rule__Domain__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5279:1: ( ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5280:1: ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5280:1: ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5281:1: ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5281:1: ( ( rule__Domain__EntitiesAssignment_6 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5282:1: ( rule__Domain__EntitiesAssignment_6 )
            {
             before(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5283:1: ( rule__Domain__EntitiesAssignment_6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5283:2: rule__Domain__EntitiesAssignment_6
            {
            pushFollow(FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl10559);
            rule__Domain__EntitiesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 

            }

            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5286:1: ( ( rule__Domain__EntitiesAssignment_6 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5287:1: ( rule__Domain__EntitiesAssignment_6 )*
            {
             before(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5288:1: ( rule__Domain__EntitiesAssignment_6 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==50) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5288:2: rule__Domain__EntitiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl10571);
            	    rule__Domain__EntitiesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 

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
    // $ANTLR end "rule__Domain__Group__6__Impl"


    // $ANTLR start "rule__Domain__Group__7"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5299:1: rule__Domain__Group__7 : rule__Domain__Group__7__Impl ;
    public final void rule__Domain__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5303:1: ( rule__Domain__Group__7__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5304:2: rule__Domain__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group__7__Impl_in_rule__Domain__Group__710604);
            rule__Domain__Group__7__Impl();

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
    // $ANTLR end "rule__Domain__Group__7"


    // $ANTLR start "rule__Domain__Group__7__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5310:1: rule__Domain__Group__7__Impl : ( '}' ) ;
    public final void rule__Domain__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5314:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5315:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5315:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5316:1: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__Domain__Group__7__Impl10632); 
             after(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__7__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5345:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5349:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5350:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__010679);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__010682);
            rule__Association__Group__1();

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
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5357:1: rule__Association__Group__0__Impl : ( 'Relation' ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5361:1: ( ( 'Relation' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5362:1: ( 'Relation' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5362:1: ( 'Relation' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5363:1: 'Relation'
            {
             before(grammarAccess.getAssociationAccess().getRelationKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__Association__Group__0__Impl10710); 
             after(grammarAccess.getAssociationAccess().getRelationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5376:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5380:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5381:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__110741);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__110744);
            rule__Association__Group__2();

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
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5388:1: rule__Association__Group__1__Impl : ( ( rule__Association__NameAssignment_1 ) ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5392:1: ( ( ( rule__Association__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5393:1: ( ( rule__Association__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5393:1: ( ( rule__Association__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5394:1: ( rule__Association__NameAssignment_1 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5395:1: ( rule__Association__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5395:2: rule__Association__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Association__NameAssignment_1_in_rule__Association__Group__1__Impl10771);
            rule__Association__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5405:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5409:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5410:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__210801);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__3_in_rule__Association__Group__210804);
            rule__Association__Group__3();

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
    // $ANTLR end "rule__Association__Group__2"


    // $ANTLR start "rule__Association__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5417:1: rule__Association__Group__2__Impl : ( ':' ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5421:1: ( ( ':' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5422:1: ( ':' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5422:1: ( ':' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5423:1: ':'
            {
             before(grammarAccess.getAssociationAccess().getColonKeyword_2()); 
            match(input,54,FOLLOW_54_in_rule__Association__Group__2__Impl10832); 
             after(grammarAccess.getAssociationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5436:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5440:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5441:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__310863);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__4_in_rule__Association__Group__310866);
            rule__Association__Group__4();

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
    // $ANTLR end "rule__Association__Group__3"


    // $ANTLR start "rule__Association__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5448:1: rule__Association__Group__3__Impl : ( ( rule__Association__TypeAssignment_3 ) ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5452:1: ( ( ( rule__Association__TypeAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5453:1: ( ( rule__Association__TypeAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5453:1: ( ( rule__Association__TypeAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5454:1: ( rule__Association__TypeAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getTypeAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5455:1: ( rule__Association__TypeAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5455:2: rule__Association__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Association__TypeAssignment_3_in_rule__Association__Group__3__Impl10893);
            rule__Association__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5465:1: rule__Association__Group__4 : rule__Association__Group__4__Impl ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5469:1: ( rule__Association__Group__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5470:2: rule__Association__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group__4__Impl_in_rule__Association__Group__410923);
            rule__Association__Group__4__Impl();

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
    // $ANTLR end "rule__Association__Group__4"


    // $ANTLR start "rule__Association__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5476:1: rule__Association__Group__4__Impl : ( ( rule__Association__MultiplicityAssignment_4 ) ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5480:1: ( ( ( rule__Association__MultiplicityAssignment_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5481:1: ( ( rule__Association__MultiplicityAssignment_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5481:1: ( ( rule__Association__MultiplicityAssignment_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5482:1: ( rule__Association__MultiplicityAssignment_4 )
            {
             before(grammarAccess.getAssociationAccess().getMultiplicityAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5483:1: ( rule__Association__MultiplicityAssignment_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5483:2: rule__Association__MultiplicityAssignment_4
            {
            pushFollow(FOLLOW_rule__Association__MultiplicityAssignment_4_in_rule__Association__Group__4__Impl10950);
            rule__Association__MultiplicityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getMultiplicityAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5503:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5507:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5508:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__010990);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__010993);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5515:1: rule__Field__Group__0__Impl : ( 'Field' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5519:1: ( ( 'Field' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5520:1: ( 'Field' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5520:1: ( 'Field' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5521:1: 'Field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__Field__Group__0__Impl11021); 
             after(grammarAccess.getFieldAccess().getFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5534:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5538:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5539:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__111052);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__111055);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5546:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5550:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5551:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5551:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5552:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5553:1: ( rule__Field__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5553:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl11082);
            rule__Field__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5563:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5567:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5568:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__211112);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__211115);
            rule__Field__Group__3();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5575:1: rule__Field__Group__2__Impl : ( ':' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5579:1: ( ( ':' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5580:1: ( ':' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5580:1: ( ':' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5581:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_2()); 
            match(input,54,FOLLOW_54_in_rule__Field__Group__2__Impl11143); 
             after(grammarAccess.getFieldAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5594:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5598:1: ( rule__Field__Group__3__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5599:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__311174);
            rule__Field__Group__3__Impl();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5605:1: rule__Field__Group__3__Impl : ( ( rule__Field__LiteralAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5609:1: ( ( ( rule__Field__LiteralAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5610:1: ( ( rule__Field__LiteralAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5610:1: ( ( rule__Field__LiteralAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5611:1: ( rule__Field__LiteralAssignment_3 )
            {
             before(grammarAccess.getFieldAccess().getLiteralAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5612:1: ( rule__Field__LiteralAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5612:2: rule__Field__LiteralAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__LiteralAssignment_3_in_rule__Field__Group__3__Impl11201);
            rule__Field__LiteralAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getLiteralAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Literal__Group_0__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5630:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5634:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5635:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__011239);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__011242);
            rule__Literal__Group_0__1();

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
    // $ANTLR end "rule__Literal__Group_0__0"


    // $ANTLR start "rule__Literal__Group_0__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5642:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5646:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5647:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5647:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5648:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5649:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5651:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0__Impl"


    // $ANTLR start "rule__Literal__Group_0__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5661:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5665:1: ( rule__Literal__Group_0__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5666:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__111300);
            rule__Literal__Group_0__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_0__1"


    // $ANTLR start "rule__Literal__Group_0__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5672:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__NameAssignment_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5676:1: ( ( ( rule__Literal__NameAssignment_0_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5677:1: ( ( rule__Literal__NameAssignment_0_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5677:1: ( ( rule__Literal__NameAssignment_0_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5678:1: ( rule__Literal__NameAssignment_0_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_0_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5679:1: ( rule__Literal__NameAssignment_0_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5679:2: rule__Literal__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_0_1_in_rule__Literal__Group_0__1__Impl11327);
            rule__Literal__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__1__Impl"


    // $ANTLR start "rule__Literal__Group_1__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5693:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5697:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5698:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__011361);
            rule__Literal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__011364);
            rule__Literal__Group_1__1();

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
    // $ANTLR end "rule__Literal__Group_1__0"


    // $ANTLR start "rule__Literal__Group_1__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5705:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5709:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5710:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5710:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5711:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5712:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5714:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__0__Impl"


    // $ANTLR start "rule__Literal__Group_1__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5724:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5728:1: ( rule__Literal__Group_1__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5729:2: rule__Literal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__111422);
            rule__Literal__Group_1__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_1__1"


    // $ANTLR start "rule__Literal__Group_1__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5735:1: rule__Literal__Group_1__1__Impl : ( ( rule__Literal__NameAssignment_1_1 ) ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5739:1: ( ( ( rule__Literal__NameAssignment_1_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5740:1: ( ( rule__Literal__NameAssignment_1_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5740:1: ( ( rule__Literal__NameAssignment_1_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5741:1: ( rule__Literal__NameAssignment_1_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_1_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5742:1: ( rule__Literal__NameAssignment_1_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5742:2: rule__Literal__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_1_1_in_rule__Literal__Group_1__1__Impl11449);
            rule__Literal__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__1__Impl"


    // $ANTLR start "rule__Literal__Group_2__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5756:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5760:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5761:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__011483);
            rule__Literal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__011486);
            rule__Literal__Group_2__1();

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
    // $ANTLR end "rule__Literal__Group_2__0"


    // $ANTLR start "rule__Literal__Group_2__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5768:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5772:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5773:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5773:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5774:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_2_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5775:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5777:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__0__Impl"


    // $ANTLR start "rule__Literal__Group_2__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5787:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5791:1: ( rule__Literal__Group_2__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5792:2: rule__Literal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__111544);
            rule__Literal__Group_2__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_2__1"


    // $ANTLR start "rule__Literal__Group_2__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5798:1: rule__Literal__Group_2__1__Impl : ( ( rule__Literal__NameAssignment_2_1 ) ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5802:1: ( ( ( rule__Literal__NameAssignment_2_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5803:1: ( ( rule__Literal__NameAssignment_2_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5803:1: ( ( rule__Literal__NameAssignment_2_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5804:1: ( rule__Literal__NameAssignment_2_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_2_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5805:1: ( rule__Literal__NameAssignment_2_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5805:2: rule__Literal__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_2_1_in_rule__Literal__Group_2__1__Impl11571);
            rule__Literal__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__1__Impl"


    // $ANTLR start "rule__Literal__Group_3__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5819:1: rule__Literal__Group_3__0 : rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1 ;
    public final void rule__Literal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5823:1: ( rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5824:2: rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_3__0__Impl_in_rule__Literal__Group_3__011605);
            rule__Literal__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_3__1_in_rule__Literal__Group_3__011608);
            rule__Literal__Group_3__1();

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
    // $ANTLR end "rule__Literal__Group_3__0"


    // $ANTLR start "rule__Literal__Group_3__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5831:1: rule__Literal__Group_3__0__Impl : ( () ) ;
    public final void rule__Literal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5835:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5836:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5836:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5837:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_3_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5838:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5840:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_3__0__Impl"


    // $ANTLR start "rule__Literal__Group_3__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5850:1: rule__Literal__Group_3__1 : rule__Literal__Group_3__1__Impl ;
    public final void rule__Literal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5854:1: ( rule__Literal__Group_3__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5855:2: rule__Literal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_3__1__Impl_in_rule__Literal__Group_3__111666);
            rule__Literal__Group_3__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_3__1"


    // $ANTLR start "rule__Literal__Group_3__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5861:1: rule__Literal__Group_3__1__Impl : ( ( rule__Literal__NameAssignment_3_1 ) ) ;
    public final void rule__Literal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5865:1: ( ( ( rule__Literal__NameAssignment_3_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5866:1: ( ( rule__Literal__NameAssignment_3_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5866:1: ( ( rule__Literal__NameAssignment_3_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5867:1: ( rule__Literal__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_3_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5868:1: ( rule__Literal__NameAssignment_3_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5868:2: rule__Literal__NameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_3_1_in_rule__Literal__Group_3__1__Impl11693);
            rule__Literal__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_3__1__Impl"


    // $ANTLR start "rule__Literal__Group_4__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5882:1: rule__Literal__Group_4__0 : rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 ;
    public final void rule__Literal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5886:1: ( rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5887:2: rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__011727);
            rule__Literal__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__011730);
            rule__Literal__Group_4__1();

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
    // $ANTLR end "rule__Literal__Group_4__0"


    // $ANTLR start "rule__Literal__Group_4__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5894:1: rule__Literal__Group_4__0__Impl : ( () ) ;
    public final void rule__Literal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5898:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5899:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5899:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5900:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_4_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5901:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5903:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_4__0__Impl"


    // $ANTLR start "rule__Literal__Group_4__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5913:1: rule__Literal__Group_4__1 : rule__Literal__Group_4__1__Impl ;
    public final void rule__Literal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5917:1: ( rule__Literal__Group_4__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5918:2: rule__Literal__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__111788);
            rule__Literal__Group_4__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_4__1"


    // $ANTLR start "rule__Literal__Group_4__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5924:1: rule__Literal__Group_4__1__Impl : ( ( rule__Literal__NameAssignment_4_1 ) ) ;
    public final void rule__Literal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5928:1: ( ( ( rule__Literal__NameAssignment_4_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5929:1: ( ( rule__Literal__NameAssignment_4_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5929:1: ( ( rule__Literal__NameAssignment_4_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5930:1: ( rule__Literal__NameAssignment_4_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_4_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5931:1: ( rule__Literal__NameAssignment_4_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5931:2: rule__Literal__NameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_4_1_in_rule__Literal__Group_4__1__Impl11815);
            rule__Literal__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_4__1__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5945:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5949:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5950:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__011849);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__011852);
            rule__Enum__Group__1();

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
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5957:1: rule__Enum__Group__0__Impl : ( 'Enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5961:1: ( ( 'Enum' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5962:1: ( 'Enum' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5962:1: ( 'Enum' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5963:1: 'Enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,56,FOLLOW_56_in_rule__Enum__Group__0__Impl11880); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5976:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5980:1: ( rule__Enum__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5981:2: rule__Enum__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__111911);
            rule__Enum__Group__1__Impl();

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
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5987:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__TypeAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5991:1: ( ( ( rule__Enum__TypeAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5992:1: ( ( rule__Enum__TypeAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5992:1: ( ( rule__Enum__TypeAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5993:1: ( rule__Enum__TypeAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getTypeAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5994:1: ( rule__Enum__TypeAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5994:2: rule__Enum__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__TypeAssignment_1_in_rule__Enum__Group__1__Impl11938);
            rule__Enum__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6009:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6013:1: ( ( ruleElement ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6014:1: ( ruleElement )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6014:1: ( ruleElement )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6015:1: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Model__ElementsAssignment11977);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Flow__ImportsAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6024:1: rule__Flow__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Flow__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6028:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6029:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6029:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6030:1: ruleImport
            {
             before(grammarAccess.getFlowAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Flow__ImportsAssignment_012008);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getFlowAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__ImportsAssignment_0"


    // $ANTLR start "rule__Flow__NameAssignment_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6039:1: rule__Flow__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Flow__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6043:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6044:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6044:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6045:1: RULE_ID
            {
             before(grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Flow__NameAssignment_212039); 
             after(grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__NameAssignment_2"


    // $ANTLR start "rule__Flow__ActivitiesAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6054:1: rule__Flow__ActivitiesAssignment_4 : ( ruleActivity ) ;
    public final void rule__Flow__ActivitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6058:1: ( ( ruleActivity ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6059:1: ( ruleActivity )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6059:1: ( ruleActivity )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6060:1: ruleActivity
            {
             before(grammarAccess.getFlowAccess().getActivitiesActivityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleActivity_in_rule__Flow__ActivitiesAssignment_412070);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getFlowAccess().getActivitiesActivityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__ActivitiesAssignment_4"


    // $ANTLR start "rule__Activity__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6069:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6073:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6074:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6074:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6075:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_112101); 
             after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__NameAssignment_1"


    // $ANTLR start "rule__Activity__SucessorsAssignment_3_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6084:1: rule__Activity__SucessorsAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__SucessorsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6088:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6089:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6089:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6090:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_2_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6091:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6092:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getSucessorsActivityIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__SucessorsAssignment_3_212136); 
             after(grammarAccess.getActivityAccess().getSucessorsActivityIDTerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__SucessorsAssignment_3_2"


    // $ANTLR start "rule__Activity__SucessorsAssignment_3_3_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6103:1: rule__Activity__SucessorsAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__SucessorsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6107:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6108:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6108:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6109:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_3_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6110:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6111:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getSucessorsActivityIDTerminalRuleCall_3_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__SucessorsAssignment_3_3_112175); 
             after(grammarAccess.getActivityAccess().getSucessorsActivityIDTerminalRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__SucessorsAssignment_3_3_1"


    // $ANTLR start "rule__Activity__BusinessRuleAssignment_4_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6122:1: rule__Activity__BusinessRuleAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void rule__Activity__BusinessRuleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6126:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6127:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6127:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6128:1: ( ruleFQN )
            {
             before(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleCrossReference_4_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6129:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6130:1: ruleFQN
            {
             before(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleFQNParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Activity__BusinessRuleAssignment_4_112214);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleFQNParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__BusinessRuleAssignment_4_1"


    // $ANTLR start "rule__Activity__DescriptionAssignment_6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6141:1: rule__Activity__DescriptionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Activity__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6145:1: ( ( RULE_STRING ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6146:1: ( RULE_STRING )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6146:1: ( RULE_STRING )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6147:1: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__DescriptionAssignment_612249); 
             after(grammarAccess.getActivityAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__DescriptionAssignment_6"


    // $ANTLR start "rule__BusinessRule__ImportsAssignment_0_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6156:1: rule__BusinessRule__ImportsAssignment_0_0 : ( ruleImport ) ;
    public final void rule__BusinessRule__ImportsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6160:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6161:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6161:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6162:1: ruleImport
            {
             before(grammarAccess.getBusinessRuleAccess().getImportsImportParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__BusinessRule__ImportsAssignment_0_012280);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getImportsImportParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__ImportsAssignment_0_0"


    // $ANTLR start "rule__BusinessRule__NameAssignment_0_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6171:1: rule__BusinessRule__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__BusinessRule__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6175:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6176:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6176:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6177:1: RULE_ID
            {
             before(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessRule__NameAssignment_0_212311); 
             after(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__NameAssignment_0_2"


    // $ANTLR start "rule__BusinessRule__TypAssignment_0_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6186:1: rule__BusinessRule__TypAssignment_0_4 : ( ruleBREType ) ;
    public final void rule__BusinessRule__TypAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6190:1: ( ( ruleBREType ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6191:1: ( ruleBREType )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6191:1: ( ruleBREType )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6192:1: ruleBREType
            {
             before(grammarAccess.getBusinessRuleAccess().getTypBRETypeEnumRuleCall_0_4_0()); 
            pushFollow(FOLLOW_ruleBREType_in_rule__BusinessRule__TypAssignment_0_412342);
            ruleBREType();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getTypBRETypeEnumRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__TypAssignment_0_4"


    // $ANTLR start "rule__BusinessRule__SystemInputsAssignment_0_8"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6201:1: rule__BusinessRule__SystemInputsAssignment_0_8 : ( ( rule__BusinessRule__SystemInputsAlternatives_0_8_0 ) ) ;
    public final void rule__BusinessRule__SystemInputsAssignment_0_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6205:1: ( ( ( rule__BusinessRule__SystemInputsAlternatives_0_8_0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6206:1: ( ( rule__BusinessRule__SystemInputsAlternatives_0_8_0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6206:1: ( ( rule__BusinessRule__SystemInputsAlternatives_0_8_0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6207:1: ( rule__BusinessRule__SystemInputsAlternatives_0_8_0 )
            {
             before(grammarAccess.getBusinessRuleAccess().getSystemInputsAlternatives_0_8_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6208:1: ( rule__BusinessRule__SystemInputsAlternatives_0_8_0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6208:2: rule__BusinessRule__SystemInputsAlternatives_0_8_0
            {
            pushFollow(FOLLOW_rule__BusinessRule__SystemInputsAlternatives_0_8_0_in_rule__BusinessRule__SystemInputsAssignment_0_812373);
            rule__BusinessRule__SystemInputsAlternatives_0_8_0();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getSystemInputsAlternatives_0_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__SystemInputsAssignment_0_8"


    // $ANTLR start "rule__BusinessRule__OutputAssignment_0_12"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6217:1: rule__BusinessRule__OutputAssignment_0_12 : ( ( ruleFQN ) ) ;
    public final void rule__BusinessRule__OutputAssignment_0_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6221:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6222:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6222:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6223:1: ( ruleFQN )
            {
             before(grammarAccess.getBusinessRuleAccess().getOutputEntityCrossReference_0_12_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6224:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6225:1: ruleFQN
            {
             before(grammarAccess.getBusinessRuleAccess().getOutputEntityFQNParserRuleCall_0_12_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__BusinessRule__OutputAssignment_0_1212410);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getOutputEntityFQNParserRuleCall_0_12_0_1()); 

            }

             after(grammarAccess.getBusinessRuleAccess().getOutputEntityCrossReference_0_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__OutputAssignment_0_12"


    // $ANTLR start "rule__BusinessRule__OutputAssignment_1_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6236:1: rule__BusinessRule__OutputAssignment_1_0 : ( ( ruleFQN ) ) ;
    public final void rule__BusinessRule__OutputAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6240:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6241:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6241:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6242:1: ( ruleFQN )
            {
             before(grammarAccess.getBusinessRuleAccess().getOutputSystemEntityCrossReference_1_0_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6243:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6244:1: ruleFQN
            {
             before(grammarAccess.getBusinessRuleAccess().getOutputSystemEntityFQNParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__BusinessRule__OutputAssignment_1_012449);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getOutputSystemEntityFQNParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getBusinessRuleAccess().getOutputSystemEntityCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__OutputAssignment_1_0"


    // $ANTLR start "rule__BreSystemEntityInput__InputElementAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6255:1: rule__BreSystemEntityInput__InputElementAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__BreSystemEntityInput__InputElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6259:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6260:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6260:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6261:1: ( ruleFQN )
            {
             before(grammarAccess.getBreSystemEntityInputAccess().getInputElementSystemEntityCrossReference_0_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6262:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6263:1: ruleFQN
            {
             before(grammarAccess.getBreSystemEntityInputAccess().getInputElementSystemEntityFQNParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__BreSystemEntityInput__InputElementAssignment_012488);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getBreSystemEntityInputAccess().getInputElementSystemEntityFQNParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBreSystemEntityInputAccess().getInputElementSystemEntityCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BreSystemEntityInput__InputElementAssignment_0"


    // $ANTLR start "rule__BreSystemEntityInput__ConfigurationAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6274:1: rule__BreSystemEntityInput__ConfigurationAssignment_1 : ( ruleSystemEntityConfiguration ) ;
    public final void rule__BreSystemEntityInput__ConfigurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6278:1: ( ( ruleSystemEntityConfiguration ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6279:1: ( ruleSystemEntityConfiguration )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6279:1: ( ruleSystemEntityConfiguration )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6280:1: ruleSystemEntityConfiguration
            {
             before(grammarAccess.getBreSystemEntityInputAccess().getConfigurationSystemEntityConfigurationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSystemEntityConfiguration_in_rule__BreSystemEntityInput__ConfigurationAssignment_112523);
            ruleSystemEntityConfiguration();

            state._fsp--;

             after(grammarAccess.getBreSystemEntityInputAccess().getConfigurationSystemEntityConfigurationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BreSystemEntityInput__ConfigurationAssignment_1"


    // $ANTLR start "rule__BreEntityInput__InputElementAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6289:1: rule__BreEntityInput__InputElementAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__BreEntityInput__InputElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6293:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6294:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6294:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6295:1: ( ruleFQN )
            {
             before(grammarAccess.getBreEntityInputAccess().getInputElementEntityCrossReference_0_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6296:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6297:1: ruleFQN
            {
             before(grammarAccess.getBreEntityInputAccess().getInputElementEntityFQNParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__BreEntityInput__InputElementAssignment_012558);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getBreEntityInputAccess().getInputElementEntityFQNParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBreEntityInputAccess().getInputElementEntityCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BreEntityInput__InputElementAssignment_0"


    // $ANTLR start "rule__BreEntityInput__ConfigurationAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6308:1: rule__BreEntityInput__ConfigurationAssignment_1 : ( ruleEntityConfiguration ) ;
    public final void rule__BreEntityInput__ConfigurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6312:1: ( ( ruleEntityConfiguration ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6313:1: ( ruleEntityConfiguration )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6313:1: ( ruleEntityConfiguration )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6314:1: ruleEntityConfiguration
            {
             before(grammarAccess.getBreEntityInputAccess().getConfigurationEntityConfigurationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEntityConfiguration_in_rule__BreEntityInput__ConfigurationAssignment_112593);
            ruleEntityConfiguration();

            state._fsp--;

             after(grammarAccess.getBreEntityInputAccess().getConfigurationEntityConfigurationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BreEntityInput__ConfigurationAssignment_1"


    // $ANTLR start "rule__SystemEntityConfiguration__PrimaryAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6323:1: rule__SystemEntityConfiguration__PrimaryAssignment_4 : ( ruleBoolean ) ;
    public final void rule__SystemEntityConfiguration__PrimaryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6327:1: ( ( ruleBoolean ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6328:1: ( ruleBoolean )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6328:1: ( ruleBoolean )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6329:1: ruleBoolean
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getPrimaryBooleanEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__SystemEntityConfiguration__PrimaryAssignment_412624);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getSystemEntityConfigurationAccess().getPrimaryBooleanEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__PrimaryAssignment_4"


    // $ANTLR start "rule__SystemEntityConfiguration__ObligatorischAssignment_8"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6338:1: rule__SystemEntityConfiguration__ObligatorischAssignment_8 : ( ruleBoolean ) ;
    public final void rule__SystemEntityConfiguration__ObligatorischAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6342:1: ( ( ruleBoolean ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6343:1: ( ruleBoolean )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6343:1: ( ruleBoolean )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6344:1: ruleBoolean
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getObligatorischBooleanEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__SystemEntityConfiguration__ObligatorischAssignment_812655);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getSystemEntityConfigurationAccess().getObligatorischBooleanEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__ObligatorischAssignment_8"


    // $ANTLR start "rule__SystemEntityConfiguration__MultipleAssignment_12"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6353:1: rule__SystemEntityConfiguration__MultipleAssignment_12 : ( ruleBoolean ) ;
    public final void rule__SystemEntityConfiguration__MultipleAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6357:1: ( ( ruleBoolean ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6358:1: ( ruleBoolean )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6358:1: ( ruleBoolean )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6359:1: ruleBoolean
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getMultipleBooleanEnumRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__SystemEntityConfiguration__MultipleAssignment_1212686);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getSystemEntityConfigurationAccess().getMultipleBooleanEnumRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__MultipleAssignment_12"


    // $ANTLR start "rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6368:1: rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3 : ( RULE_STRING ) ;
    public final void rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6372:1: ( ( RULE_STRING ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6373:1: ( RULE_STRING )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6373:1: ( RULE_STRING )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6374:1: RULE_STRING
            {
             before(grammarAccess.getSystemEntityConfigurationAccess().getJoinCriteriaSTRINGTerminalRuleCall_13_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_312717); 
             after(grammarAccess.getSystemEntityConfigurationAccess().getJoinCriteriaSTRINGTerminalRuleCall_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3"


    // $ANTLR start "rule__EntityConfiguration__PrimaryAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6383:1: rule__EntityConfiguration__PrimaryAssignment_4 : ( ruleBoolean ) ;
    public final void rule__EntityConfiguration__PrimaryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6387:1: ( ( ruleBoolean ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6388:1: ( ruleBoolean )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6388:1: ( ruleBoolean )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6389:1: ruleBoolean
            {
             before(grammarAccess.getEntityConfigurationAccess().getPrimaryBooleanEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__EntityConfiguration__PrimaryAssignment_412748);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getEntityConfigurationAccess().getPrimaryBooleanEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__PrimaryAssignment_4"


    // $ANTLR start "rule__EntityConfiguration__ObligatorischAssignment_8"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6398:1: rule__EntityConfiguration__ObligatorischAssignment_8 : ( ruleBoolean ) ;
    public final void rule__EntityConfiguration__ObligatorischAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6402:1: ( ( ruleBoolean ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6403:1: ( ruleBoolean )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6403:1: ( ruleBoolean )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6404:1: ruleBoolean
            {
             before(grammarAccess.getEntityConfigurationAccess().getObligatorischBooleanEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__EntityConfiguration__ObligatorischAssignment_812779);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getEntityConfigurationAccess().getObligatorischBooleanEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__ObligatorischAssignment_8"


    // $ANTLR start "rule__EntityConfiguration__MultipleAssignment_12"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6413:1: rule__EntityConfiguration__MultipleAssignment_12 : ( ruleBoolean ) ;
    public final void rule__EntityConfiguration__MultipleAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6417:1: ( ( ruleBoolean ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6418:1: ( ruleBoolean )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6418:1: ( ruleBoolean )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6419:1: ruleBoolean
            {
             before(grammarAccess.getEntityConfigurationAccess().getMultipleBooleanEnumRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__EntityConfiguration__MultipleAssignment_1212810);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getEntityConfigurationAccess().getMultipleBooleanEnumRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__MultipleAssignment_12"


    // $ANTLR start "rule__EntityConfiguration__PathAssignment_13_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6428:1: rule__EntityConfiguration__PathAssignment_13_3 : ( ( ruleFQN ) ) ;
    public final void rule__EntityConfiguration__PathAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6432:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6433:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6433:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6434:1: ( ruleFQN )
            {
             before(grammarAccess.getEntityConfigurationAccess().getPathAssociationCrossReference_13_3_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6435:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6436:1: ruleFQN
            {
             before(grammarAccess.getEntityConfigurationAccess().getPathAssociationFQNParserRuleCall_13_3_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__EntityConfiguration__PathAssignment_13_312845);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getEntityConfigurationAccess().getPathAssociationFQNParserRuleCall_13_3_0_1()); 

            }

             after(grammarAccess.getEntityConfigurationAccess().getPathAssociationCrossReference_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__PathAssignment_13_3"


    // $ANTLR start "rule__System__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6447:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6451:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6452:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6452:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6453:1: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__NameAssignment_112880); 
             after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__SrcEntitiesAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6462:1: rule__System__SrcEntitiesAssignment_3 : ( ruleSystemEntity ) ;
    public final void rule__System__SrcEntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6466:1: ( ( ruleSystemEntity ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6467:1: ( ruleSystemEntity )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6467:1: ( ruleSystemEntity )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6468:1: ruleSystemEntity
            {
             before(grammarAccess.getSystemAccess().getSrcEntitiesSystemEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSystemEntity_in_rule__System__SrcEntitiesAssignment_312911);
            ruleSystemEntity();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getSrcEntitiesSystemEntityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__SrcEntitiesAssignment_3"


    // $ANTLR start "rule__SystemEntity__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6477:1: rule__SystemEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SystemEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6481:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6482:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6482:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6483:1: RULE_ID
            {
             before(grammarAccess.getSystemEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SystemEntity__NameAssignment_112942); 
             after(grammarAccess.getSystemEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntity__NameAssignment_1"


    // $ANTLR start "rule__SystemEntity__FormatAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6492:1: rule__SystemEntity__FormatAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SystemEntity__FormatAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6496:1: ( ( RULE_STRING ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6497:1: ( RULE_STRING )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6497:1: ( RULE_STRING )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6498:1: RULE_STRING
            {
             before(grammarAccess.getSystemEntityAccess().getFormatSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SystemEntity__FormatAssignment_312973); 
             after(grammarAccess.getSystemEntityAccess().getFormatSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntity__FormatAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6507:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleFqnWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6511:1: ( ( ruleFqnWithWildCard ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6512:1: ( ruleFqnWithWildCard )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6512:1: ( ruleFqnWithWildCard )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6513:1: ruleFqnWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_rule__Import__ImportedNamespaceAssignment_113004);
            ruleFqnWithWildCard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Diagram__ImportsAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6522:1: rule__Diagram__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Diagram__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6526:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6527:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6527:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6528:1: ruleImport
            {
             before(grammarAccess.getDiagramAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Diagram__ImportsAssignment_013035);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__ImportsAssignment_0"


    // $ANTLR start "rule__Diagram__NameAssignment_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6537:1: rule__Diagram__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Diagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6541:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6542:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6542:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6543:1: RULE_ID
            {
             before(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Diagram__NameAssignment_213066); 
             after(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__NameAssignment_2"


    // $ANTLR start "rule__Diagram__IncludesAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6552:1: rule__Diagram__IncludesAssignment_4 : ( ruleInclude ) ;
    public final void rule__Diagram__IncludesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6556:1: ( ( ruleInclude ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6557:1: ( ruleInclude )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6557:1: ( ruleInclude )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6558:1: ruleInclude
            {
             before(grammarAccess.getDiagramAccess().getIncludesIncludeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInclude_in_rule__Diagram__IncludesAssignment_413097);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getIncludesIncludeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__IncludesAssignment_4"


    // $ANTLR start "rule__Include__IncludeAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6567:1: rule__Include__IncludeAssignment_0 : ( ( rule__Include__IncludeAlternatives_0_0 ) ) ;
    public final void rule__Include__IncludeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6571:1: ( ( ( rule__Include__IncludeAlternatives_0_0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6572:1: ( ( rule__Include__IncludeAlternatives_0_0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6572:1: ( ( rule__Include__IncludeAlternatives_0_0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6573:1: ( rule__Include__IncludeAlternatives_0_0 )
            {
             before(grammarAccess.getIncludeAccess().getIncludeAlternatives_0_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6574:1: ( rule__Include__IncludeAlternatives_0_0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6574:2: rule__Include__IncludeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Include__IncludeAlternatives_0_0_in_rule__Include__IncludeAssignment_013128);
            rule__Include__IncludeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getIncludeAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__IncludeAssignment_0"


    // $ANTLR start "rule__Include__EntityAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6583:1: rule__Include__EntityAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__Include__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6587:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6588:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6588:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6589:1: ( ruleFQN )
            {
             before(grammarAccess.getIncludeAccess().getEntityEntityCrossReference_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6590:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6591:1: ruleFQN
            {
             before(grammarAccess.getIncludeAccess().getEntityEntityFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Include__EntityAssignment_113165);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getIncludeAccess().getEntityEntityFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getIncludeAccess().getEntityEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__EntityAssignment_1"


    // $ANTLR start "rule__Include__FieldsAssignment_2_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6602:1: rule__Include__FieldsAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Include__FieldsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6606:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6607:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6607:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6608:1: ( RULE_ID )
            {
             before(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_2_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6609:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6610:1: RULE_ID
            {
             before(grammarAccess.getIncludeAccess().getFieldsPropertyIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Include__FieldsAssignment_2_213204); 
             after(grammarAccess.getIncludeAccess().getFieldsPropertyIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__FieldsAssignment_2_2"


    // $ANTLR start "rule__Include__FieldsAssignment_2_3_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6621:1: rule__Include__FieldsAssignment_2_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Include__FieldsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6625:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6626:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6626:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6627:1: ( RULE_ID )
            {
             before(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_3_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6628:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6629:1: RULE_ID
            {
             before(grammarAccess.getIncludeAccess().getFieldsPropertyIDTerminalRuleCall_2_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Include__FieldsAssignment_2_3_113243); 
             after(grammarAccess.getIncludeAccess().getFieldsPropertyIDTerminalRuleCall_2_3_1_0_1()); 

            }

             after(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__FieldsAssignment_2_3_1"


    // $ANTLR start "rule__EnumDeclaration__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6640:1: rule__EnumDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6644:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6645:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6645:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6646:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__NameAssignment_113278); 
             after(grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__NameAssignment_1"


    // $ANTLR start "rule__EnumDeclaration__ValuesAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6655:1: rule__EnumDeclaration__ValuesAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6659:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6660:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6660:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6661:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getValuesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__ValuesAssignment_313309); 
             after(grammarAccess.getEnumDeclarationAccess().getValuesIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__ValuesAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6670:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6674:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6675:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6675:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6676:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_113340); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__PropertiesAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6685:1: rule__Entity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6689:1: ( ( ruleProperty ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6690:1: ( ruleProperty )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6690:1: ( ruleProperty )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6691:1: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_313371);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__PropertiesAssignment_3"


    // $ANTLR start "rule__Domain__ImportsAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6700:1: rule__Domain__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Domain__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6704:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6705:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6705:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6706:1: ruleImport
            {
             before(grammarAccess.getDomainAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Domain__ImportsAssignment_013402);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__ImportsAssignment_0"


    // $ANTLR start "rule__Domain__NameAssignment_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6715:1: rule__Domain__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6719:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6720:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6720:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6721:1: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_213433); 
             after(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__NameAssignment_2"


    // $ANTLR start "rule__Domain__DescriptionAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6730:1: rule__Domain__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Domain__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6734:1: ( ( RULE_STRING ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6735:1: ( RULE_STRING )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6735:1: ( RULE_STRING )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6736:1: RULE_STRING
            {
             before(grammarAccess.getDomainAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Domain__DescriptionAssignment_413464); 
             after(grammarAccess.getDomainAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__DescriptionAssignment_4"


    // $ANTLR start "rule__Domain__EntitiesAssignment_6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6745:1: rule__Domain__EntitiesAssignment_6 : ( ruleEntity ) ;
    public final void rule__Domain__EntitiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6749:1: ( ( ruleEntity ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6750:1: ( ruleEntity )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6750:1: ( ruleEntity )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6751:1: ruleEntity
            {
             before(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Domain__EntitiesAssignment_613495);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__EntitiesAssignment_6"


    // $ANTLR start "rule__Association__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6760:1: rule__Association__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Association__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6764:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6765:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6765:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6766:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__NameAssignment_113526); 
             after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__NameAssignment_1"


    // $ANTLR start "rule__Association__TypeAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6775:1: rule__Association__TypeAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Association__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6779:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6780:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6780:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6781:1: ( ruleFQN )
            {
             before(grammarAccess.getAssociationAccess().getTypeEntityCrossReference_3_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6782:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6783:1: ruleFQN
            {
             before(grammarAccess.getAssociationAccess().getTypeEntityFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Association__TypeAssignment_313561);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getTypeEntityFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getTypeEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__TypeAssignment_3"


    // $ANTLR start "rule__Association__MultiplicityAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6794:1: rule__Association__MultiplicityAssignment_4 : ( ruleMultiplicty ) ;
    public final void rule__Association__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6798:1: ( ( ruleMultiplicty ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6799:1: ( ruleMultiplicty )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6799:1: ( ruleMultiplicty )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6800:1: ruleMultiplicty
            {
             before(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMultiplicty_in_rule__Association__MultiplicityAssignment_413596);
            ruleMultiplicty();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__MultiplicityAssignment_4"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6809:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6813:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6814:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6814:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6815:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_113627); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__Field__LiteralAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6824:1: rule__Field__LiteralAssignment_3 : ( ruleLiteral ) ;
    public final void rule__Field__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6828:1: ( ( ruleLiteral ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6829:1: ( ruleLiteral )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6829:1: ( ruleLiteral )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6830:1: ruleLiteral
            {
             before(grammarAccess.getFieldAccess().getLiteralLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__Field__LiteralAssignment_313658);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getLiteralLiteralParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__LiteralAssignment_3"


    // $ANTLR start "rule__Literal__NameAssignment_0_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6839:1: rule__Literal__NameAssignment_0_1 : ( ( 'Decimal' ) ) ;
    public final void rule__Literal__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6843:1: ( ( ( 'Decimal' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6844:1: ( ( 'Decimal' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6844:1: ( ( 'Decimal' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6845:1: ( 'Decimal' )
            {
             before(grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6846:1: ( 'Decimal' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6847:1: 'Decimal'
            {
             before(grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0()); 
            match(input,57,FOLLOW_57_in_rule__Literal__NameAssignment_0_113694); 
             after(grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0()); 

            }

             after(grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__NameAssignment_0_1"


    // $ANTLR start "rule__Literal__NameAssignment_1_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6862:1: rule__Literal__NameAssignment_1_1 : ( ( 'Money' ) ) ;
    public final void rule__Literal__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6866:1: ( ( ( 'Money' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6867:1: ( ( 'Money' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6867:1: ( ( 'Money' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6868:1: ( 'Money' )
            {
             before(grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6869:1: ( 'Money' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6870:1: 'Money'
            {
             before(grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0()); 
            match(input,58,FOLLOW_58_in_rule__Literal__NameAssignment_1_113738); 
             after(grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0()); 

            }

             after(grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__NameAssignment_1_1"


    // $ANTLR start "rule__Literal__NameAssignment_2_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6885:1: rule__Literal__NameAssignment_2_1 : ( ( 'Text' ) ) ;
    public final void rule__Literal__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6889:1: ( ( ( 'Text' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6890:1: ( ( 'Text' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6890:1: ( ( 'Text' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6891:1: ( 'Text' )
            {
             before(grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6892:1: ( 'Text' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6893:1: 'Text'
            {
             before(grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0()); 
            match(input,59,FOLLOW_59_in_rule__Literal__NameAssignment_2_113782); 
             after(grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0()); 

            }

             after(grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__NameAssignment_2_1"


    // $ANTLR start "rule__Literal__NameAssignment_3_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6908:1: rule__Literal__NameAssignment_3_1 : ( ( 'Boolean' ) ) ;
    public final void rule__Literal__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6912:1: ( ( ( 'Boolean' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6913:1: ( ( 'Boolean' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6913:1: ( ( 'Boolean' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6914:1: ( 'Boolean' )
            {
             before(grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6915:1: ( 'Boolean' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6916:1: 'Boolean'
            {
             before(grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0()); 
            match(input,60,FOLLOW_60_in_rule__Literal__NameAssignment_3_113826); 
             after(grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0()); 

            }

             after(grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__NameAssignment_3_1"


    // $ANTLR start "rule__Literal__NameAssignment_4_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6931:1: rule__Literal__NameAssignment_4_1 : ( ( 'Int' ) ) ;
    public final void rule__Literal__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6935:1: ( ( ( 'Int' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6936:1: ( ( 'Int' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6936:1: ( ( 'Int' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6937:1: ( 'Int' )
            {
             before(grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6938:1: ( 'Int' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6939:1: 'Int'
            {
             before(grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0()); 
            match(input,61,FOLLOW_61_in_rule__Literal__NameAssignment_4_113870); 
             after(grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0()); 

            }

             after(grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__NameAssignment_4_1"


    // $ANTLR start "rule__Enum__TypeAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6954:1: rule__Enum__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Enum__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6958:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6959:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6959:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6960:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumAccess().getTypeEnumDeclarationCrossReference_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6961:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6962:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getTypeEnumDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__TypeAssignment_113913); 
             after(grammarAccess.getEnumAccess().getTypeEnumDeclarationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEnumAccess().getTypeEnumDeclarationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__TypeAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\1\4\1\uffff\1\4\5\uffff\1\25\1\4\2\25";
    static final String DFA1_maxS =
        "\1\63\1\uffff\1\4\5\uffff\1\63\1\4\2\63";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\4\uffff";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\6\20\uffff\1\5\11\uffff\1\6\11\uffff\1\7\2\uffff\1\2\1\uffff\1\3\1\uffff\1\1\2\uffff\1\4",
            "",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\5\11\uffff\1\6\14\uffff\1\2\1\12\1\3\2\uffff\1\11\1\uffff\1\4",
            "\1\13",
            "\1\5\11\uffff\1\6\14\uffff\1\2\1\uffff\1\3\4\uffff\1\4",
            "\1\5\11\uffff\1\6\14\uffff\1\2\1\12\1\3\2\uffff\1\11\1\uffff\1\4"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "789:1: rule__Element__Alternatives : ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) | ( ruleFlow ) | ( ruleBusinessRule ) | ( ruleSystem ) );";
        }
    }
    static final String DFA3_eotS =
        "\26\uffff";
    static final String DFA3_eofS =
        "\26\uffff";
    static final String DFA3_minS =
        "\1\4\1\26\1\4\1\43\1\26\1\44\1\15\2\35\1\45\1\44\1\15\2\35\1\46\1\44\1\15\2\4\1\47\2\uffff";
    static final String DFA3_maxS =
        "\1\4\1\61\1\4\1\43\1\61\1\44\1\16\2\35\1\45\1\44\1\16\2\35\1\46\1\44\1\16\2\35\1\50\2\uffff";
    static final String DFA3_acceptS =
        "\24\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\26\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\3\32\uffff\1\2",
            "\1\4",
            "\1\5",
            "\1\3\32\uffff\1\2",
            "\1\6",
            "\1\7\1\10",
            "\1\11",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14\1\15",
            "\1\16",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21\1\22",
            "\1\25\22\uffff\1\24\4\uffff\1\25\1\23",
            "\1\25\22\uffff\1\24\4\uffff\1\25\1\23",
            "\1\25\1\24",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "857:1: rule__BusinessRule__SystemInputsAlternatives_0_8_0 : ( ( ruleBreSystemEntityInput ) | ( ruleBreEntityInput ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0_in_ruleFlow214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessRule308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Alternatives_in_ruleBusinessRule334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreSystemEntityInput_in_entryRuleBreSystemEntityInput361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreSystemEntityInput368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreSystemEntityInput__Group__0_in_ruleBreSystemEntityInput394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreEntityInput_in_entryRuleBreEntityInput421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreEntityInput428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreEntityInput__Group__0_in_ruleBreEntityInput454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemEntityConfiguration_in_entryRuleSystemEntityConfiguration481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemEntityConfiguration488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__0_in_ruleSystemEntityConfiguration514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityConfiguration_in_entryRuleEntityConfiguration541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityConfiguration548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__0_in_ruleEntityConfiguration574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0_in_ruleSystem634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemEntity_in_entryRuleSystemEntity661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemEntity668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__0_in_ruleSystemEntity694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqnWithWildCard788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__0_in_ruleFqnWithWildCard814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagram848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__0_in_ruleDiagram874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDeclaration968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__0_in_ruleEnumDeclaration994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0_in_ruleDomain1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_in_ruleProperty1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BREType__Alternatives_in_ruleBREType1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Alternatives_in_ruleMultiplicty1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_rule__Element__Alternatives1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_rule__Element__Alternatives1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__Element__Alternatives1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_rule__Element__Alternatives1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_rule__Element__Alternatives1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_rule__Element__Alternatives1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__0_in_rule__BusinessRule__Alternatives1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_1__0_in_rule__BusinessRule__Alternatives1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreSystemEntityInput_in_rule__BusinessRule__SystemInputsAlternatives_0_8_01786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreEntityInput_in_rule__BusinessRule__SystemInputsAlternatives_0_8_01803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Include__IncludeAlternatives_0_01836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Include__IncludeAlternatives_0_01856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Property__Alternatives1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__Property__Alternatives1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__0_in_rule__Literal__Alternatives1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Literal__Alternatives2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Boolean__Alternatives2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Boolean__Alternatives2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BREType__Alternatives2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BREType__Alternatives2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BREType__Alternatives2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Multiplicty__Alternatives2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Multiplicty__Alternatives2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Multiplicty__Alternatives2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__02272 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__02275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__ImportsAssignment_0_in_rule__Flow__Group__0__Impl2302 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__12333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__12336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Flow__Group__1__Impl2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__22395 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Flow__Group__3_in_rule__Flow__Group__22398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__NameAssignment_2_in_rule__Flow__Group__2__Impl2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__3__Impl_in_rule__Flow__Group__32455 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Flow__Group__4_in_rule__Flow__Group__32458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Flow__Group__3__Impl2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__4__Impl_in_rule__Flow__Group__42517 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Flow__Group__5_in_rule__Flow__Group__42520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__ActivitiesAssignment_4_in_rule__Flow__Group__4__Impl2547 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__5__Impl_in_rule__Flow__Group__52578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Flow__Group__5__Impl2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__02649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__02652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Activity__Group__0__Impl2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__12711 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__12714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__22771 = new BitSet(new long[]{0x0000000046000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__22774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Activity__Group__2__Impl2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__32833 = new BitSet(new long[]{0x0000000046000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__32836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__0_in_rule__Activity__Group__3__Impl2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__42894 = new BitSet(new long[]{0x0000000046000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__42897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__52955 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__52958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Activity__Group__5__Impl2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__63017 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__63020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DescriptionAssignment_6_in_rule__Activity__Group__6__Impl3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__73077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Activity__Group__7__Impl3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__0__Impl_in_rule__Activity__Group_3__03152 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__1_in_rule__Activity__Group_3__03155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Activity__Group_3__0__Impl3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__1__Impl_in_rule__Activity__Group_3__13214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__2_in_rule__Activity__Group_3__13217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Activity__Group_3__1__Impl3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__2__Impl_in_rule__Activity__Group_3__23276 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__3_in_rule__Activity__Group_3__23279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SucessorsAssignment_3_2_in_rule__Activity__Group_3__2__Impl3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__3__Impl_in_rule__Activity__Group_3__33336 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__4_in_rule__Activity__Group_3__33339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3_3__0_in_rule__Activity__Group_3__3__Impl3366 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__4__Impl_in_rule__Activity__Group_3__43397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Activity__Group_3__4__Impl3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3_3__0__Impl_in_rule__Activity__Group_3_3__03466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_3_3__1_in_rule__Activity__Group_3_3__03469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Activity__Group_3_3__0__Impl3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3_3__1__Impl_in_rule__Activity__Group_3_3__13528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SucessorsAssignment_3_3_1_in_rule__Activity__Group_3_3__1__Impl3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__03589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__03592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Activity__Group_4__0__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__13651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__BusinessRuleAssignment_4_1_in_rule__Activity__Group_4__1__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__0__Impl_in_rule__BusinessRule__Group_0__03712 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__1_in_rule__BusinessRule__Group_0__03715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__ImportsAssignment_0_0_in_rule__BusinessRule__Group_0__0__Impl3742 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__1__Impl_in_rule__BusinessRule__Group_0__13773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__2_in_rule__BusinessRule__Group_0__13776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__BusinessRule__Group_0__1__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__2__Impl_in_rule__BusinessRule__Group_0__23835 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__3_in_rule__BusinessRule__Group_0__23838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__NameAssignment_0_2_in_rule__BusinessRule__Group_0__2__Impl3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__3__Impl_in_rule__BusinessRule__Group_0__33895 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__4_in_rule__BusinessRule__Group_0__33898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__BusinessRule__Group_0__3__Impl3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__4__Impl_in_rule__BusinessRule__Group_0__43957 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__5_in_rule__BusinessRule__Group_0__43960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__TypAssignment_0_4_in_rule__BusinessRule__Group_0__4__Impl3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__5__Impl_in_rule__BusinessRule__Group_0__54017 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__6_in_rule__BusinessRule__Group_0__54020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BusinessRule__Group_0__5__Impl4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__6__Impl_in_rule__BusinessRule__Group_0__64079 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__7_in_rule__BusinessRule__Group_0__64082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__BusinessRule__Group_0__6__Impl4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__7__Impl_in_rule__BusinessRule__Group_0__74141 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__8_in_rule__BusinessRule__Group_0__74144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BusinessRule__Group_0__7__Impl4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__8__Impl_in_rule__BusinessRule__Group_0__84203 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__9_in_rule__BusinessRule__Group_0__84206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__SystemInputsAssignment_0_8_in_rule__BusinessRule__Group_0__8__Impl4233 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__9__Impl_in_rule__BusinessRule__Group_0__94264 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__10_in_rule__BusinessRule__Group_0__94267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BusinessRule__Group_0__9__Impl4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__10__Impl_in_rule__BusinessRule__Group_0__104326 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__11_in_rule__BusinessRule__Group_0__104329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__BusinessRule__Group_0__10__Impl4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__11__Impl_in_rule__BusinessRule__Group_0__114388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__12_in_rule__BusinessRule__Group_0__114391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BusinessRule__Group_0__11__Impl4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_0__12__Impl_in_rule__BusinessRule__Group_0__124450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__OutputAssignment_0_12_in_rule__BusinessRule__Group_0__12__Impl4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_1__0__Impl_in_rule__BusinessRule__Group_1__04533 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_1__1_in_rule__BusinessRule__Group_1__04536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__OutputAssignment_1_0_in_rule__BusinessRule__Group_1__0__Impl4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_1__1__Impl_in_rule__BusinessRule__Group_1__14593 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_1__2_in_rule__BusinessRule__Group_1__14596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BusinessRule__Group_1__1__Impl4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_1__2__Impl_in_rule__BusinessRule__Group_1__24655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BusinessRule__Group_1__2__Impl4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreSystemEntityInput__Group__0__Impl_in_rule__BreSystemEntityInput__Group__04720 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BreSystemEntityInput__Group__1_in_rule__BreSystemEntityInput__Group__04723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreSystemEntityInput__InputElementAssignment_0_in_rule__BreSystemEntityInput__Group__0__Impl4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreSystemEntityInput__Group__1__Impl_in_rule__BreSystemEntityInput__Group__14780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreSystemEntityInput__ConfigurationAssignment_1_in_rule__BreSystemEntityInput__Group__1__Impl4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreEntityInput__Group__0__Impl_in_rule__BreEntityInput__Group__04841 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BreEntityInput__Group__1_in_rule__BreEntityInput__Group__04844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreEntityInput__InputElementAssignment_0_in_rule__BreEntityInput__Group__0__Impl4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreEntityInput__Group__1__Impl_in_rule__BreEntityInput__Group__14901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreEntityInput__ConfigurationAssignment_1_in_rule__BreEntityInput__Group__1__Impl4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__0__Impl_in_rule__SystemEntityConfiguration__Group__04962 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__1_in_rule__SystemEntityConfiguration__Group__04965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__1__Impl_in_rule__SystemEntityConfiguration__Group__15023 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__2_in_rule__SystemEntityConfiguration__Group__15026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SystemEntityConfiguration__Group__1__Impl5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__2__Impl_in_rule__SystemEntityConfiguration__Group__25085 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__3_in_rule__SystemEntityConfiguration__Group__25088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SystemEntityConfiguration__Group__2__Impl5116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__3__Impl_in_rule__SystemEntityConfiguration__Group__35147 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__4_in_rule__SystemEntityConfiguration__Group__35150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SystemEntityConfiguration__Group__3__Impl5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__4__Impl_in_rule__SystemEntityConfiguration__Group__45209 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__5_in_rule__SystemEntityConfiguration__Group__45212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__PrimaryAssignment_4_in_rule__SystemEntityConfiguration__Group__4__Impl5239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__5__Impl_in_rule__SystemEntityConfiguration__Group__55269 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__6_in_rule__SystemEntityConfiguration__Group__55272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SystemEntityConfiguration__Group__5__Impl5300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__6__Impl_in_rule__SystemEntityConfiguration__Group__65331 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__7_in_rule__SystemEntityConfiguration__Group__65334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__SystemEntityConfiguration__Group__6__Impl5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__7__Impl_in_rule__SystemEntityConfiguration__Group__75393 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__8_in_rule__SystemEntityConfiguration__Group__75396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SystemEntityConfiguration__Group__7__Impl5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__8__Impl_in_rule__SystemEntityConfiguration__Group__85455 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__9_in_rule__SystemEntityConfiguration__Group__85458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__ObligatorischAssignment_8_in_rule__SystemEntityConfiguration__Group__8__Impl5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__9__Impl_in_rule__SystemEntityConfiguration__Group__95515 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__10_in_rule__SystemEntityConfiguration__Group__95518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SystemEntityConfiguration__Group__9__Impl5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__10__Impl_in_rule__SystemEntityConfiguration__Group__105577 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__11_in_rule__SystemEntityConfiguration__Group__105580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__SystemEntityConfiguration__Group__10__Impl5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__11__Impl_in_rule__SystemEntityConfiguration__Group__115639 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__12_in_rule__SystemEntityConfiguration__Group__115642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SystemEntityConfiguration__Group__11__Impl5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__12__Impl_in_rule__SystemEntityConfiguration__Group__125701 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__13_in_rule__SystemEntityConfiguration__Group__125704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__MultipleAssignment_12_in_rule__SystemEntityConfiguration__Group__12__Impl5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__13__Impl_in_rule__SystemEntityConfiguration__Group__135761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group_13__0_in_rule__SystemEntityConfiguration__Group__13__Impl5788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group_13__0__Impl_in_rule__SystemEntityConfiguration__Group_13__05847 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group_13__1_in_rule__SystemEntityConfiguration__Group_13__05850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SystemEntityConfiguration__Group_13__0__Impl5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group_13__1__Impl_in_rule__SystemEntityConfiguration__Group_13__15909 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group_13__2_in_rule__SystemEntityConfiguration__Group_13__15912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__SystemEntityConfiguration__Group_13__1__Impl5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group_13__2__Impl_in_rule__SystemEntityConfiguration__Group_13__25971 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group_13__3_in_rule__SystemEntityConfiguration__Group_13__25974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SystemEntityConfiguration__Group_13__2__Impl6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group_13__3__Impl_in_rule__SystemEntityConfiguration__Group_13__36033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3_in_rule__SystemEntityConfiguration__Group_13__3__Impl6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__0__Impl_in_rule__EntityConfiguration__Group__06098 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__1_in_rule__EntityConfiguration__Group__06101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__1__Impl_in_rule__EntityConfiguration__Group__16159 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__2_in_rule__EntityConfiguration__Group__16162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EntityConfiguration__Group__1__Impl6190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__2__Impl_in_rule__EntityConfiguration__Group__26221 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__3_in_rule__EntityConfiguration__Group__26224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EntityConfiguration__Group__2__Impl6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__3__Impl_in_rule__EntityConfiguration__Group__36283 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__4_in_rule__EntityConfiguration__Group__36286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EntityConfiguration__Group__3__Impl6314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__4__Impl_in_rule__EntityConfiguration__Group__46345 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__5_in_rule__EntityConfiguration__Group__46348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__PrimaryAssignment_4_in_rule__EntityConfiguration__Group__4__Impl6375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__5__Impl_in_rule__EntityConfiguration__Group__56405 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__6_in_rule__EntityConfiguration__Group__56408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EntityConfiguration__Group__5__Impl6436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__6__Impl_in_rule__EntityConfiguration__Group__66467 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__7_in_rule__EntityConfiguration__Group__66470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EntityConfiguration__Group__6__Impl6498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__7__Impl_in_rule__EntityConfiguration__Group__76529 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__8_in_rule__EntityConfiguration__Group__76532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EntityConfiguration__Group__7__Impl6560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__8__Impl_in_rule__EntityConfiguration__Group__86591 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__9_in_rule__EntityConfiguration__Group__86594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__ObligatorischAssignment_8_in_rule__EntityConfiguration__Group__8__Impl6621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__9__Impl_in_rule__EntityConfiguration__Group__96651 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__10_in_rule__EntityConfiguration__Group__96654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EntityConfiguration__Group__9__Impl6682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__10__Impl_in_rule__EntityConfiguration__Group__106713 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__11_in_rule__EntityConfiguration__Group__106716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EntityConfiguration__Group__10__Impl6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__11__Impl_in_rule__EntityConfiguration__Group__116775 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__12_in_rule__EntityConfiguration__Group__116778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EntityConfiguration__Group__11__Impl6806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__12__Impl_in_rule__EntityConfiguration__Group__126837 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__13_in_rule__EntityConfiguration__Group__126840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__MultipleAssignment_12_in_rule__EntityConfiguration__Group__12__Impl6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__13__Impl_in_rule__EntityConfiguration__Group__136897 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__14_in_rule__EntityConfiguration__Group__136900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_13__0_in_rule__EntityConfiguration__Group__13__Impl6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__14__Impl_in_rule__EntityConfiguration__Group__146958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EntityConfiguration__Group__14__Impl6986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_13__0__Impl_in_rule__EntityConfiguration__Group_13__07047 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_13__1_in_rule__EntityConfiguration__Group_13__07050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EntityConfiguration__Group_13__0__Impl7078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_13__1__Impl_in_rule__EntityConfiguration__Group_13__17109 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_13__2_in_rule__EntityConfiguration__Group_13__17112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EntityConfiguration__Group_13__1__Impl7140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_13__2__Impl_in_rule__EntityConfiguration__Group_13__27171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_13__3_in_rule__EntityConfiguration__Group_13__27174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EntityConfiguration__Group_13__2__Impl7202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_13__3__Impl_in_rule__EntityConfiguration__Group_13__37233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__PathAssignment_13_3_in_rule__EntityConfiguration__Group_13__3__Impl7260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__07298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__07301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__System__Group__0__Impl7329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__17360 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__17363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl7390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__27420 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__27423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__System__Group__2__Impl7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__37482 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__37485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__SrcEntitiesAssignment_3_in_rule__System__Group__3__Impl7512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__47542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__System__Group__4__Impl7570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__0__Impl_in_rule__SystemEntity__Group__07611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__1_in_rule__SystemEntity__Group__07614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SystemEntity__Group__0__Impl7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__1__Impl_in_rule__SystemEntity__Group__17673 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__2_in_rule__SystemEntity__Group__17676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__NameAssignment_1_in_rule__SystemEntity__Group__1__Impl7703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__2__Impl_in_rule__SystemEntity__Group__27733 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__3_in_rule__SystemEntity__Group__27736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SystemEntity__Group__2__Impl7764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__3__Impl_in_rule__SystemEntity__Group__37795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__FormatAssignment_3_in_rule__SystemEntity__Group__3__Impl7822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__07860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__07863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Import__Group__0__Impl7891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__17922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl7949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__0__Impl_in_rule__FqnWithWildCard__Group__07983 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__1_in_rule__FqnWithWildCard__Group__07986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__FqnWithWildCard__Group__0__Impl8013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__1__Impl_in_rule__FqnWithWildCard__Group__18042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FqnWithWildCard__Group__1__Impl8071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__0__Impl_in_rule__Diagram__Group__08108 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Diagram__Group__1_in_rule__Diagram__Group__08111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__ImportsAssignment_0_in_rule__Diagram__Group__0__Impl8138 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__1__Impl_in_rule__Diagram__Group__18169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Diagram__Group__2_in_rule__Diagram__Group__18172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Diagram__Group__1__Impl8200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__2__Impl_in_rule__Diagram__Group__28231 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Diagram__Group__3_in_rule__Diagram__Group__28234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__NameAssignment_2_in_rule__Diagram__Group__2__Impl8261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__3__Impl_in_rule__Diagram__Group__38291 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_rule__Diagram__Group__4_in_rule__Diagram__Group__38294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Diagram__Group__3__Impl8322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__4__Impl_in_rule__Diagram__Group__48353 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_rule__Diagram__Group__5_in_rule__Diagram__Group__48356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__IncludesAssignment_4_in_rule__Diagram__Group__4__Impl8383 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__Diagram__Group__5__Impl_in_rule__Diagram__Group__58414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Diagram__Group__5__Impl8442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__08485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__08488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__IncludeAssignment_0_in_rule__Include__Group__0__Impl8515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__18545 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__18548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__EntityAssignment_1_in_rule__Include__Group__1__Impl8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__28605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__0_in_rule__Include__Group__2__Impl8632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__0__Impl_in_rule__Include__Group_2__08668 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Include__Group_2__1_in_rule__Include__Group_2__08671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Include__Group_2__0__Impl8699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__1__Impl_in_rule__Include__Group_2__18730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group_2__2_in_rule__Include__Group_2__18733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Include__Group_2__1__Impl8761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__2__Impl_in_rule__Include__Group_2__28792 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__Include__Group_2__3_in_rule__Include__Group_2__28795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__FieldsAssignment_2_2_in_rule__Include__Group_2__2__Impl8822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__3__Impl_in_rule__Include__Group_2__38852 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__Include__Group_2__4_in_rule__Include__Group_2__38855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2_3__0_in_rule__Include__Group_2__3__Impl8882 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__4__Impl_in_rule__Include__Group_2__48913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Include__Group_2__4__Impl8941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2_3__0__Impl_in_rule__Include__Group_2_3__08982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group_2_3__1_in_rule__Include__Group_2_3__08985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Include__Group_2_3__0__Impl9013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2_3__1__Impl_in_rule__Include__Group_2_3__19044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__FieldsAssignment_2_3_1_in_rule__Include__Group_2_3__1__Impl9071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__0__Impl_in_rule__EnumDeclaration__Group__09105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__1_in_rule__EnumDeclaration__Group__09108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__EnumDeclaration__Group__0__Impl9136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__1__Impl_in_rule__EnumDeclaration__Group__19167 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__2_in_rule__EnumDeclaration__Group__19170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__NameAssignment_1_in_rule__EnumDeclaration__Group__1__Impl9197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__2__Impl_in_rule__EnumDeclaration__Group__29227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__3_in_rule__EnumDeclaration__Group__29230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumDeclaration__Group__2__Impl9258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__3__Impl_in_rule__EnumDeclaration__Group__39289 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__4_in_rule__EnumDeclaration__Group__39292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__ValuesAssignment_3_in_rule__EnumDeclaration__Group__3__Impl9319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__4__Impl_in_rule__EnumDeclaration__Group__49349 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__5_in_rule__EnumDeclaration__Group__49352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__0_in_rule__EnumDeclaration__Group__4__Impl9379 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__5__Impl_in_rule__EnumDeclaration__Group__59410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumDeclaration__Group__5__Impl9438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__0__Impl_in_rule__EnumDeclaration__Group_4__09481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__1_in_rule__EnumDeclaration__Group_4__09484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EnumDeclaration__Group_4__0__Impl9512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__1__Impl_in_rule__EnumDeclaration__Group_4__19543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__Group_4__1__Impl9570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__09603 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__09606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl9633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__19662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl9689 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__09724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__09727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__FQN__Group_1__0__Impl9755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__19786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl9813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__09846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__09849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Entity__Group__0__Impl9877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__19908 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__19911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl9938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__29968 = new BitSet(new long[]{0x00A0000000800000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__29971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Entity__Group__2__Impl9999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__310030 = new BitSet(new long[]{0x00A0000000800000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__310033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_3_in_rule__Entity__Group__3__Impl10060 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__410091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Entity__Group__4__Impl10119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__010160 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__010163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ImportsAssignment_0_in_rule__Domain__Group__0__Impl10190 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__110221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__110224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Domain__Group__1__Impl10252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__210283 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__210286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl10313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__310343 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__310346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Domain__Group__3__Impl10374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__410405 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__410408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__DescriptionAssignment_4_in_rule__Domain__Group__4__Impl10435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__510465 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__6_in_rule__Domain__Group__510468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Domain__Group__5__Impl10496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__6__Impl_in_rule__Domain__Group__610527 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Domain__Group__7_in_rule__Domain__Group__610530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl10559 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl10571 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__7__Impl_in_rule__Domain__Group__710604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Domain__Group__7__Impl10632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__010679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__010682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Association__Group__0__Impl10710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__110741 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__110744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__NameAssignment_1_in_rule__Association__Group__1__Impl10771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__210801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group__3_in_rule__Association__Group__210804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Association__Group__2__Impl10832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__310863 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__Association__Group__4_in_rule__Association__Group__310866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TypeAssignment_3_in_rule__Association__Group__3__Impl10893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__4__Impl_in_rule__Association__Group__410923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__MultiplicityAssignment_4_in_rule__Association__Group__4__Impl10950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__010990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__010993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Field__Group__0__Impl11021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__111052 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__111055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl11082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__211112 = new BitSet(new long[]{0x3F00000000000000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__211115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Field__Group__2__Impl11143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__311174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__LiteralAssignment_3_in_rule__Field__Group__3__Impl11201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__011239 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__011242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__111300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_0_1_in_rule__Literal__Group_0__1__Impl11327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__011361 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__011364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__111422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_1_1_in_rule__Literal__Group_1__1__Impl11449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__011483 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__011486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__111544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_2_1_in_rule__Literal__Group_2__1__Impl11571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__0__Impl_in_rule__Literal__Group_3__011605 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__1_in_rule__Literal__Group_3__011608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__1__Impl_in_rule__Literal__Group_3__111666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_3_1_in_rule__Literal__Group_3__1__Impl11693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__011727 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__011730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__111788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_4_1_in_rule__Literal__Group_4__1__Impl11815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__011849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__011852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Enum__Group__0__Impl11880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__111911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__TypeAssignment_1_in_rule__Enum__Group__1__Impl11938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Model__ElementsAssignment11977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Flow__ImportsAssignment_012008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Flow__NameAssignment_212039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__Flow__ActivitiesAssignment_412070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_112101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__SucessorsAssignment_3_212136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__SucessorsAssignment_3_3_112175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Activity__BusinessRuleAssignment_4_112214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__DescriptionAssignment_612249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__BusinessRule__ImportsAssignment_0_012280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessRule__NameAssignment_0_212311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBREType_in_rule__BusinessRule__TypAssignment_0_412342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__SystemInputsAlternatives_0_8_0_in_rule__BusinessRule__SystemInputsAssignment_0_812373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__BusinessRule__OutputAssignment_0_1212410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__BusinessRule__OutputAssignment_1_012449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__BreSystemEntityInput__InputElementAssignment_012488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemEntityConfiguration_in_rule__BreSystemEntityInput__ConfigurationAssignment_112523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__BreEntityInput__InputElementAssignment_012558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityConfiguration_in_rule__BreEntityInput__ConfigurationAssignment_112593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__SystemEntityConfiguration__PrimaryAssignment_412624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__SystemEntityConfiguration__ObligatorischAssignment_812655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__SystemEntityConfiguration__MultipleAssignment_1212686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_312717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__EntityConfiguration__PrimaryAssignment_412748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__EntityConfiguration__ObligatorischAssignment_812779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__EntityConfiguration__MultipleAssignment_1212810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__EntityConfiguration__PathAssignment_13_312845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__NameAssignment_112880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemEntity_in_rule__System__SrcEntitiesAssignment_312911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SystemEntity__NameAssignment_112942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SystemEntity__FormatAssignment_312973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_rule__Import__ImportedNamespaceAssignment_113004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Diagram__ImportsAssignment_013035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Diagram__NameAssignment_213066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__Diagram__IncludesAssignment_413097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__IncludeAlternatives_0_0_in_rule__Include__IncludeAssignment_013128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Include__EntityAssignment_113165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Include__FieldsAssignment_2_213204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Include__FieldsAssignment_2_3_113243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__NameAssignment_113278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__ValuesAssignment_313309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_113340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_313371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Domain__ImportsAssignment_013402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_213433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Domain__DescriptionAssignment_413464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Domain__EntitiesAssignment_613495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__NameAssignment_113526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Association__TypeAssignment_313561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_rule__Association__MultiplicityAssignment_413596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_113627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Field__LiteralAssignment_313658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Literal__NameAssignment_0_113694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Literal__NameAssignment_1_113738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Literal__NameAssignment_2_113782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Literal__NameAssignment_3_113826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Literal__NameAssignment_4_113870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__TypeAssignment_113913 = new BitSet(new long[]{0x0000000000000002L});

}