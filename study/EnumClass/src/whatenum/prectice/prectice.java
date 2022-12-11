package whatenum.prectice;


public class prectice {
	
	public static void main(String[] args) {
		
		int type = FruitCode.APPLE;
		
		switch (type) {
		case FruitCode.APPLE:
			System.out.println("이 과일의 이름은 " + FruitName.APPLE + " 입니다.");
			break;
		case FruitCode.PEACH :
			System.out.println("이 과일의 이름은 " + FruitName.PEACH + " 입니다.");
			break;
		case FruitCode.ORANGE :
			System.out.println("이 과일의 이름은 " + FruitName.ORANGE + " 입니다.");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
		boolean typeOf = FruitCode.APPLE == Company.APPLE ? true : false; 
		System.out.println("해당 type은 : " + typeOf + " 입니다.");
	}
	
}
