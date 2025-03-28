class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0;
        int idx=-1;
        int h = letters.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(letters[mid]>target){
                idx=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return idx==-1?letters[0]:letters[idx];
    }
}