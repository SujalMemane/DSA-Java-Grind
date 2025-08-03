class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for(int i : nums){
            if(((int)Math.log10(i) + 1) % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }
}