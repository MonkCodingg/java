package pf_KIM.code;
import java.util.Scanner;

public class currency_pf {
	static public void main ( String args[] ) {
		double input, trans, usd;
		int return_us, return_kor;
		int pay100 = 0, pay50 = 0, pay20 = 0, pay10 = 0, pay5 = 0, pay1 = 0;
		
		Scanner myInput = new Scanner(System.in); 
		System.out.print("�ѱ� ��: ");
		input = myInput.nextInt();
		System.out.print("ȯ��: ");
		trans = myInput.nextDouble();
		usd = input / trans;
		return_us = (int) usd;
		usd = usd - return_us;
		return_kor = (int) (usd * trans);
		return_kor = (int) return_kor - (return_kor % 10);
		System.out.println("ȯ���� 1�޷��� " + trans + "�Դϴ�.");
		System.out.println("���� �޷�: $" + return_us);
		System.out.println("�Ž�����: "+ return_kor + "��");
			
				
		pay100 = return_us / 100;
		return_us = return_us - (pay100 * 100);
		if(pay100 >= 1) {
			System.out.println("100�޷�: " + pay100 + " ��");
		}
			
		pay50 = return_us / 50;
		return_us = return_us - (pay50 * 50);
		if(pay50 >= 1) {
			System.out.println("50�޷�: " + pay50 + " ��");
		}
		
		pay20 = return_us / 20;
		return_us = return_us - (pay20 * 20);
		if(pay20 >= 1) {
			System.out.println("20�޷�: " + pay20 + " ��");
		}
				
		pay10 = return_us / 10;
		return_us = return_us - (pay10 * 10);
		if(pay10 >= 1) {
			System.out.println("10�޷�: " + pay10 + " ��");
		}
		
		
		pay5 = return_us / 50;
		return_us = return_us - (pay5 * 5);
		if(pay5 >= 1) {
			System.out.println("5�޷�: " + pay5 + " ��");
		}
		
		pay1 = return_us / 1;
		return_us = return_us - pay1;
		if(pay1 >= 1) {
			System.out.println("1�޷�: " + pay1 + " ��");
		}
		
		
	}
	
	
}
