class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }

        int count = 0;
        for (String word : words) {
            boolean flag = true;
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }

        return count;
        
    }
}