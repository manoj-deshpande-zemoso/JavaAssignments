package assignment07.factories.cycles;

public class FactoryProducer {
	
	public static AbstractCycleFactory getCycleFactory(String cycleType) {
		switch(cycleType) {
			case "Unicycle": return new UnicycleFactory();
			case "Bicycle": return new BicycleFactory();
			case "Tricycle": return new TricycleFactory();
			default: return null;
		}
	}

}
