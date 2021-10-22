package lec19_java_control_statements_loop;

// for loop
// all the loop contain initialization block, conditional block and increment or decremental block
// common mistakes: type of variable (like: int), semicolon (;) -- we put coma instead 
// i++ means increment by 1
// i = i+1 means increment by 1
// i += 1 means increment by 1
// i = i+2 means increment by 2
// i += 2 means increment by 2
// i = i+3 means increment by 3
// i-- means decrement by 1
// i = i-1 means decrement by 1
// i -= 1 means decrement by 1
// i = i-2 means decrement by 2
// i = i-3 means decrement by 3
// i - = 3 means decrement by 3

public class A_use_of_java_for_loop {

	public static void main(String[] args) {

		System.out.println("\n---------- for loop 01  ----------\n");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("\n---------- for loop 02  ----------\n");
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}

		System.out.println("\n---------- for loop 03  ----------\n");
		for (int i = -3; i <= 10; i += 2) {
			System.out.println(i);
		}

		System.out.println("\n---------- for loop 04  ----------\n");
		for (int i = 1; i < 10; i = i + 3) {
			System.out.println("The values are: " + i);
		}

		System.out.println("\n---------- for loop 05  ----------\n");
		int j = 2;
		for (int i = 1; i < 10; i = i + 3) {
			System.out.println("The values are: " + i * j);
		}
		
		// decremental block is used
		System.out.println("\n---------- for loop 06  ----------\n");
		for (int i = 15; i > 10; i--) {
			System.out.println(i);
		}

		System.out.println("\n---------- for loop 07  ----------\n");
		int k = 2;
		for (int i = 15; i > 10; i = i - 3) {
			System.out.println(i + k);
		}

		System.out.println("\n---------- for loop 08  ----------\n");
		int l = 2;
		for (int i = 25; i > 10; i -= 3) {
			System.out.println(i + l);
		}
		
		System.out.println("\n---------- for loop 09, condition is false  ----------\n");
		// as condition is false, nothing will execute
		int m = 2;
		for (int i = 25; i < 10; i -= 3) {
			System.out.println(i + m);
		}

	}

}
