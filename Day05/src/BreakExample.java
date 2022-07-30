
public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int count = 0; // 반복 횟수

		while (true) {
			// 랜덤함수를 이용해서 값을 추출
			int rand = (int) (Math.random() * 50) + 1;
			sum += rand;
			if (sum > 1000) {
				break;
			} else {
				count++;
			}

		}
		System.out.println("합: " + sum + "반복횟수 : " + count);
		System.out.println((5 / 9) + " " + (5 % 9) + " " + (9 / 5) + " " + (9 % 5));
		System.out.println((6 / 9) + " " + (6 % 9) + " " + (9 / 6) + " " + (9 % 6));
		System.out.println((7 / 9) + " " + (7 % 9) + " " + (9 / 7) + " " + (9 % 7));
		System.out.println((8 / 9) + " " + (8 % 9) + " " + (9 / 8) + " " + (9 % 8));
	}

}
