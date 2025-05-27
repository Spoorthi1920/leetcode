class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        
        int size =0;
        for(int i=0;i<n;i=i+2){
            size+=nums[i];
        }
        int [] a = new int[size];
        int j=0;
        for(int i=0;i<n;i=i+2){
            int freq = nums[i];
            int val = nums[i+1];
            while(freq>0){
                a[j++] = val;
                freq--;

            }
        }

return a;
        
    }
}