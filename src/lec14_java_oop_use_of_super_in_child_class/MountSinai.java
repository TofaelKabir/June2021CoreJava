package lec14_java_oop_use_of_super_in_child_class;

public class MountSinai extends Employee {
	public String Moto;
	public int benefit;
	
	public MountSinai() {
		System.out.println("This constructor is from MountSinai class");
	}

	public MountSinai(String moto, int benefit) {
		this.Moto = moto;
		this.benefit = benefit;
		System.out.println("The moto is: "+moto + ", Benfit is: " + benefit);
	}
	
	public void mountsinaiInfo() {
		System.out.println("This is a void method from MountSinai class");
	}
	
	public void mountSinai(String moto, int benefit) {
		this.Moto = moto;
		this.benefit = benefit;
		System.out.println("The moto is: "+moto + ", Benfit is: " + benefit);
	}
	
	

}
