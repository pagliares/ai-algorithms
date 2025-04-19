package org.example;

import org.example.bfs.BreadthFirstSearchAlgorithm;
import org.example.bfs.Vertex;

public class Main {
    public static void main(String[] args) {

        /**
         * Test case:
         *
         *                   A                   First layer
         *                /  |  \
         *             B     F    G              Second layer
         *          /    \      /
         *        C       D    H                 Third layer
         *               /
         *             E                         Fourth layer
         */
        BreadthFirstSearchAlgorithm bfs = new BreadthFirstSearchAlgorithm();

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");

        a.addNeighbour(b);
        a.addNeighbour(f);
        a.addNeighbour(g);

        b.addNeighbour(a);
        b.addNeighbour(c);
        b.addNeighbour(d);

        c.addNeighbour(b);

        d.addNeighbour(b);
        d.addNeighbour(e);

        f.addNeighbour(a);

        g.addNeighbour(a);
        g.addNeighbour(h);

        h.addNeighbour(g);

        bfs.traverse(a);
    }
}