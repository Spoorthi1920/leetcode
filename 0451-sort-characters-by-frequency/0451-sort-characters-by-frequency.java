class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
            {
            char c = s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> ls = new ArrayList<>(hm.entrySet());
        ls.sort((a,b) -> b.getValue()- a.getValue());
        
        StringBuilder sb = new StringBuilder();
        
       for(Map.Entry<Character,Integer> entry : ls){
        for(int i=0;i<entry.getValue();i++){
            sb.append(entry.getKey());
        }
       }

        
        return sb.toString();
    }
}