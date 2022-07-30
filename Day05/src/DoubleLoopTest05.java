
public class DoubleLoopTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 6; i++) {
			// 공백을 찍기 위한 for 문 - 하나씩 줄어든다. 
			for(int k=0;k<5-i;k++) {
				System.out.print(" ");
			}
		      
			
			
			// 병을 찍기 위한 for 문
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
