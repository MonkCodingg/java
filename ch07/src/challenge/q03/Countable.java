package challenge.q03;


//public interface Countable {
//	
//	void count();
//}
public abstract class Countable {
	protected String name;
	protected int num;
	//������
	public Countable (String name, int num) {
		this.name = name;
		this.num = num;
	}
	//�߻� �޼���
	//�޼��� ��ü�� �ϼ����� ���� �޼���. ������ ������ ������ �� ������
	// ��� ������ ������ �� ����
	abstract void count();
	
}
