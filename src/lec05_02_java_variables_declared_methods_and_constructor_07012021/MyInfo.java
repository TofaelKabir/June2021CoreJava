package lec05_02_java_variables_declared_methods_and_constructor_07012021;

public class MyInfo {
// what is the advantage of using variables as declared?
	// we can use the same variables to initialize value for multiple data set
	public String MyName; // variable declared
	public int myAge;
	public char mySex;
	public boolean usaCitizen;
	public byte myWorkingYear;
	public short myHouseRent;
	public long myYearlySalary;
	public float myGrade;
	public double myHeight;

	public MyInfo() { // constructor declared
		System.out.println("This is called default constructor");
	}

	public void myInfo() { // method implemented
		System.out.println("My name is: " + MyName + ", Age: " + myAge + ", sex: " + mySex
				+ ". Am I a USCitizen? " + usaCitizen + ". I worked for " + myWorkingYear
				+ "year. My yearly house rent is: " + myHouseRent + ". My yearly salary: " + myYearlySalary
				+ ". My grade: " + myGrade + " and my height: " + myHeight);
	}

}
