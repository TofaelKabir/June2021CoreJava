package lec07_01_java_constructor_details_with_info;

public class Employee {
	// Global variable or class variable
	public String EmpName;
	public int empID;
	public char empSex;
	public boolean fullTimeEmployee;

	// Default Constructor or no argument constructor
	// A class can contain one default and multiple parameterized constructor
	// Default Constructor must be declared before parameterized constructor. 
	// Default Constructor must be declared either it is necessary or not
	public Employee() {
		System.out.println("This default constructor is from Employee class");
	}

	// Parameterized constructor 01 declared
	public Employee(String EmpName) { // local variable
		this.EmpName = EmpName;
		System.out.println("Employee Name: " + EmpName);

	}

	// Parameterized constructor 02 declared
	public Employee(String EmpName, int empID) { // local variable
		this.EmpName = EmpName;
		this.empID = empID;
		System.out.println("Employee Name: " + EmpName + " and ID: " + empID);

	}

	// Parameterized constructor 03 declared,
	// local variables are placed in different position
	// Sysout outcome also not similar as the sequence of local variable
	public Employee(int empID, String EmpName) { // local variable
		this.empID = empID;
		this.EmpName = EmpName;
		System.out.println("Employee Name: " + EmpName + " and ID: " + empID);

	}

	// Parameterized constructor 04 declared,
	// local variables are placed in different position
	// Sysout outcome also not similar as the sequence of local variable
	public Employee(int empID, char empSex, boolean fullTimeEmployee) {
		this.empID = empID;
		this.empSex = empSex;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println(
				"Employee sex: " + empSex + ", ID: " + empID + " and full Time Employee? : " + fullTimeEmployee);
	}

	// we can create parameterized constructor by -- select variables, right click
	// -- source -- generate constructor using fields
	// Choose where you want to create it by choosing insertion point
	// another way from top -- select source

	// Parameterized constructor 05 declared,
	// local variables are placed in different position
	// Sysout outcome also not similar as the sequence of local variable
	public Employee(String EmpName, char empSex, boolean fullTimeEmployee, int empID) {
		this.EmpName = EmpName;
		this.empID = empID;
		this.empSex = empSex;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee sex: " + empSex + ", ID: " + empID + ", Name: " + EmpName
				+ "and full Time Employee? : " + fullTimeEmployee);
	}

	// Parameterized constructor 06 declared,
	// it's possible to create a parameterized constructor by different combination
	// of variable
	public Employee(char empSex, boolean fullTimeEmployee, int empID, String EmpName) {
		this.EmpName = EmpName;
		this.empID = empID;
		this.empSex = empSex;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee sex: " + empSex + ", ID: " + empID + ", Name: " + EmpName
				+ "and full Time Employee? : " + fullTimeEmployee);
	}

	// parameterized method
	public void employee(char sex, String empName, int empID, boolean fullTimeEmployee) {
		this.EmpName = empName;
		this.empID = empID;
		this.empSex = sex;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee Name: " + EmpName + ", ID: " + empID + ", Sex: " + sex
				+ " and Full Time employee? " + fullTimeEmployee);
	}

}
