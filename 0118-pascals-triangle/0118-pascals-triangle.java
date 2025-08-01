class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);

            if(i>0){
                 List<Integer> pre = ls.get(i - 1);
                 for(int j=1;j<i;j++){
                    row.add(pre.get(j-1)+pre.get(j));
                 }
                 row.add(1);
            }
            ls.add(row);

        }
        return ls;
    }
}