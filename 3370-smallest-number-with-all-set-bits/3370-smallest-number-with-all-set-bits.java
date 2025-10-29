class Solution {
    public int smallestNumber(int n) {
        int i=1;
        
        while(true){
            String d = Integer.toBinaryString(i);
            int h = d.length();
            int cnt_o=0;
            //int index=i;
            
            for(int j=0;j<h;j++){
                if(d.charAt(j)=='0'){
                    cnt_o++;
                }
                
            }
            if(cnt_o==0 && i>=n){
                
                break;
            }
            
        
         
            
        i++;
        }
        return i;
        
    }
}