class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int n = arr.length;
        int i=0;
        int p=-1;
        int minDist = Integer.MAX_VALUE;
        for(i=0; i<n; i++){
            if(arr[i] == x || arr[i] == y){
                if(p != -1 && arr[i] != arr[p])
                minDist = Math.min(minDist, i-p);
                p=i;
            }
        }
        if(minDist == Integer.MAX_VALUE)
            return -1;
        return minDist;
    }
}