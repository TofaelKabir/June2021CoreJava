package lec07_02_java_constructor;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee(); // Default Constructor initialized
		Employee employee1 = new Employee("Steve", 'M', true, 2166458); // Parameterized constructor 05 initialized
		Employee employee2 = new Employee("Steffani", 'F', false, 2766458); // Parameterized constructor 05 initialized
		Employee employee3 = new Employee("John", 'M', false, 3766458); // Parameterized constructor 05 initialized
		Employee employee4 = new Employee("Michael", 'M', true, 6765658); // Parameterized constructor 05 initialized
		Employee employee5 = new Employee("Michelle", 'F', false, 8885658); // Parameterized constructor 05 initialized

	}

}


