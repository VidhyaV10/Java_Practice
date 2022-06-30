import java.util.Scanner;
public class Digits
{
  public static void main(String args[])
  {
  int n,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a number:");
  n=sc.nextInt();
  int lastdigit=n%10;
  while(n>10)
    {
      n=n/10;
    }
    sum=lastdigit+n;
    System.out.println("first digit=" +n);
    System.out.println("last digit=" +lastdigit);
    System.out.print("Sum of last and first digit:" +sum);
    
  }
}