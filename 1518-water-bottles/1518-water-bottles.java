class Solution {
    public int numWaterBottles(int B, int E) {
        int btls=0;

        while(B>=E){

            btls+=E;
            B -=E;
            B++;
        }
        return btls+B;
    }
}