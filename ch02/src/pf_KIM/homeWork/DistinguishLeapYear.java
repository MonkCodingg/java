package pf_KIM.homeWork;
import java.util.Scanner;

public class DistinguishLeapYear {
	public static void main(String[] args) {
//		4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년으로 한다.
//		4로 나누어 떨어지지만 100으로 나누어 떨어지는 해는 평년으로 한다.
//		단, 400으로 나누어 떨어지는 해는 윤년으로 한다.
		int inputYear = 0;
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("원하는 년도를 입력하세요 : ");
		inputYear = myInput.nextInt();
		
		if(inputYear%400 == 0 ) {
			System.out.println("윤년 입니다.");
		}else if(inputYear%4==0) {
			
			if(inputYear%100==0) {
				System.out.println("평년 입니다.");

			}else
			
			System.out.println("윤년 입니다.");
		}else
			System.out.println("평년 입니다.");
		
	
	}

}
