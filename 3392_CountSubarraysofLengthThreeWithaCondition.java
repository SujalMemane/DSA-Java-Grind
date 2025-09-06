class Solution {
    public int countSubarrays(int[] nums) {
        int n = nums.length;
        int pair = 0 ;
        if(n < 3){
            return 0 ;
        }
        for(int i  = 0 ; i < n - 2 ; i++){
            if(2 * (nums[i] + nums[i + 2]) == nums[i+ 1] ){
                pair++;
            }
        }
        return pair;
    }
}