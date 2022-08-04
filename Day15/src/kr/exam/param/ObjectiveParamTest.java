package kr.exam.param;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectiveParamTest {

	public static void add(int num) {
		num = num + 1;
		System.out.println("더하기 결과: " + num);
	}

	public static void add(List<Integer> list) {   // 객체는 실제 공간을 공유한다. 
		list.add(10);
		System.out.println("추가 결과: " + list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		int num=10;
		
		System.out.println("메서드 호출전 리스트: "+list);
		System.out.println("메서드 호출전 일반변수: "+num);
		
		// 메서드 호출 
		ObjectiveParamTest.add(num);
		ObjectiveParamTest.add(list);
		// 결국은 일반 변수는 원본에 영향을 미치지는 못하지만 객체는 원본에 영향을 미친다.
		System.out.println("메서드 호출후 리스트: "+list);
		System.out.println("메서드 호출후 일반변수: "+num);
	}

}
