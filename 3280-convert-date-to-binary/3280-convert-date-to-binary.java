class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        for(String s : date.split("-")){
            sb.append(Integer.toBinaryString(Integer.parseInt(s)));
            sb.append("-");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}