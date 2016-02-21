package org.pklose.espl.generator.uml

import java.util.ArrayList
import java.util.List
import org.pklose.espl.esplm.Field

public class Node {
	
	val final String name;
	val final List<Field> fields = new ArrayList();
	
	public new (String name,Iterable<Field> fields) {
		this.name = name;
		this.fields.addAll(fields);
	}
	
	
	public def getAsJson () {
		return 
		'''{
	            key: "«name»",
	            name: "«name»",
	            properties: [
	            	«FOR field : fields SEPARATOR ','»
	            	{ name: "«field.name»", type:"«field.literal.name»", visibility: "public" }                         
	                «ENDFOR»
	            ]
            }'''
	}
	
	
}