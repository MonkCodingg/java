package programming;




public class _09_PrintFoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo("�ȳ�", 1);
		foo("�ȳ��ϼ���", 1, 2);
		foo("�� �־�");
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
		String res  = "";
		res = str + " " + x;
		res = res + " " + y;
		foo(res);
	
	}
}
