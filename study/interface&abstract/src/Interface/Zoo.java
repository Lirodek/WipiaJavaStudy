package Interface;

// 실체 클래스
class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	public void name() {
		System.out.println("강아지");
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}


public class Zoo {
	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		
		c.appearance();
		c.sound();
		
		d.name();
		d.sound();
		d.appearance();
	}
}
