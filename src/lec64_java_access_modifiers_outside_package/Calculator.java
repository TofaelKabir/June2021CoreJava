package lec64_java_access_modifiers_outside_package;

public class Calculator {
	int a = 60;  //class variable or global variable
	int b = 30;
	
	// void type method
	public void addition() {
		int total1 = a+b;
		System.out.println("Addition of a & b: "+total1);
		
	}
	private void subtraction( ) {
		int total2 = a-b;
		System.out.println("Subtraction of a & b: "+total2);
	}
	
	void multiplication() {
		int total3 = a*b;
		System.out.println("Multiplication of a & b: "+total3);
	}
	
	protected void division( ) {
		int total4 = a/b;
		System.out.println("Division of a & b: "+total4);
	}

}
