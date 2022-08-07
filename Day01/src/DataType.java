public class DataType {
     // main 메소드 프로그램의 시작이자 끝
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pie=3.17;   //상수 
		int num=3;
		double dnum=3.14;
		char myChar='A';   // 유니코드
		boolean isBanana=true;
		
		System.out.println(num+" "+dnum+" "+myChar+" "+isBanana);
		myChar= 'Z';
		System.out.println(myChar);

		/** 형 변환 =캐스팅 **/
		int apple =10;
		double banana=apple;
		System.out.println(banana);
		
		apple =(int)10.5;
		System.out.println(apple);
		
	}

}