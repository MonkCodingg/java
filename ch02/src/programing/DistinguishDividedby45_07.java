package programing;

import java.util.Scanner;

public class DistinguishDividedby45_07 {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int inputN = myInput.nextInt();
		boolean fourNfive = (inputN % 4 == 0 && inputN % 5 == 0);
		boolean fourORfive = (inputN % 4 == 0 || inputN % 5 == 0);
		boolean fourORfiveNot20 = (fourORfive && inputN % 20 != 0);

		System.out.println("�Է¹��� ���� x�� 4�� 5�� ���������� :" + fourNfive);
		System.out.println("�Է¹��� ���� x�� 4�Ǵ� 5�� ���������� :" + fourORfive);
		System.out.println("�Է¹��� ���� x�� 4�Ǵ� 5�� ������������ " + "�� �� ��ηδ� ���������� �ʴ´�. : " + fourORfiveNot20);
	}

}
