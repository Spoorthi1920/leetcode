class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = s.length();
        int m = spaces.length;
        StringBuilder str = new StringBuilder();
        int i=0,j=0;
        int cnt_pt=0,cnt_sp=0;
        while(i<n && j<m){
            if(i<spaces[j]){
            str.append(s.charAt(i));
            cnt_pt++;
            i++;
            }
            else{
                str.append(" ");
                 j++;
                 
            }
            
        }
        for(int k=cnt_pt;k<n;k++){
            str.append(s.charAt(k));
        }
        
        
        
        
        
       return str.toString();

        

        
    }
}