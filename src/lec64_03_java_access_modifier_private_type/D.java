package lec64_03_java_access_modifier_private_type;

import lec64_java_access_modifiers_outside_package.Address;
import lec64_java_access_modifiers_outside_package.Calculator;

public class D extends Calculator {

	public static void main(String[] args) {
		System.out.println("---------- Show unresolved compilation problems because ----------");
		System.out.println("---------- private modifeir can not be accessed inside the same package outside the class ----------");
		
//		C c2 = new C(); // default constructor is initialized
//		c2.msg1();
				
		System.out.println("\n\n---------- private modifeir can't be accessed inside the package by subclass (child class)----------");
		D d = new D();
		// d.q(); // to check this D extends Q
		
		System.out.println("\n\n---------- private modifeir can't be accessed inside the package without subclass----------");
		U u = new U();
		// u.u();
		
		System.out.println("\n\n---------- private modifier can not be accessed outside the package with subclass (child class) ----------");
		// d.subtraction();
		
		System.out.println("\n\n---------- private modifier can not be accessed outside the package without subclass (child class) ----------");
		
		Address address = new Address();
		//address.homeAddress();

	}

}
