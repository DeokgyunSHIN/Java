
public class DiamondExamReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 하드코딩 for 이나 if 문에 숫자를 넣는게 아니라 변수에 숫자를 넣어서 쓰는것이 좋다 .
		
		int line = 9; // 전체 라인수
		int middle = line / 2; // 중앙
		int space = 0; // 공백크기
		int star = 0; // 별 크기

		// 제일 바깥 for 문 i는 라인수를 의미
		for (int i = 0; i < line; i++) {

			if (i <= middle) {
				space = line - i - 1;
				star = line + i;
			} else {
				space++; // 중앙 이후부터 공백은 늘어난다.
				star--; // 중앙 이후부터 이전보다 하나씩 줄면된다.
			}
			for (int j = 0; j < star; j++) {
				if (j < space) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
