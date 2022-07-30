package kr.exam.inherit;

public class Person {
	private String myName;
	private int age;
	private String gender;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInfo() {
		String str= "";
			   str+="이름: "+this.getMyName()+", ";
			   str+="나이: "+this.getAge()+", ";
			   str+="성별: "+this.getGender();
		return str;
	}
}
