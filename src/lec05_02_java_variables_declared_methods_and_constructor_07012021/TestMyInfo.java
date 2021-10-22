package lec05_02_java_variables_declared_methods_and_constructor_07012021;

public class TestMyInfo {

	public static void main(String[] args) {
		
		MyInfo tofael = new MyInfo(); // MyInfo class in instantiated here by creating an object
		tofael.MyName = "Tofael";
		tofael.myAge = 46;
		tofael.mySex = 'M';
		tofael.usaCitizen = false;
		tofael.myWorkingYear = 17;
		tofael.myHouseRent = 23345;
		tofael.myYearlySalary = 623545278786l;
		tofael.myGrade = 3.122f;
		tofael.myHeight = 1.7636847628364;		
		tofael.myInfo();
		System.out.println("****************************************************************************************************************");
		
		MyInfo steve = new MyInfo(); // MyInfo class in instantiated here again by creating a different object
		steve.MyName = "steve";
		steve.myAge = 41;
		steve.mySex = 'M';
		steve.usaCitizen = true;
		steve.myWorkingYear = 8;
		steve.myHouseRent = 23367;
		steve.myYearlySalary = 623545654786l;
		steve.myGrade = 3.672f;
		steve.myHeight = 1.7636867828364;		
		steve.myInfo();
		System.out.println("****************************************************************************************************************");
		
		
		MyInfo bill = new MyInfo();  // MyInfo class in instantiated here again by creating a different object
		bill.MyName = "Bill";
		bill.myAge = 41;
		bill.mySex = 'M';
		bill.usaCitizen = true;
		bill.myWorkingYear = 8;
		bill.myHouseRent = 23367;
		bill.myYearlySalary = 623545654786l;
		bill.myGrade = 3.672f;
		bill.myHeight = 1.7636867828364;		
		bill.myInfo();
		
		
		

	}

}
