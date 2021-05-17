package com.islam;


public class Main {
    public static void main(String[] args) {
        hasCycle();
    }

    public static void regularGraph() {
        var graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");

        graph.print();

//        graph.removeEdge("A", "C");
//        graph.print();

//        graph.removeEdge("A", "D");
//        graph.print();

//        graph.removeNode("B");
//        graph.print();

//        graph.removeNode("A");
//        graph.print();

        graph.addEdge("B", "C");
        graph.removeNode("A");
        graph.print();
    }

    public static void depthFirstRecursive() {
        var graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        graph.addEdge("A", "B");
        graph.addEdge("B", "D");
        graph.addEdge("D", "C");
        graph.addEdge("A", "C");

        graph.traverseDepthFirstRecursive("C");
    }

    public static void depthFirstIteration() {
        var graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        graph.addEdge("A", "B");
        graph.addEdge("B", "D");
        graph.addEdge("D", "C");
        graph.addEdge("A", "C");

        graph.traverseDepthFirstIteration("A");
    }

    public static void topologicalSort() {
        var graph = new Graph();
        graph.addNode("X");
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("P");

        graph.addEdge("X", "A");
        graph.addEdge("X", "B");
        graph.addEdge("A", "P");
        graph.addEdge("B", "P");

        var list = graph.topologicalSort();
        System.out.println(list);
    }

    public static void hasCycle() {
        var graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");

        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "A");

        System.out.println(graph.hasCycle());
    }


}
