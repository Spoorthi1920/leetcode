class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int n = nums.length;
        int [] psum = new int[n];
        psum[0] = nums[0];
        int cnt_0=0;
        for(int i=1;i<n;i++){
            psum[i] = psum[i-1] + nums[i];
            if(psum[i]==0) cnt_0++;
        }
        return cnt_0;
    }
}