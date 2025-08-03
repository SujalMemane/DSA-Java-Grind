class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long max = 0;

        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        prefixMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
        }

        suffixMax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], nums[i]);
        }

        for (int j = 1; j < n - 1; j++) {
            long val = (long)(prefixMax[j - 1] - nums[j]) * suffixMax[j + 1];
            max = Math.max(max, val);
        }

        return max;
    }
}
