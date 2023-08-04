package Demoproject.Demoproject;

public class BasicMethods {
	
	/*
	 * A method is a block of code which only runs when it is called. You can pass
	 * data, known as parameters, into a method. Methods are used to perform certain
	 * actions, and they are also known as functions. Why use methods? To reuse
	 * code: define the code once, and use it many times.
	 */
	public static void main(String[] args) {
		
		BasicMethods bm = new BasicMethods();
		bm.print();
		System.out.println(bm.add(2, 3));
		
		BasicMethods2 bm2 = new BasicMethods2();
		System.out.println(bm2.add(5, 10));
		
		System.out.println(bm2.sub(10, 5));
		
		System.out.println(mul(5, 10));
	}
	
	public void print() {
		System.out.println("Selenium Training..");
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	

	public static int mul(int a, int b) {
		return a*b;
	}

}
