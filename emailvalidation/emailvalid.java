package emailvalidation;

import java.util.Scanner;
public class emailvalid {
	 public static void main(String[] args) 
	    { 
	      String[] strArray = new String[6];
	      strArray[0]= "harsha@gmail.com";
	      strArray[1]= "swetha@gmail.com"; 
	      strArray[2]= "mohit@gmail.com"; 
	      strArray[3]= "karthik234@gmail.com"; 
	      strArray[4]= "udaykodi56@gmail.com";
	      strArray[5]= "mahesh6@gmail.com"; 
	      boolean found = false;
	        int index = 0;
	        
	        try (Scanner Str = new Scanner(System.in)) {
				System.out.println("Enter the Email ID:");
				String a= Str.nextLine(); 
      for (int i = 0; i <strArray.length; i++) {
      if(a.equals(strArray[i])) {
				    index = i; found = true; 
				    }
				}
      if(found)
				   System.out.println("\n" +a +" found at the index "+index);
				 else
				   System.out.println("\n" +a +" not found in the array");
			}
	  
	     }
}
