// User function Template for Java

class Solution {
    int longestUniqueSubstring(String s) {
        // code here
        int[] index = new int[128]; // ASCII value Created new Array
        int left=0;
        int maxLen=0;
        int n=s.length();
        for(int right=0; right<n; right++){
            char ch = s.charAt(right);
            left=Math.max(index[ch], left);
            maxLen=Math.max(maxLen, right-left+1);
            index[ch]=right+1;
        }
        return maxLen;
    }
}