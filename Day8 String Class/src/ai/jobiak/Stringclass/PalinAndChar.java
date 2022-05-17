package ai.jobiak.Stringclass;

import java.util.Scanner;

public class PalinAndChar {

	static void m() {
	
		String string = "mississippi";
		char SomeChar = 'i';
		int count = 0;
		for(int i=0; i<string.length(); i++) {
		
			if(string.charAt(i)==SomeChar) {
				count++;
				
			}
		}
		System.out.println("\nnumber of occurances of i is : "+count);
	}
  
	 static void p() {
		  
	      String original, reverse = "";
	      
	      Scanner in = new Scanner(System.in);   
	      
	      
	      
	      System.out.println("Enter a string or number :");  
	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	     	  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println( "you entered " +original+" is palindrome.");  
	      
	      else  
	         System.out.println("you entered " +original+" is not palindrome.");  
	      
	   }  
	

}
