package lec16_java_oop_polymorphism;

public class TestCalculator {

	public static void main(String[] args) {
		System.out.println("\n................. Method overloading .................\n");
		LandCalculator lc = new LandCalculator();
		lc.areaOfLand(30,45,43); // Return type parameterized Method (1) initialized
		lc.areaOfLand(56, 87); // Return type parameterized Method (2) initialized
		lc.areaOfLand(67, 56, "675"); // Return type parameterized Method (3) initialized
		lc.areaOfLand(5, 6, 4, 9); // Return type final parameterized Method (4) initialized
		LandCalculator.areaOfLand(67, 5, 33, 88, 11); // Return type static parameterized Method (5) initialized
		lc.areaOfLand(2, 33, 6, 6, 77, 8); // Void type parameterized Method (6) initialized
		lc.areaOfLand(); // Void type non parameterized Method (7) initialized
		
		System.out.println("\n................ Method overriding .................\n");
        ModernCalculator mc = new ModernCalculator();
        mc.areaOfLand(30,45,43);
        mc.areaOfLand(56, 87); // Return type parameterized Method (2) initialized
		mc.areaOfLand(67, 56, "675"); // Return type parameterized Method (3) initialized
		ModernCalculator.areaOfLand(67, 5, 33, 88, 11); // Return type static parameterized Method (5) initialized
		mc.areaOfLand(2, 33, 6, 6, 77, 8); // Void type parameterized Method (6) initialized
		mc.areaOfLand(); // Void type non parameterized Method (7) initialized
		
	}

}
