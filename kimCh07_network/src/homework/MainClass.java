package homework;

import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.lang.*;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// ���� �ҷ�����
		// while �ۿ��� ���� �ö� �� �ѹ� �ҷ��´�(csv ������ �����Ǵ��� �ݿ��� �ȵ�)
		// while �ȿ��� ����Ʈ���� ������
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
				System.out.println("�ּ�:" + dp.getAddress() + "   ��Ʈ��ȣ"
									+ " :" + dp.getPort());
				System.out.println("���ŵ� �޽���(Client->Server):" + rs2);
				//���� �޽���1500				
				//rs2�� ���� �޽���				
				// Ŭ���̾�Ʈ�� ���� str ==> str = xxxxxx;
				// ����� xxx �޷� �Դϴ�.
				
				// ��ȭ
//				double result = Double.parseDouble(rs2)*1.12;
//				String str = Double.toString(result);
				
//				String str = "";
//				if (rs2.contains("shit")) {
//					str = "����������...-_++ ";
//				}else {
//					str = "Thanks~ ^^* ";
//				}
				String str = rs2;
				// if �� ������� �ʾƵ� �ȴ�
				// replacAll �Լ� �ȿ� if ���� ���ԵǾ� �ִ�.				
//				str = str.replaceAll("hi", "�ȳ�");
//				str = str.replaceAll("my", "��");
//				str = str.replaceAll("name", "�̸���");
//				str = str.replaceAll("is kim","Ŵ�̾�");
				for(DicItem tempDicItem : dataList) {
					str = str.replaceAll(tempDicItem.english, tempDicItem.korean);
				}
				
				bf = str.getBytes("UTF-8");
				DatagramPacket dp2 = new DatagramPacket(bf, bf.length, dp.getAddress(), dp.getPort());
				System.out.println("�߽� �޽���(Server->Client to " + dp.getAddress() + "): " + str);
				ds.send(dp2);
				
				ds.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
	}

}
