package kr.exam.str;

public abstract class GroundUnit implements Unit {

	private String unitName;
	private int x;
	private int y;
	private String weapone;

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getWeapone() {
		return weapone;
	}

	public void setWeapone(String weapone) {
		this.weapone = weapone;
	}
}
