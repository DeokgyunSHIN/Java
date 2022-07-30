import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int fee = 1000;
		System.out.print("나이를 입력하세요>>>");
		int age = scan.nextInt();
		// 나이에 따른 추가요금 발생
		if (age >= 18) {     //if 문을 쓸때에는 큰값부터 작은것으로 만들어줘야 한다. 
			fee += 500;
			System.out.println("성인 요금은 " + fee + "원 입니다.");
		} else if (age >= 13) {
			fee += 300;
			System.out.println("청소년 요금은 " + fee + "원 입니다.");
		} else if (age >= 7) {
			fee += 100;
			System.out.println("어린이 요금은 " + fee + "원 입니다.");
		} else {
			fee = 0;
			System.out.println("미취학아동 요금은 " + fee + "원 입니다.");
		}
		scan.close();       //자바에서 소괄호를 가진 것은 메소드 밖에 없다 
	}

}
