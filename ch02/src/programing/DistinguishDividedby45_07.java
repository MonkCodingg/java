package programing;

import java.util.Scanner;

public class DistinguishDividedby45_07 {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int inputN = myInput.nextInt();
		boolean fourNfive = (inputN % 4 == 0 && inputN % 5 == 0);
		boolean fourORfive = (inputN % 4 == 0 || inputN % 5 == 0);
		boolean fourORfiveNot20 = (fourORfive && inputN % 20 != 0);

		System.out.println("입력받은 정수 x가 4와 5로 나누어진다 :" + fourNfive);
		System.out.println("입력받은 정수 x가 4또는 5로 나누어진다 :" + fourORfive);
		System.out.println("입력받은 정수 x가 4또는 5로 나누어지지만 " + "두 수 모두로는 나누어지지 않는다. : " + fourORfiveNot20);
	}

}
