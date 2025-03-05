class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int [] psum = new int[n];
        psum[0] = nums[0];
        for(int i=1;i<n;i++){
            psum[i] = psum[i-1] + nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i] = psum[i];
        }
        return nums;
        
    }
}