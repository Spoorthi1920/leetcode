class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i=0,j=n-1;
        int min_ans =Integer.MIN_VALUE;
        while(i<j){
            int sum = nums[i]+nums[j];
            min_ans=Math.max(sum,min_ans);
            i++;
            j--;

        }
        return min_ans;
    }
}