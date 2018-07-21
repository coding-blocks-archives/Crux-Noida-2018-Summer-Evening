package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here

        AdjacencyMapGraph<Character> graph = new AdjacencyMapGraph<>();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');

        graph.addEdge('A', 'B');
        graph.addEdge('C', 'D');
        graph.addEdge('A', 'D');

        graph.connectedComponents();
    }
}
