package homework;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Jv_11_4_UDPClient {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket();
			InetAddress ia = InetAddress.getByName("127.0.0.1");
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("원문: ");
				String str = sc.nextLine();
//				byte[] bf = args[0].getBytes();
				byte[] bf = str.getBytes("UTF-8");
				DatagramPacket dp = new DatagramPacket(bf, bf.length, ia, 6799);
				ds.send(dp);
				
				bf = new byte[65508];
//				dp = new DatagramPacket(bf, bf.length);
				
				ds.receive(dp);
				
				String rs1 = new String(dp.getData(), "UTF-8");
				String rs2 = new String(rs1.trim());
				System.out.println("주소:" + dp.getAddress() + " 포트번호:"
									+ dp.getPort());
				System.out.println("수신된 메시지(Server->Client): " + rs2);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
