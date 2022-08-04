package kr.exam.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListExample01 {

	public static void main(String[] args) {
		// 리스트를 이용해서 데이터 저장 시 종복제거 하기

		// 램덤 클래스 선언
		Random rand = new Random();
		
		List<Integer> numberList=new ArrayList<>();
		int count = 0;
		while (count < 10) {
			// 1<=x< 기준
			int temp = rand.nextInt(30) + 1;
	   
		  // 중복처리 
			if(numberList.size() > 0) {
	
				// 해당 값이 리스트안에 있는지 확인
				if (numberList.contains(temp)) {
					// 있따면 여기서 루프 종료 
					continue;
				}
			}
			// continue를 안만나고 왔따는건 중복이 없다는 얘기
			numberList.add(temp);
		   count++;
		}
		System.out.println(numberList);

	}

}
