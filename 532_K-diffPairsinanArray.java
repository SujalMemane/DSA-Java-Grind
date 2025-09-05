import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;

        Set<Integer> seen = new HashSet<>();
        Set<Integer> unique = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num - k)) unique.add(num - k);
            if (seen.contains(num + k)) unique.add(num);
            seen.add(num);
        }
        return unique.size();
    }
}
