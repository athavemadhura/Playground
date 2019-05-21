//import required packages
import java.util.Scanner;
class Faculty
{
   private int salary;
    public void setSalary(int salary){
    this.salary=salary;
    }
    public int getSalary(){
    return salary;
    }
  public void salary()
  {
    //write your Faculty class statements
   System.out.println("Base Salary: "+getSalary());
  }
}
class CSE extends Faculty
{
  public void salary(int sall)
  {
    //write your CSE class statements
    Faculty fac=new Faculty();
   fac.setSalary(sall);
    int total=fac.getSalary()+3000;
   System.out.println("CSE Faculty: "+total);
  }
}
class IT extends Faculty
{
  public void salary(int sall)
  {
    //write your IT class statements
     Faculty fac=new Faculty();
     fac.setSalary(sall);
    int total=fac.getSalary()+5000;
     System.out.println("IT Faculty: "+total);
  }
}
class ECE extends Faculty
{
  public void salary(int sall)
  {
    //write your ECE class statements
    Faculty fac=new Faculty();
   fac.setSalary(sall);
    int total=fac.getSalary()+4500;
     System.out.println("ECE Faculty: "+total);
  }
}

class Main
{
  public static void main(String[] args)
  {
    ECE obje = new ECE();
    CSE objc = new CSE();
    IT obji= new IT();
    Faculty facc=new Faculty();
   
    Scanner scan=new Scanner(System.in);
    int sal=scan.nextInt();
    facc.setSalary(sal);
    facc.salary();
    objc.salary(sal);
    obji.salary(sal);
    obje.salary(sal);
    //implement your required concept here
    
  }
}