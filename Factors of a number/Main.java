import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
	Scanner k = new Scanner(System.in);
    int p =k.nextInt();
    for(int s=1; s<=p; s= s+1)
    {
    if (p%s==0)
    {
    	System.out.println(s);
    }
    }
    
    
    }
}