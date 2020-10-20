package assignment07.factories.cycles;

public class UnicycleFactory extends AbstractCycleFactory{

	@Override
	Cycle getCycle() {
		return new Unicycle();
	}

}
