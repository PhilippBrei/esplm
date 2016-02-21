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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Include'", "'Exclude'", "'Flow'", "'{'", "'}'", "'Activity'", "'Description'", "'Successors'", "'['", "']'", "','", "'Calls'", "'BusinessRule'", "'Import'", "'.*'", "'Diagram'", "'with'", "'Enumeration'", "'.'", "'Entity'", "'Domain'", "'Description: '", "'Relation'", "':'", "'Field'", "'Enum'", "'1..N'", "'0..N'", "'1'", "'1..0'", "'Decimal'", "'Money'", "'Text'", "'Boolean'", "'Int'"
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:181:1: ruleBusinessRule : ( ( rule__BusinessRule__Group__0 ) ) ;
    public final void ruleBusinessRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:185:2: ( ( ( rule__BusinessRule__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:186:1: ( ( rule__BusinessRule__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:186:1: ( ( rule__BusinessRule__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:187:1: ( rule__BusinessRule__Group__0 )
            {
             before(grammarAccess.getBusinessRuleAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:188:1: ( rule__BusinessRule__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:188:2: rule__BusinessRule__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__0_in_ruleBusinessRule334);
            rule__BusinessRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleImport"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:200:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:201:1: ( ruleImport EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:202:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport361);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport368); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:209:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:213:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:214:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:214:1: ( ( rule__Import__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:215:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:216:1: ( rule__Import__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:216:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport394);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:228:1: entryRuleFqnWithWildCard : ruleFqnWithWildCard EOF ;
    public final void entryRuleFqnWithWildCard() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:229:1: ( ruleFqnWithWildCard EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:230:1: ruleFqnWithWildCard EOF
            {
             before(grammarAccess.getFqnWithWildCardRule()); 
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard421);
            ruleFqnWithWildCard();

            state._fsp--;

             after(grammarAccess.getFqnWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqnWithWildCard428); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:237:1: ruleFqnWithWildCard : ( ( rule__FqnWithWildCard__Group__0 ) ) ;
    public final void ruleFqnWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:241:2: ( ( ( rule__FqnWithWildCard__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:242:1: ( ( rule__FqnWithWildCard__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:242:1: ( ( rule__FqnWithWildCard__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:243:1: ( rule__FqnWithWildCard__Group__0 )
            {
             before(grammarAccess.getFqnWithWildCardAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:244:1: ( rule__FqnWithWildCard__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:244:2: rule__FqnWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__0_in_ruleFqnWithWildCard454);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:256:1: entryRuleDiagram : ruleDiagram EOF ;
    public final void entryRuleDiagram() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:257:1: ( ruleDiagram EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:258:1: ruleDiagram EOF
            {
             before(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_ruleDiagram_in_entryRuleDiagram481);
            ruleDiagram();

            state._fsp--;

             after(grammarAccess.getDiagramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagram488); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:265:1: ruleDiagram : ( ( rule__Diagram__Group__0 ) ) ;
    public final void ruleDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:269:2: ( ( ( rule__Diagram__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:270:1: ( ( rule__Diagram__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:270:1: ( ( rule__Diagram__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:271:1: ( rule__Diagram__Group__0 )
            {
             before(grammarAccess.getDiagramAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:272:1: ( rule__Diagram__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:272:2: rule__Diagram__Group__0
            {
            pushFollow(FOLLOW_rule__Diagram__Group__0_in_ruleDiagram514);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:284:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:285:1: ( ruleInclude EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:286:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude541);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude548); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:293:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:297:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:298:1: ( ( rule__Include__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:298:1: ( ( rule__Include__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:299:1: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:300:1: ( rule__Include__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:300:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude574);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:312:1: entryRuleEnumDeclaration : ruleEnumDeclaration EOF ;
    public final void entryRuleEnumDeclaration() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:313:1: ( ruleEnumDeclaration EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:314:1: ruleEnumDeclaration EOF
            {
             before(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration601);
            ruleEnumDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDeclaration608); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:321:1: ruleEnumDeclaration : ( ( rule__EnumDeclaration__Group__0 ) ) ;
    public final void ruleEnumDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:325:2: ( ( ( rule__EnumDeclaration__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:326:1: ( ( rule__EnumDeclaration__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:326:1: ( ( rule__EnumDeclaration__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:327:1: ( rule__EnumDeclaration__Group__0 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:328:1: ( rule__EnumDeclaration__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:328:2: rule__EnumDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__0_in_ruleEnumDeclaration634);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:340:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:341:1: ( ruleFQN EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:342:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN661);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN668); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:349:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:353:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:354:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:354:1: ( ( rule__FQN__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:355:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:356:1: ( rule__FQN__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:356:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN694);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:368:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:369:1: ( ruleEntity EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:370:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity721);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity728); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:377:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:381:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:382:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:382:1: ( ( rule__Entity__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:383:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:384:1: ( rule__Entity__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:384:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity754);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:396:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:397:1: ( ruleDomain EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:398:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain781);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain788); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:405:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:409:2: ( ( ( rule__Domain__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:410:1: ( ( rule__Domain__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:410:1: ( ( rule__Domain__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:411:1: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:412:1: ( rule__Domain__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:412:2: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_rule__Domain__Group__0_in_ruleDomain814);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:424:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:425:1: ( ruleProperty EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:426:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty841);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty848); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:433:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:437:2: ( ( ( rule__Property__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:438:1: ( ( rule__Property__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:438:1: ( ( rule__Property__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:439:1: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:440:1: ( rule__Property__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:440:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_in_ruleProperty874);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:452:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:453:1: ( ruleAssociation EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:454:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation901);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation908); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:461:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:465:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:466:1: ( ( rule__Association__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:466:1: ( ( rule__Association__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:467:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:468:1: ( rule__Association__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:468:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_rule__Association__Group__0_in_ruleAssociation934);
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


    // $ANTLR start "entryRuleMultiplicty"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:480:1: entryRuleMultiplicty : ruleMultiplicty EOF ;
    public final void entryRuleMultiplicty() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:481:1: ( ruleMultiplicty EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:482:1: ruleMultiplicty EOF
            {
             before(grammarAccess.getMultiplictyRule()); 
            pushFollow(FOLLOW_ruleMultiplicty_in_entryRuleMultiplicty961);
            ruleMultiplicty();

            state._fsp--;

             after(grammarAccess.getMultiplictyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicty968); 

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
    // $ANTLR end "entryRuleMultiplicty"


    // $ANTLR start "ruleMultiplicty"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:489:1: ruleMultiplicty : ( ( rule__Multiplicty__Alternatives ) ) ;
    public final void ruleMultiplicty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:493:2: ( ( ( rule__Multiplicty__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:494:1: ( ( rule__Multiplicty__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:494:1: ( ( rule__Multiplicty__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:495:1: ( rule__Multiplicty__Alternatives )
            {
             before(grammarAccess.getMultiplictyAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:496:1: ( rule__Multiplicty__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:496:2: rule__Multiplicty__Alternatives
            {
            pushFollow(FOLLOW_rule__Multiplicty__Alternatives_in_ruleMultiplicty994);
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


    // $ANTLR start "entryRuleField"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:508:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:509:1: ( ruleField EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:510:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1021);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1028); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:517:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:521:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:522:1: ( ( rule__Field__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:522:1: ( ( rule__Field__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:523:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:524:1: ( rule__Field__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:524:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField1054);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:536:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:537:1: ( ruleLiteral EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:538:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1081);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1088); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:545:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:549:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:550:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:550:1: ( ( rule__Literal__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:551:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:552:1: ( rule__Literal__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:552:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1114);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:564:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:565:1: ( ruleEnum EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:566:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum1141);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum1148); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:573:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:577:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:578:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:578:1: ( ( rule__Enum__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:579:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:580:1: ( rule__Enum__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:580:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum1174);
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


    // $ANTLR start "rule__Element__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:592:1: rule__Element__Alternatives : ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) | ( ruleFlow ) | ( ruleBusinessRule ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:596:1: ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) | ( ruleFlow ) | ( ruleBusinessRule ) )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:597:1: ( ruleEnumDeclaration )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:597:1: ( ruleEnumDeclaration )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:598:1: ruleEnumDeclaration
                    {
                     before(grammarAccess.getElementAccess().getEnumDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEnumDeclaration_in_rule__Element__Alternatives1210);
                    ruleEnumDeclaration();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getEnumDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:603:6: ( ruleDiagram )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:603:6: ( ruleDiagram )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:604:1: ruleDiagram
                    {
                     before(grammarAccess.getElementAccess().getDiagramParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDiagram_in_rule__Element__Alternatives1227);
                    ruleDiagram();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDiagramParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:609:6: ( ruleDomain )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:609:6: ( ruleDomain )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:610:1: ruleDomain
                    {
                     before(grammarAccess.getElementAccess().getDomainParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDomain_in_rule__Element__Alternatives1244);
                    ruleDomain();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDomainParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:615:6: ( ruleFlow )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:615:6: ( ruleFlow )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:616:1: ruleFlow
                    {
                     before(grammarAccess.getElementAccess().getFlowParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFlow_in_rule__Element__Alternatives1261);
                    ruleFlow();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getFlowParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:621:6: ( ruleBusinessRule )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:621:6: ( ruleBusinessRule )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:622:1: ruleBusinessRule
                    {
                     before(grammarAccess.getElementAccess().getBusinessRuleParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBusinessRule_in_rule__Element__Alternatives1278);
                    ruleBusinessRule();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getBusinessRuleParserRuleCall_4()); 

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


    // $ANTLR start "rule__Include__IncludeAlternatives_0_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:632:1: rule__Include__IncludeAlternatives_0_0 : ( ( 'Include' ) | ( 'Exclude' ) );
    public final void rule__Include__IncludeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:636:1: ( ( 'Include' ) | ( 'Exclude' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:637:1: ( 'Include' )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:637:1: ( 'Include' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:638:1: 'Include'
                    {
                     before(grammarAccess.getIncludeAccess().getIncludeIncludeKeyword_0_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Include__IncludeAlternatives_0_01311); 
                     after(grammarAccess.getIncludeAccess().getIncludeIncludeKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:645:6: ( 'Exclude' )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:645:6: ( 'Exclude' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:646:1: 'Exclude'
                    {
                     before(grammarAccess.getIncludeAccess().getIncludeExcludeKeyword_0_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Include__IncludeAlternatives_0_01331); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:658:1: rule__Property__Alternatives : ( ( ruleField ) | ( ruleAssociation ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:662:1: ( ( ruleField ) | ( ruleAssociation ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==33) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:663:1: ( ruleField )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:663:1: ( ruleField )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:664:1: ruleField
                    {
                     before(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleField_in_rule__Property__Alternatives1365);
                    ruleField();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:669:6: ( ruleAssociation )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:669:6: ( ruleAssociation )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:670:1: ruleAssociation
                    {
                     before(grammarAccess.getPropertyAccess().getAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAssociation_in_rule__Property__Alternatives1382);
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


    // $ANTLR start "rule__Multiplicty__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:680:1: rule__Multiplicty__Alternatives : ( ( ( rule__Multiplicty__Group_0__0 ) ) | ( ( rule__Multiplicty__Group_1__0 ) ) | ( ( rule__Multiplicty__Group_2__0 ) ) | ( ( rule__Multiplicty__Group_3__0 ) ) );
    public final void rule__Multiplicty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:684:1: ( ( ( rule__Multiplicty__Group_0__0 ) ) | ( ( rule__Multiplicty__Group_1__0 ) ) | ( ( rule__Multiplicty__Group_2__0 ) ) | ( ( rule__Multiplicty__Group_3__0 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt4=1;
                }
                break;
            case 38:
                {
                alt4=2;
                }
                break;
            case 39:
                {
                alt4=3;
                }
                break;
            case 40:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:685:1: ( ( rule__Multiplicty__Group_0__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:685:1: ( ( rule__Multiplicty__Group_0__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:686:1: ( rule__Multiplicty__Group_0__0 )
                    {
                     before(grammarAccess.getMultiplictyAccess().getGroup_0()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:687:1: ( rule__Multiplicty__Group_0__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:687:2: rule__Multiplicty__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplicty__Group_0__0_in_rule__Multiplicty__Alternatives1414);
                    rule__Multiplicty__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplictyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:691:6: ( ( rule__Multiplicty__Group_1__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:691:6: ( ( rule__Multiplicty__Group_1__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:692:1: ( rule__Multiplicty__Group_1__0 )
                    {
                     before(grammarAccess.getMultiplictyAccess().getGroup_1()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:693:1: ( rule__Multiplicty__Group_1__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:693:2: rule__Multiplicty__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplicty__Group_1__0_in_rule__Multiplicty__Alternatives1432);
                    rule__Multiplicty__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplictyAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:697:6: ( ( rule__Multiplicty__Group_2__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:697:6: ( ( rule__Multiplicty__Group_2__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:698:1: ( rule__Multiplicty__Group_2__0 )
                    {
                     before(grammarAccess.getMultiplictyAccess().getGroup_2()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:699:1: ( rule__Multiplicty__Group_2__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:699:2: rule__Multiplicty__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Multiplicty__Group_2__0_in_rule__Multiplicty__Alternatives1450);
                    rule__Multiplicty__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplictyAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:703:6: ( ( rule__Multiplicty__Group_3__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:703:6: ( ( rule__Multiplicty__Group_3__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:704:1: ( rule__Multiplicty__Group_3__0 )
                    {
                     before(grammarAccess.getMultiplictyAccess().getGroup_3()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:705:1: ( rule__Multiplicty__Group_3__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:705:2: rule__Multiplicty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Multiplicty__Group_3__0_in_rule__Multiplicty__Alternatives1468);
                    rule__Multiplicty__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplictyAccess().getGroup_3()); 

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


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:714:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__Group_3__0 ) ) | ( ( rule__Literal__Group_4__0 ) ) | ( ruleEnum ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:718:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__Group_3__0 ) ) | ( ( rule__Literal__Group_4__0 ) ) | ( ruleEnum ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt5=1;
                }
                break;
            case 42:
                {
                alt5=2;
                }
                break;
            case 43:
                {
                alt5=3;
                }
                break;
            case 44:
                {
                alt5=4;
                }
                break;
            case 45:
                {
                alt5=5;
                }
                break;
            case 36:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:719:1: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:719:1: ( ( rule__Literal__Group_0__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:720:1: ( rule__Literal__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:721:1: ( rule__Literal__Group_0__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:721:2: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives1501);
                    rule__Literal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:725:6: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:725:6: ( ( rule__Literal__Group_1__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:726:1: ( rule__Literal__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:727:1: ( rule__Literal__Group_1__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:727:2: rule__Literal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives1519);
                    rule__Literal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:731:6: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:731:6: ( ( rule__Literal__Group_2__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:732:1: ( rule__Literal__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:733:1: ( rule__Literal__Group_2__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:733:2: rule__Literal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives1537);
                    rule__Literal__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:737:6: ( ( rule__Literal__Group_3__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:737:6: ( ( rule__Literal__Group_3__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:738:1: ( rule__Literal__Group_3__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_3()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:739:1: ( rule__Literal__Group_3__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:739:2: rule__Literal__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_3__0_in_rule__Literal__Alternatives1555);
                    rule__Literal__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:743:6: ( ( rule__Literal__Group_4__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:743:6: ( ( rule__Literal__Group_4__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:744:1: ( rule__Literal__Group_4__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_4()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:745:1: ( rule__Literal__Group_4__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:745:2: rule__Literal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives1573);
                    rule__Literal__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:749:6: ( ruleEnum )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:749:6: ( ruleEnum )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:750:1: ruleEnum
                    {
                     before(grammarAccess.getLiteralAccess().getEnumParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleEnum_in_rule__Literal__Alternatives1591);
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


    // $ANTLR start "rule__Flow__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:762:1: rule__Flow__Group__0 : rule__Flow__Group__0__Impl rule__Flow__Group__1 ;
    public final void rule__Flow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:766:1: ( rule__Flow__Group__0__Impl rule__Flow__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:767:2: rule__Flow__Group__0__Impl rule__Flow__Group__1
            {
            pushFollow(FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__01621);
            rule__Flow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__01624);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:774:1: rule__Flow__Group__0__Impl : ( ( rule__Flow__ImportsAssignment_0 )* ) ;
    public final void rule__Flow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:778:1: ( ( ( rule__Flow__ImportsAssignment_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:779:1: ( ( rule__Flow__ImportsAssignment_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:779:1: ( ( rule__Flow__ImportsAssignment_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:780:1: ( rule__Flow__ImportsAssignment_0 )*
            {
             before(grammarAccess.getFlowAccess().getImportsAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:781:1: ( rule__Flow__ImportsAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:781:2: rule__Flow__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Flow__ImportsAssignment_0_in_rule__Flow__Group__0__Impl1651);
            	    rule__Flow__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:791:1: rule__Flow__Group__1 : rule__Flow__Group__1__Impl rule__Flow__Group__2 ;
    public final void rule__Flow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:795:1: ( rule__Flow__Group__1__Impl rule__Flow__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:796:2: rule__Flow__Group__1__Impl rule__Flow__Group__2
            {
            pushFollow(FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__11682);
            rule__Flow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__11685);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:803:1: rule__Flow__Group__1__Impl : ( 'Flow' ) ;
    public final void rule__Flow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:807:1: ( ( 'Flow' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:808:1: ( 'Flow' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:808:1: ( 'Flow' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:809:1: 'Flow'
            {
             before(grammarAccess.getFlowAccess().getFlowKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Flow__Group__1__Impl1713); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:822:1: rule__Flow__Group__2 : rule__Flow__Group__2__Impl rule__Flow__Group__3 ;
    public final void rule__Flow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:826:1: ( rule__Flow__Group__2__Impl rule__Flow__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:827:2: rule__Flow__Group__2__Impl rule__Flow__Group__3
            {
            pushFollow(FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__21744);
            rule__Flow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__3_in_rule__Flow__Group__21747);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:834:1: rule__Flow__Group__2__Impl : ( ( rule__Flow__NameAssignment_2 ) ) ;
    public final void rule__Flow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:838:1: ( ( ( rule__Flow__NameAssignment_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:839:1: ( ( rule__Flow__NameAssignment_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:839:1: ( ( rule__Flow__NameAssignment_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:840:1: ( rule__Flow__NameAssignment_2 )
            {
             before(grammarAccess.getFlowAccess().getNameAssignment_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:841:1: ( rule__Flow__NameAssignment_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:841:2: rule__Flow__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Flow__NameAssignment_2_in_rule__Flow__Group__2__Impl1774);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:851:1: rule__Flow__Group__3 : rule__Flow__Group__3__Impl rule__Flow__Group__4 ;
    public final void rule__Flow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:855:1: ( rule__Flow__Group__3__Impl rule__Flow__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:856:2: rule__Flow__Group__3__Impl rule__Flow__Group__4
            {
            pushFollow(FOLLOW_rule__Flow__Group__3__Impl_in_rule__Flow__Group__31804);
            rule__Flow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__4_in_rule__Flow__Group__31807);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:863:1: rule__Flow__Group__3__Impl : ( '{' ) ;
    public final void rule__Flow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:867:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:868:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:868:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:869:1: '{'
            {
             before(grammarAccess.getFlowAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Flow__Group__3__Impl1835); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:882:1: rule__Flow__Group__4 : rule__Flow__Group__4__Impl rule__Flow__Group__5 ;
    public final void rule__Flow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:886:1: ( rule__Flow__Group__4__Impl rule__Flow__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:887:2: rule__Flow__Group__4__Impl rule__Flow__Group__5
            {
            pushFollow(FOLLOW_rule__Flow__Group__4__Impl_in_rule__Flow__Group__41866);
            rule__Flow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__5_in_rule__Flow__Group__41869);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:894:1: rule__Flow__Group__4__Impl : ( ( rule__Flow__ActivitiesAssignment_4 )* ) ;
    public final void rule__Flow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:898:1: ( ( ( rule__Flow__ActivitiesAssignment_4 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:899:1: ( ( rule__Flow__ActivitiesAssignment_4 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:899:1: ( ( rule__Flow__ActivitiesAssignment_4 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:900:1: ( rule__Flow__ActivitiesAssignment_4 )*
            {
             before(grammarAccess.getFlowAccess().getActivitiesAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:901:1: ( rule__Flow__ActivitiesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:901:2: rule__Flow__ActivitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Flow__ActivitiesAssignment_4_in_rule__Flow__Group__4__Impl1896);
            	    rule__Flow__ActivitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:911:1: rule__Flow__Group__5 : rule__Flow__Group__5__Impl ;
    public final void rule__Flow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:915:1: ( rule__Flow__Group__5__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:916:2: rule__Flow__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Flow__Group__5__Impl_in_rule__Flow__Group__51927);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:922:1: rule__Flow__Group__5__Impl : ( '}' ) ;
    public final void rule__Flow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:926:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:927:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:927:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:928:1: '}'
            {
             before(grammarAccess.getFlowAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Flow__Group__5__Impl1955); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:953:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:957:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:958:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__01998);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__02001);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:965:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:969:1: ( ( 'Activity' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:970:1: ( 'Activity' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:970:1: ( 'Activity' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:971:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Activity__Group__0__Impl2029); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:984:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:988:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:989:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__12060);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__12063);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:996:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1000:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1001:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1001:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1002:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1003:1: ( rule__Activity__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1003:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl2090);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1013:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1017:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1018:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__22120);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__22123);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1025:1: rule__Activity__Group__2__Impl : ( '{' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1029:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1030:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1030:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1031:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Activity__Group__2__Impl2151); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1044:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1048:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1049:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__32182);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__32185);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1056:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__Group_3__0 )? ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1060:1: ( ( ( rule__Activity__Group_3__0 )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1061:1: ( ( rule__Activity__Group_3__0 )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1061:1: ( ( rule__Activity__Group_3__0 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1062:1: ( rule__Activity__Group_3__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1063:1: ( rule__Activity__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1063:2: rule__Activity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_3__0_in_rule__Activity__Group__3__Impl2212);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1073:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1077:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1078:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__42243);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__42246);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1085:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )? ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1089:1: ( ( ( rule__Activity__Group_4__0 )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1090:1: ( ( rule__Activity__Group_4__0 )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1090:1: ( ( rule__Activity__Group_4__0 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1091:1: ( rule__Activity__Group_4__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1092:1: ( rule__Activity__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1092:2: rule__Activity__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl2273);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1102:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1106:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1107:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__52304);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__52307);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1114:1: rule__Activity__Group__5__Impl : ( 'Description' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1118:1: ( ( 'Description' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1119:1: ( 'Description' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1119:1: ( 'Description' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1120:1: 'Description'
            {
             before(grammarAccess.getActivityAccess().getDescriptionKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Activity__Group__5__Impl2335); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1133:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1137:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1138:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__62366);
            rule__Activity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__62369);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1145:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__DescriptionAssignment_6 ) ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1149:1: ( ( ( rule__Activity__DescriptionAssignment_6 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1150:1: ( ( rule__Activity__DescriptionAssignment_6 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1150:1: ( ( rule__Activity__DescriptionAssignment_6 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1151:1: ( rule__Activity__DescriptionAssignment_6 )
            {
             before(grammarAccess.getActivityAccess().getDescriptionAssignment_6()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1152:1: ( rule__Activity__DescriptionAssignment_6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1152:2: rule__Activity__DescriptionAssignment_6
            {
            pushFollow(FOLLOW_rule__Activity__DescriptionAssignment_6_in_rule__Activity__Group__6__Impl2396);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1162:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1166:1: ( rule__Activity__Group__7__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1167:2: rule__Activity__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__72426);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1173:1: rule__Activity__Group__7__Impl : ( '}' ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1177:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1178:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1178:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1179:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__Activity__Group__7__Impl2454); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1208:1: rule__Activity__Group_3__0 : rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1 ;
    public final void rule__Activity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1212:1: ( rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1213:2: rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__0__Impl_in_rule__Activity__Group_3__02501);
            rule__Activity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_3__1_in_rule__Activity__Group_3__02504);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1220:1: rule__Activity__Group_3__0__Impl : ( 'Successors' ) ;
    public final void rule__Activity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1224:1: ( ( 'Successors' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1225:1: ( 'Successors' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1225:1: ( 'Successors' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1226:1: 'Successors'
            {
             before(grammarAccess.getActivityAccess().getSuccessorsKeyword_3_0()); 
            match(input,18,FOLLOW_18_in_rule__Activity__Group_3__0__Impl2532); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1239:1: rule__Activity__Group_3__1 : rule__Activity__Group_3__1__Impl rule__Activity__Group_3__2 ;
    public final void rule__Activity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1243:1: ( rule__Activity__Group_3__1__Impl rule__Activity__Group_3__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1244:2: rule__Activity__Group_3__1__Impl rule__Activity__Group_3__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__1__Impl_in_rule__Activity__Group_3__12563);
            rule__Activity__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_3__2_in_rule__Activity__Group_3__12566);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1251:1: rule__Activity__Group_3__1__Impl : ( '[' ) ;
    public final void rule__Activity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1255:1: ( ( '[' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1256:1: ( '[' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1256:1: ( '[' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1257:1: '['
            {
             before(grammarAccess.getActivityAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,19,FOLLOW_19_in_rule__Activity__Group_3__1__Impl2594); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1270:1: rule__Activity__Group_3__2 : rule__Activity__Group_3__2__Impl rule__Activity__Group_3__3 ;
    public final void rule__Activity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1274:1: ( rule__Activity__Group_3__2__Impl rule__Activity__Group_3__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1275:2: rule__Activity__Group_3__2__Impl rule__Activity__Group_3__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__2__Impl_in_rule__Activity__Group_3__22625);
            rule__Activity__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_3__3_in_rule__Activity__Group_3__22628);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1282:1: rule__Activity__Group_3__2__Impl : ( ( rule__Activity__SucessorsAssignment_3_2 ) ) ;
    public final void rule__Activity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1286:1: ( ( ( rule__Activity__SucessorsAssignment_3_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1287:1: ( ( rule__Activity__SucessorsAssignment_3_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1287:1: ( ( rule__Activity__SucessorsAssignment_3_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1288:1: ( rule__Activity__SucessorsAssignment_3_2 )
            {
             before(grammarAccess.getActivityAccess().getSucessorsAssignment_3_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1289:1: ( rule__Activity__SucessorsAssignment_3_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1289:2: rule__Activity__SucessorsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Activity__SucessorsAssignment_3_2_in_rule__Activity__Group_3__2__Impl2655);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1299:1: rule__Activity__Group_3__3 : rule__Activity__Group_3__3__Impl rule__Activity__Group_3__4 ;
    public final void rule__Activity__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1303:1: ( rule__Activity__Group_3__3__Impl rule__Activity__Group_3__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1304:2: rule__Activity__Group_3__3__Impl rule__Activity__Group_3__4
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__3__Impl_in_rule__Activity__Group_3__32685);
            rule__Activity__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_3__4_in_rule__Activity__Group_3__32688);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1311:1: rule__Activity__Group_3__3__Impl : ( ( rule__Activity__Group_3_3__0 )* ) ;
    public final void rule__Activity__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1315:1: ( ( ( rule__Activity__Group_3_3__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1316:1: ( ( rule__Activity__Group_3_3__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1316:1: ( ( rule__Activity__Group_3_3__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1317:1: ( rule__Activity__Group_3_3__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_3_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1318:1: ( rule__Activity__Group_3_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1318:2: rule__Activity__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_3_3__0_in_rule__Activity__Group_3__3__Impl2715);
            	    rule__Activity__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1328:1: rule__Activity__Group_3__4 : rule__Activity__Group_3__4__Impl ;
    public final void rule__Activity__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1332:1: ( rule__Activity__Group_3__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1333:2: rule__Activity__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__4__Impl_in_rule__Activity__Group_3__42746);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1339:1: rule__Activity__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Activity__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1343:1: ( ( ']' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1344:1: ( ']' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1344:1: ( ']' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1345:1: ']'
            {
             before(grammarAccess.getActivityAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,20,FOLLOW_20_in_rule__Activity__Group_3__4__Impl2774); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1368:1: rule__Activity__Group_3_3__0 : rule__Activity__Group_3_3__0__Impl rule__Activity__Group_3_3__1 ;
    public final void rule__Activity__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1372:1: ( rule__Activity__Group_3_3__0__Impl rule__Activity__Group_3_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1373:2: rule__Activity__Group_3_3__0__Impl rule__Activity__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_3_3__0__Impl_in_rule__Activity__Group_3_3__02815);
            rule__Activity__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_3_3__1_in_rule__Activity__Group_3_3__02818);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1380:1: rule__Activity__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1384:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1385:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1385:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1386:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_3_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Activity__Group_3_3__0__Impl2846); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1399:1: rule__Activity__Group_3_3__1 : rule__Activity__Group_3_3__1__Impl ;
    public final void rule__Activity__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1403:1: ( rule__Activity__Group_3_3__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1404:2: rule__Activity__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_3_3__1__Impl_in_rule__Activity__Group_3_3__12877);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1410:1: rule__Activity__Group_3_3__1__Impl : ( ( rule__Activity__SucessorsAssignment_3_3_1 ) ) ;
    public final void rule__Activity__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1414:1: ( ( ( rule__Activity__SucessorsAssignment_3_3_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1415:1: ( ( rule__Activity__SucessorsAssignment_3_3_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1415:1: ( ( rule__Activity__SucessorsAssignment_3_3_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1416:1: ( rule__Activity__SucessorsAssignment_3_3_1 )
            {
             before(grammarAccess.getActivityAccess().getSucessorsAssignment_3_3_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1417:1: ( rule__Activity__SucessorsAssignment_3_3_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1417:2: rule__Activity__SucessorsAssignment_3_3_1
            {
            pushFollow(FOLLOW_rule__Activity__SucessorsAssignment_3_3_1_in_rule__Activity__Group_3_3__1__Impl2904);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1431:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1435:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1436:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__02938);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__02941);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1443:1: rule__Activity__Group_4__0__Impl : ( 'Calls' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1447:1: ( ( 'Calls' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1448:1: ( 'Calls' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1448:1: ( 'Calls' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1449:1: 'Calls'
            {
             before(grammarAccess.getActivityAccess().getCallsKeyword_4_0()); 
            match(input,22,FOLLOW_22_in_rule__Activity__Group_4__0__Impl2969); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1462:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1466:1: ( rule__Activity__Group_4__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1467:2: rule__Activity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__13000);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1473:1: rule__Activity__Group_4__1__Impl : ( ( rule__Activity__BusinessRuleAssignment_4_1 ) ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1477:1: ( ( ( rule__Activity__BusinessRuleAssignment_4_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1478:1: ( ( rule__Activity__BusinessRuleAssignment_4_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1478:1: ( ( rule__Activity__BusinessRuleAssignment_4_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1479:1: ( rule__Activity__BusinessRuleAssignment_4_1 )
            {
             before(grammarAccess.getActivityAccess().getBusinessRuleAssignment_4_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1480:1: ( rule__Activity__BusinessRuleAssignment_4_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1480:2: rule__Activity__BusinessRuleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Activity__BusinessRuleAssignment_4_1_in_rule__Activity__Group_4__1__Impl3027);
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


    // $ANTLR start "rule__BusinessRule__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1494:1: rule__BusinessRule__Group__0 : rule__BusinessRule__Group__0__Impl rule__BusinessRule__Group__1 ;
    public final void rule__BusinessRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1498:1: ( rule__BusinessRule__Group__0__Impl rule__BusinessRule__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1499:2: rule__BusinessRule__Group__0__Impl rule__BusinessRule__Group__1
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__0__Impl_in_rule__BusinessRule__Group__03061);
            rule__BusinessRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__1_in_rule__BusinessRule__Group__03064);
            rule__BusinessRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__0"


    // $ANTLR start "rule__BusinessRule__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1506:1: rule__BusinessRule__Group__0__Impl : ( 'BusinessRule' ) ;
    public final void rule__BusinessRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1510:1: ( ( 'BusinessRule' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1511:1: ( 'BusinessRule' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1511:1: ( 'BusinessRule' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1512:1: 'BusinessRule'
            {
             before(grammarAccess.getBusinessRuleAccess().getBusinessRuleKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__BusinessRule__Group__0__Impl3092); 
             after(grammarAccess.getBusinessRuleAccess().getBusinessRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__0__Impl"


    // $ANTLR start "rule__BusinessRule__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1525:1: rule__BusinessRule__Group__1 : rule__BusinessRule__Group__1__Impl rule__BusinessRule__Group__2 ;
    public final void rule__BusinessRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1529:1: ( rule__BusinessRule__Group__1__Impl rule__BusinessRule__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1530:2: rule__BusinessRule__Group__1__Impl rule__BusinessRule__Group__2
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__1__Impl_in_rule__BusinessRule__Group__13123);
            rule__BusinessRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__2_in_rule__BusinessRule__Group__13126);
            rule__BusinessRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__1"


    // $ANTLR start "rule__BusinessRule__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1537:1: rule__BusinessRule__Group__1__Impl : ( ( rule__BusinessRule__NameAssignment_1 ) ) ;
    public final void rule__BusinessRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1541:1: ( ( ( rule__BusinessRule__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1542:1: ( ( rule__BusinessRule__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1542:1: ( ( rule__BusinessRule__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1543:1: ( rule__BusinessRule__NameAssignment_1 )
            {
             before(grammarAccess.getBusinessRuleAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1544:1: ( rule__BusinessRule__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1544:2: rule__BusinessRule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BusinessRule__NameAssignment_1_in_rule__BusinessRule__Group__1__Impl3153);
            rule__BusinessRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__1__Impl"


    // $ANTLR start "rule__BusinessRule__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1554:1: rule__BusinessRule__Group__2 : rule__BusinessRule__Group__2__Impl rule__BusinessRule__Group__3 ;
    public final void rule__BusinessRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1558:1: ( rule__BusinessRule__Group__2__Impl rule__BusinessRule__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1559:2: rule__BusinessRule__Group__2__Impl rule__BusinessRule__Group__3
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__2__Impl_in_rule__BusinessRule__Group__23183);
            rule__BusinessRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__3_in_rule__BusinessRule__Group__23186);
            rule__BusinessRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__2"


    // $ANTLR start "rule__BusinessRule__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1566:1: rule__BusinessRule__Group__2__Impl : ( '{' ) ;
    public final void rule__BusinessRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1570:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1571:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1571:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1572:1: '{'
            {
             before(grammarAccess.getBusinessRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__BusinessRule__Group__2__Impl3214); 
             after(grammarAccess.getBusinessRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__2__Impl"


    // $ANTLR start "rule__BusinessRule__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1585:1: rule__BusinessRule__Group__3 : rule__BusinessRule__Group__3__Impl ;
    public final void rule__BusinessRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1589:1: ( rule__BusinessRule__Group__3__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1590:2: rule__BusinessRule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__3__Impl_in_rule__BusinessRule__Group__33245);
            rule__BusinessRule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__3"


    // $ANTLR start "rule__BusinessRule__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1596:1: rule__BusinessRule__Group__3__Impl : ( '}' ) ;
    public final void rule__BusinessRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1600:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1601:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1601:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1602:1: '}'
            {
             before(grammarAccess.getBusinessRuleAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__BusinessRule__Group__3__Impl3273); 
             after(grammarAccess.getBusinessRuleAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1623:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1627:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1628:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03312);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03315);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1635:1: rule__Import__Group__0__Impl : ( 'Import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1639:1: ( ( 'Import' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1640:1: ( 'Import' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1640:1: ( 'Import' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1641:1: 'Import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Import__Group__0__Impl3343); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1654:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1658:1: ( rule__Import__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1659:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13374);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1665:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1669:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1670:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1670:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1671:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1672:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1672:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3401);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1686:1: rule__FqnWithWildCard__Group__0 : rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 ;
    public final void rule__FqnWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1690:1: ( rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1691:2: rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__0__Impl_in_rule__FqnWithWildCard__Group__03435);
            rule__FqnWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__1_in_rule__FqnWithWildCard__Group__03438);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1698:1: rule__FqnWithWildCard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FqnWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1702:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1703:1: ( ruleFQN )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1703:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1704:1: ruleFQN
            {
             before(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__FqnWithWildCard__Group__0__Impl3465);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1715:1: rule__FqnWithWildCard__Group__1 : rule__FqnWithWildCard__Group__1__Impl ;
    public final void rule__FqnWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1719:1: ( rule__FqnWithWildCard__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1720:2: rule__FqnWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__1__Impl_in_rule__FqnWithWildCard__Group__13494);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1726:1: rule__FqnWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FqnWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1730:1: ( ( ( '.*' )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1731:1: ( ( '.*' )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1731:1: ( ( '.*' )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1732:1: ( '.*' )?
            {
             before(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1733:1: ( '.*' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1734:2: '.*'
                    {
                    match(input,25,FOLLOW_25_in_rule__FqnWithWildCard__Group__1__Impl3523); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1749:1: rule__Diagram__Group__0 : rule__Diagram__Group__0__Impl rule__Diagram__Group__1 ;
    public final void rule__Diagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1753:1: ( rule__Diagram__Group__0__Impl rule__Diagram__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1754:2: rule__Diagram__Group__0__Impl rule__Diagram__Group__1
            {
            pushFollow(FOLLOW_rule__Diagram__Group__0__Impl_in_rule__Diagram__Group__03560);
            rule__Diagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__1_in_rule__Diagram__Group__03563);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1761:1: rule__Diagram__Group__0__Impl : ( ( rule__Diagram__ImportsAssignment_0 )* ) ;
    public final void rule__Diagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1765:1: ( ( ( rule__Diagram__ImportsAssignment_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1766:1: ( ( rule__Diagram__ImportsAssignment_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1766:1: ( ( rule__Diagram__ImportsAssignment_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1767:1: ( rule__Diagram__ImportsAssignment_0 )*
            {
             before(grammarAccess.getDiagramAccess().getImportsAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1768:1: ( rule__Diagram__ImportsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1768:2: rule__Diagram__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Diagram__ImportsAssignment_0_in_rule__Diagram__Group__0__Impl3590);
            	    rule__Diagram__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1778:1: rule__Diagram__Group__1 : rule__Diagram__Group__1__Impl rule__Diagram__Group__2 ;
    public final void rule__Diagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1782:1: ( rule__Diagram__Group__1__Impl rule__Diagram__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1783:2: rule__Diagram__Group__1__Impl rule__Diagram__Group__2
            {
            pushFollow(FOLLOW_rule__Diagram__Group__1__Impl_in_rule__Diagram__Group__13621);
            rule__Diagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__2_in_rule__Diagram__Group__13624);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1790:1: rule__Diagram__Group__1__Impl : ( 'Diagram' ) ;
    public final void rule__Diagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1794:1: ( ( 'Diagram' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1795:1: ( 'Diagram' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1795:1: ( 'Diagram' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1796:1: 'Diagram'
            {
             before(grammarAccess.getDiagramAccess().getDiagramKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Diagram__Group__1__Impl3652); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1809:1: rule__Diagram__Group__2 : rule__Diagram__Group__2__Impl rule__Diagram__Group__3 ;
    public final void rule__Diagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1813:1: ( rule__Diagram__Group__2__Impl rule__Diagram__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1814:2: rule__Diagram__Group__2__Impl rule__Diagram__Group__3
            {
            pushFollow(FOLLOW_rule__Diagram__Group__2__Impl_in_rule__Diagram__Group__23683);
            rule__Diagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__3_in_rule__Diagram__Group__23686);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1821:1: rule__Diagram__Group__2__Impl : ( ( rule__Diagram__NameAssignment_2 ) ) ;
    public final void rule__Diagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1825:1: ( ( ( rule__Diagram__NameAssignment_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1826:1: ( ( rule__Diagram__NameAssignment_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1826:1: ( ( rule__Diagram__NameAssignment_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1827:1: ( rule__Diagram__NameAssignment_2 )
            {
             before(grammarAccess.getDiagramAccess().getNameAssignment_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1828:1: ( rule__Diagram__NameAssignment_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1828:2: rule__Diagram__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Diagram__NameAssignment_2_in_rule__Diagram__Group__2__Impl3713);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1838:1: rule__Diagram__Group__3 : rule__Diagram__Group__3__Impl rule__Diagram__Group__4 ;
    public final void rule__Diagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1842:1: ( rule__Diagram__Group__3__Impl rule__Diagram__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1843:2: rule__Diagram__Group__3__Impl rule__Diagram__Group__4
            {
            pushFollow(FOLLOW_rule__Diagram__Group__3__Impl_in_rule__Diagram__Group__33743);
            rule__Diagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__4_in_rule__Diagram__Group__33746);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1850:1: rule__Diagram__Group__3__Impl : ( '{' ) ;
    public final void rule__Diagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1854:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1855:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1855:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1856:1: '{'
            {
             before(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Diagram__Group__3__Impl3774); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1869:1: rule__Diagram__Group__4 : rule__Diagram__Group__4__Impl rule__Diagram__Group__5 ;
    public final void rule__Diagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1873:1: ( rule__Diagram__Group__4__Impl rule__Diagram__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1874:2: rule__Diagram__Group__4__Impl rule__Diagram__Group__5
            {
            pushFollow(FOLLOW_rule__Diagram__Group__4__Impl_in_rule__Diagram__Group__43805);
            rule__Diagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__5_in_rule__Diagram__Group__43808);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1881:1: rule__Diagram__Group__4__Impl : ( ( rule__Diagram__IncludesAssignment_4 )* ) ;
    public final void rule__Diagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1885:1: ( ( ( rule__Diagram__IncludesAssignment_4 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1886:1: ( ( rule__Diagram__IncludesAssignment_4 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1886:1: ( ( rule__Diagram__IncludesAssignment_4 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1887:1: ( rule__Diagram__IncludesAssignment_4 )*
            {
             before(grammarAccess.getDiagramAccess().getIncludesAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1888:1: ( rule__Diagram__IncludesAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=11 && LA13_0<=12)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1888:2: rule__Diagram__IncludesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Diagram__IncludesAssignment_4_in_rule__Diagram__Group__4__Impl3835);
            	    rule__Diagram__IncludesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1898:1: rule__Diagram__Group__5 : rule__Diagram__Group__5__Impl ;
    public final void rule__Diagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1902:1: ( rule__Diagram__Group__5__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1903:2: rule__Diagram__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Diagram__Group__5__Impl_in_rule__Diagram__Group__53866);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1909:1: rule__Diagram__Group__5__Impl : ( '}' ) ;
    public final void rule__Diagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1913:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1914:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1914:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1915:1: '}'
            {
             before(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Diagram__Group__5__Impl3894); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1940:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1944:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1945:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__03937);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__03940);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1952:1: rule__Include__Group__0__Impl : ( ( rule__Include__IncludeAssignment_0 ) ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1956:1: ( ( ( rule__Include__IncludeAssignment_0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1957:1: ( ( rule__Include__IncludeAssignment_0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1957:1: ( ( rule__Include__IncludeAssignment_0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1958:1: ( rule__Include__IncludeAssignment_0 )
            {
             before(grammarAccess.getIncludeAccess().getIncludeAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1959:1: ( rule__Include__IncludeAssignment_0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1959:2: rule__Include__IncludeAssignment_0
            {
            pushFollow(FOLLOW_rule__Include__IncludeAssignment_0_in_rule__Include__Group__0__Impl3967);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1969:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1973:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1974:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__13997);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__14000);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1981:1: rule__Include__Group__1__Impl : ( ( rule__Include__EntityAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1985:1: ( ( ( rule__Include__EntityAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1986:1: ( ( rule__Include__EntityAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1986:1: ( ( rule__Include__EntityAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1987:1: ( rule__Include__EntityAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getEntityAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1988:1: ( rule__Include__EntityAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1988:2: rule__Include__EntityAssignment_1
            {
            pushFollow(FOLLOW_rule__Include__EntityAssignment_1_in_rule__Include__Group__1__Impl4027);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1998:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2002:1: ( rule__Include__Group__2__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2003:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__24057);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2009:1: rule__Include__Group__2__Impl : ( ( rule__Include__Group_2__0 ) ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2013:1: ( ( ( rule__Include__Group_2__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2014:1: ( ( rule__Include__Group_2__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2014:1: ( ( rule__Include__Group_2__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2015:1: ( rule__Include__Group_2__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2016:1: ( rule__Include__Group_2__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2016:2: rule__Include__Group_2__0
            {
            pushFollow(FOLLOW_rule__Include__Group_2__0_in_rule__Include__Group__2__Impl4084);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2032:1: rule__Include__Group_2__0 : rule__Include__Group_2__0__Impl rule__Include__Group_2__1 ;
    public final void rule__Include__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2036:1: ( rule__Include__Group_2__0__Impl rule__Include__Group_2__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2037:2: rule__Include__Group_2__0__Impl rule__Include__Group_2__1
            {
            pushFollow(FOLLOW_rule__Include__Group_2__0__Impl_in_rule__Include__Group_2__04120);
            rule__Include__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__1_in_rule__Include__Group_2__04123);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2044:1: rule__Include__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__Include__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2048:1: ( ( 'with' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2049:1: ( 'with' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2049:1: ( 'with' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2050:1: 'with'
            {
             before(grammarAccess.getIncludeAccess().getWithKeyword_2_0()); 
            match(input,27,FOLLOW_27_in_rule__Include__Group_2__0__Impl4151); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2063:1: rule__Include__Group_2__1 : rule__Include__Group_2__1__Impl rule__Include__Group_2__2 ;
    public final void rule__Include__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2067:1: ( rule__Include__Group_2__1__Impl rule__Include__Group_2__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2068:2: rule__Include__Group_2__1__Impl rule__Include__Group_2__2
            {
            pushFollow(FOLLOW_rule__Include__Group_2__1__Impl_in_rule__Include__Group_2__14182);
            rule__Include__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__2_in_rule__Include__Group_2__14185);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2075:1: rule__Include__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Include__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2079:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2080:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2080:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2081:1: '{'
            {
             before(grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,14,FOLLOW_14_in_rule__Include__Group_2__1__Impl4213); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2094:1: rule__Include__Group_2__2 : rule__Include__Group_2__2__Impl rule__Include__Group_2__3 ;
    public final void rule__Include__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2098:1: ( rule__Include__Group_2__2__Impl rule__Include__Group_2__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2099:2: rule__Include__Group_2__2__Impl rule__Include__Group_2__3
            {
            pushFollow(FOLLOW_rule__Include__Group_2__2__Impl_in_rule__Include__Group_2__24244);
            rule__Include__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__3_in_rule__Include__Group_2__24247);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2106:1: rule__Include__Group_2__2__Impl : ( ( rule__Include__FieldsAssignment_2_2 ) ) ;
    public final void rule__Include__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2110:1: ( ( ( rule__Include__FieldsAssignment_2_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2111:1: ( ( rule__Include__FieldsAssignment_2_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2111:1: ( ( rule__Include__FieldsAssignment_2_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2112:1: ( rule__Include__FieldsAssignment_2_2 )
            {
             before(grammarAccess.getIncludeAccess().getFieldsAssignment_2_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2113:1: ( rule__Include__FieldsAssignment_2_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2113:2: rule__Include__FieldsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Include__FieldsAssignment_2_2_in_rule__Include__Group_2__2__Impl4274);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2123:1: rule__Include__Group_2__3 : rule__Include__Group_2__3__Impl rule__Include__Group_2__4 ;
    public final void rule__Include__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2127:1: ( rule__Include__Group_2__3__Impl rule__Include__Group_2__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2128:2: rule__Include__Group_2__3__Impl rule__Include__Group_2__4
            {
            pushFollow(FOLLOW_rule__Include__Group_2__3__Impl_in_rule__Include__Group_2__34304);
            rule__Include__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__4_in_rule__Include__Group_2__34307);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2135:1: rule__Include__Group_2__3__Impl : ( ( rule__Include__Group_2_3__0 )* ) ;
    public final void rule__Include__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2139:1: ( ( ( rule__Include__Group_2_3__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2140:1: ( ( rule__Include__Group_2_3__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2140:1: ( ( rule__Include__Group_2_3__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2141:1: ( rule__Include__Group_2_3__0 )*
            {
             before(grammarAccess.getIncludeAccess().getGroup_2_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2142:1: ( rule__Include__Group_2_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2142:2: rule__Include__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Include__Group_2_3__0_in_rule__Include__Group_2__3__Impl4334);
            	    rule__Include__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2152:1: rule__Include__Group_2__4 : rule__Include__Group_2__4__Impl ;
    public final void rule__Include__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2156:1: ( rule__Include__Group_2__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2157:2: rule__Include__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group_2__4__Impl_in_rule__Include__Group_2__44365);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2163:1: rule__Include__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Include__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2167:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2168:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2168:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2169:1: '}'
            {
             before(grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,15,FOLLOW_15_in_rule__Include__Group_2__4__Impl4393); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2192:1: rule__Include__Group_2_3__0 : rule__Include__Group_2_3__0__Impl rule__Include__Group_2_3__1 ;
    public final void rule__Include__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2196:1: ( rule__Include__Group_2_3__0__Impl rule__Include__Group_2_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2197:2: rule__Include__Group_2_3__0__Impl rule__Include__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__Include__Group_2_3__0__Impl_in_rule__Include__Group_2_3__04434);
            rule__Include__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2_3__1_in_rule__Include__Group_2_3__04437);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2204:1: rule__Include__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Include__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2208:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2209:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2209:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2210:1: ','
            {
             before(grammarAccess.getIncludeAccess().getCommaKeyword_2_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Include__Group_2_3__0__Impl4465); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2223:1: rule__Include__Group_2_3__1 : rule__Include__Group_2_3__1__Impl ;
    public final void rule__Include__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2227:1: ( rule__Include__Group_2_3__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2228:2: rule__Include__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group_2_3__1__Impl_in_rule__Include__Group_2_3__14496);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2234:1: rule__Include__Group_2_3__1__Impl : ( ( rule__Include__FieldsAssignment_2_3_1 ) ) ;
    public final void rule__Include__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2238:1: ( ( ( rule__Include__FieldsAssignment_2_3_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2239:1: ( ( rule__Include__FieldsAssignment_2_3_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2239:1: ( ( rule__Include__FieldsAssignment_2_3_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2240:1: ( rule__Include__FieldsAssignment_2_3_1 )
            {
             before(grammarAccess.getIncludeAccess().getFieldsAssignment_2_3_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2241:1: ( rule__Include__FieldsAssignment_2_3_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2241:2: rule__Include__FieldsAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__Include__FieldsAssignment_2_3_1_in_rule__Include__Group_2_3__1__Impl4523);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2255:1: rule__EnumDeclaration__Group__0 : rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 ;
    public final void rule__EnumDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2259:1: ( rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2260:2: rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__0__Impl_in_rule__EnumDeclaration__Group__04557);
            rule__EnumDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__1_in_rule__EnumDeclaration__Group__04560);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2267:1: rule__EnumDeclaration__Group__0__Impl : ( 'Enumeration' ) ;
    public final void rule__EnumDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2271:1: ( ( 'Enumeration' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2272:1: ( 'Enumeration' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2272:1: ( 'Enumeration' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2273:1: 'Enumeration'
            {
             before(grammarAccess.getEnumDeclarationAccess().getEnumerationKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__EnumDeclaration__Group__0__Impl4588); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2286:1: rule__EnumDeclaration__Group__1 : rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 ;
    public final void rule__EnumDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2290:1: ( rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2291:2: rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__1__Impl_in_rule__EnumDeclaration__Group__14619);
            rule__EnumDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__2_in_rule__EnumDeclaration__Group__14622);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2298:1: rule__EnumDeclaration__Group__1__Impl : ( ( rule__EnumDeclaration__NameAssignment_1 ) ) ;
    public final void rule__EnumDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2302:1: ( ( ( rule__EnumDeclaration__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2303:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2303:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2304:1: ( rule__EnumDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2305:1: ( rule__EnumDeclaration__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2305:2: rule__EnumDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__NameAssignment_1_in_rule__EnumDeclaration__Group__1__Impl4649);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2315:1: rule__EnumDeclaration__Group__2 : rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 ;
    public final void rule__EnumDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2319:1: ( rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2320:2: rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__2__Impl_in_rule__EnumDeclaration__Group__24679);
            rule__EnumDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__3_in_rule__EnumDeclaration__Group__24682);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2327:1: rule__EnumDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2331:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2332:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2332:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2333:1: '{'
            {
             before(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__EnumDeclaration__Group__2__Impl4710); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2346:1: rule__EnumDeclaration__Group__3 : rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 ;
    public final void rule__EnumDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2350:1: ( rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2351:2: rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__3__Impl_in_rule__EnumDeclaration__Group__34741);
            rule__EnumDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__4_in_rule__EnumDeclaration__Group__34744);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2358:1: rule__EnumDeclaration__Group__3__Impl : ( ( rule__EnumDeclaration__ValuesAssignment_3 ) ) ;
    public final void rule__EnumDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2362:1: ( ( ( rule__EnumDeclaration__ValuesAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2363:1: ( ( rule__EnumDeclaration__ValuesAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2363:1: ( ( rule__EnumDeclaration__ValuesAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2364:1: ( rule__EnumDeclaration__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getValuesAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2365:1: ( rule__EnumDeclaration__ValuesAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2365:2: rule__EnumDeclaration__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__ValuesAssignment_3_in_rule__EnumDeclaration__Group__3__Impl4771);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2375:1: rule__EnumDeclaration__Group__4 : rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5 ;
    public final void rule__EnumDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2379:1: ( rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2380:2: rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__4__Impl_in_rule__EnumDeclaration__Group__44801);
            rule__EnumDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__5_in_rule__EnumDeclaration__Group__44804);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2387:1: rule__EnumDeclaration__Group__4__Impl : ( ( rule__EnumDeclaration__Group_4__0 )* ) ;
    public final void rule__EnumDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2391:1: ( ( ( rule__EnumDeclaration__Group_4__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2392:1: ( ( rule__EnumDeclaration__Group_4__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2392:1: ( ( rule__EnumDeclaration__Group_4__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2393:1: ( rule__EnumDeclaration__Group_4__0 )*
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2394:1: ( rule__EnumDeclaration__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2394:2: rule__EnumDeclaration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__0_in_rule__EnumDeclaration__Group__4__Impl4831);
            	    rule__EnumDeclaration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2404:1: rule__EnumDeclaration__Group__5 : rule__EnumDeclaration__Group__5__Impl ;
    public final void rule__EnumDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2408:1: ( rule__EnumDeclaration__Group__5__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2409:2: rule__EnumDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__5__Impl_in_rule__EnumDeclaration__Group__54862);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2415:1: rule__EnumDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__EnumDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2419:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2420:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2420:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2421:1: '}'
            {
             before(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__EnumDeclaration__Group__5__Impl4890); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2446:1: rule__EnumDeclaration__Group_4__0 : rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1 ;
    public final void rule__EnumDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2450:1: ( rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2451:2: rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__0__Impl_in_rule__EnumDeclaration__Group_4__04933);
            rule__EnumDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__1_in_rule__EnumDeclaration__Group_4__04936);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2458:1: rule__EnumDeclaration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2462:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2463:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2463:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2464:1: ','
            {
             before(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__EnumDeclaration__Group_4__0__Impl4964); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2477:1: rule__EnumDeclaration__Group_4__1 : rule__EnumDeclaration__Group_4__1__Impl ;
    public final void rule__EnumDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2481:1: ( rule__EnumDeclaration__Group_4__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2482:2: rule__EnumDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__1__Impl_in_rule__EnumDeclaration__Group_4__14995);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2488:1: rule__EnumDeclaration__Group_4__1__Impl : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2492:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2493:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2493:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2494:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getIDTerminalRuleCall_4_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__Group_4__1__Impl5022); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2509:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2513:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2514:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__05055);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__05058);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2521:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2525:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2526:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2526:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2527:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl5085); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2538:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2542:1: ( rule__FQN__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2543:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__15114);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2549:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2553:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2554:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2554:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2555:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2556:1: ( rule__FQN__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2556:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl5141);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2570:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2574:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2575:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__05176);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__05179);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2582:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2586:1: ( ( '.' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2587:1: ( '.' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2587:1: ( '.' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2588:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__FQN__Group_1__0__Impl5207); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2601:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2605:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2606:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__15238);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2612:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2616:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2617:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2617:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2618:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl5265); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2633:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2637:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2638:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__05298);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__05301);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2645:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2649:1: ( ( 'Entity' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2650:1: ( 'Entity' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2650:1: ( 'Entity' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2651:1: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Entity__Group__0__Impl5329); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2664:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2668:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2669:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__15360);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__15363);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2676:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2680:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2681:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2681:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2682:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2683:1: ( rule__Entity__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2683:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl5390);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2693:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2697:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2698:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__25420);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__25423);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2705:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2709:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2710:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2710:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2711:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group__2__Impl5451); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2724:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2728:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2729:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__35482);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__35485);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2736:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__PropertiesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2740:1: ( ( ( rule__Entity__PropertiesAssignment_3 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2741:1: ( ( rule__Entity__PropertiesAssignment_3 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2741:1: ( ( rule__Entity__PropertiesAssignment_3 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2742:1: ( rule__Entity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2743:1: ( rule__Entity__PropertiesAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33||LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2743:2: rule__Entity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_3_in_rule__Entity__Group__3__Impl5512);
            	    rule__Entity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2753:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2757:1: ( rule__Entity__Group__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2758:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__45543);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2764:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2768:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2769:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2769:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2770:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group__4__Impl5571); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2793:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2797:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2798:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__05612);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__05615);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2805:1: rule__Domain__Group__0__Impl : ( ( rule__Domain__ImportsAssignment_0 )* ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2809:1: ( ( ( rule__Domain__ImportsAssignment_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2810:1: ( ( rule__Domain__ImportsAssignment_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2810:1: ( ( rule__Domain__ImportsAssignment_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2811:1: ( rule__Domain__ImportsAssignment_0 )*
            {
             before(grammarAccess.getDomainAccess().getImportsAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2812:1: ( rule__Domain__ImportsAssignment_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2812:2: rule__Domain__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Domain__ImportsAssignment_0_in_rule__Domain__Group__0__Impl5642);
            	    rule__Domain__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2822:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2826:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2827:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__15673);
            rule__Domain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__15676);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2834:1: rule__Domain__Group__1__Impl : ( 'Domain' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2838:1: ( ( 'Domain' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2839:1: ( 'Domain' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2839:1: ( 'Domain' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2840:1: 'Domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Domain__Group__1__Impl5704); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2853:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2857:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2858:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__25735);
            rule__Domain__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__25738);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2865:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__NameAssignment_2 ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2869:1: ( ( ( rule__Domain__NameAssignment_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2870:1: ( ( rule__Domain__NameAssignment_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2870:1: ( ( rule__Domain__NameAssignment_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2871:1: ( rule__Domain__NameAssignment_2 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2872:1: ( rule__Domain__NameAssignment_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2872:2: rule__Domain__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl5765);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2882:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2886:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2887:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__35795);
            rule__Domain__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__35798);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2894:1: rule__Domain__Group__3__Impl : ( 'Description: ' ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2898:1: ( ( 'Description: ' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2899:1: ( 'Description: ' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2899:1: ( 'Description: ' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2900:1: 'Description: '
            {
             before(grammarAccess.getDomainAccess().getDescriptionKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__Domain__Group__3__Impl5826); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2913:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2917:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2918:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__45857);
            rule__Domain__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__45860);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2925:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__DescriptionAssignment_4 ) ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2929:1: ( ( ( rule__Domain__DescriptionAssignment_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2930:1: ( ( rule__Domain__DescriptionAssignment_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2930:1: ( ( rule__Domain__DescriptionAssignment_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2931:1: ( rule__Domain__DescriptionAssignment_4 )
            {
             before(grammarAccess.getDomainAccess().getDescriptionAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2932:1: ( rule__Domain__DescriptionAssignment_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2932:2: rule__Domain__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_rule__Domain__DescriptionAssignment_4_in_rule__Domain__Group__4__Impl5887);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2942:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl rule__Domain__Group__6 ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2946:1: ( rule__Domain__Group__5__Impl rule__Domain__Group__6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2947:2: rule__Domain__Group__5__Impl rule__Domain__Group__6
            {
            pushFollow(FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__55917);
            rule__Domain__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__6_in_rule__Domain__Group__55920);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2954:1: rule__Domain__Group__5__Impl : ( '{' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2958:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2959:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2959:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2960:1: '{'
            {
             before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Domain__Group__5__Impl5948); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2973:1: rule__Domain__Group__6 : rule__Domain__Group__6__Impl rule__Domain__Group__7 ;
    public final void rule__Domain__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2977:1: ( rule__Domain__Group__6__Impl rule__Domain__Group__7 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2978:2: rule__Domain__Group__6__Impl rule__Domain__Group__7
            {
            pushFollow(FOLLOW_rule__Domain__Group__6__Impl_in_rule__Domain__Group__65979);
            rule__Domain__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__7_in_rule__Domain__Group__65982);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2985:1: rule__Domain__Group__6__Impl : ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) ) ;
    public final void rule__Domain__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2989:1: ( ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2990:1: ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2990:1: ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2991:1: ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2991:1: ( ( rule__Domain__EntitiesAssignment_6 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2992:1: ( rule__Domain__EntitiesAssignment_6 )
            {
             before(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2993:1: ( rule__Domain__EntitiesAssignment_6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2993:2: rule__Domain__EntitiesAssignment_6
            {
            pushFollow(FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl6011);
            rule__Domain__EntitiesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 

            }

            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2996:1: ( ( rule__Domain__EntitiesAssignment_6 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2997:1: ( rule__Domain__EntitiesAssignment_6 )*
            {
             before(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2998:1: ( rule__Domain__EntitiesAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2998:2: rule__Domain__EntitiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl6023);
            	    rule__Domain__EntitiesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3009:1: rule__Domain__Group__7 : rule__Domain__Group__7__Impl ;
    public final void rule__Domain__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3013:1: ( rule__Domain__Group__7__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3014:2: rule__Domain__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group__7__Impl_in_rule__Domain__Group__76056);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3020:1: rule__Domain__Group__7__Impl : ( '}' ) ;
    public final void rule__Domain__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3024:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3025:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3025:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3026:1: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__Domain__Group__7__Impl6084); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3055:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3059:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3060:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__06131);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__06134);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3067:1: rule__Association__Group__0__Impl : ( 'Relation' ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3071:1: ( ( 'Relation' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3072:1: ( 'Relation' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3072:1: ( 'Relation' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3073:1: 'Relation'
            {
             before(grammarAccess.getAssociationAccess().getRelationKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Association__Group__0__Impl6162); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3086:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3090:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3091:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__16193);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__16196);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3098:1: rule__Association__Group__1__Impl : ( ( rule__Association__NameAssignment_1 ) ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3102:1: ( ( ( rule__Association__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3103:1: ( ( rule__Association__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3103:1: ( ( rule__Association__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3104:1: ( rule__Association__NameAssignment_1 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3105:1: ( rule__Association__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3105:2: rule__Association__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Association__NameAssignment_1_in_rule__Association__Group__1__Impl6223);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3115:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3119:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3120:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__26253);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__3_in_rule__Association__Group__26256);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3127:1: rule__Association__Group__2__Impl : ( ':' ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3131:1: ( ( ':' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3132:1: ( ':' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3132:1: ( ':' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3133:1: ':'
            {
             before(grammarAccess.getAssociationAccess().getColonKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Association__Group__2__Impl6284); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3146:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3150:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3151:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__36315);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__4_in_rule__Association__Group__36318);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3158:1: rule__Association__Group__3__Impl : ( ( rule__Association__TypeAssignment_3 ) ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3162:1: ( ( ( rule__Association__TypeAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3163:1: ( ( rule__Association__TypeAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3163:1: ( ( rule__Association__TypeAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3164:1: ( rule__Association__TypeAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getTypeAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3165:1: ( rule__Association__TypeAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3165:2: rule__Association__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Association__TypeAssignment_3_in_rule__Association__Group__3__Impl6345);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3175:1: rule__Association__Group__4 : rule__Association__Group__4__Impl ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3179:1: ( rule__Association__Group__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3180:2: rule__Association__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group__4__Impl_in_rule__Association__Group__46375);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3186:1: rule__Association__Group__4__Impl : ( ( rule__Association__MultiplicityAssignment_4 ) ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3190:1: ( ( ( rule__Association__MultiplicityAssignment_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3191:1: ( ( rule__Association__MultiplicityAssignment_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3191:1: ( ( rule__Association__MultiplicityAssignment_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3192:1: ( rule__Association__MultiplicityAssignment_4 )
            {
             before(grammarAccess.getAssociationAccess().getMultiplicityAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3193:1: ( rule__Association__MultiplicityAssignment_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3193:2: rule__Association__MultiplicityAssignment_4
            {
            pushFollow(FOLLOW_rule__Association__MultiplicityAssignment_4_in_rule__Association__Group__4__Impl6402);
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


    // $ANTLR start "rule__Multiplicty__Group_0__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3213:1: rule__Multiplicty__Group_0__0 : rule__Multiplicty__Group_0__0__Impl rule__Multiplicty__Group_0__1 ;
    public final void rule__Multiplicty__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3217:1: ( rule__Multiplicty__Group_0__0__Impl rule__Multiplicty__Group_0__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3218:2: rule__Multiplicty__Group_0__0__Impl rule__Multiplicty__Group_0__1
            {
            pushFollow(FOLLOW_rule__Multiplicty__Group_0__0__Impl_in_rule__Multiplicty__Group_0__06442);
            rule__Multiplicty__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplicty__Group_0__1_in_rule__Multiplicty__Group_0__06445);
            rule__Multiplicty__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__Group_0__0"


    // $ANTLR start "rule__Multiplicty__Group_0__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3225:1: rule__Multiplicty__Group_0__0__Impl : ( () ) ;
    public final void rule__Multiplicty__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3229:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3230:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3230:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3231:1: ()
            {
             before(grammarAccess.getMultiplictyAccess().getMultiplictyAction_0_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3232:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3234:1: 
            {
            }

             after(grammarAccess.getMultiplictyAccess().getMultiplictyAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__Group_0__0__Impl"


    // $ANTLR start "rule__Multiplicty__Group_0__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3244:1: rule__Multiplicty__Group_0__1 : rule__Multiplicty__Group_0__1__Impl ;
    public final void rule__Multiplicty__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3248:1: ( rule__Multiplicty__Group_0__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3249:2: rule__Multiplicty__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicty__Group_0__1__Impl_in_rule__Multiplicty__Group_0__16503);
            rule__Multiplicty__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__Group_0__1"


    // $ANTLR start "rule__Multiplicty__Group_0__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3255:1: rule__Multiplicty__Group_0__1__Impl : ( ( rule__Multiplicty__NameAssignment_0_1 ) ) ;
    public final void rule__Multiplicty__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3259:1: ( ( ( rule__Multiplicty__NameAssignment_0_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3260:1: ( ( rule__Multiplicty__NameAssignment_0_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3260:1: ( ( rule__Multiplicty__NameAssignment_0_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3261:1: ( rule__Multiplicty__NameAssignment_0_1 )
            {
             before(grammarAccess.getMultiplictyAccess().getNameAssignment_0_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3262:1: ( rule__Multiplicty__NameAssignment_0_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3262:2: rule__Multiplicty__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Multiplicty__NameAssignment_0_1_in_rule__Multiplicty__Group_0__1__Impl6530);
            rule__Multiplicty__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplictyAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__Group_0__1__Impl"


    // $ANTLR start "rule__Multiplicty__Group_1__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3276:1: rule__Multiplicty__Group_1__0 : rule__Multiplicty__Group_1__0__Impl rule__Multiplicty__Group_1__1 ;
    public final void rule__Multiplicty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3280:1: ( rule__Multiplicty__Group_1__0__Impl rule__Multiplicty__Group_1__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3281:2: rule__Multiplicty__Group_1__0__Impl rule__Multiplicty__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplicty__Group_1__0__Impl_in_rule__Multiplicty__Group_1__06564);
            rule__Multiplicty__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplicty__Group_1__1_in_rule__Multiplicty__Group_1__06567);
            rule__Multiplicty__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__Group_1__0"


    // $ANTLR start "rule__Multiplicty__Group_1__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3288:1: rule__Multiplicty__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplicty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3292:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3293:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3293:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3294:1: ()
            {
             before(grammarAccess.getMultiplictyAccess().getMultiplictyAction_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3295:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3297:1: 
            {
            }

             after(grammarAccess.getMultiplictyAccess().getMultiplictyAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplicty__Group_1__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3307:1: rule__Multiplicty__Group_1__1 : rule__Multiplicty__Group_1__1__Impl ;
    public final void rule__Multiplicty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3311:1: ( rule__Multiplicty__Group_1__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3312:2: rule__Multiplicty__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicty__Group_1__1__Impl_in_rule__Multiplicty__Group_1__16625);
            rule__Multiplicty__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__Group_1__1"


    // $ANTLR start "rule__Multiplicty__Group_1__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3318:1: rule__Multiplicty__Group_1__1__Impl : ( ( rule__Multiplicty__NameAssignment_1_1 ) ) ;
    public final void rule__Multiplicty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3322:1: ( ( ( rule__Multiplicty__NameAssignment_1_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3323:1: ( ( rule__Multiplicty__NameAssignment_1_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3323:1: ( ( rule__Multiplicty__NameAssignment_1_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3324:1: ( rule__Multiplicty__NameAssignment_1_1 )
            {
             before(grammarAccess.getMultiplictyAccess().getNameAssignment_1_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3325:1: ( rule__Multiplicty__NameAssignment_1_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3325:2: rule__Multiplicty__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplicty__NameAssignment_1_1_in_rule__Multiplicty__Group_1__1__Impl6652);
            rule__Multiplicty__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplictyAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplicty__Group_2__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3339:1: rule__Multiplicty__Group_2__0 : rule__Multiplicty__Group_2__0__Impl rule__Multiplicty__Group_2__1 ;
    public final void rule__Multiplicty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3343:1: ( rule__Multiplicty__Group_2__0__Impl rule__Multiplicty__Group_2__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3344:2: rule__Multiplicty__Group_2__0__Impl rule__Multiplicty__Group_2__1
            {
            pushFollow(FOLLOW_rule__Multiplicty__Group_2__0__Impl_in_rule__Multiplicty__Group_2__06686);
            rule__Multiplicty__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplicty__Group_2__1_in_rule__Multiplicty__Group_2__06689);
            rule__Multiplicty__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__Group_2__0"


    // $ANTLR start "rule__Multiplicty__Group_2__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3351:1: rule__Multiplicty__Group_2__0__Impl : ( () ) ;
    public final void rule__Multiplicty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3355:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3356:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3356:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3357:1: ()
            {
             before(grammarAccess.getMultiplictyAccess().getMultiplictyAction_2_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3358:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3360:1: 
            {
            }

             after(grammarAccess.getMultiplictyAccess().getMultiplictyAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__Group_2__0__Impl"


    // $ANTLR start "rule__Multiplicty__Group_2__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3370:1: rule__Multiplicty__Group_2__1 : rule__Multiplicty__Group_2__1__Impl ;
    public final void rule__Multiplicty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3374:1: ( rule__Multiplicty__Group_2__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3375:2: rule__Multiplicty__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicty__Group_2__1__Impl_in_rule__Multiplicty__Group_2__16747);
            rule__Multiplicty__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__Group_2__1"


    // $ANTLR start "rule__Multiplicty__Group_2__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3381:1: rule__Multiplicty__Group_2__1__Impl : ( ( rule__Multiplicty__NameAssignment_2_1 ) ) ;
    public final void rule__Multiplicty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3385:1: ( ( ( rule__Multiplicty__NameAssignment_2_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3386:1: ( ( rule__Multiplicty__NameAssignment_2_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3386:1: ( ( rule__Multiplicty__NameAssignment_2_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3387:1: ( rule__Multiplicty__NameAssignment_2_1 )
            {
             before(grammarAccess.getMultiplictyAccess().getNameAssignment_2_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3388:1: ( rule__Multiplicty__NameAssignment_2_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3388:2: rule__Multiplicty__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Multiplicty__NameAssignment_2_1_in_rule__Multiplicty__Group_2__1__Impl6774);
            rule__Multiplicty__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplictyAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__Group_2__1__Impl"


    // $ANTLR start "rule__Multiplicty__Group_3__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3402:1: rule__Multiplicty__Group_3__0 : rule__Multiplicty__Group_3__0__Impl rule__Multiplicty__Group_3__1 ;
    public final void rule__Multiplicty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3406:1: ( rule__Multiplicty__Group_3__0__Impl rule__Multiplicty__Group_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3407:2: rule__Multiplicty__Group_3__0__Impl rule__Multiplicty__Group_3__1
            {
            pushFollow(FOLLOW_rule__Multiplicty__Group_3__0__Impl_in_rule__Multiplicty__Group_3__06808);
            rule__Multiplicty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplicty__Group_3__1_in_rule__Multiplicty__Group_3__06811);
            rule__Multiplicty__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__Group_3__0"


    // $ANTLR start "rule__Multiplicty__Group_3__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3414:1: rule__Multiplicty__Group_3__0__Impl : ( () ) ;
    public final void rule__Multiplicty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3418:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3419:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3419:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3420:1: ()
            {
             before(grammarAccess.getMultiplictyAccess().getMultiplictyAction_3_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3421:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3423:1: 
            {
            }

             after(grammarAccess.getMultiplictyAccess().getMultiplictyAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__Group_3__0__Impl"


    // $ANTLR start "rule__Multiplicty__Group_3__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3433:1: rule__Multiplicty__Group_3__1 : rule__Multiplicty__Group_3__1__Impl ;
    public final void rule__Multiplicty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3437:1: ( rule__Multiplicty__Group_3__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3438:2: rule__Multiplicty__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicty__Group_3__1__Impl_in_rule__Multiplicty__Group_3__16869);
            rule__Multiplicty__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__Group_3__1"


    // $ANTLR start "rule__Multiplicty__Group_3__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3444:1: rule__Multiplicty__Group_3__1__Impl : ( ( rule__Multiplicty__NameAssignment_3_1 ) ) ;
    public final void rule__Multiplicty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3448:1: ( ( ( rule__Multiplicty__NameAssignment_3_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3449:1: ( ( rule__Multiplicty__NameAssignment_3_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3449:1: ( ( rule__Multiplicty__NameAssignment_3_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3450:1: ( rule__Multiplicty__NameAssignment_3_1 )
            {
             before(grammarAccess.getMultiplictyAccess().getNameAssignment_3_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3451:1: ( rule__Multiplicty__NameAssignment_3_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3451:2: rule__Multiplicty__NameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Multiplicty__NameAssignment_3_1_in_rule__Multiplicty__Group_3__1__Impl6896);
            rule__Multiplicty__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplictyAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__Group_3__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3465:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3469:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3470:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__06930);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__06933);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3477:1: rule__Field__Group__0__Impl : ( 'Field' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3481:1: ( ( 'Field' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3482:1: ( 'Field' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3482:1: ( 'Field' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3483:1: 'Field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Field__Group__0__Impl6961); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3496:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3500:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3501:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__16992);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__16995);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3508:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3512:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3513:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3513:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3514:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3515:1: ( rule__Field__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3515:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl7022);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3525:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3529:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3530:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__27052);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__27055);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3537:1: rule__Field__Group__2__Impl : ( ':' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3541:1: ( ( ':' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3542:1: ( ':' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3542:1: ( ':' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3543:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Field__Group__2__Impl7083); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3556:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3560:1: ( rule__Field__Group__3__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3561:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__37114);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3567:1: rule__Field__Group__3__Impl : ( ( rule__Field__LiteralAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3571:1: ( ( ( rule__Field__LiteralAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3572:1: ( ( rule__Field__LiteralAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3572:1: ( ( rule__Field__LiteralAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3573:1: ( rule__Field__LiteralAssignment_3 )
            {
             before(grammarAccess.getFieldAccess().getLiteralAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3574:1: ( rule__Field__LiteralAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3574:2: rule__Field__LiteralAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__LiteralAssignment_3_in_rule__Field__Group__3__Impl7141);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3592:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3596:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3597:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__07179);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__07182);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3604:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3608:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3609:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3609:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3610:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3611:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3613:1: 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3623:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3627:1: ( rule__Literal__Group_0__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3628:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__17240);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3634:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__NameAssignment_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3638:1: ( ( ( rule__Literal__NameAssignment_0_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3639:1: ( ( rule__Literal__NameAssignment_0_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3639:1: ( ( rule__Literal__NameAssignment_0_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3640:1: ( rule__Literal__NameAssignment_0_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_0_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3641:1: ( rule__Literal__NameAssignment_0_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3641:2: rule__Literal__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_0_1_in_rule__Literal__Group_0__1__Impl7267);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3655:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3659:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3660:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__07301);
            rule__Literal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__07304);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3667:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3671:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3672:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3672:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3673:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3674:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3676:1: 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3686:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3690:1: ( rule__Literal__Group_1__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3691:2: rule__Literal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__17362);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3697:1: rule__Literal__Group_1__1__Impl : ( ( rule__Literal__NameAssignment_1_1 ) ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3701:1: ( ( ( rule__Literal__NameAssignment_1_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3702:1: ( ( rule__Literal__NameAssignment_1_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3702:1: ( ( rule__Literal__NameAssignment_1_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3703:1: ( rule__Literal__NameAssignment_1_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_1_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3704:1: ( rule__Literal__NameAssignment_1_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3704:2: rule__Literal__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_1_1_in_rule__Literal__Group_1__1__Impl7389);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3718:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3722:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3723:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__07423);
            rule__Literal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__07426);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3730:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3734:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3735:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3735:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3736:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_2_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3737:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3739:1: 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3749:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3753:1: ( rule__Literal__Group_2__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3754:2: rule__Literal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__17484);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3760:1: rule__Literal__Group_2__1__Impl : ( ( rule__Literal__NameAssignment_2_1 ) ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3764:1: ( ( ( rule__Literal__NameAssignment_2_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3765:1: ( ( rule__Literal__NameAssignment_2_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3765:1: ( ( rule__Literal__NameAssignment_2_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3766:1: ( rule__Literal__NameAssignment_2_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_2_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3767:1: ( rule__Literal__NameAssignment_2_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3767:2: rule__Literal__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_2_1_in_rule__Literal__Group_2__1__Impl7511);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3781:1: rule__Literal__Group_3__0 : rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1 ;
    public final void rule__Literal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3785:1: ( rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3786:2: rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_3__0__Impl_in_rule__Literal__Group_3__07545);
            rule__Literal__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_3__1_in_rule__Literal__Group_3__07548);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3793:1: rule__Literal__Group_3__0__Impl : ( () ) ;
    public final void rule__Literal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3797:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3798:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3798:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3799:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_3_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3800:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3802:1: 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3812:1: rule__Literal__Group_3__1 : rule__Literal__Group_3__1__Impl ;
    public final void rule__Literal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3816:1: ( rule__Literal__Group_3__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3817:2: rule__Literal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_3__1__Impl_in_rule__Literal__Group_3__17606);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3823:1: rule__Literal__Group_3__1__Impl : ( ( rule__Literal__NameAssignment_3_1 ) ) ;
    public final void rule__Literal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3827:1: ( ( ( rule__Literal__NameAssignment_3_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3828:1: ( ( rule__Literal__NameAssignment_3_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3828:1: ( ( rule__Literal__NameAssignment_3_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3829:1: ( rule__Literal__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_3_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3830:1: ( rule__Literal__NameAssignment_3_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3830:2: rule__Literal__NameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_3_1_in_rule__Literal__Group_3__1__Impl7633);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3844:1: rule__Literal__Group_4__0 : rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 ;
    public final void rule__Literal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3848:1: ( rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3849:2: rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__07667);
            rule__Literal__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__07670);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3856:1: rule__Literal__Group_4__0__Impl : ( () ) ;
    public final void rule__Literal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3860:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3861:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3861:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3862:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_4_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3863:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3865:1: 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3875:1: rule__Literal__Group_4__1 : rule__Literal__Group_4__1__Impl ;
    public final void rule__Literal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3879:1: ( rule__Literal__Group_4__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3880:2: rule__Literal__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__17728);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3886:1: rule__Literal__Group_4__1__Impl : ( ( rule__Literal__NameAssignment_4_1 ) ) ;
    public final void rule__Literal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3890:1: ( ( ( rule__Literal__NameAssignment_4_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3891:1: ( ( rule__Literal__NameAssignment_4_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3891:1: ( ( rule__Literal__NameAssignment_4_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3892:1: ( rule__Literal__NameAssignment_4_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_4_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3893:1: ( rule__Literal__NameAssignment_4_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3893:2: rule__Literal__NameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_4_1_in_rule__Literal__Group_4__1__Impl7755);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3907:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3911:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3912:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__07789);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__07792);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3919:1: rule__Enum__Group__0__Impl : ( 'Enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3923:1: ( ( 'Enum' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3924:1: ( 'Enum' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3924:1: ( 'Enum' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3925:1: 'Enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Enum__Group__0__Impl7820); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3938:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3942:1: ( rule__Enum__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3943:2: rule__Enum__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__17851);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3949:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__TypeAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3953:1: ( ( ( rule__Enum__TypeAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3954:1: ( ( rule__Enum__TypeAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3954:1: ( ( rule__Enum__TypeAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3955:1: ( rule__Enum__TypeAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getTypeAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3956:1: ( rule__Enum__TypeAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3956:2: rule__Enum__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__TypeAssignment_1_in_rule__Enum__Group__1__Impl7878);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3971:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3975:1: ( ( ruleElement ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3976:1: ( ruleElement )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3976:1: ( ruleElement )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3977:1: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Model__ElementsAssignment7917);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3986:1: rule__Flow__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Flow__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3990:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3991:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3991:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3992:1: ruleImport
            {
             before(grammarAccess.getFlowAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Flow__ImportsAssignment_07948);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4001:1: rule__Flow__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Flow__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4005:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4006:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4006:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4007:1: RULE_ID
            {
             before(grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Flow__NameAssignment_27979); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4016:1: rule__Flow__ActivitiesAssignment_4 : ( ruleActivity ) ;
    public final void rule__Flow__ActivitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4020:1: ( ( ruleActivity ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4021:1: ( ruleActivity )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4021:1: ( ruleActivity )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4022:1: ruleActivity
            {
             before(grammarAccess.getFlowAccess().getActivitiesActivityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleActivity_in_rule__Flow__ActivitiesAssignment_48010);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4031:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4035:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4036:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4036:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4037:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_18041); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4046:1: rule__Activity__SucessorsAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__SucessorsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4050:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4051:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4051:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4052:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_2_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4053:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4054:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getSucessorsActivityIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__SucessorsAssignment_3_28076); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4065:1: rule__Activity__SucessorsAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__SucessorsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4069:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4070:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4070:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4071:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_3_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4072:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4073:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getSucessorsActivityIDTerminalRuleCall_3_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__SucessorsAssignment_3_3_18115); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4084:1: rule__Activity__BusinessRuleAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void rule__Activity__BusinessRuleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4088:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4089:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4089:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4090:1: ( ruleFQN )
            {
             before(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleCrossReference_4_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4091:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4092:1: ruleFQN
            {
             before(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleFQNParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Activity__BusinessRuleAssignment_4_18154);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4103:1: rule__Activity__DescriptionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Activity__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4107:1: ( ( RULE_STRING ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4108:1: ( RULE_STRING )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4108:1: ( RULE_STRING )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4109:1: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__DescriptionAssignment_68189); 
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


    // $ANTLR start "rule__BusinessRule__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4118:1: rule__BusinessRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BusinessRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4122:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4123:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4123:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4124:1: RULE_ID
            {
             before(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessRule__NameAssignment_18220); 
             after(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__NameAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4133:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleFqnWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4137:1: ( ( ruleFqnWithWildCard ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4138:1: ( ruleFqnWithWildCard )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4138:1: ( ruleFqnWithWildCard )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4139:1: ruleFqnWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_rule__Import__ImportedNamespaceAssignment_18251);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4148:1: rule__Diagram__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Diagram__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4152:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4153:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4153:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4154:1: ruleImport
            {
             before(grammarAccess.getDiagramAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Diagram__ImportsAssignment_08282);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4163:1: rule__Diagram__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Diagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4167:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4168:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4168:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4169:1: RULE_ID
            {
             before(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Diagram__NameAssignment_28313); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4178:1: rule__Diagram__IncludesAssignment_4 : ( ruleInclude ) ;
    public final void rule__Diagram__IncludesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4182:1: ( ( ruleInclude ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4183:1: ( ruleInclude )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4183:1: ( ruleInclude )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4184:1: ruleInclude
            {
             before(grammarAccess.getDiagramAccess().getIncludesIncludeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInclude_in_rule__Diagram__IncludesAssignment_48344);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4193:1: rule__Include__IncludeAssignment_0 : ( ( rule__Include__IncludeAlternatives_0_0 ) ) ;
    public final void rule__Include__IncludeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4197:1: ( ( ( rule__Include__IncludeAlternatives_0_0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4198:1: ( ( rule__Include__IncludeAlternatives_0_0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4198:1: ( ( rule__Include__IncludeAlternatives_0_0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4199:1: ( rule__Include__IncludeAlternatives_0_0 )
            {
             before(grammarAccess.getIncludeAccess().getIncludeAlternatives_0_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4200:1: ( rule__Include__IncludeAlternatives_0_0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4200:2: rule__Include__IncludeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Include__IncludeAlternatives_0_0_in_rule__Include__IncludeAssignment_08375);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4209:1: rule__Include__EntityAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__Include__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4213:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4214:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4214:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4215:1: ( ruleFQN )
            {
             before(grammarAccess.getIncludeAccess().getEntityEntityCrossReference_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4216:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4217:1: ruleFQN
            {
             before(grammarAccess.getIncludeAccess().getEntityEntityFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Include__EntityAssignment_18412);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4228:1: rule__Include__FieldsAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Include__FieldsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4232:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4233:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4233:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4234:1: ( RULE_ID )
            {
             before(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_2_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4235:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4236:1: RULE_ID
            {
             before(grammarAccess.getIncludeAccess().getFieldsPropertyIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Include__FieldsAssignment_2_28451); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4247:1: rule__Include__FieldsAssignment_2_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Include__FieldsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4251:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4252:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4252:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4253:1: ( RULE_ID )
            {
             before(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_3_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4254:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4255:1: RULE_ID
            {
             before(grammarAccess.getIncludeAccess().getFieldsPropertyIDTerminalRuleCall_2_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Include__FieldsAssignment_2_3_18490); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4266:1: rule__EnumDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4270:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4271:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4271:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4272:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__NameAssignment_18525); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4281:1: rule__EnumDeclaration__ValuesAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4285:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4286:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4286:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4287:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getValuesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__ValuesAssignment_38556); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4296:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4300:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4301:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4301:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4302:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_18587); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4311:1: rule__Entity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4315:1: ( ( ruleProperty ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4316:1: ( ruleProperty )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4316:1: ( ruleProperty )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4317:1: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_38618);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4326:1: rule__Domain__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Domain__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4330:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4331:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4331:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4332:1: ruleImport
            {
             before(grammarAccess.getDomainAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Domain__ImportsAssignment_08649);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4341:1: rule__Domain__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4345:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4346:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4346:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4347:1: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_28680); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4356:1: rule__Domain__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Domain__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4360:1: ( ( RULE_STRING ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4361:1: ( RULE_STRING )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4361:1: ( RULE_STRING )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4362:1: RULE_STRING
            {
             before(grammarAccess.getDomainAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Domain__DescriptionAssignment_48711); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4371:1: rule__Domain__EntitiesAssignment_6 : ( ruleEntity ) ;
    public final void rule__Domain__EntitiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4375:1: ( ( ruleEntity ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4376:1: ( ruleEntity )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4376:1: ( ruleEntity )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4377:1: ruleEntity
            {
             before(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Domain__EntitiesAssignment_68742);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4386:1: rule__Association__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Association__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4390:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4391:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4391:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4392:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__NameAssignment_18773); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4401:1: rule__Association__TypeAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Association__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4405:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4406:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4406:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4407:1: ( ruleFQN )
            {
             before(grammarAccess.getAssociationAccess().getTypeEntityCrossReference_3_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4408:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4409:1: ruleFQN
            {
             before(grammarAccess.getAssociationAccess().getTypeEntityFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Association__TypeAssignment_38808);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4420:1: rule__Association__MultiplicityAssignment_4 : ( ruleMultiplicty ) ;
    public final void rule__Association__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4424:1: ( ( ruleMultiplicty ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4425:1: ( ruleMultiplicty )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4425:1: ( ruleMultiplicty )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4426:1: ruleMultiplicty
            {
             before(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMultiplicty_in_rule__Association__MultiplicityAssignment_48843);
            ruleMultiplicty();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyParserRuleCall_4_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Multiplicty__NameAssignment_0_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4435:1: rule__Multiplicty__NameAssignment_0_1 : ( ( '1..N' ) ) ;
    public final void rule__Multiplicty__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4439:1: ( ( ( '1..N' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4440:1: ( ( '1..N' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4440:1: ( ( '1..N' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4441:1: ( '1..N' )
            {
             before(grammarAccess.getMultiplictyAccess().getName1NKeyword_0_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4442:1: ( '1..N' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4443:1: '1..N'
            {
             before(grammarAccess.getMultiplictyAccess().getName1NKeyword_0_1_0()); 
            match(input,37,FOLLOW_37_in_rule__Multiplicty__NameAssignment_0_18879); 
             after(grammarAccess.getMultiplictyAccess().getName1NKeyword_0_1_0()); 

            }

             after(grammarAccess.getMultiplictyAccess().getName1NKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__NameAssignment_0_1"


    // $ANTLR start "rule__Multiplicty__NameAssignment_1_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4458:1: rule__Multiplicty__NameAssignment_1_1 : ( ( '0..N' ) ) ;
    public final void rule__Multiplicty__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4462:1: ( ( ( '0..N' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4463:1: ( ( '0..N' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4463:1: ( ( '0..N' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4464:1: ( '0..N' )
            {
             before(grammarAccess.getMultiplictyAccess().getName0NKeyword_1_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4465:1: ( '0..N' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4466:1: '0..N'
            {
             before(grammarAccess.getMultiplictyAccess().getName0NKeyword_1_1_0()); 
            match(input,38,FOLLOW_38_in_rule__Multiplicty__NameAssignment_1_18923); 
             after(grammarAccess.getMultiplictyAccess().getName0NKeyword_1_1_0()); 

            }

             after(grammarAccess.getMultiplictyAccess().getName0NKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__NameAssignment_1_1"


    // $ANTLR start "rule__Multiplicty__NameAssignment_2_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4481:1: rule__Multiplicty__NameAssignment_2_1 : ( ( '1' ) ) ;
    public final void rule__Multiplicty__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4485:1: ( ( ( '1' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4486:1: ( ( '1' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4486:1: ( ( '1' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4487:1: ( '1' )
            {
             before(grammarAccess.getMultiplictyAccess().getName1Keyword_2_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4488:1: ( '1' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4489:1: '1'
            {
             before(grammarAccess.getMultiplictyAccess().getName1Keyword_2_1_0()); 
            match(input,39,FOLLOW_39_in_rule__Multiplicty__NameAssignment_2_18967); 
             after(grammarAccess.getMultiplictyAccess().getName1Keyword_2_1_0()); 

            }

             after(grammarAccess.getMultiplictyAccess().getName1Keyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__NameAssignment_2_1"


    // $ANTLR start "rule__Multiplicty__NameAssignment_3_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4504:1: rule__Multiplicty__NameAssignment_3_1 : ( ( '1..0' ) ) ;
    public final void rule__Multiplicty__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4508:1: ( ( ( '1..0' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4509:1: ( ( '1..0' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4509:1: ( ( '1..0' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4510:1: ( '1..0' )
            {
             before(grammarAccess.getMultiplictyAccess().getName10Keyword_3_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4511:1: ( '1..0' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4512:1: '1..0'
            {
             before(grammarAccess.getMultiplictyAccess().getName10Keyword_3_1_0()); 
            match(input,40,FOLLOW_40_in_rule__Multiplicty__NameAssignment_3_19011); 
             after(grammarAccess.getMultiplictyAccess().getName10Keyword_3_1_0()); 

            }

             after(grammarAccess.getMultiplictyAccess().getName10Keyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicty__NameAssignment_3_1"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4527:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4531:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4532:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4532:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4533:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_19050); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4542:1: rule__Field__LiteralAssignment_3 : ( ruleLiteral ) ;
    public final void rule__Field__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4546:1: ( ( ruleLiteral ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4547:1: ( ruleLiteral )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4547:1: ( ruleLiteral )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4548:1: ruleLiteral
            {
             before(grammarAccess.getFieldAccess().getLiteralLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__Field__LiteralAssignment_39081);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4557:1: rule__Literal__NameAssignment_0_1 : ( ( 'Decimal' ) ) ;
    public final void rule__Literal__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4561:1: ( ( ( 'Decimal' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4562:1: ( ( 'Decimal' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4562:1: ( ( 'Decimal' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4563:1: ( 'Decimal' )
            {
             before(grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4564:1: ( 'Decimal' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4565:1: 'Decimal'
            {
             before(grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0()); 
            match(input,41,FOLLOW_41_in_rule__Literal__NameAssignment_0_19117); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4580:1: rule__Literal__NameAssignment_1_1 : ( ( 'Money' ) ) ;
    public final void rule__Literal__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4584:1: ( ( ( 'Money' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4585:1: ( ( 'Money' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4585:1: ( ( 'Money' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4586:1: ( 'Money' )
            {
             before(grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4587:1: ( 'Money' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4588:1: 'Money'
            {
             before(grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0()); 
            match(input,42,FOLLOW_42_in_rule__Literal__NameAssignment_1_19161); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4603:1: rule__Literal__NameAssignment_2_1 : ( ( 'Text' ) ) ;
    public final void rule__Literal__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4607:1: ( ( ( 'Text' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4608:1: ( ( 'Text' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4608:1: ( ( 'Text' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4609:1: ( 'Text' )
            {
             before(grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4610:1: ( 'Text' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4611:1: 'Text'
            {
             before(grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Literal__NameAssignment_2_19205); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4626:1: rule__Literal__NameAssignment_3_1 : ( ( 'Boolean' ) ) ;
    public final void rule__Literal__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4630:1: ( ( ( 'Boolean' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4631:1: ( ( 'Boolean' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4631:1: ( ( 'Boolean' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4632:1: ( 'Boolean' )
            {
             before(grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4633:1: ( 'Boolean' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4634:1: 'Boolean'
            {
             before(grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0()); 
            match(input,44,FOLLOW_44_in_rule__Literal__NameAssignment_3_19249); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4649:1: rule__Literal__NameAssignment_4_1 : ( ( 'Int' ) ) ;
    public final void rule__Literal__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4653:1: ( ( ( 'Int' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4654:1: ( ( 'Int' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4654:1: ( ( 'Int' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4655:1: ( 'Int' )
            {
             before(grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4656:1: ( 'Int' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4657:1: 'Int'
            {
             before(grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0()); 
            match(input,45,FOLLOW_45_in_rule__Literal__NameAssignment_4_19293); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4672:1: rule__Enum__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Enum__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4676:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4677:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4677:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4678:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumAccess().getTypeEnumDeclarationCrossReference_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4679:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4680:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getTypeEnumDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__TypeAssignment_19336); 
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
    static final String DFA1_eotS =
        "\13\uffff";
    static final String DFA1_eofS =
        "\13\uffff";
    static final String DFA1_minS =
        "\1\15\1\uffff\1\4\4\uffff\1\15\1\4\2\15";
    static final String DFA1_maxS =
        "\1\37\1\uffff\1\4\4\uffff\1\37\1\4\2\37";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\4\uffff";
    static final String DFA1_specialS =
        "\13\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\5\11\uffff\1\6\1\2\1\uffff\1\3\1\uffff\1\1\2\uffff\1\4",
            "",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\5\12\uffff\1\2\1\11\1\3\2\uffff\1\10\1\uffff\1\4",
            "\1\12",
            "\1\5\12\uffff\1\2\1\uffff\1\3\4\uffff\1\4",
            "\1\5\12\uffff\1\2\1\11\1\3\2\uffff\1\10\1\uffff\1\4"
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
            return "592:1: rule__Element__Alternatives : ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) | ( ruleFlow ) | ( ruleBusinessRule ) );";
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
    public static final BitSet FOLLOW_rule__BusinessRule__Group__0_in_ruleBusinessRule334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqnWithWildCard428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__0_in_ruleFqnWithWildCard454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagram488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__0_in_ruleDiagram514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDeclaration608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__0_in_ruleEnumDeclaration634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0_in_ruleDomain814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_in_ruleProperty874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_entryRuleMultiplicty961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicty968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Alternatives_in_ruleMultiplicty994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_rule__Element__Alternatives1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_rule__Element__Alternatives1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__Element__Alternatives1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_rule__Element__Alternatives1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_rule__Element__Alternatives1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Include__IncludeAlternatives_0_01311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Include__IncludeAlternatives_0_01331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Property__Alternatives1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__Property__Alternatives1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_0__0_in_rule__Multiplicty__Alternatives1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_1__0_in_rule__Multiplicty__Alternatives1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_2__0_in_rule__Multiplicty__Alternatives1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_3__0_in_rule__Multiplicty__Alternatives1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__0_in_rule__Literal__Alternatives1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Literal__Alternatives1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__01621 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__01624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__ImportsAssignment_0_in_rule__Flow__Group__0__Impl1651 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__11682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__11685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Flow__Group__1__Impl1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__21744 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Flow__Group__3_in_rule__Flow__Group__21747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__NameAssignment_2_in_rule__Flow__Group__2__Impl1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__3__Impl_in_rule__Flow__Group__31804 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Flow__Group__4_in_rule__Flow__Group__31807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Flow__Group__3__Impl1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__4__Impl_in_rule__Flow__Group__41866 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Flow__Group__5_in_rule__Flow__Group__41869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__ActivitiesAssignment_4_in_rule__Flow__Group__4__Impl1896 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Flow__Group__5__Impl_in_rule__Flow__Group__51927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Flow__Group__5__Impl1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__01998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__02001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Activity__Group__0__Impl2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__12060 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__12063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__22120 = new BitSet(new long[]{0x0000000000460000L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__22123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Activity__Group__2__Impl2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__32182 = new BitSet(new long[]{0x0000000000460000L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__32185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__0_in_rule__Activity__Group__3__Impl2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__42243 = new BitSet(new long[]{0x0000000000460000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__42246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__52304 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__52307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Activity__Group__5__Impl2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__62366 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__62369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DescriptionAssignment_6_in_rule__Activity__Group__6__Impl2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__72426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Activity__Group__7__Impl2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__0__Impl_in_rule__Activity__Group_3__02501 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__1_in_rule__Activity__Group_3__02504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Activity__Group_3__0__Impl2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__1__Impl_in_rule__Activity__Group_3__12563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__2_in_rule__Activity__Group_3__12566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Activity__Group_3__1__Impl2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__2__Impl_in_rule__Activity__Group_3__22625 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__3_in_rule__Activity__Group_3__22628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SucessorsAssignment_3_2_in_rule__Activity__Group_3__2__Impl2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__3__Impl_in_rule__Activity__Group_3__32685 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__4_in_rule__Activity__Group_3__32688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3_3__0_in_rule__Activity__Group_3__3__Impl2715 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__4__Impl_in_rule__Activity__Group_3__42746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Activity__Group_3__4__Impl2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3_3__0__Impl_in_rule__Activity__Group_3_3__02815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_3_3__1_in_rule__Activity__Group_3_3__02818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Activity__Group_3_3__0__Impl2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3_3__1__Impl_in_rule__Activity__Group_3_3__12877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SucessorsAssignment_3_3_1_in_rule__Activity__Group_3_3__1__Impl2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__02938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__02941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Activity__Group_4__0__Impl2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__13000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__BusinessRuleAssignment_4_1_in_rule__Activity__Group_4__1__Impl3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__0__Impl_in_rule__BusinessRule__Group__03061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__1_in_rule__BusinessRule__Group__03064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BusinessRule__Group__0__Impl3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__1__Impl_in_rule__BusinessRule__Group__13123 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__2_in_rule__BusinessRule__Group__13126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__NameAssignment_1_in_rule__BusinessRule__Group__1__Impl3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__2__Impl_in_rule__BusinessRule__Group__23183 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__3_in_rule__BusinessRule__Group__23186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BusinessRule__Group__2__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__3__Impl_in_rule__BusinessRule__Group__33245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BusinessRule__Group__3__Impl3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Import__Group__0__Impl3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__0__Impl_in_rule__FqnWithWildCard__Group__03435 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__1_in_rule__FqnWithWildCard__Group__03438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__FqnWithWildCard__Group__0__Impl3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__1__Impl_in_rule__FqnWithWildCard__Group__13494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FqnWithWildCard__Group__1__Impl3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__0__Impl_in_rule__Diagram__Group__03560 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Diagram__Group__1_in_rule__Diagram__Group__03563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__ImportsAssignment_0_in_rule__Diagram__Group__0__Impl3590 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__1__Impl_in_rule__Diagram__Group__13621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Diagram__Group__2_in_rule__Diagram__Group__13624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Diagram__Group__1__Impl3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__2__Impl_in_rule__Diagram__Group__23683 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Diagram__Group__3_in_rule__Diagram__Group__23686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__NameAssignment_2_in_rule__Diagram__Group__2__Impl3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__3__Impl_in_rule__Diagram__Group__33743 = new BitSet(new long[]{0x0000000000009800L});
    public static final BitSet FOLLOW_rule__Diagram__Group__4_in_rule__Diagram__Group__33746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Diagram__Group__3__Impl3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__4__Impl_in_rule__Diagram__Group__43805 = new BitSet(new long[]{0x0000000000009800L});
    public static final BitSet FOLLOW_rule__Diagram__Group__5_in_rule__Diagram__Group__43808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__IncludesAssignment_4_in_rule__Diagram__Group__4__Impl3835 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__Diagram__Group__5__Impl_in_rule__Diagram__Group__53866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Diagram__Group__5__Impl3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__03937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__03940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__IncludeAssignment_0_in_rule__Include__Group__0__Impl3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__13997 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__14000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__EntityAssignment_1_in_rule__Include__Group__1__Impl4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__24057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__0_in_rule__Include__Group__2__Impl4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__0__Impl_in_rule__Include__Group_2__04120 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Include__Group_2__1_in_rule__Include__Group_2__04123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Include__Group_2__0__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__1__Impl_in_rule__Include__Group_2__14182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group_2__2_in_rule__Include__Group_2__14185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Include__Group_2__1__Impl4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__2__Impl_in_rule__Include__Group_2__24244 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_rule__Include__Group_2__3_in_rule__Include__Group_2__24247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__FieldsAssignment_2_2_in_rule__Include__Group_2__2__Impl4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__3__Impl_in_rule__Include__Group_2__34304 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_rule__Include__Group_2__4_in_rule__Include__Group_2__34307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2_3__0_in_rule__Include__Group_2__3__Impl4334 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__4__Impl_in_rule__Include__Group_2__44365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Include__Group_2__4__Impl4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2_3__0__Impl_in_rule__Include__Group_2_3__04434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group_2_3__1_in_rule__Include__Group_2_3__04437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Include__Group_2_3__0__Impl4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2_3__1__Impl_in_rule__Include__Group_2_3__14496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__FieldsAssignment_2_3_1_in_rule__Include__Group_2_3__1__Impl4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__0__Impl_in_rule__EnumDeclaration__Group__04557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__1_in_rule__EnumDeclaration__Group__04560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EnumDeclaration__Group__0__Impl4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__1__Impl_in_rule__EnumDeclaration__Group__14619 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__2_in_rule__EnumDeclaration__Group__14622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__NameAssignment_1_in_rule__EnumDeclaration__Group__1__Impl4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__2__Impl_in_rule__EnumDeclaration__Group__24679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__3_in_rule__EnumDeclaration__Group__24682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EnumDeclaration__Group__2__Impl4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__3__Impl_in_rule__EnumDeclaration__Group__34741 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__4_in_rule__EnumDeclaration__Group__34744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__ValuesAssignment_3_in_rule__EnumDeclaration__Group__3__Impl4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__4__Impl_in_rule__EnumDeclaration__Group__44801 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__5_in_rule__EnumDeclaration__Group__44804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__0_in_rule__EnumDeclaration__Group__4__Impl4831 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__5__Impl_in_rule__EnumDeclaration__Group__54862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EnumDeclaration__Group__5__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__0__Impl_in_rule__EnumDeclaration__Group_4__04933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__1_in_rule__EnumDeclaration__Group_4__04936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumDeclaration__Group_4__0__Impl4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__1__Impl_in_rule__EnumDeclaration__Group_4__14995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__Group_4__1__Impl5022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__05055 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__05058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__15114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl5141 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__05176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__05179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FQN__Group_1__0__Impl5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__15238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__05298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__05301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Entity__Group__0__Impl5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__15360 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__15363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl5390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__25420 = new BitSet(new long[]{0x0000000A00008000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__25423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group__2__Impl5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__35482 = new BitSet(new long[]{0x0000000A00008000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__35485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_3_in_rule__Entity__Group__3__Impl5512 = new BitSet(new long[]{0x0000000A00000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__45543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group__4__Impl5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__05612 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__05615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ImportsAssignment_0_in_rule__Domain__Group__0__Impl5642 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__15673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__15676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Domain__Group__1__Impl5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__25735 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__25738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__35795 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__35798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Domain__Group__3__Impl5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__45857 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__45860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__DescriptionAssignment_4_in_rule__Domain__Group__4__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__55917 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__6_in_rule__Domain__Group__55920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Domain__Group__5__Impl5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__6__Impl_in_rule__Domain__Group__65979 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Domain__Group__7_in_rule__Domain__Group__65982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl6011 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl6023 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__7__Impl_in_rule__Domain__Group__76056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Domain__Group__7__Impl6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__06131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__06134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Association__Group__0__Impl6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__16193 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__16196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__NameAssignment_1_in_rule__Association__Group__1__Impl6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__26253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group__3_in_rule__Association__Group__26256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Association__Group__2__Impl6284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__36315 = new BitSet(new long[]{0x000001E000000000L});
    public static final BitSet FOLLOW_rule__Association__Group__4_in_rule__Association__Group__36318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TypeAssignment_3_in_rule__Association__Group__3__Impl6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__4__Impl_in_rule__Association__Group__46375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__MultiplicityAssignment_4_in_rule__Association__Group__4__Impl6402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_0__0__Impl_in_rule__Multiplicty__Group_0__06442 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_0__1_in_rule__Multiplicty__Group_0__06445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_0__1__Impl_in_rule__Multiplicty__Group_0__16503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__NameAssignment_0_1_in_rule__Multiplicty__Group_0__1__Impl6530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_1__0__Impl_in_rule__Multiplicty__Group_1__06564 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_1__1_in_rule__Multiplicty__Group_1__06567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_1__1__Impl_in_rule__Multiplicty__Group_1__16625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__NameAssignment_1_1_in_rule__Multiplicty__Group_1__1__Impl6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_2__0__Impl_in_rule__Multiplicty__Group_2__06686 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_2__1_in_rule__Multiplicty__Group_2__06689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_2__1__Impl_in_rule__Multiplicty__Group_2__16747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__NameAssignment_2_1_in_rule__Multiplicty__Group_2__1__Impl6774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_3__0__Impl_in_rule__Multiplicty__Group_3__06808 = new BitSet(new long[]{0x000001E000000000L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_3__1_in_rule__Multiplicty__Group_3__06811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_3__1__Impl_in_rule__Multiplicty__Group_3__16869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__NameAssignment_3_1_in_rule__Multiplicty__Group_3__1__Impl6896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__06930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__06933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Field__Group__0__Impl6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__16992 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__16995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl7022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__27052 = new BitSet(new long[]{0x00003E1000000000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__27055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Field__Group__2__Impl7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__37114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__LiteralAssignment_3_in_rule__Field__Group__3__Impl7141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__07179 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__07182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__17240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_0_1_in_rule__Literal__Group_0__1__Impl7267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__07301 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__07304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__17362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_1_1_in_rule__Literal__Group_1__1__Impl7389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__07423 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__07426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__17484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_2_1_in_rule__Literal__Group_2__1__Impl7511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__0__Impl_in_rule__Literal__Group_3__07545 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__1_in_rule__Literal__Group_3__07548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__1__Impl_in_rule__Literal__Group_3__17606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_3_1_in_rule__Literal__Group_3__1__Impl7633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__07667 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__07670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__17728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_4_1_in_rule__Literal__Group_4__1__Impl7755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__07789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__07792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Enum__Group__0__Impl7820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__17851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__TypeAssignment_1_in_rule__Enum__Group__1__Impl7878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Model__ElementsAssignment7917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Flow__ImportsAssignment_07948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Flow__NameAssignment_27979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__Flow__ActivitiesAssignment_48010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_18041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__SucessorsAssignment_3_28076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__SucessorsAssignment_3_3_18115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Activity__BusinessRuleAssignment_4_18154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__DescriptionAssignment_68189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessRule__NameAssignment_18220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_rule__Import__ImportedNamespaceAssignment_18251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Diagram__ImportsAssignment_08282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Diagram__NameAssignment_28313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__Diagram__IncludesAssignment_48344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__IncludeAlternatives_0_0_in_rule__Include__IncludeAssignment_08375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Include__EntityAssignment_18412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Include__FieldsAssignment_2_28451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Include__FieldsAssignment_2_3_18490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__NameAssignment_18525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__ValuesAssignment_38556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_18587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_38618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Domain__ImportsAssignment_08649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_28680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Domain__DescriptionAssignment_48711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Domain__EntitiesAssignment_68742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__NameAssignment_18773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Association__TypeAssignment_38808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_rule__Association__MultiplicityAssignment_48843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Multiplicty__NameAssignment_0_18879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Multiplicty__NameAssignment_1_18923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Multiplicty__NameAssignment_2_18967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Multiplicty__NameAssignment_3_19011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_19050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Field__LiteralAssignment_39081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Literal__NameAssignment_0_19117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Literal__NameAssignment_1_19161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Literal__NameAssignment_2_19205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Literal__NameAssignment_3_19249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Literal__NameAssignment_4_19293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__TypeAssignment_19336 = new BitSet(new long[]{0x0000000000000002L});

}