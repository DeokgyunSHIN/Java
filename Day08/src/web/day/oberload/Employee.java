package web.day.oberload;

public class Employee {

	private String emName;
	private String salaray;

	// 기본 생성자
	public Employee() {

	}

	// 생성자 오버로드
	public Employee(String emName, String salary) {
		this.setEmName(emName);
		this.setSalaray(salary);
	}

	public String getEmName() {
		return emName;
	}

	public void setEmName(String emName) {
		this.emName = emName;
	}

	public String getSalaray() {
		return salaray;
	}

	public void setSalaray(String salaray) {
		this.salaray = salaray;
	}

}
