package lec20_java_switch_method;

// switch method generally used when constant type data is used

public class B_example_of_switch_in_level_of_java {

	public static void main(String[] args) {
		// Declaring String variable
		String MyLevelOfJava = "Intermediate";
		int level = 0;
		// Using String in Switch expression
		switch (MyLevelOfJava) {
		// Using String Literal in Switch case
		case "Beginner":
			level = 1;
			break;

		case "Intermediate":
			level = 2;
			break;

		case "Expert":
			level = 3;
			break;

		case "Excellent":
			level = 4;
			break;

		default:
			level = 0;
			break;
		}

		System.out.println("My Level of Java is: " + level);
	}

}
