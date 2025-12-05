class Solution {
    public int countPartitions(int[] nums) {
        int partitions = 0;

        for( int i = 1 ; i < nums.length ; i++){
            int leftSum = 0 ;
            int rightSum = 0 ;

            for( int j = 0 ;  j < i  ; j++ ){
                leftSum += nums[j];
            }

            for( int j = i ;  j < nums.length  ; j++ ){
                rightSum += nums[j];
            }

            if( (leftSum + rightSum ) % 2 == 0 ){
                partitions++;
            }
        }
        return partitions ;
    }
}