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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Import'", "'.*'", "'Diagram'", "'{'", "'}'", "'Include'", "'with'", "'Enumeration'", "','", "'.'", "'Entity'", "'Domain'", "'Description: '", "'Relation'", "':'", "'Field'", "'Enum'", "'1..N'", "'0..N'", "'1'", "'1..0'", "'Decimal'", "'Money'", "'Text'", "'Boolean'", "'Int'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


    // $ANTLR start "entryRuleImport"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:116:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:117:1: ( ruleImport EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:118:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport181);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport188); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:125:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:129:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:130:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:130:1: ( ( rule__Import__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:131:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:132:1: ( rule__Import__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:132:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport214);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:144:1: entryRuleFqnWithWildCard : ruleFqnWithWildCard EOF ;
    public final void entryRuleFqnWithWildCard() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:145:1: ( ruleFqnWithWildCard EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:146:1: ruleFqnWithWildCard EOF
            {
             before(grammarAccess.getFqnWithWildCardRule()); 
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard241);
            ruleFqnWithWildCard();

            state._fsp--;

             after(grammarAccess.getFqnWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqnWithWildCard248); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:153:1: ruleFqnWithWildCard : ( ( rule__FqnWithWildCard__Group__0 ) ) ;
    public final void ruleFqnWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:157:2: ( ( ( rule__FqnWithWildCard__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:158:1: ( ( rule__FqnWithWildCard__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:158:1: ( ( rule__FqnWithWildCard__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:159:1: ( rule__FqnWithWildCard__Group__0 )
            {
             before(grammarAccess.getFqnWithWildCardAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:160:1: ( rule__FqnWithWildCard__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:160:2: rule__FqnWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__0_in_ruleFqnWithWildCard274);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:172:1: entryRuleDiagram : ruleDiagram EOF ;
    public final void entryRuleDiagram() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:173:1: ( ruleDiagram EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:174:1: ruleDiagram EOF
            {
             before(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_ruleDiagram_in_entryRuleDiagram301);
            ruleDiagram();

            state._fsp--;

             after(grammarAccess.getDiagramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagram308); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:181:1: ruleDiagram : ( ( rule__Diagram__Group__0 ) ) ;
    public final void ruleDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:185:2: ( ( ( rule__Diagram__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:186:1: ( ( rule__Diagram__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:186:1: ( ( rule__Diagram__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:187:1: ( rule__Diagram__Group__0 )
            {
             before(grammarAccess.getDiagramAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:188:1: ( rule__Diagram__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:188:2: rule__Diagram__Group__0
            {
            pushFollow(FOLLOW_rule__Diagram__Group__0_in_ruleDiagram334);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:200:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:201:1: ( ruleInclude EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:202:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude361);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude368); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:209:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:213:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:214:1: ( ( rule__Include__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:214:1: ( ( rule__Include__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:215:1: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:216:1: ( rule__Include__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:216:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude394);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:228:1: entryRuleEnumDeclaration : ruleEnumDeclaration EOF ;
    public final void entryRuleEnumDeclaration() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:229:1: ( ruleEnumDeclaration EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:230:1: ruleEnumDeclaration EOF
            {
             before(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration421);
            ruleEnumDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDeclaration428); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:237:1: ruleEnumDeclaration : ( ( rule__EnumDeclaration__Group__0 ) ) ;
    public final void ruleEnumDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:241:2: ( ( ( rule__EnumDeclaration__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:242:1: ( ( rule__EnumDeclaration__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:242:1: ( ( rule__EnumDeclaration__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:243:1: ( rule__EnumDeclaration__Group__0 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:244:1: ( rule__EnumDeclaration__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:244:2: rule__EnumDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__0_in_ruleEnumDeclaration454);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:256:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:257:1: ( ruleFQN EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:258:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN481);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN488); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:265:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:269:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:270:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:270:1: ( ( rule__FQN__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:271:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:272:1: ( rule__FQN__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:272:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN514);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:284:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:285:1: ( ruleEntity EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:286:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity541);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity548); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:293:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:297:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:298:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:298:1: ( ( rule__Entity__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:299:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:300:1: ( rule__Entity__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:300:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity574);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:312:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:313:1: ( ruleDomain EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:314:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain601);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain608); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:321:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:325:2: ( ( ( rule__Domain__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:326:1: ( ( rule__Domain__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:326:1: ( ( rule__Domain__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:327:1: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:328:1: ( rule__Domain__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:328:2: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_rule__Domain__Group__0_in_ruleDomain634);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:340:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:341:1: ( ruleProperty EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:342:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty661);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty668); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:349:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:353:2: ( ( ( rule__Property__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:354:1: ( ( rule__Property__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:354:1: ( ( rule__Property__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:355:1: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:356:1: ( rule__Property__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:356:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_in_ruleProperty694);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:368:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:369:1: ( ruleAssociation EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:370:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation721);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation728); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:377:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:381:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:382:1: ( ( rule__Association__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:382:1: ( ( rule__Association__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:383:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:384:1: ( rule__Association__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:384:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_rule__Association__Group__0_in_ruleAssociation754);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:396:1: entryRuleMultiplicty : ruleMultiplicty EOF ;
    public final void entryRuleMultiplicty() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:397:1: ( ruleMultiplicty EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:398:1: ruleMultiplicty EOF
            {
             before(grammarAccess.getMultiplictyRule()); 
            pushFollow(FOLLOW_ruleMultiplicty_in_entryRuleMultiplicty781);
            ruleMultiplicty();

            state._fsp--;

             after(grammarAccess.getMultiplictyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicty788); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:405:1: ruleMultiplicty : ( ( rule__Multiplicty__Alternatives ) ) ;
    public final void ruleMultiplicty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:409:2: ( ( ( rule__Multiplicty__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:410:1: ( ( rule__Multiplicty__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:410:1: ( ( rule__Multiplicty__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:411:1: ( rule__Multiplicty__Alternatives )
            {
             before(grammarAccess.getMultiplictyAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:412:1: ( rule__Multiplicty__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:412:2: rule__Multiplicty__Alternatives
            {
            pushFollow(FOLLOW_rule__Multiplicty__Alternatives_in_ruleMultiplicty814);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:424:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:425:1: ( ruleField EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:426:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField841);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField848); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:433:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:437:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:438:1: ( ( rule__Field__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:438:1: ( ( rule__Field__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:439:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:440:1: ( rule__Field__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:440:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField874);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:452:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:453:1: ( ruleLiteral EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:454:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral901);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral908); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:461:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:465:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:466:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:466:1: ( ( rule__Literal__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:467:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:468:1: ( rule__Literal__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:468:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral934);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:480:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:481:1: ( ruleEnum EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:482:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum961);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum968); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:489:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:493:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:494:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:494:1: ( ( rule__Enum__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:495:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:496:1: ( rule__Enum__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:496:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum994);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:508:1: rule__Element__Alternatives : ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:512:1: ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:513:1: ( ruleEnumDeclaration )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:513:1: ( ruleEnumDeclaration )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:514:1: ruleEnumDeclaration
                    {
                     before(grammarAccess.getElementAccess().getEnumDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEnumDeclaration_in_rule__Element__Alternatives1030);
                    ruleEnumDeclaration();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getEnumDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:519:6: ( ruleDiagram )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:519:6: ( ruleDiagram )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:520:1: ruleDiagram
                    {
                     before(grammarAccess.getElementAccess().getDiagramParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDiagram_in_rule__Element__Alternatives1047);
                    ruleDiagram();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDiagramParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:525:6: ( ruleDomain )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:525:6: ( ruleDomain )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:526:1: ruleDomain
                    {
                     before(grammarAccess.getElementAccess().getDomainParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDomain_in_rule__Element__Alternatives1064);
                    ruleDomain();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDomainParserRuleCall_2()); 

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


    // $ANTLR start "rule__Property__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:536:1: rule__Property__Alternatives : ( ( ruleField ) | ( ruleAssociation ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:540:1: ( ( ruleField ) | ( ruleAssociation ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:541:1: ( ruleField )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:541:1: ( ruleField )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:542:1: ruleField
                    {
                     before(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleField_in_rule__Property__Alternatives1096);
                    ruleField();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:547:6: ( ruleAssociation )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:547:6: ( ruleAssociation )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:548:1: ruleAssociation
                    {
                     before(grammarAccess.getPropertyAccess().getAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAssociation_in_rule__Property__Alternatives1113);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:558:1: rule__Multiplicty__Alternatives : ( ( ( rule__Multiplicty__Group_0__0 ) ) | ( ( rule__Multiplicty__Group_1__0 ) ) | ( ( rule__Multiplicty__Group_2__0 ) ) | ( ( rule__Multiplicty__Group_3__0 ) ) );
    public final void rule__Multiplicty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:562:1: ( ( ( rule__Multiplicty__Group_0__0 ) ) | ( ( rule__Multiplicty__Group_1__0 ) ) | ( ( rule__Multiplicty__Group_2__0 ) ) | ( ( rule__Multiplicty__Group_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 30:
                {
                alt3=3;
                }
                break;
            case 31:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:563:1: ( ( rule__Multiplicty__Group_0__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:563:1: ( ( rule__Multiplicty__Group_0__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:564:1: ( rule__Multiplicty__Group_0__0 )
                    {
                     before(grammarAccess.getMultiplictyAccess().getGroup_0()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:565:1: ( rule__Multiplicty__Group_0__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:565:2: rule__Multiplicty__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplicty__Group_0__0_in_rule__Multiplicty__Alternatives1145);
                    rule__Multiplicty__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplictyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:569:6: ( ( rule__Multiplicty__Group_1__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:569:6: ( ( rule__Multiplicty__Group_1__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:570:1: ( rule__Multiplicty__Group_1__0 )
                    {
                     before(grammarAccess.getMultiplictyAccess().getGroup_1()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:571:1: ( rule__Multiplicty__Group_1__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:571:2: rule__Multiplicty__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplicty__Group_1__0_in_rule__Multiplicty__Alternatives1163);
                    rule__Multiplicty__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplictyAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:575:6: ( ( rule__Multiplicty__Group_2__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:575:6: ( ( rule__Multiplicty__Group_2__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:576:1: ( rule__Multiplicty__Group_2__0 )
                    {
                     before(grammarAccess.getMultiplictyAccess().getGroup_2()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:577:1: ( rule__Multiplicty__Group_2__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:577:2: rule__Multiplicty__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Multiplicty__Group_2__0_in_rule__Multiplicty__Alternatives1181);
                    rule__Multiplicty__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplictyAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:581:6: ( ( rule__Multiplicty__Group_3__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:581:6: ( ( rule__Multiplicty__Group_3__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:582:1: ( rule__Multiplicty__Group_3__0 )
                    {
                     before(grammarAccess.getMultiplictyAccess().getGroup_3()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:583:1: ( rule__Multiplicty__Group_3__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:583:2: rule__Multiplicty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Multiplicty__Group_3__0_in_rule__Multiplicty__Alternatives1199);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:592:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__Group_3__0 ) ) | ( ( rule__Literal__Group_4__0 ) ) | ( ruleEnum ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:596:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__Group_3__0 ) ) | ( ( rule__Literal__Group_4__0 ) ) | ( ruleEnum ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt4=1;
                }
                break;
            case 33:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            case 35:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            case 27:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:597:1: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:597:1: ( ( rule__Literal__Group_0__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:598:1: ( rule__Literal__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:599:1: ( rule__Literal__Group_0__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:599:2: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives1232);
                    rule__Literal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:603:6: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:603:6: ( ( rule__Literal__Group_1__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:604:1: ( rule__Literal__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:605:1: ( rule__Literal__Group_1__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:605:2: rule__Literal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives1250);
                    rule__Literal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:609:6: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:609:6: ( ( rule__Literal__Group_2__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:610:1: ( rule__Literal__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:611:1: ( rule__Literal__Group_2__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:611:2: rule__Literal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives1268);
                    rule__Literal__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:615:6: ( ( rule__Literal__Group_3__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:615:6: ( ( rule__Literal__Group_3__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:616:1: ( rule__Literal__Group_3__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_3()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:617:1: ( rule__Literal__Group_3__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:617:2: rule__Literal__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_3__0_in_rule__Literal__Alternatives1286);
                    rule__Literal__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:621:6: ( ( rule__Literal__Group_4__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:621:6: ( ( rule__Literal__Group_4__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:622:1: ( rule__Literal__Group_4__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_4()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:623:1: ( rule__Literal__Group_4__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:623:2: rule__Literal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives1304);
                    rule__Literal__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:627:6: ( ruleEnum )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:627:6: ( ruleEnum )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:628:1: ruleEnum
                    {
                     before(grammarAccess.getLiteralAccess().getEnumParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleEnum_in_rule__Literal__Alternatives1322);
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


    // $ANTLR start "rule__Import__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:640:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:644:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:645:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01352);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01355);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:652:1: rule__Import__Group__0__Impl : ( 'Import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:656:1: ( ( 'Import' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:657:1: ( 'Import' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:657:1: ( 'Import' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:658:1: 'Import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Import__Group__0__Impl1383); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:671:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:675:1: ( rule__Import__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:676:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11414);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:682:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:686:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:687:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:687:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:688:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:689:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:689:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1441);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:703:1: rule__FqnWithWildCard__Group__0 : rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 ;
    public final void rule__FqnWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:707:1: ( rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:708:2: rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__0__Impl_in_rule__FqnWithWildCard__Group__01475);
            rule__FqnWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__1_in_rule__FqnWithWildCard__Group__01478);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:715:1: rule__FqnWithWildCard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FqnWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:719:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:720:1: ( ruleFQN )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:720:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:721:1: ruleFQN
            {
             before(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__FqnWithWildCard__Group__0__Impl1505);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:732:1: rule__FqnWithWildCard__Group__1 : rule__FqnWithWildCard__Group__1__Impl ;
    public final void rule__FqnWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:736:1: ( rule__FqnWithWildCard__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:737:2: rule__FqnWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__1__Impl_in_rule__FqnWithWildCard__Group__11534);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:743:1: rule__FqnWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FqnWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:747:1: ( ( ( '.*' )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:748:1: ( ( '.*' )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:748:1: ( ( '.*' )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:749:1: ( '.*' )?
            {
             before(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:750:1: ( '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:751:2: '.*'
                    {
                    match(input,12,FOLLOW_12_in_rule__FqnWithWildCard__Group__1__Impl1563); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:766:1: rule__Diagram__Group__0 : rule__Diagram__Group__0__Impl rule__Diagram__Group__1 ;
    public final void rule__Diagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:770:1: ( rule__Diagram__Group__0__Impl rule__Diagram__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:771:2: rule__Diagram__Group__0__Impl rule__Diagram__Group__1
            {
            pushFollow(FOLLOW_rule__Diagram__Group__0__Impl_in_rule__Diagram__Group__01600);
            rule__Diagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__1_in_rule__Diagram__Group__01603);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:778:1: rule__Diagram__Group__0__Impl : ( ( rule__Diagram__ImportsAssignment_0 )* ) ;
    public final void rule__Diagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:782:1: ( ( ( rule__Diagram__ImportsAssignment_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:783:1: ( ( rule__Diagram__ImportsAssignment_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:783:1: ( ( rule__Diagram__ImportsAssignment_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:784:1: ( rule__Diagram__ImportsAssignment_0 )*
            {
             before(grammarAccess.getDiagramAccess().getImportsAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:785:1: ( rule__Diagram__ImportsAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:785:2: rule__Diagram__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Diagram__ImportsAssignment_0_in_rule__Diagram__Group__0__Impl1630);
            	    rule__Diagram__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:795:1: rule__Diagram__Group__1 : rule__Diagram__Group__1__Impl rule__Diagram__Group__2 ;
    public final void rule__Diagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:799:1: ( rule__Diagram__Group__1__Impl rule__Diagram__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:800:2: rule__Diagram__Group__1__Impl rule__Diagram__Group__2
            {
            pushFollow(FOLLOW_rule__Diagram__Group__1__Impl_in_rule__Diagram__Group__11661);
            rule__Diagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__2_in_rule__Diagram__Group__11664);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:807:1: rule__Diagram__Group__1__Impl : ( 'Diagram' ) ;
    public final void rule__Diagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:811:1: ( ( 'Diagram' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:812:1: ( 'Diagram' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:812:1: ( 'Diagram' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:813:1: 'Diagram'
            {
             before(grammarAccess.getDiagramAccess().getDiagramKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Diagram__Group__1__Impl1692); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:826:1: rule__Diagram__Group__2 : rule__Diagram__Group__2__Impl rule__Diagram__Group__3 ;
    public final void rule__Diagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:830:1: ( rule__Diagram__Group__2__Impl rule__Diagram__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:831:2: rule__Diagram__Group__2__Impl rule__Diagram__Group__3
            {
            pushFollow(FOLLOW_rule__Diagram__Group__2__Impl_in_rule__Diagram__Group__21723);
            rule__Diagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__3_in_rule__Diagram__Group__21726);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:838:1: rule__Diagram__Group__2__Impl : ( ( rule__Diagram__NameAssignment_2 ) ) ;
    public final void rule__Diagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:842:1: ( ( ( rule__Diagram__NameAssignment_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:843:1: ( ( rule__Diagram__NameAssignment_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:843:1: ( ( rule__Diagram__NameAssignment_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:844:1: ( rule__Diagram__NameAssignment_2 )
            {
             before(grammarAccess.getDiagramAccess().getNameAssignment_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:845:1: ( rule__Diagram__NameAssignment_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:845:2: rule__Diagram__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Diagram__NameAssignment_2_in_rule__Diagram__Group__2__Impl1753);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:855:1: rule__Diagram__Group__3 : rule__Diagram__Group__3__Impl rule__Diagram__Group__4 ;
    public final void rule__Diagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:859:1: ( rule__Diagram__Group__3__Impl rule__Diagram__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:860:2: rule__Diagram__Group__3__Impl rule__Diagram__Group__4
            {
            pushFollow(FOLLOW_rule__Diagram__Group__3__Impl_in_rule__Diagram__Group__31783);
            rule__Diagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__4_in_rule__Diagram__Group__31786);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:867:1: rule__Diagram__Group__3__Impl : ( '{' ) ;
    public final void rule__Diagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:871:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:872:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:872:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:873:1: '{'
            {
             before(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Diagram__Group__3__Impl1814); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:886:1: rule__Diagram__Group__4 : rule__Diagram__Group__4__Impl rule__Diagram__Group__5 ;
    public final void rule__Diagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:890:1: ( rule__Diagram__Group__4__Impl rule__Diagram__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:891:2: rule__Diagram__Group__4__Impl rule__Diagram__Group__5
            {
            pushFollow(FOLLOW_rule__Diagram__Group__4__Impl_in_rule__Diagram__Group__41845);
            rule__Diagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__5_in_rule__Diagram__Group__41848);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:898:1: rule__Diagram__Group__4__Impl : ( ( rule__Diagram__IncludesAssignment_4 )* ) ;
    public final void rule__Diagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:902:1: ( ( ( rule__Diagram__IncludesAssignment_4 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:903:1: ( ( rule__Diagram__IncludesAssignment_4 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:903:1: ( ( rule__Diagram__IncludesAssignment_4 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:904:1: ( rule__Diagram__IncludesAssignment_4 )*
            {
             before(grammarAccess.getDiagramAccess().getIncludesAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:905:1: ( rule__Diagram__IncludesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:905:2: rule__Diagram__IncludesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Diagram__IncludesAssignment_4_in_rule__Diagram__Group__4__Impl1875);
            	    rule__Diagram__IncludesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:915:1: rule__Diagram__Group__5 : rule__Diagram__Group__5__Impl ;
    public final void rule__Diagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:919:1: ( rule__Diagram__Group__5__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:920:2: rule__Diagram__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Diagram__Group__5__Impl_in_rule__Diagram__Group__51906);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:926:1: rule__Diagram__Group__5__Impl : ( '}' ) ;
    public final void rule__Diagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:930:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:931:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:931:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:932:1: '}'
            {
             before(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Diagram__Group__5__Impl1934); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:957:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:961:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:962:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__01977);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__01980);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:969:1: rule__Include__Group__0__Impl : ( 'Include' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:973:1: ( ( 'Include' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:974:1: ( 'Include' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:974:1: ( 'Include' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:975:1: 'Include'
            {
             before(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Include__Group__0__Impl2008); 
             after(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 

            }


            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:988:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:992:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:993:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__12039);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__12042);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1000:1: rule__Include__Group__1__Impl : ( ( rule__Include__EntityAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1004:1: ( ( ( rule__Include__EntityAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1005:1: ( ( rule__Include__EntityAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1005:1: ( ( rule__Include__EntityAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1006:1: ( rule__Include__EntityAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getEntityAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1007:1: ( rule__Include__EntityAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1007:2: rule__Include__EntityAssignment_1
            {
            pushFollow(FOLLOW_rule__Include__EntityAssignment_1_in_rule__Include__Group__1__Impl2069);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1017:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1021:1: ( rule__Include__Group__2__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1022:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__22099);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1028:1: rule__Include__Group__2__Impl : ( ( rule__Include__Group_2__0 )? ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1032:1: ( ( ( rule__Include__Group_2__0 )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1033:1: ( ( rule__Include__Group_2__0 )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1033:1: ( ( rule__Include__Group_2__0 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1034:1: ( rule__Include__Group_2__0 )?
            {
             before(grammarAccess.getIncludeAccess().getGroup_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1035:1: ( rule__Include__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1035:2: rule__Include__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Include__Group_2__0_in_rule__Include__Group__2__Impl2126);
                    rule__Include__Group_2__0();

                    state._fsp--;


                    }
                    break;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1051:1: rule__Include__Group_2__0 : rule__Include__Group_2__0__Impl rule__Include__Group_2__1 ;
    public final void rule__Include__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1055:1: ( rule__Include__Group_2__0__Impl rule__Include__Group_2__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1056:2: rule__Include__Group_2__0__Impl rule__Include__Group_2__1
            {
            pushFollow(FOLLOW_rule__Include__Group_2__0__Impl_in_rule__Include__Group_2__02163);
            rule__Include__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__1_in_rule__Include__Group_2__02166);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1063:1: rule__Include__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__Include__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1067:1: ( ( 'with' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1068:1: ( 'with' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1068:1: ( 'with' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1069:1: 'with'
            {
             before(grammarAccess.getIncludeAccess().getWithKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Include__Group_2__0__Impl2194); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1082:1: rule__Include__Group_2__1 : rule__Include__Group_2__1__Impl rule__Include__Group_2__2 ;
    public final void rule__Include__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1086:1: ( rule__Include__Group_2__1__Impl rule__Include__Group_2__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1087:2: rule__Include__Group_2__1__Impl rule__Include__Group_2__2
            {
            pushFollow(FOLLOW_rule__Include__Group_2__1__Impl_in_rule__Include__Group_2__12225);
            rule__Include__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__2_in_rule__Include__Group_2__12228);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1094:1: rule__Include__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Include__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1098:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1099:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1099:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1100:1: '{'
            {
             before(grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,14,FOLLOW_14_in_rule__Include__Group_2__1__Impl2256); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1113:1: rule__Include__Group_2__2 : rule__Include__Group_2__2__Impl rule__Include__Group_2__3 ;
    public final void rule__Include__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1117:1: ( rule__Include__Group_2__2__Impl rule__Include__Group_2__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1118:2: rule__Include__Group_2__2__Impl rule__Include__Group_2__3
            {
            pushFollow(FOLLOW_rule__Include__Group_2__2__Impl_in_rule__Include__Group_2__22287);
            rule__Include__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__3_in_rule__Include__Group_2__22290);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1125:1: rule__Include__Group_2__2__Impl : ( ( rule__Include__FieldsAssignment_2_2 )* ) ;
    public final void rule__Include__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1129:1: ( ( ( rule__Include__FieldsAssignment_2_2 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1130:1: ( ( rule__Include__FieldsAssignment_2_2 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1130:1: ( ( rule__Include__FieldsAssignment_2_2 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1131:1: ( rule__Include__FieldsAssignment_2_2 )*
            {
             before(grammarAccess.getIncludeAccess().getFieldsAssignment_2_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1132:1: ( rule__Include__FieldsAssignment_2_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1132:2: rule__Include__FieldsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__Include__FieldsAssignment_2_2_in_rule__Include__Group_2__2__Impl2317);
            	    rule__Include__FieldsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1142:1: rule__Include__Group_2__3 : rule__Include__Group_2__3__Impl ;
    public final void rule__Include__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1146:1: ( rule__Include__Group_2__3__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1147:2: rule__Include__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group_2__3__Impl_in_rule__Include__Group_2__32348);
            rule__Include__Group_2__3__Impl();

            state._fsp--;


            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1153:1: rule__Include__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Include__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1157:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1158:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1158:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1159:1: '}'
            {
             before(grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,15,FOLLOW_15_in_rule__Include__Group_2__3__Impl2376); 
             after(grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__EnumDeclaration__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1180:1: rule__EnumDeclaration__Group__0 : rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 ;
    public final void rule__EnumDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1184:1: ( rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1185:2: rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__0__Impl_in_rule__EnumDeclaration__Group__02415);
            rule__EnumDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__1_in_rule__EnumDeclaration__Group__02418);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1192:1: rule__EnumDeclaration__Group__0__Impl : ( 'Enumeration' ) ;
    public final void rule__EnumDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1196:1: ( ( 'Enumeration' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1197:1: ( 'Enumeration' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1197:1: ( 'Enumeration' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1198:1: 'Enumeration'
            {
             before(grammarAccess.getEnumDeclarationAccess().getEnumerationKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__EnumDeclaration__Group__0__Impl2446); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1211:1: rule__EnumDeclaration__Group__1 : rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 ;
    public final void rule__EnumDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1215:1: ( rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1216:2: rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__1__Impl_in_rule__EnumDeclaration__Group__12477);
            rule__EnumDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__2_in_rule__EnumDeclaration__Group__12480);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1223:1: rule__EnumDeclaration__Group__1__Impl : ( ( rule__EnumDeclaration__NameAssignment_1 ) ) ;
    public final void rule__EnumDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1227:1: ( ( ( rule__EnumDeclaration__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1228:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1228:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1229:1: ( rule__EnumDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1230:1: ( rule__EnumDeclaration__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1230:2: rule__EnumDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__NameAssignment_1_in_rule__EnumDeclaration__Group__1__Impl2507);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1240:1: rule__EnumDeclaration__Group__2 : rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 ;
    public final void rule__EnumDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1244:1: ( rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1245:2: rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__2__Impl_in_rule__EnumDeclaration__Group__22537);
            rule__EnumDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__3_in_rule__EnumDeclaration__Group__22540);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1252:1: rule__EnumDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1256:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1257:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1257:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1258:1: '{'
            {
             before(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__EnumDeclaration__Group__2__Impl2568); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1271:1: rule__EnumDeclaration__Group__3 : rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 ;
    public final void rule__EnumDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1275:1: ( rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1276:2: rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__3__Impl_in_rule__EnumDeclaration__Group__32599);
            rule__EnumDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__4_in_rule__EnumDeclaration__Group__32602);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1283:1: rule__EnumDeclaration__Group__3__Impl : ( ( rule__EnumDeclaration__ValuesAssignment_3 ) ) ;
    public final void rule__EnumDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1287:1: ( ( ( rule__EnumDeclaration__ValuesAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1288:1: ( ( rule__EnumDeclaration__ValuesAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1288:1: ( ( rule__EnumDeclaration__ValuesAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1289:1: ( rule__EnumDeclaration__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getValuesAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1290:1: ( rule__EnumDeclaration__ValuesAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1290:2: rule__EnumDeclaration__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__ValuesAssignment_3_in_rule__EnumDeclaration__Group__3__Impl2629);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1300:1: rule__EnumDeclaration__Group__4 : rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5 ;
    public final void rule__EnumDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1304:1: ( rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1305:2: rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__4__Impl_in_rule__EnumDeclaration__Group__42659);
            rule__EnumDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__5_in_rule__EnumDeclaration__Group__42662);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1312:1: rule__EnumDeclaration__Group__4__Impl : ( ( rule__EnumDeclaration__Group_4__0 )* ) ;
    public final void rule__EnumDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1316:1: ( ( ( rule__EnumDeclaration__Group_4__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1317:1: ( ( rule__EnumDeclaration__Group_4__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1317:1: ( ( rule__EnumDeclaration__Group_4__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1318:1: ( rule__EnumDeclaration__Group_4__0 )*
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1319:1: ( rule__EnumDeclaration__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1319:2: rule__EnumDeclaration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__0_in_rule__EnumDeclaration__Group__4__Impl2689);
            	    rule__EnumDeclaration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1329:1: rule__EnumDeclaration__Group__5 : rule__EnumDeclaration__Group__5__Impl ;
    public final void rule__EnumDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1333:1: ( rule__EnumDeclaration__Group__5__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1334:2: rule__EnumDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__5__Impl_in_rule__EnumDeclaration__Group__52720);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1340:1: rule__EnumDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__EnumDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1344:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1345:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1345:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1346:1: '}'
            {
             before(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__EnumDeclaration__Group__5__Impl2748); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1371:1: rule__EnumDeclaration__Group_4__0 : rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1 ;
    public final void rule__EnumDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1375:1: ( rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1376:2: rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__0__Impl_in_rule__EnumDeclaration__Group_4__02791);
            rule__EnumDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__1_in_rule__EnumDeclaration__Group_4__02794);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1383:1: rule__EnumDeclaration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1387:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1388:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1388:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1389:1: ','
            {
             before(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__EnumDeclaration__Group_4__0__Impl2822); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1402:1: rule__EnumDeclaration__Group_4__1 : rule__EnumDeclaration__Group_4__1__Impl ;
    public final void rule__EnumDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1406:1: ( rule__EnumDeclaration__Group_4__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1407:2: rule__EnumDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__1__Impl_in_rule__EnumDeclaration__Group_4__12853);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1413:1: rule__EnumDeclaration__Group_4__1__Impl : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1417:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1418:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1418:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1419:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getIDTerminalRuleCall_4_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__Group_4__1__Impl2880); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1434:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1438:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1439:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02913);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02916);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1446:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1450:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1451:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1451:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1452:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2943); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1463:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1467:1: ( rule__FQN__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1468:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12972);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1474:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1478:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1479:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1479:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1480:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1481:1: ( rule__FQN__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1481:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2999);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1495:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1499:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1500:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__03034);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__03037);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1507:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1511:1: ( ( '.' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1512:1: ( '.' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1512:1: ( '.' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1513:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__FQN__Group_1__0__Impl3065); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1526:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1530:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1531:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__13096);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1537:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1541:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1542:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1542:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1543:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl3123); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1558:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1562:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1563:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03156);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03159);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1570:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1574:1: ( ( 'Entity' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1575:1: ( 'Entity' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1575:1: ( 'Entity' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1576:1: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group__0__Impl3187); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1589:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1593:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1594:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13218);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13221);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1601:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1605:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1606:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1606:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1607:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1608:1: ( rule__Entity__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1608:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3248);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1618:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1622:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1623:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23278);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23281);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1630:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1634:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1635:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1635:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1636:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group__2__Impl3309); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1649:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1653:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1654:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33340);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33343);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1661:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__PropertiesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1665:1: ( ( ( rule__Entity__PropertiesAssignment_3 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1666:1: ( ( rule__Entity__PropertiesAssignment_3 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1666:1: ( ( rule__Entity__PropertiesAssignment_3 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1667:1: ( rule__Entity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1668:1: ( rule__Entity__PropertiesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24||LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1668:2: rule__Entity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_3_in_rule__Entity__Group__3__Impl3370);
            	    rule__Entity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1678:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1682:1: ( rule__Entity__Group__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1683:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43401);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1689:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1693:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1694:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1694:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1695:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group__4__Impl3429); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1718:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1722:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1723:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__03470);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__03473);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1730:1: rule__Domain__Group__0__Impl : ( ( rule__Domain__ImportsAssignment_0 )* ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1734:1: ( ( ( rule__Domain__ImportsAssignment_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1735:1: ( ( rule__Domain__ImportsAssignment_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1735:1: ( ( rule__Domain__ImportsAssignment_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1736:1: ( rule__Domain__ImportsAssignment_0 )*
            {
             before(grammarAccess.getDomainAccess().getImportsAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1737:1: ( rule__Domain__ImportsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==11) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1737:2: rule__Domain__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Domain__ImportsAssignment_0_in_rule__Domain__Group__0__Impl3500);
            	    rule__Domain__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1747:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1751:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1752:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__13531);
            rule__Domain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__13534);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1759:1: rule__Domain__Group__1__Impl : ( 'Domain' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1763:1: ( ( 'Domain' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1764:1: ( 'Domain' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1764:1: ( 'Domain' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1765:1: 'Domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Domain__Group__1__Impl3562); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1778:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1782:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1783:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__23593);
            rule__Domain__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__23596);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1790:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__NameAssignment_2 ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1794:1: ( ( ( rule__Domain__NameAssignment_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1795:1: ( ( rule__Domain__NameAssignment_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1795:1: ( ( rule__Domain__NameAssignment_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1796:1: ( rule__Domain__NameAssignment_2 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1797:1: ( rule__Domain__NameAssignment_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1797:2: rule__Domain__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl3623);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1807:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1811:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1812:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__33653);
            rule__Domain__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__33656);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1819:1: rule__Domain__Group__3__Impl : ( 'Description: ' ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1823:1: ( ( 'Description: ' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1824:1: ( 'Description: ' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1824:1: ( 'Description: ' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1825:1: 'Description: '
            {
             before(grammarAccess.getDomainAccess().getDescriptionKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Domain__Group__3__Impl3684); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1838:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1842:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1843:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__43715);
            rule__Domain__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__43718);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1850:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__DescriptionAssignment_4 ) ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1854:1: ( ( ( rule__Domain__DescriptionAssignment_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1855:1: ( ( rule__Domain__DescriptionAssignment_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1855:1: ( ( rule__Domain__DescriptionAssignment_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1856:1: ( rule__Domain__DescriptionAssignment_4 )
            {
             before(grammarAccess.getDomainAccess().getDescriptionAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1857:1: ( rule__Domain__DescriptionAssignment_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1857:2: rule__Domain__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_rule__Domain__DescriptionAssignment_4_in_rule__Domain__Group__4__Impl3745);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1867:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl rule__Domain__Group__6 ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1871:1: ( rule__Domain__Group__5__Impl rule__Domain__Group__6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1872:2: rule__Domain__Group__5__Impl rule__Domain__Group__6
            {
            pushFollow(FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__53775);
            rule__Domain__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__6_in_rule__Domain__Group__53778);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1879:1: rule__Domain__Group__5__Impl : ( '{' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1883:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1884:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1884:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1885:1: '{'
            {
             before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Domain__Group__5__Impl3806); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1898:1: rule__Domain__Group__6 : rule__Domain__Group__6__Impl rule__Domain__Group__7 ;
    public final void rule__Domain__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1902:1: ( rule__Domain__Group__6__Impl rule__Domain__Group__7 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1903:2: rule__Domain__Group__6__Impl rule__Domain__Group__7
            {
            pushFollow(FOLLOW_rule__Domain__Group__6__Impl_in_rule__Domain__Group__63837);
            rule__Domain__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__7_in_rule__Domain__Group__63840);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1910:1: rule__Domain__Group__6__Impl : ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) ) ;
    public final void rule__Domain__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1914:1: ( ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1915:1: ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1915:1: ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1916:1: ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1916:1: ( ( rule__Domain__EntitiesAssignment_6 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1917:1: ( rule__Domain__EntitiesAssignment_6 )
            {
             before(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1918:1: ( rule__Domain__EntitiesAssignment_6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1918:2: rule__Domain__EntitiesAssignment_6
            {
            pushFollow(FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl3869);
            rule__Domain__EntitiesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 

            }

            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1921:1: ( ( rule__Domain__EntitiesAssignment_6 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1922:1: ( rule__Domain__EntitiesAssignment_6 )*
            {
             before(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1923:1: ( rule__Domain__EntitiesAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1923:2: rule__Domain__EntitiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl3881);
            	    rule__Domain__EntitiesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1934:1: rule__Domain__Group__7 : rule__Domain__Group__7__Impl ;
    public final void rule__Domain__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1938:1: ( rule__Domain__Group__7__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1939:2: rule__Domain__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group__7__Impl_in_rule__Domain__Group__73914);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1945:1: rule__Domain__Group__7__Impl : ( '}' ) ;
    public final void rule__Domain__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1949:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1950:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1950:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1951:1: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__Domain__Group__7__Impl3942); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1980:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1984:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1985:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__03989);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__03992);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1992:1: rule__Association__Group__0__Impl : ( 'Relation' ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1996:1: ( ( 'Relation' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1997:1: ( 'Relation' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1997:1: ( 'Relation' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1998:1: 'Relation'
            {
             before(grammarAccess.getAssociationAccess().getRelationKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Association__Group__0__Impl4020); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2011:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2015:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2016:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__14051);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__14054);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2023:1: rule__Association__Group__1__Impl : ( ( rule__Association__NameAssignment_1 ) ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2027:1: ( ( ( rule__Association__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2028:1: ( ( rule__Association__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2028:1: ( ( rule__Association__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2029:1: ( rule__Association__NameAssignment_1 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2030:1: ( rule__Association__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2030:2: rule__Association__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Association__NameAssignment_1_in_rule__Association__Group__1__Impl4081);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2040:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2044:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2045:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__24111);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__3_in_rule__Association__Group__24114);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2052:1: rule__Association__Group__2__Impl : ( ':' ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2056:1: ( ( ':' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2057:1: ( ':' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2057:1: ( ':' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2058:1: ':'
            {
             before(grammarAccess.getAssociationAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Association__Group__2__Impl4142); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2071:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2075:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2076:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__34173);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__4_in_rule__Association__Group__34176);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2083:1: rule__Association__Group__3__Impl : ( ( rule__Association__TypeAssignment_3 ) ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2087:1: ( ( ( rule__Association__TypeAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2088:1: ( ( rule__Association__TypeAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2088:1: ( ( rule__Association__TypeAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2089:1: ( rule__Association__TypeAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getTypeAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2090:1: ( rule__Association__TypeAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2090:2: rule__Association__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Association__TypeAssignment_3_in_rule__Association__Group__3__Impl4203);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2100:1: rule__Association__Group__4 : rule__Association__Group__4__Impl ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2104:1: ( rule__Association__Group__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2105:2: rule__Association__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group__4__Impl_in_rule__Association__Group__44233);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2111:1: rule__Association__Group__4__Impl : ( ( rule__Association__MultiplicityAssignment_4 ) ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2115:1: ( ( ( rule__Association__MultiplicityAssignment_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2116:1: ( ( rule__Association__MultiplicityAssignment_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2116:1: ( ( rule__Association__MultiplicityAssignment_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2117:1: ( rule__Association__MultiplicityAssignment_4 )
            {
             before(grammarAccess.getAssociationAccess().getMultiplicityAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2118:1: ( rule__Association__MultiplicityAssignment_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2118:2: rule__Association__MultiplicityAssignment_4
            {
            pushFollow(FOLLOW_rule__Association__MultiplicityAssignment_4_in_rule__Association__Group__4__Impl4260);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2138:1: rule__Multiplicty__Group_0__0 : rule__Multiplicty__Group_0__0__Impl rule__Multiplicty__Group_0__1 ;
    public final void rule__Multiplicty__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2142:1: ( rule__Multiplicty__Group_0__0__Impl rule__Multiplicty__Group_0__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2143:2: rule__Multiplicty__Group_0__0__Impl rule__Multiplicty__Group_0__1
            {
            pushFollow(FOLLOW_rule__Multiplicty__Group_0__0__Impl_in_rule__Multiplicty__Group_0__04300);
            rule__Multiplicty__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplicty__Group_0__1_in_rule__Multiplicty__Group_0__04303);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2150:1: rule__Multiplicty__Group_0__0__Impl : ( () ) ;
    public final void rule__Multiplicty__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2154:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2155:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2155:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2156:1: ()
            {
             before(grammarAccess.getMultiplictyAccess().getMultiplictyAction_0_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2157:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2159:1: 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2169:1: rule__Multiplicty__Group_0__1 : rule__Multiplicty__Group_0__1__Impl ;
    public final void rule__Multiplicty__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2173:1: ( rule__Multiplicty__Group_0__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2174:2: rule__Multiplicty__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicty__Group_0__1__Impl_in_rule__Multiplicty__Group_0__14361);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2180:1: rule__Multiplicty__Group_0__1__Impl : ( ( rule__Multiplicty__NameAssignment_0_1 ) ) ;
    public final void rule__Multiplicty__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2184:1: ( ( ( rule__Multiplicty__NameAssignment_0_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2185:1: ( ( rule__Multiplicty__NameAssignment_0_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2185:1: ( ( rule__Multiplicty__NameAssignment_0_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2186:1: ( rule__Multiplicty__NameAssignment_0_1 )
            {
             before(grammarAccess.getMultiplictyAccess().getNameAssignment_0_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2187:1: ( rule__Multiplicty__NameAssignment_0_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2187:2: rule__Multiplicty__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Multiplicty__NameAssignment_0_1_in_rule__Multiplicty__Group_0__1__Impl4388);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2201:1: rule__Multiplicty__Group_1__0 : rule__Multiplicty__Group_1__0__Impl rule__Multiplicty__Group_1__1 ;
    public final void rule__Multiplicty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2205:1: ( rule__Multiplicty__Group_1__0__Impl rule__Multiplicty__Group_1__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2206:2: rule__Multiplicty__Group_1__0__Impl rule__Multiplicty__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplicty__Group_1__0__Impl_in_rule__Multiplicty__Group_1__04422);
            rule__Multiplicty__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplicty__Group_1__1_in_rule__Multiplicty__Group_1__04425);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2213:1: rule__Multiplicty__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplicty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2217:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2218:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2218:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2219:1: ()
            {
             before(grammarAccess.getMultiplictyAccess().getMultiplictyAction_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2220:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2222:1: 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2232:1: rule__Multiplicty__Group_1__1 : rule__Multiplicty__Group_1__1__Impl ;
    public final void rule__Multiplicty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2236:1: ( rule__Multiplicty__Group_1__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2237:2: rule__Multiplicty__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicty__Group_1__1__Impl_in_rule__Multiplicty__Group_1__14483);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2243:1: rule__Multiplicty__Group_1__1__Impl : ( ( rule__Multiplicty__NameAssignment_1_1 ) ) ;
    public final void rule__Multiplicty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2247:1: ( ( ( rule__Multiplicty__NameAssignment_1_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2248:1: ( ( rule__Multiplicty__NameAssignment_1_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2248:1: ( ( rule__Multiplicty__NameAssignment_1_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2249:1: ( rule__Multiplicty__NameAssignment_1_1 )
            {
             before(grammarAccess.getMultiplictyAccess().getNameAssignment_1_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2250:1: ( rule__Multiplicty__NameAssignment_1_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2250:2: rule__Multiplicty__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplicty__NameAssignment_1_1_in_rule__Multiplicty__Group_1__1__Impl4510);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2264:1: rule__Multiplicty__Group_2__0 : rule__Multiplicty__Group_2__0__Impl rule__Multiplicty__Group_2__1 ;
    public final void rule__Multiplicty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2268:1: ( rule__Multiplicty__Group_2__0__Impl rule__Multiplicty__Group_2__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2269:2: rule__Multiplicty__Group_2__0__Impl rule__Multiplicty__Group_2__1
            {
            pushFollow(FOLLOW_rule__Multiplicty__Group_2__0__Impl_in_rule__Multiplicty__Group_2__04544);
            rule__Multiplicty__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplicty__Group_2__1_in_rule__Multiplicty__Group_2__04547);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2276:1: rule__Multiplicty__Group_2__0__Impl : ( () ) ;
    public final void rule__Multiplicty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2280:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2281:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2281:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2282:1: ()
            {
             before(grammarAccess.getMultiplictyAccess().getMultiplictyAction_2_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2283:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2285:1: 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2295:1: rule__Multiplicty__Group_2__1 : rule__Multiplicty__Group_2__1__Impl ;
    public final void rule__Multiplicty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2299:1: ( rule__Multiplicty__Group_2__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2300:2: rule__Multiplicty__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicty__Group_2__1__Impl_in_rule__Multiplicty__Group_2__14605);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2306:1: rule__Multiplicty__Group_2__1__Impl : ( ( rule__Multiplicty__NameAssignment_2_1 ) ) ;
    public final void rule__Multiplicty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2310:1: ( ( ( rule__Multiplicty__NameAssignment_2_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2311:1: ( ( rule__Multiplicty__NameAssignment_2_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2311:1: ( ( rule__Multiplicty__NameAssignment_2_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2312:1: ( rule__Multiplicty__NameAssignment_2_1 )
            {
             before(grammarAccess.getMultiplictyAccess().getNameAssignment_2_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2313:1: ( rule__Multiplicty__NameAssignment_2_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2313:2: rule__Multiplicty__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Multiplicty__NameAssignment_2_1_in_rule__Multiplicty__Group_2__1__Impl4632);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2327:1: rule__Multiplicty__Group_3__0 : rule__Multiplicty__Group_3__0__Impl rule__Multiplicty__Group_3__1 ;
    public final void rule__Multiplicty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2331:1: ( rule__Multiplicty__Group_3__0__Impl rule__Multiplicty__Group_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2332:2: rule__Multiplicty__Group_3__0__Impl rule__Multiplicty__Group_3__1
            {
            pushFollow(FOLLOW_rule__Multiplicty__Group_3__0__Impl_in_rule__Multiplicty__Group_3__04666);
            rule__Multiplicty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplicty__Group_3__1_in_rule__Multiplicty__Group_3__04669);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2339:1: rule__Multiplicty__Group_3__0__Impl : ( () ) ;
    public final void rule__Multiplicty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2343:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2344:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2344:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2345:1: ()
            {
             before(grammarAccess.getMultiplictyAccess().getMultiplictyAction_3_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2346:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2348:1: 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2358:1: rule__Multiplicty__Group_3__1 : rule__Multiplicty__Group_3__1__Impl ;
    public final void rule__Multiplicty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2362:1: ( rule__Multiplicty__Group_3__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2363:2: rule__Multiplicty__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicty__Group_3__1__Impl_in_rule__Multiplicty__Group_3__14727);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2369:1: rule__Multiplicty__Group_3__1__Impl : ( ( rule__Multiplicty__NameAssignment_3_1 ) ) ;
    public final void rule__Multiplicty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2373:1: ( ( ( rule__Multiplicty__NameAssignment_3_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2374:1: ( ( rule__Multiplicty__NameAssignment_3_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2374:1: ( ( rule__Multiplicty__NameAssignment_3_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2375:1: ( rule__Multiplicty__NameAssignment_3_1 )
            {
             before(grammarAccess.getMultiplictyAccess().getNameAssignment_3_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2376:1: ( rule__Multiplicty__NameAssignment_3_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2376:2: rule__Multiplicty__NameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Multiplicty__NameAssignment_3_1_in_rule__Multiplicty__Group_3__1__Impl4754);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2390:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2394:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2395:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__04788);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__04791);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2402:1: rule__Field__Group__0__Impl : ( 'Field' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2406:1: ( ( 'Field' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2407:1: ( 'Field' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2407:1: ( 'Field' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2408:1: 'Field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Field__Group__0__Impl4819); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2421:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2425:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2426:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__14850);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__14853);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2433:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2437:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2438:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2438:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2439:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2440:1: ( rule__Field__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2440:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl4880);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2450:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2454:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2455:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__24910);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__24913);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2462:1: rule__Field__Group__2__Impl : ( ':' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2466:1: ( ( ':' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2467:1: ( ':' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2467:1: ( ':' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2468:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Field__Group__2__Impl4941); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2481:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2485:1: ( rule__Field__Group__3__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2486:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__34972);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2492:1: rule__Field__Group__3__Impl : ( ( rule__Field__LiteralAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2496:1: ( ( ( rule__Field__LiteralAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2497:1: ( ( rule__Field__LiteralAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2497:1: ( ( rule__Field__LiteralAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2498:1: ( rule__Field__LiteralAssignment_3 )
            {
             before(grammarAccess.getFieldAccess().getLiteralAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2499:1: ( rule__Field__LiteralAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2499:2: rule__Field__LiteralAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__LiteralAssignment_3_in_rule__Field__Group__3__Impl4999);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2517:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2521:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2522:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__05037);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__05040);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2529:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2533:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2534:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2534:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2535:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2536:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2538:1: 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2548:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2552:1: ( rule__Literal__Group_0__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2553:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__15098);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2559:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__NameAssignment_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2563:1: ( ( ( rule__Literal__NameAssignment_0_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2564:1: ( ( rule__Literal__NameAssignment_0_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2564:1: ( ( rule__Literal__NameAssignment_0_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2565:1: ( rule__Literal__NameAssignment_0_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_0_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2566:1: ( rule__Literal__NameAssignment_0_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2566:2: rule__Literal__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_0_1_in_rule__Literal__Group_0__1__Impl5125);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2580:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2584:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2585:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__05159);
            rule__Literal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__05162);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2592:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2596:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2597:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2597:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2598:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2599:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2601:1: 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2611:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2615:1: ( rule__Literal__Group_1__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2616:2: rule__Literal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__15220);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2622:1: rule__Literal__Group_1__1__Impl : ( ( rule__Literal__NameAssignment_1_1 ) ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2626:1: ( ( ( rule__Literal__NameAssignment_1_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2627:1: ( ( rule__Literal__NameAssignment_1_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2627:1: ( ( rule__Literal__NameAssignment_1_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2628:1: ( rule__Literal__NameAssignment_1_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_1_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2629:1: ( rule__Literal__NameAssignment_1_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2629:2: rule__Literal__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_1_1_in_rule__Literal__Group_1__1__Impl5247);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2643:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2647:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2648:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__05281);
            rule__Literal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__05284);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2655:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2659:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2660:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2660:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2661:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_2_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2662:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2664:1: 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2674:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2678:1: ( rule__Literal__Group_2__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2679:2: rule__Literal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__15342);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2685:1: rule__Literal__Group_2__1__Impl : ( ( rule__Literal__NameAssignment_2_1 ) ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2689:1: ( ( ( rule__Literal__NameAssignment_2_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2690:1: ( ( rule__Literal__NameAssignment_2_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2690:1: ( ( rule__Literal__NameAssignment_2_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2691:1: ( rule__Literal__NameAssignment_2_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_2_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2692:1: ( rule__Literal__NameAssignment_2_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2692:2: rule__Literal__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_2_1_in_rule__Literal__Group_2__1__Impl5369);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2706:1: rule__Literal__Group_3__0 : rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1 ;
    public final void rule__Literal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2710:1: ( rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2711:2: rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_3__0__Impl_in_rule__Literal__Group_3__05403);
            rule__Literal__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_3__1_in_rule__Literal__Group_3__05406);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2718:1: rule__Literal__Group_3__0__Impl : ( () ) ;
    public final void rule__Literal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2722:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2723:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2723:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2724:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_3_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2725:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2727:1: 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2737:1: rule__Literal__Group_3__1 : rule__Literal__Group_3__1__Impl ;
    public final void rule__Literal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2741:1: ( rule__Literal__Group_3__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2742:2: rule__Literal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_3__1__Impl_in_rule__Literal__Group_3__15464);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2748:1: rule__Literal__Group_3__1__Impl : ( ( rule__Literal__NameAssignment_3_1 ) ) ;
    public final void rule__Literal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2752:1: ( ( ( rule__Literal__NameAssignment_3_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2753:1: ( ( rule__Literal__NameAssignment_3_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2753:1: ( ( rule__Literal__NameAssignment_3_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2754:1: ( rule__Literal__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_3_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2755:1: ( rule__Literal__NameAssignment_3_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2755:2: rule__Literal__NameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_3_1_in_rule__Literal__Group_3__1__Impl5491);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2769:1: rule__Literal__Group_4__0 : rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 ;
    public final void rule__Literal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2773:1: ( rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2774:2: rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__05525);
            rule__Literal__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__05528);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2781:1: rule__Literal__Group_4__0__Impl : ( () ) ;
    public final void rule__Literal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2785:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2786:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2786:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2787:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_4_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2788:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2790:1: 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2800:1: rule__Literal__Group_4__1 : rule__Literal__Group_4__1__Impl ;
    public final void rule__Literal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2804:1: ( rule__Literal__Group_4__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2805:2: rule__Literal__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__15586);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2811:1: rule__Literal__Group_4__1__Impl : ( ( rule__Literal__NameAssignment_4_1 ) ) ;
    public final void rule__Literal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2815:1: ( ( ( rule__Literal__NameAssignment_4_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2816:1: ( ( rule__Literal__NameAssignment_4_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2816:1: ( ( rule__Literal__NameAssignment_4_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2817:1: ( rule__Literal__NameAssignment_4_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_4_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2818:1: ( rule__Literal__NameAssignment_4_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2818:2: rule__Literal__NameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_4_1_in_rule__Literal__Group_4__1__Impl5613);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2832:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2836:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2837:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__05647);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__05650);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2844:1: rule__Enum__Group__0__Impl : ( 'Enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2848:1: ( ( 'Enum' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2849:1: ( 'Enum' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2849:1: ( 'Enum' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2850:1: 'Enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Enum__Group__0__Impl5678); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2863:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2867:1: ( rule__Enum__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2868:2: rule__Enum__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__15709);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2874:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__TypeAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2878:1: ( ( ( rule__Enum__TypeAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2879:1: ( ( rule__Enum__TypeAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2879:1: ( ( rule__Enum__TypeAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2880:1: ( rule__Enum__TypeAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getTypeAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2881:1: ( rule__Enum__TypeAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2881:2: rule__Enum__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__TypeAssignment_1_in_rule__Enum__Group__1__Impl5736);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2896:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2900:1: ( ( ruleElement ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2901:1: ( ruleElement )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2901:1: ( ruleElement )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2902:1: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Model__ElementsAssignment5775);
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


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2911:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleFqnWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2915:1: ( ( ruleFqnWithWildCard ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2916:1: ( ruleFqnWithWildCard )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2916:1: ( ruleFqnWithWildCard )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2917:1: ruleFqnWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_rule__Import__ImportedNamespaceAssignment_15806);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2926:1: rule__Diagram__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Diagram__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2930:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2931:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2931:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2932:1: ruleImport
            {
             before(grammarAccess.getDiagramAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Diagram__ImportsAssignment_05837);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2941:1: rule__Diagram__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Diagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2945:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2946:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2946:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2947:1: RULE_ID
            {
             before(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Diagram__NameAssignment_25868); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2956:1: rule__Diagram__IncludesAssignment_4 : ( ruleInclude ) ;
    public final void rule__Diagram__IncludesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2960:1: ( ( ruleInclude ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2961:1: ( ruleInclude )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2961:1: ( ruleInclude )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2962:1: ruleInclude
            {
             before(grammarAccess.getDiagramAccess().getIncludesIncludeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInclude_in_rule__Diagram__IncludesAssignment_45899);
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


    // $ANTLR start "rule__Include__EntityAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2971:1: rule__Include__EntityAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__Include__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2975:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2976:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2976:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2977:1: ( ruleFQN )
            {
             before(grammarAccess.getIncludeAccess().getEntityEntityCrossReference_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2978:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2979:1: ruleFQN
            {
             before(grammarAccess.getIncludeAccess().getEntityEntityFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Include__EntityAssignment_15934);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2990:1: rule__Include__FieldsAssignment_2_2 : ( ( ruleFQN ) ) ;
    public final void rule__Include__FieldsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2994:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2995:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2995:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2996:1: ( ruleFQN )
            {
             before(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_2_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2997:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2998:1: ruleFQN
            {
             before(grammarAccess.getIncludeAccess().getFieldsPropertyFQNParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Include__FieldsAssignment_2_25973);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getIncludeAccess().getFieldsPropertyFQNParserRuleCall_2_2_0_1()); 

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


    // $ANTLR start "rule__EnumDeclaration__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3009:1: rule__EnumDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3013:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3014:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3014:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3015:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__NameAssignment_16008); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3024:1: rule__EnumDeclaration__ValuesAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3028:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3029:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3029:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3030:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getValuesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__ValuesAssignment_36039); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3039:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3043:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3044:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3044:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3045:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_16070); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3054:1: rule__Entity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3058:1: ( ( ruleProperty ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3059:1: ( ruleProperty )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3059:1: ( ruleProperty )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3060:1: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_36101);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3069:1: rule__Domain__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Domain__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3073:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3074:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3074:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3075:1: ruleImport
            {
             before(grammarAccess.getDomainAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Domain__ImportsAssignment_06132);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3084:1: rule__Domain__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3088:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3089:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3089:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3090:1: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_26163); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3099:1: rule__Domain__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Domain__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3103:1: ( ( RULE_STRING ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3104:1: ( RULE_STRING )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3104:1: ( RULE_STRING )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3105:1: RULE_STRING
            {
             before(grammarAccess.getDomainAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Domain__DescriptionAssignment_46194); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3114:1: rule__Domain__EntitiesAssignment_6 : ( ruleEntity ) ;
    public final void rule__Domain__EntitiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3118:1: ( ( ruleEntity ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3119:1: ( ruleEntity )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3119:1: ( ruleEntity )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3120:1: ruleEntity
            {
             before(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Domain__EntitiesAssignment_66225);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3129:1: rule__Association__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Association__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3133:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3134:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3134:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3135:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__NameAssignment_16256); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3144:1: rule__Association__TypeAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Association__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3148:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3149:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3149:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3150:1: ( ruleFQN )
            {
             before(grammarAccess.getAssociationAccess().getTypeEntityCrossReference_3_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3151:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3152:1: ruleFQN
            {
             before(grammarAccess.getAssociationAccess().getTypeEntityFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Association__TypeAssignment_36291);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3163:1: rule__Association__MultiplicityAssignment_4 : ( ruleMultiplicty ) ;
    public final void rule__Association__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3167:1: ( ( ruleMultiplicty ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3168:1: ( ruleMultiplicty )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3168:1: ( ruleMultiplicty )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3169:1: ruleMultiplicty
            {
             before(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMultiplicty_in_rule__Association__MultiplicityAssignment_46326);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3178:1: rule__Multiplicty__NameAssignment_0_1 : ( ( '1..N' ) ) ;
    public final void rule__Multiplicty__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3182:1: ( ( ( '1..N' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3183:1: ( ( '1..N' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3183:1: ( ( '1..N' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3184:1: ( '1..N' )
            {
             before(grammarAccess.getMultiplictyAccess().getName1NKeyword_0_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3185:1: ( '1..N' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3186:1: '1..N'
            {
             before(grammarAccess.getMultiplictyAccess().getName1NKeyword_0_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Multiplicty__NameAssignment_0_16362); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3201:1: rule__Multiplicty__NameAssignment_1_1 : ( ( '0..N' ) ) ;
    public final void rule__Multiplicty__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3205:1: ( ( ( '0..N' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3206:1: ( ( '0..N' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3206:1: ( ( '0..N' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3207:1: ( '0..N' )
            {
             before(grammarAccess.getMultiplictyAccess().getName0NKeyword_1_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3208:1: ( '0..N' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3209:1: '0..N'
            {
             before(grammarAccess.getMultiplictyAccess().getName0NKeyword_1_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Multiplicty__NameAssignment_1_16406); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3224:1: rule__Multiplicty__NameAssignment_2_1 : ( ( '1' ) ) ;
    public final void rule__Multiplicty__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3228:1: ( ( ( '1' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3229:1: ( ( '1' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3229:1: ( ( '1' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3230:1: ( '1' )
            {
             before(grammarAccess.getMultiplictyAccess().getName1Keyword_2_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3231:1: ( '1' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3232:1: '1'
            {
             before(grammarAccess.getMultiplictyAccess().getName1Keyword_2_1_0()); 
            match(input,30,FOLLOW_30_in_rule__Multiplicty__NameAssignment_2_16450); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3247:1: rule__Multiplicty__NameAssignment_3_1 : ( ( '1..0' ) ) ;
    public final void rule__Multiplicty__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3251:1: ( ( ( '1..0' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3252:1: ( ( '1..0' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3252:1: ( ( '1..0' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3253:1: ( '1..0' )
            {
             before(grammarAccess.getMultiplictyAccess().getName10Keyword_3_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3254:1: ( '1..0' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3255:1: '1..0'
            {
             before(grammarAccess.getMultiplictyAccess().getName10Keyword_3_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Multiplicty__NameAssignment_3_16494); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3270:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3274:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3275:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3275:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3276:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_16533); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3285:1: rule__Field__LiteralAssignment_3 : ( ruleLiteral ) ;
    public final void rule__Field__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3289:1: ( ( ruleLiteral ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3290:1: ( ruleLiteral )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3290:1: ( ruleLiteral )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3291:1: ruleLiteral
            {
             before(grammarAccess.getFieldAccess().getLiteralLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__Field__LiteralAssignment_36564);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3300:1: rule__Literal__NameAssignment_0_1 : ( ( 'Decimal' ) ) ;
    public final void rule__Literal__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3304:1: ( ( ( 'Decimal' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3305:1: ( ( 'Decimal' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3305:1: ( ( 'Decimal' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3306:1: ( 'Decimal' )
            {
             before(grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3307:1: ( 'Decimal' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3308:1: 'Decimal'
            {
             before(grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Literal__NameAssignment_0_16600); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3323:1: rule__Literal__NameAssignment_1_1 : ( ( 'Money' ) ) ;
    public final void rule__Literal__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3327:1: ( ( ( 'Money' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3328:1: ( ( 'Money' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3328:1: ( ( 'Money' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3329:1: ( 'Money' )
            {
             before(grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3330:1: ( 'Money' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3331:1: 'Money'
            {
             before(grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Literal__NameAssignment_1_16644); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3346:1: rule__Literal__NameAssignment_2_1 : ( ( 'Text' ) ) ;
    public final void rule__Literal__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3350:1: ( ( ( 'Text' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3351:1: ( ( 'Text' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3351:1: ( ( 'Text' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3352:1: ( 'Text' )
            {
             before(grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3353:1: ( 'Text' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3354:1: 'Text'
            {
             before(grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0()); 
            match(input,34,FOLLOW_34_in_rule__Literal__NameAssignment_2_16688); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3369:1: rule__Literal__NameAssignment_3_1 : ( ( 'Boolean' ) ) ;
    public final void rule__Literal__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3373:1: ( ( ( 'Boolean' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3374:1: ( ( 'Boolean' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3374:1: ( ( 'Boolean' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3375:1: ( 'Boolean' )
            {
             before(grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3376:1: ( 'Boolean' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3377:1: 'Boolean'
            {
             before(grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Literal__NameAssignment_3_16732); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3392:1: rule__Literal__NameAssignment_4_1 : ( ( 'Int' ) ) ;
    public final void rule__Literal__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3396:1: ( ( ( 'Int' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3397:1: ( ( 'Int' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3397:1: ( ( 'Int' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3398:1: ( 'Int' )
            {
             before(grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3399:1: ( 'Int' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3400:1: 'Int'
            {
             before(grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0()); 
            match(input,36,FOLLOW_36_in_rule__Literal__NameAssignment_4_16776); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3415:1: rule__Enum__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Enum__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3419:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3420:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3420:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3421:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumAccess().getTypeEnumDeclarationCrossReference_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3422:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3423:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getTypeEnumDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__TypeAssignment_16819); 
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
        "\11\uffff";
    static final String DFA1_eofS =
        "\11\uffff";
    static final String DFA1_minS =
        "\1\13\1\uffff\1\4\2\uffff\1\13\1\4\2\13";
    static final String DFA1_maxS =
        "\1\26\1\uffff\1\4\2\uffff\1\26\1\4\2\26";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\4\uffff";
    static final String DFA1_specialS =
        "\11\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\uffff\1\3\4\uffff\1\1\3\uffff\1\4",
            "",
            "\1\5",
            "",
            "",
            "\1\2\1\7\1\3\6\uffff\1\6\1\uffff\1\4",
            "\1\10",
            "\1\2\1\uffff\1\3\10\uffff\1\4",
            "\1\2\1\7\1\3\6\uffff\1\6\1\uffff\1\4"
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
            return "508:1: rule__Element__Alternatives : ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqnWithWildCard248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__0_in_ruleFqnWithWildCard274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagram308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__0_in_ruleDiagram334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDeclaration428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__0_in_ruleEnumDeclaration454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0_in_ruleDomain634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_in_ruleProperty694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_entryRuleMultiplicty781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicty788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Alternatives_in_ruleMultiplicty814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_rule__Element__Alternatives1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_rule__Element__Alternatives1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__Element__Alternatives1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Property__Alternatives1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__Property__Alternatives1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_0__0_in_rule__Multiplicty__Alternatives1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_1__0_in_rule__Multiplicty__Alternatives1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_2__0_in_rule__Multiplicty__Alternatives1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_3__0_in_rule__Multiplicty__Alternatives1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__0_in_rule__Literal__Alternatives1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Literal__Alternatives1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Import__Group__0__Impl1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__0__Impl_in_rule__FqnWithWildCard__Group__01475 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__1_in_rule__FqnWithWildCard__Group__01478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__FqnWithWildCard__Group__0__Impl1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__1__Impl_in_rule__FqnWithWildCard__Group__11534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FqnWithWildCard__Group__1__Impl1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__0__Impl_in_rule__Diagram__Group__01600 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Diagram__Group__1_in_rule__Diagram__Group__01603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__ImportsAssignment_0_in_rule__Diagram__Group__0__Impl1630 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Diagram__Group__1__Impl_in_rule__Diagram__Group__11661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Diagram__Group__2_in_rule__Diagram__Group__11664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Diagram__Group__1__Impl1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__2__Impl_in_rule__Diagram__Group__21723 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Diagram__Group__3_in_rule__Diagram__Group__21726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__NameAssignment_2_in_rule__Diagram__Group__2__Impl1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__3__Impl_in_rule__Diagram__Group__31783 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Diagram__Group__4_in_rule__Diagram__Group__31786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Diagram__Group__3__Impl1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__4__Impl_in_rule__Diagram__Group__41845 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Diagram__Group__5_in_rule__Diagram__Group__41848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__IncludesAssignment_4_in_rule__Diagram__Group__4__Impl1875 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__5__Impl_in_rule__Diagram__Group__51906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Diagram__Group__5__Impl1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__01977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__01980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Include__Group__0__Impl2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__12039 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__12042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__EntityAssignment_1_in_rule__Include__Group__1__Impl2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__22099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__0_in_rule__Include__Group__2__Impl2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__0__Impl_in_rule__Include__Group_2__02163 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Include__Group_2__1_in_rule__Include__Group_2__02166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Include__Group_2__0__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__1__Impl_in_rule__Include__Group_2__12225 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Include__Group_2__2_in_rule__Include__Group_2__12228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Include__Group_2__1__Impl2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__2__Impl_in_rule__Include__Group_2__22287 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Include__Group_2__3_in_rule__Include__Group_2__22290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__FieldsAssignment_2_2_in_rule__Include__Group_2__2__Impl2317 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Include__Group_2__3__Impl_in_rule__Include__Group_2__32348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Include__Group_2__3__Impl2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__0__Impl_in_rule__EnumDeclaration__Group__02415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__1_in_rule__EnumDeclaration__Group__02418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EnumDeclaration__Group__0__Impl2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__1__Impl_in_rule__EnumDeclaration__Group__12477 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__2_in_rule__EnumDeclaration__Group__12480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__NameAssignment_1_in_rule__EnumDeclaration__Group__1__Impl2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__2__Impl_in_rule__EnumDeclaration__Group__22537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__3_in_rule__EnumDeclaration__Group__22540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EnumDeclaration__Group__2__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__3__Impl_in_rule__EnumDeclaration__Group__32599 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__4_in_rule__EnumDeclaration__Group__32602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__ValuesAssignment_3_in_rule__EnumDeclaration__Group__3__Impl2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__4__Impl_in_rule__EnumDeclaration__Group__42659 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__5_in_rule__EnumDeclaration__Group__42662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__0_in_rule__EnumDeclaration__Group__4__Impl2689 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__5__Impl_in_rule__EnumDeclaration__Group__52720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EnumDeclaration__Group__5__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__0__Impl_in_rule__EnumDeclaration__Group_4__02791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__1_in_rule__EnumDeclaration__Group_4__02794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumDeclaration__Group_4__0__Impl2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__1__Impl_in_rule__EnumDeclaration__Group_4__12853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__Group_4__1__Impl2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02913 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2999 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__03034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__03037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FQN__Group_1__0__Impl3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__13096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group__0__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13218 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23278 = new BitSet(new long[]{0x0000000005008000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group__2__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33340 = new BitSet(new long[]{0x0000000005008000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_3_in_rule__Entity__Group__3__Impl3370 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group__4__Impl3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__03470 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__03473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ImportsAssignment_0_in_rule__Domain__Group__0__Impl3500 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__13531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__13534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Domain__Group__1__Impl3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__23593 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__23596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__33653 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__33656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Domain__Group__3__Impl3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__43715 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__43718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__DescriptionAssignment_4_in_rule__Domain__Group__4__Impl3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__53775 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Domain__Group__6_in_rule__Domain__Group__53778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Domain__Group__5__Impl3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__6__Impl_in_rule__Domain__Group__63837 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Domain__Group__7_in_rule__Domain__Group__63840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl3869 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl3881 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Domain__Group__7__Impl_in_rule__Domain__Group__73914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Domain__Group__7__Impl3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__03989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__03992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Association__Group__0__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__14051 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__14054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__NameAssignment_1_in_rule__Association__Group__1__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__24111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group__3_in_rule__Association__Group__24114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Association__Group__2__Impl4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__34173 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_rule__Association__Group__4_in_rule__Association__Group__34176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TypeAssignment_3_in_rule__Association__Group__3__Impl4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__4__Impl_in_rule__Association__Group__44233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__MultiplicityAssignment_4_in_rule__Association__Group__4__Impl4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_0__0__Impl_in_rule__Multiplicty__Group_0__04300 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_0__1_in_rule__Multiplicty__Group_0__04303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_0__1__Impl_in_rule__Multiplicty__Group_0__14361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__NameAssignment_0_1_in_rule__Multiplicty__Group_0__1__Impl4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_1__0__Impl_in_rule__Multiplicty__Group_1__04422 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_1__1_in_rule__Multiplicty__Group_1__04425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_1__1__Impl_in_rule__Multiplicty__Group_1__14483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__NameAssignment_1_1_in_rule__Multiplicty__Group_1__1__Impl4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_2__0__Impl_in_rule__Multiplicty__Group_2__04544 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_2__1_in_rule__Multiplicty__Group_2__04547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_2__1__Impl_in_rule__Multiplicty__Group_2__14605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__NameAssignment_2_1_in_rule__Multiplicty__Group_2__1__Impl4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_3__0__Impl_in_rule__Multiplicty__Group_3__04666 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_3__1_in_rule__Multiplicty__Group_3__04669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Group_3__1__Impl_in_rule__Multiplicty__Group_3__14727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__NameAssignment_3_1_in_rule__Multiplicty__Group_3__1__Impl4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__04788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__04791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Field__Group__0__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__14850 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__14853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__24910 = new BitSet(new long[]{0x0000001F08000000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__24913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Field__Group__2__Impl4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__34972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__LiteralAssignment_3_in_rule__Field__Group__3__Impl4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__05037 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__05040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__15098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_0_1_in_rule__Literal__Group_0__1__Impl5125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__05159 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__05162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__15220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_1_1_in_rule__Literal__Group_1__1__Impl5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__05281 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__05284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__15342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_2_1_in_rule__Literal__Group_2__1__Impl5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__0__Impl_in_rule__Literal__Group_3__05403 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__1_in_rule__Literal__Group_3__05406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__1__Impl_in_rule__Literal__Group_3__15464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_3_1_in_rule__Literal__Group_3__1__Impl5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__05525 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__05528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__15586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_4_1_in_rule__Literal__Group_4__1__Impl5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__05647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__05650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Enum__Group__0__Impl5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__15709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__TypeAssignment_1_in_rule__Enum__Group__1__Impl5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Model__ElementsAssignment5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_rule__Import__ImportedNamespaceAssignment_15806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Diagram__ImportsAssignment_05837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Diagram__NameAssignment_25868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__Diagram__IncludesAssignment_45899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Include__EntityAssignment_15934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Include__FieldsAssignment_2_25973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__NameAssignment_16008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__ValuesAssignment_36039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_16070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_36101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Domain__ImportsAssignment_06132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_26163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Domain__DescriptionAssignment_46194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Domain__EntitiesAssignment_66225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__NameAssignment_16256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Association__TypeAssignment_36291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_rule__Association__MultiplicityAssignment_46326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Multiplicty__NameAssignment_0_16362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Multiplicty__NameAssignment_1_16406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Multiplicty__NameAssignment_2_16450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Multiplicty__NameAssignment_3_16494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_16533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Field__LiteralAssignment_36564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Literal__NameAssignment_0_16600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Literal__NameAssignment_1_16644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Literal__NameAssignment_2_16688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Literal__NameAssignment_3_16732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Literal__NameAssignment_4_16776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__TypeAssignment_16819 = new BitSet(new long[]{0x0000000000000002L});

}