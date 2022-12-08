package com.min.edu;

public class SingTonTest {
	
	// 1. 외부에서 생성자의 호출을 막기위해 private 생성
	private SingTonTest() {
		System.out.println("생성자");
	
	}
	// 4.  static 필드를 사용해 메모리에 올려두고 getInstance()에서만 사용가능하게 만듬
	private static SingTonTest single;
	
	 // 2. 생성자로 인스턴스를 못받아와서 getInstance() 메소드로 가져옴
	public static SingTonTest getInstance() {
		System.out.println("겟 인스턴스 잘 돌았냐");
		
//		3. getInstance() 메소드 안에서도 new를 사용하면 인스턴스가 호출될때마다
//		   생성되기 떄문에 싱글톤이 될수 없음  -> 해결 방안으론 static 메소드를 사용
		if (single ==null) { 
			single = new SingTonTest();
			System.out.println("겟 인스턴스 잘 들어감?");
		}
		return single;  // 5. single을 불러올려면 static이어야 함
	}

}
