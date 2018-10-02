package pf_KIM.homeWork;
import java.util.Scanner;

public class PrintTheLowestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstN =0, secondN =0, thirdN =0, fourthN =0, fifthN =0;
		
		// 최저값 변수
		int minimum = 0;
		
		//5개 숫자 입력 받아 최저값 출력 프로그램 작성
		Scanner myInput = new Scanner(System.in);
		System.out.println("숫자 A 입력 : ");
		firstN = myInput.nextInt();
		
		System.out.println("숫자 B 입력 : ");
		secondN = myInput.nextInt();
		
		System.out.println("숫자 C 입력 : ");
		thirdN = myInput.nextInt();
		
		System.out.println("숫자 D 입력 : ");
		fourthN = myInput.nextInt();
		
		System.out.println("숫자 E 입력 : ");
		fifthN = myInput.nextInt();
		
		//최저값 변수에 첫번째 입력받은 수 대입
		minimum = firstN;
		
		if (secondN < minimum) {
			minimum = secondN;
		}
		
		if (thirdN < minimum) {
			minimum = thirdN;	
		}
		
		if (fourthN < minimum) {
			minimum = fourthN;
		}
		
		if (fifthN < minimum) {
			minimum = fifthN;
		}
		
		System.out.println("최저값은 "+ minimum +" 입니다.");
		
	}

}
