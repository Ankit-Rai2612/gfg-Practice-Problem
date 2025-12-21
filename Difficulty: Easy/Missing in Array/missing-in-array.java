class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length;
        long totalSum = (n+1)*(n+2)/2;
        long arrSum = 0;
        
        for(int i=0; i<n; i++){
            arrSum += arr[i];
        }
        return (int) (totalSum - arrSum);
    }
}