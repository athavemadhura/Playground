import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
	
      Scanner k = new Scanner(System.in);
      int p = k.nextInt();
      for(int s=1; s<=p; s =s+1)
      {for(int l =1; l<=s; l =l+1)
      {
      	System.out.print(s);
      }
      System.out.print("\n");
      }
    
    
    }
}