package lec13_java_oop_encapsulation;

// to get access of private variable , we have to use getter setter method
public class Student {

	private String StName;
	private int stId;
	private char sex;
	private boolean usCitizen;
	private float grade;
	private double age;

	public String getStName() {
		return StName;
	}

	public void setStName(String stName) {
		this.StName = stName;
	}

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

}
