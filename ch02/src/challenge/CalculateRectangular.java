package challenge;

import java.util.Scanner;

public class CalculateRectangular {

	public static void main(String[] args) {
		int width = 0;
		int height = 0;
		int area = 0;

		Scanner myInput = new Scanner(System.in);
		System.out.println("���簢���� �Ѻ��� ���� �Է� : ");
		width = myInput.nextInt();
		System.out.println("���簢���� �ٸ� �Ѻ��� ���� �Է� : ");
		height = myInput.nextInt();

		area = width * height;
		System.out.println("���簢���� ���̴� " + area + " �̴�.");

	}

}
