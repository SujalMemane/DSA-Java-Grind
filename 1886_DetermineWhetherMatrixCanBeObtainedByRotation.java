// classic 
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for( int i = 0 ; i < 4 ; i++){
            if(isEqual(mat , target)) {
                return true;
            }else{
                rotate(mat);
            }
        }
        return false;
    }

    public boolean isEqual(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void rotate(int[][] mat) {
        int m = mat.length;

        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][m - 1 - j];
                mat[i][m - 1 - j] = temp;
            }
        }

    }
}

// better 

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int m = mat[0].length;
        int last = n - 1;

        int match90 = 0, match180 = 0, match270 = 0, match0 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[last - j][i] == target[i][j]) {
                    match90++;
                }
                if (mat[last - i][last - j] == target[i][j]) {
                    match180++;
                }
                if (mat[j][last - i] == target[i][j]) {
                    match270++;
                }
                if (mat[i][j] == target[i][j]) {
                    match0++;
                }
            }
        }

        int total = n * n;
        return (match90 == total || match180 == total || match270 == total || match0 == total);
    }
}
