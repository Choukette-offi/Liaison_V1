package fr.univ_orleans.iut45.r207.tp3;

import java.util.function.Supplier;

import org.jgrapht.Graph;
import org.jgrapht.generate.GridGraphGenerator;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.graph.builder.GraphTypeBuilder;
import org.jgrapht.util.SupplierUtil;

/**
 * Hello JGraphT!
 */
public class App {
	public static Sommet premierVoisinBlanc(Graph<Sommet,DefaultEdge> graph, Sommet u){
		for (DefaultEdge e : graph.edgesOf(u)) {
            
	}

		GridGraphGenerator Graph = new GridGraphGenerator<>(3, 4);
		Graph<Sommet,DefaultEdge> grille = new SimpleGraph<>(
			SupplierUtil.createSupplier(Sommet.class),
			SupplierUtil.createDefaultEdgeSupplier(),false
		);

		
	}
	
}
