package lec60_java_coding_challenge;

// && logical and operator, if all the condition is true, then the final outcome is true

public class E_countConsonant {

	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
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