package lec15_java_oop_abstraction_05;

// we can also use implements keyword to inherit, but not used here.
public abstract class SolarCar extends Mercedes  implements SuperMan{
	
	public void solarInfo() {
		System.out.println("Run by solar energy");
	}
	
	public abstract void speed();

}
