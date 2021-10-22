package lec07_02_java_constructor;

public class Employee {
	public String EmpName;
  public int empID;
	public char empSex;
	public boolean fullTimeEmployee;

	
	public Employee() {
		System.out.println("This default constructor is from Employee class");
	}

	
	public Employee(String EmpName, char empSex, boolean fullTimeEmployee, int empID) {
		this.EmpName = EmpName;
		this.empID = empID;
		this.empSex = empSex;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee sex: " + empSex + ", ID: " + empID + ", Name: " + EmpName
				+ "and full Time Employee? : " + fullTimeEmployee);
	}


	

}
