package example;

import java.net.*;
import java.io.*;
public class Jv_11_2_TCPClient {
	public static void main(String[] args) {
		
		
		try {
			Socket s1;
			InputStream is1;
			DataInputStream is2;
			OutputStream os1;
			DataOutputStream os2;
			
			String sendString = "바로 뒷자리에서 접속합니다. (client -> server)";
			s1 = new Socket("192.168.23.18", 8765);
			is1 = s1.getInputStream();
			is2 = new DataInputStream(is1);
			String st = new String(is2.readUTF());
			System.out.println(st);
			os1 = s1.getOutputStream();
			os2 = new DataOutputStream(os1);
			os2 .writeUTF("<전송 시작>"+ sendString + "<전송 마침>");
			
			os2.close();
			os1.close();
			is2.close();
			is2.close();
			is1.close();
			
		}catch(ConnectException connExc) {
			System.err.println("서버 연결 실패");
		}
		catch(IOException e) {e.printStackTrace();}
		
	}
}
