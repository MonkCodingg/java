package programming.ch6;

public class PrintableTest {

	public static void main(String[] args) {
		Printable p = new B4();
		Call c = new Call();
		c.invoke(p);
	}

}
