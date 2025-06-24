class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
         List<Integer> lst = new ArrayList<>();
        int n = nums.length;
        int s = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                int l = Math.max(0, i - k);
                int r = Math.min(n - 1, i + k);

                while (s <= r) {
                    if (s >= l) {
                        lst.add(s);
                    }
                    s++;
                }
            }
        }

        return lst;
        
    }
}