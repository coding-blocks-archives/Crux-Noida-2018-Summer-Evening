package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AdjacencyGraph<String> graph = new AdjacencyGraph<>();

        graph.addVertex("Mona");
        graph.addVertex("Shobhit");
        graph.addVertex("Ranu");
        graph.addVertex("Mohan");
        graph.addVertex("Geeta");
        graph.addVertex("Gangadhar");
        graph.addVertex("Shaktiman");

        graph.addEdge("Mona", "Shobhit");
        graph.addEdge("Shobhit", "Ranu");
        graph.addEdge("Ranu", "Gangadhar");
        graph.addEdge("Mona", "Mohan");
        graph.addEdge("Mohan", "Shaktiman");
        graph.addEdge("Mohan", "Geeta");
        graph.addEdge("Shobhit", "Geeta");
        graph.addEdge("Ranu", "Geeta");


        System.out.println(graph.BFS("Geeta"));
        System.out.println(graph.BFS("Geet"));
//        graph.showRelations();
    }
}
