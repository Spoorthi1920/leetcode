class Solution {
    public int xorOperation(int n, int start) {
        
        int j=0,ele=0;

        for(int i=0;i<n;i++){
            j = start+2*i;
           ele^=j;
        }
        
        return ele;
        
    }
}