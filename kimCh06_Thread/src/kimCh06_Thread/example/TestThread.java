package kimCh06_Thread.example;

public class TestThread extends Thread {
	// ������ main �Լ��� run() ��..
	public void run() {
		for (double i = 0; i < 1000000; i++) {
			System.out.println(i);
		}
	}

}
