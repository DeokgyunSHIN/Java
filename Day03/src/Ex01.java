import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너로 값을 받아서 받은 값이 홀수 또는 짝수인지 구분하는 프로그램 
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>>");
		int number = scan.nextInt();
		if (number % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		scan.close();
	}

}
