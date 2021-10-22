package lec07_01_java_constructor_details_with_info;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee1 = new Employee(); // Default Constructor initialized
		Employee employee2 = new Employee("Tofael"); // Parameterized constructor 01 initialized
		Employee employee3 = new Employee("Tofael", 2188458); // Parameterized constructor 02 initialized
		Employee employee4 = new Employee(2166458, "Bill"); // Parameterized constructor 03 initialized
		Employee employee5 = new Employee("Steve", 'M', true, 2166458); // Parameterized constructor 05 initialized
		Employee employee6 = new Employee(7367836, 'F', true); // Parameterized constructor 04 initialized
		Employee employee7 = new Employee('M', true, 2166458, "Joey"); // Parameterized constructor 06 initialized
		
		Employee employee8 = new Employee('F', false, 1166458, "John"); // Parameterized constructor 06 initialized
		employee8.employee('F', "Max", 34304343, false); // Parameterized method is initialized
		
		// summary:
		// we must have to put the variable in a sequence like the way local variable declared in constructor
		// it doesn't matter the sequence of variable declared inside sysout
		// It is possible to create a parameterized constructor with the same number of variable if they organized in a different manner. 
	
	}

}
