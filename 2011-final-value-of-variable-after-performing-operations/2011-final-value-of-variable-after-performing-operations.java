class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        int n = operations.length;
        for(int i=0;i<n;i++)
        {
            System.out.println("here");
            if((operations[i].equals( "X++")) || (operations[i].equals("++X"))){
               
            x++;
            }
            else{
                 
            x--;
            }
           

        }
         return x;
    }
}