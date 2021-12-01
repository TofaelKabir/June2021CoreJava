package lec64_04_java_access_modifier_default_type;

public class G {
	String info = "This is coming from a variable which is default";

	G() {
		System.out.println("This is coming from a constructor which is default");
	}

	void msg1() {
		System.out.println("This is coming from a method which is default");
	}
	

	public static void main(String args[]) {
		System.out.println("---------- deafault modifeir can be accessed inside same package within the same class ----------");
		G g = new G();
		g.msg1();
		System.out.println(g.info);
	
	
	}

}
