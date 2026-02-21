class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
            
        for(int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }
        
        // Step 2: Calculate indegree
        int[] indegree = new int[V];
        for(int i = 0; i < V; i++) {
            for(int neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }
         // Step 3: Add nodes with indegree 0 to queue
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < V; i++) {
            if(indegree[i] == 0)
                q.add(i);
        }
        
        // Step 4: Process queue
        ArrayList<Integer> topo = new ArrayList<>();
        
        while(!q.isEmpty()) {
            int node = q.poll();
            topo.add(node);
            
            for(int neighbor : adj.get(node)) {
                indegree[neighbor]--;
                if(indegree[neighbor] == 0)
                    q.add(neighbor);
            }
        }
        return topo;
    }
}