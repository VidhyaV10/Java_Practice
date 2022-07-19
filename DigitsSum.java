/*Write a JAVA program to calculate sum of digits of a number. */
import java.util.Scanner;
class DigitsSum
{
  public static void main(String args[])
  {
  int lastDigit=0,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of digits");
  int n=sc.nextInt();
  while(n>0)
    {
      lastDigit=n%10;
      sum=sum+lastDigit;
      n=n/10;
    }
    System.out.println("Sum of digits in number is: "+sum);
  }


}