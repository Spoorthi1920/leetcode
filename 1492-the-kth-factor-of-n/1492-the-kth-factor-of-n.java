class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> ls = new ArrayList<>();

        for(int i=1;i<=n/i;i++){

            if(n%i==0){
                ls.add(i);
                if(i!=n/i)
                ls.add(n/i);
            }
        }
        Collections.sort(ls);
        if(k>ls.size()) return -1;
        return ls.get(k-1);
        
    }
}