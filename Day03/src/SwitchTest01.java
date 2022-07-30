
public class SwitchTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 85;

		// switch-case 문을 이용하여 조건문을 처리하기
		// switch 문의 조건식은 if 문과 달리 true/ false 가 아닌 답이 있느 계산식
		// 또는 변수 자체가 조건의 대상이 된다.

		switch (score / 10) {
		case 10:
			System.out.println("만점 !");
			break;
		case 9:
			System.out.println("A 학점");
			break;
		case 8:
			System.out.println("B 학점");
			break;
		case 7:
			System.out.println("C 학점");
			break;
		default:
			System.out.println("F 학점");

		}
	}

}
