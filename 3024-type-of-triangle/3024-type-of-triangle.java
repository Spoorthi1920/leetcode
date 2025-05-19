class Solution {
    public String triangleType(int[] nums) {
        int n = nums.length;
        if(nums[0]+nums[1]<=nums[2] || nums[1]+nums[2]<=nums[0] || nums[0]+nums[2]<=nums[1]){
            return "none";
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums) set.add(i);
        int p = set.size();

        if(p==1) return "equilateral";
        else if(p==2) return "isosceles";
        else return "scalene";
        
    }
}