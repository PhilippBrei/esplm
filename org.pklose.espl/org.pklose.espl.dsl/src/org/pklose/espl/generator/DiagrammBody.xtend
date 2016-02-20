package org.pklose.espl.generator

import java.util.ArrayList
import java.util.List

class DiagrammBody {

	final val String title;

	final val List<Node> nodes = new ArrayList();	
	final val List<Link> links = new ArrayList();

	new(String title, Iterable<Node> nodes, Iterable<Link> links) {
		this.title = title;
		this.nodes.addAll(nodes);
		this.links.addAll(links);
	}

	def public getAsHTML() {
		return '''
<!DOCTYPE html>
<html>
<head>
    <title>Entity Relationship</title>
    <meta name="description" content="Interactive entity-relationship diagram or data model diagram implemented by GoJS in JavaScript for HTML." />
    <!-- Copyright 1998-2016 by Northwoods Software Corporation. -->
    <meta charset="UTF-8">
    <script src="http://gojs.net/latest/release/go.js"></script>   
    
    <script id="code">
        function init() {           
            var $ = go.GraphObject.make;
            myDiagram =
                    $(go.Diagram, "«title»",
                            {
                                initialContentAlignment: go.Spot.Center,
                                "undoManager.isEnabled": true,
                                layout: $(go.ForceDirectedLayout)
                            });
            // show visibility or access as a single character at the beginning of each property or method
            function convertVisibility(v) {
                switch (v) {
                    case "public": return "+";
                    case "private": return "-";
                    case "protected": return "#";
                    case "package": return "~";
                    default: return v;
                }
            }
            // the item template for properties
            var propertyTemplate =
                    $(go.Panel, "Horizontal",
                            // property visibility/access
                            $(go.TextBlock,
                                    { isMultiline: false, editable: false, width: 12 },
                                    new go.Binding("text", "visibility", convertVisibility)),
                            // property name, underlined if scope=="class" to indicate static property
                            $(go.TextBlock,
                                    { isMultiline: false, editable: true },
                                    new go.Binding("text", "name").makeTwoWay(),
                                    new go.Binding("isUnderline", "scope", function(s) { return s[0] === 'c' })),
                            // property type, if known
                            $(go.TextBlock, "",
                                    new go.Binding("text", "type", function(t) { return (t ? ": " : ""); })),
                            $(go.TextBlock,
                                    { isMultiline: false, editable: true },
                                    new go.Binding("text", "type").makeTwoWay()),
                            // property default value, if any
                            $(go.TextBlock,
                                    { isMultiline: false, editable: false },
                                    new go.Binding("text", "default", function(s) { return s ? " = " + s : ""; }))
                    );
            // the item template for methods
            var methodTemplate =
                    $(go.Panel, "Horizontal",
                            // method visibility/access
                            $(go.TextBlock,
                                    { isMultiline: false, editable: false, width: 12 },
                                    new go.Binding("text", "visibility", convertVisibility)),
                            // method name, underlined if scope=="class" to indicate static method
                            $(go.TextBlock,
                                    { isMultiline: false, editable: true },
                                    new go.Binding("text", "name").makeTwoWay(),
                                    new go.Binding("isUnderline", "scope", function(s) { return s[0] === 'c' })),
                            // method parameters
                            $(go.TextBlock, "()",
                                    // this does not permit adding/editing/removing of parameters via inplace edits
                                    new go.Binding("text", "parameters", function(parr) {
                                        var s = "(";
                                        for (var i = 0; i < parr.length; i++) {
                                            var param = parr[i];
                                            if (i > 0) s += ", ";
                                            s += param.name + ": " + param.type;
                                        }
                                        return s + ")";
                                    })),
                            // method return type, if any
                            $(go.TextBlock, "",
                                    new go.Binding("text", "type", function(t) { return (t ? ": " : ""); })),
                            $(go.TextBlock,
                                    { isMultiline: false, editable: true },
                                    new go.Binding("text", "type").makeTwoWay())
                    );
            // this simple template does not have any buttons to permit adding or
            // removing properties or methods, but it could!
            myDiagram.nodeTemplate =
                    $(go.Node, "Auto",
                            {
                                locationSpot: go.Spot.Center,
                                fromSpot: go.Spot.AllSides,
                                toSpot: go.Spot.AllSides
                            },
                            $(go.Shape, { fill: "lightyellow" }),
                            $(go.Panel, "Table",
                                    { defaultRowSeparatorStroke: "black" },
                                    // header
                                    $(go.TextBlock,
                                            {
                                                row: 0, margin: 3, alignment: go.Spot.Center,
                                                font: "bold 12pt sans-serif",
                                                isMultiline: false, editable: true
                                            },
                                            new go.Binding("text", "name").makeTwoWay()),
                                    // properties
                                    $(go.Panel, "Vertical",
                                            new go.Binding("itemArray", "properties"),
                                            {
                                                row: 1, margin: 3, alignment: go.Spot.Left,
                                                defaultAlignment: go.Spot.Left,
                                                itemTemplate: propertyTemplate
                                            }
                                    ),
                                    // methods
                                    $(go.Panel, "Vertical",
                                            new go.Binding("itemArray", "methods"),
                                            {
                                                row: 2, margin: 3, alignment: go.Spot.Left,
                                                defaultAlignment: go.Spot.Left,
                                                itemTemplate: methodTemplate
                                            }
                                    ))
                    );
            function convertIsTreeLink(r) {
                return r === "generalization";
            }
            function convertFromArrow(r) {
                switch (r) {
                    case "generalization": return "";
                    default: return "";
                }
            }
            function convertToArrow(r) {
                switch (r) {
                    case "generalization": return "Triangle";
                    case "association": return "Feather";
                    default: return "";
                }
            }
            myDiagram.linkTemplate =
                    $(go.Link,
                            { routing: go.Link.Orthogonal },
                            new go.Binding("isLayoutPositioned", "relationship", convertIsTreeLink),
                            $(go.Shape),
                            $(go.Shape, { scale: 1.3, fill: "white" },
                                    new go.Binding("fromArrow", "relationship", convertFromArrow)),
                            $(go.Shape, { scale: 1.3, fill: "white" },
                                    new go.Binding("toArrow", "relationship", convertToArrow))
                    );
            // setup a few example class nodes and relationships
            var nodedata = [
                «FOR node : nodes SEPARATOR ","»
                   «node.asJson»
                «ENDFOR»
            ];
            
            var linkdata = [
                «FOR link : links SEPARATOR ","»
                	«link.toJSON»
                «ENDFOR» 
            ];
            
            myDiagram.model = $(go.GraphLinksModel,
                    {
                        copiesArrays: true,
                        copiesArrayObjects: true,
                        nodeDataArray: nodedata,
                        linkDataArray: linkdata
                    });
        }
    </script>
</head>
<body onload="init()">
<div id="sample">
    <div id="«title»" style="background-color: white; border: solid 1px black; width: 100%; height: 700px"></div>
</div>
</body>
</html>
'''
	}
}