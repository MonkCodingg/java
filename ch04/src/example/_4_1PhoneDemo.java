package example;

class Phone {
	String model;
	int value;
	
	void print() {
		// this.value "this."�� �����Ǿ� ����
		System.out.println(value + "���� ¥�� "+ model +" ����Ʈ��");
	}

}

public class _4_1PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model = "������ S8";
		myPhone.value = 100;
		myPhone.print();
		
		//new �� �޸𸮿� �Ҵ�
		Phone yourPhone = new Phone();
		yourPhone.model = "G6";
		yourPhone.value = 85;
		yourPhone.print();
		
	}
}
	


