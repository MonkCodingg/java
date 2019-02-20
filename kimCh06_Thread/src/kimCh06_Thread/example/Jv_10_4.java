package kimCh06_Thread.example;

public class Jv_10_4 implements Runnable {
	Thread t;
	
	public static void main(String[] args) {
		System.out.println("**** 다중 쓰레드(Runnable 이용 *****");
		Jv_10_4 r1 = new Jv_10_4("Thread1");
		Jv_10_4 r2 = new Jv_10_4("Thread2");
		Jv_10_4 r3 = new Jv_10_4("Thread3");
		
	}
	public Jv_10_4(String str) {
		t = new Thread(this, str);
		t.start();
	}
	
	public void run() {
		System.out.println("run() strart! =>" + t.getName());
		for(int i=0; i<3; i++){
			System.out.println("run() STEP" + i + " : " + 
								t.getName());
				try {
						Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		System.out.println("run() end! => " + t.getName());
	}

}
