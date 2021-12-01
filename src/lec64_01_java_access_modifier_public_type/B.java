package lec64_01_java_access_modifier_public_type;

import lec64_java_access_modifiers_outside_package.Address;
import lec64_java_access_modifiers_outside_package.Calculator;

public class B extends Calculator {

	public static void main(String[] args) {
		System.out.println("---------- public modifeir can also be accessed outside the class ----------");
		System.out.println("---------- public modifeir can be accessed within the package ----------\n");
		A aObj = new A();
		aObj.msg1();
		System.out.println(aObj.info);
		
		System.out.println("\n\n---------- public modifeir can be accessed inside the same package by subclass (child class) only----------");
		B b = new B();
		// b.m(); // to get this extends M 
		
		System.out.println("\n\n---------- public modifeir can be accessed inside the same package without subclass (child class) only----------");
		W w = new W();
		w.w();
		
		System.out.println("\n\n---------- public modifeir can be accessed outside the package by subclass (child class) only----------");
		System.out.println("---------- The below is coming from package java_access_modifiers_outside_package ----------\n");
		
		b.addition();

		
		System.out.println("\n\n---------- public modifeir can be accessed outside the package without subclass (child class) only----------");
		System.out.println("---------- The below is coming from package java_access_modifiers_outside_package ----------\n");
		
		Address address = new Address();
		address.myInfo();
		
		
		
	

	}

}
