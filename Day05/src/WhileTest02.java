
public class WhileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int sum=0;
			int count=1;
			
			//while 문을 이용한 합 구하기 
			while(count<=100) {
				if (count%2==0) {
				sum+=count;
				}
				//카운트 증가 
				count++;
				
			}
			System.out.println("합은 "+sum);
			
	}

}
