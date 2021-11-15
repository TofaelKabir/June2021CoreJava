package lec60_java_coding_challenge;

import java.util.Arrays;

/*

Interview question in comcast (PA)
Write a function to transform input, e.g.:
Input: “Hello Mohammad Tofael Kabir Sharkar"
Output: “Sharkar Kabir Tofael Mohammad Hello”

*/

public class O_ReverseByWord {

	public static void main(String[] args) {
		String name = "Hello Mohammad Tofael Kabir Sharkar";
		String[] words = name.split(" "); // converted to a List
		
		// we don't need the below line, just to see the String is splited by coma or not as a list
		// System.out.println(Arrays.toString(words));
		
		for(int i=words.length-1; i >=0; i-- ){
			System.out.print(words[i]+" ");
		}
		
	}

}
