package lec60_java_coding_challenge;

import java.util.HashSet;
import java.util.Set;

public class I_findMoreThanOneElement {

	public static void main(String[] args) {
		String[] names = { "java", "Selenium", "hello", "hi", "java", "selenium", "java", "hello", "Bye" };
		Set<String> duplicateStrings = new HashSet<String>();

		for (int i = 0; i < names.length; i++) {

			for (int j = i + 1; j < names.length; j++) {

				if (names[i].equals(names[j])) {
					duplicateStrings.add(names[i]);

				}
			}
		}
		System.out.println(duplicateStrings);

	}

}
