class Solution {
    public boolean isPalindrome(int x) 
    {
        //Scanner s=new Scanner(System.in);
        //x=s.nextInt();
       long  sum=0;
       long  temp=x;
       long r=0;
       
       if(x<0)
       return false;
       


       while(temp!=0)
       {

       
       r=(int)temp%10;
       sum=(sum*10)+r;
       temp=temp/10;
       }
       
       return sum==x;
       
       
        
    }
}