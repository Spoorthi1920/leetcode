class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();

        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(!Character.isDigit(c)){
                //sb.append(c);
                 st.push(c);
            }
           
            else{
                if(!st.isEmpty())
                st.pop();
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
        


        
    }
}