
public class ChangeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 오늘의 예제
		 * 
		 * 정수형 변수 num1, num2를 선언 그리고 초기화 :7 ,1
		 * 
		 * int temp 이용해서 num1 과 num2값을 바꿔준다.
		 * 
		 **/

		int num1 = 7, num2 = 1, temp;
		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("num1= " + num1 + " , num2= " + num2);
	
//		float a= 10.11f;
//		float b= 20.22f;
//		
//		float bb= a+b;
//		System.out.println(bb);
//		
		
//		long b=10;
//		int c=20;
//		
//		c = (int)b;
//		
//		System.out.println(c);
//		
		
		
		int aNum=129;
		byte bb=0;
		bb=(byte)aNum;
		System.out.println(bb);   // 결과값은 이상하게 나온다 왜냐하면 byte 128~-127 까지 담을수 있기 떄문이다 .
		
		
	}

}
