/*Complete the Function below*/
class Solution {
    public static boolean isPalindrome(int num){
        int original = num;
        int reversed = 0;
        
        while(num > 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
    
    public static boolean isPalinArray(int[] arr) {
        // add code here.
       for(int num:arr){
           if(!isPalindrome(num)){
               return false;
           }
       }
       return true;
    }
}