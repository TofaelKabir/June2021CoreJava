package lec53_java_coding_challenge;

public class FindMoreThanOneNumber {

	public static void main(String[] args) {
		int [] number = {100, 77, 1, 5, 6, 1, 6, 8, 55, 1, 7, 8, 5, 56, 323, 2, 44, 12};
		
		for(int i =0; i<number.length; i++) {
			
			for(int j=i+1; j<number.length; j++) {
				
				if(number[i] == number[j]) {
					
					System.out.println("The duplicate number is: "+number[i]);
				
				}
			}
		}

	}

}

