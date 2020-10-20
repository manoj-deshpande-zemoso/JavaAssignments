package assignment07.innerclasses;

public class Main {

	public static void main(String[] args) {
		
		new OuterClass().new FirstInnerClass("someName").new SecondInnerClass().print();
		
	}

}
