package lec12_java_oop_inheritance_02;

public class Grandfather {
	
	public String Name; // variable declared
	public int age;
	public char sex;
	public boolean usCitizen;
	
	// default constructor
	public Grandfather() { // constructor declared
		System.out.println("This is a default constructor from Grandfather class");
	}
	
	// parameterized constructor
	public Grandfather(String name, int age, char sex, boolean usCitizen) { // constructor declared
		this.Name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: "+name+"\nAge:"+age+"\nSex:"+sex+"\nUSA Citizen: "+usCitizen);
	}

	// void type method
	public void grandfatherInfo() { // method implemented
		System.out.println("Grandfather: Ismail");
	}
	
	//parameterized method 
	public void grandfatherinfo(String name, int age, char sex, boolean usCitizen) {  // method implemented
		this.Name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: "+name+"\nAge:"+age+"\nSex:"+sex+"\nUSA Citizen: "+usCitizen);
	}
	

}
