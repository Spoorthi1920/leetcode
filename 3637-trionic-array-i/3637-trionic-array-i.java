class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;

        for (int p = 1; p < n - 2; p++) {
            
            boolean incr1 = true;
            for (int i = 0; i < p; i++) {
                if (nums[i] >= nums[i + 1]) {
                    incr1 = false;
                    break;
                }
            }
            if (!incr1) continue;

            for (int q = p + 1; q < n - 1; q++) {
               
                boolean decr = true;
                for (int i = p; i < q; i++) {
                    if (nums[i] <= nums[i + 1]) {
                        decr = false;
                        break;
                    }
                }
                if (!decr) continue;

                
                boolean incr2 = true;
                for (int i = q; i < n - 1; i++) {
                    if (nums[i] >= nums[i + 1]) {
                        incr2 = false;
                        break;
                    }
                }

                if (incr2) return true;
            }
        }

        return false;
        
    }
}