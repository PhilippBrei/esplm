package org.pklose.espl.generator.flow;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.pklose.espl.esplm.Activity;

@SuppressWarnings("all")
public class ActivityNode {
  private final Activity activity;
  
  public ActivityNode(final Activity activity) {
    this.activity = activity;
  }
  
  public String getAsJson() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{ \"id\": \"");
    String _name = this.activity.getName();
    _builder.append(_name, "");
    _builder.append("\" , text: \"");
    String _description = this.activity.getDescription();
    _builder.append(_description, "");
    _builder.append("\" }");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
