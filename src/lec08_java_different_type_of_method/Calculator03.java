package lec08_java_different_type_of_method;

public class Calculator03 {
	
	// return type parameterized method
	public int addition(int a, int b) {
		int total1 = a+b;
		System.out.println("Addition of a & b: "+total1);
		return total1;
	}
	
	public int subtraction(int a, int b) {
		int total2 = a-b;
		System.out.println("Subtraction of a & b: "+total2);
		return total2;
	}
	
	public int multiplication(int a, int b) {
		int total3 = a*b;
		System.out.println("Multiplication of a & b: "+total3);
		return total3;
	}
	
	public int division(int a, int b) {
		int total4 = a/b;
		System.out.println("Division of a & b: "+total4);
		return total4;
	}
	
	public int boby(int a, int b, int c) {
		int total5 = a*b*c;
		System.out.println(total5);
		return total5;
	}
	
	
	
	
	
	
	

}
