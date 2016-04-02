package org.pklose.esplm.generator.reports;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pklose.espl.EsplmInjectorProvider;
import org.pklose.espl.esplm.Model;

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
  
  @Before
  public void createModel() {
    try {
      InMemoryFileSystemAccess fileSystemAcces = new InMemoryFileSystemAccess();
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
      _builder_1.append("BusinessRule adasd type BizToBiz {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("Input [Person.Geschaeftspartner {primär mehrfach}]");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("Output [Person.Geschaeftspartner]");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      String Bre = _builder_1.toString();
      final Model model = this._parseHelper.parse(Bre, resourceSet);
      this.validationTester.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TestReport() {
  }
}
