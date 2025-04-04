package fr.iut45;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultUndirectedGraph;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.nio.AttributeType;
import org.jgrapht.nio.DefaultAttribute;
import org.jgrapht.nio.csv.CSVFormat;
import org.jgrapht.nio.csv.CSVImporter;
import org.jgrapht.nio.dot.DOTExporter;
import org.jgrapht.util.SupplierUtil;

public class Executable {

	public static Graph<String, DefaultEdge> loadHeroes() {
		Graph<String, DefaultEdge> graph = new DefaultUndirectedGraph<>(SupplierUtil.createStringSupplier(1),
				SupplierUtil.DEFAULT_EDGE_SUPPLIER, false);
		CSVImporter<String, DefaultEdge> importer = new CSVImporter<>(CSVFormat.EDGE_LIST);
		importer.setVertexFactory(id -> id);
		importer.importGraph(graph, new File("extrait_marvel.csv"));
		return graph;
	}

	public static Graph<String, DefaultEdge> exo1(){
	Graph<String, DefaultEdge> graphex1;
	graphex1 = new SimpleGraph<>(DefaultEdge.class);
	graphex1.addVertex("a");
	graphex1.addVertex("b");
	graphex1.addVertex("c");
	graphex1.addVertex("d");
	graphex1.addVertex("e");
	graphex1.addEdge("e", "d");
	graphex1.addEdge("d", "c");
	graphex1.addEdge("c", "a");
	graphex1.addEdge("a", "b");
	graphex1.addEdge("b", "c");
	return graphex1;
	}
	public static void main(String[] args) throws IOException {
		Graph<String, DefaultEdge> graph;
		/*
		graph = loadHeroes();
		System.out.println(graph);
		Set<String> inactifs = new HashSet<>();
		for( String v : graph.vertexSet()){
			if(graph.degreeOf(v)<20)
				inactifs.add(v);
		}
		graph.removeAllVertices(inactifs);
 */
		graph = exo1();
		DOTExporter<String, DefaultEdge> exporter = new DOTExporter<String, DefaultEdge>();
		exporter.setVertexAttributeProvider((x) -> Map.of("label", new DefaultAttribute<>(x, AttributeType.STRING)));
		exporter.exportGraph(graph, new FileWriter("graph.dot"));
	}
}
