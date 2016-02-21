package org.pklose.espl.generator.flow;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.pklose.espl.esplm.Activity;

@SuppressWarnings("all")
public class ActivityLink {
  private final String CURVY = "-20";
  
  private final Activity source;
  
  private final Activity target;
  
  public ActivityLink(final Activity source, final Activity target) {
    this.source = source;
    this.target = target;
  }
  
  public String asJson() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{ \"from\": \"");
    String _name = this.source.getName();
    _builder.append(_name, "");
    _builder.append("\", \"to\": \"");
    String _name_1 = this.target.getName();
    _builder.append(_name_1, "");
    _builder.append("\",  \"curviness\": ");
    _builder.append(this.CURVY, "");
    _builder.append(" }");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
