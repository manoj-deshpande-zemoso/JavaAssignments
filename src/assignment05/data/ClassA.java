package assignment05.data;

public class ClassA {
	int a;
	char c;
	
	void printMember() {
		// This is allowed
		System.out.println(a + "   " + c);
	}
	
	void printLocal() {
		int b;
		char d;
		/*
		 * This is not allowed 
		 * System.out.println(b + "  " + d);
		 * 
		 * Local variables must be initialized before being accessed. Instance variables
		 * need not be initialized. It is a "GOOD THING" to initialize a variable before
		 * accessing it. So the compiler enforces the dev to initialize a local variable
		 * before accessing it. Where as instance variables may be initialized during
		 * runtime so compiler does not give error. In case of instance variables, if
		 * not initialized they take default values for their type.
		 */
	}
}
