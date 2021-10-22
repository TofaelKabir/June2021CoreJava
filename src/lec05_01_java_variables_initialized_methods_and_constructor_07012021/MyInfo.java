package lec05_01_java_variables_initialized_methods_and_constructor_07012021;

public class MyInfo {

	// default access modifier -- we don't mention, if public, private or protected
	// is absent -- that is default
	public String MyName = "Tofael"; // variable initialized
	public int myAge = 46;
	public char mySex = 'M';
	public boolean usaCitizen = false;
	public byte myWorkingYear = 17;
	public short myHouseRent = 30000;
	public long myYearlySalary = 9223372036854775804l;
	public float myGrade = 3.56f; // f symbol is used in float type variable value
	public double myHeight = 1.5167686876867;

	// This is a constructor
	// Constructor start with upper case and same name as class name
	public MyInfo() { // constructor declared
		System.out.println("This is called default constructor");
	}

	// method name can be same as class name, it is possible, but start with lower
	// case
	public void myInfo() { // method implemented
		System.out.println("My name is: " + MyName + ", Age: " + myAge + ", sex: " 
	+ mySex + ". Am I a USCitizen? : " + usaCitizen + ". I worked for " 
	+ myWorkingYear + "year. My yearly house rent is: " + myHouseRent +
	". My yearly salary: " + myYearlySalary + ". My grade: " + myGrade + " and my height: " + myHeight);
	}
	
	/*
	 * The below code can also be used here, but it is better to use in Test Class 
	 * 
	public static void main(String[] args) {
		// MyInfo is a Class
		// myInfo is an object (most of the place it is called, not reference variable)
		// myInfo is also called a reference variable
		// equal operator
		// new is a keyword
		// MyInfo is a newly created Class name MyInfo
		// an object is created from MyInfo class which is a new MyInfo type
		 // This action is called "Instantiation". A class is instantiated
		MyInfo tofael = new MyInfo(); // when a class is instantiated, actually default constructor is initialized
		tofael.myInfo(); // as object is used to call the method, the class don't need to be static, thats why we we remove static keyword from methods and variable
   
	}
	 */

}
