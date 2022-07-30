
public class OperatorValueTest {

	public static void main(String[] args) {   //메인메소드 -> 시작 메소드 
		// TODO Auto-generated method stub

		int aNum=16;
		byte bNum=12;
		long iNum=20;
		double dNum=10;
		
		//더하기
		int sum01 = aNum +bNum;
		
		//byte bsum= bNum +bNum;   //오류가 난다. int 이하 끼리의 연산의 결과는 무조건 int 타입으로 나온다.
		
		//정수 나누기 정수
		// int 타입 / int 타입 = int 타입이 나온다.
		System.out.println(aNum/5);
		
		//double 타입/ int 타입 = double 타입이 나온다.
		System.out.println((double)aNum/5);
		
	}

}
