package challenge;

public class FactorialTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		System.out.println("���丮�� ���� ���ϴ� ���� �Է� : ");
//		n = in.nextInt();
//		13 ���丮�� ���� INT(����) Ÿ���� ���� ������ �����.
//		-2,147,483,648 ~ 2,147,483,647
//		n = 13;
//		���� n�� 12���� ũ�� Ʋ�� ���� ���´�.
			
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
