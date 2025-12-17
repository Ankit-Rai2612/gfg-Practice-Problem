// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int reversed = 0;
        while(n != 0){
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }
}