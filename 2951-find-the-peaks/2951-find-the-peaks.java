class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        int n = mountain.length;
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for(int i=1;i<n-1;i++){
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                lst.add(i);
            }
        }
        return lst;
    }
}