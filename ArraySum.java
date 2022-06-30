/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.Scanner;
public class ArraySum 
  {
  //Define the main method
   public static void main(String args[])
    {
      //Declare the variables and initialize
      int sum=0,n;
      Scanner sc=new Scanner(System.in);
      //Take input from user
      System.out.println("Enter the n elements");
      n=sc.nextInt();
      //Check user input values using for loop and add all values
      int arr[]=new int[n];
       System.out.println("Enter the 10 elements of array: ");
      for(int i=0;i<arr.length;i++)
      {
       arr[i]=sc.nextInt();
      }
      for(int i=0;i<arr.length;i++)
        {
          sum=sum+arr[i];
        }
      //Print the result
       System.out.print("Sum of array elements is :" +sum);
    
   }
  } 