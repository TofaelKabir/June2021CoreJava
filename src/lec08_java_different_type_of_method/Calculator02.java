package lec08_java_different_type_of_method;

public class Calculator02 {
	 // class variable or global variable
	int a = 55;
	int b = 31;
	
	// return type method
	public int addition() {
		int total1 = a+b;
		System.out.println("Addition of a & b: "+total1);
		return total1;
	}
	
	public int subtraction() {
		int total2 = a-b;
		System.out.println("Subtraction of a & b: "+total2);
		return total2;
	}

}
