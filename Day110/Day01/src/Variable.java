/*
 * 변수 선언 및 초기화 예제 
 * 2022.07.13
 */

/**
 * 
 * @author user
 *
 */
public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year=2022;   // 변수를 선언하고 2022이라는 데이터를 year 변수에 대입함. (초기화)
		
		int month=7;
		System.out.println(year+"년"+month+"월");
		month=8;
		System.out.println(year+"년"+month+"월");
		
		month=12;
		System.out.println(year+"년"+month+"월");
		
		int thisMonth = 7;
		int nextMonth =8;
		
		thisMonth=nextMonth;
		System.out.println(thisMonth);
		
		int a,b;  //같은 형태의 데이터를 담는 변수끼리는 한줄 선언 가능 
		
		}
}
