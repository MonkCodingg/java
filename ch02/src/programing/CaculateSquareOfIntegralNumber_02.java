package programing;

import java.util.Scanner;

public class CaculateSquareOfIntegralNumber_02 {

	public static void main(String[] args) {
		int inputN = 0;
		int sq_inputN = 0;

		Scanner myInput = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		inputN = myInput.nextInt();
		sq_inputN = inputN * inputN;
		System.out.println(inputN + "�� ������ " + sq_inputN);

	}

}
