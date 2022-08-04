package kr.exam.list;

import java.util.Comparator;

// 정수 타입을 비교하는 클래스 
// collections.sort(비교대상, 비교클래스); 위치에 들어간다.
public class IntegerCompare implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
	//내림차순은 앞이 뒤보다 커야하는데, 만약 뒤가 앞보다 크다면 바꾼다.
		if (o1.intValue()<o2.intValue()) {
			return 1;
		}else {
			return -1;
		}
	}

}
