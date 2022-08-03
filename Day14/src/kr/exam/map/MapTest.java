package kr.exam.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		// map을 선언
		Map<String, Integer> map = new HashMap<>();

		// 데이터 삽입
		// put(key,value);
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);

		// 치환 - key 중복 불가를 이용
		map.put("four", 44);

		// 삭제
		// remove(key)
		map.remove("one");

		// 특정 키가 존재하는지 확인
		System.out.println(map.containsKey("two")); // key가 존재하는지 확인하는 코드
		// 특정 값이 존재하는지 확인 - 중복은 신경안씀 그냥 있으면 true
		System.out.println(map.containsValue(4)); // value가 존재하는지 확인하는 코드

		// key의 집합을 가져오기
		Set<String> keys = map.keySet();

		// 출력
		for (String key : keys) {
			// 맵의 값을 가져오기 - get(key)
			System.out.println("key: "+key +", value : "+map.get(key));
		}
		
		System.out.println("=============================");
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println("key :" + entry.getKey() + ", value :" + entry.getValue());
		}
	}

}
