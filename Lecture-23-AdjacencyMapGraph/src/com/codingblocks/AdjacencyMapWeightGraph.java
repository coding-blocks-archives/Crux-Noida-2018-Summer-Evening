package com.codingblocks;

import java.util.*;

public class AdjacencyMapWeightGraph<T> {

    private Map<T, Vertex> vertexMap;

    public AdjacencyMapWeightGraph() {
        this.vertexMap = new HashMap<>();
    }

    public void addVertex(T value){
        vertexMap.put(value, new Vertex(value));
    }

    public void addEdge(T start, T end, Integer weight){
        Vertex s = vertexMap.get(start);
        Vertex e = vertexMap.get(end);

        if (s != null && e != null){
            s.nbrs.put(e, weight);
            e.nbrs.put(s, weight);
        }
    }

    public void connectedComponents() {

        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();

        for (Vertex vertex : vertexMap.values()) {
            if (visited.contains(vertex)){
                continue;
            }

            visited.add(vertex);
            queue.add(vertex);

            while (!queue.isEmpty()){
                Vertex v = queue.remove();

                System.out.println(v.value);

                for(Vertex padosi : v.nbrs.keySet()){
                    if (!visited.contains(padosi)){
                        visited.add(padosi);
                        queue.add(padosi);
                    }
                }
            }

            System.out.println("----------");
        }
    }

    public int kruskal(){
        PriorityQueue<Edge> queue = new PriorityQueue<>();

        for (Vertex vertex : vertexMap.values()) {
            for (Vertex padosi : vertex.nbrs.keySet()) {
                Edge edge = new Edge(vertex, padosi, vertex.nbrs.get(padosi));
                queue.add(edge);
            }
        }

        while (!queue.isEmpty()){
            Edge edge = queue.remove();

            System.out.println(edge.start.value + " " + edge.end.value + " " + edge.weight);
        }

        return 0;
    }

    private class Vertex {
        private T value;
        private Map<Vertex, Integer> nbrs;

        public Vertex(T value) {
            this.value = value;
            this.nbrs = new HashMap<>();
        }
    }

    private class Edge implements Comparable<Edge> {
        private Vertex start;
        private Vertex end;
        private int weight;

        public Edge(Vertex start, Vertex end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }
}
