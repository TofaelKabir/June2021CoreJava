package lec60_java_coding_challenge;

/*
 5! = 5x4x3x2x1
 0! = 1
 1! = 1
 2! = 2x1
  

 Explaining 5! = 5x4x3x2x1 
 					= 5x(5-1)x(5-2)x(5-3)x(5-4)
 					= nx(n-1)x(n-2)x(n-3)x(n-4)
 	
 	if n return n*n-1
 	n-1 return n-1*n-2
 	n-2 return n-2*n-3
	
 	
 */

// 1st way: doing by recursive method
public class K_FactorialNumber {
	public static int recFactorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * recFactorial(n - 1); // Recursive method
		}

	}

	// 2nd way: Doing by for loop
	public static int rFactorial(int n) {
		int total = n; // 5
		for (int i = n - 1; i >= 1; i--) { // 4,3,2,1
			total = total * i; // 5x4
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println(recFactorial(5));
		System.out.println(rFactorial(5));

	}

}
