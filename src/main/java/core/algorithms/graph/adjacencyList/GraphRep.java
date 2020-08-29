package core.algorithms.graph.adjacencyList;

import java.util.ArrayList;

public class GraphRep {
    static void addEdge(ArrayList<ArrayList<Integer>> adjacency, int u, int v) {
        adjacency.get(u).add(v);
        adjacency.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adjacency) {
        for (int i = 0; i < adjacency.size(); i++) {
            System.out.println("Adjacency list for vertex " + i);
            for (int j = 0; j < adjacency.get(i).size(); j++) {
                if (j != 0)
                    System.out.print(" -> " + adjacency.get(i).get(j));
                else
                    System.out.print(adjacency.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 2);
        addEdge(graph, 3, 4);
        addEdge(graph, 2, 4);
        addEdge(graph, 4, 1);
        addEdge(graph, 2, 5);
        addEdge(graph, 5, 1);

        printGraph(graph);
    }
}
