package assignment07.factories.cycles;

public class TricycleFactory extends AbstractCycleFactory{
	
	public TricycleFactory() {
		
	}

	@Override
	Cycle getCycle() {
		return new Tricycle();
	}

}
