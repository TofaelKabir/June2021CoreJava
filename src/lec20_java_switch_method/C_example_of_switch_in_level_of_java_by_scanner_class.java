package lec20_java_switch_method;

import java.util.Scanner;

// switch method generally used when constant type data is used

public class C_example_of_switch_in_level_of_java_by_scanner_class {

	public static void main(String[] args) {
		System.out.println("Please enter your level of Java here: ");
		Scanner scanner = new Scanner(System.in);
		String MyLevelOfJava = scanner.nextLine();
		
		int level = 0;

		switch (MyLevelOfJava) {
		
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
		scanner.close();
		System.out.println("My Level of Java is: " + level);
	}

}
