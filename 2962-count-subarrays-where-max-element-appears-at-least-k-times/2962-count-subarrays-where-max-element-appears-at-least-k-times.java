class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxi = Integer.MIN_VALUE;
        for (int num : nums) maxi = Math.max(maxi, num);
        int left = 0;
        long maxo = 0;
        long res = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == maxi) maxo++;
            while (maxo >= k) {
                if (nums[left] == maxi) maxo--;
                left++;
            }
            res += left;
        }
        return res;
        
    }
}