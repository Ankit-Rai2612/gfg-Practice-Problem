class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here    
        int n = a.length;
        int m = b.length;
        int[] merged = new int[n + m];
        
        int i=0, j=0, k=0;
        
        while(i < n && j < m){
            if(a[i] <= b[j]){
                merged[k++] = a[i++];
            }else{
                merged[k++] = b[j++];
            }
        }
        
        while ( i < n){
            merged[k++] = a[i++];
        }
        while (j < m){
            merged[k++] = b[j++];
        }
        
        for(i=0; i<n; i++){
            a[i] = merged[i];
        }
        
        for(j=0; j<m; j++){
            b[j] = merged[n + j];
        }
    }
}
