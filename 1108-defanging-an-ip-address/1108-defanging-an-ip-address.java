class Solution {
    public String defangIPaddr(String address) {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                s.append("[");
                s.append(".");
                s.append("]");

            }
            else{
                s.append(address.charAt(i));
            }
        }
        return s.toString();
    }
}