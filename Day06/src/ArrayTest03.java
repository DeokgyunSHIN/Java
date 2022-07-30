import java.util.Arrays;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[10];

		// 배열에 랜덤할수를 이용해서 값을 부여하자
		for (int i = 0; i < arr.length; i++) {
			// 1~20 사이의 랜덤 값을 부여하여 넣는다.
			arr[i] = (int) (Math.random() * 20) + 1;
			// 중복처리 기능
			for (int j = 0; j < i; j++) {
				// 중복값이 있으면
				if (arr[i] == arr[j]) {
					i--; // i 값을 하나 뺴고
					break; // 비교 종료
				}
			}
		}

		// 배열을 쉽게 사용하기 위해서 Arrays 란 클래스가 있다
		// 우리가 특정 기능을 도와주는 이런 클래스를
		// 유틸 클래스라고도 부른다.

		System.out.println(Arrays.toString(arr));

	}
}
