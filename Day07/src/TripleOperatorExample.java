
public class TripleOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			// 3항 연산자를 써봅시다.
			// 3항연산자를 3개의 항을 이용하여 if문과 같은 효과를 냅니다.
			// 변수에 특정 조건에의한 값을 부여할때 if문 보다 간결하게 표현이 가능합니다.
			//3항 연산자는 무조건 3개의 항이 있어야만 쓸수 있다. ex) 3항을 안쓸수가 없다(if문으로 따졌을떄는 else 문을 무조건 써줘야한다)
			

			sum += (i % 2 == 0 ? i : 0); // 조건 ? 참 : 거짓 1항은 조건 2항은 참일떄 코드 3항은 거짓일떄 코드 (1항과 2항 사이에는 ?가 있어야하고 2항과3항사이에는 :가
											// 있어야한다)
			int result = i % 2 == 0 ? i > 10 ? i : 0 : 0;  // 이렇게도 쓸순 있지만(충접하여 쓸수 있지만) 복잡할수록 3항연산자보다는 if 문 쓰는것을 추천한다 .
			
		}
		System.out.println("합: " + sum);
	}

}
