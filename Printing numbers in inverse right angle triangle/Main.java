import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
	Scanner k = new Scanner(System.in);
    int p = k.nextInt();
    for(int s =1; s<=p; s=s+1)
    {
    for(int l =p-s+1; l>=1; l =l-1)
    {
    	System.out.print(l);
    }
    	System.out.print("\n");
    
    }
    
    
    
    }
}