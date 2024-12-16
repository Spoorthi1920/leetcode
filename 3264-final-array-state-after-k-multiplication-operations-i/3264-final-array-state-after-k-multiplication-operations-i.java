class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        int min=0;
       for(int j=0;j<k;j++){
            min=0;
            for(int i=0;i<n;i++){
                if(nums[i]<nums[min])
                min=i;
            }
            nums[min] = multiplier*nums[min];


            }
        return nums;
        
    }
}