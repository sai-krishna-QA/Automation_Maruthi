package Demoproject.Demoproject;

import java.util.Date;

public class BasicStrings {

	public static void main(String[] args) {

	String s = new String("Automation Training");

	String s1="Welcome";  
	String s2="Welcome";//It doesn't create a new instance
	
	//Concatenates the specified string to the end of this string. 
	System.out.println(s1.concat(s2));
	
	//It returns a string in uppercase / lowercase
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	
	//It returns the specified substring index.
	System.out.println(s1.indexOf('o'));
	
	
	Date d = new Date();
	System.out.println(d);
	//It replaces all occurrences of the specified CharSequence.
	System.out.println(d.toString().replace(":", "_").replace(" ", "_"));
	
	
	String name= "Maruthi Ram Pushpala";
	//Splits this string around matches of the given regular expression. 
	String[] nameParts =  name.split(" ");
	for(String namePart : nameParts)
	System.out.println(namePart);
	
	//Returns a string whose value is this string, with all leading and trailing space removed
	String newName= "       Maruthi Ram Pushpala    ";
	System.out.println(newName.trim());
	for (int i = 0; i < name.length(); i++) {
		//Returns the char value at the specified index. An index ranges from 0 to length() - 1. 
		System.out.println(name.charAt(i));
	}
	System.out.println("-------------");
	for (int i = name.length()-1; i >= 0; i--) {
		//Returns the char value at the specified index. An index ranges from 0 to length() - 1. 
		System.out.println(name.charAt(i));
	}
	
	
	}

}

