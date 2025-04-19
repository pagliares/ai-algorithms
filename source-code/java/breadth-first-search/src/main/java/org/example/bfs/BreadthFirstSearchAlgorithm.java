package org.example.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchAlgorithm {

    public void traverse(Vertex root) {
        Queue<Vertex> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);

        while (!queue.isEmpty()) {
            Vertex current = queue.remove();
            System.out.println("Current visited vertex: " + current.toString());
            for (Vertex vertex: current.getAdjacencyList())
                if (!vertex.isVisited()) {
                    vertex.setVisited(true);
                    queue.add(vertex);
                }
        }
    }
}
