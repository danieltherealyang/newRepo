package newRepo.src.tri1f;

import java.util.LinkedList;

public class FibonnaciModel {
	LinkedList<Integer> list = new LinkedList<Integer>();
	private int elements;
	public void setElements(int Elements) {
		elements = Elements;
	}
	
	public LinkedList<Integer> getFibbonaci() {
		for (int i = 0; i < elements; i++) {
			if (i == 0 || i == 1) {
			list.add(1);
			}
	
			if (i > 1) {
				int nextElement = list.get(i - 2) * list.get(i - 1);
				list.addLast(nextElement);
			}
		}
		return list;
	}
}
