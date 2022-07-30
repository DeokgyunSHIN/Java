package kr.exam.inherit;

import java.util.Arrays;

public class PersonMain {

	public static void print(Person p) {
		// A instanceof B ==>  A의 진짜 타입이 B인가? 를 물어본다.
		if(p instanceof Student) {   // A 너는 학생이니??
		//	((Student)p).whoIam();
			System.out.println((Student)p);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 클래스 선언하기 
		Student st=new Student();
		// 다형성을 이용한 객체 선언 - 쉽게 말해서 부모타입으로 자식 선언하기 
		// 클래스 - 클래스 간 상속에서는 잘 쓰이지 않는다.
		// 이유는? 부모타입으로 자식을 선언할 경우, 자식이 가진 기능을 사용하지 못하는 제약이 생긴다.
		Person pst=new Student();
		st.setMyName("홍길동");
		st.setAge(500);
		st.setGender("남자");
		st.setSchoolName("율도 고등학교");
		st.setGrade("2학년");
		// static 메더스 즉 클래스 메서드는 
		// 객체가 생성될때 이미 사용가능한 메모리에 등록되기 떄문에 
		// 클래스의 이름으로 호출할수 있다.
		PersonMain.print(st);
		// static= 정적키워드 
		// static가 변수나 메서드에 있으면 객체가 없어도 클래스 이름으로 부를수 있다.
		
		// static 의 단점 -> 프로그램이 시작부터 종료까지 메모리에 박혀있다 그러므로 메모리 사용량이 많아진다.
		// static 은 컴파일이되면 메모리에 올라간다.
		
		
		
		
		
		
	}

}
