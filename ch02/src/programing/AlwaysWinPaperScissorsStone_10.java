package programing;

import java.util.Scanner;

public class AlwaysWinPaperScissorsStone_10 {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.println("Player A  ����, ����, �� �� �ϳ� �Է� => ");

		String playInput = myInput.next();
		String playWinOutput = "";
		int inputN;
		int outputN;

		if (playInput.equals("����")) {
			playWinOutput = "����";
			System.out.println("����");

		} else if (playInput.equals("����")) {
			playWinOutput = "��";
			System.out.println("��");

		} else {
			playWinOutput = "����";
			System.out.println("����");

		}
		myInput.close();

	}

}
