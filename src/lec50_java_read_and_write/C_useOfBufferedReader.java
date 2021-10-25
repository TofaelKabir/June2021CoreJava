package lec50_java_read_and_write;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C_useOfBufferedReader {
	public static void main(String[] args) throws IOException {
        String path = "/Users/mohammadsharkar/Desktop/Alex/MyInfo.txt";

        FileReader fr = new FileReader(path);
        System.out.println("FileReader find the following path: "+path);

        BufferedReader br = new BufferedReader(fr);
        String data;
        while ((data = br.readLine())!=null){
            System.out.println("the bufferedreader read the file as "+data);
        }
    }

}
