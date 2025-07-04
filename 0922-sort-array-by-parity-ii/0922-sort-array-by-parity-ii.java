class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int even=0,odd=1;
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                a[even]=nums[i];
                even+=2;



            }
            else{
                a[odd] = nums[i];
                odd+=2;
            }
        }
        return a;
    }
}