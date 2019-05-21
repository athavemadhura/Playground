import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner scan=new Scanner(System.in);
      String str1=scan.nextLine();
      String str2=scan.nextLine();
      str1=str1.replace(str1, str2);
      String[] result=str1.split(" ");
      for(int i=0;i<result.length;i++)
      {
      System.out.println(result[i]);
      }
    }
}