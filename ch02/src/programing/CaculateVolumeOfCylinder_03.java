package programing;

import java.util.Scanner;

public class CaculateVolumeOfCylinder_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius = 0;
		int height = 0;
		double volume = 0;
		final double PI = 3.14;
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("������� �ظ��� ��������?");
		radius = myInput.nextInt();
		
		System.out.println("������� ���̴�?");
		height = myInput.nextInt();

		volume = PI*radius*radius*height;
		
		System.out.println("������� ���Ǵ� " + volume );
	}

}
