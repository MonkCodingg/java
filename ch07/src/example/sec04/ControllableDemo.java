package example.sec04;

import example.sec03.Computer;
import example.sec03.Controllable;
import example.sec03.TV;
public class ControllableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		Computer com = new Computer();
		
//´ÙÇü¼º
		Controllable[] controllables = {
				new TV(), new Computer()
		};
		
		for (Controllable c : controllables) {
			c.turnOn();
			c.turnOff();
			
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
