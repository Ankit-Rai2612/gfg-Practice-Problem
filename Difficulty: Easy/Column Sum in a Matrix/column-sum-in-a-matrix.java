class Solution {
    public static int[] colSum(int mat[][]) {
        // Code Here
        int rows = mat.length;
        int cols = mat[0].length;
        int[] colSums = new int[cols];
        
        for(int i=0; i<cols; i++){
            int sum=0;
            for(int j=0; j<rows; j++){
                sum += mat[j][i];
            }
            colSums[i] = sum;
        }
        return colSums;
    }
}