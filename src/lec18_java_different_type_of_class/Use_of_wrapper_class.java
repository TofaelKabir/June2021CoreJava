package lec18_java_different_type_of_class;


/*

https://www.tutorialspoint.com/java/java_numbers.htm#:~:text=All%20the%20wrapper%20classes%20(Integer,taken%20care%20by%20the%20compiler.

All the wrapper classes (Integer, Long, Byte, Double, Float, Short) are subclasses of the abstract class 'Number'. The object of the wrapper class contains or wraps its respective primitive data type. Converting primitive data types into object is called boxing, and this is taken care by the compiler.

 * */


public class Use_of_wrapper_class {

	public static void main(String[] args) {
		System.out.println("\n................. Conversion from String to int .....................\n");
		String StName = "100";
		System.out.println(StName);
		System.out.println(StName + 20);
		System.out.println(StName+"  "+20);
		System.out.println(StName+"  "+20+10); // newly added on 08152021
		System.out.println(StName+"  "+(20+10)); // newly added on 08152021
		System.out.println(20+10+StName+"  "+20); // newly added on 08152021
		System.out.println(Integer.parseInt(StName));  // you learn this line from this page
		System.out.println(Integer.parseInt(StName)+20);
		System.out.println(Integer.parseInt(StName)+"         "+20);
		
		System.out.println("\n................. Conversion from String to int (when not a pure number) .....................\n");
		String StName2 = "100W";
		System.out.println(StName2);
		System.out.println(StName2+20);
		System.out.println(StName2+"  "+20);
		// what is the outcome from below one
		//System.out.println(Integer.parseInt(StName2)); 
		// WHEN THE NUMBER IS NOT PURE, CONVERSION FROM String to Integer is not possible // you learn this line from this page
		
		System.out.println("\n................. conversion from String to double .....................\n");
		String StFullName = "3.15";
		System.out.println(StFullName);
		System.out.println(StFullName+1.25); 
		System.out.println(StFullName+"  "+1.25); 
		System.out.println(Double.parseDouble(StFullName)); // you learn this line from this page
		System.out.println(Double.parseDouble(StFullName)+1.36);
		System.out.println(Double.parseDouble(StFullName)+"         "+1.35);
		
		//conversion from String to char (is not possible, because there is no method for that)
		//there is no method name parserCharacter, because String is a collection of Character 
		//rather we find some DIFFERENT method
		
		System.out.println("\n................. conversion from String to character .....................\n");
		char sex = Character.toLowerCase('M'); // you learn this line from this page
		System.out.println(sex);
		
		char direction = Character.toUpperCase('e');  // you learn this line from this page
		System.out.println(direction);
		
		System.out.println("\n................. conversion from String to boolean .....................\n");
		String employee1 = "true";
		System.out.println(employee1);
		System.out.println(employee1+"  "+20);
		System.out.println(Boolean.parseBoolean(employee1)); // you learn this line from this page
		
		System.out.println("\n................. conversion from String to boolean by default (imp interview question: by default boolean is false) .....................\n");
		String employee2 = " ";
		System.out.println(employee2); 
		System.out.println(employee2+"  "+20);
		System.out.println(Boolean.parseBoolean(employee2)); // you learn this line from this page. why false?
		
		System.out.println("\n................. conversion from int to String .....................\n");
		int empId = 2188458;
		System.out.println(empId); 
		System.out.println(empId+251); 
		System.out.println(empId+"  "+251);
		System.out.println(String.valueOf(empId)); // you learn this line from this page. very important
		System.out.println(String.valueOf(empId)+20); 
		
		System.out.println("\n................. conversion from int to String .....................\n");
		float grade = 3.112f;
		System.out.println(grade); 
		System.out.println(grade+251); 
		System.out.println(grade+"  "+251);
		System.out.println(String.valueOf(grade)); // you learn this line from this page. very important
		System.out.println(String.valueOf(grade)+20); 
	}

}
