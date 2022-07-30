import java.util.Scanner;

public class IfTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String id = "";
		String passwd = "";

		System.out.print("아이디를 입력하세요>>>");
		id = scan.next();

		/*
		 * String 은 일반데이터 타입(int,long,double...등) 과 다르게 클래스 형태의 데이터 타입입니다.
		 * 
		 * 그래서 일반데이터 타입의 동등비교(==) 연산을 통해 같은지를 비교하지 않고 자신이 가진 기능을 사용하여 데이터가 같은지 비교하게 된다.
		 * 
		 * String은 equals(비교값)을 통해서 비교대상과 자신의 값이 같은지 true 또는 false 로 응답한다.
		 */
		if (id.equals("admin")) {
			// 아이디를 정확히 입력했을떄

			System.out.print("비밀번호 입력 >>");
			passwd = scan.next();
			if (passwd.equals("1234")) {
				System.out.println("인증완료! 로그인이 되었습니다.");
			} else {
				System.out.println("비밀번호가 틀렸습니다. 다음에 다시 입력하세요..");
			}
		} else {
			System.out.println("존재하지 않는 ID 입니다. 확인하세요 ");
		}

	}

}
