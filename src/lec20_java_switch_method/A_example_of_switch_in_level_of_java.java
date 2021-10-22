package lec20_java_switch_method;

// switch method generally used when constant type data is used

public class A_example_of_switch_in_level_of_java {

	public static void main(String[] args) {
		
		String MyLevelOfJava = "Intermediate";

		switch (MyLevelOfJava) {
		case "Beginner":
			System.out.println("I am at beginning");
			break;

		case "Intermediate":
			System.out.println("I am at Intermediate level");;
			break;

		case "Expert":
			System.out.println("I am an expert in Java");
			break;

		case "Excellent":
			System.out.println("I have a Java certification from Oracle");
			break;

		default:
			System.out.println("I am a drop out");
			break;
		}

	}

}
