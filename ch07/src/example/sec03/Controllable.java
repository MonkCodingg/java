package example.sec03;

public interface Controllable {
	// ����Ʈ �޼���� �������̵� �� �� ������,
	// ���� �޼���� �������̵� �� �� ����.
	// ����Ʈ �޼���� �ν��Ͻ� �޼����̹Ƿ� ��ü�� ������ ��
	// ȣ��������, ���� �޼���� �������̽��� ���� ȣ���Ѵ�.
	default void repair() {
		System.out.println("��� �����Ѵ�.");
	}
	static void reset() {
		System.out.println("��� �ʱ�ȭ�Ѵ�.");
	}
	
	void turnOn();
	void turnOff();
	
	
}
