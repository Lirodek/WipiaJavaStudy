package Interface;

// 추상 클래스
abstract class Animal {
	public abstract void sound();	// 추상 메서드
	
//	public abstract void house() { "케이지 안에 있다." }	// 에러
	
	public void appearance() {
		System.out.println("Cute");
	}
}

