package example;

import java.net.*;
import java.io.*;
import java.lang.*;

public class Jv_11_3_UDPServer_homework {

	public static void main(String[] args) {
		while(true) {
			try {
				DatagramSocket ds = new DatagramSocket(9999);
				byte[] bf = new byte[30];
				DatagramPacket dp = new DatagramPacket(bf, bf.length);
				ds.receive(dp);
				String rs1 = new String(dp.getData());
				String rs2 = new String(rs1.trim());
				System.out.println("주소:" + dp.getAddress() + "   포트번호"
									+ " :" + dp.getPort());
				System.out.println("수신된 메시지(Client->Server):" + rs2);
				String str = "";
				if (rs2.equals("apple")) {
					str = "fruit";
				}else {
					str = "error";
				}
				bf = str.getBytes();
				DatagramPacket dp2 = new DatagramPacket(bf, bf.length, dp.getAddress(), dp.getPort());
				System.out.println("발신 메시지(Server->Client to " + dp.getAddress() + "): " + str);
				ds.send(dp2);
				
			} catch (IOException e) {
				System.out.println(e);
			}
					
		}
	}

}
