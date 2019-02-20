package homework;

import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.lang.*;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// 파일 불러오기
		// while 밖에서 서버 올라갈 때 한번 불러온다(csv 파일이 수정되더라도 반여이 안됨)
		// while 안에서 리스트에서 빼오기
		while(true) {
			try {
				List<DicItem> dataList = new ArrayList<DicItem>();
				BufferedReader br = new BufferedReader(new FileReader("db.csv"));
				
				DatagramSocket ds = new DatagramSocket(9999);
				byte[] bf = new byte[1000];
				DatagramPacket dp = new DatagramPacket(bf, bf.length);
				
				while(true){
					String line = br.readLine();
					if(line == null) break;
					String[] splitString;
					splitString = line.split(",");
					DicItem item = new DicItem();
					item.english = splitString[0];
					item.korean = splitString[1];
					dataList.add(item);
				}
				br.close();
				
				ds.receive(dp);
				String rs1 = new String(dp.getData(), "UTF-8");
				String rs2 = new String(rs1.trim());
				System.out.println("주소:" + dp.getAddress() + "   포트번호"
									+ " :" + dp.getPort());
				System.out.println("수신된 메시지(Client->Server):" + rs2);
				//받은 메시지1500				
				//rs2는 받은 메시지				
				// 클라이언트에 보낼 str ==> str = xxxxxx;
				// 결과는 xxx 달러 입니다.
				
				// 원화
//				double result = Double.parseDouble(rs2)*1.12;
//				String str = Double.toString(result);
				
//				String str = "";
//				if (rs2.contains("shit")) {
//					str = "욕하지마라...-_++ ";
//				}else {
//					str = "Thanks~ ^^* ";
//				}
				String str = rs2;
				// if 문 사용하지 않아도 된다
				// replacAll 함수 안에 if 문이 포함되어 있다.				
//				str = str.replaceAll("hi", "안녕");
//				str = str.replaceAll("my", "내");
//				str = str.replaceAll("name", "이름은");
//				str = str.replaceAll("is kim","킴이야");
				for(DicItem tempDicItem : dataList) {
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
