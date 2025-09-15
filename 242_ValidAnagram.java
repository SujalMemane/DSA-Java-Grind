class Solution {
    public boolean isAnagram(String s, String t) {

        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        String strS = new String(charS);

        char[] charT = t.toCharArray();
        Arrays.sort(charT);
        String strT = new String(charT);

        if( strS.compareTo(strT) == 0 ){
            return true;
        }
        return false;
    }
}