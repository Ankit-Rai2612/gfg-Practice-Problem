class Solution {
    public static int arraySum(int[] arr) {
        // code here
        int count=0;
        int n=arr.length;
        for(int i=0; i<n; i++){
            count += arr[i];
        }
        return count;
    }
}