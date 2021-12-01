package lec64_java_coding_challenge;

// very common intervoew question
public class P_SwapInteger03 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		// using * operator
		x=x*y; //50
		y=x/y; //50/5=10
		x=x/y; //50/10=5

		System.out.println("The x is : " + x);
		System.out.println("The y is :" + y);
	}

}
