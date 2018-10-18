package example;

class Phone {
	String model;
	int value;
	
	void print() {
		// this.value "this."이 생략되어 있음
		System.out.println(value + "만원 짜리 "+ model +" 스마트폰");
	}

}

public class _4_1PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model = "갤럭시 S8";
		myPhone.value = 100;
		myPhone.print();
		
		//new 힙 메모리에 할당
		Phone yourPhone = new Phone();
		yourPhone.model = "G6";
		yourPhone.value = 85;
		yourPhone.print();
		
	}
}
	


