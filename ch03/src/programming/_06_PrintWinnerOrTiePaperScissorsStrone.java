package programming;

import java.util.Scanner;

public class _06_PrintWinnerOrTiePaperScissorsStrone {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ã¶¼ö : ");
		String in1 = in.next();
		System.out.println("¿µÈñ : ");
		String in2 = in.next();
		// ½ÂÀÚ ÀÌ¸§ Ãâ·Â, ¹«½ÂºÎ Ãâ·Â
		// in1ÀÌ °¡À§(s)ÀÏ¶§
		// in2ÀÇ °æ¿ìÀÇ ¼ö 3
//		if(in1.equals("s")) {
//			System.out.println("ºñ°å½À´Ï´Ù.");
//		}
//Ã¶¼ö=in1 ¿µÈñ=in2 		
		switch (in1) {
		// °¡À§
		case "s":
			switch (in2) {
			case "s":
				System.out.println("ºñ°å½À´Ï´Ù");
				break;
			case "r":
				System.out.println("¿µÈñ, ½Â!");
				break;
			case "p":
				System.out.println("Ã¶¼ö, ½Â!");
				break;
			}
			break;
		// ¹ÙÀ§
		case "r":
			switch (in2) {
			case "s":
				System.out.println("Ã¶¼ö, ½Â!");
				break;
			case "r":
				System.out.println("ºñ°å½À´Ï´Ù");
				break;
			case "p":
				System.out.println("¿µÈñ, ½Â!");
				break;
			}
			break;
		// º¸
		case "p":
			switch (in2) {
			case "s":
				System.out.println("¿µÈñ, ½Â!");
				break;
			case "r":
				System.out.println("Ã¶¼ö, ½Â!");
				break;
			case "p":
				System.out.println("ºñ°å½À´Ï´Ù");
				break;
			}
			break;
		}
	}
}
