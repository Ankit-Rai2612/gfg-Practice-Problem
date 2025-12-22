// User function Template for Java

class Solution {
    int digitPrime(int N) {
        // code here
        while(N >= 10){
            int sum = 0;
            while(N >0){
                sum += N % 10;
                N /= 10;
            }
            N = sum;
        }
        return isPrime(N)? 1:0;
    }
    
    public static boolean isPrime(int N){
        if(N <= 1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(N); i++){
            if(N % i == 0){
                return false;
            }
        }
        return true;
    }
}