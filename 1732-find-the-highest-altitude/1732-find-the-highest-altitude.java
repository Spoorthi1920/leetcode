class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int [] psum = new int[n+1];
        int p = psum.length;
        psum[0] = 0;
        int maxsum=psum[0];
        for(int i=1;i<=n;i++){
            psum[i] = psum[i-1] + gain[i-1];
            
            maxsum = Math.max(maxsum,psum[i]);
        }
        return maxsum;
    }
}