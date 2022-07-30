package kr.exam.abs;

public class PokeMonWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Picachu pi=new Picachu("피까츄");
		SeedMon sm =new SeedMon("이상해 씨");
		
		pi.attack("파이리");
		sm.attack("도까스");
	}

}


// 인터페이스  -> 클래스가 아니다 
//  인터페이스는 추상화메서드만 지닐수 있다.  // 인터페이스는 다중 상속이 가능하다.
//  상수만 지닐수 있다?
// 기능중심 다중상속 가능 모두 추상화  상수만 가능 
// 상속은 올 대문자?
