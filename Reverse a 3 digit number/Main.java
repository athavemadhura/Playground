import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
   while(a!=0)
   {
  
   int reverse=0;
   int rem=a%10;
    reverse=reverse*10+rem;
    a=a/10;
   System.out.print(reverse);
}
   
  }
}
