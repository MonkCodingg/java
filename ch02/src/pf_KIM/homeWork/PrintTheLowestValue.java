package pf_KIM.homeWork;
import java.util.Scanner;

public class PrintTheLowestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstN =0, secondN =0, thirdN =0, fourthN =0, fifthN =0;
		
		// ������ ����
		int minimum = 0;
		
		//5�� ���� �Է� �޾� ������ ��� ���α׷� �ۼ�
		Scanner myInput = new Scanner(System.in);
		System.out.println("���� A �Է� : ");
		firstN = myInput.nextInt();
		
		System.out.println("���� B �Է� : ");
		secondN = myInput.nextInt();
		
		System.out.println("���� C �Է� : ");
		thirdN = myInput.nextInt();
		
		System.out.println("���� D �Է� : ");
		fourthN = myInput.nextInt();
		
		System.out.println("���� E �Է� : ");
		fifthN = myInput.nextInt();
		
		//������ ������ ù��° �Է¹��� �� ����
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
		
		System.out.println("�������� "+ minimum +" �Դϴ�.");
		
	}

}
