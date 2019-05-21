import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner scan=new Scanner(System.in);
      int base=scan.nextInt();
      int exponent=scan.nextInt();
      int ans=1;
      
      while(exponent>0)
      {
        ans=base*ans;
        exponent=exponent-1;
      }
      System.out.println(ans);
    }
}