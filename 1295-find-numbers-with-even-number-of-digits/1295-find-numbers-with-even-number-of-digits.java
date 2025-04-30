class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count =0;
        for(int i=0;i<n;i++){
            int x = digicount(nums[i]);
            if(x%2==0) count++;
        }
        return count;
        
    }
    public int digicount(int dig){
        int cnt=0;
        while(dig>0){
            int rem = dig%10;
            cnt++;
            dig=dig/10;
        }
        return cnt;

    }
}