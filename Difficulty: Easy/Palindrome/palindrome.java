// User function Template for Java

class Solution {
    public boolean isPalindrome(int n) {
        // Code here
       if(n<0) return false;
       int original=n;
       int reversed=0;
       
       while(n!=0){
           int digit=n%10;
           reversed=reversed*10+digit;
           n/=10;
       }
       return original == reversed;
    }
}