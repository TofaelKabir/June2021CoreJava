package lec60_java_coding_challenge;

public class A_characterOneByOneVertical {

	public static void main(String[] args) {
		String s = "Tofael Kabir";
		//System.out.println(s.length());
		for(int i=0; i<s.length(); i++) { // why we are using s.length()
			System.out.println(s.charAt(i));
		}

	}

}
