class Solution {
    public boolean canAliceWin(int[] nums) {
        int SingleSum = 0 ; 
        int DoubleSum = 0 ;

        for (int i : nums) {
            if (i < 10) {
                SingleSum += i;
            } else {
                DoubleSum += i;
            }
        }

        return SingleSum > DoubleSum || DoubleSum > SingleSum;
    }
}