package lec36_java_collection_array;

import java.util.Random;

// scanner is not working have to see
public class UseOfArray10 {

	public static void main(String[] args) {
		int [] a = new int[5];

        Random random = new Random();  //class
      
        for(int i=0; i<a.length; i++) {
            a[i] = random.nextInt(100); //if has boundary
            System.out.println(a[i]);
        }

	}
}
