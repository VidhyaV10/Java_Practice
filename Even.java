import java.util.Scanner;
public class Even
{
public static void main(String args[])
  {
  int sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.print("enter n value : ");
  int n=sc.nextInt();
  for(int i=0;i<=n;i++)
    {    
      if(i%2==0) 
      {
        System.out.println(i);  
      }

    } 
   
    
          System.out.println("the sum of even numbers is");  
  }
}