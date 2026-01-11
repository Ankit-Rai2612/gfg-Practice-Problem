class Solution {
    public static int findSum(int n) {
        // code here

        int sum = 0;
      // iterating over all the numbers 
      // between 1 to n
        for (int i= 1; i <= n; i++) 
        {
            sum = sum + i;
        }
        return sum;
    }
}
