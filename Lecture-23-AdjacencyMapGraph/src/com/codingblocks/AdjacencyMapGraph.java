package com.codingblocks;

import java.util.*;

public class AdjacencyMapGraph <T> {

    private Map<T, Vertex> vertexMap;

    public AdjacencyMapGraph() {
        this.vertexMap = new HashMap<>();
    }

    public void addVertex(T value){
        vertexMap.put(value, new Vertex(value));
    }

    public void addEdge(T start, T end){
        Vertex s = vertexMap.get(start);
        Vertex e = vertexMap.get(end);

        if (s != null && e != null){
            s.nbrs.add(e);
            e.nbrs.add(s);
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

                for(Vertex padosi : v.nbrs){
                    if (!visited.contains(padosi)){
                        visited.add(padosi);
                        queue.add(padosi);
                    }
                }
            }

            System.out.println("----------");
        }
    }

    private class Vertex {
        private T value;
        private LinkedList<Vertex> nbrs;

        public Vertex(T value) {
            this.value = value;
            this.nbrs = new LinkedList<>();
        }
    }
}
