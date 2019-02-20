package example;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Jv_11_4_UDPClient {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket();
			InetAddress ia = InetAddress.getByName("192.168.23.13");
			Scanner sc = new Scanner(System.in);
			while (true) {
				String str = sc.nextLine();
//				byte[] bf = args[0].getBytes();
				byte[] bf = str.getBytes("utf-8");
				DatagramPacket dp = new DatagramPacket(bf, bf.length, ia, 9999);
				ds.send(dp);
				ds.receive(dp);
				String rs1 = new String(dp.getData(), "UTF-8");
				String rs2 = new String(rs1.trim());
				System.out.println("주소:" + dp.getAddress() + " 포트번호:"
									+ dp.getPort());
				System.out.println("수신된 메시지(Client->Server): " + rs2);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
