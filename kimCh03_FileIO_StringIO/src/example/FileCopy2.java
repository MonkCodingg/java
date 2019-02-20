package example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy2 {
	
	//파일 처리는 위험한 작업
	//throws exception 처리
	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("C:\\python.png");
		//없으면 새로, 있으면 덮어 쓴다.
		OutputStream out = new FileOutputStream("copy.png");
		
		//바가지 --> buffer
		byte[] buffer = new byte[1024*8];
		
		long start = System.currentTimeMillis();
		
		while(true) {
			//데이터는 바가지 몇 개나 새로운 데이터를 읽어는지.. count
			//a b c d e -- f g h i j -- k l m i j 
			int count = in.read(buffer);
			//바가지에 새로운 데이터가 없다. 다읽었다.
			
			if(count == -1) {
				break;
			}//end if
			
			out.write(buffer, 0, count);
		}//end while
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
		in.close();
		out.close();
	}

}
