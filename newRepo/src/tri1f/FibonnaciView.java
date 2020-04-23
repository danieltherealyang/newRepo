package newRepo.src.tri1f;

import java.util.Iterator;
import java.util.LinkedList;

public class FibonnaciView {
	public void printFibonnaci(LinkedList<Integer> list) {
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
