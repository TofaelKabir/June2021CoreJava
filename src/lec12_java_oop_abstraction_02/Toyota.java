package lec12_java_oop_abstraction_02;

// this is a regular class
public class Toyota extends Ferrari{
	// a regular class can inherit only one regular class or
	// a regular class can inherit only one abstract class
	// a regular class can't inherit an Interface by extends key word
	
	//method implemented in a class but can't be declared
	public void toyotaInfo() { // method implemented
		System.out.println("This method is from Toyota class");
	}

}
