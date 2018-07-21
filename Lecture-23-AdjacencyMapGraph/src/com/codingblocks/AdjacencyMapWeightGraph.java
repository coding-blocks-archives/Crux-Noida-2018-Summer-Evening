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

        HashMap<Vertex, Vertex> parent = new HashMap<>();
        for (Vertex vertex : vertexMap.values()) {
            parent.put(vertex, null);
        }

        PriorityQueue<Edge> queue = new PriorityQueue<>();

        for (Vertex vertex : vertexMap.values()) {
            for (Vertex padosi : vertex.nbrs.keySet()) {
                Edge edge = new Edge(vertex, padosi, vertex.nbrs.get(padosi));
                queue.add(edge);
            }
        }

        int weight = 0;

        while (!queue.isEmpty()){
            Edge edge = queue.remove();

            if (find(edge.start, parent) != find(edge.end, parent)){
                weight += edge.weight;
                union(edge.start, edge.end, parent);
            }
        }

        return weight;
    }

    private void union(Vertex start, Vertex end, HashMap<Vertex, Vertex> parent) {
        parent.put(find(start, parent), find(end, parent));
    }

    private Vertex find(Vertex vertex, HashMap<Vertex, Vertex> parent) {
        if (parent.get(vertex) == null){
            return vertex;
        }

        return find(parent.get(vertex), parent);
    }

    public int prims(T value){
        PriorityQueue<Edge> queue = new PriorityQueue<>();
        Set<Vertex> visited = new HashSet<>();

        Vertex vertex = vertexMap.get(value);

        visited.add(vertex);

        for (Vertex padosi : vertex.nbrs.keySet()) {
            Edge edge = new Edge(vertex, padosi, vertex.nbrs.get(padosi));
            queue.add(edge);
        }

        int weight = 0;

        while (!queue.isEmpty()){
            Edge edge = queue.remove();
            if (!visited.contains(edge.end)){
                weight += edge.weight;
                Vertex end = edge.end;
                visited.add(end);

                for (Vertex padosi: end.nbrs.keySet()) {
                    if (!visited.contains(padosi)){
                        Edge e = new Edge(end, padosi, end.nbrs.get(padosi));
                        queue.add(e);
                    }
                }
            }
        }

        return weight;

    }

    public AdjacencyMapWeightGraph<T> primsGraph(T value){
        PriorityQueue<Edge> queue = new PriorityQueue<>();
        Set<Vertex> visited = new HashSet<>();

        Vertex vertex = vertexMap.get(value);

        visited.add(vertex);

        for (Vertex padosi : vertex.nbrs.keySet()) {
            Edge edge = new Edge(vertex, padosi, vertex.nbrs.get(padosi));
            queue.add(edge);
        }

        AdjacencyMapWeightGraph<T> graph = new AdjacencyMapWeightGraph<>();

        for (T key : vertexMap.keySet()) {
            graph.addVertex(key);
        }

        while (!queue.isEmpty()){
            Edge edge = queue.remove();
            if (!visited.contains(edge.end)){

                graph.addEdge(edge.start.value, edge.end.value, edge.weight);

                Vertex end = edge.end;
                visited.add(end);

                for (Vertex padosi: end.nbrs.keySet()) {
                    if (!visited.contains(padosi)){
                        Edge e = new Edge(end, padosi, end.nbrs.get(padosi));
                        queue.add(e);
                    }
                }
            }
        }

        return graph;

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
