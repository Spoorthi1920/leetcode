class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int cneg=0,cpos=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                cneg++;
            }
            else if(nums[i]==0){
                continue;
            }
            else{
                cpos++;
            }
        }
        return Math.max(cneg,cpos);
    }
}