package kr.exam.wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer num01 = new Integer(10);  // 곧 없어질 코드
		Integer num02=10;   // 제일 많이 씀
		// valueOf , parseInt는 둘다 소수점은 받지 못한다 . 정수형만 받을수 있다.
		Integer num03=Integer.valueOf("10");  // return 타입이 객체형 
		Integer num04=Integer.parseInt("10"); // return 타입이 일반변수타입 , 문자타입만 받을 수 있다.
		
		System.out.println(num01==num02);
		System.out.println(num02==num03);
		System.out.println(num01==num03);
		System.out.println(num01.intValue()==num03.intValue());
		System.out.println(num01.compareTo(num03)); //같으면 0 내가크면 1 상대가 크면-1
		System.out.println(10==num03);
		//객체끼리 == 는 값이 같냐는 뜻이 아닌 같은 객체냐 라는 뜻이다 .
		
	}

}
