package com.min.edu;

public class SingTonTest {
	
	// 1. �ܺο��� �������� ȣ���� �������� private ����
	private SingTonTest() {
		System.out.println("������");
	
	}
	// 4.  static �ʵ带 ����� �޸𸮿� �÷��ΰ� getInstance()������ ��밡���ϰ� ����
	private static SingTonTest single;
	
	 // 2. �����ڷ� �ν��Ͻ��� ���޾ƿͼ� getInstance() �޼ҵ�� ������
	public static SingTonTest getInstance() {
		System.out.println("�� �ν��Ͻ� �� ���ҳ�");
		
//		3. getInstance() �޼ҵ� �ȿ����� new�� ����ϸ� �ν��Ͻ��� ȣ��ɶ�����
//		   �����Ǳ� ������ �̱����� �ɼ� ����  -> �ذ� ������� static �޼ҵ带 ���
		if (single ==null) { 
			single = new SingTonTest();
			System.out.println("�� �ν��Ͻ� �� ��?");
		}
		return single;  // 5. single�� �ҷ��÷��� static�̾�� ��
	}

}
