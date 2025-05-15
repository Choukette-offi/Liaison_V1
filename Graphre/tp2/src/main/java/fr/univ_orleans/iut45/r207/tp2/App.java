package fr.univ_orleans.iut45.r207.tp2;

import java.util.ArrayList;
import java.util.List;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.builder.GraphTypeBuilder;
import org.jgrapht.util.SupplierUtil;
i

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

	public static Graph<String, DefaultEdge> sousGrapheInduitParSommets(Graph<String, DefaultEdge> g, List<String> s) {
		Graph<String, DefaultEdge> sousGraphe = new SimpleGraph<>(DefaultEdge.class);
		for(String sommet : s){
			sousGraphe.addVertex(sommet);
		}

		for(String u : s){
			for(String v : s){
				if(!u.equals(v) && g.containsEdge(u, v)){
					sousGraphe.addEdge(u, v);
				}
			}
		}
		return sousGraphe;
	}

	public static Graph<String, DefaultEdge> supprimerAretes(Graph<String, DefaultEdge> g, List<String> s) {
		Graph<String, DefaultEdge> Graphe = new SimpleGraph<>(DefaultEdge.class);

		for(String sommet : G.vertexSet()){
			Graphe.addVertex(sommet);
		}

		for (DefaultEdge arete : s){
			String source = g.getEdgeSource(arete);
			String target = G.getEdgeTarget(arete);
			DefaultEdge edgeToRemove = Graphe.getEdge(source, target);
			if(edgeToRemove != null){
				Graphe.edgeToRemove(edgeToRemove);
			}
		}
		return Graphe;
	}

	public static boolean chaineElementaire(List<String> s){
		List<String> verif = new ArrayList<>();
		for(String sommet : s){
			if(sommet.contains(s)){
				return false;
			}
		}
		return true;
	}

	public static List<String> extraireChaineElementaire()
}

