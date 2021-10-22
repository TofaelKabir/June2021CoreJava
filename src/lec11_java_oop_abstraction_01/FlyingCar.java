package lec11_java_oop_abstraction_01;

// This is an abstract class
//we must have to put abstract keyword in abstract class
public abstract class FlyingCar {
	
	// method can be implemented and declared in an abstract class
	//we must have to put abstract keyword inside abstract method
	public void flyingFeature() { // method implemented
		System.out.println("Flying feature of flying car");
	}
	
	public abstract void autopilot(); // method declared

}
