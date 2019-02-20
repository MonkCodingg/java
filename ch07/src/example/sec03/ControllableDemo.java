package example.sec03;

public class ControllableDemo {

	public static void main(String[] args) {
		TV tv = new TV();
		Computer com = new Computer();
		
//´ÙÇü¼º
		Controllable[] controllables = {
				tv,
				com,
		};
		
		for (Controllable controllable : controllables) {
			controllable.turnOn();
		}
		
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
//		tv.reset();
//		com.reset();
	}

}
