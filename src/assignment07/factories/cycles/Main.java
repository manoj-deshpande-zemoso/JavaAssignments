package assignment07.factories.cycles;

public class Main {

	public static void main(String[] args) {
		
		AbstractCycleFactory unicycleFactory = FactoryProducer.getCycleFactory("Unicycle");
		AbstractCycleFactory bicycleFactory = FactoryProducer.getCycleFactory("Bicycle");
		AbstractCycleFactory tricycleFactory = FactoryProducer.getCycleFactory("Tricycle");
		
		unicycleFactory.getCycle().balance();
		bicycleFactory.getCycle().balance();
		tricycleFactory.getCycle().balance();
		
	}

}
