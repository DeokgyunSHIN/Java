
public class StdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 생성
		Student st1 = new Student();

		// setter 이용
		st1.setStName("홍길동");
		st1.setKor(100);
		st1.setEng(80);
		st1.setMath(88);
		// 정보 출력
		st1.getInfo();

		Student st2 = new Student();
		st2.setStName("김철수");
		st2.setKor(98);
		st2.setEng(100);
		st2.setMath(88);

		st2.getInfo();
	}

}
