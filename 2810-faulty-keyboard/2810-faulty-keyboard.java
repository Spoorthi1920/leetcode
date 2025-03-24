class Solution {
    public String finalString(String s) {
        char[] arr = new char[s.length()];
        int index = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'i') {
                reverse(arr, index);
            } else {
                arr[index++] = c;
            }
        }
        return new String(arr, 0, index);
        
    }
    private void reverse(char[] arr, int length) {
        int left = 0, right = length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}