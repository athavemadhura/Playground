import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
		Scanner k = new Scanner(System.in);
    	int n =1;
        int p = k.nextInt();
      	for(int s =1; s<=p; s= s+1)
        {
        	n = n*s;
        }
    	System.out.println(n);
    }
}