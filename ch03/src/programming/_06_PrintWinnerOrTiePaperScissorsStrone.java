package programming;

import java.util.Scanner;

public class _06_PrintWinnerOrTiePaperScissorsStrone {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ö�� : ");
		String in1 = in.next();
		System.out.println("���� : ");
		String in2 = in.next();
		// ���� �̸� ���, ���º� ���
		// in1�� ����(s)�϶�
		// in2�� ����� �� 3
//		if(in1.equals("s")) {
//			System.out.println("�����ϴ�.");
//		}
//ö��=in1 ����=in2 		
		switch (in1) {
		// ����
		case "s":
			switch (in2) {
			case "s":
				System.out.println("�����ϴ�");
				break;
			case "r":
				System.out.println("����, ��!");
				break;
			case "p":
				System.out.println("ö��, ��!");
				break;
			}
			break;
		// ����
		case "r":
			switch (in2) {
			case "s":
				System.out.println("ö��, ��!");
				break;
			case "r":
				System.out.println("�����ϴ�");
				break;
			case "p":
				System.out.println("����, ��!");
				break;
			}
			break;
		// ��
		case "p":
			switch (in2) {
			case "s":
				System.out.println("����, ��!");
				break;
			case "r":
				System.out.println("ö��, ��!");
				break;
			case "p":
				System.out.println("�����ϴ�");
				break;
			}
			break;
		}
	}
}
