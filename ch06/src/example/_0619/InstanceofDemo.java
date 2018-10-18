package example._0619;

public class InstanceofDemo {

	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Person();
		// ���� ������ �� Ÿ���� �´���
		System.out.println(s instanceof Person);
		System.out.println(s instanceof Student);
		System.out.println(p instanceof Student);
	
		downcast(s);
	}
	
	static void downcast(Person p) {
		if (p instanceof Student) {	
			//ĳ��Ʈ�� �ϱ������� ���� ���ߴ� ���� �żҵ�
			//ĳ��Ʈ�� �� �� ���� ���ߴ� ���� �޼ҵ� ���ٰ��� 
			Student s = (Student) p;
			System.out.println("ok, ���� Ÿ�� ��ȯ");
		}
	}
}
