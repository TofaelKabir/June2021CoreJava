package lec50_java_read_and_write;

import java.io.File;
import java.util.Scanner;

public class A_creatingFolderAndFile {
	public static void main(String[] args) {
		File folder = new File("/Users/mohammadsharkar/Desktop/Alex");
		folder.mkdir();
		if (folder.exists()) {
			System.out.println(folder.getName() + " is created");
			File file = new File("/Users/mohammadsharkar/Desktop/Alex/MyInfo.txt");
			try {
				file.createNewFile();
			} catch (Exception ex) {
				System.out.println("the error is :" + ex);
			}
			if (file.exists()) {
				System.out.println(file.getName() + " is created");
				Scanner sc = new Scanner(System.in);
			}
		}
	}

}
