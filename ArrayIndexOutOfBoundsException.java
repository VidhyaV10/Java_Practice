/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException. 
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console. 
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/
import java.util.Scanner;
public class ArrayIndexOutOfBoundsException 
{
   public static void main(String args[]) 
    {
      Scanner sc=new Scanner(System.in);
      int[] arr = new int[5];//array length is 5
      System.out.println("Enter array elements: ");

      for(int i=0;i<=5;i++)//but,we are trying to access 6 elements.Hence,ArrayIndexOutOfBoundsException occurs here 
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("array elements are");
      for(int i=0;i<=5;i++)
        {
          System.out.println(arr[i]);
        }
      
      
    }
}

