
public class MyCarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체를 선언해봅시다. ( 클래스는 데이터 타입으로 도 쓸수 있따 그래서 객체를 선언할떄 앞에 쓴다) new를 쓰면 메모리에 공간을 만든다.
		// 주소를 넘겨준다. (주소를 넘겨주는 변수 -> 참조변수)
		// 인스턴스 -> 클래스의 정보를 가지고 있는 변수
		// () 가 뒤에 붙어있으면 메서드
		// 생성자 -> 리턴타입이 없다. 클래스를 최초로 불릴떄 한번만 사용한다. 그러기 떄문에 리턴값이 없다 . 생성자는 메서드의 이름과 같게
		// 만들어준다.
		// 기본 생성자, 디폴트 생성자 , 리턴 생성자

		Car car = new Car();
		
		car.carName="붕붕이";
		car.price=10000000;
		
		// 자동차 정보출력 
		car.getInfo();
	}

}
