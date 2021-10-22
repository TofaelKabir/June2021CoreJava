package lec04_java_variables_and_methods_06292021;

/*
 * 1) if variable is outside the main method they must be static
 * 
 * */
public class Address03 { // Opening of Class body

	static String MyName = "Mohammad Sharkar";
	static int houseNumber = 625;
	static char houseDirection = 'W';
	static int streetName = 57;
	static String CityName = "New York";
	static String State = "NY";
	static int zipCode = 10019;
	static boolean inUSA = true;

	public static void main(String[] args) { // if a variable is non static, it can't be executed inside the main
												// method, it will show error
		System.out.println(MyName); // To call A Variable - you don't need to put it inside double quotation, Just
									// call the variables by name
		System.out.println(houseNumber);
		System.out.println(streetName);
		System.out.println(CityName);
		System.out.println(State);
		System.out.println(zipCode);
		System.out.println(inUSA);
	}

} // Closing of Class body
