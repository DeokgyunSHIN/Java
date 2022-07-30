package kr.exam.abs;

public abstract class PokectMon {
      // 구현되지 않은 클래스 이기 떄문에 불안정한 클래스라고 부른다.
	 
	/**
	 * 추상화 클래스는 추상화 메서드를 지닐수 있는 클래스를 말한다.
	 * 
	 * 추상화 메서드란?
	 *   구현되지 않고 정의만 된 상태의 메서드를 의미한다.
	 *   
	 *   추상화키워드는 abstract
	 *   클래스 또는 메서드에 접근제한자 뒤에 붙여준다.
	 *   
	 *   추상화 클래스는 불완전 클래스라고도 부르며,
	 *   기본적인 객체선언으로는 객체생성을 할수 없다.
	 *   
	 *   상속관계에서 일부 기능은 정의가 필요하나, 하위클래스에서 
	 *   각각 별도로 구현이 필요한 경우는 메서드의 기능명칭에 공통화를 위해서 
	 *   추상화 메서드로 선언하고, 하위클래스는 반드시 이를 구현해주도록 강제한다.
	 *   
	 *   만약 하위크랠스에서 추상화메서드를 구현하지 않을 시
	 *   그 하위 클래스도 추상화 클래스로 변경해야한다.
	 *   
	 */
	private String myName;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}
	// 추상화 메서드 써보기
	
	public abstract void attack(String target);    // 추상화 메서드 
	
	
	
	
}
