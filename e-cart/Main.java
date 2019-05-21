//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void setPrice(int price){
  this.price=price;
  }
  public int getPrice(){
    return price;
  }
}
   
class Customer  
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setProduct(String product){
  this.product=product;
  }
  public String getProduct(){
  return product;
  }
  public void setQuantity(int quantity){
  this.quantity=quantity;
  }
  public int getQuantity(){
  return quantity;
  }
}

class Bill  
{
  //implement your logic to calculate total price
 public int bill(int qt,int pr){
 int billl;
 Item itemm=new Item();
   Customer customerr=new Customer();
 customerr.setQuantity(qt);
 itemm.setPrice(pr);
   int p=itemm.getPrice();
   int q=customerr.getQuantity();
 billl=p*q;
 return billl;
 }
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    Scanner scan=new Scanner(System.in);
    String productt=scan.nextLine();
    int pricee=scan.nextInt();
    
    int quantityy=scan.nextInt();
     c.setProduct(productt);
    int totalPrice=obj.bill(quantityy, pricee);
    System.out.println("Total Price is : "+totalPrice);
    
    //write the logic here
  }
}