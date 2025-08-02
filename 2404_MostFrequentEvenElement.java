import java.util.*;

class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
        }

        int maxFreq = 0;
        int result = -1;
        for (int num : freq.keySet()) {
            int currFreq = freq.get(num);
            if (currFreq > maxFreq || (currFreq == maxFreq && num < result)) {
                maxFreq = currFreq;
                result = num;
            }
        }
        return result;
    }
}
