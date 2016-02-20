package org.pklose.espl.generator;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.pklose.espl.esplm.Association;
import org.pklose.espl.esplm.Entity;
import org.pklose.espl.esplm.Field;
import org.pklose.espl.esplm.Property;
import org.pklose.espl.generator.Link;
import org.pklose.espl.generator.Node;

@SuppressWarnings("all")
public class NodeFactory {
  public static List<Node> createNodes(final List<Entity> entities) {
    final List<Node> nodes = new ArrayList<Node>();
    for (final Entity entity : entities) {
      {
        EList<Property> _properties = entity.getProperties();
        final Iterable<Field> fields = Iterables.<Field>filter(_properties, Field.class);
        String _name = entity.getName();
        Node _node = new Node(_name, fields);
        nodes.add(_node);
      }
    }
    return nodes;
  }
  
  public static List<Link> createLinks(final List<Entity> entities) {
    final List<Link> links = new ArrayList<Link>();
    for (final Entity entity : entities) {
      {
        EList<Property> _properties = entity.getProperties();
        final Iterable<Association> linkedAssociations = Iterables.<Association>filter(_properties, Association.class);
        for (final Association association : linkedAssociations) {
          Link _link = new Link(entity, association);
          links.add(_link);
        }
      }
    }
    return links;
  }
}
