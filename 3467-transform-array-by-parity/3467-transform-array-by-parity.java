class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                a[i]=0;
            }
            else{
                a[i]=1;
            }
        }
        Arrays.sort(a);
        return a;
        
    }
}