package org.pklose.espl.tests

import javax.inject.Inject
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.pklose.espl.esplm.Model
import org.pklose.espl.generator.Node
import org.pklose.espl.esplm.Entity
import org.pklose.espl.esplm.Field
import org.junit.Assert
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.pklose.espl.EsplmInjectorProvider

@RunWith(XtextRunner)
@InjectWith(EsplmInjectorProvider)
class EasySpecificationLanguageGeneratorTest2 {
	
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
		
		val geschaeftspartner = model.eAllContents.filter(typeof(Entity)).findFirst[it.name.equals("Geschaeftspartner")]
		val partnerFields = geschaeftspartner.properties.filter(typeof(Field));
		Assert.assertNotNull(geschaeftspartner);
		Assert.assertNotNull(partnerFields);
		Assert.assertFalse(partnerFields.isEmpty)
		val Node node = new Node(geschaeftspartner.getName, partnerFields);
		val json = node.asJson.toString.trim
		
		var expected =
		'''{
	            key: "Geschaeftspartner",
	            name: "Geschaeftspartner",
	            properties: [	            	
	            	{ name: "Name", type: "Text", visibility: "public" }                      
	            	]
            }'''.toString.trim
		Assert.assertEquals(expected, json);
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