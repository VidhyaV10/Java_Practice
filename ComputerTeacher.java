/* JFM1T9_Assignment3:
     Create a base class Teacher and a sub class ComputerTeacher.
     class ComputerTeacher extends the designation and collegename properties and work() method from base Teacher class,
     you need not declare these properties and method in ComputerTeacher sub class .
     Try accessing these properties using child class object in Main method.
  
     Sample Output:
     Designation       CollegeName
     ComputerTeacher      IIT
*/

class Teacher
{
 String designation;
 String collegeName;
 void work()
  {
    System.out.println("Working");
  }
}
class Computer extends Teacher 
{

}
class ComputerTeacher
  {
    public static void main(String args[])
    {
      Computer com=new Computer();
      com.designation="ComputerTeacher";
      com.collegeName="IIT";
      System.out.println("Designation     CollegeName");
      System.out.println(com.designation+"  "+com.collegeName);
      //com.work();
    }
  }

