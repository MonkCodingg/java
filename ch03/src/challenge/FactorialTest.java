package challenge;

import java.util.Scanner;

public class FactorialTest {

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
		
		result = 1;
		
		while (true) {
			if (n > 0)
				result = result * n--;
			else 
				break;
		}

		System.out.println("���丮�� ���� : "+ result);
		in.close();
		
			
	}
	

}
