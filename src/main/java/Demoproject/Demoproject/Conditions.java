package Demoproject.Demoproject;

public class Conditions {

	public static void main(String[] args) {
		//Example 1:
		int year = 2020;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println("COMMON YEAR");
		}
		//Example 2:
		int number = 13;
		// Check if the number is divisible by 2 or not
		if (number % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}
		
		//Switch Example 1:
		 //Declaring a variable for switch expression  
	    int num=20;  
	    //Switch expression  
	    switch(num){  
	    //Case statements  
	    case 10: 
	    	System.out.println("10");  
	    break;  
	    case 20: 
	    	System.out.println("20");  
	    break;  
	    case 30: 
	    	System.out.println("30");  
	    break;  
	    //Default case statement  
	    default:
	    	System.out.println("Not in 10, 20 or 30");  
	    } 
	    
	    
	  //Java Switch Example where we are omitting the  
	  //break statement  
	       number=20;  
	      //switch expression with int value  
	      switch(number){  
	      //switch cases without break statements  
	      case 10: System.out.println("10");  
	      case 20: System.out.println("20");  
	      case 30: System.out.println("30");  
	      default:System.out.println("Not in 10, 20 or 30");  
	      }  
	  } 
	    
	    
	}
	
	
