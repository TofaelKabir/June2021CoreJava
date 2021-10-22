package lec08_java_different_type_of_method;

public class Employee {
	public int EmpID;
	public String FirstName;
	public String LastName;
	public char Sex;
	public boolean USACitizen;

	public void empInfo(int empID, String FirstName, String LastName, char Sex, boolean USACitizen) {
		this.EmpID = empID;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Sex = Sex;
		this.USACitizen = USACitizen;
		System.out.println(FirstName + "  " + empID + "  " + USACitizen + "  " + LastName + "  " + Sex);

	}

}
