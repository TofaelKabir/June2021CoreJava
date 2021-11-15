package lec60_java_coding_challenge;

public class N_RemoveJunk {
	public static void main(String[] args) {

		String s = "hello%&^&()";
		// ^a-zA-Z0-9 = called regular expression or regex
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

		String s1 = "*&^%$java";
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);

	}

}
