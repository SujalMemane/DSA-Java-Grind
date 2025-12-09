class Solution {
    public int specialTriplets(int[] nums) {
        //     int count = 0;

        //     for (int i = 0; i < nums.length; i++) {
        //         for (int j = i + 1; j < nums.length; j++) {
        //             if (nums[i] == 2 * nums[j]) {
        //                 for (int k = j + 1; k < nums.length; k++) {
        //                     if(nums[k] == 2 * nums[j] ) {
        //                         count++;
        //                     }
        //                 }
        //             }
        //         }
        //     }
        //     return count;
        // }

        final int MOD = 1_000_000_007;

        Map<Integer, Long> left = new HashMap<>();
        Map<Integer, Long> right = new HashMap<>();

        for (int num : nums) {
            right.put(num, right.getOrDefault(num, 0L) + 1);
        }

        long count = 0;

        for (int j = 0; j < nums.length; j++) {
            int mid = nums[j];

            right.put(mid, right.get(mid) - 1);

            int target = mid * 2;

            long leftCount = left.getOrDefault(target, 0L);
            long rightCount = right.getOrDefault(target, 0L);

            count = (count + (leftCount * rightCount) % MOD) % MOD;

            left.put(mid, left.getOrDefault(mid, 0L) + 1);
        }

        return (int) count;
    }
}