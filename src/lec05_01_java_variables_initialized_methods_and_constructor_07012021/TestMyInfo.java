package lec05_01_java_variables_initialized_methods_and_constructor_07012021;

public class TestMyInfo {

	public static void main(String[] args) {
		// MyInfo is a Class
		// myInfo is an object (most of the place it is called object, not reference variable)
		// myInfo is also called a reference variable
		// equal operator
		// new is a keyword
		// MyInfo is a newly created Class name MyInfo
		// an object is created from MyInfo class which is a new MyInfo type
		// This action is called "Instantiation". A class is instantiated
		MyInfo tofael = new MyInfo(); // when a class is instantiated, actually default constructor is initialized
		tofael.myInfo(); // as object is used to call the method, the class don't need to be static,
							// thats why we we remove static keyword from methods and variable

	}

}
