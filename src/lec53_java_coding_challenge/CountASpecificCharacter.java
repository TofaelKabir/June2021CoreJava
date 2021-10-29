package lec53_java_coding_challenge;


public class CountASpecificCharacter {

	public static void main(String[] args) {
		String s = "Ziyad Alz Khilanliez";
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.toLowerCase().charAt(i)=='z') { // turn String to lower case, if not specific like lower case or upper case 
				count++;
			}
		}
		System.out.println(count);
	}

}
