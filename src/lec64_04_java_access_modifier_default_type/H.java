package lec64_04_java_access_modifier_default_type;

import lec64_java_access_modifiers_outside_package.Calculator;
import lec64_java_access_modifiers_outside_package.Address;

public class H extends Calculator{

	public static void main(String[] args) {
		System.out.println("---------- default modifeir can also be accessed within the same package by non subclass ----------");
		G g2 = new G();
		g2.msg1();
		System.out.println(g2.info);
		
		System.out.println("\n\n---------- default modifeir can be accessed inside the same package by subclass (child class)----------");
		H h = new H();
		// h.p(); // H extends P
		
		System.out.println("\n\n---------- default modifeir can't be accessed outside the package with subclass (child class) ----------");
		System.out.println("---------- The below is coming from package java_access_modifiers_outside_package ----------\n");
		// h.multiplication();
		
		System.out.println("\n\n---------- default modifeir can't be accessed outside the package with non subclass ----------");
		System.out.println("---------- The below is coming from package java_access_modifiers_outside_package ----------\n");
		Address address = new Address();
		// address.myJob();
		
		
		
		
		
		

	}

}
