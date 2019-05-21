import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner a = new Scanner(System.in);
      int p = a.nextInt();
      int k = p%10;
      int l = 1;
      int z =1;
      int n = 0;
      while (n<p)
      {
        if (p/z>10)
        {
          z = z*10;
          l = l+1;
        }
        n= n+1;
      }
      int q = p/z;
      int x = k + q;
      System.out.println(x);

      
  }
}