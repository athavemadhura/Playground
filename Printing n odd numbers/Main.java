import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here

    Scanner k = new Scanner(System.in);
    int n = k.nextInt();
      for(int p = 1; p<=2*n-1; p = p+2)
      {
      	System.out.println(p);
      }
    
    }
}