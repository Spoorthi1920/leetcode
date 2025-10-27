class Solution {
    public int numberOfBeams(String[] bank) {
        
        int cnt=0,prev=0;
        for(String flr: bank){

            int curr=0;
            for(int i=0;i<flr.length();i++){
                if(flr.charAt(i)=='1'){
                    curr++;
                } 
            }
            cnt+=curr*prev;
            prev = curr>0? curr:prev;
        }

        return cnt;
    }
}