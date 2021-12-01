package lec64_01_java_access_modifier_public_type;

public class A {
	
	public String info = "This is coming from a variable which is public";

	public A() {
		System.out.println("This is coming from a constructor which is public");
	}

	public void msg1() {
		System.out.println("This is coming from a method which is public");
	}
	
	public static void main(String[] args) {
		System.out.println("---------- public modifeir can be accessed within the class ----------");
		System.out.println("---------- public modifeir can be accessed within the package ----------\n");
		A a = new A();
		a.msg1();
		System.out.println(a.info);
	}
	
	

}
