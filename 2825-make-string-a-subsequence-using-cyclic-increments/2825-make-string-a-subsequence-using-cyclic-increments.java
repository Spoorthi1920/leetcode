class Solution {
    public boolean canMakeSubsequence(String s, String p) {
        int n = s.length();
        int m = p.length();
        int i=0,j=0;
        while(i<n && j<m){
            int s_asc= s.charAt(i);
                int p_asc = p.charAt(j);
            if(s_asc==p_asc || s_asc+1==p_asc || s_asc-25==p_asc ){
               i++;
               j++;
            }
            else{
                i++;
                        
                }
        }
        return j==m;

        
    }
}