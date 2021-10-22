package lec18_java_different_type_of_class;

import java.util.Random;

public class Use_of_random_class01 {

	public static void main(String[] args) {

		System.out.println("\n--------------- Use of nextInt within int limit ------------------");
		Random random = new Random(); // choosing randomly, not inputting, so no System.in
		int a = random.nextInt(); // without limit of int (showing negative number too)
		int f = random.nextInt();
		System.out.println("Randomly chosen number 1: " + a);
		System.out.println("Randomly chosen number 2: " + random.nextInt());
		System.out.println("Randomly chosen number 3: " + f);

		System.out.println("\n--------------- Use of nextInt with limit ------------------");
		int b = random.nextInt(100); // what happen if we put -100, try it
		int e = random.nextInt(1000);
		System.out.println("Randomly chosen number1: " + b);
		System.out.println("Randomly chosen number2: " + e);
		System.out.println("Randomly chosen number3: " + random.nextInt(200));

		// important interview question
		// by default boolean value is : false
		// by default int value is : 0
		// by default String value is : Null
		
		System.out.println("\n--------------- Use of nextBoolean without ------------------");
		boolean c = random.nextBoolean();
		boolean d = random.nextBoolean();
		System.out.println("Random booleanvalue 01 : " + c);
		System.out.println("Random Boolean value 02 : " + d);
		System.out.println("Random Boolean value 03 : " + random.nextBoolean());
	}

}
