package lec64_java_coding_challenge;

public class R_PalindromeNumber {

	public static void isPalindromeNumber(int num) {
		System.out.println("The " + num + " is palindrome number or not ? ");
		
		int r = 0;
		int sum = 0;

		int t = num;
		
		while (num > 0) {
			r = num % 10; // 3 , 1, 3
			sum = (sum * 10) + r; // 3, 31, 313
			num = num / 10; // 31 3 0
			// System.out.println(r + " " + sum + " " + num);
		}

		if (t == sum) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not palindrome number");
		}
	
	}

	public static void main(String[] args) {
		isPalindromeNumber(313);
		isPalindromeNumber(213);
		

	}
}
