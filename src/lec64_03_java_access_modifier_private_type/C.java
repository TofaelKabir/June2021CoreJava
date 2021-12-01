package lec64_03_java_access_modifier_private_type;

public class C {
	private String info = "This is coming from a variable which is private";

    private C() {
		System.out.println("This is coming from a constructor which is private");
	}

	private void msg1() {
		System.out.println("This is coming from a method which is private");
	}

	public static void main(String args[]) {
		System.out.println("---------- private modifeir can only be accessed within the class ----------");
		System.out.println("---------- It cannot be accessed from outside the class ----------");
		C c = new C();
		c.msg1();
		System.out.println(c.info);
		
	
	}

}
