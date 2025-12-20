// User function Template for Java

class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer> primes = new ArrayList<>();
        for(int num=M; num <= N; num++){
            boolean isPrime = true;
            
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && num>1){
                primes.add(num);
            }
        }
        return primes;
    }
}