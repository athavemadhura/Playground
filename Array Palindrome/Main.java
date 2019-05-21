import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      int count=0;
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=scan.nextInt();
      }
      int[] arr1=new int[n];
      for(int i=0;i<n;i++)
      {
        arr1[i]=arr[n-(i+1)];
      }
      for(int i=0;i<n;i++)
      {
       
          if(arr[i]!=arr1[i])
          {
      count++;
          }
      
  
      }
      if(count==0)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
        
   
          
    }
}