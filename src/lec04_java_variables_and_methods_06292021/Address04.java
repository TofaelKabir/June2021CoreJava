package lec04_java_variables_and_methods_06292021;
/*
 * 1) if variable is inside the main method they must be non-static
 * 2) This is not common, used just as an option to solve the issue.
 * 3) this is the answer of that interview question: if static is not allowed to put outside the main method with
 *  variables, what would be the solution?
 * 
 * 
 * */
public class Address04 { // Opening of Class body

	// Generally variable are present /positioned first in the class body, outside the main method

	public static void main(String[] args) {
		
		String MyName = "Mohammad Sharkar";
		int houseNumber = 625;
		char houseDirection = 'W';
		int streetName = 57;
		String CityName = "New York";
		String State = "NY";
		int zipCode = 10019;
		boolean inUSA = true;
		
		System.out.println(MyName); // static variables can't executed inside main method, they must be non static
		System.out.println(houseNumber);
		System.out.println(streetName);
		System.out.println(CityName);
		System.out.println(State);
		System.out.println(zipCode);
		System.out.println(inUSA);
	}

} // Closing of Class body
