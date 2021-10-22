package lec10_java_overview;
/*
 * author=Tofael
 * school=en.thrall
 * start: June 2021
 * 
 */

// this is a class
public class Computer02 {
	
	// they are variables
	public String Brand = "Apple"; // variable initialize
	public int price = 800;
	public char grade = 'C';
	public boolean madeInUSA =false;
	public static float review = 6.68768f;
	
	// default constructor
	public Computer02() { // constructor declared
		System.out.println("This is from default constructor");
	}
	
	// void type method
	public static void computer() { //method implemented
		System.out.println("This is from method");
		
	}
	
	

	public static void main(String[] args) { // this is main method 
		System.out.println("This is a computer");
		computer(); //method initialize
		System.out.println(review);
		System.out.println("The mac review number is: "+review);
		

	}

}
