package kr.exam.exp;

import java.util.Scanner;

public class ExceptionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = null;

		try {
			scan=new Scanner(System.in);
			System.out.println("나누기할 값:");
			int num = scan.nextInt();
			System.out.println("나눌 값: ");
			int devideVal = scan.nextInt();
			
			int result =num/devideVal;
			System.out.println("나누기 결과: "+result);
		} catch (ArithmeticException e) {
			// 에러메세지를 출력 : getMessage() 메서드 사용
			System.out.println("나누기 에러!!" + e.getLocalizedMessage());
		}finally {
			// 예외 유무와 상관없이 실행 된다.
			// 예외 유무와 상광없이 실행되어야하는 코드를 넣는다.
			if(scan!=null) {
				scan.close();
				System.out.println("스캐너 닫기");
			}
		}
		System.out.println("프로그램 종료");

	}

}
