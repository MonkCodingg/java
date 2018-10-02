package pf_KIM.code;
import java.util.Scanner;

public class currency_pf {
	static public void main ( String args[] ) {
		double input, trans, usd;
		int return_us, return_kor;
		int pay100 = 0, pay50 = 0, pay20 = 0, pay10 = 0, pay5 = 0, pay1 = 0;
		
		Scanner myInput = new Scanner(System.in); 
		System.out.print("한국 돈: ");
		input = myInput.nextInt();
		System.out.print("환율: ");
		trans = myInput.nextDouble();
		usd = input / trans;
		return_us = (int) usd;
		usd = usd - return_us;
		return_kor = (int) (usd * trans);
		return_kor = (int) return_kor - (return_kor % 10);
		System.out.println("환율은 1달러에 " + trans + "입니다.");
		System.out.println("받을 달러: $" + return_us);
		System.out.println("거스름돈: "+ return_kor + "원");
			
				
		pay100 = return_us / 100;
		return_us = return_us - (pay100 * 100);
		if(pay100 >= 1) {
			System.out.println("100달러: " + pay100 + " 개");
		}
			
		pay50 = return_us / 50;
		return_us = return_us - (pay50 * 50);
		if(pay50 >= 1) {
			System.out.println("50달러: " + pay50 + " 개");
		}
		
		pay20 = return_us / 20;
		return_us = return_us - (pay20 * 20);
		if(pay20 >= 1) {
			System.out.println("20달러: " + pay20 + " 개");
		}
				
		pay10 = return_us / 10;
		return_us = return_us - (pay10 * 10);
		if(pay10 >= 1) {
			System.out.println("10달러: " + pay10 + " 개");
		}
		
		
		pay5 = return_us / 50;
		return_us = return_us - (pay5 * 5);
		if(pay5 >= 1) {
			System.out.println("5달러: " + pay5 + " 개");
		}
		
		pay1 = return_us / 1;
		return_us = return_us - pay1;
		if(pay1 >= 1) {
			System.out.println("1달러: " + pay1 + " 개");
		}
		
		
	}
	
	
}
