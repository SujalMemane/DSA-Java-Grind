class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i = 0 ; i < s.length() ; i++ ){
            char c = s.charAt(i);

            if( sb.length() > 0 && sb.charAt(sb.length()-1)== c){
                count++;
            }else{
                count = 1;
            }if(count < 3){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}