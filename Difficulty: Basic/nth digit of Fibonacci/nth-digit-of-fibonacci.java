// User function Template for Java

// User function Template for Java
class Solution {
    static char nthFibonacciDigit(long n) {
        // code here
        long a = 1, b = 1;
        StringBuilder fibstring = new StringBuilder();
        
        while(fibstring.length() < n){
            fibstring.append(a);
            long nextfib = a + b;
            a = b;
            b = nextfib;
        }
        return fibstring.charAt((int)(n - 1));
    }
}