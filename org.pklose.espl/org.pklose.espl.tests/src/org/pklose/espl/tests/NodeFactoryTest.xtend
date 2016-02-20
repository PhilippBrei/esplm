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
import org.pklose.espl.generator.NodeFactory

@RunWith(XtextRunner)
@InjectWith(EsplmInjectorProvider)
class NodeFactoryTest {
	
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
		val entities = model.eAllContents.toIterable.filter(typeof(Entity));
		val nodes = NodeFactory.createNodes(entities.toList);
		Assert.assertEquals(2, nodes.size);
		Assert.assertFalse(nodes.last.asJson.isEmpty);		
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