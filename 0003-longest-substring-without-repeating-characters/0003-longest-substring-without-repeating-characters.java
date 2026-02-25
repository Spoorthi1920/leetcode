class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int l=0,ans=0;
        for(int r=0;r<n;r++){
            char c = s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            ans= Math.max(ans,r-l+1);

        }
        return ans;
    }
}