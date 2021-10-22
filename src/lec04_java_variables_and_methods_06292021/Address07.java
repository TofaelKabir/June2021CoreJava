package lec04_java_variables_and_methods_06292021;
/*
 * we learn method in this class and how it is called?
 * */

public class Address07 { 
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
	
	/*
	 This is a void type method
    -- method name is always in lower case
	-- class doesn't have a parentheses, but the method have
	-- when {curly braces} is present, then we can say, the method is implemented
	-- method can not be declared (only implemented) like variables or constructor inside class.
	-- method name can be same as Class name, but must be in lower case.	
	*/
	
	public static void myInfo() {
		System.out.println("This is a void type method");
	}
	

	public static void main(String[] args) { 
		System.out.println(MyName + "\n" + houseNumber + houseDirection + " " + streetNumber + "th St\n" + CityName
				+ ", " + State + " " + zipCode + "\n");
		System.out.println("Is the adress inside USA?" + inUSA);
		
		myInfo();

	}

} 
