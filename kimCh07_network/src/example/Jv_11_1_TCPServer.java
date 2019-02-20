package example;

import java.net.*;
import java.io.*;
public class Jv_11_1_TCPServer {
	public static void main(String[] args) {
		ServerSocket s1 = null;
		Socket s2;
		OutputStream os1;
		DataOutputStream os2;
		InputStream is1;
		DataInputStream is2;
		try {
			s1 = new ServerSocket(34623);
			
		}catch(IOException e) {e.printStackTrace();}
		while(true) {
			try {
				System.out.println("클라이언트 대기중 ....");
				s2 = s1.accept();
				System.out.println("클라이언트 접송 성공!");
				os1 = s2. getOutputStream();
				os2 = new DataOutputStream(os1);
				os2.writeUTF("Welecom to connect to TCP Sever!"
						+ "(server ->client)");
				
				is1 = s2.getInputStream();
				is2 = new DataInputStream(is1);
				String st = new String(is2.readUTF());
				System.out.println(st);
				
				is1.close();
				is2.close();
				os1.close();
				os2.close();
				s2.close();
			
			}catch(IOException e) {e.printStackTrace();}
		}
	}
}
