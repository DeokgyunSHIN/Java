
public class DoubleLoopTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 구구단

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <=9; j++) {
				System.out.print(j + "x" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}

}
