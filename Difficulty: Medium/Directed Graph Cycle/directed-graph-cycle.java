import java.util.*;

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, int[][] edges) {
        // Step 1: Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }

        boolean[] visited = new boolean[V];
        boolean[] pathVis = new boolean[V];

        // Step 2: DFS for each vertex
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, adj, visited, pathVis)) {
                    return true;
                }
            }
        }
        return false;
    }

    // DFS helper function
    private boolean dfs(int node, ArrayList<ArrayList<Integer>> adj,
                        boolean[] visited, boolean[] pathVis) {

        visited[node] = true;
        pathVis[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, adj, visited, pathVis)) {
                    return true;
                }
            } else if (pathVis[neighbor]) {
                // Cycle detected
                return true;
            }
        }

        // Backtrack
        pathVis[node] = false;
        return false;
    }
}
