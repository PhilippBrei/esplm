package org.pklose.esplm.generator.reports;

import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pklose.espl.EsplmInjectorProvider;
import org.pklose.espl.esplm.BusinessRule;
import org.pklose.espl.esplm.Model;
import org.pklose.espl.generator.reports.bre.AbinitioBREReport;

@RunWith(XtextRunner.class)
@InjectWith(EsplmInjectorProvider.class)
@SuppressWarnings("all")
public class ReportBreGeneratorImplTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper validationTester;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  private AbinitioBREReport reportService;
  
  private BusinessRule businessRule;
  
  @Before
  public void createModel() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Domain Person Description: \"Personen\" {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Entity Geschaeftspartner {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Field Balance:Decimal\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Field Name:Text\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\t \t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      String personMode = _builder.toString();
      this._parseHelper.parse(personMode, resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Import Person.*");
      _builder_1.newLine();
      _builder_1.append("BusinessRule PersonToPerson type BizToBiz {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("Input [Person.Geschaeftspartner {primär mehrfach}]");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("Output [Person.Geschaeftspartner]");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      String bre = _builder_1.toString();
      final Model model = this._parseHelper.parse(bre, resourceSet);
      this.validationTester.assertNoIssues(model);
      TreeIterator<EObject> _eAllContents = model.eAllContents();
      Iterator<BusinessRule> _filter = Iterators.<BusinessRule>filter(_eAllContents, BusinessRule.class);
      BusinessRule _head = IteratorExtensions.<BusinessRule>head(_filter);
      this.businessRule = _head;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TestReport() {
    List<BusinessRule> _asList = Arrays.<BusinessRule>asList(this.businessRule);
    List<BusinessRule> _asList_1 = Arrays.<BusinessRule>asList(this.businessRule);
    AbinitioBREReport _abinitioBREReport = new AbinitioBREReport(_asList, _asList_1);
    this.reportService = _abinitioBREReport;
  }
}
