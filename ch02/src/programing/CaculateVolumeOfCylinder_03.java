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
		System.out.println("윈기둥의 밑면의 반지름은?");
		radius = myInput.nextInt();
		
		System.out.println("원기둥의 높이는?");
		height = myInput.nextInt();

		volume = PI*radius*radius*height;
		
		System.out.println("원기둥이 부피는 " + volume );
	}

}
