class Solution {
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        int p = s.length();
        
        for(int i=0;i<p-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                return false;
               

            }
        }
        return true;
        

        
    }
}