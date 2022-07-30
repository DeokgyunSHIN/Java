package kr.exam.list;

import java.util.ArrayList;
import java.util.List;

public final class ListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList 를 선언하기
		List<Integer> list = new ArrayList<Integer>(); // 요즘 이렇게 잘 안씀
		List<Integer> list2 = new ArrayList<>();// 뒤에는 생략 가능

		// 객체가 어떤 데이터타입을 구별해주는 기능 -> 제너릭

		// 추가 -add(값)
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);

		// 중간 삽입 - add(index,값) - 공간의 띄어서 추가는 안됨
		// 마지막 인덱스가 3일경우 add(4,값) 가능하지만 add(5,값)은 불가능
		// 리스트 값은 빈공백이 존재할수 없기 떄문
		list2.add(5, 10);
		list2.add(0, 11);

		// 치환 - set(index,값);

		list2.set(2, 20); // index 2번 위치의 값이 20으로 바뀜

		// 삭제 - remove(index)
		list2.remove(5);

		// 단순 출력
		System.out.println(list2);
		
		// 특정 위치 값을 꺼내기 - get(index);
		for(int i=0;i<list2.size();i++) {    // list는 length를 못쓴다
			System.out.println(list2.get(i));
		}
		System.out.println("============================================");
		//향상된 for문을 이용해서 출력 
		for(int val: list2) {
			System.out.println(val);
		}
	}
}