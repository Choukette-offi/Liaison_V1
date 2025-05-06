package fr.univ_orleans.iut45.r207.tp2;

import java.util.ArrayList;
import java.util.List;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.builder.GraphTypeBuilder;
import org.jgrapht.util.SupplierUtil;

/**
 * Hello JGraphT!
 */
public class App {
	
	public static void main(String[] args) {
		
		Graph<String, DefaultEdge> graph = GraphTypeBuilder
				.directed()
				.allowingMultipleEdges(true)
				.allowingSelfLoops(true)
				.vertexSupplier(SupplierUtil.createStringSupplier())
				.edgeSupplier(SupplierUtil.createDefaultEdgeSupplier())
				.buildGraph();

		String v0 = graph.addVertex();
		String v1 = graph.addVertex();
		String v2 = graph.addVertex();

		graph.addEdge(v0, v1);
		graph.addEdge(v1, v2);
		graph.addEdge(v0, v2);

		for (String v : graph.vertexSet()) {
			System.out.println("vertex: " + v);
		}

		for (DefaultEdge e : graph.edgeSet()) {
			System.out.println("edge: " + e);
		}
		
	}

	public static List<String> getNeighborsListOf(Graph<String, DefaultEdge>g,String u){
        List<String> neighbors = new ArrayList<>();
        for (DefaultEdge e : g.edgesOf(u)) {
            String source = g.getEdgeSource(e);
            String target = g.getEdgeTarget(e);
            if (!source.equals(u)) {
                neighbors.add(source);
            } else {
                neighbors.add(target);
            }
        }
        return neighbors;
    }

	public static List<String> 
	
}

