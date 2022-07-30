import java.util.Arrays;

public class ArraySortExmple01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 20) + 1;
		}
		int temp = 0; // 값을 치환하기 위한 임시변수

		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				// 나의 위치에서 내뒤에 있는 값이랑 비교한다.
				// i 값이 length-1 로 시작하는 이유는 j는 마지막 전까지만 가야한다.
				// 그래야 마지막 전의 내뒤의 마지막이 비교될수 있기 때문
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
