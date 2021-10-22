package lec50_java_read_and_write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Formatter;
import java.util.Scanner;

public class JavaReadAndWrite {

	public static void main(String[] args) throws FileNotFoundException {
		File folder = new File("/Users/mohammadsharkar/Desktop/Kamal");
		folder.mkdir();
		if (folder.exists()) {
			System.out.println(folder.getName() + " folder is created in Desktop");
			File file = new File("/Users/mohammadsharkar/Desktop/Kamal/MyInfo.txt");
			try {
				file.createNewFile();
			} catch (Exception e) {
				System.out.println("The exception is: " + e);
			}

			if (file.exists()) {
				System.out.println(file.getName() + " file is created inside the folder");
				System.out.println("Write something about Tofael");
				Scanner scanner = new Scanner(System.in);
				String userinput = scanner.nextLine();

				try {
					Formatter formatter = new Formatter("/Users/mohammadsharkar/Desktop/Kamal/MyInfo.txt");

					formatter.format("%s", userinput);
					formatter.close();

				} catch (Exception r) {
					System.out.println("the error is : " + r);

				}
				System.out.println("Now go to Desktop and check for folder and file inside it");

				FileReader fr = new FileReader(file);
				System.out.println("FileReader find the following file: " + file);

			}

		}

	}
}
