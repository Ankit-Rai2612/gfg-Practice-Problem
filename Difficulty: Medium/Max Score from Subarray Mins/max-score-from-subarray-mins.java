class Solution {
    public int maxSum(int arr[]) {
        int n = arr.length;
        if (n < 2) return 0;

        int maxSum = Integer.MIN_VALUE;

        // Traverse the array to find the maximum sum of smallest + second smallest for all subarrays
        for (int i = 0; i < n - 1; i++) {
            int smallest = Math.min(arr[i], arr[i + 1]);
            int secondSmallest = Math.max(arr[i], arr[i + 1]);
            
            // Calculate sum for this pair
            maxSum = Math.max(maxSum, smallest + secondSmallest);
        }

        return maxSum;
    }
}
