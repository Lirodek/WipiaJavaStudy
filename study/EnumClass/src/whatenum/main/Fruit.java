package whatenum.main;
/*
public class Fruit {
	public final static Fruit APPLE = new Fruit();
	public final static Fruit PEACH = new Fruit();
	public final static Fruit ORANGE= new Fruit();
}
*/

// 자주사용하는 패턴을 문법으로 만들었다 !
enum Fruit{
	APPLE, PEACH, ORANGE;
	Fruit(){
		System.out.println("Call Constructor");
	}
}