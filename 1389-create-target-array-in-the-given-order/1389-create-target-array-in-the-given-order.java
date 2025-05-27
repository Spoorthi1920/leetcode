class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        ArrayList<Integer> lst =new ArrayList<>();
        for(int i=0;i<n;i++){
            lst.add(index[i],nums[i]);
        }
        int [] a = new int[lst.size()];
        
        for(int j=0;j<lst.size();j++){
            a[j] = lst.get(j); 

        }
        return a;


        
    }
}