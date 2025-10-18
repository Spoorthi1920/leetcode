class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int m = nums2.length;
        int i=0,cnt=0;
        while(i<n){
            for(int j=0;j<m;j++){
                if(nums1[i]%(nums2[j]*k)==0){
                    cnt++;
                }
            }
            i++;
        }
        return cnt;
        
    }
}