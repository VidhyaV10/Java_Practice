/* Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology,Mathematics and Computer. Calculate percentage and grade according to     following: 
    Percentage >= 90% : Grade A 
    Percentage >= 80% : Grade B 
    Percentage >= 70% : Grade C 
    Percentage >= 60% : Grade D 
    Percentage >= 40% : Grade E 
    Percentage < 40% : Grade F 
  */
import java.util.Scanner;
class Marks
  {
    public static void main(String args[])
    { 
      float marks;
      int Maximummarks=500;
      int Totalmarks;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the Physics marks: ");
      int Physics=sc.nextInt();
      System.out.print("Enter the Chemistry marks: ");
      int Chemistry=sc.nextInt();
      System.out.print("Enter the Biology marks: ");
      int Biology=sc.nextInt();
      System.out.print("Enter the Mathematics marks: ");
      int Mathematics=sc.nextInt();
      System.out.print("Enter the Computer marks: ");
      int Computer=sc.nextInt();

      Totalmarks=Physics+Chemistry+Biology+Mathematics+Computer;
      System.out.println("Totalmarks: " +Totalmarks);
      float Percentage=(float)((Totalmarks/Maximummarks)*100);
      System.out.println("Percentage :" +Percentage);
      if(Percentage>=90)
      {
        System.out.println("Grade A");
      }
      if(Percentage>=80)
      {
        System.out.println("Grade B");
      }
      if(Percentage>=70)
      {
        System.out.println("Grade C");
      }
      if(Percentage>=60)
      {
        System.out.println("Grade D");
      }
      if(Percentage>=40)
      {
        System.out.println("Grade E");
      }
      if(Percentage<40)
      {
        System.out.println("Grade F");
      }
      
    }
  }