class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        int n = a.length;

        for (int i = 0; i < n; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1);
            
            // Two-pointer reverse
            while (start < end) {
                char temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }
        }
        return new String(a);
    }
}