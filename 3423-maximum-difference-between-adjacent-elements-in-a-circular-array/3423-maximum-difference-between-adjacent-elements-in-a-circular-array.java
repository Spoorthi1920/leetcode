class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int d = Math.abs(nums[0]-nums[n-1]);
        int max_di = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            int max_diff = Math.abs(nums[i]-nums[i+1]);
            max_di = Math.max(max_di,max_diff);

        }
        max_di = Math.max(max_di,d);

        return max_di;
        
    }
}