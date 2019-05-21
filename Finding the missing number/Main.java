import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
      int count=0;
      
      int n=scan.nextInt();
      int[] arr=new int[n];
      int[] arr1=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=scan.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          if(j==arr[i])
          {
           arr1[j-1]=j;
          }
        }
      }
      for(int z=1;z<=n;z++)
      {
        if(z!=arr1[z-1])
          System.out.println(z);
      }
     
    }
}