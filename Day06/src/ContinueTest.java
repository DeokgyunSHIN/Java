
public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		// 홀수의 합을 구해봅시다
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				// 짝수일경우 이번 루프 종료 후 다시 시작
				// 반복문에서 continue 를 만나면 이번 루프 종료 후 루프 실행
				continue;
			}
			sum += i;
		}
		System.out.println("합: " + sum);
	}

}
