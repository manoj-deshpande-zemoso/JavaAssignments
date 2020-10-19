package assignment05.singleton;

public class ClassB {
	
	String s;
	
	static void staticMethod(String str) {
		
		/* Cannot make static reference to a non static variable
		 * s = str; return this;
		 */
		 
	}
	
	void print() {
		System.out.println(s);
	}

}
