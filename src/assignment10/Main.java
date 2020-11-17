package assignment10;

import assignment10.list.SList;
import assignment10.list.SListIterator;
import assignments.common.CommonFunctions;

import java.util.Scanner;

public class Main implements CommonFunctions {
	SList theList;
	SListIterator theIterator;

	public static void main(String[] args) {
		Main main = new Main();
		main.operateOnList();
	}

	private void initializeList(){
		 theList = new SList();
		 theIterator = theList.iterator();
	}

	private void operateOnList(){
		initializeList();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("What operation do you want to do?");
			System.out.println("1. Insert");
			System.out.println("2. Remove");
			System.out.println("3. Remove all elements");
			System.out.println("4. Print List");
			System.out.println("5. Stop program");

			int operation = sc.nextInt();

			switch (operation){
				case 3: initializeList(); continue;
				case 4: printList(); breaker(); continue;
				case 5: return;
			}
			sc.nextLine();
			System.out.println("Enter element: ");
			String item = sc.nextLine();
			switch (operation){
				case 1: insertItem(item); break;
				case 2: removeItem(item); break;
			}
			breaker();
		}
	}

	private void insertItem(String item){
		theIterator.add(item);
	}

	private void removeItem(String item){
		theIterator.remove(item);
	}

	private void printList(){
		System.out.println(theList);
	}

}
