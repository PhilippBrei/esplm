package org.pklose.espl.generator.flow;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.pklose.espl.generator.HTMLGenerator;
import org.pklose.espl.generator.flow.ActivityLink;
import org.pklose.espl.generator.flow.ActivityNode;

@SuppressWarnings("all")
public class FlowBody implements HTMLGenerator {
  private final String flowName;
  
  private final List<ActivityLink> links = new ArrayList<ActivityLink>();
  
  private final List<ActivityNode> nodes = new ArrayList<ActivityNode>();
  
  public FlowBody(final String flowName, final List<ActivityLink> links, final List<ActivityNode> nodes) {
    this.flowName = flowName;
    this.links.addAll(links);
    this.nodes.addAll(nodes);
  }
  
  public Object getHTML() {
    return null;
  }
  
  @Override
  public String getAsHTML() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<title>ImportStuffForMoney</title>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta name=\"description\" content=\"A finite state machine chart with editable and interactive features.\" />");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<!-- /* Copyright 1998-2016 by Northwoods Software Corporation. */ -->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta charset=\"UTF-8\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"http://gojs.net/latest/release/go.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script id=\"code\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("function init() {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("var $ = go.GraphObject.make;  // for conciseness in defining templates");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("myDiagram =");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("$(go.Diagram, \"");
    _builder.append(this.flowName, "                    ");
    _builder.append("\",  // must name or refer to the DIV HTML element");
    _builder.newLineIfNotEmpty();
    _builder.append("                            ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("// start everything in the middle of the viewport");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("initialContentAlignment: go.Spot.Left,");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("layout: $(go.LayeredDigraphLayout)");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("});");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("// define the Node template");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("myDiagram.nodeTemplate =");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("$(go.Node, \"Auto\",");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("new go.Binding(\"location\", \"loc\", go.Point.parse).makeTwoWay(go.Point.stringify),");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("// define the node\'s outer shape, which will surround the TextBlock");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("$(go.Shape, \"RoundedRectangle\",");
    _builder.newLine();
    _builder.append("                                    ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("parameter1: 20,  // the corner has a large radius");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("fill: $(go.Brush, \"Linear\", { 0: \"rgb(254, 201, 0)\", 1: \"rgb(254, 162, 0)\" }),");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("stroke: \"black\",");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("portId: \"\",");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("fromLinkable: false,");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("fromLinkableSelfNode: false,");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("fromLinkableDuplicates: false,");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("toLinkable: false,");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("toLinkableSelfNode: false,");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("toLinkableDuplicates: false,");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("cursor: \"pointer\"");
    _builder.newLine();
    _builder.append("                                    ");
    _builder.append("}),");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("$(go.TextBlock,");
    _builder.newLine();
    _builder.append("                                    ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("font: \"bold 11pt helvetica, bold arial, sans-serif\",");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("editable: false");
    _builder.newLine();
    _builder.append("                                    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("                                    ");
    _builder.append("new go.Binding(\"text\", \"text\"))");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append(");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("            ");
    _builder.append("// replace the default Link template in the linkTemplateMap");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("myDiagram.linkTemplate =");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("$(go.Link,  // the whole link panel");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("{ curve: go.Link.Bezier, adjusting: go.Link.Stretch, reshapable: false },");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("new go.Binding(\"curviness\", \"curviness\"),");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("new go.Binding(\"points\").makeTwoWay(),");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("$(go.Shape,  // the link shape");
    _builder.newLine();
    _builder.append("                                    ");
    _builder.append("{ strokeWidth: 1.5 }),");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("$(go.Shape,  // the arrowhead");
    _builder.newLine();
    _builder.append("                                    ");
    _builder.append("{ toArrow: \"standard\", stroke: null })");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append(");");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("// read in the JSON-format data from the \"mySavedModel\" element");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("load();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("function load() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("myDiagram.model = go.Model.fromJson(");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("{ \"nodeKeyProperty\": \"id\",");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"nodeDataArray\": [");
    _builder.newLine();
    {
      boolean _hasElements = false;
      for(final ActivityNode node : this.nodes) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "    ");
        }
        _builder.append("    ");
        String _asJson = node.getAsJson();
        _builder.append(_asJson, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  ");
    _builder.append("],");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"linkDataArray\": [");
    _builder.newLine();
    {
      boolean _hasElements_1 = false;
      for(final ActivityLink link : this.links) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(",", "  \t");
        }
        _builder.append("  \t");
        String _asJson_1 = link.asJson();
        _builder.append(_asJson_1, "  \t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("});");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body onload=\"init()\">");
    _builder.newLine();
    _builder.append("<div id=\"sample\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<div id=\"");
    _builder.append(this.flowName, "  ");
    _builder.append("\" style=\"background-color: whitesmoke; border: solid 1px black; width: 100%; height: 400px\"></div>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder.toString();
  }
}
