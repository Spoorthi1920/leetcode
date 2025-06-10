class Solution {
    public int maxDifference(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxOdd = Integer.MIN_VALUE;
        int maxEven = Integer.MAX_VALUE;

       
        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                maxEven = Math.min(maxEven, freq);
            } else {
                maxOdd = Math.max(maxOdd, freq);
            }
        }

        
        return maxOdd - maxEven; 
    }
}