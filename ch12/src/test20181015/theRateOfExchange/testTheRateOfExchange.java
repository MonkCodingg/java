package test20181015.theRateOfExchange;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testTheRateOfExchange {
	static double transRate;
	static String inputNationCode;
	static int input;
	static double trans;
	public static List<TheRateOfExchangeItem> theRateOfExchangeItems = new ArrayList<>();

	public static void main(String[] args) throws Exception {
//		double transRate = 0;
//		double input = 0;
//		String inputNationCode;
		// double usd;
		// input ��ȭ
		// transRate ȯ��

//		int return_us, return_kor;

		Scanner myInput = new Scanner(System.in);

		/*
		 * System.out.println("���� �ڵ��Դϴ�.(JPA)");
		 * System.out.println("�߰��Ͻðڽ��ϱ�? (1:Yes, 2:No) : ");
		 * System.out.println("������ ����Ǿ����ϴ�.");
		 */
		// ȯ���� ���Ͽ��� �Է¹޾�(input.txt)
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
//		FileInputStream fIn = new FileInputStream("input.txt");
//		BufferedReader br = new BufferedReader(new InputStreamReader(fIn));

		System.out.print("ȯ�� ����� ���� ��ȭ �ݾ��� �Է��ϼ���: ");
//		input = 11200;
		input = myInput.nextInt();
		
//		inputNationCode ="JPA";
		
		// System.out.println("���� �ڵ��Դϴ�.(JPA)");
		// ���� �ڵ��� ���� input.txt ������ ��ü ���� �ڵ带
		// ��ȸ�Ͽ� �� �ؾ� �Ѵ�.
		// arr[0]�� ���� ����.
		// ��ȸ �Ͽ� ���� ���� ������ ��
		// ���� ���� ������ ����
		// ���� ���� �޼��� ���
		// mrk �Է¹��� ���� �ڵ尡 input.txt�� �ִ��� ���翩��.
		System.out.println("��ȯ�� ���� �ڵ带 �Է��ϼ��� : ");
		inputNationCode = myInput.next();
		boolean existInputNationMrk = false;


		while (true) {
			
			System.out.println("1");
			String line = br.readLine();
			//������ ���� �ƴѰ��
			if (line != null) {
				System.out.println("2");
				String[] arr = line.split(",");
				// arr[0]�� nation �ڵ��̴�

				// �Է� ���� ���� �ڵ�� �� ��
				// ��ġ �ϸ� arr[1]�� ���� ȯ��(static ����)�� ����.
				if (arr[0].equals(inputNationCode)) {
					System.out.println("3");
					existInputNationMrk = true;
					transRate = Double.parseDouble(arr[1]);
					
					//���
					trans = input * transRate;
					
					System.out.println("�߰��Ͻðڽ��ϱ�? (1:Yes, 2:No) : ");
					// yes �� ȯ�������۰�ü ����� �Ӽ� �����ϴ� �޼��� ����.
					// ���۸��� �ʱ�ȭ�� input.txt ù������ �̵�.
					// �ٽ� ���� �����ڵ� �Է¹ޱ�
					
					if (1 == myInput.nextInt()) {
						System.out.println(4);
						create();
						//���۸��� �ʱ�ȭ �ʿ�
						//�ٽ� ó�� ù����� input.txt ���Ͽ��� �ҷ��� �� �ؾ���.
						//���ϸ� line�� ���� ���� null������ ������ ����.
						br.close();
						br = new BufferedReader(new FileReader("input.txt"));
						
						System.out.println("��ȯ�� ���� �ڵ带 �Է��ϼ��� : ");
						// static ������ ����
						inputNationCode = myInput.next();
						existInputNationMrk = false;
						
					//�߰��Ͻðڽ��ϴ�. 2.No �� ���.
					// ���� �� ��쿡�� while ���� ������
					// �� �� save()�� ����
					// �׵��� ����Ǿ��� ������ ���Ͽ� ����Ѵ�.
					} else if (2 == myInput.nextInt()) {
						System.out.println("5");
						break;
					}else {
						System.out.println("6");
						System.out.println("�Է��� �߸��ϼ̽��ϴ�.");
						existInputNationMrk = false;
					}
					System.out.println("6-1");
				}
				System.out.println("6-2");
			// ������ ���� ����
			//if (line == null) 
			}else{
				System.out.println("7");

				// mrk �� �����̸� �Է��� �����ڵ尡 input.txt ���Ͼȿ� ���ٴ� ��
				//�ݺ� ��Ʈ�� �迭�� ���� �� ����.
				//���۸��� �� ó������ ���� �� �ʿ�
				//���۸��� �ʱ�ȭ ����
				br.close();
				br = new BufferedReader(new FileReader("input.txt"));
				
				if (existInputNationMrk == false) {
					System.out.println("8");
					System.out.println("���� �ڵ��Դϴ�. (" + inputNationCode + ")");
					System.out.println("��ȯ�� ���� �ڵ带 �Է��ϼ��� : ");
//					fIn.getChannel().position(0);
//					br = new BufferedReader(new InputStreamReader(fIn));
					//static ������ ����.
					inputNationCode = myInput.next();
				}
				System.out.println("9");
			}
			System.out.println("10");
		}
		save();
		System.out.println("����");

	}

	public static void create() {
		// ��ü �����
		// ��ü �Ӽ� ����
		TheRateOfExchangeItem theRateOfExchangeItem = new TheRateOfExchangeItem();
		theRateOfExchangeItem.nationCode = inputNationCode;
		theRateOfExchangeItem.input = input;
		theRateOfExchangeItem.trans = trans;

		theRateOfExchangeItems.add(theRateOfExchangeItem);
	}

// 	���� �� ������ ����Ѵ�.
	public static void save() throws Exception {

		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
		pw.println("�Է�,"+input);	
		
		for (TheRateOfExchangeItem item : theRateOfExchangeItems) {
			pw.println(item.toString());
			System.out.println(item.toString());
		}
		pw.close();
		System.out.println("������ ����Ǿ����ϴ�.");
	}

}

class TheRateOfExchangeItem {
	String nationCode;
	int input;
	double trans;

	public String toString() {
		String result = this.nationCode + "," + (int)this.trans; 
		return result;
	}
}
