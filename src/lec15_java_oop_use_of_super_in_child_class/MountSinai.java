package lec15_java_oop_use_of_super_in_child_class;

// MountSinai is a child class(or sub class )
// Employee is a Parent class(or Super Class or Base class)

public class MountSinai extends Employee {
	public String Moto;
	public int benefit;

	// default constructor
	public MountSinai() {
		// we use super method to call the constructor of super class
		// Constructor call must be the first statement in a constructor, try putting
		// the super method (after sysout of default constructor)
		// Either default or parameterized constructor can be called, thats why below
		// line in comment out
		// super();
		super("Jennifer", 473, 'F', false);
		// super keyword is used to call (initialize) the methods of Parent class
		// super keyword is used to call (initialize) the variables of Parent class
		super.empInfo();
		super.info("Bill", 890, 'M', true);
		super.Location = "Manhattan";
		super.zipCode = 10029;
		System.out.println("Location of Mountsinai: " + Location + ", zipCode: " + zipCode);
		System.out.println("This default constructor is from MountSinai class");
	}

	// parameterized constructor
	public MountSinai(String moto, int benefit) {
		super();
		//super("Matt", 42373, 'M', true);
		super.empInfo();
		super.info("Bob", 83190, 'M', false);
		super.Location = "Bronx";
		super.zipCode = 111359;
		System.out.println("Location of Mountsinai: " + Location + ", zipCode: " + zipCode);
		this.Moto = moto;
		this.benefit = benefit;
		System.out.println("The moto is: " + moto + ", Benfit is: " + benefit);
	}

	// void type method
	public void mountsinaiInfo() {
		// we can't call constructor of super class inside a method of child class.
		// super();
		super.empInfo();
		super.info("Chris", 8312390, 'M', true);
		super.Location = "Brooklyn";
		super.zipCode = 132359;
		System.out.println("Location of Mountsinai: " + Location + ", zipCode: " + zipCode);
		System.out.println("This is a void type method from MountSinai class");
	}

	// void type parameterized method
	public void mountSinai(String moto, int benefit) {
		// we can't call constructor of super class inside a method of child class.
		// super();
		super.empInfo();
		super.info("Douglas", 12390, 'M', false);
		super.Location = "Queens";
		super.zipCode = 11435;
		System.out.println("Location of Mountsinai: " + Location + ", zipCode: " + zipCode);
		this.Moto = moto;
		this.benefit = benefit;
		System.out.println("The moto is: " + moto + ", Benfit is: " + benefit);
	}

}
