class Solution {

    static int[] dr = {1, 0, 0, -1};   // D, L, R, U
    static int[] dc = {0, -1, 1, 0};
    static String dir = "DLRU";

    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> result = new ArrayList<>();
        int n = maze.length;
        StringBuilder path = new StringBuilder();

        if (maze[0][0] == 1 && maze[n - 1][n - 1] == 1) {
            findPath(0, 0, maze, path, result);
        }

        Collections.sort(result); // optional since DLRU already sorted
        return result;
    }

    static boolean isValid(int r, int c, int n, int[][] maze) {
        return r >= 0 && c >= 0 && r < n && c < n && maze[r][c] == 1;
    }

    static void findPath(int r, int c, int[][] maze, StringBuilder path,
                         ArrayList<String> res) {
        int n = maze.length;

        // Destination reached
        if (r == n - 1 && c == n - 1) {
            res.add(path.toString());
            return;
        }

        // Mark visited
        maze[r][c] = 0;

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (isValid(nr, nc, n, maze)) {
                path.append(dir.charAt(i));
                findPath(nr, nc, maze, path, res);
                path.deleteCharAt(path.length() - 1); // backtrack
            }
        }

        // Unmark visited
        maze[r][c] = 1;
    }
}
