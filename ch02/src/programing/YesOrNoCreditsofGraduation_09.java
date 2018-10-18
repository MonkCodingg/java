package programing;

import java.util.Scanner;

public class YesOrNoCreditsofGraduation_09 {

	public static void main(String[] args) {
		int majorCredit = 0;
		int cultureCredit = 0;
		int generalCredit = 0;

		Scanner myInput = new Scanner(System.in);
		System.out.println("전공 이수 학점: ");
		majorCredit = myInput.nextInt();
		System.out.println("교양 이수 학점: ");
		cultureCredit = myInput.nextInt();
		System.out.println("일반 이수 학점: ");
		generalCredit = myInput.nextInt();

		boolean a = (cultureCredit >= 30 && generalCredit >= 30) || cultureCredit + generalCredit >= 80;

		boolean b = majorCredit >= 70;

		boolean c = majorCredit + cultureCredit + generalCredit >= 140;

		if (a && c && b) {
			System.out.println("졸업 가능");

		} else
			System.out.println("졸업 불가능");

		myInput.close();

	}

}
