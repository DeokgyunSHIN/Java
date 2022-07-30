package it.korea.objarray;

import java.util.Scanner;

public class StdService {
	Scanner scan;
	// 학생 객체 배열 언선
	Student stdArray[];
	int stdCount = 0;

	// 생성자를 통한 정의
	public StdService() {
		stdArray = new Student[3]; // 객체의 초기화는 null 이다
		scan = new Scanner(System.in);
	}

	// 학생을 등록할 메서드
	public void addStudent() {
		if (stdCount == 3) {
			System.out.println("더이상 학생을 등록할 수 없습니다.");
		} else {
			Student st = new Student();

			System.out.print("학생이름: ");
			st.setStName(scan.next());
			System.out.print("학생국어 점수: ");
			st.setKor(scan.nextInt());
			System.out.print("학생영어 점수: ");
			st.setEng(scan.nextInt());
			System.out.print("학생수학 점수: ");
			st.setMath(scan.nextInt());
			// 배열에 생성된 학생 객체를 넣어준다.
			stdArray[stdCount++] = st;
		}
	}

	public void printStudents() {
		// 향상된 for 문을 이요애서 출력하기
		// for (데이터 타입 변수 : 반복대상 ) {
		// print(변수);
		// }
		if (stdCount == 0) {
			System.out.println("등록된 학생이 없습니다.");
		} else {
			for (int i=0;i<stdCount;i++) {
				Student st=stdArray[i];
				System.out.println("이름: " + st.getStName() + ", 국어: " + st.getKor() + 
						           ", 영어: " + st.getEng() + ", 수학: "+ st.getMath() +
						           ", 총점: " + st.getTotal() + ", 평균: " + st.getAvg());
			}
		}
	}
	public void start() {
		int menu=0;
		while (true) {
			System.out.println("1. 등록       2. 출력	    3.종료");
			menu=scan.nextInt();
			
			switch(menu) {
			case 1:
				addStudent();
				break;
			case 2:
				printStudents();
				break;
			case 3:
				System.out.println("종료되었습니다.");
				scan.close();
				System.exit(0); // 프로그램 종료 
			}
		}
	}
}
