package org.pklose.espl.generator.flow

import org.pklose.espl.esplm.Flow
import org.pklose.espl.esplm.Activity
import java.util.ArrayList
import java.util.List

public class FlowDiagramFactory {
	
	public static def createFlowDiagram (Flow flow) {
		val activities = flow.activities.toList.filter(Activity)
		
		val List<ActivityNode> activityNodes = new ArrayList();
		val List<ActivityLink> activityLinks = new ArrayList();
		
		for (Activity activity : activities) {
			activityNodes.add(new ActivityNode (activity));
			
			for (Activity successor : activity.sucessors) {
				activityLinks.add(new ActivityLink(activity, successor));
			}
		}
		
		return new FlowBody(flow.name, activityLinks, activityNodes);
	}
	
}