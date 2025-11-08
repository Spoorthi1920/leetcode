class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int tar_cnt=0,notar_cnt=0;
            for(int j=i;j<n;j++){
                if(nums[j]==target) tar_cnt++;
                else notar_cnt++;

                if(tar_cnt>notar_cnt) ans++; 
            }
        }
        return ans;
    }
}