package kruskal;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		GrafoNDP grafo = new GrafoNDP("grafo.in");
		Kruskal kruskal = new Kruskal(grafo);
		kruskal.ejecutar();

	}

}
