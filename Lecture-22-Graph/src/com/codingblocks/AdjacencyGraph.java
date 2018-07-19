package com.codingblocks;

import java.util.LinkedList;

public class AdjacencyGraph<T> {

    private LinkedList<Vertex> vertices;

    public AdjacencyGraph() {
        this.vertices = new LinkedList<>();
    }

    public void addVertex(T value){
        this.vertices.add(new Vertex(value));
    }

    public void addEdge(T start, T end){

        Vertex s = get(start);
        Vertex e = get(end);

        if (s != null && e != null) {
            s.nbrs.add(e);
            e.nbrs.add(s);
        }

    }

    private Vertex get(T value){
        for (Vertex vertex: this.vertices) {
            if (vertex.value.equals(value)){
                return vertex;
            }
        }

        return null;
    }

    public void showRelations() {
        for (Vertex vertex : vertices){
            for (Vertex padosi : vertex.nbrs) {
                System.out.println(vertex.value + " -> " + padosi.value);
            }
        }
    }

    private class Edge {
        private Vertex start;
        private Vertex end;

        public Edge(Vertex start, Vertex end) {
            this.start = start;
            this.end = end;
        }
    }

    private class Vertex {
        private T value;
        private LinkedList<Vertex> nbrs;

        public Vertex(T value) {
            this.value = value;
            nbrs = new LinkedList<>();
        }

    }
}
