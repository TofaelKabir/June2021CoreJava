package lec37_java_control_statements_loop_iterator_only;

// do while loop
// all the loop contain: initialization block, conditional block and increment or decremental block
// common mistakes: type of variable (like: int), semicolon (;) -- we put coma instead 
// what is the difference between while and do while loop? important interview question


public class C_use_of_java_do_while_loop {

	public static void main(String[] args) {

		System.out.println("\n---------- for loop  ----------\n");
		for (int i = -10; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("\n---------- while loop ----------\n");
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n---------- do while loop 01 ----------\n");
		int j=0;
		do {
			System.out.println(j);
			j += 2;
		} while (j<5);
		
		System.out.println("\n---------- do while loop 02, condition is not true ----------\n");
		int k = 2;
		do {
			System.out.println("The value is: " + k);
			k++;
		} while (k >= 5); // as the condition is not true, loop stop after 1st iteration
		
		// decremental block is used
		System.out.println("\n---------- do while loop 03 ----------\n");
		int l = 20;
		do {
			System.out.println("The values is: " + l);
			l = l - 3;
		} while (l >= 5);

	}

}
