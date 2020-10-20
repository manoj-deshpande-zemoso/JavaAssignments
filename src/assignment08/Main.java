package assignment08;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		try {
			int a = (int)new Random().nextLong();
			System.out.println("Value of a  is : " + a);
			if(a%2==0) throw new EvenNumberException("EvenNumberException: Divisible by 2");
			else if (a%3==0) throw new DivisibleByThreeException("DivisibleByThreeException: Divisible by 3");
			else throw new SomeException("Throwing some exception");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
