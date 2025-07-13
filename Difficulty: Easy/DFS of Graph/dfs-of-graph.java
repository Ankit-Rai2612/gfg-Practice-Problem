class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size(); // number of vertices
        boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        dfsUtil(0, adj, visited, result); // start DFS from node 0
        return result;
    }

    // Helper recursive function
    private void dfsUtil(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
        visited[node] = true;
        result.add(node);

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, adj, visited, result);
            }
        }
    }
}
