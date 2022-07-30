package kr.exam.str;

public class Startcraft {

	public static GroundUnit[] dropship = new GroundUnit[3];
	public static int count = 0;

	public static void barrack(String type) {
		GroundUnit unit = null;
		if (type.equals("마린")) {
			unit = new Marine("마린", 0, 0, "기관총");
		} else {
			unit = new FireBat("파이어뱃", 0, 0, "화염방사기");
		}
		dropship[count++] = unit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Startcraft.barrack("마린");
		Startcraft.barrack("파이어 뱃");
		
		// 생성된 개체 카운트 까지만 루프를 돌린다
		for (int i = 0; i < Startcraft.count; i++) {
			GroundUnit g = Startcraft.dropship[i];

			if (g instanceof Marine) {
				System.out.println("마린 하차");
				((Marine)g).attack("질럿");
			} else {
				System.out.println("파이어뱃 하차");
				((FireBat)g).attack("저글링 ");
			}
		}
	}

}
