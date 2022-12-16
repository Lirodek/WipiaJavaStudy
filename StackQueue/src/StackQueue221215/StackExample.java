package StackQueue221215;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		// 스택에 값 삽입
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("stack 가장 상단 값 : " + stack.peek());
		System.out.println("stack 크기 : " + stack.size());
		System.out.println("stack 꺼내기 : " + stack.pop());
		
		stack.push(5);
		stack.push(6);
		stack.size();
		stack.empty();     // stack이 비어있는제 check (비어있다면 true)
		stack.contains(3); // stack에 3이 있는지 check (있다면 true)
		
		System.out.println("다시 사이즈 : " + stack.size());
		System.out.println("stack이 비어있는지? : " + stack.empty());
		System.out.println("stack에 3이 있는지 ? : " + stack.contains(3));
		
		// 스택의 최상단 원소부터 출력
        while (!stack.empty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
        
	}
}
