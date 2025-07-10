class Solution {
    public int sumSubMins(int[] arr) {
        // code here
               int n = arr.length;
        int[] dp = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initialize right[] to self indices
        for (int i = 0; i < n; i++) right[i] = i;

        // Find index of next smaller
        // element on the right
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                right[stack.pop()] = i;
            }
            stack.push(i);
        }

        // Fill dp[] from right to left
        dp[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            int r = right[i];
            if (r == i) {
                dp[i] = (n - i) * arr[i];
            } else {
                dp[i] = (r - i) * arr[i] + dp[r];
            }
        }

        int sum = 0;
        for (int val : dp) sum += val;
        return sum;
    
    }
}
