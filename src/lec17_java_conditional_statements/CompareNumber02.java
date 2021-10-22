package lec17_java_conditional_statements;

/*
Regarding condition: First condition is if
Generally we don't use 2 if condition (code wise OK), rather we use if as first condition and else or else if as second condition. 
Generally the true statement is written at the end.
When we write else, no condition is necessary to write as parentheses.
*/


public class CompareNumber02 {

	public static void main(String[] args) {
		int val1 = 113;
		int val2 = 45;

		if (val1 < val2) {
			System.out.println(val1 + " is shorter than " + val2);
		}else {
			System.out.println(val1 + " is greater than " + val2);
		}
	

	}

}
