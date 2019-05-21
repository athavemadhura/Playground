import java.util.Scanner;
class Main
{
	public static int square(int q)
    {
    	return q*q;
    }
  
  
  public static void main (String[] args)
    {
	 Scanner l = new Scanner(System.in);
    int a = l.nextInt();
    System.out.println(square(a));
	} 
}