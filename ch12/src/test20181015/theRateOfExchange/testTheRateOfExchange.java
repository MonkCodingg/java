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
	static String nationCode;
	static double input;
	static double trans;
	public static List<TheRateOfExchangeItem> theRateOfExchangeItems = new ArrayList<>();

	public static void main(String[] args) throws Exception {

		Scanner myInput = new Scanner(System.in);

		// ȯ���� ���Ͽ��� �Է¹޾�(input.txt)
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
//		FileInputStream fIn = new FileInputStream("input.txt");
//		BufferedReader br = new BufferedReader(new InputStreamReader(fIn));

		System.out.print("ȯ�� ����� ���� ��ȭ �ݾ��� �Է��ϼ���: ");
//		input = 11200;
		input = myInput.nextInt();

//		inputNationCode ="JPA";

		// ���� �ڵ��� ���� input.txt ������ ��ü ���� �ڵ带
		// ��ȸ�Ͽ� �� �ؾ� �Ѵ�.
		// �Է��ڵ�� arr[0] �� ��. ���� ���� ������ �� ���� ���� ������ ����
		System.out.println("��ȯ�� ���� �ڵ带 �Է��ϼ��� : ");
		String inputNationCode = myInput.next();

		while (true) {
			// nationCode �ʱ�ȭ
			nationCode = "";
			String line = br.readLine();
			// ������ ���� �ƴѰ��
			if (line != null) {
				String[] arr = line.split(",");
				// arr[0]�� nation �ڵ��̴�

				// �Է� ���� ���� �ڵ�� �� ��
				// ��ġ �ϸ� arr[1]�� ���� ȯ��(static ����)�� ����.
				if (arr[0].equals(inputNationCode)) {
					transRate = Double.parseDouble(arr[1]);
					nationCode = inputNationCode;
					// ���
					trans = input * transRate;
					create();
					System.out.println("�߰��Ͻðڽ��ϱ�? (1:Yes, 2:No) : ");
					int inN = myInput.nextInt();
					// yes �� ȯ�������۰�ü ����� �Ӽ� �����ϴ� �޼��� ����.
					// ���۸��� �ʱ�ȭ�� input.txt ù������ �̵�.
					// �ٽ� ���� �����ڵ� �Է¹ޱ�
					if (1 == inN) {
						// ���۸��� �ʱ�ȭ �ʿ�
						// �ٽ� ó�� ù����� input.txt ���Ͽ��� �ҷ��� �� �ؾ���.
						// ���ϸ� line�� ���� ���� null������ ������ ����.
						br.close();
						br = new BufferedReader(new FileReader("input.txt"));

						System.out.println("��ȯ�� ���� �ڵ带 �Է��ϼ��� : ");

						inputNationCode = myInput.next();

					} else if (2 == inN) {
						// �߰��Ͻðڽ��ϴ�. 2.No �� ���.
						// ���� �� ��쿡�� while ���� ������
						// �� �� save()�� ���� �׵��� ����Ǿ��� ������ ���Ͽ� ����Ѵ�.
						break;
					} else {
						System.out.println("�Է��� �߸��ϼ̽��ϴ�.");
					}
				}
				// �ݺ��Ǵ� br.readLine() ���� ���� null �� ��ȯ
				// if (line == null)
			} else {
				
				// �ݺ� ��Ʈ�� �迭 ���� �� ����.
				// ���۸��� �� ó������ ���� �� �ʿ�
				// ���۸��� �ʱ�ȭ ����

				System.out.println("���� �ڵ��Դϴ�. (" + inputNationCode + ")");
				
				System.out.println("�߰��Ͻðڽ��ϱ�? (1:Yes, 2:No) : ");
				int inN = myInput.nextInt();

				if (1 == inN) {
					// ���۸��� �ʱ�ȭ �ʿ�
					// �ٽ� ó�� ù����� input.txt ���Ͽ��� �ҷ��� �� �ؾ���.
					// ���ϸ� line�� ���� ���� null������ ������ ����.
					br.close();
					br = new BufferedReader(new FileReader("input.txt"));
//						fIn.getChannel().position(0);
//						br = new BufferedReader(new InputStreamReader(fIn));
					System.out.println("��ȯ�� ���� �ڵ带 �Է��ϼ��� : ");
					inputNationCode = myInput.next();

					// �߰��Ͻðڽ��ϴ�. 2.No �� ���.
					// ���� �� ��쿡�� while ���� ������ �� �� save()�� ����
					// �׵��� ����Ǿ��� ������ ���Ͽ� ����Ѵ�.
				} else if (2 == inN) {
					break;
				} else {
					System.out.println("�Է��� �߸��ϼ̽��ϴ�.");
				}

			}
		}
		// while�� ��� ��쿡�� save() ����
		// �ݺ��� �ȿ��� �ݺ��ϴ� ���� TheRateOfExchangeItem ��ü�� ������ ����.
		save();
	}

	public static void create() {
		// ��ü �����
		// ��ü �Ӽ� ����
		TheRateOfExchangeItem theRateOfExchangeItem = new TheRateOfExchangeItem();
		theRateOfExchangeItem.nationCode = nationCode;
		theRateOfExchangeItem.input = input;
		theRateOfExchangeItem.trans = trans;

		theRateOfExchangeItems.add(theRateOfExchangeItem);
	}


	public static void save() throws Exception {

		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
		pw.println("�Է�," + (int) input);
		pw.println("����,ȯ��");
		for (TheRateOfExchangeItem item : theRateOfExchangeItems) {
			pw.println(item.toString());
		}
		pw.close();
		System.out.println("������ ����Ǿ����ϴ�.");
	}

}

class TheRateOfExchangeItem {
	String nationCode;
	double input;
	double trans;

	public String toString() {
		String result = this.nationCode + "," + (int) this.trans;
		return result;
	}
}
