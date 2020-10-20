package assignment10;

import assignment10.list.SList;
import assignment10.list.SListIterator;

public class Main {

	public static void main(String[] args) {
		
		SList<Integer> list = new SList<Integer>();
		SListIterator<Integer> iterator = list.iterator();
		iterator.add(1);
		iterator.add(2);
		iterator.add(3);
		iterator.add(4);
		iterator.add(5);
		System.out.println(list.toString());
		iterator.add(6);
		iterator.add(7);
		iterator.add(8);
		iterator.remove(5);
		System.out.println(list.toString());

	}

}
