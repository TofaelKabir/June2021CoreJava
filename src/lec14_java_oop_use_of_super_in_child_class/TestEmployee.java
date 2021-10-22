package lec14_java_oop_use_of_super_in_child_class;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("------------------------------------- default constructor initialize -----------------------------------------\n");
		Employee employee = new Employee();
		System.out.println("\n-------------------------------------- parameterized constructor initialize ----------------------------------------\n");
		Employee employee1 = new Employee("Tofael", 483, 'M', false); 
		System.out.println("\n---------------------------------------- void type method initialize --------------------------------------\n");
		employee1.empInfo(); 
		System.out.println("\n---------------------------------------- void type parameterized method initialize --------------------------------------\n");
		employee1.info("Sharkar", 228145, 'M', true); // 
		
		System.out.println("\n----------------------------------------- default constructor initialize -------------------------------------\n");
		MountSinai mountSinai = new MountSinai();			
		System.out.println("\n-------------------------------------- parameterized constructor initialize ----------------------------------------\n");
		MountSinai mountSinai1 = new MountSinai("We care about your health", 10000);	
		System.out.println("\n---------------------------------------- void type method initialize --------------------------------------\n");
		mountSinai1.mountsinaiInfo();
		System.out.println("\n---------------------------------------- void type parameterized method initialize --------------------------------------\n");
		mountSinai1.mountSinai("Health is wealth", 2000);
		System.out.println("\n---------------------------------------- void type method inherited from Employee Class --------------------------------------\n");
		mountSinai1.empInfo();
		System.out.println("\n---------------------------------------- void type parameterized method inherited from Employee Class --------------------------------------\n");
		mountSinai1.info("Kabir", 56754, 'M', false);

	}

}
