package example.sec05;

public class SignIncrementDemo {
	public static void main(String[] args) {
		int plusOne = 1;
		//plusOne�� ��ȣ�� �ٲ۴�.
		int minusOne = -plusOne;
		System.out.println("plusOne�� " + plusOne + "�Դϴ�.");
		System.out.println("minusOne�� " + minusOne + "�Դϴ�.");

		int x = 1, y = 1;
		//���ڿ��� ������������ x ���� �����ȴ�.
		System.out.println("x = " + x + ", ++x = " + ++x);
		//���ڿ��� ��ģ �Ŀ� y���� �����ȴ�.
		System.out.println("y = " + y + ", y++ = " + y++);
		System.out.println("x = " + x + ", y = " + y);
	}
}