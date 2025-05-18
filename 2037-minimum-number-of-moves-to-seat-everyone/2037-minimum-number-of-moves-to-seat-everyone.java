class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        int cnt=0;
        Arrays.sort(students);
        for(int i=0;i<seats.length;i++){
            cnt+=Math.abs(seats[i]-students[i]);
        }
        return cnt;
    }
}