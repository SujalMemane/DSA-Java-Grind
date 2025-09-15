class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        HashSet<Character> broken = new HashSet<>();

        for(int i = 0 ; i < brokenLetters.length() ; i++){
            broken.add(brokenLetters.charAt(i));
        }

        String[] words = text.split(" ");
        int total = words.length;

        for( String word : words){
            for(char letter : word.toCharArray()){
                if(broken.contains(letter)){
                    total--;
                    break;
                }
            }
        }
        return total;
    }
}