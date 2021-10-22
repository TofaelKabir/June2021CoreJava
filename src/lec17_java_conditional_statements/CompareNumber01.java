package lec17_java_conditional_statements;

/*
 Regarding condition: First condition is if
Generally we don't use 2 if condition (code wise OK), rather we use if as first condition and else or else if as second condition. 
Generally the true statement is written at the end.
 */

public class CompareNumber01 {

	public static void main(String[] args) {
		int val1 = 13;
		int val2 = 45;

		if (val1 < val2) {
			System.out.println(val1 + " is shorter than " + val2);
		}

		if (val1 > val2) {
			System.out.println(val1 + " is gratter than " + val2);
		}

	}

}
