class Solution {
    public String firstPalindrome(String[] words) {
        for(String word: words){
            StringBuilder rev = new StringBuilder(word).reverse();
            if(word.equals(rev.toString())) return word;

        }
        return "";
    }
}