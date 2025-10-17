class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        HashMap<Integer,Integer> hm = new HashMap<>(); 
        int [] ans = new int[n];
        for(int i=0;i<n;i++){
            int cnt=0;
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            hm.put(B[i],hm.getOrDefault(B[i],0)+1);
           

            for(int num: hm.keySet()){
                if(hm.get(num)==2)
                 cnt++;

            }
            ans[i] = cnt;

        }
        return ans;
        
    }
}