package org.pklose.espl.generator.flow

import org.pklose.espl.esplm.Activity

public class AcivityNode {
	
	val final Activity activity;
	
	public new (Activity activity) {
		this.activity = activity;
	}
	
	def String getAsJson () {
		return '''
			{ "id":«activity.name» ,  "text": "«activity.description»" },
		'''
	}
	
}