

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class exam {

	static int start = 100;
    static int end = 1001;
    static int counter = 500;

   static int smallest;
   static int greatest;
   static int randomInt ;
	public static void main(String[] args) {
		
		
		int numbers [] = new int[counter];
		
		
		
		  Scanner sc= new Scanner (System.in); System.out.println("Give a number"); 
		  int counter = sc.nextInt(); System.out.println("The Number is  " + counter);
		 
        Random random = new Random();
		int randomInt = random.nextInt(end-start) + start;
		
		numbers [0] = randomInt;

        smallest = randomInt;
        greatest = randomInt;
        
        System.out.println("0th Greatest : " + greatest + "\n");
        System.out.println("0th Smallest : " + smallest + "\n");
		
		
	    
        
        
        for(int i=1;i<counter;i++) {
        	System.out.println("This is the Counter" +counter);

            numbers[i] = random.nextInt(end-start) + start;

            smallest = Math.min(smallest,numbers[i]);
            greatest = Math.max(greatest,numbers[i]);

            System.out.println("Random numbers: " + Arrays.toString(numbers) + "\n\n");
            System.out.println(i + "th Greatest : " + greatest + "\n");
            System.out.println(i + "th Smallest : " + smallest + "\n");
	}

}}
