package lec53_java_coding_challenge;

public class I_findMoreThanOneElement {

	public static void main(String[] args) {
		String [] name= {"java", "Selenium", "hello", "java", "Selenium", "java", "hello"};
		
		for(int i =0; i<name.length; i++) {
			
			for(int j=i+1; j<name.length; j++) {
				
				if(name[i].equals(name[j])) {
					
					System.out.println("The duplicate name is: "+name[i]);
				
				}
			}
		}

	}

}

