package lec64_java_coding_challenge;

public class G_largestAndSmallestNumber {

	public static void main(String[] args) {
		int [] number = {100, 77, 5, 6, 6, 8, 55, 7, 8, 5, 56, 323, 2, 44, 12, 1, 456, 6, 4, 5, 5};
		
		int largest = number[0];
		int smallest = number[0];
		
		for(int i=1; i<number.length; i++) {
			if (number[i]>largest) {
				largest = number[i];
			}else if (number[i]<smallest) {
				smallest = number[i];
			}
		}
		
		
		System.out.println("The largest number is : "+ largest);
        System.out.println("The smallest number is :" + smallest);
	}

}

