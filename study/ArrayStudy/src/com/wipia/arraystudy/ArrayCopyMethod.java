package com.wipia.arraystudy;

public class ArrayCopyMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alpabet[] = new char[26];
		char capital_letter[] = new char[26];
		
		for(int i=0;i<alpabet.length;i++) 
			alpabet[i] = (char)(i+97);
		
		for(int i=0;i<alpabet.length;i++) 
			System.out.printf("%s ", alpabet[i]);
				
		System.out.println("");
		
		for(int i=0;i<capital_letter.length;i++) 
			capital_letter[i] = (char)(i+65);
		
		for(int i=0;i<capital_letter.length;i++) 
			System.out.printf("%s ", capital_letter[i]);
		
		char[] result = new char[alpabet.length + capital_letter.length];
		//               복사할배열,   시작번지, 		 저장할 배열,	저장할배열의 시작번지, 복사할 배열의 길이
		System.arraycopy(alpabet,    	0, 		   result, 				 0, alpabet.length);
		System.arraycopy(capital_letter,0, 		   result, 	alpabet.length, capital_letter.length);
		
		System.out.println();
		System.out.println(result);
		
		
		

		
	}
}
