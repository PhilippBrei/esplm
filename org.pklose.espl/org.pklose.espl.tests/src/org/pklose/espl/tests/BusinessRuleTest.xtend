package org.pklose.espl.tests

import javax.inject.Inject
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.junit4.util.ParseHelper
import org.pklose.espl.esplm.Model
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.pklose.espl.EsplmInjectorProvider

@RunWith(XtextRunner)
@InjectWith(EsplmInjectorProvider)
class BusinessRuleTest {
	
	@Inject extension ParseHelper<Model>
	
	@Inject ValidationTestHelper validationTester
	
	@Test
	def public void parseElement () {
		
		var model = 
		'''BusinessRule calypso_neuanlage typ = SrcToBiz {
			Input [KTO {primär = J,obligatorisch = F,mehrfach =J}]
			Output [Darlehen]
		}		
		'''.parse
		
		validationTester.assertNoIssues(model);				
	}
	
}