class Solution {
    public int[][] generateMatrix(int n) {
        int left = 0, right = n-1 , up = 0 , down = n-1, num =1;
        int[][] matrix = new int[n][n];
    
        while(left <= right && up <= down){

            // top row

            for( int j = left ; j <= right ; j++){
                matrix[up][j] = num;
                num++;
            }
            // right column 
            for( int i = up + 1 ; i <= down ; i++ ){
                matrix[i][right] = num;
                num++;
            }
            // bottom row

            for( int j = right - 1 ; j >= left ; j-- ){
                matrix[down][j] = num;
                num++;
            }
            // left column 
            for( int i = down - 1; i >= up + 1 ; i--){
                matrix[i][left] = num;
                num++;
            }

            left++;
            right--;
            up++;
            down--;
        }
        return matrix;
    }
}