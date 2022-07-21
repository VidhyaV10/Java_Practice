/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
public class ArithmeticException 
{
   void division(int a,int b)
  {
    int c=a/b;
    System.out.println("division of Two numbers: "+c);
  }
  public static void main(String[] args)
  {
    ArithmeticException ex=new ArithmeticException();
    ex.division(10,0);//Here, we are dividing 10 by 0,hence ArithmeticException occurs in this program
  }
}


