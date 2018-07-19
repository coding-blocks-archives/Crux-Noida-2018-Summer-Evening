package com.codingblocks;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

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

    public boolean BFS(T value){
        if (vertices.isEmpty()){
            return false;
        }

        Set<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        Vertex v = vertices.get(0);

        set.add(v);
        queue.add(v);

        while (!queue.isEmpty()){
            Vertex vertex = queue.remove();

            if (vertex.value.equals(value)){
                return true;
            }

            for (Vertex padosi : vertex.nbrs){
                if (!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }
        }

        return false;

    }


    public void BFT(){
        if (vertices.isEmpty()){
            return;
        }

        Set<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        Vertex v = vertices.get(0);

        set.add(v);
        queue.add(v);

        while (!queue.isEmpty()){
            Vertex vertex = queue.remove();

            System.out.println(vertex.value);

            for (Vertex padosi : vertex.nbrs){
                if (!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }
        }

    }


    public void connectedComponent(){
        if (vertices.isEmpty()){
            return;
        }

        Set<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        for (Vertex v: vertices) {

            if (set.contains(v)){
                continue;
            }

            set.add(v);
            queue.add(v);

            while (!queue.isEmpty()){
                Vertex vertex = queue.remove();

                System.out.print(vertex.value + " ");

                for (Vertex padosi : vertex.nbrs){
                    if (!set.contains(padosi)){
                        set.add(padosi);
                        queue.add(padosi);
                    }
                }
            }

            System.out.println();
        }



    }

    public void shortestPath(){
        if (vertices.isEmpty()){
            return;
        }

        Set<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        Vertex v = vertices.get(0);

        int dist = 0;

        set.add(v);
        queue.add(v);
        queue.add(null);

        while (!queue.isEmpty()){
            Vertex vertex = queue.remove();

            if (vertex == null){
                dist++;
                queue.add(null);
                continue;
            }

            System.out.println(vertex.value + " : " + dist);

            for (Vertex padosi : vertex.nbrs){
                if (!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }
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
