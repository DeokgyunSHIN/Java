package kr.exam.str;

public class FireBat extends GroundUnit{

		public FireBat(String nuitName,int x,int y,String weapone) {
			this.setUnitName(nuitName);
			this.setX(x);
			this.setY(y);
			this.setWeapone(weapone);
		}
	@Override
	public void attack(String target) {
		// TODO Auto-generated method stub
		System.out.println(this.getUnitName()+"이 "+target+"을 "+this.getWeapone()+"으로 공격합니다.");
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(this.getX()+", "+this.getY()+"에서 "+x+","+y+"로 이동");
		this.setX(x);
		this.setY(y);
	}

}
