/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
 class Student
    {
      String name,city;
      double marks;
      void setname(String name)
      {
        this.name=name;
      }
      void setcity(String city)
      {
        this.city=city;
      }
      void setmarks(double marks)
      {
        this.marks=marks;
      }
      String getname()
      {
        return name;
      }
      String getcity()
      {
        return city;
      }
      Double getmarks()
      {
        return marks;
      }
      void businesslogic(String name,String city,double marks)
      {
        System.out.println("Name:"+name);
        System.out.println("City:"+city);
        System.out.println("Marks:"+marks);
      }
    }
class NullPointerException
  {
    public static void main(String args[]) 
   {
        Student S=new Student();
          
        S.name=null;//the String value is null,so the nullpointerexception occurs
        S.city="Bangalore";
        S.marks=100.0;
        System.out.println(S.name.length());
         System.out.println(S.city);
         System.out.println(S.marks);
    }
 }
