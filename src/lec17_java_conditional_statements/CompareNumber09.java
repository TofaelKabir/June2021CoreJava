package lec17_java_conditional_statements;

/*
 Conditional Statement:

Conditional Statements allow the program to behave differently based on condition. Example: if, else, else if, Switch.
!= is called ‘not equal to’
== is called ‘equality operator’
% is called ‘Modulus or remainder’. FYI: If we divide 9 with 2, then 9 is called ‘Dividend’, 2 is called ‘Divisor’, 4 is called ‘quotient’ and 1 is called ‘Remainder/modulus’
&& is called ‘logical and operator’
|| is called ‘logical or operator’ (the symbol is called pipe)
Regarding condition: First condition is if
Generally we don't use 2 if condition (code wise OK), rather we use if as first condition and else or else if as second condition. 
Generally the true statement is written at the end.
When we write else, no condition is necessary to write as parentheses.
But if we wish to write a second condition , we have to use ‘else if’, not ‘else’. 


 */

public class CompareNumber09 {

	public static void main(String[] args) {
		int val1 = 45;
		int val2 = 45;

		if (val1 % 2 == 0 && val1 < val2) {
			System.out.println(val1 + " is an even number and shorter than " + val2);
		} else if (val1 % 2 == 0 && val1 > val2) {
			System.out.println(val1 + " is an even number and greater than " + val2);
		} else if (val1 % 2 == 1 && val1 < val2) {
			System.out.println(val1 + " is an odd number and shorter than " + val2);
		} else if (val1 % 2 == 1 && val1 > val2) {
			System.out.println(val1 + " is an odd number and greater than " + val2);
		} else if (val1 % 2 == 0 && val1 != val2) {
			System.out.println(val1 + " is an even number and not equal to " + val2);
		} else if (val1 % 2 == 0 && val1 == val2) {
			System.out.println(val1 + " is an even number and equal to " + val2);
		} else if (val1 % 2 == 1 && val1 != val2) {
			System.out.println(val1 + " is an odd number and not equal to " + val2);
		} else if (val1 % 2 == 1 && val1 >= val2) {
			System.out.println(val1 + " is an odd number and (greater than or)  equal to " + val2);
		} else {
			System.out.println("This is not a valid case");
		}
	}
}
