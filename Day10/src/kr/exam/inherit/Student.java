package kr.exam.inherit;

public class Student extends Person{
	
	private String schoolName;
	private String grade;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
//	public void whoIam() {
//		//super는 내 상위 클래스 객체 
//		String str=super.getInfo();
//		str+=", 학교이름: "+this.getSchoolName()+", ";
//		str+="학년: "+this.getGrade();
//		System.out.println(str);
//	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
				String str=super.getInfo();
				str+=", 학교이름: "+this.getSchoolName()+", ";
				str+="학년: "+this.getGrade();
				System.out.println(str);
		return str;
	}
}
