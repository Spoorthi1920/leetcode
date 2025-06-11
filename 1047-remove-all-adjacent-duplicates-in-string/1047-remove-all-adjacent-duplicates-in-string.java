class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        StringBuilder sp = new StringBuilder();
        st.push(s.charAt(0));
        for(int i=1;i<n;i++){
            if(!st.isEmpty() && s.charAt(i)==st.peek()){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
                
            }

        }
        while(!st.isEmpty()){
            sp.append(st.pop());
        }
        return sp.reverse().toString();
        
    }
}