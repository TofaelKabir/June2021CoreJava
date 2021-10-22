package lec13_java_oop_abstraction_03;

// this is a regular class
public class Toyota extends Ferrari implements Drone, Taxi {
	// a regular class can inherit only one regular class by extends key word or
	// a regular class can inherit only one abstract class by extends key word
	// a regular class can't inherit an Interface by extends key word

	// Implements keyword is used to inherit Interface in regular class
	// a regular class can inherit more than one Interface
	// a regular class cannot inherit a regular class or abstract class by implements keyword

	// method implemented in a class but can't be declared
	public void toyotaInfo() { // method implemented
		System.out.println("This method is from Toyota class");
	}

	@Override
	public void lightWeight() { // From Drone
		System.out.println("From Drone Interface");

	}

	@Override
	public void rent() { // from Taxi
		System.out.println("From Taxi Interface");

	}

	@Override
	public void carryingpassenger() { // from Taxi
		System.out.println("From Taxi Interface");

	}

}
