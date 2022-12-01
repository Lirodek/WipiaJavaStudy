package wipia.object.string;

public class java_StringPckg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var test = 'z';
		
		String a="안녕하세용";
		print(a.copyValueOf(new char[] {'이','걸','누','가','써'}));// char 배열을 String으로 바꿔요 내부구조 new String(val)
		print(a.concat(" ㄹㅇㅋㅋ")); 				// 다른 문자열의 끝에 문자열을 추가합니다.
		print(a.compareTo("안녕하")); 			// 해당 데이터와 같은지 비교해서 다른 문자열의 갯수를 리턴합니다
		print(a.compareToIgnoreCase("안녕하")); 	// 위와 같은 기능을하지만 대소문자차이를 무시합니다 
		print(a.charAt(0)); 					// 해당 위치의 문자를 가져옵니다 returnType char
		print(a.contains("하세")); 				// 문자열의 해당 문자열이 있는지 확인합니다. 내부가 indexOf로 돌아감
		print(a.endsWith("용")); 				// 문자열이 해당 매개변수로 끝나는지 확인합니다.
		print(a.contentEquals("안녕하세용")); 		// 문자열이 정확하게 같은 값이 있는지 확인 equals보다 정밀-
		print(a.equals("안녕하세용")); 				// 문자열의 해당 문자열이 있는지 확인합니다.
		print(a.equalsIgnoreCase("안녕하세용")); 	// 대소문자 구분x비교
		print(a.format("안녕용")); 				// 지정된 인수를 사용해서 형식이 지정된 문자열을	반환합니다
		print(a.getBytes()); 					// 해당 문자열을 바이트로 반환합니다.
		print(a.hashCode()); 					// 해쉬코드 Object참조.
		print(a.indexOf("용")); 					// 해당 문자열의 매개변수의 위치를 가져옵니다.
		print("C:\\Users\\user\\OneDrive\\GwangMin".lastIndexOf("\\")); // 해당 문자열의 문자가 마지막으로 발견된곳.
		print(a.intern()); 						// 문자열 객체의 표준을 반환합니다 
		print(a.isEmpty()); 					// 문자열이 비어있는지 확인합니다.
		print(a.length()); 						// 문자열의 길이를 확인합니다.
		print(a.matches("")); 					// 정규식과 일치하는 항목을 검색하고 일치여부를 반환합니다.
		print(a.replace("안", "hello"));			// 문자열안에 A의 해당하는 영역을 B로 교체합니다. 
		print(a.replaceFirst("안", "hello"));	// (정규식포함)문자열안에 A의 해당하는 영역을 B로 교체합니다. (1회성)	
		print(a.replaceAll("안", "hello"));		// (정규식포함)문자열안에 A의 해당하는 영역을 B로 교체합니다. (모두)	
		print(a.split("하")[0]);					// 해당 문자를 기점으로 잘라냅니다
		print(a.startsWith("안녕"));				// 문자열의 시작문자열을 확인합니다. indexOf쓰세요 ^^;
		print(a.subSequence(0,1));				// 매개변수(시작, 종료) 대충 Char로 반환한다는뜻
		print(a.substring(0,5));				// 매개변수(시작, 종료) 해당 번지에서부터 종료번지까지를 자를수있습니다.
		print(a.toCharArray());					// Char배열로 반환합니다
		print("LIRODEK".toLowerCase());			// 대문자를 소문자로
		print("lirodek".toUpperCase());			// 소문자를 대문자로
		print(a.toString());					// Object정리 참조. 
		print(a.trim());						// 문자앞과 뒤의 공백제거
		//print(String.valueOf(48484848*48));		// 매개변수의 해당하는 (숫자,char, 각종 String이 아닌것들)을 문자열로 변환합니다.
		
		
		
	}
	
	private static void print(Object obj) {
		System.out.println(obj);
	}
}
