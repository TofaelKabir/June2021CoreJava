package lec15_java_oop_use_of_super_in_child_class;

public class Employee {
	// global variables
	public String EmpName;
	public int empId;
	public char sex;
	public boolean usCitizen;
	public String Location;
	public int zipCode;

	// default constructor
	public Employee() {
		System.out.println("This is a default constructor from Employee class");
	}

	// parameterized constructor
	public Employee(String empName, int empId, char sex, boolean usCitizen) { // local variable also called parameter
		this.EmpName = empName;
		this.empId = empId;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + empName + ", Id: " + empId + ", Sex: " + sex + " and US Citizen: " + usCitizen);
	}

	// Void or no return method or non parameterized method
	public void empInfo() {
		System.out.println("This void type method is from Employee class");
	}

	// parameterized method
	public void info(String empName, int empId, char sex, boolean usCitizen) {
		this.EmpName = empName;
		this.empId = empId;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Id: " + empId + ", Name: " + empName + ", Sex: " + sex + " and US Citizen: " + usCitizen);
	}

}
