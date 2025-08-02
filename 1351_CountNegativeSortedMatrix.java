//old 
class Solution {
    public int countNegatives(int[][] grid) {
        int negCount = 0 , posCount = 0 ; 
        for(int i = 0 ; i < grid.length ; i++){
            for( int j = 0 ; j < grid[i].length ; j++){
                if(grid[i][j] < 0) negCount++;
            }
        }
        return negCount; 
    }
}

// new faster 
class Solution {
    public int countNegatives(int[][] grid) {
        int height = grid.length;
        int length = grid[0].length; 
        int negCount = 0 ; 
        int i = 0 , j  = length - 1; 
    
        while  ( i < height && j >= 0 ){
            if ( grid[i][j]  < 0 ){
                negCount += (height - i) ; 
                j--; 
            } else {
                i++;
            }
        }
        return negCount; 
    }
}