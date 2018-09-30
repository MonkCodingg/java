package programing;

import java.util.Scanner;

public class SumofPositionalNumber_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputN = 0;
		
		//입력 받은 정수 각 자리 숫자의 합
		int sum = 0; 
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("0부터 999사이의 정수를 입력하세요 : ");
		inputN= myInput.nextInt();
		 
		if( 999>inputN && inputN>0 ) {
			while(inputN != 0){
				
				sum = sum + inputN%10;
				
				inputN = inputN / 10;	
			}
			System.out.println("각 자리수의 합 = "+ sum);
		}
		else
			System.out.println("0부터 999사이의 정수가 아닙니다.");
		myInput.close();
	}

}
