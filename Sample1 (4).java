// Complete and execute the java program to test immutability in String

public class Sample1 
{
  public static void main(String args[]) 
  {
      String s="Smart";
      //concat any string with s
      s.concat("Phone");
      System.out.println(s);
      String s1= s.concat(" Phone");
      System.out.println(s1);
        
  }
}