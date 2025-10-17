class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = friends.length;
        int [] ord = new int[n];
        HashSet<Integer> frnd = new HashSet<>();
        for(int num:friends){
            frnd.add(num);
        }
        int j=0;
        for(int i=0;i<order.length;i++){
            if(frnd.contains(order[i])){
                ord[j] = order[i];
            j++;
            }
        }
        
        return ord;
    }
}