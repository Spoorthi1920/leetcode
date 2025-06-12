class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
       StringBuilder sp = new StringBuilder();
       //st.push(s.charAt(0));
       for(int i=0;i<n;i++){
        char c = s.charAt(i);
        if(c=='('){
            if(!st.isEmpty()){
            sp.append(c);
        }
           
         st.push(c);      

        }
        
        else{
            st.pop();
            if(!st.isEmpty())
            sp.append(c);

        }
        
       }
       return sp.toString();


        
        
    }
}