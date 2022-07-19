/* JFM1T9_Assignment5:
	Create an object named obj of the class Main and print the reference to the object using this keyword.
        
        Sample Output:
        Sport name: Football
*/ 
class  Sport 
{ 
  String name;

  // Create a member variable for Sport name 
  Sport(String name)
  {
    this.name=name;
  }
  // Set member variable for Sport name 
  void display()
  {
    System.out.println("Sport name: " +name);
  }
  public static void main(String args[])
  { 
    // Create object for Sport class 
    Sport p=new Sport("Football");
    // Print the value of Sport name using "this" reference
    p.display();
  } 
}