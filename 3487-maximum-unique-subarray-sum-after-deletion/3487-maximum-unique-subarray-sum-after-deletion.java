class Solution {
    public int maxSum(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            
                set.add(num);

            
        }
        int sum=0;
        for(int i:set){
            if(i>0)
            sum+=i;
        }
        if(sum==0){
            sum=Collections.max(set);
        }
        return sum;
    }
}