class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[][] alive = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;

                for (int x = -1; x <= 1; x++) {
                    for (int y = -1; y <= 1; y++) {
                        if (x == 0 && y == 0) continue; 
                        int ni = i + x, nj = j + y;
                        if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                            if (board[ni][nj] == 1) count++;
                        }
                    }
                }

                if (board[i][j] == 1) { 
                    if (count < 2 || count > 3) alive[i][j] = 0;
                    else alive[i][j] = 1;
                } else {
                    if (count == 3) alive[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = alive[i][j];
            }
        }
    }
}
