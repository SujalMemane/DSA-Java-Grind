class Solution {
    public int missingNumber(int[] nums) {
        int TotalSum = (nums.length * ( nums.length + 1)) / 2 ;
        for ( int n : nums){
            TotalSum = TotalSum - n ;
        }
        return TotalSum ;
    }
}