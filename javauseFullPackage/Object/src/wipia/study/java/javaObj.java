package wipia.study.java;

import java.util.Objects;

import wipia.study.property.Person;

public class javaObj {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		//getClassEx(new Minwoo());
		//hashCodeEx();
		//equalsEx();
		//cloneEx();
		finalizeEx();
		
		
		
	}
	
	// Object를 입력받아 해당 객체가 어느 클래스인지 비교합니다.
	private static void getClassEx(Object obj) {
		Person lirodek = new Person();
		System.out.println(lirodek.getClass());
		System.out.println(obj.getClass());
	}
	
	// 해쉬코드 예제
	private static void hashCodeEx() {
//		String hello = "안녕하세요	";
//		String hellokr = "안녕하세요";
//		System.out.println(hello.hashCode());
//		System.out.println(hellokr.hashCode());
		
		System.out.println(new Person("배광민", 25).hashCode());
		System.out.println(new Person("김선경", 25).hashCode());
	}
	
	// 이퀄스 예제
	private static void equalsEx() {
		String str1 = "abc";
		String str2 = str1;
		String str3 = new String("defabc");
		str3 = str3.substring(3);
		System.out.println(str3);
		System.out.println("=====  ( == )예제 =====");
		
		System.out.println("String str2 = str1; 	       :: " + (str1 == str2));
		System.out.println("String str3 = new String(abc); :: " + (str1 == str3));
		
		System.out.println("===== equals 예제 =====");
		
		System.out.println("String str2 = str1; 	       :: " + str1.equals(str2));
		System.out.println("String str3 = new String(abc); :: " + str1.equals(str3));
		
	}
	
	// 클론 예제
	private static void cloneEx() throws CloneNotSupportedException {
		Person p1 = new Person("배광민", 25);
		Person p2 = new Person("김선경", 25);
		p1.setParents(new Person("곽혜연", 47));
		Person p3 = (Person)p1.clone();
		p1.setParents(new Person("혜연", 47));
		System.out.println(p3.getParents().toString());
	}
	
	// 파이널라이즈 예제
	private static void finalizeEx() {
		for(int i = 0; i < 20; i++) {
			Person test = new Person("배광민"+i, i);
			
			test = null;
			//null 값을 넣어 기존에 있는 값을 쓰레기로 만듬
			System.gc();
		}
	}
}

