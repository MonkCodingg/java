package programming._05;

public class Telephone extends Phone {
	private String when;
	public Telephone() {
		
	}
	public Telephone(String owner, String when) {
		this.owner = owner;
		this.when = when;
	}
	void autoAnswering() {
		System.out.println(owner+"�� ����. "+when+"���� ��ȭ �ٷ�.");
	}
}
