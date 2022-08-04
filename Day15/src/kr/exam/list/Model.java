package kr.exam.list;

public class Model implements Comparable<Model> {

	private String myName;
	private int height;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int compareTo(Model o) {
		if (o.getHeight() > this.getHeight()) {
			return 1;
		}else {
			return -1;
		}	
	}

}
