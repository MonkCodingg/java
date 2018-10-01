package challenge;

public class FactorialTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		System.out.println("팩토리얼 값을 원하는 정수 입력 : ");
//		n = in.nextInt();
//		13 팩토리얼 부터 INT(정수) 타입의 값의 범위를 벗어난다.
//		-2,147,483,648 ~ 2,147,483,647
//		n = 13;
//		따라서 n이 12보다 크면 틀린 값이 나온다.
			
		System.out.println(factorial(5));		
		System.out.println(factorial(1,5));		
		System.out.println(factorial(3,5));		
		System.out.println(factorial(10,5));		
	}
	
	public static int factorial(int x) {
		int r = 1;
		while(x > 0) {
			r = r * x--;
		}
		return r;
	}
	
	public static int factorial(int x, int y) {
		int r =1;
		while (x <= y) {
			r = r * x++;
		}
		while (x >= y) {
			r = r * y++;
		}
		return r;
	}
	
}
