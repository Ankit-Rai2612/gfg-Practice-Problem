// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        //USING EXPECTED APPROACH
        int n = prices.length;
        int result = 0;
        for(int i=1; i<n; i++){
            if(prices[i] > prices[i-1]){
                result += prices[i] - prices[i-1];
            }
        }
        return result;
    }
}