package lec05_01_java_variables_initialized_methods_and_constructor_07012021;

// class names are written in UpperCamelCase
// class names are usually nouns or noun phrases.
public class B_namingConventionsExample {

	// constant names are written with all upper case letters with words separated by underscores
	public static final String WEDDING_REGISTRY_PAGE_TITLE = "Amazon Wedding";
	public static final int LONG_WAIT = 10;

	// non-constant field/variable names are written with lowerCamelCase
	// variable names must be specific and meaningful
	// no duplication is accepted
	public static int houseNumber = 625; // variable initialized
	public static int avenueNumber; // variable declared

	// names like "string1, myarray1, no_1" are not acceptable as variable names
	// because they are are not specific and can cause confusion like the variable
	// below:
	public static String string = "String";

	// Constructor names are written in UpperCamelCase
	// Constructor names are similar as Class Name
	public B_namingConventionsExample() { // Constructor declared
		System.out.println("This is a default constructor");
	}
	
	// method names are written in lowerCamelCase
	// method names are usually verbs or verb phrase
	// parameters names are written in lowerCamelCase inside the parentheses if
	// used. it will be discussed when different type of methods will be studied
	
	public static void myInfo() { // method implemented
		System.out.println("This is from method");
	}

	public static void main(String[] args) {
		// local variable names are written in lowerCamelCase
		int avenueNumber = 12; // variable initialized, which was declared in Line 15
		System.out.println(avenueNumber); // The above variable is called/executed here
		myInfo();
	}

}