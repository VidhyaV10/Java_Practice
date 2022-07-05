//  Write a program to print the elements of an array present on even position

import java.util.Scanner;
class Exercise1
{
   public static void main(String args[]) 
  {
    int n,i;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter array size: ");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter array elements: ");
    for(i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
    for(i=0;i<n;i=i+2)
    {
    System.out.println("the elements at even position are: " +arr[i]);
		    
   }
 }
}  
