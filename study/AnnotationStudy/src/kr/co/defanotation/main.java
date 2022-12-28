package kr.co.defanotation;

import java.lang.reflect.Method;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeopleVo people = new PeopleVo();
		//people.getExection();
		
		Method[] declMethods = Test.class.getDeclaredMethods();
        for (Method method : declMethods) {
            if( method.isAnnotationPresent( MyData.class ) ) {
                System.out.println("[" + method.getName() + "]");
                MyData settingMy = method.getAnnotation( MyData.class );
                for (int index = 0; index < settingMy.number(); index++) {
                    System.out.print(settingMy.value());
                }
                System.out.println();
                
                try {
                    method.invoke( new Test() );
                } catch (Exception e) {
                }
                for (int index = 0; index < settingMy.number(); index++) {
                    System.out.print(settingMy.value());
                }
                System.out.println();
                System.out.println();
            }
        }
	}
	
} 
