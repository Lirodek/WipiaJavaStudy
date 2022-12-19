package kr.co.gwangmin;

import java.lang.reflect.Method;

public class MyHelloExample {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		MyHello hello = new MyHello();
		// get Class의 DeclaredMethod 함수를 통해서 해당 클래스의 함수 정보를 알 수있습니다.
		// 즉 해당 함수는 MyHello 클래스의 hello()의 정보를 가져오라는 의미입니다
		Method method = hello.getClass().getDeclaredMethod("hello");
		
		// method에 Count100 Annotion이 적용이 되어있는지?
		if(method.isAnnotationPresent(Count100.class)) {
			for(int i=0 ; i<100 ; i++) {
				hello.hello();
			}
		} else {
			hello.hello();
		}
	}
}
