package programing;

import java.util.Scanner;

public class ConvertSecMinHour_04 {

	public static void main(String[] args) {
		int sec = 0;
		int min = 0;
		int hour = 0;
		Scanner myInput = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է��ϼ��� : ");
		sec = myInput.nextInt();
		// ��� 60�ʷ� ���� �� �����
		min = sec / 60;
		// ������ ��Ÿ���� ������ ��
		sec = sec % 60;

		// �� �ð� 60������ ���� �� �����
		hour = min / 60;
		// �ð����� ��Ÿ�װ� ������ ��
		min = min % 60;

		System.out.println(hour + "�ð� " + min + "�� " + sec + "��");

	}

}
