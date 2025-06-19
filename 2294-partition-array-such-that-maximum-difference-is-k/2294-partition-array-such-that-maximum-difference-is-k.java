class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt=1;
        int n = nums.length;
        int num= nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]-num>k)
            {cnt++;

            num = nums[i];
            }
        }
        return cnt;
    }
}