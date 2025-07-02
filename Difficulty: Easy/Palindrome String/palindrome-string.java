class Solution {
    boolean isPalindrome(String s) {
        // code here
        return palindrome(s, 0, s.length()-1);
       
    }
    boolean palindrome(String s, int left, int right){
        if(left>=right){
            return true;
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return palindrome(s,left+1,right-1);
    }
}