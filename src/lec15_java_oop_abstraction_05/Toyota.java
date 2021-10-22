package lec15_java_oop_abstraction_05;

// Toyota is a regular class
// when A regular class extends one regular class or abstract class and implements multiple +
//interfaces, that regular class (Toyota) is called concrete class (important interview question)
//https://www.geeksforgeeks.org/difference-between-abstract-class-and-concrete-class-in-java/

public class Toyota extends FlyingCar implements Car, Drone {
	// a regular class can inherit only one regular class by extends key word or
	// a regular class can inherit only one abstract class by extends key word
	// a regular class can't inherit an Interface by extends key word

	// Implements keyword is used to inherit Interface in regular class
	// a regular class can inherit more than one Interface
	// a regular class cannot inherit a regular class or abstract class by
	// implements keyword

	// method implemented in a class but can't be declared
	public void toyotaInfo() { // method implemented
		System.out.println("This method is from Toyota class");
	}	
	
	// Default methods are only allowed in Interface.
	
	public static void toyota() {
		System.out.println("This is a static method from Toyota class");
	}

	@Override
	public void space() { // from Rocket, Rocket come from Flying Car
		System.out.println("From Rocket Interface");

	}

	@Override
	public void canFloat() { // from HoverCar, Hover car come from Flying Car
		System.out.println("From HoverCar Interface");

	}

	@Override
	public void autopilot() { // from FlyingCar directly
		System.out.println("From Flying Car Abstract class");

	}

	@Override
	public void price() { // From Electric Car, electric car from Flying Car,
		System.out.println("From Electric Car Abstract class");

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

	@Override
	public void carryingGoods() { // from Truck
		System.out.println("From Truck Interface");

	}

	@Override
	public void start() { // from Car
		System.out.println("From Car Interface");

	}

	@Override
	public void stop() { // from Car
		System.out.println("From Car Interface");

	}

	@Override
	public void brake() { // from Car
		System.out.println("From Car Interface");

	}

}
