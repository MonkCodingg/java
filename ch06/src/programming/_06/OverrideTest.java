package programming._06;

public class OverrideTest {

	public static void main(String[] args) {
		Car c = new Car("ÆÄ¶û", 200, 1000, 5);
		c.show();
		
		System.out.println();
		Vehicle v = c;
		v.show();
	}

}
