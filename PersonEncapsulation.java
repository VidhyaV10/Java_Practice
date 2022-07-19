/*JFM1T9_Assignment1:
    Write a program applying Encapsulation to age field in Person class that cannot be accessed directly from outside class
    but can be accessed using setter and getter methods. 
    Steps to follow:
    Step1: Add age attribute to the Person class 
    Step 2: Add setter and getter methods for the age attribute  
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter age: 32

    Expected Output:
    Your age: 32
    
     
*/
import java.util.Scanner;
class Person 
{ 
//declare age 
  private int perAge;

//create setters and getters
  public void setperAge(int newvalue)
  {
    perAge=newvalue;
  }
  public int getperAge()
  {
    return perAge;
  }
}  
class PersonEncapsulation 
{ 
//main method
public static void main(String args[]) 
  { 
    //create Scanner object
    Scanner sc=new Scanner(System.in);
    //take input from user
    System.out.print("Enter age: ");
    int age=sc.nextInt();
// Try accessing age field of Person directly and check whether it’s accessible
// or not.If not then try accessing it with it’s setter and getter methods. 
     Person per=new Person();
     per.setperAge(age);
     // Output age  
     System.out.println("your age: "+age);
 }   

} 