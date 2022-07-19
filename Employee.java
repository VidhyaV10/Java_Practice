/* JFM1T6_Assignment1:

   Write an Employee class with any 3 properties and create 2 employee objects to store and display the data.
   Prompt the user for the 2 employees to be input from the terminal.

   Sample Input:
   Enter the Empid: 01
   Enter the Name: Sree
   Enter Salary: 1000
   Enter the Empid: 02
   Enter the Name: Balaji
   Enter Salary: 2000

   Expected Output:
   **** Stored data displayed below ****
   Employee id = 01
   Employee name = Sree
   Employee salary = 1000
   Employee id = 02
   Employee name = Balaji
   Employee salary = 2000

*/

import java.util.Scanner;
public class Employee 
{
 //Declare Variables
 int Empid;
 String name;
 float Salary;
 //Create a method getInput
 public void getInput()
  {
 //Create a Scanner object
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the Empid : ");
  Empid = sc.nextInt();
  System.out.print("Enter the name : ");
  name = sc.next();
  System.out.print("Enter the Salary : ");
  Salary = sc.nextFloat();
 }
   //Create display method
 public void display() 
  {
    //Print Employee Details
  System.out.println("Employee id = " + Empid);
  System.out.println("Employee name = " + name);
  System.out.println("Employee salary = " + Salary);
 }
 
 public static void main(String[] args) 
  {
 //Create Employee Constructor with 2 Employees
  Employee e[] = new Employee[2];
  //check for loop to print two employee details
  for(int i=0; i<2; i++)
    {
      e[i] = new Employee();
      e[i].getInput();
    }
  
  System.out.println("**** Stored Data displayed belowlow ****");
  for(int i=0; i<2; i++) 
  {
   e[i].display();
  }
 }
}