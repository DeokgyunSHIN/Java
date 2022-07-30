
public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 선언 1
		int arr01[]= null; 
		
		// 선언과 정의를 같이
		int arr02[]=new int [5];
		
	    // 값과 크기를 동시에 부여하여 선언, 최초 선언시에만 가능
		int arr03[]= {1,2,3,4,5};
		
		
		// 이렇게는 안됨 
		//arr01= {1,2,3,4};   에러남  즉, 쉽게말하면 처음 선언했을떄만 쓸수 있다는 뜻이다.
		
		//재 정의를 통한 선언
		arr01=new int[] {1,2,3,4};	
		
		System.out.println("배열출력1: "+arr01);
		System.out.println("배열출력2: "+arr02);
		System.out.println("배열1의 첫번쨰 위치의 값: "+arr01[0]);
		System.out.println("배열2의 첫번쨰 위치의 값: "+arr02[1]);
	}

}
