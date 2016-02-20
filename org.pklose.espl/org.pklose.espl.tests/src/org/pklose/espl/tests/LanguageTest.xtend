package org.pklose.espl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.pklose.espl.esplm.Model
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.pklose.espl.EsplmInjectorProvider
import org.pklose.espl.generator.ShowAllEntitiesGraph
import org.pklose.espl.esplm.Entity
import java.io.FileOutputStream

@RunWith(XtextRunner)
@InjectWith(EsplmInjectorProvider)
class LanguageTest {
	
	@Inject extension ParseHelper<Model>
	
	@Inject ValidationTestHelper validationTester
	
	@Test
	def public void testDomain () {
		val model = '''
		Domain Person Description: "Domain enthält alle Partner Daten" {
			
			Entity Geschaeftspartner {
				Field Name: Text
			}
			
			
			Entity Gruppe {
				Field Gruppenummer:Int
				Relation 1..N Teilnehmer:Geschaeftspartner		
			}
			
		}
		'''.parse;
		
		validationTester.assertNoIssues(model);	
		val entities = model.eAllContents.toIterable.filter(typeof(Entity))
		new ShowAllEntitiesGraph(entities).write(new FileOutputStream("resources/result.svg"))
	}
	
	@Test
	def public void testEnum () {
		val model = '''
		Enumeration Geschlecht {
			Maenlich,Weiblich
		}
		'''.parse;
		
		validationTester.assertNoIssues(model);	
	}
	
}