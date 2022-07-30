import java.util.Arrays;

public class ArraySortExmple02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 20) + 1;
		}
		int temp = 0; // 값을 치환하기 위한 임시변수

		// Arrays를 사용한 정렬 
		// 이기능도 오름/내림 자춘정렬이 가능하지만 
		// 현재 진도로는 오름차순만 가능하니깐 .오름차순용으로 배워봅니다.
		
		System.out.println("정렬전 ->" +Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("정렬후 ->" +Arrays.toString(arr));
	}

}



// 로또 만들기 6개의 번호로 이루ㅇ져 있고 하나의 보너스가 있어서 7개의 번호가 있다.
// 위치는 상관없이 6개의 번호를 가지고 있느냐 를 만들기 
// 로또 규칙 만들기 
// pc 의 7개의 번호는 랜덤으로 받고 1~45 중에서 뽑는데 겹치면 안된다 .
// 사용자의 번호는 키보드로 받기  이또한 중복되면 안된다.
// 비교해서 맞은 번호가 무엇인지 등수 출력하기 기간은 다음주 월용리 까지 



// 2번 문제 
// 랜덤 함수를 사용해서 중복없이 숫자를 받고 배열 10개를 만드어서 받아서 일단 출력 (범위 상관 없음)
// 배열의 최소값과 최대값을 각각 뽑아서 출력 하기 

// 텍스트 파일로 보내기 