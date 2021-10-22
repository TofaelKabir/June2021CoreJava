package lec16_java_oop_polymorphism;

public class LandCalculator {

	// Method overloading
	// Method overloading -- (same method name but different type of +
	// parameter/signature or different combination of parameter)
	// Method overloading has Different name: Early binding or static binding or
	// compile time polymorphism.

	// Return type parameterized Method (1) implemented
	public int areaOfLand(int a, int b, int c) { // if you write like (int c, int b, int a) in a different method, it
													// will not work like parameterized constructor
		int total1 = a + b + c;
		System.out.println("Total area from local Calculator: " + total1);
		return total1;
	}

	// Return type parameterized Method (2) implemented
	public int areaOfLand(int a, int b) {
		int total2 = a + b;
		System.out.println("Total area from local Calculator: " + total2);
		return total2;
	}

	// Return type parameterized Method (3) implemented but one of the signature is
	// String type
	public int areaOfLand(int a, int b, String landName) {
		int total3 = a + b + Integer.parseInt(landName);
		System.out.println("Total area from local Calculator: " + total3);
		return total3;
	}

	// Final type Method (4) implemented
	// Final type method can be overloaded
	public final int areaOfLand(int a, int b, int c, int d) {
		int total = a + b + c + d;
		System.out.println("Total area from local Calculator: " + total);
		return total;
	}

	// Static type Method (5) implemented
	// Static method can be overloaded
	public static int areaOfLand(int a, int b, int c, int d, int e) {
		int total = a + b + c + d + e;
		System.out.println("Total area from local Calculator: " + total);
		return total;
	}

	// void type parameterized method (6) is implemented
	public void areaOfLand(int a, int b, int c, int d, int e, int f) {
		int total = a + b + c + d + e + f;
		System.out.println("Total area from local Calculator: " + total);
	}

	// void type method (7) is implemented
	public void areaOfLand() {
		System.out.println("This is from void type method from Local Calculator");
	}

}
