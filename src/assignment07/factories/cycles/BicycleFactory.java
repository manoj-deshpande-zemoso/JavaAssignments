package assignment07.factories.cycles;

public class BicycleFactory extends AbstractCycleFactory{

	@Override
	Cycle getCycle() {
		return new Bicycle();
	}
	
	

}
