class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
    


        int n = fruits.length;
       
        
        
        //Arrays.sort(baskets);
        
        int cnt = 0;
        
       
        for (int i=0;i<n;i++) {
            boolean placed = false;
            
           
            for (int j = 0; j < n; j++) {
                if (baskets[j] >= fruits[i]) {
                  
                    baskets[j] = -1;  
                    placed = true;
                    //cnt++;
                    break;
                }
            }
            if(!placed) cnt++;
            
            // if (!placed) {
            //     continue;  
            // }
        }
        
        
        return cnt;
    }
}

    
