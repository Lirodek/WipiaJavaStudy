package Abstract;

interface Tiger {
	abstract void appearance();	// 추상 메서드
}

interface Lion {
	int sum(int a1, int a2);
}


class Animal2 implements Tiger, Lion {
	@Override
	public void appearance() {
		System.out.println("귀여움");
	}

	@Override
	public int sum(int a1, int a2) {
		return a1 + a2;
	}
	
}

public class Zoo2 {
	public static void main(String[] args) {
		Animal2 ani = new Animal2();
		ani.appearance();
		System.out.println(ani.sum(1, 2));
	}
}
