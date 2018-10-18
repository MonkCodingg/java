package example.sec04;

interface Animal {
	void sound();
}

class Dog implements Animal {
	@Override
	public void sound() {
		System.out.println("¸Û¸Û~~");
	}
}

class Cuckoo implements Animal {
	@Override
	public void sound() {
		System.out.println("»µ²Ú~~");
	}
}

public class AnimalDemo {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cuckoo c = new Cuckoo();

		makeSound(d);
		makeSound(c);
	}

	private static void makeSound(Animal a) {
		a.sound();
	}
}
