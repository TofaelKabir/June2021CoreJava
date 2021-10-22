package lec20_java_control_statements_loop;

public class E_use_of_java_break {

	public static void main(String[] args) {
		System.out.println("\n---------- for loop  ----------\n");
		for (int i = 1; i <= 5; i++) {
			System.out.println("The values are: " + i);
		}
		
		
		System.out.println("\n---------- for loop after the break  ----------\n");
		for (int j = 1; j <= 5; j++) {
			if (j == 4) {
				break; // when we use break, then the loop is completed before the if condition
			}
			System.out.println("The values are: " + j);
		}
		
		System.out.println("\n---------- while loop ----------\n");
		int i = 1;
		while (i <= 5) {// when the condition is true, the loop started
			System.out.println("The value is: " + i);
			i++;
		}

		System.out.println("\n---------- while loop after break ----------\n");
		int j = 0;
		while (j <= 10) {
			if (j == 7) {
				break;
			}
			System.out.println("The value is: " + j);
			j=j+2;
		}
		
		System.out.println("\n---------- while loop after break 02 ----------\n");
		int n = 1;
		while (n <= 10) {
			if (n== 7) {
				break;
			}
			System.out.println("The value is: " + n);
			n +=2;
		}
		
		System.out.println("\n---------- do while loop ----------\n");
		int k = 1;
		do {
			System.out.println("The value is: " + k);
			k = k + 2;
		} while (k <= 7);
		
		System.out.println("\n---------- do while loop after break 01 ----------\n");
		int l = 1;
		do {
			System.out.println("The value is: " + l);
			l = l + 2;
			if (l == 5) {
				break;
			}
		} while (l <= 7);
		
		System.out.println("\n---------- do while loop after break 02 ----------\n");
		int m = 1;
		do {
			System.out.println("The value is: " + m);
			m = m + 2;
			if (m == 6) {  // condition is absent
				break;
			}
		} while (m <= 7);
		
		
	}
		


	
}
