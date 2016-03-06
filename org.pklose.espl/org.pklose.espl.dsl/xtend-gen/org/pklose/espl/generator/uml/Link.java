package org.pklose.espl.generator.uml;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.pklose.espl.esplm.Association;
import org.pklose.espl.esplm.Entity;

@SuppressWarnings("all")
public class Link {
  private final Association association;
  
  private final Entity entity;
  
  public Link(final Entity sourceEntity, final Association association) {
    this.association = association;
    this.entity = sourceEntity;
  }
  
  public String toJSON() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{ from: \"");
    String _name = this.entity.getName();
    _builder.append(_name, "");
    _builder.append("\", to:\"");
    Entity _type = this.association.getType();
    String _name_1 = _type.getName();
    _builder.append(_name_1, "");
    _builder.append("\", relationship:\"association\", targetRole:\"");
    String _name_2 = this.association.getName();
    _builder.append(_name_2, "");
    _builder.append("\"\" }");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
