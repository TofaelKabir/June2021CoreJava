package lec15_java_oop_abstraction_05;

public abstract class ElectricCar extends Ferrari{
	
	public String Name;
	
	public ElectricCar() {
		System.out.println("Abstract class can contain constructor");
	}
	
	public ElectricCar(String name) { // we are not going to initialize it, practice by yourself
		this.Name = name;
		System.out.println("Most reknown electric car is: "+Name);
	}

	public abstract void price();
	
	public void battery() {
		System.out.println("Battery is very efficient");
	
	}
	
	public static void luxury() {
		System.out.println("Electric car is now a luxury!");
	}
	
	// default methods are only allowed in Interface

}
