package whatenum.main;

import java.lang.Enum.EnumDesc;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		Fruit type = Fruit.APPLE;

		switch (type) {
		case APPLE:
			System.out.println("이 과일의 이름은 " + FruitName.APPLE + " 입니다.");
			break;
		case PEACH :
			System.out.println("이 과일의 이름은 " + FruitName.PEACH + " 입니다.");
			break;
		case ORANGE :
			System.out.println("이 과일의 이름은 " + FruitName.ORANGE + " 입니다.");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
		*/
		//boolean typeOf = Fruit.APPLE == Company.APPLE ? true : false; 
		//System.out.println("해당 type은 : " + typeOf + " 입니다.");
		
		배광민 광민 = new 배광민("광민", "광민입니다.");
		String name = 광민.getName();
		
		Wipia typeOf = Wipia.of("범진");
		System.out.println(typeOf.getDescription());
		
		Wipia wipiaIndex[] = Wipia.values();
		for(Wipia temp : wipiaIndex){
			if(temp.getName() == "광민") {
				System.out.println(temp.getDescription());
			}
		}
		
		switch (typeOf) {
		case 배광민:
			System.out.println(typeOf.getDescription());
			break;
		case 정수진 :
			System.out.println(typeOf.getDescription());
			break;
		case 지민우 :
			System.out.println(typeOf.getDescription());
			break;
		case 주수진:
			System.out.println(typeOf.getDescription());
			break;
		case 박범진:
			System.out.println(typeOf.getDescription());
			break;
		case 김선경:
			System.out.println(typeOf.getDescription());
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + typeOf);
		}
		
		// ! 
		EnumSet<Wipia> wipiaAllData = EnumSet.allOf(Wipia.class);
		// wipia의 모든 data를 가져옵니다
		wipiaAllData.forEach(System.out::println);
		
		// enum으로 작동하는 Map
		EnumMap<Wipia, String> test2 = new EnumMap<Wipia, String>(Wipia.class);
		Wipia 배광민 = Wipia.배광민;
		
		test2.put(배광민, "광민입니다");
		System.out.println(test2.get(배광민));
	
		
		
	}

}
