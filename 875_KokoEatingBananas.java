class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;

        for (int i : piles) {
            high = Math.max(i, high);
        }

        while (low < high) {
            int rate = low + (high - low) / 2;
            int hrs = 0;

            for(int i : piles){
                hrs += ( i + rate - 1) / rate;
            }

            if( hrs <= h){
                high = rate;
            }else{
                low = rate + 1;
            }
        }
        return  low;
    }
}