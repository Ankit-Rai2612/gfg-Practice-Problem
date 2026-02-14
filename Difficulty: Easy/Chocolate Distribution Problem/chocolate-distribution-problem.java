// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        // Edge Cases
        if(m == 0 || arr.size() == 0)
        return 0;
        
        int n = arr.size();
        // Sort the Array
        Collections.sort(arr);
        
        int minDiff = Integer.MAX_VALUE;
        
        // Sliding Window of size m
        for(int i=0; i+m-1<n; i++){
            int diff = arr.get(i+m-1) - arr.get(i);
            
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
}