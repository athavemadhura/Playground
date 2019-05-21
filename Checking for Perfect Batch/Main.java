import java.util.Scanner;
class Main {
public static int check(int z,int arr[])
{
  int sum = arr[0]+arr[1]+arr[2];
  int q =0;
  for (int d = z; d<z+3; d = d+1 )
  {
    q = q + arr[d];
  }
 if (q==sum)
{
  return 1;
}
else
{
  return 0;
}
}

public static void main(String[] args) {
int l =0;
Scanner sc = new Scanner(System.in);
int k = sc.nextInt();
int arr[] = new int[k];
int flag[] = new int[1];
for(int g =0; g<k; g = g+1)
{
  arr[g]=sc.nextInt();
}


for(int s = 0; s<=k-3; s = s+3)
{
  if (check(s,arr)==0)
  {
    System.out.println("Not a Perfect Batch");
    l = 44;
  }  
  

}
if (l!=44)
{
  System.out.println("Perfect Batch");
}


  }
}