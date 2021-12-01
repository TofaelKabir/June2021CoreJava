package lec64_2_java_access_modifier_protected_type;

import lec64_java_access_modifiers_outside_package.Calculator;
import lec64_java_access_modifiers_outside_package.Address;

public class F extends Calculator {

	public static void main(String[] args) {
		System.out.println("---------- protected modifeir can also be accessed within the same package by non subclass ----------");
		E e2 = new E();
		e2.msg1();
		System.out.println(e2.info);
		
		System.out.println("\n\n---------- protected modifeir can be accessed inside the same package by subclass (child class)----------");
		F f = new F();
		// f.r(); // F extends R
		
		System.out.println("\n\n---------- protected modifeir can be accessed outside the package by the subclass (child class) ----------");
		System.out.println("---------- The below is coming from package java_access_modifiers_outside_package ----------\n");
		f.division();
		
		System.out.println("\n\n---------- protected modifeir can't be accessed outside the package by the non subclass ----------");
		System.out.println("---------- The below is coming from package java_access_modifiers_outside_package ----------\n");
		Address address = new Address();
		// address.mySalary();

	}

}
