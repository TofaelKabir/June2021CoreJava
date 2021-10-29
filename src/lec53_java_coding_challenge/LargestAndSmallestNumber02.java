package lec53_java_coding_challenge;

import java.util.Arrays;

public class LargestAndSmallestNumber02 {

	public static void main(String[] args) {
		int [] number = {100, 77, 1, 5, 6, 6, 8, 55, 7, 8, 5, 56, 323, 2, 44, 12, 456, 6, 4, 5, 5};
		
        Arrays.sort(number); // not preferred by interviewer
        
        System.out.println("The Array is : " + Arrays.toString(number));
        System.out.println("The largest number is : "+ number[number.length-1]);
        System.out.println("The smallest number is :" + number[0]);

	}

}

