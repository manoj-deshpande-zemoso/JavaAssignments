package assignment07.rodents;

public class Rat extends Rodent {
	
	public Rat() {
		System.out.println("I am a Rat");
	}

	@Override
	public void doSomething() {
		System.out.println("Rat: I spread diseases");
	}

}
