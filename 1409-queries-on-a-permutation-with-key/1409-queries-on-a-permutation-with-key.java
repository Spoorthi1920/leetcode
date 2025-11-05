class Solution {
    public int[] processQueries(int[] queries, int m) {
        int n = queries.length;
        int [] ans = new int[n];
        int [] per = new int[m];
        for(int i=0;i<m;i++){
            per[i] = i+1;
        }
        int j=0;
        while(j<n){
            int idx=0;
            for(int i=0;i<m;i++){
                if(queries[j]==per[i]){
                    ans[j]=i;
                    //per[i]=0;
                    idx=i;
                }
            }
            while(idx>0){
                int temp = per[idx];
                per[idx] = per[idx-1];
                per[idx-1] = temp;
                idx--;
            }
            j++;
        }

        return ans;


        
    }
}