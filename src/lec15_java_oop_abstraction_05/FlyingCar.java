package lec15_java_oop_abstraction_05;

// This is an abstract class
// we must have to put abstract keyword in abstract class
public abstract class FlyingCar extends ElectricCar implements Rocket, HoverCar{
	// an abstract class can contain variable and can contain parameterized method.
	// an abstract class can inherit only one abstract class  by extends keyword or
	// an abstract class can inherit only one regular class by extends keyword
	// an abstract class can't inherit an Interface by extends keyword

	// Implements keyword is used to inherit Interface in abstract class
	// an abstract class can inherit more than one Interface
	// an abstract class cannot inherit a regular class or abstract class by implements keyword

	// method can be implemented and declared in an abstract class
	// we must have to put abstract keyword inside abstract method
	public void flyingFeature() { // method implemented
		System.out.println("Flying feature of flying car");
	}

	public abstract void autopilot(); // method declared

}
