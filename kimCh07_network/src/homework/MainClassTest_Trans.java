package homework;

import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.lang.*;

public class MainClassTest_Trans {

	public static void main(String[] args) throws IOException {
		// 파일 불러오기
		// while 밖에서 서버 올라갈 때 한번 불러온다(csv 파일이 수정되더라도 반여이 안됨)
		// while 안에서 리스트에서 빼오기
		while (true) {
			try {

				List<DicItem> dataList = new ArrayList<DicItem>();
//				BufferedReader br = new BufferedReader(new FileReader("db.csv"));

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection(
							"jdbc:mysql://localhost/testdb?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8",
							"root", "123456");
					Statement stmt = conn.createStatement();
					ResultSet rset = stmt.executeQuery("select * from wordbook");
					while (rset.next()) {
						// 결과물 처리
						DicItem item = new DicItem();
						item.english = rset.getString(1);
						item.korean = rset.getString(2);
						dataList.add(item);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

				DatagramSocket ds = new DatagramSocket(6799);
				byte[] bf = new byte[1000];
				DatagramPacket dp = new DatagramPacket(bf, bf.length);

//				br.close();

				ds.receive(dp);
				String rs1 = new String(dp.getData(), "UTF-8");
				String rs2 = new String(rs1.trim());
				System.out.println("주소:" + dp.getAddress() + "   포트번호" + " :" + dp.getPort());
				System.out.println("수신된 메시지(Client->Server):" + rs2);

				String str = rs2;

				for (DicItem tempDicItem : dataList) {
					str = str.replaceAll(tempDicItem.english, tempDicItem.korean);
				}

				bf = str.getBytes("UTF-8");
				DatagramPacket dp2 = new DatagramPacket(bf, bf.length, dp.getAddress(), dp.getPort());
				System.out.println("발신 메시지(Server->Client to " + dp.getAddress() + "): " + str);
				ds.send(dp2);

				ds.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
