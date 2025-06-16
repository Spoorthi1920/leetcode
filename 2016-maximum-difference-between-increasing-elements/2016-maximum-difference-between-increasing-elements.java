class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int max=-1,h;
       // boolean flag=1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j] && i<j){
                    h = nums[j]-nums[i];
                    if(h>max)
                    max=h;

                }
                
            }
        }
        return max;
    }
}