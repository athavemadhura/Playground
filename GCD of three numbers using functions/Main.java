import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    	   Scanner scan=new Scanner(System.in);
      int x=scan.nextInt();
      int y=scan.nextInt();
      int z=scan.nextInt();
      int p=GCDf3(x,y,z);
      System.out.println(p);
	}
  public static int GCDf3(int x,int y,int z)
  { 
    int min=0;
    int min2=0;
    int gcd=1;
    int gcdmain=1;
    if(x<y)
    {
      min=x;
    }
    else
      min=y;
    if(x%min==0 && y%min==0)
    {
      gcd=min;
    }
    else
    {
      for(int i=min;i>=1;i--)
      {
        if(x%i==0 && y%i==0)
          gcd=i;
        break;
      }
    if(gcd==1)
    {
      return gcd;
    }
      else
      {
        if(gcd<z)
          min2=gcd;
        else
        {
          min2=z;
        }
        for(int i=min2;i>=1;i--)
        {
          if(gcd%i==0 && z%i==0)
          gcdmain=i;
          break;
        }
      }
      
    }
    return gcd;
  }
	}
