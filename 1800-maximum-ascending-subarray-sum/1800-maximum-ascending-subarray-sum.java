class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int csum =nums[0];
        int maxsum = csum;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                csum += nums[i];
            }
            else{
                csum = nums[i];
            }
            maxsum = Math.max(maxsum,csum);

        }
        return maxsum;
        
    }
}