class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        int maxNum = Integer.MIN_VALUE;
        int n = c.length;
        for(int i=0;i<n;i++){
            maxNum = Math.max(maxNum,c[i]);
        }
        List<Boolean> lst = new ArrayList<>();
        for(int i=0;i<n;i++){
            lst.add(c[i]+ e >= maxNum);

        }
        return lst;
        
    }
}