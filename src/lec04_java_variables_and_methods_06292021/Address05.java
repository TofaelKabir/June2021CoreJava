package lec04_java_variables_and_methods_06292021;

/*
 * 1) " " -- is called empty String
 * 
 * */
public class Address05 {
	static String MyName = "Mohammad Sharkar";
	static int houseNumber = 625;
	static char houseDirection = 'W';
	static int streetNumber = 57;
	static String CityName = "New York";
	static String State = "NY";
	static int zipCode = 10019;
	static boolean inUSA = true;

	public static void main(String[] args) { // below we are calling multiple variables. but the outcome doesn't look good
		// Like String concatenation, variables are executing one after another by + symbol.
		System.out.println(MyName + houseNumber + houseDirection + streetNumber + CityName + State + zipCode);
		System.out.println("Is the adress inside USA?" + inUSA);
		// but if we put empty String inside it looks good, but still in one line
		System.out.println(MyName + " " + houseNumber + " "  + houseDirection + " "  + streetNumber + " "  + CityName + " "  + State + " "  + zipCode);
		// we can also use anything necessary to add inside empty String
		

	}

} 
