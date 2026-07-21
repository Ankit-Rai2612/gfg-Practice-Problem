class Solution {
    public int nCr(int n, int r) {
        // code here
        if(r > n){
            return 0;
        }
        r = Math.min(r, n-r);
        long ans = 1;
        for(int i=0; i<r; i++){
            ans = ans*(n-i);
            ans = ans/(i+1);
        }
        return (int) ans;
    }
}