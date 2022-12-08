package com.wipia.arraystudy;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		
		for(int i=0;i<arr.length;i++) 
			arr[i] = i;
		
		System.out.println("[변경전]");
		System.out.println("arr.length:"+arr.length);
		
		for(int i=0;i<arr.length;i++) 
			System.out.println("arr["+i+"]:"+arr[i]);
		
		// ======= 배열 갈아껴주기 =======
		
		int[] temp = new int[arr.length*2];
		
		for(int i=0;i<arr.length;i++)
			temp[i] = arr[i];
		
		arr = temp;
		
		System.out.println("[변경후]");
		System.out.println("arr.length:"+arr.length);
		
		for(int i=0;i<arr.length;i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
	}

}
