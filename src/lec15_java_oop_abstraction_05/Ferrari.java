package lec15_java_oop_abstraction_05;

public class Ferrari extends SolarCar{
	public void ferrariInfo() {
		System.out.println("Invented in Italy");
	}

	// please don't remove @Override, because a programmer understand that this method come from somewhere else, not a method of this class
	@Override
	public void speed() {
		System.out.println("The speed need to be improved");
		
	}

	
		
	

}
