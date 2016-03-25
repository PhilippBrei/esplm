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
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Before;
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
  public CharSequence createModel() {
    CharSequence _xblockexpression = null;
    {
      InMemoryFileSystemAccess fileSystemAcces = new InMemoryFileSystemAccess();
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public void TestReport() {
  }
}
