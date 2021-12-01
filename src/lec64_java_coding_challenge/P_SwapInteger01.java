package lec64_java_coding_challenge;
// very common intervoew question
public class P_SwapInteger01 {

	public static void main(String[] args) {
		int x =10;
		int y =5;
		
		// using temp variable
		int temp;
		temp =x;
		x=y;
		y=temp;
		
		System.out.println("The x is : " + x);
		System.out.println("The y is :" + y);
	}

}
