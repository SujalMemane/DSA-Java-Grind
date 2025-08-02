class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        int totalGroups = (len + k - 1) / k;
        String[] result = new String[totalGroups];
        char[] chars = s.toCharArray();
        
        int index = 0;
        for (int i = 0; i < totalGroups; i++) {
            StringBuilder sb = new StringBuilder(k);
            for (int j = 0; j < k; j++) {
                if (index < len) {
                    sb.append(chars[index++]);
                } else {
                    sb.append(fill);
                }
            }
            result[i] = sb.toString();
        }
        return result;
    }
}
