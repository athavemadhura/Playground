import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner scan=new Scanner(System.in);
	   int x=scan.nextInt();
      int y=scan.nextInt();
      int z=scan.nextInt();
      int p=Greatestof3(x,y,z);
      System.out.println(p);
	}
  
 public static int Greatestof3(int p,int q, int r)
  {
    if(p>q && q>r)
    {
      return p;
    }
    else if(q>r)
    {
      return q;
    }
    else
    {
      return r;
    }
}
}