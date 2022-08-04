package kr.exam.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListEXample02 {

	public static void main(String[] args) {
	
     List<Integer> list =new ArrayList<>();
     Random rand=new Random();
     
     // 리스트에 담기
     
     for (int i=0;i<10;i++) {
    	 //리스트에 랜덤클래스를 이용해서 10개의 값을 넣는다.
    	 list.add(i, rand.nextInt(50)+1);
     }
		 System.out.println("정렬전: "+list);

		 
		 //오름차순 부터 
		 // Arrays와 같이 컬렉션 그룹을 도와주는 도우미 클래스가 있는데 이름이 Collections 이다.
		 // 해당 클래스를 이용하면 쉽게 정열을 할수 있다,
		 
		 Collections.sort(list);
		 System.out.println("오름차순 정렬 : "+list);
		 
		 
		 // 내림차순1
		 //  Collections.sort(정렬대상, 정렬옵션);
		 Collections.sort(list, Collections.reverseOrder());
		 System.out.println("내림차순 정렬 : "+list);
		 Collections.sort(list, new IntegerCompare());  // Compare 클래스를 만들어서 내림차순 만들기
		  
		 System.out.println("내림차순 정렬 : "+list);
	}

}
