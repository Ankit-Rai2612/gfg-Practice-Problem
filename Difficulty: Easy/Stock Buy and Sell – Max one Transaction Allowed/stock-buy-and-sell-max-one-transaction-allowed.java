// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int n = prices.length;
        int minimum = prices[0];
        int res = 0;
        
        for(int i=1; i<n; i++){
            int cost = prices[i]-minimum;
            
            res = Math.max(res,cost);
            if(prices[i] < minimum){
                minimum=prices[i];
            }
        }
        return res;
    }
}