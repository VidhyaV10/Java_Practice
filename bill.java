/* Write a JAVA program to input electricity unit charges and calculate total electricity bill according to the given condition: 
    For first 50 units Rs. 0.50/unit 
    For next 100 units Rs. 0.75/unit 
    For next 100 units Rs. 1.20/unit 
     For unit above 250 Rs. 1.50/unit 
     An additional surcharge of 20% is added to the bill class  
import java.util.Scanner;
*/
class Electricity
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter no. of units");
      int units=sc.nextInt();
      Double bill;
      if(units<=50)
      {
        bill=0.5*units;
      }
      else if(units<=150&&units>50){
        bill=(0.5*50)+(units-50)*0.75;
      }
      else if(units<=250&&units>150){
        bill=(0.5*units)+(100*0.75)+(units-150)*1.2;
      }
      else{
        bill=(0.5*50)+(100*0.75)+(100*1.2)*(units-250)*1.5;
      }
      System.out.println("the bill for "+units+" is "+bill);
    }
  }