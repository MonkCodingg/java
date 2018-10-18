package example.sec05;

public class SignIncrementDemo {
	public static void main(String[] args) {
		int plusOne = 1;
		//plusOne의 부호를 바꾼다.
		int minusOne = -plusOne;
		System.out.println("plusOne은 " + plusOne + "입니다.");
		System.out.println("minusOne은 " + minusOne + "입니다.");

		int x = 1, y = 1;
		//문자열과 합쳐지기전에 x 값이 증가된다.
		System.out.println("x = " + x + ", ++x = " + ++x);
		//문자열과 합친 후에 y값이 증가된다.
		System.out.println("y = " + y + ", y++ = " + y++);
		System.out.println("x = " + x + ", y = " + y);
	}
}