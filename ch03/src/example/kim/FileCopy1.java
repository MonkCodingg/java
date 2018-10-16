package example.kim;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy1 {
	//�ݵ�� try ~ finally �۾��� ��
	//���� ó���� ������ �۾�
	//throws exception ó��
	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("C:\\Users\\401ST-012\\Pictures\\python.png");
		//������ ����, ������ ���� ����.
		OutputStream out = new FileOutputStream("copy.png");
		
		long start = System.currentTimeMillis();
		
		//���� ����
		while(true) {
			//�о �� ����Ʈ�� �����ʹ� int������ ���´�. <-- 1����Ʈ�� �����ִ� ��
			//255��
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
