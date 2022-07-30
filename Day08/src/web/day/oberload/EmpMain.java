package web.day.oberload;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee em1 = new Employee();
		em1.setEmName("고길동");
		em1.setSalaray("300만원");

		// 생성자 오버로드를 통해 객체를 선언하면서 데이터를 넘길 수 있음
		Employee em2 = new Employee("김철수", "400만원");
	}

}
