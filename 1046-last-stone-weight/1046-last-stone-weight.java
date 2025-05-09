class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for(int i=0;i<stones.length;i++){
            ls.add(stones[i]);
        }
        while(ls.size()>1){
            int max1 = Collections.max(ls);
            ls.remove(new Integer(max1));
            int max2 = Collections.max(ls);
            ls.remove(new Integer(max2));
            int dif = max1-max2;
            ls.add(dif);
        }
        return ls.get(0);
        
    }
}