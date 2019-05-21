import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
int k = sc.nextInt();
int arr[] = new int[k];
int flag[] = new int[1];
for(int g =0; g<k; g = g+1)
{
  arr[g]=sc.nextInt();
}
int s = arr[0];
int q = 0;
for(int l = 0; l<k; l = l+1)
{
	if (arr[l]>s)
    {
    	s = arr[l];
      	q = l;
         
    }
}
  System.out.println(q);

  
  }
}