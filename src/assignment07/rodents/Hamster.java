package assignment07.rodents;

public class Hamster extends Rodent {
	
	public Hamster() {
		System.out.println("I am a Hamster");
	}

	@Override
	public void doSomething() {
		System.out.println("Hamster: I do nothing. I am just cute");
	}

}
