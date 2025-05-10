class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int [] psum = new int[n];
        int [] ssum = new int[n];
        psum[0] = 0;
        ssum[n-1] = 0;
        for(int i=1;i<n;i++){
            psum[i] = psum[i-1]+ nums[i-1];
           
            

        }
        
        for(int i=n-2;i>=0;i--){
            ssum[i] = ssum[i+1] + nums[i+1];
            
           

        }
        
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Math.abs(psum[i]-ssum[i]);
            System.out.println(a[i]);
        }
        return a;
    }
}