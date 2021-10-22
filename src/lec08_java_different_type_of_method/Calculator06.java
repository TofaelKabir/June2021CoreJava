package lec08_java_different_type_of_method;

public class Calculator06 {
	// important interview question
		public int addition(String c, int a, String b) {
			int total1 = (Integer.parseInt(c))+ a+(Integer.parseInt(b));
			System.out.println("Addition of a & b & c: "+total1);
			return total1;
	}

}
