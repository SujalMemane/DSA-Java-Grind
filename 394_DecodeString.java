class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        String currStr = "";
        int currNum = 0;

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                currNum = currNum * 10 + (c - '0');  
            }

            else if (c == '[') {
                numStack.push(currNum);
                strStack.push(currStr);
                
                currNum = 0;
                currStr = "";
            }

            else if (c == ']') {
                int repeat = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());

                for (int i = 0; i < repeat; i++) {
                    temp.append(currStr);
                }

                currStr = temp.toString(); 
            }

            else { 
                currStr += c;  
            }
        }

        return currStr;
    }
}
