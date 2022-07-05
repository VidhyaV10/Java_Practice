// Complete and execute java Program for printing only odd elements of a single dimensional array
class Sample1 {

	public static void main(String args[]) {

		//Initialize array  
        	int [] arr = new int [] {22, 12, 7, 75, 56}; 
    

        	//Loop through the array using for-each loop
        	for (int i:arr) 
          {  

           	if((i%2)!=0) 
            {
               int j=i;
              //Write print statement here
              System.out.println(j);
            }
            
               
        }  
   }
}
