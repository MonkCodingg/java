package programming;

import java.util.Scanner;


public class _01_DistinguishAdultAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		age = in.nextInt();
		
		if(age >= 19) {
			System.out.println("����");
		}else {
			System.out.println("�̼���");
		}
		
		in.close();
	}

}
