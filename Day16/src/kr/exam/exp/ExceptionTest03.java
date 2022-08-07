package kr.exam.exp;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest03 {
	// throws 키워드를 이용해서 예외가 발생한 경우 호출 대상에게 던질 수 있다.
	// 던지는 예외는 여러개 알수 있다.

	public static double devide() throws ArithmeticException, InputMismatchException, NumberFormatException {
		Scanner scan = new Scanner(System.in);
		System.out.println("나누기할 대상: ");
		int target = scan.nextInt();

		System.out.println("나눌 값: ");
		int dev = scan.nextInt();

		double result = (double) target / dev;
		System.out.println(result);
		scan.close();

		return result;
	}

	public static void main(String[] args) {

		// 던지기 예외를 받는 쪽은 예외처리를 해주어야 한다.
		try {
			System.out.println("나누기 프로그램 실행!!!");
			double result = ExceptionTest03.devide();

			result = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP).doubleValue();
		} catch (ArithmeticException e) {
			System.out.println("나누기 에러!!");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("키보드 입력 에러!!!");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("데이터 포멧 에러");
			e.printStackTrace();
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
