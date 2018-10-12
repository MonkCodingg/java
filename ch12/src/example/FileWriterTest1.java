package example;

import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterTest1 {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("test.txt");
		for (int i = 0; i < 11; i++) {
			String data = i + " 번째 줄입니다.\r\n";
			pw.println(data);
			
		}
		pw.close();
	}

}
