package lec08_java_different_type_of_method;

public class Calculator01 {
	 // class variable or global variable
	int a = 50;
	int b = 30;
	
	// void type method
	public void addition() {
		int total1 = a+b;
		System.out.println("Addition of a & b: "+total1);
	}
	
	public void subtraction() {
		int total2 = a-b;
		System.out.println("Subtraction of a & b: "+total2);
	}

}
