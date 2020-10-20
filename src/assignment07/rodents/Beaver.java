package assignment07.rodents;

public class Beaver extends Rodent {
	
	public Beaver() {
		System.out.println("I am a Beaver");
	}

	@Override
	public void doSomething() {
		System.out.println("Beaver: I build bridges");
	}

}
