package example.sec03;

public interface Controllable {
	// 디폴트 메서드는 오버라이딩 될 수 있지만,
	// 정적 메서드는 오버라이딩 될 수 없다.
	// 디폴트 메서드는 인스턴스 메서드이므로 객체를 생성한 후
	// 호출하지만, 정적 메서드는 인터페이스로 직접 호출한다.
	default void repair() {
		System.out.println("장비를 수리한다.");
	}
	static void reset() {
		System.out.println("장비를 초기화한다.");
	}
	
	void turnOn();
	void turnOff();
	
	
}
