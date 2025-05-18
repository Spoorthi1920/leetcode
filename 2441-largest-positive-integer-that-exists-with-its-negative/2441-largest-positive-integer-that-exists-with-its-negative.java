class Solution {
    public int findMaxK(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=n-1;i>=0;i--){
            if(nums[i]>0 && Arrays.binarySearch(nums, -nums[i])>=0) return nums[i];
        }
        return -1;
        
    }
}