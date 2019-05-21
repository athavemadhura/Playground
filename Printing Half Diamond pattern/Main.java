import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
	Scanner k = new Scanner(System.in);
    int p = k.nextInt();
    for(int rn =1; rn<=p; rn = rn+1)
    {
    	for(int sn = 1; sn<=p-rn; sn =sn+1)
        {
        	System.out.print(" ");
        }
    	for(int srn = 1; srn <=2*rn-1; srn=srn +1)
        {
        	System.out.print("*");
        }
    System.out.print("\n");
    
    }
      
    
    
    
    
    
    
    }}