package kr.exam.exp;

public class ExceptionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		int result = 0;
		try {
			result = num / 0;
			System.out.println("결과: " + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
			e.printStackTrace(); // 예외처리내용을 출력해준다.
		}
		System.out.println("프로그램 종료...");
	}

}
