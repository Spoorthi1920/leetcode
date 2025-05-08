class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        for(int i=0;i<n;i++){
            pq.add(nums[i]);
        }
        int maxele = pq.peek();
        pq.poll();
        int sec_ele = pq.peek();
        int max_sum = (maxele-1)*(sec_ele-1);

        return max_sum; 
        
    }
}