package org.pklose.esplm.generator.reports

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.pklose.espl.EsplmInjectorProvider
import org.pklose.espl.esplm.BusinessRule
import org.pklose.espl.esplm.Model
import org.pklose.espl.generator.reports.bre.AbinitioBREReport
import java.util.Arrays
import org.junit.Assert
import java.io.File

@RunWith(XtextRunner)
@InjectWith(EsplmInjectorProvider)
class ReportBreGeneratorImplTest {
	
	@Inject extension ParseHelper<Model>
	
	@Inject ValidationTestHelper validationTester
	
	@Inject Provider<XtextResourceSet> resourceSetProvider
	
	var AbinitioBREReport reportService;
	
	var BusinessRule businessRule;
	
	@Before
	def void createModel () {
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
		
		var bre = 
		'''
		Import Person.*
		BusinessRule PersonToPerson type BizToBiz {
			Input [Person.Geschaeftspartner {primär mehrfach}]
			Output [Person.Geschaeftspartner]
		}
		'''
		val model = parse(bre, resourceSet);
		
		validationTester.assertNoIssues(model);
		
		businessRule = model.eAllContents.filter(typeof(BusinessRule)).head;
	}
	
	@Test
	def void TestReport () {		
		reportService = new AbinitioBREReport(Arrays.asList(businessRule), Arrays.asList(businessRule));
		var workbook = reportService.createReport(new File("myReport.xlsx"))
		Assert.assertNotNull(workbook);
		
	}
	
}