package org.pklose.esplm.generator.reports

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.pklose.espl.EsplmInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.pklose.espl.esplm.Model
import org.junit.Before
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import com.google.inject.Provider
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Test

@RunWith(XtextRunner)
@InjectWith(EsplmInjectorProvider)
class ReportBreGeneratorImplTest {
	
	@Inject extension ParseHelper<Model>
	
	@Inject ValidationTestHelper validationTester
	
	@Inject Provider<XtextResourceSet> resourceSetProvider
	
	@Before
	def createModel () {
		var fileSystemAcces = new InMemoryFileSystemAccess();
		val resourceSet = resourceSetProvider.get;
		
		var personMode = 
		'''
		Domain Person Description: "Personen" {
			Entity Geschaeftspartner {
			Field Balance:Decimal	
			Field Name:Text																  		 			
			}
			
		'''
		parse(personMode, resourceSet);
		
		var Bre = 
		'''
		Import Person.*
		BusinessRule adasd type BizToBiz {
			Input [Person.Geschaeftspartner {primär mehrfach}]
			Output [Person.Geschaeftspartner]
		}
		'''
		val model = parse(Bre, resourceSet);
		
		validationTester.assertNoIssues(model);
	}
	
	@Test
	def void TestReport () {
		
	}
	
}