import java.util.Scanner;
public class Product
{
  public static void main(String args[])
  {
  int n,product=1;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a number:");
  n=sc.nextInt();
    while(n!=0)
    {
      int rem=n%10;
      product=product*rem;
      n=n/10;
    }
    
    System.out.print("product of digits is:" +product);
    
  }
}