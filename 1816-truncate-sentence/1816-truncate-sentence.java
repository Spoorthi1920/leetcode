class Solution {
    public String truncateSentence(String s, int k) {
        int words = 0;
        int idx = 0;

        while (idx < s.length() && words < k) {
            if (s.charAt(idx) == ' ') {
                words++;
            }
            idx++;
        }
        
        return words == k ? s.substring(0, idx - 1) : s;
        
        
    }
}