package org.pklose.espl.generator.flow

import org.pklose.espl.esplm.Activity

public class ActivityLink {
	
	val final String CURVY = "-20"
	
	val final Activity source;
	
	val final Activity target;
	
	public new (Activity source, Activity target) {
		this.source = source;
		this.target = target;
	}
	
	
	public def String asJson () {
		return '''
			{ "from": "«source.name»", "to": "«target.name»",  "curviness": «CURVY» }
		'''
		//{ "from": 0, "to": 0, "text": "Do Stuff", "curviness": «CURVY» },
	}
	
	
}