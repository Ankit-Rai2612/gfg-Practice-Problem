class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        Solution solution = new Solution();
        int gcd = solution.gcd(a,b); // Calling the non-static method
        int lcm = (a*b)/gcd;
        return new int[] {lcm, gcd};
    }
    
    public int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}