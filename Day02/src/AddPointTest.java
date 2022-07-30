
public class AddPointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int apple = 3;
		int total = 0;

		// 증감연산식을 앞에 붙일때
		// 수식 이전에 증가하고, 값이 대입된다.

		total = ++apple;
		System.out.println("total= " + total + ", apple= " + apple);

		// 증감 연산식을 뒤에 붙일떄
		// 값이 먼저 대입대고 증가한다.

		total = apple++;
		System.out.println("total= " + total + ", apple= " + apple);

	}

}
