package programming;

import java.util.Scanner;

public class _07_PrintWinnerPaperScissorsStrone {

	public static void main(String[] args) {
//		String c = input("ö��");
//		String y = input("����");
		whosWin("r", "s");
	}

	public static String input(String name) {
		System.out.println("input : " + name);
		Scanner s = new Scanner(System.in);

		return s.next();
	}

	public static String whosWin(String a1, String b1) {
		System.out.println("WhosWin, " + a1 + b1);
		String res = null;
		// ����(s), ����(r), ��(p)
		if (a1.equals("r")) {

			if (b1.equals("r")) {
				System.out.println("�����ϴ�.");

			} else if (b1.equals("s")) {
				System.out.println("��");
			} else if (b1.equals("p")) {
				System.out.println("��");
			} else {
				res = "�߸��� �Է��Դϴ�.";
			}
			// ����
		} else if (a1.equals("s")) {

			if (b1.equals("r")) {
				System.out.println("�����ϴ�.");

			} else if (b1.equals("s")) {
				System.out.println("");
			} else if (b1.equals("p")) {

			} else {
				res = "�߸��� �Է��Դϴ�.";
			}

		} else if (a1.equals("p")) {

			if (b1.equals("r")) {
				System.out.println("�����ϴ�.");
			} else if (b1.equals("s")) {
				System.out.println("");
			} else if (b1.equals("p")) {

			} else {
				res = "�߸��� �Է��Դϴ�.";
			}

		} else {
			res = "�߸��� �Է��Դϴ�.";
		}
		return " res : " + res;
	}
}
