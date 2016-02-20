package org.pklose.espl.generator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.stream.file.FileSink;
import org.graphstream.stream.file.FileSinkSVG;
import org.graphstream.stream.file.FileSinkSVG2;
import org.graphstream.ui.layout.springbox.implementations.SpringBox;
import org.pklose.espl.esplm.Association;
import org.pklose.espl.esplm.Entity;
import org.pklose.espl.esplm.Property;

public class ShowAllEntitiesGraph {
	
	private final FileSink svgFileSink = new FileSinkSVG();	
	private final Iterable<Entity> entities;
	private Graph graph;
	
	public ShowAllEntitiesGraph (Iterable<Entity> entities) {
		this.entities = entities;		
		fillGraph();
	}
	
	
	
	protected void fillGraph () {
		graph = new MultiGraph("Hallo");
		SpringBox springBox = new SpringBox();
		graph.addSink(springBox);
		springBox.addAttributeSink(graph);
		for (Entity entity : entities) {
			Node classNode = graph.addNode(entity.getName());
			classNode.addAttribute("ui.label", entity.getName());
		}
		
		for (Entity entity : entities) {
			for (Association association : getRelatedEntities(entity)) {
				graph.addEdge(association.getName(), entity.getName(), association.getType().getName(), true);
			}			
		}
		springBox.compute();		   
	}
	
	private List<Association> getRelatedEntities (Entity entity) {
		List<Association> relatedEntities = new ArrayList<Association>();
		
		for (Property property : entity.getProperties()) {
			 if (property instanceof Association) {
				 Association association = (Association) property;
				 relatedEntities.add(association);
			 }
		}
		
		
		return relatedEntities;
	}
	
	public void write (IFileSystemAccess fileSystemAcces) {
		ByteArrayOutputStream byteArrayOutPut = new ByteArrayOutputStream();		
		try {			
			write(byteArrayOutPut);
			fileSystemAcces.generateFile(getFileName(), byteArrayOutPut.toString());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}



	public void write(OutputStream byteArrayOutPut) throws IOException {
		svgFileSink.writeAll(graph, byteArrayOutPut);
		svgFileSink.flush();
	}

	private String getFileName() {
		return "hallo.svg";
	}

}
