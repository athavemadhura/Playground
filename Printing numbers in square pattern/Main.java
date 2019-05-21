import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
	Scanner k = new Scanner(System.in);
      int p = k.nextInt();
      for(int u =1; u<=p; u = u+1)
      {int h =0;
      	while(h<p)
        {
        	System.out.print(u);
          h = h+1;
        }
      	System.out.print("\n");
      }
    
    
    
    }
}