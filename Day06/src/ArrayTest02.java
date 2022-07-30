
public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[10];
		int sum = 0;

		// 배열에 랜덤할수를 이용해서 값을 부여하자
		for (int i = 0; i < arr.length; i++) {
			// 1~20 사이의 랜덤 값을 부여하여 넣는다.
			arr[i] = (int) (Math.random() * 20) + 1;
		}
		// 배열 값중에서 짝수 일때만 출력과 합산을 하여
		// 배열 값 중에서 짝수 갑슬 출력하고, 그 합을 구하여라

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
				sum += arr[i];
			}
		}
		System.out.println("합: " + sum);
	}
}
