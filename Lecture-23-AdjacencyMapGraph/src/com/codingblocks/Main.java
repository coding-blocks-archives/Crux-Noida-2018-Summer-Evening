package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here

        AdjacencyMapWeightGraph<Character> graph = new AdjacencyMapWeightGraph<>();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');

        graph.addEdge('A', 'B', 5);
        graph.addEdge('C', 'D', 15);
        graph.addEdge('A', 'D', 5);
        graph.addEdge('A', 'C', 15);
        graph.addEdge('B', 'D', 10);
        graph.addEdge('B', 'C', 15);

        graph.kruskal();
    }
}
