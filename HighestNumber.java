/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class HighestNumber
  {
    //Add main method
    public static void main(String args[])
    {
      //Declare the three variables
      //Use the scanner class to provide input at execution time 
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the first integer: ");
        int num1=sc.nextInt();
        System.out.print("enter the Second integer: ");
        int num2=sc.nextInt();
        System.out.print("enter the third integer: ");
        int num3=sc.nextInt();
        //check which number is highest using if else condition
        if(num1>num2 && num1>num3)
        {
            System.out.println(num1+" is highest number");
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println(num2+" is highest number");
        }
        else if(num3>num1 && num3>num2)
        {
            System.out.println(num3+" is highest number");
        }
        else
        {
            System.out.println("The numbers are same.");
        }
    }
}
