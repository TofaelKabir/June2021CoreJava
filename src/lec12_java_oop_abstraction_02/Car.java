package lec12_java_oop_abstraction_02;

// This is an interface
public interface Car extends Taxi, Truck {
	// all these methods which are declared also called abstract method
	// an Interface can inherit more than one Interface by extends keyword
	// an Interface can't inherit a regular class or an abstract class

	// method declared in an interface but can't be implemented
	public void start(); // method declared

	public void stop();

	public abstract void brake(); // we can write abstract keyword inside the method or not.

	// from Java 1.8, JAVA implemented static and default type method in interface
	public default void honk() { // default method
		System.out.println("honk feature");
	}

	public static void gear() { // static method
		System.out.println("gear feature");
	}

}
