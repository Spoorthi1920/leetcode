class Solution {
    public int maxScore(String s) {
        int n= s.length();
        int tscore=0;

        for(int i=1;i<n;i++){
            int lscore=0,rscore=0;
            for(int l=0;l<i;l++){
                if(s.charAt(l)=='0')
                lscore++;
            }
            for(int r=i;r<n;r++){
                if(s.charAt(r)=='1')
                rscore++;
            }
            tscore = Math.max(tscore,lscore+rscore);
        }
        return tscore;
    }
}