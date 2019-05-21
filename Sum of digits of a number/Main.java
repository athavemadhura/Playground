import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k =0;
    int x = 0;
    while (n>1)
    {
    	x= x+n%10;
        n = (n-n%10)/10;
    }
    System.out.println(x);
    
    }
}