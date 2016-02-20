package org.pklose.espl.generator

import org.pklose.espl.esplm.Entity
import java.util.List
import java.util.ArrayList
import org.pklose.espl.esplm.Field
import org.pklose.espl.esplm.Association

class NodeFactory {
	
	
	static def createNodes (List<Entity> entities) {		
		val List<Node> nodes = new ArrayList ();
		for (Entity entity : entities) {
			val fields = entity.properties.filter(typeof(Field));
			nodes.add(new Node(entity.name, fields));
		}		
		return nodes;
	}
	
	
	static def createLinks (List<Entity> entities) {
		val List<Link> links = new ArrayList();
		
		for (Entity entity : entities) {
			val linkedAssociations = entity.properties.filter(typeof(Association));
			for (Association association : linkedAssociations) {
				links.add(new Link (entity, association))
			}			
		}
		
		return links;
	}
}