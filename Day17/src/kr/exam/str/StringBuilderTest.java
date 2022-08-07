package kr.exam.str;

public class StringBuilderTest {

	public static void main(String[] args) {

	    // 선언
		StringBuilder sb=new StringBuilder();
		
		// 문자열을 추가 
		sb.append("안녕하세요 날씨가 너무 덥네요 \n");
		sb.append("주말에 비가 온다네요");
		
		// 출력
		System.out.println(sb);
		
		// 삽입 
		sb.insert(18, "추가!!(삽입)");
		System.out.println(sb);
		
		// 문자열 뒤집기 
		StringBuilder sb2=new StringBuilder("elppa");
	
		// 문자열 뒤집기 출력 
		System.out.println(sb2.reverse());

		// 스트링 타입으로 변경
		System.out.println(sb2.toString());
	}

}
