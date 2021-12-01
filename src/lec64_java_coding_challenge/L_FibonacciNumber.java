package lec64_java_coding_challenge;

import java.util.Arrays;

/*
 
 Fibonacci Series:
 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986]
 	
 */

// find out the first 8 number from fibonacci series
public class L_FibonacciNumber {
	
	public static void main(String[] args) {
		int [] fibo = new int[8];
		for(int i =0; i<8; i++) {
			if(i<2) {
				fibo[i]=i;
			}else {
				fibo[i] = fibo[i-1]+fibo[i-2];
				// 34 = 21+13
				// fibo[9] = fibo[8]+fibo[7];
				// fibo[9]=fibo[9-1]+fibo[9-2];
				// fibo[i]=fibo[i-1]+ fibo[i-2];
			}
		}

		System.out.println(Arrays.toString(fibo));

	}

}
