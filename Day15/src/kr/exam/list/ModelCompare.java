package kr.exam.list;

import java.util.Comparator;

public class ModelCompare implements Comparator<Model> {

	@Override
	public int compare(Model m1, Model m2) {

		if (m1.getHeight() < m2.getHeight()) {
			return 1;
		} else {
			return -1;
		}
	}
}
