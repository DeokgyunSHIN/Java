
public class ForLoopTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for 문을 이용해서 1~100 사이에서 홀수만을 더하여 출력하기
		 */
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("홀수끼리의 합:" + sum);
	}

}