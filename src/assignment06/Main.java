package assignment06;

import assignments.common.CommonFunctions;

public class Main implements CommonFunctions{

	public static void main(String[] args) {
		
		Main main = new Main();
		main.runPrograms();

	}
	
	private void runPrograms() {
		 new VampireNumber().printHundredVampireNumbers();
		
		breaker();
		
		// Whereas we can invoke any Constructor from outside the class
		System.out.println(new DoubleConstructor().name);
		System.out.println(new DoubleConstructor("Shaktimaan").name);
		
		breaker();
		
		// It will not print because we did not call the constructor
		System.out.println("Checking if constructor initialization prints");
		SomeClass[] arr = new SomeClass[2];
		
		breaker();
		// On creation of objects by invoking constructor, the params will be printed
		arr[0] = new SomeClass("John");
		arr[1] = new SomeClass("Cena");
		// Now we can see John Cena
		
	}

}
