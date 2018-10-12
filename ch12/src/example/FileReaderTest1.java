package example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderTest1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		while(true) {
			
			String line = br.readLine();
			if (line==null) break;
			System.out.println(line);
			
		}
		br.close();
		Scanner in = new Scanner(System.in);
		String d = in.nextLine();
		System.out.println(d);

		
	}

}
