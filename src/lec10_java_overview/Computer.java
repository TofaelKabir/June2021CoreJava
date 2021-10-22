package lec10_java_overview;

//first see Computer 01, 02 class, then see this

public class Computer {
	
	//global variable or class variable
	public String Brand; //variable declared
	public int price;
	public char grade;
	public boolean madeInUSA;
	public float review;
	
	//default constructor declared
	public Computer() {
		System.out.println("This is from default constructor");
	}
	
	
	public Computer(String brand, int price, char grade) {
		Brand = brand;
		this.price = price;
		this.grade = grade;
		System.out.println("\tMy computer brand: "+brand + ", \n\tPrice: "+price+", \n\tgrade: "+grade);
	}


	public Computer(String brand, int price, char grade, boolean madeInUSA) { // local variable
		this.Brand = brand;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("\tMy computer brand: "+Brand + ", \n\tPrice: "+price+", \n\tgrade: "+grade+", \n\tis it Made in USA? "+madeInUSA);
	}

	//void type method
	public void computer() {
		System.out.println("This is from method");
		
	}
	
	public void myConfiguration(String brand, int price, char grade, boolean madeInUSA) { // local variable
		this.Brand = brand;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("\tMy computer brand: "+Brand + ", \n\tPrice: "+price+", \n\tgrade: "+grade+", \n\tis it Made in USA? "+madeInUSA);
	}
	
	

	

}
