//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500
        total_marks=348

  Expected Output:
        percentage= 70%
       

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;
public class Percentage
  {
   //Define the main method
    public static void main(String args[])
     {
       //Declare the variables
       double total_marks;
       double maximum_marks;
       //Use the scanner class to provide total_marks and maximum_marks at execution time
       Scanner scanner = new Scanner(System.in);
       System.out.print("maximum_marks=");
       maximum_marks= scanner.nextdouble();
       System.out.print("total_marks="); 
       total_marks=scanner.nextdouble(); 
       //Calculate the percentage of marks
       double Percentage=((total_marks/maximum_marks)*100);
       //Print the Result
       System.out.println("Percentage=" +Percentage+"%");
      }
  }

// Kindly work on the indentation and keep appropriate comments in the code.
