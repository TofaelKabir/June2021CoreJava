package lec22_java_string_manipulation;

public class UseOfStringBuffer01 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();  
		System.out.println(sb.capacity()); //default 16  
		
		StringBuffer sb2=new StringBuffer(67);  
		System.out.println(sb2.capacity());

		

	}

}
