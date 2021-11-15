package lec60_java_coding_challenge;

// very common intervoew question
public class P_SwapInteger02 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		// using operator
		x = x + y; // 15
		y = x - y; // 10
		x = x - y; // 15-10

		System.out.println("The x is : " + x);
		System.out.println("The y is :" + y);
	}

}
