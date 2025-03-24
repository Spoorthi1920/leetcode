class Solution {
    public String reverseVowels(String s) {
        char [] a = s.toCharArray();
        int n = a.length;
        int i=0,j=n-1;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        while(i<j){
           if(set.contains(a[i]) && set.contains(a[j])){
                char temp = a[i];
              a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
                
            }
            else if(set.contains(a[i])){
                j--;
            }
            else{
                i++;
            }
            
        }
        String p = String.copyValueOf(a);
        return p;

        
    }
}