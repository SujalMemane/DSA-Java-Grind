class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0 ; 
        int tempOnes = 0 ; 

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                tempOnes++;
            }
            else{
                if(tempOnes >= maxOnes){
                    maxOnes = tempOnes;
                }
                tempOnes = 0;
            }
        }
        maxOnes = Math.max(maxOnes , tempOnes);
        return maxOnes;
    }
}