package com.min.edu;

public class SingTonTest_Main {

	public static void main(String[] args) {

		// 1. �ν��Ͻ��� 1���� ������� new�� ����ϸ� �ȵ�  -> �׷��� �����ڸ� private�� ����������.
//		SingTonTest sing =  new SingTonTest();
//		SingTonTest sing2 =  new SingTonTest();
//		System.out.println(sing);
//		System.out.println(sing2);
//		System.out.println(sing.hashCode());
//		System.out.println(sing2.hashCode());
		// -> com.min.edu.SingTonTest@39ed3c8d
		
		
		SingTonTest sing3 = SingTonTest.getInstance();
//		SingTonTest sing4 = SingTonTest.getInstance();
		System.out.println(sing3);
//		System.out.println(sing4);
		System.out.println(sing3.hashCode());
//		System.out.println(sing4.hashCode());
		
		
	}

}
