package programing;

import java.util.Scanner;

public class SumofPositionalNumber_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputN = 0;
		
		//�Է� ���� ���� �� �ڸ� ������ ��
		int sum = 0; 
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("0���� 999������ ������ �Է��ϼ��� : ");
		inputN= myInput.nextInt();
		 
		if( 999>inputN && inputN>0 ) {
			while(inputN != 0){
				
				sum = sum + inputN%10;
				
				inputN = inputN / 10;	
			}
			System.out.println("�� �ڸ����� �� = "+ sum);
		}
		else
			System.out.println("0���� 999������ ������ �ƴմϴ�.");
		myInput.close();
	}

}
