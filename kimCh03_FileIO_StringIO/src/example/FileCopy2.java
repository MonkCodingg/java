package example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy2 {
	
	//���� ó���� ������ �۾�
	//throws exception ó��
	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("C:\\python.png");
		//������ ����, ������ ���� ����.
		OutputStream out = new FileOutputStream("copy.png");
		
		//�ٰ��� --> buffer
		byte[] buffer = new byte[1024*8];
		
		long start = System.currentTimeMillis();
		
		while(true) {
			//�����ʹ� �ٰ��� �� ���� ���ο� �����͸� �о����.. count
			//a b c d e -- f g h i j -- k l m i j 
			int count = in.read(buffer);
			//�ٰ����� ���ο� �����Ͱ� ����. ���о���.
			
			if(count == -1) {
				break;
			}//end if
			
			out.write(buffer, 0, count);
		}//end while
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
		in.close();
		out.close();
	}

}
