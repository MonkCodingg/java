package programing;

import java.util.Scanner;

public class ChangeFahrenheitCelsius_06 {

	public static void main(String[] args) {
		float fahrenheit = 0;
		float celsius = 0;
		Scanner myInput = new Scanner(System.in);
		System.out.println("ȭ���µ�(F)�� �Է��Ͻÿ� : ");
		fahrenheit = myInput.nextFloat();

		celsius = (float) (5.0 / 9.0) * (fahrenheit - 32);
		System.out.println("�Է� ���� ȭ���µ��� " + "�����µ��� ��ȯ�� ���� : " + celsius);
	}

}
