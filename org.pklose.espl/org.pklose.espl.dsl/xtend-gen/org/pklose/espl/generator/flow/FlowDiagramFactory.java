package org.pklose.espl.generator.flow;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.pklose.espl.esplm.Activity;
import org.pklose.espl.esplm.Flow;
import org.pklose.espl.generator.flow.ActivityLink;
import org.pklose.espl.generator.flow.ActivityNode;
import org.pklose.espl.generator.flow.FlowBody;

@SuppressWarnings("all")
public class FlowDiagramFactory {
  public static FlowBody createFlowDiagram(final Flow flow) {
    EList<Activity> _activities = flow.getActivities();
    List<Activity> _list = IterableExtensions.<Activity>toList(_activities);
    final Iterable<Activity> activities = Iterables.<Activity>filter(_list, Activity.class);
    final List<ActivityNode> activityNodes = new ArrayList<ActivityNode>();
    final List<ActivityLink> activityLinks = new ArrayList<ActivityLink>();
    for (final Activity activity : activities) {
      {
        ActivityNode _activityNode = new ActivityNode(activity);
        activityNodes.add(_activityNode);
        EList<Activity> _sucessors = activity.getSucessors();
        for (final Activity successor : _sucessors) {
          ActivityLink _activityLink = new ActivityLink(activity, successor);
          activityLinks.add(_activityLink);
        }
      }
    }
    String _name = flow.getName();
    return new FlowBody(_name, activityLinks, activityNodes);
  }
}
