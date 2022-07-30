
public class DoubleLoopTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i =11; i > 0; i--) {
			if (i % 2 != 0) {
				for (int k = 0; k < i / 2; k++) {
					System.out.print(" ");
				}

				for (int j = 11; j >= i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
//		for (int i = 0; i < 6; i++) {
//			// 공백을 찍기 위한 for 문 - 하나씩 줄어든다. 
//			for(int k=0;k<5-i;k++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= (2*i+1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}

// 과제 마름모 만들기 1,3,5,7,9,7,5,3,1