package org.pklose.espl.generator.flow

import org.pklose.espl.generator.HTMLGenerator

public class FlowBody implements HTMLGenerator {
	val final String flowName;
	
	public new (String flowName) {
		this.flowName = flowName;
	}
	
	public def getHTML () {
		
	}
	
	override getAsHTML() {
		return '''
<!DOCTYPE html>
<html>
<head>
<title>State Chart</title>
<meta name="description" content="A finite state machine chart with editable and interactive features." />
<!-- /* Copyright 1998-2016 by Northwoods Software Corporation. */ -->
<meta charset="UTF-8">
<script src="http://gojs.net/latest/release/go.js"></script>
<script id="code">
  function init() {
    var $ = go.GraphObject.make;  // for conciseness in defining templates
    myDiagram =
      $(go.Diagram, "myDiagram",  // must name or refer to the DIV HTML element
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
            fromLinkable: true,
            fromLinkableSelfNode: true,
            fromLinkableDuplicates: true,
            toLinkable: true,
            toLinkableSelfNode: true,
            toLinkableDuplicates: true,
            cursor: "pointer"
          }),
        $(go.TextBlock,
          {
            font: "bold 11pt helvetica, bold arial, sans-serif",
            editable: false
          },
          new go.Binding("text", "text").makeTwoWay())
      );

    // replace the default Link template in the linkTemplateMap
    myDiagram.linkTemplate =
      $(go.Link,  // the whole link panel
        { curve: go.Link.Bezier, adjusting: go.Link.Stretch, reshapable: true },
        new go.Binding("curviness", "curviness"),
        new go.Binding("points").makeTwoWay(),
        $(go.Shape,  // the link shape
          { strokeWidth: 1.5 }),
        $(go.Shape,  // the arrowhead
          { toArrow: "standard", stroke: null }),
        $(go.Panel, "Auto",
          $(go.Shape,  // the link shape
            {
              fill: $(go.Brush, "Radial",
                      { 0: "rgb(240, 240, 240)", 0.3: "rgb(240, 240, 240)", 1: "rgba(240, 240, 240, 0)" }),
              stroke: null
            }),
          $(go.TextBlock, "transition",  // the label
            {
              textAlign: "center",
              font: "10pt helvetica, arial, sans-serif",
              stroke: "black",
              margin: 4,
              editable: false  // editing the text automatically updates the model data
            },
            new go.Binding("text", "text").makeTwoWay())
        )
      );
    // read in the JSON-format data from the "mySavedModel" element
    load();
  }
  function load() {
    myDiagram.model = go.Model.fromJson(
  { "nodeKeyProperty": "id",
  "nodeDataArray": [
    { "id": 0, "loc": "120 120", "text": "Initial" },
    { "id": 1, "loc": "330 120", "text": "First down" },
    { "id": 2, "loc": "226 376", "text": "First up" },
    { "id": 3, "loc": "60 276", "text": "Second down" },
    { "id": 4, "loc": "226 226", "text": "Wait" }
  ],
  "linkDataArray": [
    { "from": 0, "to": 0, "text": "up or timer", "curviness": -20 },
    { "from": 0, "to": 1, "text": "down", "curviness": 20 },
    { "from": 1, "to": 0, "text": "up (moved)\nPOST", "curviness": 20 },
    { "from": 1, "to": 1, "text": "down", "curviness": -20 },
    { "from": 1, "to": 2, "text": "up (no move)" },
    { "from": 1, "to": 4, "text": "timer" },
    { "from": 2, "to": 0, "text": "timer\nPOST" },
    { "from": 2, "to": 3, "text": "down" },
    { "from": 3, "to": 0, "text": "up\nPOST\n(dblclick\nif no move)" },
    { "from": 3, "to": 3, "text": "down or timer", "curviness": 20 },
    { "from": 4, "to": 0, "text": "up\nPOST" },
    { "from": 4, "to": 4, "text": "down" }]
  });
}
</script>
</head>
<body onload="init()">
<div id="sample">
  <div id="myDiagram" style="background-color: whitesmoke; border: solid 1px black; width: 100%; height: 400px"></div>
</div>
</body>
</html>
'''
	}
	
}