package lec08_java_different_type_of_method;

public class Calculator05 {
	// important interview question
	public int addition(int a, String b) {
		int total1 = a + Integer.parseInt(b); // This is a formula, you have memorize it
		System.out.println("Addition of a & b: "+total1);
		return total1;
	}

}
