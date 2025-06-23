class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n =word1.length;
        int j = word2.length;
        StringBuilder st = new StringBuilder();
        StringBuilder sp = new StringBuilder();
        for(int i=0;i<n;i++){
            st.append(word1[i]);
        }
        for(int k=0;k<j;k++){
            sp.append(word2[k]);
        }
        if(st.toString().equals(sp.toString()))
        {
            return true;
        }
        
            return false;
        

        
    }
}