package Day12;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Leetcode1971 {
    public static boolean validPath(
            int n,
            int[][] edges,
            int source,
            int destination) {
        // Create adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        // Add edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        // Visited array
        boolean[] visited = new boolean[n];
        // BFS
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            // Destination found
            if (current == destination) {
                return true;
            }
            // Visit neighbours
            for (int neighbour : graph.get(current)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {
                {0, 1},
                {1, 2}
        };
        int source = 0;
        int destination = 2;
        boolean result = validPath(
                n,
                edges,
                source,
                destination
        );
        System.out.println("Path exists: " + result);
    }
}