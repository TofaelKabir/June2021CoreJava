package lec11_java_oop_abstraction_01;

// This is an interface
public interface Car {
	
	// method declared in an interface but can't be implemented
	public void start(); // method declared
	public void stop();
	public abstract void brake(); // we can write abstract keyword inside the method or not.

}
