package programming;

public class _09_PrintFoo {

	public static void main(String[] args) {
		foo("æ»≥Á", 1);
		foo("æ»≥Á«œººø‰", 1, 2);
		foo("¿ﬂ ¿÷æÓ");
	}

	public static void foo(String str) {
		System.out.println(str);
	}

	public static void foo(String str, int a) {
		String res = "";
		res = str + " " + a;
		foo(res);

	}

	public static void foo(String str, int x, int y) {
		String res = "";
		res = str + " " + x;
		res = res + " " + y;
		foo(res);

	}
}
