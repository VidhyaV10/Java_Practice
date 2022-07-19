/* JFM1T7_Assignment5:

   Write a program to create a static method named dispCollegeName to print the value of a static variable  college_name initialized using static block.
   Access this method from another class and display college_name for 3 students who study in same college.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter the student name: Sri
   Enter the student Roll no: 1
   Enter the student name: Balaji
   Enter the student Roll no: 2
   Enter the student name: Ram
   Enter the student Roll no: 3
   
   Expected Output:
   Student name: Sri
   Student Roll no: 1
   College Name : IIT
   Student name: Balaji
   Student Roll no: 2
   College Name : IIT
   Student name: Ram
   Student Roll no: 3
   College Name : IIT

*/
import java.util.Scanner;
//creating Student class and declaring variables
class Student
{
       String name;
       int roll_no;
       //creating staticBlock in that give collegename
       static String college_name="IIT";    
       //add getters and setters
       public void setName(String name)
       {
         this.name=name;
       }
       public void setroll_no(int roll_no)
       {
         this.roll_no=roll_no;
       }
       public String getName()
       {
         return name;
       }
       public int getroll_no()
       {
         return roll_no;
       }
       //creating dispCollegename static method 
       public static void dispcollege_name(String college_name)
       {
         System.out.println(college_name);
       }
}
public class StaticBlock 
{
  String name;
  int roll_no;
  
   //main method
  public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
  //initialize Student class constructor for three times
    Student S[]=new Student[3];
   //Create an array and add the 3 student to it
    for(int i=0;i<3;i++)
    {
      //take input from user 3 times using for loop 
      S[i]=new Student();
      System.out.print("enter the Student name: ");
      S[i].name=sc.next();
      System.out.print("enter the Student Roll no: ");
      S[i].roll_no=sc.nextInt();
     }
   for(int i=0;i<3;i++)
     {
       System.out.println("Student name: " +S[i].name );
       System.out.println("Student Roll no: " +S[i].roll_no);
       System.out.println("college Name : IIT");
     }
  }
}
