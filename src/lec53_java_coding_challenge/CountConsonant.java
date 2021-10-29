package lec53_java_coding_challenge;

// && logical and operator, if all the condition is true, then the final outcome is true

public class CountConsonant {

	public static void main(String[] args) {
		String s = "ziyad alz khilanliez";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o'
					&& s.charAt(i) != 'u') {
				count++;
			}
		}
		System.out.println(count);

	}

}
