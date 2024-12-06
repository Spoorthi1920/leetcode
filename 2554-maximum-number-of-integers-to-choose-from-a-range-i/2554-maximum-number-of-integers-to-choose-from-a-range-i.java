class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        ArrayList<Integer> lst = new ArrayList<>();
        for(int num: banned) lst.add(num);
        int sum=0,cnt=0;
        for(int i=1;i<=n;i++){
            if(!lst.contains(i)){
                 sum+=i;
                 if(sum<=maxSum) cnt++;
                 else break;
            }
        }
        return cnt;
        
    }
}