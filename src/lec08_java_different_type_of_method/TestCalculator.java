package lec08_java_different_type_of_method;

public class TestCalculator {

	public static void main(String[] args) {
		System.out.println("\n-------------------------------------");
		Calculator01 calculator01 = new Calculator01();
		calculator01.addition();
		calculator01.subtraction();
		
		System.out.println("\n-------------------------------------");
		Calculator02 calculator02 = new Calculator02();
		calculator02.addition();
		calculator02.subtraction();
		
		System.out.println("\n-------------------------------------");
		Calculator03 calculator03 = new Calculator03();
		calculator03.addition(23, 11);
		calculator03.addition(88, 81);
		calculator03.subtraction(34, 21);
		calculator03.subtraction(4, 1);
		calculator03.multiplication(7, 5);
		calculator03.division(40, 10);
		calculator03.boby(40, 10, 6);
		
		System.out.println("\n-------------------------------------");
		Calculator04 calculator04 = new Calculator04();
		calculator04.addition(53, 711);
		calculator04.subtraction(8, 86);
		
		System.out.println("\n-------------------------------------");
		Calculator05 calculator05 = new Calculator05();
		calculator05.addition(54, "44");
		
		System.out.println("\n-------------------------------------");
		Calculator06 calculator06 = new Calculator06();
		calculator06.addition("65", 77, "44");
		
		System.out.println("\n-------------------------------------");
		Calculator07 calculator07 = new Calculator07();
		calculator07.multiplication();
		
		System.out.println("\n-------------------------------------");
		Employee employee = new Employee();
		employee.empInfo(2188458, "Mohammad", "Sharkar", 'M', false);
		
		System.out.println("\n-------------------------------------");
		Student student = new Student();
		student.stID(20210089, "Bill", "Gates", 'M', true);
		
		

	}

}
