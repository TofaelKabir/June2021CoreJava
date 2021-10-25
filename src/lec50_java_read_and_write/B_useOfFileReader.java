package lec50_java_read_and_write;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class B_useOfFileReader {
	public static void main(String[] args) throws FileNotFoundException {
        String path = "/Users/mohammadsharkar/Desktop/Alex/MyInfo.txt";

        FileReader fr = new FileReader(path);
        System.out.println("FileReader find the following path: "+path);
    }

}
