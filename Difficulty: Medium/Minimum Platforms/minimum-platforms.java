// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0, j=0;
        int cnt =0;
        int maxCnt =0;
        int n = arr.length;
        while(i < n){
            if(arr[i] <= dep[j]){
            cnt = cnt+1;
            i=i+1;
        }else{
            cnt = cnt-1;
            j = j+1;
        }
        maxCnt = Math.max(maxCnt, cnt);
        }
        return maxCnt;
    }
}
