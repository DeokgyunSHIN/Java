package kr.exam.abs;

public class SeedMon extends PokectMon{

	public SeedMon(String myName) {
		this.setMyName(myName);
	}
	@Override
	public void attack(String target) {
		// TODO Auto-generated method stub
		System.out.println(this.getMyName()+" 이(가) "+target+" 이게 채찍 공격!");
	}
  
}
