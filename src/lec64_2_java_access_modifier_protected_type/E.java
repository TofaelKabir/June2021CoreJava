package lec64_2_java_access_modifier_protected_type;

public class E {
	protected String info = "This is coming from a variable which is protected";

	protected E() {
		System.out.println("This is coming from a constructor which is protected");
	}

	protected void msg1() {
		System.out.println("This is coming from a method which is protected");
	}
	

	public static void main(String args[]) {
		System.out.println("---------- protected modifeir can be accessed within the same package and same class ----------");
		E e = new E();
		e.msg1(); 
		System.out.println(e.info);
	}

}
