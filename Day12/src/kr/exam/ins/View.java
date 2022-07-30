package kr.exam.ins;

public interface View {

	public abstract void getView();

	/*
	 * jdk1.8 부터 생김
	 * 
	 */
	public default void print() {
		System.out.println("프린트 가능");
	}

}
 