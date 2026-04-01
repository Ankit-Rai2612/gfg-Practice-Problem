import java.util.*;

class Solution {

    // Find parent (with path compression)
    int find(int parent[], int x) {
        if (parent[x] == x)
            return x;
        return parent[x] = find(parent, parent[x]);
    }

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = profit.length;

        // Step 1: Pair profit & deadline
        int[][] jobs = new int[n][2];
        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            jobs[i][0] = profit[i];
            jobs[i][1] = deadline[i];
            maxDeadline = Math.max(maxDeadline, deadline[i]);
        }

        // Step 2: Sort jobs by profit (descending)
        Arrays.sort(jobs, (a, b) -> b[0] - a[0]);

        // Step 3: DSU initialization
        int[] parent = new int[maxDeadline + 1];
        for (int i = 0; i <= maxDeadline; i++) {
            parent[i] = i;
        }

        int jobsDone = 0;
        int totalProfit = 0;

        // Step 4: Process jobs
        for (int i = 0; i < n; i++) {
            int d = jobs[i][1];

            // Find available slot
            int availableSlot = find(parent, d);

            if (availableSlot > 0) {
                jobsDone++;
                totalProfit += jobs[i][0];

                // Mark this slot as occupied
                parent[availableSlot] = find(parent, availableSlot - 1);
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(jobsDone);
        res.add(totalProfit);
        return res;
    }
}