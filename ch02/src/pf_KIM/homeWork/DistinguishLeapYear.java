package pf_KIM.homeWork;
import java.util.Scanner;

public class DistinguishLeapYear {
	public static void main(String[] args) {
//		4�� ������ �������� �ش� ����, �� ���� �ش� ������� �Ѵ�.
//		4�� ������ ���������� 100���� ������ �������� �ش� ������� �Ѵ�.
//		��, 400���� ������ �������� �ش� �������� �Ѵ�.
		int inputYear = 0;
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("���ϴ� �⵵�� �Է��ϼ��� : ");
		inputYear = myInput.nextInt();
		
		if(inputYear%400 == 0 ) {
			System.out.println("���� �Դϴ�.");
		}else if(inputYear%4==0) {
			
			if(inputYear%100==0) {
				System.out.println("��� �Դϴ�.");

			}else
			
			System.out.println("���� �Դϴ�.");
		}else
			System.out.println("��� �Դϴ�.");
		
	
	}

}
