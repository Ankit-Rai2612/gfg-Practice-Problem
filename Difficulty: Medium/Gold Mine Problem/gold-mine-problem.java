class Solution {
    static boolean isValid(int x, int y, int n, int m) {
        // code here
         return x >= 0 && x < n && y >= 0 && y < m;
    }

    static int maxGold(int[][] mat) {
        int n = mat.length, m = mat[0].length;

        for (int y = m - 2; y >= 0; y--) {
            for (int x = 0; x < n; x++) {
                int maxprev = 0;

                // move from right-upper cell
                if (isValid(x - 1, y + 1, n, m)) {
                    maxprev = Math.max(maxprev, mat[x - 1][y + 1]);
                }

                // move from right cell
                if (isValid(x, y + 1, n, m)) {
                    maxprev = Math.max(maxprev, mat[x][y + 1]);
                }

                // move from right-lower cell
                if (isValid(x + 1, y + 1, n, m)) {
                    maxprev = Math.max(maxprev, mat[x + 1][y + 1]);
                }

                // store the max gold from the three options
                mat[x][y] += maxprev;
            }
        }

        // find the maximum in the first column
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.max(result, mat[i][0]);
        }

        return result;
    }
}