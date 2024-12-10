class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num: nums) 
            set.add(num);
        int cnt=0,s=0;
        ArrayList<Integer> lst = new ArrayList<>(set);
        for(int i=0;i<lst.size();i++){
            if(lst.get(i)>k){
                cnt++;
            }
            if(lst.get(i)<k)
            s++;
        }
        if(s>0)
            return -1;
        
            return cnt;
        
        
         
          
        }

        

      
        
    
}