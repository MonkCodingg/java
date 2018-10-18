package programming;

import java.util.Scanner;

public class _07_PrintWinnerPaperScissorsStrone {

	public static void main(String[] args) {
//		String c = input("철수");
//		String y = input("영희");
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
		// 가위(s), 바위(r), 보(p)
		if (a1.equals("r")) {

			if (b1.equals("r")) {
				System.out.println("비겼습니다.");

			} else if (b1.equals("s")) {
				System.out.println("승");
			} else if (b1.equals("p")) {
				System.out.println("패");
			} else {
				res = "잘못된 입력입니다.";
			}
			// 가위
		} else if (a1.equals("s")) {

			if (b1.equals("r")) {
				System.out.println("비겼습니다.");

			} else if (b1.equals("s")) {
				System.out.println("");
			} else if (b1.equals("p")) {

			} else {
				res = "잘못된 입력입니다.";
			}

		} else if (a1.equals("p")) {

			if (b1.equals("r")) {
				System.out.println("비겼습니다.");
			} else if (b1.equals("s")) {
				System.out.println("");
			} else if (b1.equals("p")) {

			} else {
				res = "잘못된 입력입니다.";
			}

		} else {
			res = "잘못된 입력입니다.";
		}
		return " res : " + res;
	}
}
