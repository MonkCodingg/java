package challenge;

import java.util.Scanner;

public class FactorialTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		int n;
		Scanner in = new Scanner(System.in);
		
		System.out.println("팩토리얼 값을 원하는 정수 입력 : ");
		n = in.nextInt();
//		13 팩토리얼 부터 INT(정수) 타입의 값의 범위를 벗어난다.
//		-2,147,483,648 ~ 2,147,483,647
//		n = 13;
//		따라서 n이 12보다 크면 틀린 값이 나온다.
		
		result = factorial(n);
		System.out.println("팩토리얼 값은 : "+ result);
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
