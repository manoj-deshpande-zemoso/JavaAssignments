package assignment07.rodents;

public class GuineaPig extends Rodent{
	
	public GuineaPig() {
		System.out.println("I am a Guinea Pig");
	}

	@Override
	public void doSomething() {
		System.out.println("GuineaPig: I generate electricity to light a bulb up");
	}

}
