package lec60_java_coding_challenge;

// || logical or operator, if one condition is true, then the all are true even rest are false

public class D_countVowel {

	public static void main(String[] args) {
		String s = "Pack my box with five dozen liquor jugs";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println(count);

	}

}
