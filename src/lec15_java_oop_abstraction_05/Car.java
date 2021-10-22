package lec15_java_oop_abstraction_05;

// This is an interface
public interface Car extends Taxi, Truck {
	
	// the variables inside Interface are final and static in nature.
	public static final int year = 1965;
	
	
	// Interfaces cannot have constructors
//	public Car() {
//		System.out.println();
//	}

	// implements keyword can't be used for inheritance in Interface

	// method declared in an interface but can't be implemented
	public void start(); // method declared

	public void stop();

	public abstract void brake(); // we can write abstract keyword inside the method or not.

	// from Java 1.8, JAVA implemented static type and default type method in
	// interface
	// non abstract method
	public default void honk() { // default type method
		System.out.println("honk feature");
	}

	public static void gear() { // static type method
		System.out.println("gear feature");
	}

}
