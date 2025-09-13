class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        String vowels = "aeiou";
        int v_freq=0,c_freq=0;
        for(char p : map.keySet()){
            if(vowels.indexOf(p)!=-1){
                v_freq = Math.max(v_freq,map.get(p));
            }
            else{
                c_freq = Math.max(c_freq,map.get(p));
            }
        }
        return v_freq+c_freq;
    }
}