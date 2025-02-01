class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        int cntparity=0;
        for(int i=0;i<n-1;i++){
            int cntg=0,cnth=0;
            String g = Integer.toBinaryString(nums[i]);
            String h = Integer.toBinaryString(nums[i+1]);
            for(int j=0;j<g.length();j++){
                if(g.charAt(j)=='1'){
                    cntg++;
                }

            }
            for(int k=0;k<h.length();k++){
                if(h.charAt(k)=='1'){
                    cnth++;
                }
                
            }
            if(cntg == cnth)
            cntparity++;
        }
        return cntparity== n-1;
        
    }
}