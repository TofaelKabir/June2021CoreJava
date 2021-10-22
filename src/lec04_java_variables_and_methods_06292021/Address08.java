package lec04_java_variables_and_methods_06292021;


public class Address08 { 
	/*
	 class body contain:
			-- Variable --- Declared and/or Initialized
			-- Constructor  --- Declared and/or Initialized
			-- Method  --- (not declared) Implemented and/or Initialized 
	 * */
	static String MyName = "Mohammad Sharkar"; // VARIABLE IS INITIALIZED
	static int houseNumber = 625;
	static char houseDirection = 'W';
	static int streetNumber = 57;
	static String CityName = "New York";
	static String State = "NY";
	static int zipCode = 10019;
	static boolean inUSA = true;
	
	// This is a method, void type
	// method name is always in lower case
	// class doesn't have a parentheses, but the method have
	// when {carly braces} is present, then we can say, the method is implemented
	// method can not declared inside class.
	// we made a relation between variables and method here
	public static void myInfo() { // here we are calling all the variables inside this method
		System.out.println(MyName + "\n" + houseNumber + houseDirection + " " + streetNumber + "th St\n" + CityName
				+ ", " + State + " " + zipCode + "\n");
		System.out.println("Is the adress inside USA?" + inUSA);
	}
	

	public static void main(String[] args) {	
		myInfo(); // here method is initialized.

	}

} 
