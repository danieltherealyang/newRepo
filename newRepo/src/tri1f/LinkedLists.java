package newRepo.src.tri1f;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedLists {

	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("How many Fibonacci elements?");
		int elements= scanObj.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for (int i = 0; i < elements; i++) {
			if (i == 0 || i == 1) {
				list.add(1);
			}
			
			if (i > 1) {
				int nextElement = list.get(i - 2) + list.get(i - 1);
				list.addLast(nextElement);
			}
		}
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}