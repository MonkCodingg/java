package example.kim;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy1 {
	//반드시 try ~ finally 작업할 것
	//파일 처리는 위험한 작업
	//throws exception 처리
	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("C:\\Users\\401ST-012\\Pictures\\python.png");
		//없으면 새로, 있으면 덮어 쓴다.
		OutputStream out = new FileOutputStream("copy.png");
		
		long start = System.currentTimeMillis();
		
		//얼만지 몰라
		while(true) {
			//읽어낸 한 바이트의 데이터는 int값으로 나온다. <-- 1바이트의 쓰여있는 값
			//255값
			int data = in.read();
			
			if(data == -1) {
				break;
			}
			
			out.write(data);
		}//end while
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		in.close();
		out.close();
	}

}
