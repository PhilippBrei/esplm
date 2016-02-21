package org.pklose.espl.generator.uml;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.pklose.espl.esplm.Field;
import org.pklose.espl.esplm.Literal;

@SuppressWarnings("all")
public class Node {
  private final String name;
  
  private final List<Field> fields = new ArrayList<Field>();
  
  public Node(final String name, final Iterable<Field> fields) {
    this.name = name;
    Iterables.<Field>addAll(this.fields, fields);
  }
  
  public String getAsJson() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("key: \"");
    _builder.append(this.name, "\t            ");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("name: \"");
    _builder.append(this.name, "\t            ");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("properties: [");
    _builder.newLine();
    {
      boolean _hasElements = false;
      for(final Field field : this.fields) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t            \t");
        }
        _builder.append("\t            \t");
        _builder.append("{ name: \"");
        String _name = field.getName();
        _builder.append(_name, "\t            \t");
        _builder.append("\", type:\"");
        Literal _literal = field.getLiteral();
        String _name_1 = _literal.getName();
        _builder.append(_name_1, "\t            \t");
        _builder.append("\", visibility: \"public\" }                         ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t            ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    return _builder.toString();
  }
}
