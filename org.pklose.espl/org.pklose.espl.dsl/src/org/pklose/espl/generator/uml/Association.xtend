package org.pklose.espl.generator.uml

import org.pklose.espl.esplm.Association
import org.pklose.espl.esplm.Entity

public class Link {
	val Association association;
	val Entity entity;
	
	new (Entity sourceEntity, Association association) {
		this.association = association;
		this.entity = sourceEntity;
	}
	
	
	public def toJSON () {
		return '''
			 { from: "«entity.name»", to:"«association.type.name»", relationship:"association" }
		'''
	}
}