package programming;

import java.util.Scanner;

public class _10_DistinguishPrime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요 : ");
		int num = in.nextInt();
		boolean res = isPrime(num);

		if (res) {
			System.out.println(num + "는 소수입니다.");
		} else {
			System.out.println(num + "는 소수가 아닙니다.");
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
