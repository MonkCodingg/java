package challenge;

import java.util.Scanner;

public class FactorialTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		int n;
		Scanner in = new Scanner(System.in);
		
		System.out.println("���丮�� ���� ���ϴ� ���� �Է� : ");
		n = in.nextInt();
//		13 ���丮�� ���� INT(����) Ÿ���� ���� ������ �����.
//		-2,147,483,648 ~ 2,147,483,647
//		n = 13;
//		���� n�� 12���� ũ�� Ʋ�� ���� ���´�.
		
		result = factorial(n);
		System.out.println("���丮�� ���� : "+ result);
		in.close();
		
				
	}
	
	public static int factorial(int x) {
		int r = 1;
		while(x > 0) {
			r = r * x--;
		}
		return r;
	}

}
