package kimCh06_Thread.example;

public class TestThread extends Thread {
	// 쓰레드 main 함수는 run() 다..
	public void run() {
		for (double i = 0; i < 1000000; i++) {
			System.out.println(i);
		}
	}

}
