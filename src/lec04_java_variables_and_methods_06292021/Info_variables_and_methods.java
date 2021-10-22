package lec04_java_variables_and_methods_06292021;

/*

1) What does a class body contain?
-- class body contain:
			-- i) Variable --- Declared and/or Initialize
			-- ii) Constructor  --- Declared and/or Initialize
			-- iii) Method  --- (not declared) Implemented and/or Initialize *** interview question

2) What is a Variable?
-- A variable is a container that holds values that are used in a Java program. 
-- Every variable must be declared to use a data type. 
-- Variable is also called field

3) What are the most commonly used variables?
-- String, int, char, boolean, double.

4) what does it mean by -- variable declared?
-- it means we did not assign any value for variables.

5) what does it mean by -- variable initialized?
-- it means we assign value for variables.

6) what are the Info about String type variables?
-- String type variable start with Upper case, String type variable is inside double quotation.
-- By default value of String is null. (important interview question)

7) what are the Info about int (called Integer) type variables?
-- int type variable start with lower case, int type variable doesn't have any quotation
-- By default value of int is zero. (important interview question)

8) what are the Info about char type variables?
-- char type variable start with lower case,char type variable is inside single quotation

9) what are the Info about boolean type variables?
-- boolean type variable start with lower case, boolean type variable doesn't have any quotation, only true or false.
-- By default value of Boolean is False. (important interview question)

10) Can you call a non static variable or method inside main method?
-- a non static variable (or non-static method) can't call inside a main method (which is a static method).
-- solve 2 way -- i) By making the variables static outside the main method
									ii) Or by moving (initialized) the variables inside the  main method 
						
11) " " -- is called?
--  empty/null String

12) What are the features of method?
-- method name is always in lower case
-- class doesn't have a parentheses, but the method have
-- when {curly braces} is present, then we can say, the method is implemented
-- method can not be declared (only implemented) like variables or constructor inside class.
-- method name can be same as Class name, but must be in lower case. -- important interview question

 * */

public class Info_variables_and_methods {

	public static void main(String[] args) {
		System.out.println("\"Info regarding Variable and Method\"");

	}

}
