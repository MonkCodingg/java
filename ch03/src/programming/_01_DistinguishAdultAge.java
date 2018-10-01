package programming;

import java.util.Scanner;


public class _01_DistinguishAdultAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("나이 입력 : ");
		age = in.nextInt();
		
		if(age >= 19) {
			System.out.println("성년");
		}else {
			System.out.println("미성년");
		}
		
		in.close();
	}

}
