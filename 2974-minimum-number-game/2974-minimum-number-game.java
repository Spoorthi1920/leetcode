class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        int [] a = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++) pq.add(nums[i]);
        for(int i=0;i<n && pq.size()>1;i=i+2){
            int d = pq.poll();
            int e = pq.poll();
            a[i] = e;
            a[i+1] = d;

        }
        return a;
    }
}