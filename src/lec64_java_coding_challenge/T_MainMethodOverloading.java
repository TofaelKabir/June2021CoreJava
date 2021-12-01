package lec64_java_coding_challenge;

// is main method can be over loaded?
// how you can get the outcome for those method?

public class T_MainMethodOverloading {

	public static void main(String [] args) {
		System.out.println("Method-01");
		main("Hello");
		main(9);
		main(6, "Hi");
	}
	
	public static void main (String st) {
		System.out.println("Method-02");
	}
	
	public static void main (int i) {
		System.out.println("Method-03");
	}
	
	public static void main (int i, String st) {
		System.out.println("Method-04");
	}
	
	

}
