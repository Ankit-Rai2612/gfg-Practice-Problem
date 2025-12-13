class Solution {
    public int nthFibonacci(int n) {
        // code here
        int num1 = 0;
        int num2 = 1;
        int num3;
        for(int i=0; i<n; i++){
            // System.out.print(num1 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return num1;
    }
}