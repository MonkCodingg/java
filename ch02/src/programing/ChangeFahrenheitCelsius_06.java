package programing;

import java.util.Scanner;

public class ChangeFahrenheitCelsius_06 {

	public static void main(String[] args) {
		float fahrenheit = 0;
		float celsius = 0;
		Scanner myInput = new Scanner(System.in);
		System.out.println("화씨온도(F)를 입력하시오 : ");
		fahrenheit = myInput.nextFloat();

		celsius = (float) (5.0 / 9.0) * (fahrenheit - 32);
		System.out.println("입력 받은 화씨온도의 " + "섭씨온도로 변환한 값은 : " + celsius);
	}

}
