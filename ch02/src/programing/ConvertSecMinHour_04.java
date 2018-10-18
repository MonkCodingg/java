package programing;

import java.util.Scanner;

public class ConvertSecMinHour_04 {

	public static void main(String[] args) {
		int sec = 0;
		int min = 0;
		int hour = 0;
		Scanner myInput = new Scanner(System.in);
		System.out.println("초 단위 정수를 입력하세요 : ");
		sec = myInput.nextInt();
		// 몇분 60초로 나눈 몫만 저장됨
		min = sec / 60;
		// 분으로 나타내고 나머지 초
		sec = sec % 60;

		// 몇 시간 60분으로 나눈 몫만 저장됨
		hour = min / 60;
		// 시간으로 나타네고 나머지 분
		min = min % 60;

		System.out.println(hour + "시간 " + min + "분 " + sec + "초");

	}

}
