package Graph;
import java.util.*;
public class Graph {
    private LinkedList<Integer>[] adjList;
    private int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjList = new LinkedList[numVertices];

        for (int i = 0; i < numVertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination, boolean isBidirectional) {
        adjList[source].add(destination);
        if (isBidirectional) {
            adjList[destination].add(source); // For undirected graph
        }
    }

    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + " -> ");
            for (int node : adjList[i]) {
                System.out.print(node + ", ");
            }
            System.out.println();
        }
    }

    public void dfs(int src){
        Map<Integer, Boolean> visited = new HashMap<>();
        dfsHelper(src, visited);
    }

    private void dfsHelper(int src, Map<Integer, Boolean> visited){
        visited.put(src, true);
        // System.out.print(src + " ");
        for(int node : adjList[src]){
            if(!visited.containsKey(node)){
                dfsHelper(node, visited);
            }
        }
    }

    public void bfs(int src){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[numVertices];
        visited[src] = true;
        queue.add(src);

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node + " ");
            for(int neighbor : adjList[node]){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public int connectedComponents() {
        Map<Integer, Boolean> visited = new HashMap<>();
        int count = 0;

        for (int i = 0; i < numVertices; i++) {
            if (!visited.containsKey(i)) {
                dfsHelper(i, visited);
                count++;
            }
        }

        return count;
    }



    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1, true);
        graph.addEdge(1, 3, true);
        graph.addEdge(1, 2, true);
        graph.addEdge(0, 2, true);
        graph.addEdge(4, 5, true);
        graph.dfs(0);
        System.out.println();
        graph.bfs(0);
        System.out.println();
        graph.printGraph();
        System.out.println();
        System.out.println("Number of connected components: " + graph.connectedComponents());
    }
}
