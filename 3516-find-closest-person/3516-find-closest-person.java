class Solution {
    public int findClosest(int x, int y, int z) {
        int d = Math.abs(z-x);
        int e = Math.abs(z-y);
        if(d<e) return 1;
        else if(d>e) return 2;
        else return 0;
        
    }
}