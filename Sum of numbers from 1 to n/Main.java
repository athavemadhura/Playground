import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
	Scanner w = new Scanner(System.in);
     int n = w.nextInt();
     int k =0;
      for(int s =0; s<=n; s=s+1)
      {
      	k = k+s;
      }
    System.out.println(k);
    
    }
}