import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int num01 = 85;
		// 70 이상이면 합격
		if ((num01 / 10) >= 7) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		System.out.println("점수를 입력하세요(60~100)");

		// nextInt() 키보드입력을 대기했다가 입력이 완료되면 정수(int) 타입으로 반환해준다.
		// 숫자 이외의 값을 입력하면 에러난다.
		int score = scan.nextInt();

		if (score >= 60) {
			System.out.println("점수: " + score + ", 합격 입니다.");
		} else {
			System.out.println("점수: " + score + ", 불합격 입니다.");
		}
		// 스캐너는 사용후 꼭 닫아줘야한다. 안해주면 메모리 공간을 계속 잡아 먹기 떄문이다.
		scan.close();
	}
}
