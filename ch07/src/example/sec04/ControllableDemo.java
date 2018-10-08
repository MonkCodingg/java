package example.sec04;

import example.sec03.Computer;
import example.sec03.Controllable;
import example.sec03.TV;
public class ControllableDemo {

	public static void main(String[] args) {
		
		Controllable[] controllables = {
				new TV(), new Computer()
		};
		
		for (Controllable c : controllables) {
			c.turnOn();
			c.turnOff();
			c.repair();
			
		}
		
		Controllable.reset();
	}

}
