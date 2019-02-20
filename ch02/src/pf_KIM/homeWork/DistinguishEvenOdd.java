package pf_KIM.homeWork;
import java.util.Scanner;

public class DistinguishEvenOdd {

	public static void main(String[] args) {
		// 홀수 짝수 판별
		int inputN =0;
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		inputN = myInput.nextInt();
		
		if (inputN%2 == 1) {
			System.out.println("홀수 입니다.");
			
		} else
			System.out.println("짝수 입니다.");
		
		
	}

}
