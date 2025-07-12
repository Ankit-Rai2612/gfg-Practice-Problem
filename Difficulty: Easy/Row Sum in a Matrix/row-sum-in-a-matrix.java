class Solution {
    public static int[] rowSum(int mat[][]) {
        // Code here
        int rows = mat.length;
        int[] rowSums = new int[rows];
        
        for(int i=0; i<rows; i++){
            int sum=0;
            for(int j=0; j<mat[i].length; j++){
                sum += mat[i][j];
            }
            rowSums[i] = sum;
        }
        return rowSums;
    }
}