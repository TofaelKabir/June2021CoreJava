package lec16_java_oop_polymorphism;

public class ModernCalculator extends LandCalculator {
		// summary: same method name, same signature/parameter but Overriding the logic of the method
		// Method overriding(same method name, same parameter but different syntax or logic)
		// Also called -- Late binding or dynamic binding or runtime polymorphism
	
	    //Method 1
		@Override
		public int areaOfLand(int a, int b, int c) {
			int total1 = a + b + c + 56;
			System.out.println("Total area from local Calculator: " + total1);
			return total1;
		}

		// Method (2)
		@Override
		public int areaOfLand(int a, int b) {
			int total2 = a + b * 3;
			System.out.println("Total area from local Calculator: " + total2);
			return total2;
		}

		// Method (3) 
		@Override
		public int areaOfLand(int a, int b, String landName) {
			int total3 = a + b + Integer.parseInt(landName) -5;
			System.out.println("Total area from local Calculator: " + total3);
			return total3;
		}

		// Method (4)
		// Final type method cannot be Overriden
		// Cannot override the final method from LandCalculator
		
		/*
		public final int areaOfLand(int a, int b, int c, int d) {
			int total = a + b + c + d;
			System.out.println("Total area from local Calculator: " + total);
			return total;
		}
		*/

		//@Override //Static type Method (5) implemented
		 //The method areaOfLand of type ModernCalculator must override or implement a
		 //super type method (from super type class), not a static method (because static is a local method of a class)
		 //So, static method can't be override, if we remove @override it will work as
		 //static method of this modern calculator class
		
		public static int areaOfLand(int a, int b, int c, int d, int e) {
			int total = a + b + c + d + e+67;
			System.out.println("Total area from local Calculator: " + total);
			return total;
		}

		// void type parameterized method (6) is implemented
		@Override
		public void areaOfLand(int a, int b, int c, int d, int e, int f) {
			int total = a + b + c + d + e + f-3;
			System.out.println("Total area from local Calculator: " + total);
		}

		// void type method (7) is implemented
		@Override
		public void areaOfLand() {
			System.out.println("This is from void type method from Local Calculator which is overriden");
		}


}
