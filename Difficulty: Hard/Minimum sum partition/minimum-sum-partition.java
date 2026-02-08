// User function Template for Java

class Solution {

    public int minDifference(int arr[]) {
        // Your code goes here
         int n = arr.length;
        int totalSum = 0;

        for (int num : arr)
            totalSum += num;

        int target = totalSum / 2;

        boolean[][] dp = new boolean[n + 1][target + 1];

        // Base case
        for (int i = 0; i <= n; i++)
            dp[i][0] = true;

        // Fill DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= arr[i - 1])
                    dp[i][j] |= dp[i - 1][j - arr[i - 1]];
            }
        }

        // Find closest sum to totalSum/2
        int best = 0;
        for (int j = target; j >= 0; j--) {
            if (dp[n][j]) {
                best = j;
                break;
            }
        }

        return totalSum - 2 * best;
    }
}
