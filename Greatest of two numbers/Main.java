import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int m=scan.nextInt();
      if(m>n)
      {
        System.out.println("num2 is the greatest number");
      }
      else if(m==n)
      {
        System.out.println(m);
      }
      else
      {
        System.out.println("num1 is the greatest number");
      }
      
      
		// Type your code here
	}
}