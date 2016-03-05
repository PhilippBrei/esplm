package org.pklose.espl.tests;

import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pklose.espl.EsplmInjectorProvider;
import org.pklose.espl.esplm.Model;

@RunWith(XtextRunner.class)
@InjectWith(EsplmInjectorProvider.class)
@SuppressWarnings("all")
public class BusinessRuleTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper validationTester;
  
  @Test
  public void parseElement() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("BusinessRule calypso_neuanlage typ = SrcToBiz {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Input [KTO {primär = J,obligatorisch = F,mehrfach =J}]");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Output [Darlehen]");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}\t\t");
      _builder.newLine();
      Model model = this._parseHelper.parse(_builder);
      this.validationTester.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
