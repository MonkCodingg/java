package challenge;

import java.util.Scanner;

public class CalculateRectangular {

	public static void main(String[] args) {
		int width = 0;
		int height = 0;
		int area = 0;

		Scanner myInput = new Scanner(System.in);
		System.out.println("직사각형의 한변의 길이 입력 : ");
		width = myInput.nextInt();
		System.out.println("직사각형의 다른 한변의 길이 입력 : ");
		height = myInput.nextInt();

		area = width * height;
		System.out.println("직사각형의 넓이는 " + area + " 이다.");

	}

}
