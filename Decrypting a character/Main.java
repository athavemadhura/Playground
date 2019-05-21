import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
  Scanner in = new Scanner(System.in);
     char ch = in.next().charAt(0);
      int q = in.nextInt();
      if('a'<=ch&& ch <= 'z')
      { ch = (char) (ch-q);
       if (ch<'a')
       {ch = (char) (ch+26);}}
      
      
      
      if('A'<=ch && ch<='Z')
      {ch = (char) (ch-q);
       if (ch<'A')
       {ch = (char) (ch+26);}}
      
      System.out.println(ch);
      
      
      
      
      
      // Type your code here
    }
}