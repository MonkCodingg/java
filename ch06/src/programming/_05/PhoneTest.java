package programming._05;

public class PhoneTest {

	public static void main(String[] args) {
		Phone[] phones = {
				new Phone("Ȳ����"),
				new Telephone("�浿��", "����"),
				new Smartphone("�α���", "������")		
		};
		
		for(Phone phone: phones) {
			if (phone instanceof Smartphone) {
//				Smartphone s1 = (Smartphone) phone;
//				s1.playGame();
				((Smartphone) phone).playGame();

			}else if(phone instanceof Telephone) {
				((Telephone) phone).autoAnswering();	
			}else if(phone instanceof Phone) {
				phone.talk();
			}
			
//			System.out.println(phone);
		}
	}

}
