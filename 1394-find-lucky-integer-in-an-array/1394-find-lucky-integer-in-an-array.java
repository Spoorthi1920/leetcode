class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: arr)
        map.put(num,map.getOrDefault(num,0)+1);
        int max=-1;
        for(int nums: map.keySet()){
            if(map.get(nums)==nums)
                max=nums;

        }
        return max;
        
    }
}