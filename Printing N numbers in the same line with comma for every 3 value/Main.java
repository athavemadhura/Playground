import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  	Scanner k = new Scanner(System.in);
    int p = k.nextInt();
    for(int s =1; s<=p; s = s+1)
    {
      if (s==4||s==7||s==10||s==13)
      {
      System.out.print(",");
      System.out.print(s);
      }
      else
      {System.out.print(s);}}
    //Type your code here
  }
}