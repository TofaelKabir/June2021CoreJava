package lec36_java_control_statements_loop_for_each_loop_only;

public class Use_of_java_for_each_loop {

	public static void main(String[] args) {
		// For each loop is generally used for Array
		int[] a = new int[6]; // declaring size of an array
		a[0] = 5;
		a[1] = 15;
		a[2] = 50;

		a[5] = 56;
		
		System.out.println("\n------------- Printing all index value of Array by for each loop -------------");
		for(int i: a) {
			System.out.println(i);
		}
		
	}

}