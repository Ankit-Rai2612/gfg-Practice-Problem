class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;
        int temp = n;
        
        while(temp != 0){
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        
        if( n == sum){
            return true;
        }else{
            return false;
        }
    }
}