class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] answer = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();

        for( int i = 0 ; i < temperatures.length ; i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int prevIdx = st.pop();
                answer[prevIdx] = i - prevIdx;
            }

            st.push(i);
        }
        
        
        return answer;
    }
}