package lec13_java_oop_encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStName("Tofael");
		student.setStId(483);
		student.setSex('M');
		student.setUsCitizen(false);
		student.setGrade(3.765f);  // new, we have to use f after float initialization
		student.setAge(45.68768);
		
		System.out.println("Name: "+student.getStName()+", \nID: "+student.getStId()+", \nSex: "+student.getSex()+", \nUS Citizen: "+student.isUsCitizen()+", \ngrade: "+student.getGrade()+" and \nAge: "+student.getAge());
		
		
		
	}

}
