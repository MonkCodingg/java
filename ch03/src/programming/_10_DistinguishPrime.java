package programming;

import java.util.Scanner;

public class _10_DistinguishPrime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ��� : ");
		int num = in.nextInt();
		boolean res = isPrime(num);

		if (res) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		} else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
		}

	}

	public static boolean isPrime(int num) {
		boolean res = true;
		for (int i = 2; i < num; i++) {
//			System.out.println(i);
			if (num % i == 0) {
				res = false;
				break;
			}
		}

		return res;
	}

}
