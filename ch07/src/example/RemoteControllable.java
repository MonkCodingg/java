package example;

import example.sec03.Controllable;

public interface RemoteControllable extends Controllable {
	void remoteOn();
	
	void remoteOff();
}
