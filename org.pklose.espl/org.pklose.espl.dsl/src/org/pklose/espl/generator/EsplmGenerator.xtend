/*
 * generated by Xtext
 */
package org.pklose.espl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.pklose.espl.esplm.Entity
import org.pklose.espl.generator.uml.NodeFactory
import org.pklose.espl.generator.uml.DiagrammBody

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class EsplmGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {		
		val entities = resource.allContents.toIterable.filter(typeof(Entity)).toList
		val nodes = NodeFactory.createNodes(entities)
		val links = NodeFactory.createLinks(entities)		
		val diagramm = new DiagrammBody("Test", nodes ,links)
		val fileName = resource.URI.path.replace(".esplm", ".html")
		fsa.generateFile(fileName, diagramm.asHTML);
	}
	
	
}
