package programing;

import java.util.Scanner;

public class AlwaysWinPaperScissorsStone_10 {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.println("Player A  가위, 바위, 보 중 하나 입력 => ");

		String playInput = myInput.next();
		String playWinOutput = "";
		int inputN;
		int outputN;

		if (playInput.equals("가위")) {
			playWinOutput = "바위";
			System.out.println("바위");

		} else if (playInput.equals("바위")) {
			playWinOutput = "보";
			System.out.println("보");

		} else {
			playWinOutput = "가위";
			System.out.println("가위");

		}
		myInput.close();

	}

}
