package lec12_java_oop_abstraction_02;

// This is an abstract class
// we must have to put abstract keyword in abstract class
public abstract class FlyingCar extends ElectricCar {
	// an abstract class can contain variable and can contain parameterized method.
	// an abstract class can inherit only one abstract class or
	// an abstract class can inherit only one regular class
	// an abstract class can't inherit an Interface by extends key word

	// method can be implemented and declared in an abstract class
	// we must have to put abstract keyword inside abstract method
	public void flyingFeature() { // method implemented
		System.out.println("Flying feature of flying car");
	}

	public abstract void autopilot(); // method declared

}
