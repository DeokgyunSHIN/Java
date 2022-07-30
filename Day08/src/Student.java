import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	// 멤버 변수
	private String stName;
	private int kor;
	private int eng;
	private int math;

	// 파라메터의 변수 이름은 똑같아도 된다 왜냐하면 저장되는 공간이 다르기 때문이다. 그리고 이 메서드는 사용되는 즉시 다시 없어지기 떄문에
	// 같은 변수명을 써도 된다 .
	public void setStName(String stName) { // set + 변수 이름 ---> setter (값을 받는 애)
		this.stName = stName; // this -> 자기 자신을 가르친다.
	}

	public String getStName() { // get + 변수 이름 ---> getter ( 값을 주는 애)
		return this.stName;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	// 총점 구하기
	public int getTotal() {
		return this.getKor() + this.getEng() + this.getMath();
	}

	// 평균 구하기
	public double getAvg() {
		double avg = (double) this.getTotal() / 3;
		// BigDeciaml 클래스를 이용하여 소수점 계산이 가능
		// BigDeciaml 은 숫자관련 유틸 클래스로 소수점 표현이 가장 정확하게 계산해줄수 있다.
		avg = new BigDecimal(avg).setScale(2, RoundingMode.HALF_UP).doubleValue(); // 묵시적 -> 일회용 (한번만쓰고 버릴 경우 묵시적으로 만든다)
		return avg;
	}

	// 출력문 만들기
	public void getInfo() {
		String info = "";
		info = "이름:" + this.getStName() + ", ";
		info += "국어:" + this.getKor() + ", ";
		info += "영어:" + this.getEng() + ", ";
		info += "수학:" + this.getMath() + ", ";
		info += "총점:" + this.getTotal() + ", ";
		info += "평균:" + this.getAvg();
		System.out.println(info);
	}
}
