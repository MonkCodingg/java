package kimCh06_Thread.example;

public class MainClass {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		TestThread t = new TestThread();
		t.start();
		long end = System.currentTimeMillis();
		
		System.out.println("����Ǿ����ϴ�." + (end-start));
		
	}

}
