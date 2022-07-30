package kr.exam.abs;

public class Picachu extends PokectMon{

	public Picachu(String myName) {
		this.setMyName(myName);
	}
	@Override
	public void attack(String target) {
		// TODO Auto-generated method stub
        System.out.println(this.getMyName()+"이(가) "+target+" 에게 백만볼트 공격!!!");
	}
}