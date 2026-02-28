class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum=0;
        for(int num:nums){
            sum+=num;
            pq.add((double)num);
        }
        sum= sum/2;
        int ans=0;
        while(sum>0){
            double curr = pq.poll();
            curr = curr/2;
            pq.add(curr);
            sum-=curr;
            ans++;

        }
        return ans;

        
    }
}