package kr.exam.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListExample03 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

		List<Model> modelList = new ArrayList<>();
		
		for (int i=0;i<2;i++) {
			Model m=new Model();
			System.out.print((i+1)+" 번쨰 모델 이름 :");
			m.setMyName(scan.next());
			System.out.print((i+1)+" 번쨰 모델 키 :");
			m.setHeight(scan.nextInt());
			//리스트에 모델 넣기 
			modelList.add(m);
		}
		scan.close();
		Collections.sort(modelList, new ModelCompare());    

	    for(Model m: modelList) {
	    	System.out.println("이름: "+m.getMyName()+", 키: "+m.getHeight());
	    }
	}

}
