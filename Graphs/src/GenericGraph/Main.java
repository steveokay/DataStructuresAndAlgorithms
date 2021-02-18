package GenericGraph;

public class Main {
    public static void main(String[] args){
        Graph<Integer> graph = new Graph<>();

        // add the edges
        graph.addEdge(0, 1, true);
        graph.addEdge(0, 4, true);
        graph.addEdge(1, 2, true);
        graph.addEdge(1, 3, true);
        graph.addEdge(1, 4, true);
        graph.addEdge(2, 3, true);
        graph.addEdge(3, 4, true);

        // print the graph.
        System.out.println("Graph:\n" + graph.toString());

        // gives the no of vertices in the graph.
        graph.getVertexCount();

        // gives the no of edges in the graph.
        graph.getEdgeCount(true);

        // tells whether the edge is present or not.
        graph.hasEdge(3, 4);

        // tells whether vertex is present or not
        graph.hasVertex(5);
    }
}
