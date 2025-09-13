import java.util.*;

class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        int maxVowel = 0;
        int maxConsonant = 0;

        for (int i = 0; i < 26; i++) {
            char c = (char)(i + 'a');
            if (freq[i] > 0) {
                if (vowels.contains(c)) {
                    maxVowel = Math.max(maxVowel, freq[i]);
                } else {
                    maxConsonant = Math.max(maxConsonant, freq[i]);
                }
            }
        }

        return maxVowel + maxConsonant;
    }
}
