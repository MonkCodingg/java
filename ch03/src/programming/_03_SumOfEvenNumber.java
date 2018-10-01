package programming;

import java.util.Scanner;


public class _03_SumOfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputN =0;
		int sum =0;
		
		Scanner in = new Scanner(System.in);
		
		
		do {
			System.out.print("양의 정수 입력 : ");
			inputN = in.nextInt();
			if (inputN % 2== 0) {
				sum = sum + inputN;
			}
			
		} while (inputN > 0);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
		in.close();
	}

}
