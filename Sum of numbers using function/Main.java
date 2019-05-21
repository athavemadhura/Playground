import java.util.Scanner;
class Main{
		public static int sum(int n)
    {
    
      int s =1;
      int sum =0;
      while (s<=n)
      {
      	sum = sum +s;
        s = s+1;
      }
    return sum;
    
    }	
  
  
  
  
  public static void main (String[] args){
	    // Type your code here
		
    Scanner k = new Scanner(System.in);
      int l = k.nextInt();
    
    
    System.out.println(sum(l));
    
    
    }
}