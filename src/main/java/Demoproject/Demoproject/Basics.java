package Demoproject.Demoproject;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Datatypes
		int number=100;
		String sentence = "This is sentence";
		char letter = 'a';
		double dec = 9.88;
		float myFloat = 9.88f;
		boolean flag = true;
		
		System.out.println(number + " "+sentence + " "+letter+ " "+dec+ " "+myFloat+ " "+flag);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		//Arrays
		int[] myArray = new int[3];
		myArray[0]=1;
		myArray[1]=2;
		myArray[2]=3;
		System.out.println(myArray[0]);
		
		int[] myArray2 = {10, 20, 30};
		System.out.println("Value:- " + myArray2[2]);
		
		//for loop
		for (int i = 0; i < myArray2.length; i++) {
			System.out.println(myArray2[i]);
		}
		
		String[] names = {"maruthi", "ram", "pushpala"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for(String name: names) {
			System.out.println(name);
		}
		
		
	
	}

}

