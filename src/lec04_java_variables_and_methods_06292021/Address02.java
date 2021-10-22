package lec04_java_variables_and_methods_06292021;




public class Address02 { //Opening of Class body
	
	/*
	 class body contain:
			-- Variable --- Declared and/or Initialize
			-- Constructor  --- Declared and/or Initialize
			-- Method  --- (not declared) Implemented and/or Initialize 
	 * */
	
	
	// then what is variable declared?
	String CourseName; // This is for example, but not used below
	
	// here variable initialize, it means we assign value for variables.
	
	String MyName = "Mohammad Sharkar"; // Here String is a type of variable, and Name is the feature of variable
	// String type feature start with Upper case, String type variable is inside quotation
	
	int houseNumber = 625; // Here int is a type of variable, and houseNumber is the feature of variable
	// int type feature start with Lower case, int type variable doesn't have quotation
	
	char houseDirection = 'W'; // Here char is a type of variable, and houseDirection is the feature of variable
	// char type feature start with Lower case, char type variable is inside single quotation
	
	int streetName = 57;
	
	String CityName = "New York";
	
	String State = "NY";
	
	int zipCode = 10019;
	
	boolean inUSA = true; // Here boolean is a type of variable
	// boolean type feature start with Lower case, boolean type variable doesn't have quotation
	
		
	public static void main(String[] args) { // remove double slash from next line to see the error
	    // System.out.println(MyName); // why it is showing error? 
		// important interview question: Can you call a non static variable or method inside main method?
		// MyName variable is non-static variable, a non static variable (or non-static method) can't call inside a static method.

	}

} // Closing of Class body
