import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
Scanner scan=new Scanner(System.in);
      int choice=scan.nextInt();
      switch(choice)
      {
        case 1:
          {
            int side=scan.nextInt();
            System.out.println(side*side);
            break;
          }
        case 2:
          {
            int length=scan.nextInt();
            int breadth=scan.nextInt();
            System.out.println(length*breadth);
            break;
          }
        case 3:
          {
            int base=scan.nextInt();
              int height=scan.nextInt();           
System.out.println((base*height)/2);
            break;
          }
        case 4:
          {
             float radius=scan.nextFloat();
            System.out.println(3.14*radius*radius);
            break;
          }
          
      }
    }
}