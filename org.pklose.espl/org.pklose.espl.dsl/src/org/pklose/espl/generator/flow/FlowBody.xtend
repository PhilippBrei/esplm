package org.pklose.espl.generator.flow

import org.pklose.espl.generator.HTMLGenerator
import java.util.ArrayList
import java.util.List

public class FlowBody implements HTMLGenerator {
	val final String flowName;
	
	val final List<ActivityLink> links = new ArrayList();
	val final List<ActivityNode> nodes = new ArrayList();
	
	public new (String flowName, List<ActivityLink> links, List<ActivityNode> nodes) {
		this.flowName = flowName;
		this.links.addAll(links);
		this.nodes.addAll(nodes);
	}
	
	public def getHTML () {
		
	}
	
	override getAsHTML() {
		return '''
<!DOCTYPE html>
<html>
<head>
    <title>ImportStuffForMoney</title>
    <meta name="description" content="A finite state machine chart with editable and interactive features." />
    <!-- /* Copyright 1998-2016 by Northwoods Software Corporation. */ -->
    <meta charset="UTF-8">
    <script src="http://gojs.net/latest/release/go.js"></script>
    <script id="code">
        function init() {
            var $ = go.GraphObject.make;  // for conciseness in defining templates
            myDiagram =
                    $(go.Diagram, "«flowName»",  // must name or refer to the DIV HTML element
                            {
                                // start everything in the middle of the viewport
                                initialContentAlignment: go.Spot.Left,
                                layout: $(go.LayeredDigraphLayout)
                            });
            // define the Node template
            myDiagram.nodeTemplate =
                    $(go.Node, "Auto",
                            new go.Binding("location", "loc", go.Point.parse).makeTwoWay(go.Point.stringify),
                            // define the node's outer shape, which will surround the TextBlock
                            $(go.Shape, "RoundedRectangle",
                                    {
                                        parameter1: 20,  // the corner has a large radius
                                        fill: $(go.Brush, "Linear", { 0: "rgb(254, 201, 0)", 1: "rgb(254, 162, 0)" }),
                                        stroke: "black",
                                        portId: "",
                                        fromLinkable: false,
                                        fromLinkableSelfNode: false,
                                        fromLinkableDuplicates: false,
                                        toLinkable: false,
                                        toLinkableSelfNode: false,
                                        toLinkableDuplicates: false,
                                        cursor: "pointer"
                                    }),
                            $(go.TextBlock,
                                    {
                                        font: "bold 11pt helvetica, bold arial, sans-serif",
                                        editable: false
                                    },
                                    new go.Binding("text", "text"))
                    );

            // replace the default Link template in the linkTemplateMap
            myDiagram.linkTemplate =
                    $(go.Link,  // the whole link panel
                            { curve: go.Link.Bezier, adjusting: go.Link.Stretch, reshapable: false },
                            new go.Binding("curviness", "curviness"),
                            new go.Binding("points").makeTwoWay(),
                            $(go.Shape,  // the link shape
                                    { strokeWidth: 1.5 }),
                            $(go.Shape,  // the arrowhead
                                    { toArrow: "standard", stroke: null })
                    );
            // read in the JSON-format data from the "mySavedModel" element
            load();
        }
  function load() {
    myDiagram.model = go.Model.fromJson(
  { "nodeKeyProperty": "id",
  "nodeDataArray": [
    «FOR node : nodes SEPARATOR ","»
    	«node.asJson»
    «ENDFOR»
  ],
  "linkDataArray": [
  	«FOR link : links SEPARATOR ","»
  	«link.asJson»
  	«ENDFOR»
    ]
  });
}
</script>
</head>
<body onload="init()">
<div id="sample">
  <div id="«this.flowName»" style="background-color: whitesmoke; border: solid 1px black; width: 100%; height: 400px"></div>
</div>
</body>
</html>
'''
	}
	
}