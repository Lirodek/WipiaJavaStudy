package StackQueue221215;


import java.util.LinkedList;

public class QueueExample {
	public static void main(String[] args) {
		
		LinkedList<String> qu = new LinkedList<String>(); // 큐의 생성
		// Deque<String> qu = new ArrayDeque<String>();
		// 더욱 복잡하고 빠른 스택을 구현하고 싶다면 Deque 인터페이스를 구현한 ArrayDeque 클래스를 사용하면 됩니다.

		// add() 메소드를 이용한 요소의 저장
		qu.add("넷");
		qu.add("둘");
		qu.add("셋");
		qu.add("하나");

		// peek() 메소드를 이용한 요소의 반환
		System.out.println(qu.peek());
		System.out.println(qu);

		// poll() 메소드를 이용한 요소의 반환 및 제거
		System.out.println(qu.poll());
		System.out.println(qu);

		// remove() 메소드를 이용한 요소의 제거
		qu.remove("하나");
		System.out.println(qu);
	}
}
