class Solution {
    public int rowWithMax1s(int arr[][]) {
        int R = arr.length;
        int C = arr[0].length;

        boolean flag = true;   // to check if matrix has at least one 1
        int maxRowIndex = -1;
        int maxOnes = 0;

        for (int i = 0; i < R; i++) {
            int count1 = 0;

            for (int j = 0; j < C; j++) {
                if (arr[i][j] == 1) {
                    count1++;
                    flag = false;
                }
            }

            if (count1 > maxOnes) {
                maxOnes = count1;
                maxRowIndex = i;
            }
        }

        // If no 1 is found in the entire matrix
        if (flag) {
            return -1;
        }

        return maxRowIndex;
    }
}
