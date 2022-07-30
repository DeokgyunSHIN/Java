
public class DoubleLoopTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 6; i++) {
			// 공백을 찍기 위한 for 문 - 하나씩 줄어든다. 
		  
			
			// 병을 찍기 위한 for 문
			for (int j = 0; j < i+6; j++) {
				if (j<5-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
		
		}
			System.out.println();
	}

}
}
