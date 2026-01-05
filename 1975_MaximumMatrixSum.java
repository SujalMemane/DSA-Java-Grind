class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long totalSum = 0;
        int negativeCount = 0 ;
        int minAbs = Integer.MAX_VALUE;

        for(int i = 0  ; i < matrix.length ; i++){
            for( int j = 0 ; j < matrix[0].length ; j++){
                int val = matrix[i][j];
                if(val < 0 ) negativeCount++;

                int absVal = Math.abs(val);
                totalSum += absVal;

                minAbs = Math.min(minAbs , absVal);
                
            }
        }

        if( negativeCount % 2 == 0){
            return totalSum ; 
        }else{
            return totalSum - 2L * minAbs;
        }
    }
}