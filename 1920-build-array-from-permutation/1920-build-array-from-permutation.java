class Solution {
    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        int k=0;
        int i=0;
        while(i<nums.length)
        {
            ans[k] = nums[nums[i]];
            k++;
            i++;
            
        }
        return ans;
    }
}